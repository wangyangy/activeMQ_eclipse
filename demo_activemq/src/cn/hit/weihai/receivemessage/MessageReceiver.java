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
	//url��ַ
	public static String url = "tcp://localhost:61616";
	//Ŀ��
	public static final String destination = "sagedragon.mq.queue";
	
	public static void run() throws JMSException {
		Connection conn = null;
		Session session = null;
		//�������ӹ���
		ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,url);
		//ͨ����������һ������
		try {
			conn = factory.createConnection();
			//��������
			conn.start();
			//����session�Ự
			session = conn.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			//����һ����Ϣ����
			Destination queue = session.createQueue(destination);
			//������Ϣ������
			MessageConsumer consumer = session.createConsumer(queue);
			while(true) {
				//���ý������ݵĵȴ�ʱ��
				Message message = consumer.receive(1000*100);
				TextMessage text = (TextMessage) message;
				if(text!=null) {
					System.out.println("���ܵ������ݣ�"+text.getText());
				}else{
					break;
				}
			}
			//�ύ�Ự
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
