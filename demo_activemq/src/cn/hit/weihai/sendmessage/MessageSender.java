package cn.hit.weihai.sendmessage;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageSender {
	
	//消息发送次数
	public static int sendTimes = 19;
	//tcp连接地址
	public static String url = "tcp://localhost:61616";
	//发送目标
	public static String destination = "sagedragon.mq.queue";
	
	public static void sendMessage(Session session,MessageProducer producer) throws JMSException {
		
		for(int i=0;i<sendTimes;i++) {
			String message = "发送消息第"+(i+1)+"次";
			TextMessage textMessage = session.createTextMessage(message);
			System.out.println(message);
			producer.send(textMessage);
		}
	}
	
	public static void run() throws JMSException {
		Connection conn = null;
		Session session = null;
		try {
			//创建连接工厂
			ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,url);
			//通过工厂创建一个连接
			conn = factory.createConnection();
			//启动连接
			conn.start();
			//创建session会话
			session = conn.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			//创建一个消息队列
			Destination queue = session.createQueue(destination);
			//创建消息制作者
			MessageProducer producer = session.createProducer(queue);
			//设置持久化模式
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			sendMessage(session, producer);
			//提交会话
			session.commit();
			
		} catch (Exception e) {
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
		MessageSender.run();
	}
	
}
