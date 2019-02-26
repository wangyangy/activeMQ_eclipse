package cn.hit.weihai.receivemessage;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageReceiver {
	//url地址
	public static String url = "tcp://localhost:61616";
	//目标
	public static final String destination = "sagedragon.mq.queue";
	
	public static void run() throws JMSException {
		Connection conn = null;
		Session session = null;
		//创建连接工厂
		ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,url);
		//通过工厂创建一个连接
		try {
			conn = factory.createConnection();
			//启动连接
			conn.start();
			//创建session会话
			session = conn.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			//创建一个消息队列
			Destination queue = session.createQueue(destination);
			//创建消息接受者
			MessageConsumer consumer = session.createConsumer(queue);
			while(true) {
				//设置接受数据的等待时间
				Message message = consumer.receive(1000*100);
				TextMessage text = (TextMessage) message;
				if(text!=null) {
					System.out.println("接受到的数据："+text.getText());
				}else{
					break;
				}
			}
			//提交会话
			session.commit();
		} catch (JMSException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}
	}
	
	public static void main(String[] args) throws JMSException {
		MessageReceiver.run();
	}
}
