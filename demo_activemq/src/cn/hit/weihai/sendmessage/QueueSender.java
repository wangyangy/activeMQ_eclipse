package cn.hit.weihai.sendmessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.DeliveryMode;
import javax.jms.MapMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;

/**
 * @author Dragon
 * @version V0.1
 * @Title: com.dragon.activemq.demo.QueueSender
 * @project ActiveMQ-5.15.0
 * @Description: Queue���з�ʽ���͵�Ե���Ϣ���� - ��Ϣ������
 * @date 2017/10/01 21:16
 */
public class QueueSender {

	// ���ʹ���
	public static final int SEND_NUM = 5;
	// tcp ��ַ
	public static final String BROKER_URL = "tcp://localhost:61616";
	// Ŀ�꣬��ActiveMQ����Ա����̨���� http://localhost:8161/admin/queues.jsp
	public static final String DESTINATION = "sagedragon.mq.queue";

	/**
	 * <b>function:</b> ������Ϣ
	 *
	 * @param session
	 * @param sender
	 * @throws Exception
	 */
	public static void sendMessage(QueueSession session, javax.jms.QueueSender sender) throws Exception {
		for (int i = 0; i < SEND_NUM; i++) {
			String message = "������Ϣ��" + (i + 1) + "��";

			MapMessage map = session.createMapMessage();
			map.setString("text", message);
			map.setLong("time", System.currentTimeMillis());
			System.out.println(map);

			sender.send(map);
		}
	}

	public static void run() throws Exception {

		QueueConnection connection = null;
		QueueSession session = null;
		try {
			// �������ӹ���
			QueueConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, BROKER_URL);
			// ͨ����������һ������
			connection = factory.createQueueConnection();
			// ��������
			connection.start();
			// ����һ��session�Ự
			session = connection.createQueueSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			// ����һ����Ϣ����
			Queue queue = session.createQueue(DESTINATION);
			// ������Ϣ������
			javax.jms.QueueSender sender = session.createSender(queue);
			// ���ó־û�ģʽ
			sender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			sendMessage(session, sender);
			// �ύ�Ự
			session.commit();

		} catch (Exception e) {
			throw e;
		} finally {
			// �ر��ͷ���Դ
			if (session != null) {
				session.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		QueueSender.run();
	}
}