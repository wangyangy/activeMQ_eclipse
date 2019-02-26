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
	
	//��Ϣ���ʹ���
	public static int sendTimes = 19;
	//tcp���ӵ�ַ
	public static String url = "tcp://localhost:61616";
	//����Ŀ��
	public static String destination = "sagedragon.mq.queue";
	
	public static void sendMessage(Session session,MessageProducer producer) throws JMSException {
		
		for(int i=0;i<sendTimes;i++) {
			String message = "������Ϣ��"+(i+1)+"��";
			TextMessage textMessage = session.createTextMessage(message);
			System.out.println(message);
			producer.send(textMessage);
		}
	}
	
	public static void run() throws JMSException {
		Connection conn = null;
		Session session = null;
		try {
			//�������ӹ���
			ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,url);
			//ͨ����������һ������
			conn = factory.createConnection();
			//��������
			conn.start();
			//����session�Ự
			session = conn.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			//����һ����Ϣ����
			Destination queue = session.createQueue(destination);
			//������Ϣ������
			MessageProducer producer = session.createProducer(queue);
			//���ó־û�ģʽ
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			sendMessage(session, producer);
			//�ύ�Ự
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