//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.10-b140310.1920 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.02.26 ʱ�� 09:59:41 AM CST 
//


package org.apache.activemq.schema.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="adminView" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="brokerContext" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="consumerSystemUsage" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="destinationFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="destinationInterceptors" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mirroredQueue"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}virtualDestinationInterceptor"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="destinationPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="destinations" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempQueue"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempTopic"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="ioExceptionHandler" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}defaultIOExceptionHandler"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jDBCIOExceptionHandler"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}leaseLockerIOExceptionHandler"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="jmsBridgeConnectors" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsQueueConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsTopicConnector"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="jobSchedulerStore" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="managementContext" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}managementContext"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="messageAuthorizationPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="networkConnectorURIs" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="networkConnectors" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}ldapNetworkConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}multicastNetworkConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}networkConnector"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="persistenceAdapter" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}memoryPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="persistenceFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="persistenceTaskRunnerFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="plugins" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}authorizationPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}camelRoutesBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}connectionDotFilePlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationDotFilePlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}discardingDLQBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jaasAuthenticationPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jaasCertificateAuthenticationPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jaasDualAuthenticationPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}partitionBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}runtimeConfigurationPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}simpleAuthenticationPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}statisticsBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}virtualSelectorCacheBrokerPlugin"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="producerSystemUsage" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="proxyConnectors" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="regionBroker" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBroker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="services" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}forwardingBridge"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}inboundQueueBridge"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}inboundTopicBridge"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsQueueConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsTopicConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jobSchedulerUsage"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}ldapNetworkConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}managementContext"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}memoryUsage"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}multicastNetworkConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}networkConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}outboundQueueBridge"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}outboundTopicBridge"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}pListStoreImpl"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}proxyConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}storeUsage"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempUsage"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="shutdownHooks" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="sslContext" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}sslContext"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="startException" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="systemUsage" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="taskRunnerFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="tempDataStore" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}pListStoreImpl"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="transportConnectorURIs" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                     &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="transportConnectors" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}transportConnector"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="adjustUsageLimits" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adminView" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="advisorySupport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowTempAutoCreationOnSend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="brokerContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerObjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cacheTempDestinations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="consumerSystemUsage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerSystemUsagePortion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dataDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataDirectoryFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dedicatedTaskRunner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="deleteAllMessagesOnStartup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destinationFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destinationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diskUsageCheckRegrowThreshold" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enableStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ioExceptionHandler" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobSchedulerStore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keepDurableSubsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="managementContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxPurgedDestinationsPerSweep" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="mbeanInvocationTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="messageAuthorizationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="monitorConnectionSplits" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="networkConnectorStartAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="offlineDurableSubscriberTaskSchedule" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="offlineDurableSubscriberTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="passiveSlave" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="persistenceAdapter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="persistenceFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="persistenceTaskRunnerFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="persistenceThreadPriority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="persistent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="populateJMSXUserID" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="populateUserNameInMBeans" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="producerSystemUsage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="producerSystemUsagePortion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="regionBroker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectDurableConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="restartAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rollbackOnlyOnAsyncException" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="schedulePeriodForDestinationPurge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="schedulePeriodForDiskUsageCheck" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="schedulerDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schedulerDirectoryFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schedulerSupport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shutdownOnMasterFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shutdownOnSlaveFailure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="splitSystemUsageForProducersConsumers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="sslContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="startAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="startException" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="storeOpenWireVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="systemExitOnShutdown" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="systemExitOnShutdownExitCode" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="systemUsage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskRunnerFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskRunnerPriority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="tempDataStore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeBeforePurgeTempDestinations" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="tmpDataDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useAuthenticatedPrincipalForJMSXUserID" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useJmx" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useLocalHostBrokerName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useLoggingForShutdownErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useMirroredQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useShutdownHook" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useTempMirroredQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useVirtualDestSubs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useVirtualDestSubsOnCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useVirtualTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="vmConnectorURI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waitForSlave" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="waitForSlaveTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contents"
})
@XmlRootElement(name = "broker")
public class DtoBroker implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "persistenceTaskRunnerFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "systemUsage", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "adminView", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brokerContext", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "destinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "messageAuthorizationPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sslContext", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "startException", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "destinationFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transportConnectorURIs", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "managementContext", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskRunnerFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ioExceptionHandler", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shutdownHooks", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "services", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "destinationInterceptors", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "persistenceAdapter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consumerSystemUsage", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jmsBridgeConnectors", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "networkConnectorURIs", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "networkConnectors", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transportConnectors", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "producerSystemUsage", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "plugins", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "regionBroker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jobSchedulerStore", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "destinationPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tempDataStore", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "persistenceFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "proxyConnectors", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> contents;
    @XmlAttribute(name = "adjustUsageLimits")
    protected Boolean adjustUsageLimits;
    @XmlAttribute(name = "adminView")
    protected String adminView;
    @XmlAttribute(name = "advisorySupport")
    protected String advisorySupport;
    @XmlAttribute(name = "allowTempAutoCreationOnSend")
    protected Boolean allowTempAutoCreationOnSend;
    @XmlAttribute(name = "brokerContext")
    protected String brokerContext;
    @XmlAttribute(name = "brokerId")
    protected String brokerId;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerObjectName")
    protected String brokerObjectName;
    @XmlAttribute(name = "cacheTempDestinations")
    protected Boolean cacheTempDestinations;
    @XmlAttribute(name = "consumerSystemUsage")
    protected String consumerSystemUsage;
    @XmlAttribute(name = "consumerSystemUsagePortion")
    protected BigInteger consumerSystemUsagePortion;
    @XmlAttribute(name = "dataDirectory")
    protected String dataDirectory;
    @XmlAttribute(name = "dataDirectoryFile")
    protected String dataDirectoryFile;
    @XmlAttribute(name = "dedicatedTaskRunner")
    protected Boolean dedicatedTaskRunner;
    @XmlAttribute(name = "deleteAllMessagesOnStartup")
    protected String deleteAllMessagesOnStartup;
    @XmlAttribute(name = "destinationFactory")
    protected String destinationFactory;
    @XmlAttribute(name = "destinationPolicy")
    protected String destinationPolicy;
    @XmlAttribute(name = "diskUsageCheckRegrowThreshold")
    protected String diskUsageCheckRegrowThreshold;
    @XmlAttribute(name = "enableStatistics")
    protected Boolean enableStatistics;
    @XmlAttribute(name = "ioExceptionHandler")
    protected String ioExceptionHandler;
    @XmlAttribute(name = "jobSchedulerStore")
    protected String jobSchedulerStore;
    @XmlAttribute(name = "keepDurableSubsActive")
    protected Boolean keepDurableSubsActive;
    @XmlAttribute(name = "managementContext")
    protected String managementContext;
    @XmlAttribute(name = "maxPurgedDestinationsPerSweep")
    protected BigInteger maxPurgedDestinationsPerSweep;
    @XmlAttribute(name = "mbeanInvocationTimeout")
    protected Long mbeanInvocationTimeout;
    @XmlAttribute(name = "messageAuthorizationPolicy")
    protected String messageAuthorizationPolicy;
    @XmlAttribute(name = "monitorConnectionSplits")
    protected Boolean monitorConnectionSplits;
    @XmlAttribute(name = "networkConnectorStartAsync")
    protected Boolean networkConnectorStartAsync;
    @XmlAttribute(name = "offlineDurableSubscriberTaskSchedule")
    protected Long offlineDurableSubscriberTaskSchedule;
    @XmlAttribute(name = "offlineDurableSubscriberTimeout")
    protected Long offlineDurableSubscriberTimeout;
    @XmlAttribute(name = "passiveSlave")
    protected String passiveSlave;
    @XmlAttribute(name = "persistenceAdapter")
    protected String persistenceAdapter;
    @XmlAttribute(name = "persistenceFactory")
    protected String persistenceFactory;
    @XmlAttribute(name = "persistenceTaskRunnerFactory")
    protected String persistenceTaskRunnerFactory;
    @XmlAttribute(name = "persistenceThreadPriority")
    protected BigInteger persistenceThreadPriority;
    @XmlAttribute(name = "persistent")
    protected String persistent;
    @XmlAttribute(name = "populateJMSXUserID")
    protected Boolean populateJMSXUserID;
    @XmlAttribute(name = "populateUserNameInMBeans")
    protected Boolean populateUserNameInMBeans;
    @XmlAttribute(name = "producerSystemUsage")
    protected String producerSystemUsage;
    @XmlAttribute(name = "producerSystemUsagePortion")
    protected BigInteger producerSystemUsagePortion;
    @XmlAttribute(name = "regionBroker")
    protected String regionBroker;
    @XmlAttribute(name = "rejectDurableConsumers")
    protected Boolean rejectDurableConsumers;
    @XmlAttribute(name = "restartAllowed")
    protected Boolean restartAllowed;
    @XmlAttribute(name = "rollbackOnlyOnAsyncException")
    protected Boolean rollbackOnlyOnAsyncException;
    @XmlAttribute(name = "schedulePeriodForDestinationPurge")
    protected BigInteger schedulePeriodForDestinationPurge;
    @XmlAttribute(name = "schedulePeriodForDiskUsageCheck")
    protected BigInteger schedulePeriodForDiskUsageCheck;
    @XmlAttribute(name = "schedulerDirectory")
    protected String schedulerDirectory;
    @XmlAttribute(name = "schedulerDirectoryFile")
    protected String schedulerDirectoryFile;
    @XmlAttribute(name = "schedulerSupport")
    protected String schedulerSupport;
    @XmlAttribute(name = "shutdownOnMasterFailure")
    protected Boolean shutdownOnMasterFailure;
    @XmlAttribute(name = "shutdownOnSlaveFailure")
    protected String shutdownOnSlaveFailure;
    @XmlAttribute(name = "splitSystemUsageForProducersConsumers")
    protected Boolean splitSystemUsageForProducersConsumers;
    @XmlAttribute(name = "sslContext")
    protected String sslContext;
    @XmlAttribute(name = "start")
    protected Boolean start;
    @XmlAttribute(name = "startAsync")
    protected Boolean startAsync;
    @XmlAttribute(name = "startException")
    protected String startException;
    @XmlAttribute(name = "storeOpenWireVersion")
    protected BigInteger storeOpenWireVersion;
    @XmlAttribute(name = "systemExitOnShutdown")
    protected String systemExitOnShutdown;
    @XmlAttribute(name = "systemExitOnShutdownExitCode")
    protected BigInteger systemExitOnShutdownExitCode;
    @XmlAttribute(name = "systemUsage")
    protected String systemUsage;
    @XmlAttribute(name = "taskRunnerFactory")
    protected String taskRunnerFactory;
    @XmlAttribute(name = "taskRunnerPriority")
    protected BigInteger taskRunnerPriority;
    @XmlAttribute(name = "tempDataStore")
    protected String tempDataStore;
    @XmlAttribute(name = "timeBeforePurgeTempDestinations")
    protected BigInteger timeBeforePurgeTempDestinations;
    @XmlAttribute(name = "tmpDataDirectory")
    protected String tmpDataDirectory;
    @XmlAttribute(name = "useAuthenticatedPrincipalForJMSXUserID")
    protected Boolean useAuthenticatedPrincipalForJMSXUserID;
    @XmlAttribute(name = "useJmx")
    protected String useJmx;
    @XmlAttribute(name = "useLocalHostBrokerName")
    protected Boolean useLocalHostBrokerName;
    @XmlAttribute(name = "useLoggingForShutdownErrors")
    protected Boolean useLoggingForShutdownErrors;
    @XmlAttribute(name = "useMirroredQueues")
    protected Boolean useMirroredQueues;
    @XmlAttribute(name = "useShutdownHook")
    protected Boolean useShutdownHook;
    @XmlAttribute(name = "useTempMirroredQueues")
    protected Boolean useTempMirroredQueues;
    @XmlAttribute(name = "useVirtualDestSubs")
    protected Boolean useVirtualDestSubs;
    @XmlAttribute(name = "useVirtualDestSubsOnCreation")
    protected Boolean useVirtualDestSubsOnCreation;
    @XmlAttribute(name = "useVirtualTopics")
    protected Boolean useVirtualTopics;
    @XmlAttribute(name = "vmConnectorURI")
    protected String vmConnectorURI;
    @XmlAttribute(name = "waitForSlave")
    protected String waitForSlave;
    @XmlAttribute(name = "waitForSlaveTimeout")
    protected Long waitForSlaveTimeout;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the contents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoBroker.PersistenceTaskRunnerFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.SystemUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.AdminView }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.BrokerContext }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.Destinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.MessageAuthorizationPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.SslContext }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.StartException }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.DestinationFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.TransportConnectorURIs }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoBroker.ManagementContext }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.TaskRunnerFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.IoExceptionHandler }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.ShutdownHooks }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.Services }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.DestinationInterceptors }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.PersistenceAdapter }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.ConsumerSystemUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.JmsBridgeConnectors }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.NetworkConnectorURIs }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.NetworkConnectors }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.TransportConnectors }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.ProducerSystemUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.Plugins }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.RegionBroker }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.JobSchedulerStore }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.DestinationPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.TempDataStore }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.PersistenceFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoBroker.ProxyConnectors }{@code >}
     * 
     * 
     */
    public List<Object> getContents() {
        if (contents == null) {
            contents = new ArrayList<Object>();
        }
        return this.contents;
    }

    /**
     * ��ȡadjustUsageLimits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustUsageLimits() {
        return adjustUsageLimits;
    }

    /**
     * ����adjustUsageLimits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustUsageLimits(Boolean value) {
        this.adjustUsageLimits = value;
    }

    /**
     * ��ȡadminView���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminView() {
        return adminView;
    }

    /**
     * ����adminView���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminView(String value) {
        this.adminView = value;
    }

    /**
     * ��ȡadvisorySupport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisorySupport() {
        return advisorySupport;
    }

    /**
     * ����advisorySupport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisorySupport(String value) {
        this.advisorySupport = value;
    }

    /**
     * ��ȡallowTempAutoCreationOnSend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowTempAutoCreationOnSend() {
        return allowTempAutoCreationOnSend;
    }

    /**
     * ����allowTempAutoCreationOnSend���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTempAutoCreationOnSend(Boolean value) {
        this.allowTempAutoCreationOnSend = value;
    }

    /**
     * ��ȡbrokerContext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerContext() {
        return brokerContext;
    }

    /**
     * ����brokerContext���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerContext(String value) {
        this.brokerContext = value;
    }

    /**
     * ��ȡbrokerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerId() {
        return brokerId;
    }

    /**
     * ����brokerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerId(String value) {
        this.brokerId = value;
    }

    /**
     * ��ȡbrokerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerName() {
        return brokerName;
    }

    /**
     * ����brokerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerName(String value) {
        this.brokerName = value;
    }

    /**
     * ��ȡbrokerObjectName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerObjectName() {
        return brokerObjectName;
    }

    /**
     * ����brokerObjectName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerObjectName(String value) {
        this.brokerObjectName = value;
    }

    /**
     * ��ȡcacheTempDestinations���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCacheTempDestinations() {
        return cacheTempDestinations;
    }

    /**
     * ����cacheTempDestinations���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCacheTempDestinations(Boolean value) {
        this.cacheTempDestinations = value;
    }

    /**
     * ��ȡconsumerSystemUsage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSystemUsage() {
        return consumerSystemUsage;
    }

    /**
     * ����consumerSystemUsage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSystemUsage(String value) {
        this.consumerSystemUsage = value;
    }

    /**
     * ��ȡconsumerSystemUsagePortion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumerSystemUsagePortion() {
        return consumerSystemUsagePortion;
    }

    /**
     * ����consumerSystemUsagePortion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumerSystemUsagePortion(BigInteger value) {
        this.consumerSystemUsagePortion = value;
    }

    /**
     * ��ȡdataDirectory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDirectory() {
        return dataDirectory;
    }

    /**
     * ����dataDirectory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDirectory(String value) {
        this.dataDirectory = value;
    }

    /**
     * ��ȡdataDirectoryFile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDirectoryFile() {
        return dataDirectoryFile;
    }

    /**
     * ����dataDirectoryFile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDirectoryFile(String value) {
        this.dataDirectoryFile = value;
    }

    /**
     * ��ȡdedicatedTaskRunner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDedicatedTaskRunner() {
        return dedicatedTaskRunner;
    }

    /**
     * ����dedicatedTaskRunner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDedicatedTaskRunner(Boolean value) {
        this.dedicatedTaskRunner = value;
    }

    /**
     * ��ȡdeleteAllMessagesOnStartup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteAllMessagesOnStartup() {
        return deleteAllMessagesOnStartup;
    }

    /**
     * ����deleteAllMessagesOnStartup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteAllMessagesOnStartup(String value) {
        this.deleteAllMessagesOnStartup = value;
    }

    /**
     * ��ȡdestinationFactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationFactory() {
        return destinationFactory;
    }

    /**
     * ����destinationFactory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationFactory(String value) {
        this.destinationFactory = value;
    }

    /**
     * ��ȡdestinationPolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPolicy() {
        return destinationPolicy;
    }

    /**
     * ����destinationPolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPolicy(String value) {
        this.destinationPolicy = value;
    }

    /**
     * ��ȡdiskUsageCheckRegrowThreshold���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskUsageCheckRegrowThreshold() {
        return diskUsageCheckRegrowThreshold;
    }

    /**
     * ����diskUsageCheckRegrowThreshold���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskUsageCheckRegrowThreshold(String value) {
        this.diskUsageCheckRegrowThreshold = value;
    }

    /**
     * ��ȡenableStatistics���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableStatistics() {
        return enableStatistics;
    }

    /**
     * ����enableStatistics���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableStatistics(Boolean value) {
        this.enableStatistics = value;
    }

    /**
     * ��ȡioExceptionHandler���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIoExceptionHandler() {
        return ioExceptionHandler;
    }

    /**
     * ����ioExceptionHandler���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIoExceptionHandler(String value) {
        this.ioExceptionHandler = value;
    }

    /**
     * ��ȡjobSchedulerStore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobSchedulerStore() {
        return jobSchedulerStore;
    }

    /**
     * ����jobSchedulerStore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobSchedulerStore(String value) {
        this.jobSchedulerStore = value;
    }

    /**
     * ��ȡkeepDurableSubsActive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepDurableSubsActive() {
        return keepDurableSubsActive;
    }

    /**
     * ����keepDurableSubsActive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepDurableSubsActive(Boolean value) {
        this.keepDurableSubsActive = value;
    }

    /**
     * ��ȡmanagementContext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementContext() {
        return managementContext;
    }

    /**
     * ����managementContext���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementContext(String value) {
        this.managementContext = value;
    }

    /**
     * ��ȡmaxPurgedDestinationsPerSweep���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPurgedDestinationsPerSweep() {
        return maxPurgedDestinationsPerSweep;
    }

    /**
     * ����maxPurgedDestinationsPerSweep���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPurgedDestinationsPerSweep(BigInteger value) {
        this.maxPurgedDestinationsPerSweep = value;
    }

    /**
     * ��ȡmbeanInvocationTimeout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMbeanInvocationTimeout() {
        return mbeanInvocationTimeout;
    }

    /**
     * ����mbeanInvocationTimeout���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMbeanInvocationTimeout(Long value) {
        this.mbeanInvocationTimeout = value;
    }

    /**
     * ��ȡmessageAuthorizationPolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageAuthorizationPolicy() {
        return messageAuthorizationPolicy;
    }

    /**
     * ����messageAuthorizationPolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageAuthorizationPolicy(String value) {
        this.messageAuthorizationPolicy = value;
    }

    /**
     * ��ȡmonitorConnectionSplits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitorConnectionSplits() {
        return monitorConnectionSplits;
    }

    /**
     * ����monitorConnectionSplits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitorConnectionSplits(Boolean value) {
        this.monitorConnectionSplits = value;
    }

    /**
     * ��ȡnetworkConnectorStartAsync���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkConnectorStartAsync() {
        return networkConnectorStartAsync;
    }

    /**
     * ����networkConnectorStartAsync���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkConnectorStartAsync(Boolean value) {
        this.networkConnectorStartAsync = value;
    }

    /**
     * ��ȡofflineDurableSubscriberTaskSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfflineDurableSubscriberTaskSchedule() {
        return offlineDurableSubscriberTaskSchedule;
    }

    /**
     * ����offlineDurableSubscriberTaskSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfflineDurableSubscriberTaskSchedule(Long value) {
        this.offlineDurableSubscriberTaskSchedule = value;
    }

    /**
     * ��ȡofflineDurableSubscriberTimeout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfflineDurableSubscriberTimeout() {
        return offlineDurableSubscriberTimeout;
    }

    /**
     * ����offlineDurableSubscriberTimeout���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfflineDurableSubscriberTimeout(Long value) {
        this.offlineDurableSubscriberTimeout = value;
    }

    /**
     * ��ȡpassiveSlave���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveSlave() {
        return passiveSlave;
    }

    /**
     * ����passiveSlave���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveSlave(String value) {
        this.passiveSlave = value;
    }

    /**
     * ��ȡpersistenceAdapter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistenceAdapter() {
        return persistenceAdapter;
    }

    /**
     * ����persistenceAdapter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistenceAdapter(String value) {
        this.persistenceAdapter = value;
    }

    /**
     * ��ȡpersistenceFactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistenceFactory() {
        return persistenceFactory;
    }

    /**
     * ����persistenceFactory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistenceFactory(String value) {
        this.persistenceFactory = value;
    }

    /**
     * ��ȡpersistenceTaskRunnerFactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistenceTaskRunnerFactory() {
        return persistenceTaskRunnerFactory;
    }

    /**
     * ����persistenceTaskRunnerFactory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistenceTaskRunnerFactory(String value) {
        this.persistenceTaskRunnerFactory = value;
    }

    /**
     * ��ȡpersistenceThreadPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersistenceThreadPriority() {
        return persistenceThreadPriority;
    }

    /**
     * ����persistenceThreadPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersistenceThreadPriority(BigInteger value) {
        this.persistenceThreadPriority = value;
    }

    /**
     * ��ȡpersistent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistent() {
        return persistent;
    }

    /**
     * ����persistent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistent(String value) {
        this.persistent = value;
    }

    /**
     * ��ȡpopulateJMSXUserID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPopulateJMSXUserID() {
        return populateJMSXUserID;
    }

    /**
     * ����populateJMSXUserID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPopulateJMSXUserID(Boolean value) {
        this.populateJMSXUserID = value;
    }

    /**
     * ��ȡpopulateUserNameInMBeans���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPopulateUserNameInMBeans() {
        return populateUserNameInMBeans;
    }

    /**
     * ����populateUserNameInMBeans���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPopulateUserNameInMBeans(Boolean value) {
        this.populateUserNameInMBeans = value;
    }

    /**
     * ��ȡproducerSystemUsage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerSystemUsage() {
        return producerSystemUsage;
    }

    /**
     * ����producerSystemUsage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerSystemUsage(String value) {
        this.producerSystemUsage = value;
    }

    /**
     * ��ȡproducerSystemUsagePortion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProducerSystemUsagePortion() {
        return producerSystemUsagePortion;
    }

    /**
     * ����producerSystemUsagePortion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProducerSystemUsagePortion(BigInteger value) {
        this.producerSystemUsagePortion = value;
    }

    /**
     * ��ȡregionBroker���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionBroker() {
        return regionBroker;
    }

    /**
     * ����regionBroker���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionBroker(String value) {
        this.regionBroker = value;
    }

    /**
     * ��ȡrejectDurableConsumers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectDurableConsumers() {
        return rejectDurableConsumers;
    }

    /**
     * ����rejectDurableConsumers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectDurableConsumers(Boolean value) {
        this.rejectDurableConsumers = value;
    }

    /**
     * ��ȡrestartAllowed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestartAllowed() {
        return restartAllowed;
    }

    /**
     * ����restartAllowed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestartAllowed(Boolean value) {
        this.restartAllowed = value;
    }

    /**
     * ��ȡrollbackOnlyOnAsyncException���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollbackOnlyOnAsyncException() {
        return rollbackOnlyOnAsyncException;
    }

    /**
     * ����rollbackOnlyOnAsyncException���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollbackOnlyOnAsyncException(Boolean value) {
        this.rollbackOnlyOnAsyncException = value;
    }

    /**
     * ��ȡschedulePeriodForDestinationPurge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSchedulePeriodForDestinationPurge() {
        return schedulePeriodForDestinationPurge;
    }

    /**
     * ����schedulePeriodForDestinationPurge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSchedulePeriodForDestinationPurge(BigInteger value) {
        this.schedulePeriodForDestinationPurge = value;
    }

    /**
     * ��ȡschedulePeriodForDiskUsageCheck���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSchedulePeriodForDiskUsageCheck() {
        return schedulePeriodForDiskUsageCheck;
    }

    /**
     * ����schedulePeriodForDiskUsageCheck���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSchedulePeriodForDiskUsageCheck(BigInteger value) {
        this.schedulePeriodForDiskUsageCheck = value;
    }

    /**
     * ��ȡschedulerDirectory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerDirectory() {
        return schedulerDirectory;
    }

    /**
     * ����schedulerDirectory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerDirectory(String value) {
        this.schedulerDirectory = value;
    }

    /**
     * ��ȡschedulerDirectoryFile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerDirectoryFile() {
        return schedulerDirectoryFile;
    }

    /**
     * ����schedulerDirectoryFile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerDirectoryFile(String value) {
        this.schedulerDirectoryFile = value;
    }

    /**
     * ��ȡschedulerSupport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerSupport() {
        return schedulerSupport;
    }

    /**
     * ����schedulerSupport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerSupport(String value) {
        this.schedulerSupport = value;
    }

    /**
     * ��ȡshutdownOnMasterFailure���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShutdownOnMasterFailure() {
        return shutdownOnMasterFailure;
    }

    /**
     * ����shutdownOnMasterFailure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShutdownOnMasterFailure(Boolean value) {
        this.shutdownOnMasterFailure = value;
    }

    /**
     * ��ȡshutdownOnSlaveFailure���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShutdownOnSlaveFailure() {
        return shutdownOnSlaveFailure;
    }

    /**
     * ����shutdownOnSlaveFailure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShutdownOnSlaveFailure(String value) {
        this.shutdownOnSlaveFailure = value;
    }

    /**
     * ��ȡsplitSystemUsageForProducersConsumers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitSystemUsageForProducersConsumers() {
        return splitSystemUsageForProducersConsumers;
    }

    /**
     * ����splitSystemUsageForProducersConsumers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitSystemUsageForProducersConsumers(Boolean value) {
        this.splitSystemUsageForProducersConsumers = value;
    }

    /**
     * ��ȡsslContext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslContext() {
        return sslContext;
    }

    /**
     * ����sslContext���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslContext(String value) {
        this.sslContext = value;
    }

    /**
     * ��ȡstart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStart() {
        return start;
    }

    /**
     * ����start���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStart(Boolean value) {
        this.start = value;
    }

    /**
     * ��ȡstartAsync���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartAsync() {
        return startAsync;
    }

    /**
     * ����startAsync���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartAsync(Boolean value) {
        this.startAsync = value;
    }

    /**
     * ��ȡstartException���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartException() {
        return startException;
    }

    /**
     * ����startException���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartException(String value) {
        this.startException = value;
    }

    /**
     * ��ȡstoreOpenWireVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoreOpenWireVersion() {
        return storeOpenWireVersion;
    }

    /**
     * ����storeOpenWireVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoreOpenWireVersion(BigInteger value) {
        this.storeOpenWireVersion = value;
    }

    /**
     * ��ȡsystemExitOnShutdown���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemExitOnShutdown() {
        return systemExitOnShutdown;
    }

    /**
     * ����systemExitOnShutdown���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemExitOnShutdown(String value) {
        this.systemExitOnShutdown = value;
    }

    /**
     * ��ȡsystemExitOnShutdownExitCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSystemExitOnShutdownExitCode() {
        return systemExitOnShutdownExitCode;
    }

    /**
     * ����systemExitOnShutdownExitCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSystemExitOnShutdownExitCode(BigInteger value) {
        this.systemExitOnShutdownExitCode = value;
    }

    /**
     * ��ȡsystemUsage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUsage() {
        return systemUsage;
    }

    /**
     * ����systemUsage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUsage(String value) {
        this.systemUsage = value;
    }

    /**
     * ��ȡtaskRunnerFactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskRunnerFactory() {
        return taskRunnerFactory;
    }

    /**
     * ����taskRunnerFactory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskRunnerFactory(String value) {
        this.taskRunnerFactory = value;
    }

    /**
     * ��ȡtaskRunnerPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskRunnerPriority() {
        return taskRunnerPriority;
    }

    /**
     * ����taskRunnerPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskRunnerPriority(BigInteger value) {
        this.taskRunnerPriority = value;
    }

    /**
     * ��ȡtempDataStore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempDataStore() {
        return tempDataStore;
    }

    /**
     * ����tempDataStore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempDataStore(String value) {
        this.tempDataStore = value;
    }

    /**
     * ��ȡtimeBeforePurgeTempDestinations���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeBeforePurgeTempDestinations() {
        return timeBeforePurgeTempDestinations;
    }

    /**
     * ����timeBeforePurgeTempDestinations���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeBeforePurgeTempDestinations(BigInteger value) {
        this.timeBeforePurgeTempDestinations = value;
    }

    /**
     * ��ȡtmpDataDirectory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpDataDirectory() {
        return tmpDataDirectory;
    }

    /**
     * ����tmpDataDirectory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpDataDirectory(String value) {
        this.tmpDataDirectory = value;
    }

    /**
     * ��ȡuseAuthenticatedPrincipalForJMSXUserID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAuthenticatedPrincipalForJMSXUserID() {
        return useAuthenticatedPrincipalForJMSXUserID;
    }

    /**
     * ����useAuthenticatedPrincipalForJMSXUserID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAuthenticatedPrincipalForJMSXUserID(Boolean value) {
        this.useAuthenticatedPrincipalForJMSXUserID = value;
    }

    /**
     * ��ȡuseJmx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseJmx() {
        return useJmx;
    }

    /**
     * ����useJmx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseJmx(String value) {
        this.useJmx = value;
    }

    /**
     * ��ȡuseLocalHostBrokerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLocalHostBrokerName() {
        return useLocalHostBrokerName;
    }

    /**
     * ����useLocalHostBrokerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLocalHostBrokerName(Boolean value) {
        this.useLocalHostBrokerName = value;
    }

    /**
     * ��ȡuseLoggingForShutdownErrors���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLoggingForShutdownErrors() {
        return useLoggingForShutdownErrors;
    }

    /**
     * ����useLoggingForShutdownErrors���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLoggingForShutdownErrors(Boolean value) {
        this.useLoggingForShutdownErrors = value;
    }

    /**
     * ��ȡuseMirroredQueues���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMirroredQueues() {
        return useMirroredQueues;
    }

    /**
     * ����useMirroredQueues���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMirroredQueues(Boolean value) {
        this.useMirroredQueues = value;
    }

    /**
     * ��ȡuseShutdownHook���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseShutdownHook() {
        return useShutdownHook;
    }

    /**
     * ����useShutdownHook���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseShutdownHook(Boolean value) {
        this.useShutdownHook = value;
    }

    /**
     * ��ȡuseTempMirroredQueues���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTempMirroredQueues() {
        return useTempMirroredQueues;
    }

    /**
     * ����useTempMirroredQueues���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTempMirroredQueues(Boolean value) {
        this.useTempMirroredQueues = value;
    }

    /**
     * ��ȡuseVirtualDestSubs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseVirtualDestSubs() {
        return useVirtualDestSubs;
    }

    /**
     * ����useVirtualDestSubs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseVirtualDestSubs(Boolean value) {
        this.useVirtualDestSubs = value;
    }

    /**
     * ��ȡuseVirtualDestSubsOnCreation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseVirtualDestSubsOnCreation() {
        return useVirtualDestSubsOnCreation;
    }

    /**
     * ����useVirtualDestSubsOnCreation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseVirtualDestSubsOnCreation(Boolean value) {
        this.useVirtualDestSubsOnCreation = value;
    }

    /**
     * ��ȡuseVirtualTopics���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseVirtualTopics() {
        return useVirtualTopics;
    }

    /**
     * ����useVirtualTopics���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseVirtualTopics(Boolean value) {
        this.useVirtualTopics = value;
    }

    /**
     * ��ȡvmConnectorURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmConnectorURI() {
        return vmConnectorURI;
    }

    /**
     * ����vmConnectorURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmConnectorURI(String value) {
        this.vmConnectorURI = value;
    }

    /**
     * ��ȡwaitForSlave���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitForSlave() {
        return waitForSlave;
    }

    /**
     * ����waitForSlave���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitForSlave(String value) {
        this.waitForSlave = value;
    }

    /**
     * ��ȡwaitForSlaveTimeout���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaitForSlaveTimeout() {
        return waitForSlaveTimeout;
    }

    /**
     * ����waitForSlaveTimeout���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaitForSlaveTimeout(Long value) {
        this.waitForSlaveTimeout = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Object> theContents;
            theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            strategy.appendField(locator, this, "contents", buffer, theContents);
        }
        {
            Boolean theAdjustUsageLimits;
            theAdjustUsageLimits = this.isAdjustUsageLimits();
            strategy.appendField(locator, this, "adjustUsageLimits", buffer, theAdjustUsageLimits);
        }
        {
            String theAdminView;
            theAdminView = this.getAdminView();
            strategy.appendField(locator, this, "adminView", buffer, theAdminView);
        }
        {
            String theAdvisorySupport;
            theAdvisorySupport = this.getAdvisorySupport();
            strategy.appendField(locator, this, "advisorySupport", buffer, theAdvisorySupport);
        }
        {
            Boolean theAllowTempAutoCreationOnSend;
            theAllowTempAutoCreationOnSend = this.isAllowTempAutoCreationOnSend();
            strategy.appendField(locator, this, "allowTempAutoCreationOnSend", buffer, theAllowTempAutoCreationOnSend);
        }
        {
            String theBrokerContext;
            theBrokerContext = this.getBrokerContext();
            strategy.appendField(locator, this, "brokerContext", buffer, theBrokerContext);
        }
        {
            String theBrokerId;
            theBrokerId = this.getBrokerId();
            strategy.appendField(locator, this, "brokerId", buffer, theBrokerId);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            strategy.appendField(locator, this, "brokerName", buffer, theBrokerName);
        }
        {
            String theBrokerObjectName;
            theBrokerObjectName = this.getBrokerObjectName();
            strategy.appendField(locator, this, "brokerObjectName", buffer, theBrokerObjectName);
        }
        {
            Boolean theCacheTempDestinations;
            theCacheTempDestinations = this.isCacheTempDestinations();
            strategy.appendField(locator, this, "cacheTempDestinations", buffer, theCacheTempDestinations);
        }
        {
            String theConsumerSystemUsage;
            theConsumerSystemUsage = this.getConsumerSystemUsage();
            strategy.appendField(locator, this, "consumerSystemUsage", buffer, theConsumerSystemUsage);
        }
        {
            BigInteger theConsumerSystemUsagePortion;
            theConsumerSystemUsagePortion = this.getConsumerSystemUsagePortion();
            strategy.appendField(locator, this, "consumerSystemUsagePortion", buffer, theConsumerSystemUsagePortion);
        }
        {
            String theDataDirectory;
            theDataDirectory = this.getDataDirectory();
            strategy.appendField(locator, this, "dataDirectory", buffer, theDataDirectory);
        }
        {
            String theDataDirectoryFile;
            theDataDirectoryFile = this.getDataDirectoryFile();
            strategy.appendField(locator, this, "dataDirectoryFile", buffer, theDataDirectoryFile);
        }
        {
            Boolean theDedicatedTaskRunner;
            theDedicatedTaskRunner = this.isDedicatedTaskRunner();
            strategy.appendField(locator, this, "dedicatedTaskRunner", buffer, theDedicatedTaskRunner);
        }
        {
            String theDeleteAllMessagesOnStartup;
            theDeleteAllMessagesOnStartup = this.getDeleteAllMessagesOnStartup();
            strategy.appendField(locator, this, "deleteAllMessagesOnStartup", buffer, theDeleteAllMessagesOnStartup);
        }
        {
            String theDestinationFactory;
            theDestinationFactory = this.getDestinationFactory();
            strategy.appendField(locator, this, "destinationFactory", buffer, theDestinationFactory);
        }
        {
            String theDestinationPolicy;
            theDestinationPolicy = this.getDestinationPolicy();
            strategy.appendField(locator, this, "destinationPolicy", buffer, theDestinationPolicy);
        }
        {
            String theDiskUsageCheckRegrowThreshold;
            theDiskUsageCheckRegrowThreshold = this.getDiskUsageCheckRegrowThreshold();
            strategy.appendField(locator, this, "diskUsageCheckRegrowThreshold", buffer, theDiskUsageCheckRegrowThreshold);
        }
        {
            Boolean theEnableStatistics;
            theEnableStatistics = this.isEnableStatistics();
            strategy.appendField(locator, this, "enableStatistics", buffer, theEnableStatistics);
        }
        {
            String theIoExceptionHandler;
            theIoExceptionHandler = this.getIoExceptionHandler();
            strategy.appendField(locator, this, "ioExceptionHandler", buffer, theIoExceptionHandler);
        }
        {
            String theJobSchedulerStore;
            theJobSchedulerStore = this.getJobSchedulerStore();
            strategy.appendField(locator, this, "jobSchedulerStore", buffer, theJobSchedulerStore);
        }
        {
            Boolean theKeepDurableSubsActive;
            theKeepDurableSubsActive = this.isKeepDurableSubsActive();
            strategy.appendField(locator, this, "keepDurableSubsActive", buffer, theKeepDurableSubsActive);
        }
        {
            String theManagementContext;
            theManagementContext = this.getManagementContext();
            strategy.appendField(locator, this, "managementContext", buffer, theManagementContext);
        }
        {
            BigInteger theMaxPurgedDestinationsPerSweep;
            theMaxPurgedDestinationsPerSweep = this.getMaxPurgedDestinationsPerSweep();
            strategy.appendField(locator, this, "maxPurgedDestinationsPerSweep", buffer, theMaxPurgedDestinationsPerSweep);
        }
        {
            Long theMbeanInvocationTimeout;
            theMbeanInvocationTimeout = this.getMbeanInvocationTimeout();
            strategy.appendField(locator, this, "mbeanInvocationTimeout", buffer, theMbeanInvocationTimeout);
        }
        {
            String theMessageAuthorizationPolicy;
            theMessageAuthorizationPolicy = this.getMessageAuthorizationPolicy();
            strategy.appendField(locator, this, "messageAuthorizationPolicy", buffer, theMessageAuthorizationPolicy);
        }
        {
            Boolean theMonitorConnectionSplits;
            theMonitorConnectionSplits = this.isMonitorConnectionSplits();
            strategy.appendField(locator, this, "monitorConnectionSplits", buffer, theMonitorConnectionSplits);
        }
        {
            Boolean theNetworkConnectorStartAsync;
            theNetworkConnectorStartAsync = this.isNetworkConnectorStartAsync();
            strategy.appendField(locator, this, "networkConnectorStartAsync", buffer, theNetworkConnectorStartAsync);
        }
        {
            Long theOfflineDurableSubscriberTaskSchedule;
            theOfflineDurableSubscriberTaskSchedule = this.getOfflineDurableSubscriberTaskSchedule();
            strategy.appendField(locator, this, "offlineDurableSubscriberTaskSchedule", buffer, theOfflineDurableSubscriberTaskSchedule);
        }
        {
            Long theOfflineDurableSubscriberTimeout;
            theOfflineDurableSubscriberTimeout = this.getOfflineDurableSubscriberTimeout();
            strategy.appendField(locator, this, "offlineDurableSubscriberTimeout", buffer, theOfflineDurableSubscriberTimeout);
        }
        {
            String thePassiveSlave;
            thePassiveSlave = this.getPassiveSlave();
            strategy.appendField(locator, this, "passiveSlave", buffer, thePassiveSlave);
        }
        {
            String thePersistenceAdapter;
            thePersistenceAdapter = this.getPersistenceAdapter();
            strategy.appendField(locator, this, "persistenceAdapter", buffer, thePersistenceAdapter);
        }
        {
            String thePersistenceFactory;
            thePersistenceFactory = this.getPersistenceFactory();
            strategy.appendField(locator, this, "persistenceFactory", buffer, thePersistenceFactory);
        }
        {
            String thePersistenceTaskRunnerFactory;
            thePersistenceTaskRunnerFactory = this.getPersistenceTaskRunnerFactory();
            strategy.appendField(locator, this, "persistenceTaskRunnerFactory", buffer, thePersistenceTaskRunnerFactory);
        }
        {
            BigInteger thePersistenceThreadPriority;
            thePersistenceThreadPriority = this.getPersistenceThreadPriority();
            strategy.appendField(locator, this, "persistenceThreadPriority", buffer, thePersistenceThreadPriority);
        }
        {
            String thePersistent;
            thePersistent = this.getPersistent();
            strategy.appendField(locator, this, "persistent", buffer, thePersistent);
        }
        {
            Boolean thePopulateJMSXUserID;
            thePopulateJMSXUserID = this.isPopulateJMSXUserID();
            strategy.appendField(locator, this, "populateJMSXUserID", buffer, thePopulateJMSXUserID);
        }
        {
            Boolean thePopulateUserNameInMBeans;
            thePopulateUserNameInMBeans = this.isPopulateUserNameInMBeans();
            strategy.appendField(locator, this, "populateUserNameInMBeans", buffer, thePopulateUserNameInMBeans);
        }
        {
            String theProducerSystemUsage;
            theProducerSystemUsage = this.getProducerSystemUsage();
            strategy.appendField(locator, this, "producerSystemUsage", buffer, theProducerSystemUsage);
        }
        {
            BigInteger theProducerSystemUsagePortion;
            theProducerSystemUsagePortion = this.getProducerSystemUsagePortion();
            strategy.appendField(locator, this, "producerSystemUsagePortion", buffer, theProducerSystemUsagePortion);
        }
        {
            String theRegionBroker;
            theRegionBroker = this.getRegionBroker();
            strategy.appendField(locator, this, "regionBroker", buffer, theRegionBroker);
        }
        {
            Boolean theRejectDurableConsumers;
            theRejectDurableConsumers = this.isRejectDurableConsumers();
            strategy.appendField(locator, this, "rejectDurableConsumers", buffer, theRejectDurableConsumers);
        }
        {
            Boolean theRestartAllowed;
            theRestartAllowed = this.isRestartAllowed();
            strategy.appendField(locator, this, "restartAllowed", buffer, theRestartAllowed);
        }
        {
            Boolean theRollbackOnlyOnAsyncException;
            theRollbackOnlyOnAsyncException = this.isRollbackOnlyOnAsyncException();
            strategy.appendField(locator, this, "rollbackOnlyOnAsyncException", buffer, theRollbackOnlyOnAsyncException);
        }
        {
            BigInteger theSchedulePeriodForDestinationPurge;
            theSchedulePeriodForDestinationPurge = this.getSchedulePeriodForDestinationPurge();
            strategy.appendField(locator, this, "schedulePeriodForDestinationPurge", buffer, theSchedulePeriodForDestinationPurge);
        }
        {
            BigInteger theSchedulePeriodForDiskUsageCheck;
            theSchedulePeriodForDiskUsageCheck = this.getSchedulePeriodForDiskUsageCheck();
            strategy.appendField(locator, this, "schedulePeriodForDiskUsageCheck", buffer, theSchedulePeriodForDiskUsageCheck);
        }
        {
            String theSchedulerDirectory;
            theSchedulerDirectory = this.getSchedulerDirectory();
            strategy.appendField(locator, this, "schedulerDirectory", buffer, theSchedulerDirectory);
        }
        {
            String theSchedulerDirectoryFile;
            theSchedulerDirectoryFile = this.getSchedulerDirectoryFile();
            strategy.appendField(locator, this, "schedulerDirectoryFile", buffer, theSchedulerDirectoryFile);
        }
        {
            String theSchedulerSupport;
            theSchedulerSupport = this.getSchedulerSupport();
            strategy.appendField(locator, this, "schedulerSupport", buffer, theSchedulerSupport);
        }
        {
            Boolean theShutdownOnMasterFailure;
            theShutdownOnMasterFailure = this.isShutdownOnMasterFailure();
            strategy.appendField(locator, this, "shutdownOnMasterFailure", buffer, theShutdownOnMasterFailure);
        }
        {
            String theShutdownOnSlaveFailure;
            theShutdownOnSlaveFailure = this.getShutdownOnSlaveFailure();
            strategy.appendField(locator, this, "shutdownOnSlaveFailure", buffer, theShutdownOnSlaveFailure);
        }
        {
            Boolean theSplitSystemUsageForProducersConsumers;
            theSplitSystemUsageForProducersConsumers = this.isSplitSystemUsageForProducersConsumers();
            strategy.appendField(locator, this, "splitSystemUsageForProducersConsumers", buffer, theSplitSystemUsageForProducersConsumers);
        }
        {
            String theSslContext;
            theSslContext = this.getSslContext();
            strategy.appendField(locator, this, "sslContext", buffer, theSslContext);
        }
        {
            Boolean theStart;
            theStart = this.isStart();
            strategy.appendField(locator, this, "start", buffer, theStart);
        }
        {
            Boolean theStartAsync;
            theStartAsync = this.isStartAsync();
            strategy.appendField(locator, this, "startAsync", buffer, theStartAsync);
        }
        {
            String theStartException;
            theStartException = this.getStartException();
            strategy.appendField(locator, this, "startException", buffer, theStartException);
        }
        {
            BigInteger theStoreOpenWireVersion;
            theStoreOpenWireVersion = this.getStoreOpenWireVersion();
            strategy.appendField(locator, this, "storeOpenWireVersion", buffer, theStoreOpenWireVersion);
        }
        {
            String theSystemExitOnShutdown;
            theSystemExitOnShutdown = this.getSystemExitOnShutdown();
            strategy.appendField(locator, this, "systemExitOnShutdown", buffer, theSystemExitOnShutdown);
        }
        {
            BigInteger theSystemExitOnShutdownExitCode;
            theSystemExitOnShutdownExitCode = this.getSystemExitOnShutdownExitCode();
            strategy.appendField(locator, this, "systemExitOnShutdownExitCode", buffer, theSystemExitOnShutdownExitCode);
        }
        {
            String theSystemUsage;
            theSystemUsage = this.getSystemUsage();
            strategy.appendField(locator, this, "systemUsage", buffer, theSystemUsage);
        }
        {
            String theTaskRunnerFactory;
            theTaskRunnerFactory = this.getTaskRunnerFactory();
            strategy.appendField(locator, this, "taskRunnerFactory", buffer, theTaskRunnerFactory);
        }
        {
            BigInteger theTaskRunnerPriority;
            theTaskRunnerPriority = this.getTaskRunnerPriority();
            strategy.appendField(locator, this, "taskRunnerPriority", buffer, theTaskRunnerPriority);
        }
        {
            String theTempDataStore;
            theTempDataStore = this.getTempDataStore();
            strategy.appendField(locator, this, "tempDataStore", buffer, theTempDataStore);
        }
        {
            BigInteger theTimeBeforePurgeTempDestinations;
            theTimeBeforePurgeTempDestinations = this.getTimeBeforePurgeTempDestinations();
            strategy.appendField(locator, this, "timeBeforePurgeTempDestinations", buffer, theTimeBeforePurgeTempDestinations);
        }
        {
            String theTmpDataDirectory;
            theTmpDataDirectory = this.getTmpDataDirectory();
            strategy.appendField(locator, this, "tmpDataDirectory", buffer, theTmpDataDirectory);
        }
        {
            Boolean theUseAuthenticatedPrincipalForJMSXUserID;
            theUseAuthenticatedPrincipalForJMSXUserID = this.isUseAuthenticatedPrincipalForJMSXUserID();
            strategy.appendField(locator, this, "useAuthenticatedPrincipalForJMSXUserID", buffer, theUseAuthenticatedPrincipalForJMSXUserID);
        }
        {
            String theUseJmx;
            theUseJmx = this.getUseJmx();
            strategy.appendField(locator, this, "useJmx", buffer, theUseJmx);
        }
        {
            Boolean theUseLocalHostBrokerName;
            theUseLocalHostBrokerName = this.isUseLocalHostBrokerName();
            strategy.appendField(locator, this, "useLocalHostBrokerName", buffer, theUseLocalHostBrokerName);
        }
        {
            Boolean theUseLoggingForShutdownErrors;
            theUseLoggingForShutdownErrors = this.isUseLoggingForShutdownErrors();
            strategy.appendField(locator, this, "useLoggingForShutdownErrors", buffer, theUseLoggingForShutdownErrors);
        }
        {
            Boolean theUseMirroredQueues;
            theUseMirroredQueues = this.isUseMirroredQueues();
            strategy.appendField(locator, this, "useMirroredQueues", buffer, theUseMirroredQueues);
        }
        {
            Boolean theUseShutdownHook;
            theUseShutdownHook = this.isUseShutdownHook();
            strategy.appendField(locator, this, "useShutdownHook", buffer, theUseShutdownHook);
        }
        {
            Boolean theUseTempMirroredQueues;
            theUseTempMirroredQueues = this.isUseTempMirroredQueues();
            strategy.appendField(locator, this, "useTempMirroredQueues", buffer, theUseTempMirroredQueues);
        }
        {
            Boolean theUseVirtualDestSubs;
            theUseVirtualDestSubs = this.isUseVirtualDestSubs();
            strategy.appendField(locator, this, "useVirtualDestSubs", buffer, theUseVirtualDestSubs);
        }
        {
            Boolean theUseVirtualDestSubsOnCreation;
            theUseVirtualDestSubsOnCreation = this.isUseVirtualDestSubsOnCreation();
            strategy.appendField(locator, this, "useVirtualDestSubsOnCreation", buffer, theUseVirtualDestSubsOnCreation);
        }
        {
            Boolean theUseVirtualTopics;
            theUseVirtualTopics = this.isUseVirtualTopics();
            strategy.appendField(locator, this, "useVirtualTopics", buffer, theUseVirtualTopics);
        }
        {
            String theVmConnectorURI;
            theVmConnectorURI = this.getVmConnectorURI();
            strategy.appendField(locator, this, "vmConnectorURI", buffer, theVmConnectorURI);
        }
        {
            String theWaitForSlave;
            theWaitForSlave = this.getWaitForSlave();
            strategy.appendField(locator, this, "waitForSlave", buffer, theWaitForSlave);
        }
        {
            Long theWaitForSlaveTimeout;
            theWaitForSlaveTimeout = this.getWaitForSlaveTimeout();
            strategy.appendField(locator, this, "waitForSlaveTimeout", buffer, theWaitForSlaveTimeout);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Object> theContents;
            theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
        }
        {
            Boolean theAdjustUsageLimits;
            theAdjustUsageLimits = this.isAdjustUsageLimits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adjustUsageLimits", theAdjustUsageLimits), currentHashCode, theAdjustUsageLimits);
        }
        {
            String theAdminView;
            theAdminView = this.getAdminView();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminView", theAdminView), currentHashCode, theAdminView);
        }
        {
            String theAdvisorySupport;
            theAdvisorySupport = this.getAdvisorySupport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisorySupport", theAdvisorySupport), currentHashCode, theAdvisorySupport);
        }
        {
            Boolean theAllowTempAutoCreationOnSend;
            theAllowTempAutoCreationOnSend = this.isAllowTempAutoCreationOnSend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowTempAutoCreationOnSend", theAllowTempAutoCreationOnSend), currentHashCode, theAllowTempAutoCreationOnSend);
        }
        {
            String theBrokerContext;
            theBrokerContext = this.getBrokerContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerContext", theBrokerContext), currentHashCode, theBrokerContext);
        }
        {
            String theBrokerId;
            theBrokerId = this.getBrokerId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerId", theBrokerId), currentHashCode, theBrokerId);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerName", theBrokerName), currentHashCode, theBrokerName);
        }
        {
            String theBrokerObjectName;
            theBrokerObjectName = this.getBrokerObjectName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerObjectName", theBrokerObjectName), currentHashCode, theBrokerObjectName);
        }
        {
            Boolean theCacheTempDestinations;
            theCacheTempDestinations = this.isCacheTempDestinations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cacheTempDestinations", theCacheTempDestinations), currentHashCode, theCacheTempDestinations);
        }
        {
            String theConsumerSystemUsage;
            theConsumerSystemUsage = this.getConsumerSystemUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerSystemUsage", theConsumerSystemUsage), currentHashCode, theConsumerSystemUsage);
        }
        {
            BigInteger theConsumerSystemUsagePortion;
            theConsumerSystemUsagePortion = this.getConsumerSystemUsagePortion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerSystemUsagePortion", theConsumerSystemUsagePortion), currentHashCode, theConsumerSystemUsagePortion);
        }
        {
            String theDataDirectory;
            theDataDirectory = this.getDataDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataDirectory", theDataDirectory), currentHashCode, theDataDirectory);
        }
        {
            String theDataDirectoryFile;
            theDataDirectoryFile = this.getDataDirectoryFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataDirectoryFile", theDataDirectoryFile), currentHashCode, theDataDirectoryFile);
        }
        {
            Boolean theDedicatedTaskRunner;
            theDedicatedTaskRunner = this.isDedicatedTaskRunner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dedicatedTaskRunner", theDedicatedTaskRunner), currentHashCode, theDedicatedTaskRunner);
        }
        {
            String theDeleteAllMessagesOnStartup;
            theDeleteAllMessagesOnStartup = this.getDeleteAllMessagesOnStartup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deleteAllMessagesOnStartup", theDeleteAllMessagesOnStartup), currentHashCode, theDeleteAllMessagesOnStartup);
        }
        {
            String theDestinationFactory;
            theDestinationFactory = this.getDestinationFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationFactory", theDestinationFactory), currentHashCode, theDestinationFactory);
        }
        {
            String theDestinationPolicy;
            theDestinationPolicy = this.getDestinationPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationPolicy", theDestinationPolicy), currentHashCode, theDestinationPolicy);
        }
        {
            String theDiskUsageCheckRegrowThreshold;
            theDiskUsageCheckRegrowThreshold = this.getDiskUsageCheckRegrowThreshold();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diskUsageCheckRegrowThreshold", theDiskUsageCheckRegrowThreshold), currentHashCode, theDiskUsageCheckRegrowThreshold);
        }
        {
            Boolean theEnableStatistics;
            theEnableStatistics = this.isEnableStatistics();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableStatistics", theEnableStatistics), currentHashCode, theEnableStatistics);
        }
        {
            String theIoExceptionHandler;
            theIoExceptionHandler = this.getIoExceptionHandler();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ioExceptionHandler", theIoExceptionHandler), currentHashCode, theIoExceptionHandler);
        }
        {
            String theJobSchedulerStore;
            theJobSchedulerStore = this.getJobSchedulerStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jobSchedulerStore", theJobSchedulerStore), currentHashCode, theJobSchedulerStore);
        }
        {
            Boolean theKeepDurableSubsActive;
            theKeepDurableSubsActive = this.isKeepDurableSubsActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keepDurableSubsActive", theKeepDurableSubsActive), currentHashCode, theKeepDurableSubsActive);
        }
        {
            String theManagementContext;
            theManagementContext = this.getManagementContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "managementContext", theManagementContext), currentHashCode, theManagementContext);
        }
        {
            BigInteger theMaxPurgedDestinationsPerSweep;
            theMaxPurgedDestinationsPerSweep = this.getMaxPurgedDestinationsPerSweep();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxPurgedDestinationsPerSweep", theMaxPurgedDestinationsPerSweep), currentHashCode, theMaxPurgedDestinationsPerSweep);
        }
        {
            Long theMbeanInvocationTimeout;
            theMbeanInvocationTimeout = this.getMbeanInvocationTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mbeanInvocationTimeout", theMbeanInvocationTimeout), currentHashCode, theMbeanInvocationTimeout);
        }
        {
            String theMessageAuthorizationPolicy;
            theMessageAuthorizationPolicy = this.getMessageAuthorizationPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageAuthorizationPolicy", theMessageAuthorizationPolicy), currentHashCode, theMessageAuthorizationPolicy);
        }
        {
            Boolean theMonitorConnectionSplits;
            theMonitorConnectionSplits = this.isMonitorConnectionSplits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monitorConnectionSplits", theMonitorConnectionSplits), currentHashCode, theMonitorConnectionSplits);
        }
        {
            Boolean theNetworkConnectorStartAsync;
            theNetworkConnectorStartAsync = this.isNetworkConnectorStartAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkConnectorStartAsync", theNetworkConnectorStartAsync), currentHashCode, theNetworkConnectorStartAsync);
        }
        {
            Long theOfflineDurableSubscriberTaskSchedule;
            theOfflineDurableSubscriberTaskSchedule = this.getOfflineDurableSubscriberTaskSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offlineDurableSubscriberTaskSchedule", theOfflineDurableSubscriberTaskSchedule), currentHashCode, theOfflineDurableSubscriberTaskSchedule);
        }
        {
            Long theOfflineDurableSubscriberTimeout;
            theOfflineDurableSubscriberTimeout = this.getOfflineDurableSubscriberTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offlineDurableSubscriberTimeout", theOfflineDurableSubscriberTimeout), currentHashCode, theOfflineDurableSubscriberTimeout);
        }
        {
            String thePassiveSlave;
            thePassiveSlave = this.getPassiveSlave();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passiveSlave", thePassiveSlave), currentHashCode, thePassiveSlave);
        }
        {
            String thePersistenceAdapter;
            thePersistenceAdapter = this.getPersistenceAdapter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistenceAdapter", thePersistenceAdapter), currentHashCode, thePersistenceAdapter);
        }
        {
            String thePersistenceFactory;
            thePersistenceFactory = this.getPersistenceFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistenceFactory", thePersistenceFactory), currentHashCode, thePersistenceFactory);
        }
        {
            String thePersistenceTaskRunnerFactory;
            thePersistenceTaskRunnerFactory = this.getPersistenceTaskRunnerFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistenceTaskRunnerFactory", thePersistenceTaskRunnerFactory), currentHashCode, thePersistenceTaskRunnerFactory);
        }
        {
            BigInteger thePersistenceThreadPriority;
            thePersistenceThreadPriority = this.getPersistenceThreadPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistenceThreadPriority", thePersistenceThreadPriority), currentHashCode, thePersistenceThreadPriority);
        }
        {
            String thePersistent;
            thePersistent = this.getPersistent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistent", thePersistent), currentHashCode, thePersistent);
        }
        {
            Boolean thePopulateJMSXUserID;
            thePopulateJMSXUserID = this.isPopulateJMSXUserID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "populateJMSXUserID", thePopulateJMSXUserID), currentHashCode, thePopulateJMSXUserID);
        }
        {
            Boolean thePopulateUserNameInMBeans;
            thePopulateUserNameInMBeans = this.isPopulateUserNameInMBeans();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "populateUserNameInMBeans", thePopulateUserNameInMBeans), currentHashCode, thePopulateUserNameInMBeans);
        }
        {
            String theProducerSystemUsage;
            theProducerSystemUsage = this.getProducerSystemUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerSystemUsage", theProducerSystemUsage), currentHashCode, theProducerSystemUsage);
        }
        {
            BigInteger theProducerSystemUsagePortion;
            theProducerSystemUsagePortion = this.getProducerSystemUsagePortion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerSystemUsagePortion", theProducerSystemUsagePortion), currentHashCode, theProducerSystemUsagePortion);
        }
        {
            String theRegionBroker;
            theRegionBroker = this.getRegionBroker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionBroker", theRegionBroker), currentHashCode, theRegionBroker);
        }
        {
            Boolean theRejectDurableConsumers;
            theRejectDurableConsumers = this.isRejectDurableConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectDurableConsumers", theRejectDurableConsumers), currentHashCode, theRejectDurableConsumers);
        }
        {
            Boolean theRestartAllowed;
            theRestartAllowed = this.isRestartAllowed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restartAllowed", theRestartAllowed), currentHashCode, theRestartAllowed);
        }
        {
            Boolean theRollbackOnlyOnAsyncException;
            theRollbackOnlyOnAsyncException = this.isRollbackOnlyOnAsyncException();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rollbackOnlyOnAsyncException", theRollbackOnlyOnAsyncException), currentHashCode, theRollbackOnlyOnAsyncException);
        }
        {
            BigInteger theSchedulePeriodForDestinationPurge;
            theSchedulePeriodForDestinationPurge = this.getSchedulePeriodForDestinationPurge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedulePeriodForDestinationPurge", theSchedulePeriodForDestinationPurge), currentHashCode, theSchedulePeriodForDestinationPurge);
        }
        {
            BigInteger theSchedulePeriodForDiskUsageCheck;
            theSchedulePeriodForDiskUsageCheck = this.getSchedulePeriodForDiskUsageCheck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedulePeriodForDiskUsageCheck", theSchedulePeriodForDiskUsageCheck), currentHashCode, theSchedulePeriodForDiskUsageCheck);
        }
        {
            String theSchedulerDirectory;
            theSchedulerDirectory = this.getSchedulerDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedulerDirectory", theSchedulerDirectory), currentHashCode, theSchedulerDirectory);
        }
        {
            String theSchedulerDirectoryFile;
            theSchedulerDirectoryFile = this.getSchedulerDirectoryFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedulerDirectoryFile", theSchedulerDirectoryFile), currentHashCode, theSchedulerDirectoryFile);
        }
        {
            String theSchedulerSupport;
            theSchedulerSupport = this.getSchedulerSupport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedulerSupport", theSchedulerSupport), currentHashCode, theSchedulerSupport);
        }
        {
            Boolean theShutdownOnMasterFailure;
            theShutdownOnMasterFailure = this.isShutdownOnMasterFailure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shutdownOnMasterFailure", theShutdownOnMasterFailure), currentHashCode, theShutdownOnMasterFailure);
        }
        {
            String theShutdownOnSlaveFailure;
            theShutdownOnSlaveFailure = this.getShutdownOnSlaveFailure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shutdownOnSlaveFailure", theShutdownOnSlaveFailure), currentHashCode, theShutdownOnSlaveFailure);
        }
        {
            Boolean theSplitSystemUsageForProducersConsumers;
            theSplitSystemUsageForProducersConsumers = this.isSplitSystemUsageForProducersConsumers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "splitSystemUsageForProducersConsumers", theSplitSystemUsageForProducersConsumers), currentHashCode, theSplitSystemUsageForProducersConsumers);
        }
        {
            String theSslContext;
            theSslContext = this.getSslContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sslContext", theSslContext), currentHashCode, theSslContext);
        }
        {
            Boolean theStart;
            theStart = this.isStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "start", theStart), currentHashCode, theStart);
        }
        {
            Boolean theStartAsync;
            theStartAsync = this.isStartAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startAsync", theStartAsync), currentHashCode, theStartAsync);
        }
        {
            String theStartException;
            theStartException = this.getStartException();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startException", theStartException), currentHashCode, theStartException);
        }
        {
            BigInteger theStoreOpenWireVersion;
            theStoreOpenWireVersion = this.getStoreOpenWireVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storeOpenWireVersion", theStoreOpenWireVersion), currentHashCode, theStoreOpenWireVersion);
        }
        {
            String theSystemExitOnShutdown;
            theSystemExitOnShutdown = this.getSystemExitOnShutdown();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemExitOnShutdown", theSystemExitOnShutdown), currentHashCode, theSystemExitOnShutdown);
        }
        {
            BigInteger theSystemExitOnShutdownExitCode;
            theSystemExitOnShutdownExitCode = this.getSystemExitOnShutdownExitCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemExitOnShutdownExitCode", theSystemExitOnShutdownExitCode), currentHashCode, theSystemExitOnShutdownExitCode);
        }
        {
            String theSystemUsage;
            theSystemUsage = this.getSystemUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemUsage", theSystemUsage), currentHashCode, theSystemUsage);
        }
        {
            String theTaskRunnerFactory;
            theTaskRunnerFactory = this.getTaskRunnerFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerFactory", theTaskRunnerFactory), currentHashCode, theTaskRunnerFactory);
        }
        {
            BigInteger theTaskRunnerPriority;
            theTaskRunnerPriority = this.getTaskRunnerPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerPriority", theTaskRunnerPriority), currentHashCode, theTaskRunnerPriority);
        }
        {
            String theTempDataStore;
            theTempDataStore = this.getTempDataStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempDataStore", theTempDataStore), currentHashCode, theTempDataStore);
        }
        {
            BigInteger theTimeBeforePurgeTempDestinations;
            theTimeBeforePurgeTempDestinations = this.getTimeBeforePurgeTempDestinations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeBeforePurgeTempDestinations", theTimeBeforePurgeTempDestinations), currentHashCode, theTimeBeforePurgeTempDestinations);
        }
        {
            String theTmpDataDirectory;
            theTmpDataDirectory = this.getTmpDataDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tmpDataDirectory", theTmpDataDirectory), currentHashCode, theTmpDataDirectory);
        }
        {
            Boolean theUseAuthenticatedPrincipalForJMSXUserID;
            theUseAuthenticatedPrincipalForJMSXUserID = this.isUseAuthenticatedPrincipalForJMSXUserID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useAuthenticatedPrincipalForJMSXUserID", theUseAuthenticatedPrincipalForJMSXUserID), currentHashCode, theUseAuthenticatedPrincipalForJMSXUserID);
        }
        {
            String theUseJmx;
            theUseJmx = this.getUseJmx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useJmx", theUseJmx), currentHashCode, theUseJmx);
        }
        {
            Boolean theUseLocalHostBrokerName;
            theUseLocalHostBrokerName = this.isUseLocalHostBrokerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLocalHostBrokerName", theUseLocalHostBrokerName), currentHashCode, theUseLocalHostBrokerName);
        }
        {
            Boolean theUseLoggingForShutdownErrors;
            theUseLoggingForShutdownErrors = this.isUseLoggingForShutdownErrors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLoggingForShutdownErrors", theUseLoggingForShutdownErrors), currentHashCode, theUseLoggingForShutdownErrors);
        }
        {
            Boolean theUseMirroredQueues;
            theUseMirroredQueues = this.isUseMirroredQueues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useMirroredQueues", theUseMirroredQueues), currentHashCode, theUseMirroredQueues);
        }
        {
            Boolean theUseShutdownHook;
            theUseShutdownHook = this.isUseShutdownHook();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useShutdownHook", theUseShutdownHook), currentHashCode, theUseShutdownHook);
        }
        {
            Boolean theUseTempMirroredQueues;
            theUseTempMirroredQueues = this.isUseTempMirroredQueues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useTempMirroredQueues", theUseTempMirroredQueues), currentHashCode, theUseTempMirroredQueues);
        }
        {
            Boolean theUseVirtualDestSubs;
            theUseVirtualDestSubs = this.isUseVirtualDestSubs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useVirtualDestSubs", theUseVirtualDestSubs), currentHashCode, theUseVirtualDestSubs);
        }
        {
            Boolean theUseVirtualDestSubsOnCreation;
            theUseVirtualDestSubsOnCreation = this.isUseVirtualDestSubsOnCreation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useVirtualDestSubsOnCreation", theUseVirtualDestSubsOnCreation), currentHashCode, theUseVirtualDestSubsOnCreation);
        }
        {
            Boolean theUseVirtualTopics;
            theUseVirtualTopics = this.isUseVirtualTopics();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useVirtualTopics", theUseVirtualTopics), currentHashCode, theUseVirtualTopics);
        }
        {
            String theVmConnectorURI;
            theVmConnectorURI = this.getVmConnectorURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vmConnectorURI", theVmConnectorURI), currentHashCode, theVmConnectorURI);
        }
        {
            String theWaitForSlave;
            theWaitForSlave = this.getWaitForSlave();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waitForSlave", theWaitForSlave), currentHashCode, theWaitForSlave);
        }
        {
            Long theWaitForSlaveTimeout;
            theWaitForSlaveTimeout = this.getWaitForSlaveTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waitForSlaveTimeout", theWaitForSlaveTimeout), currentHashCode, theWaitForSlaveTimeout);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DtoBroker)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoBroker that = ((DtoBroker) object);
        {
            List<Object> lhsContents;
            lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            List<Object> rhsContents;
            rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
                return false;
            }
        }
        {
            Boolean lhsAdjustUsageLimits;
            lhsAdjustUsageLimits = this.isAdjustUsageLimits();
            Boolean rhsAdjustUsageLimits;
            rhsAdjustUsageLimits = that.isAdjustUsageLimits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adjustUsageLimits", lhsAdjustUsageLimits), LocatorUtils.property(thatLocator, "adjustUsageLimits", rhsAdjustUsageLimits), lhsAdjustUsageLimits, rhsAdjustUsageLimits)) {
                return false;
            }
        }
        {
            String lhsAdminView;
            lhsAdminView = this.getAdminView();
            String rhsAdminView;
            rhsAdminView = that.getAdminView();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminView", lhsAdminView), LocatorUtils.property(thatLocator, "adminView", rhsAdminView), lhsAdminView, rhsAdminView)) {
                return false;
            }
        }
        {
            String lhsAdvisorySupport;
            lhsAdvisorySupport = this.getAdvisorySupport();
            String rhsAdvisorySupport;
            rhsAdvisorySupport = that.getAdvisorySupport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisorySupport", lhsAdvisorySupport), LocatorUtils.property(thatLocator, "advisorySupport", rhsAdvisorySupport), lhsAdvisorySupport, rhsAdvisorySupport)) {
                return false;
            }
        }
        {
            Boolean lhsAllowTempAutoCreationOnSend;
            lhsAllowTempAutoCreationOnSend = this.isAllowTempAutoCreationOnSend();
            Boolean rhsAllowTempAutoCreationOnSend;
            rhsAllowTempAutoCreationOnSend = that.isAllowTempAutoCreationOnSend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowTempAutoCreationOnSend", lhsAllowTempAutoCreationOnSend), LocatorUtils.property(thatLocator, "allowTempAutoCreationOnSend", rhsAllowTempAutoCreationOnSend), lhsAllowTempAutoCreationOnSend, rhsAllowTempAutoCreationOnSend)) {
                return false;
            }
        }
        {
            String lhsBrokerContext;
            lhsBrokerContext = this.getBrokerContext();
            String rhsBrokerContext;
            rhsBrokerContext = that.getBrokerContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerContext", lhsBrokerContext), LocatorUtils.property(thatLocator, "brokerContext", rhsBrokerContext), lhsBrokerContext, rhsBrokerContext)) {
                return false;
            }
        }
        {
            String lhsBrokerId;
            lhsBrokerId = this.getBrokerId();
            String rhsBrokerId;
            rhsBrokerId = that.getBrokerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerId", lhsBrokerId), LocatorUtils.property(thatLocator, "brokerId", rhsBrokerId), lhsBrokerId, rhsBrokerId)) {
                return false;
            }
        }
        {
            String lhsBrokerName;
            lhsBrokerName = this.getBrokerName();
            String rhsBrokerName;
            rhsBrokerName = that.getBrokerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerName", lhsBrokerName), LocatorUtils.property(thatLocator, "brokerName", rhsBrokerName), lhsBrokerName, rhsBrokerName)) {
                return false;
            }
        }
        {
            String lhsBrokerObjectName;
            lhsBrokerObjectName = this.getBrokerObjectName();
            String rhsBrokerObjectName;
            rhsBrokerObjectName = that.getBrokerObjectName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerObjectName", lhsBrokerObjectName), LocatorUtils.property(thatLocator, "brokerObjectName", rhsBrokerObjectName), lhsBrokerObjectName, rhsBrokerObjectName)) {
                return false;
            }
        }
        {
            Boolean lhsCacheTempDestinations;
            lhsCacheTempDestinations = this.isCacheTempDestinations();
            Boolean rhsCacheTempDestinations;
            rhsCacheTempDestinations = that.isCacheTempDestinations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cacheTempDestinations", lhsCacheTempDestinations), LocatorUtils.property(thatLocator, "cacheTempDestinations", rhsCacheTempDestinations), lhsCacheTempDestinations, rhsCacheTempDestinations)) {
                return false;
            }
        }
        {
            String lhsConsumerSystemUsage;
            lhsConsumerSystemUsage = this.getConsumerSystemUsage();
            String rhsConsumerSystemUsage;
            rhsConsumerSystemUsage = that.getConsumerSystemUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerSystemUsage", lhsConsumerSystemUsage), LocatorUtils.property(thatLocator, "consumerSystemUsage", rhsConsumerSystemUsage), lhsConsumerSystemUsage, rhsConsumerSystemUsage)) {
                return false;
            }
        }
        {
            BigInteger lhsConsumerSystemUsagePortion;
            lhsConsumerSystemUsagePortion = this.getConsumerSystemUsagePortion();
            BigInteger rhsConsumerSystemUsagePortion;
            rhsConsumerSystemUsagePortion = that.getConsumerSystemUsagePortion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerSystemUsagePortion", lhsConsumerSystemUsagePortion), LocatorUtils.property(thatLocator, "consumerSystemUsagePortion", rhsConsumerSystemUsagePortion), lhsConsumerSystemUsagePortion, rhsConsumerSystemUsagePortion)) {
                return false;
            }
        }
        {
            String lhsDataDirectory;
            lhsDataDirectory = this.getDataDirectory();
            String rhsDataDirectory;
            rhsDataDirectory = that.getDataDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataDirectory", lhsDataDirectory), LocatorUtils.property(thatLocator, "dataDirectory", rhsDataDirectory), lhsDataDirectory, rhsDataDirectory)) {
                return false;
            }
        }
        {
            String lhsDataDirectoryFile;
            lhsDataDirectoryFile = this.getDataDirectoryFile();
            String rhsDataDirectoryFile;
            rhsDataDirectoryFile = that.getDataDirectoryFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataDirectoryFile", lhsDataDirectoryFile), LocatorUtils.property(thatLocator, "dataDirectoryFile", rhsDataDirectoryFile), lhsDataDirectoryFile, rhsDataDirectoryFile)) {
                return false;
            }
        }
        {
            Boolean lhsDedicatedTaskRunner;
            lhsDedicatedTaskRunner = this.isDedicatedTaskRunner();
            Boolean rhsDedicatedTaskRunner;
            rhsDedicatedTaskRunner = that.isDedicatedTaskRunner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dedicatedTaskRunner", lhsDedicatedTaskRunner), LocatorUtils.property(thatLocator, "dedicatedTaskRunner", rhsDedicatedTaskRunner), lhsDedicatedTaskRunner, rhsDedicatedTaskRunner)) {
                return false;
            }
        }
        {
            String lhsDeleteAllMessagesOnStartup;
            lhsDeleteAllMessagesOnStartup = this.getDeleteAllMessagesOnStartup();
            String rhsDeleteAllMessagesOnStartup;
            rhsDeleteAllMessagesOnStartup = that.getDeleteAllMessagesOnStartup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deleteAllMessagesOnStartup", lhsDeleteAllMessagesOnStartup), LocatorUtils.property(thatLocator, "deleteAllMessagesOnStartup", rhsDeleteAllMessagesOnStartup), lhsDeleteAllMessagesOnStartup, rhsDeleteAllMessagesOnStartup)) {
                return false;
            }
        }
        {
            String lhsDestinationFactory;
            lhsDestinationFactory = this.getDestinationFactory();
            String rhsDestinationFactory;
            rhsDestinationFactory = that.getDestinationFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationFactory", lhsDestinationFactory), LocatorUtils.property(thatLocator, "destinationFactory", rhsDestinationFactory), lhsDestinationFactory, rhsDestinationFactory)) {
                return false;
            }
        }
        {
            String lhsDestinationPolicy;
            lhsDestinationPolicy = this.getDestinationPolicy();
            String rhsDestinationPolicy;
            rhsDestinationPolicy = that.getDestinationPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationPolicy", lhsDestinationPolicy), LocatorUtils.property(thatLocator, "destinationPolicy", rhsDestinationPolicy), lhsDestinationPolicy, rhsDestinationPolicy)) {
                return false;
            }
        }
        {
            String lhsDiskUsageCheckRegrowThreshold;
            lhsDiskUsageCheckRegrowThreshold = this.getDiskUsageCheckRegrowThreshold();
            String rhsDiskUsageCheckRegrowThreshold;
            rhsDiskUsageCheckRegrowThreshold = that.getDiskUsageCheckRegrowThreshold();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diskUsageCheckRegrowThreshold", lhsDiskUsageCheckRegrowThreshold), LocatorUtils.property(thatLocator, "diskUsageCheckRegrowThreshold", rhsDiskUsageCheckRegrowThreshold), lhsDiskUsageCheckRegrowThreshold, rhsDiskUsageCheckRegrowThreshold)) {
                return false;
            }
        }
        {
            Boolean lhsEnableStatistics;
            lhsEnableStatistics = this.isEnableStatistics();
            Boolean rhsEnableStatistics;
            rhsEnableStatistics = that.isEnableStatistics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableStatistics", lhsEnableStatistics), LocatorUtils.property(thatLocator, "enableStatistics", rhsEnableStatistics), lhsEnableStatistics, rhsEnableStatistics)) {
                return false;
            }
        }
        {
            String lhsIoExceptionHandler;
            lhsIoExceptionHandler = this.getIoExceptionHandler();
            String rhsIoExceptionHandler;
            rhsIoExceptionHandler = that.getIoExceptionHandler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ioExceptionHandler", lhsIoExceptionHandler), LocatorUtils.property(thatLocator, "ioExceptionHandler", rhsIoExceptionHandler), lhsIoExceptionHandler, rhsIoExceptionHandler)) {
                return false;
            }
        }
        {
            String lhsJobSchedulerStore;
            lhsJobSchedulerStore = this.getJobSchedulerStore();
            String rhsJobSchedulerStore;
            rhsJobSchedulerStore = that.getJobSchedulerStore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jobSchedulerStore", lhsJobSchedulerStore), LocatorUtils.property(thatLocator, "jobSchedulerStore", rhsJobSchedulerStore), lhsJobSchedulerStore, rhsJobSchedulerStore)) {
                return false;
            }
        }
        {
            Boolean lhsKeepDurableSubsActive;
            lhsKeepDurableSubsActive = this.isKeepDurableSubsActive();
            Boolean rhsKeepDurableSubsActive;
            rhsKeepDurableSubsActive = that.isKeepDurableSubsActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keepDurableSubsActive", lhsKeepDurableSubsActive), LocatorUtils.property(thatLocator, "keepDurableSubsActive", rhsKeepDurableSubsActive), lhsKeepDurableSubsActive, rhsKeepDurableSubsActive)) {
                return false;
            }
        }
        {
            String lhsManagementContext;
            lhsManagementContext = this.getManagementContext();
            String rhsManagementContext;
            rhsManagementContext = that.getManagementContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "managementContext", lhsManagementContext), LocatorUtils.property(thatLocator, "managementContext", rhsManagementContext), lhsManagementContext, rhsManagementContext)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxPurgedDestinationsPerSweep;
            lhsMaxPurgedDestinationsPerSweep = this.getMaxPurgedDestinationsPerSweep();
            BigInteger rhsMaxPurgedDestinationsPerSweep;
            rhsMaxPurgedDestinationsPerSweep = that.getMaxPurgedDestinationsPerSweep();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxPurgedDestinationsPerSweep", lhsMaxPurgedDestinationsPerSweep), LocatorUtils.property(thatLocator, "maxPurgedDestinationsPerSweep", rhsMaxPurgedDestinationsPerSweep), lhsMaxPurgedDestinationsPerSweep, rhsMaxPurgedDestinationsPerSweep)) {
                return false;
            }
        }
        {
            Long lhsMbeanInvocationTimeout;
            lhsMbeanInvocationTimeout = this.getMbeanInvocationTimeout();
            Long rhsMbeanInvocationTimeout;
            rhsMbeanInvocationTimeout = that.getMbeanInvocationTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mbeanInvocationTimeout", lhsMbeanInvocationTimeout), LocatorUtils.property(thatLocator, "mbeanInvocationTimeout", rhsMbeanInvocationTimeout), lhsMbeanInvocationTimeout, rhsMbeanInvocationTimeout)) {
                return false;
            }
        }
        {
            String lhsMessageAuthorizationPolicy;
            lhsMessageAuthorizationPolicy = this.getMessageAuthorizationPolicy();
            String rhsMessageAuthorizationPolicy;
            rhsMessageAuthorizationPolicy = that.getMessageAuthorizationPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageAuthorizationPolicy", lhsMessageAuthorizationPolicy), LocatorUtils.property(thatLocator, "messageAuthorizationPolicy", rhsMessageAuthorizationPolicy), lhsMessageAuthorizationPolicy, rhsMessageAuthorizationPolicy)) {
                return false;
            }
        }
        {
            Boolean lhsMonitorConnectionSplits;
            lhsMonitorConnectionSplits = this.isMonitorConnectionSplits();
            Boolean rhsMonitorConnectionSplits;
            rhsMonitorConnectionSplits = that.isMonitorConnectionSplits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monitorConnectionSplits", lhsMonitorConnectionSplits), LocatorUtils.property(thatLocator, "monitorConnectionSplits", rhsMonitorConnectionSplits), lhsMonitorConnectionSplits, rhsMonitorConnectionSplits)) {
                return false;
            }
        }
        {
            Boolean lhsNetworkConnectorStartAsync;
            lhsNetworkConnectorStartAsync = this.isNetworkConnectorStartAsync();
            Boolean rhsNetworkConnectorStartAsync;
            rhsNetworkConnectorStartAsync = that.isNetworkConnectorStartAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkConnectorStartAsync", lhsNetworkConnectorStartAsync), LocatorUtils.property(thatLocator, "networkConnectorStartAsync", rhsNetworkConnectorStartAsync), lhsNetworkConnectorStartAsync, rhsNetworkConnectorStartAsync)) {
                return false;
            }
        }
        {
            Long lhsOfflineDurableSubscriberTaskSchedule;
            lhsOfflineDurableSubscriberTaskSchedule = this.getOfflineDurableSubscriberTaskSchedule();
            Long rhsOfflineDurableSubscriberTaskSchedule;
            rhsOfflineDurableSubscriberTaskSchedule = that.getOfflineDurableSubscriberTaskSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offlineDurableSubscriberTaskSchedule", lhsOfflineDurableSubscriberTaskSchedule), LocatorUtils.property(thatLocator, "offlineDurableSubscriberTaskSchedule", rhsOfflineDurableSubscriberTaskSchedule), lhsOfflineDurableSubscriberTaskSchedule, rhsOfflineDurableSubscriberTaskSchedule)) {
                return false;
            }
        }
        {
            Long lhsOfflineDurableSubscriberTimeout;
            lhsOfflineDurableSubscriberTimeout = this.getOfflineDurableSubscriberTimeout();
            Long rhsOfflineDurableSubscriberTimeout;
            rhsOfflineDurableSubscriberTimeout = that.getOfflineDurableSubscriberTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offlineDurableSubscriberTimeout", lhsOfflineDurableSubscriberTimeout), LocatorUtils.property(thatLocator, "offlineDurableSubscriberTimeout", rhsOfflineDurableSubscriberTimeout), lhsOfflineDurableSubscriberTimeout, rhsOfflineDurableSubscriberTimeout)) {
                return false;
            }
        }
        {
            String lhsPassiveSlave;
            lhsPassiveSlave = this.getPassiveSlave();
            String rhsPassiveSlave;
            rhsPassiveSlave = that.getPassiveSlave();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passiveSlave", lhsPassiveSlave), LocatorUtils.property(thatLocator, "passiveSlave", rhsPassiveSlave), lhsPassiveSlave, rhsPassiveSlave)) {
                return false;
            }
        }
        {
            String lhsPersistenceAdapter;
            lhsPersistenceAdapter = this.getPersistenceAdapter();
            String rhsPersistenceAdapter;
            rhsPersistenceAdapter = that.getPersistenceAdapter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistenceAdapter", lhsPersistenceAdapter), LocatorUtils.property(thatLocator, "persistenceAdapter", rhsPersistenceAdapter), lhsPersistenceAdapter, rhsPersistenceAdapter)) {
                return false;
            }
        }
        {
            String lhsPersistenceFactory;
            lhsPersistenceFactory = this.getPersistenceFactory();
            String rhsPersistenceFactory;
            rhsPersistenceFactory = that.getPersistenceFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistenceFactory", lhsPersistenceFactory), LocatorUtils.property(thatLocator, "persistenceFactory", rhsPersistenceFactory), lhsPersistenceFactory, rhsPersistenceFactory)) {
                return false;
            }
        }
        {
            String lhsPersistenceTaskRunnerFactory;
            lhsPersistenceTaskRunnerFactory = this.getPersistenceTaskRunnerFactory();
            String rhsPersistenceTaskRunnerFactory;
            rhsPersistenceTaskRunnerFactory = that.getPersistenceTaskRunnerFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistenceTaskRunnerFactory", lhsPersistenceTaskRunnerFactory), LocatorUtils.property(thatLocator, "persistenceTaskRunnerFactory", rhsPersistenceTaskRunnerFactory), lhsPersistenceTaskRunnerFactory, rhsPersistenceTaskRunnerFactory)) {
                return false;
            }
        }
        {
            BigInteger lhsPersistenceThreadPriority;
            lhsPersistenceThreadPriority = this.getPersistenceThreadPriority();
            BigInteger rhsPersistenceThreadPriority;
            rhsPersistenceThreadPriority = that.getPersistenceThreadPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistenceThreadPriority", lhsPersistenceThreadPriority), LocatorUtils.property(thatLocator, "persistenceThreadPriority", rhsPersistenceThreadPriority), lhsPersistenceThreadPriority, rhsPersistenceThreadPriority)) {
                return false;
            }
        }
        {
            String lhsPersistent;
            lhsPersistent = this.getPersistent();
            String rhsPersistent;
            rhsPersistent = that.getPersistent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistent", lhsPersistent), LocatorUtils.property(thatLocator, "persistent", rhsPersistent), lhsPersistent, rhsPersistent)) {
                return false;
            }
        }
        {
            Boolean lhsPopulateJMSXUserID;
            lhsPopulateJMSXUserID = this.isPopulateJMSXUserID();
            Boolean rhsPopulateJMSXUserID;
            rhsPopulateJMSXUserID = that.isPopulateJMSXUserID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "populateJMSXUserID", lhsPopulateJMSXUserID), LocatorUtils.property(thatLocator, "populateJMSXUserID", rhsPopulateJMSXUserID), lhsPopulateJMSXUserID, rhsPopulateJMSXUserID)) {
                return false;
            }
        }
        {
            Boolean lhsPopulateUserNameInMBeans;
            lhsPopulateUserNameInMBeans = this.isPopulateUserNameInMBeans();
            Boolean rhsPopulateUserNameInMBeans;
            rhsPopulateUserNameInMBeans = that.isPopulateUserNameInMBeans();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "populateUserNameInMBeans", lhsPopulateUserNameInMBeans), LocatorUtils.property(thatLocator, "populateUserNameInMBeans", rhsPopulateUserNameInMBeans), lhsPopulateUserNameInMBeans, rhsPopulateUserNameInMBeans)) {
                return false;
            }
        }
        {
            String lhsProducerSystemUsage;
            lhsProducerSystemUsage = this.getProducerSystemUsage();
            String rhsProducerSystemUsage;
            rhsProducerSystemUsage = that.getProducerSystemUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerSystemUsage", lhsProducerSystemUsage), LocatorUtils.property(thatLocator, "producerSystemUsage", rhsProducerSystemUsage), lhsProducerSystemUsage, rhsProducerSystemUsage)) {
                return false;
            }
        }
        {
            BigInteger lhsProducerSystemUsagePortion;
            lhsProducerSystemUsagePortion = this.getProducerSystemUsagePortion();
            BigInteger rhsProducerSystemUsagePortion;
            rhsProducerSystemUsagePortion = that.getProducerSystemUsagePortion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerSystemUsagePortion", lhsProducerSystemUsagePortion), LocatorUtils.property(thatLocator, "producerSystemUsagePortion", rhsProducerSystemUsagePortion), lhsProducerSystemUsagePortion, rhsProducerSystemUsagePortion)) {
                return false;
            }
        }
        {
            String lhsRegionBroker;
            lhsRegionBroker = this.getRegionBroker();
            String rhsRegionBroker;
            rhsRegionBroker = that.getRegionBroker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionBroker", lhsRegionBroker), LocatorUtils.property(thatLocator, "regionBroker", rhsRegionBroker), lhsRegionBroker, rhsRegionBroker)) {
                return false;
            }
        }
        {
            Boolean lhsRejectDurableConsumers;
            lhsRejectDurableConsumers = this.isRejectDurableConsumers();
            Boolean rhsRejectDurableConsumers;
            rhsRejectDurableConsumers = that.isRejectDurableConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectDurableConsumers", lhsRejectDurableConsumers), LocatorUtils.property(thatLocator, "rejectDurableConsumers", rhsRejectDurableConsumers), lhsRejectDurableConsumers, rhsRejectDurableConsumers)) {
                return false;
            }
        }
        {
            Boolean lhsRestartAllowed;
            lhsRestartAllowed = this.isRestartAllowed();
            Boolean rhsRestartAllowed;
            rhsRestartAllowed = that.isRestartAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restartAllowed", lhsRestartAllowed), LocatorUtils.property(thatLocator, "restartAllowed", rhsRestartAllowed), lhsRestartAllowed, rhsRestartAllowed)) {
                return false;
            }
        }
        {
            Boolean lhsRollbackOnlyOnAsyncException;
            lhsRollbackOnlyOnAsyncException = this.isRollbackOnlyOnAsyncException();
            Boolean rhsRollbackOnlyOnAsyncException;
            rhsRollbackOnlyOnAsyncException = that.isRollbackOnlyOnAsyncException();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rollbackOnlyOnAsyncException", lhsRollbackOnlyOnAsyncException), LocatorUtils.property(thatLocator, "rollbackOnlyOnAsyncException", rhsRollbackOnlyOnAsyncException), lhsRollbackOnlyOnAsyncException, rhsRollbackOnlyOnAsyncException)) {
                return false;
            }
        }
        {
            BigInteger lhsSchedulePeriodForDestinationPurge;
            lhsSchedulePeriodForDestinationPurge = this.getSchedulePeriodForDestinationPurge();
            BigInteger rhsSchedulePeriodForDestinationPurge;
            rhsSchedulePeriodForDestinationPurge = that.getSchedulePeriodForDestinationPurge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedulePeriodForDestinationPurge", lhsSchedulePeriodForDestinationPurge), LocatorUtils.property(thatLocator, "schedulePeriodForDestinationPurge", rhsSchedulePeriodForDestinationPurge), lhsSchedulePeriodForDestinationPurge, rhsSchedulePeriodForDestinationPurge)) {
                return false;
            }
        }
        {
            BigInteger lhsSchedulePeriodForDiskUsageCheck;
            lhsSchedulePeriodForDiskUsageCheck = this.getSchedulePeriodForDiskUsageCheck();
            BigInteger rhsSchedulePeriodForDiskUsageCheck;
            rhsSchedulePeriodForDiskUsageCheck = that.getSchedulePeriodForDiskUsageCheck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedulePeriodForDiskUsageCheck", lhsSchedulePeriodForDiskUsageCheck), LocatorUtils.property(thatLocator, "schedulePeriodForDiskUsageCheck", rhsSchedulePeriodForDiskUsageCheck), lhsSchedulePeriodForDiskUsageCheck, rhsSchedulePeriodForDiskUsageCheck)) {
                return false;
            }
        }
        {
            String lhsSchedulerDirectory;
            lhsSchedulerDirectory = this.getSchedulerDirectory();
            String rhsSchedulerDirectory;
            rhsSchedulerDirectory = that.getSchedulerDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedulerDirectory", lhsSchedulerDirectory), LocatorUtils.property(thatLocator, "schedulerDirectory", rhsSchedulerDirectory), lhsSchedulerDirectory, rhsSchedulerDirectory)) {
                return false;
            }
        }
        {
            String lhsSchedulerDirectoryFile;
            lhsSchedulerDirectoryFile = this.getSchedulerDirectoryFile();
            String rhsSchedulerDirectoryFile;
            rhsSchedulerDirectoryFile = that.getSchedulerDirectoryFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedulerDirectoryFile", lhsSchedulerDirectoryFile), LocatorUtils.property(thatLocator, "schedulerDirectoryFile", rhsSchedulerDirectoryFile), lhsSchedulerDirectoryFile, rhsSchedulerDirectoryFile)) {
                return false;
            }
        }
        {
            String lhsSchedulerSupport;
            lhsSchedulerSupport = this.getSchedulerSupport();
            String rhsSchedulerSupport;
            rhsSchedulerSupport = that.getSchedulerSupport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedulerSupport", lhsSchedulerSupport), LocatorUtils.property(thatLocator, "schedulerSupport", rhsSchedulerSupport), lhsSchedulerSupport, rhsSchedulerSupport)) {
                return false;
            }
        }
        {
            Boolean lhsShutdownOnMasterFailure;
            lhsShutdownOnMasterFailure = this.isShutdownOnMasterFailure();
            Boolean rhsShutdownOnMasterFailure;
            rhsShutdownOnMasterFailure = that.isShutdownOnMasterFailure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shutdownOnMasterFailure", lhsShutdownOnMasterFailure), LocatorUtils.property(thatLocator, "shutdownOnMasterFailure", rhsShutdownOnMasterFailure), lhsShutdownOnMasterFailure, rhsShutdownOnMasterFailure)) {
                return false;
            }
        }
        {
            String lhsShutdownOnSlaveFailure;
            lhsShutdownOnSlaveFailure = this.getShutdownOnSlaveFailure();
            String rhsShutdownOnSlaveFailure;
            rhsShutdownOnSlaveFailure = that.getShutdownOnSlaveFailure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shutdownOnSlaveFailure", lhsShutdownOnSlaveFailure), LocatorUtils.property(thatLocator, "shutdownOnSlaveFailure", rhsShutdownOnSlaveFailure), lhsShutdownOnSlaveFailure, rhsShutdownOnSlaveFailure)) {
                return false;
            }
        }
        {
            Boolean lhsSplitSystemUsageForProducersConsumers;
            lhsSplitSystemUsageForProducersConsumers = this.isSplitSystemUsageForProducersConsumers();
            Boolean rhsSplitSystemUsageForProducersConsumers;
            rhsSplitSystemUsageForProducersConsumers = that.isSplitSystemUsageForProducersConsumers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "splitSystemUsageForProducersConsumers", lhsSplitSystemUsageForProducersConsumers), LocatorUtils.property(thatLocator, "splitSystemUsageForProducersConsumers", rhsSplitSystemUsageForProducersConsumers), lhsSplitSystemUsageForProducersConsumers, rhsSplitSystemUsageForProducersConsumers)) {
                return false;
            }
        }
        {
            String lhsSslContext;
            lhsSslContext = this.getSslContext();
            String rhsSslContext;
            rhsSslContext = that.getSslContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sslContext", lhsSslContext), LocatorUtils.property(thatLocator, "sslContext", rhsSslContext), lhsSslContext, rhsSslContext)) {
                return false;
            }
        }
        {
            Boolean lhsStart;
            lhsStart = this.isStart();
            Boolean rhsStart;
            rhsStart = that.isStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "start", lhsStart), LocatorUtils.property(thatLocator, "start", rhsStart), lhsStart, rhsStart)) {
                return false;
            }
        }
        {
            Boolean lhsStartAsync;
            lhsStartAsync = this.isStartAsync();
            Boolean rhsStartAsync;
            rhsStartAsync = that.isStartAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startAsync", lhsStartAsync), LocatorUtils.property(thatLocator, "startAsync", rhsStartAsync), lhsStartAsync, rhsStartAsync)) {
                return false;
            }
        }
        {
            String lhsStartException;
            lhsStartException = this.getStartException();
            String rhsStartException;
            rhsStartException = that.getStartException();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startException", lhsStartException), LocatorUtils.property(thatLocator, "startException", rhsStartException), lhsStartException, rhsStartException)) {
                return false;
            }
        }
        {
            BigInteger lhsStoreOpenWireVersion;
            lhsStoreOpenWireVersion = this.getStoreOpenWireVersion();
            BigInteger rhsStoreOpenWireVersion;
            rhsStoreOpenWireVersion = that.getStoreOpenWireVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "storeOpenWireVersion", lhsStoreOpenWireVersion), LocatorUtils.property(thatLocator, "storeOpenWireVersion", rhsStoreOpenWireVersion), lhsStoreOpenWireVersion, rhsStoreOpenWireVersion)) {
                return false;
            }
        }
        {
            String lhsSystemExitOnShutdown;
            lhsSystemExitOnShutdown = this.getSystemExitOnShutdown();
            String rhsSystemExitOnShutdown;
            rhsSystemExitOnShutdown = that.getSystemExitOnShutdown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "systemExitOnShutdown", lhsSystemExitOnShutdown), LocatorUtils.property(thatLocator, "systemExitOnShutdown", rhsSystemExitOnShutdown), lhsSystemExitOnShutdown, rhsSystemExitOnShutdown)) {
                return false;
            }
        }
        {
            BigInteger lhsSystemExitOnShutdownExitCode;
            lhsSystemExitOnShutdownExitCode = this.getSystemExitOnShutdownExitCode();
            BigInteger rhsSystemExitOnShutdownExitCode;
            rhsSystemExitOnShutdownExitCode = that.getSystemExitOnShutdownExitCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "systemExitOnShutdownExitCode", lhsSystemExitOnShutdownExitCode), LocatorUtils.property(thatLocator, "systemExitOnShutdownExitCode", rhsSystemExitOnShutdownExitCode), lhsSystemExitOnShutdownExitCode, rhsSystemExitOnShutdownExitCode)) {
                return false;
            }
        }
        {
            String lhsSystemUsage;
            lhsSystemUsage = this.getSystemUsage();
            String rhsSystemUsage;
            rhsSystemUsage = that.getSystemUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "systemUsage", lhsSystemUsage), LocatorUtils.property(thatLocator, "systemUsage", rhsSystemUsage), lhsSystemUsage, rhsSystemUsage)) {
                return false;
            }
        }
        {
            String lhsTaskRunnerFactory;
            lhsTaskRunnerFactory = this.getTaskRunnerFactory();
            String rhsTaskRunnerFactory;
            rhsTaskRunnerFactory = that.getTaskRunnerFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taskRunnerFactory", lhsTaskRunnerFactory), LocatorUtils.property(thatLocator, "taskRunnerFactory", rhsTaskRunnerFactory), lhsTaskRunnerFactory, rhsTaskRunnerFactory)) {
                return false;
            }
        }
        {
            BigInteger lhsTaskRunnerPriority;
            lhsTaskRunnerPriority = this.getTaskRunnerPriority();
            BigInteger rhsTaskRunnerPriority;
            rhsTaskRunnerPriority = that.getTaskRunnerPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taskRunnerPriority", lhsTaskRunnerPriority), LocatorUtils.property(thatLocator, "taskRunnerPriority", rhsTaskRunnerPriority), lhsTaskRunnerPriority, rhsTaskRunnerPriority)) {
                return false;
            }
        }
        {
            String lhsTempDataStore;
            lhsTempDataStore = this.getTempDataStore();
            String rhsTempDataStore;
            rhsTempDataStore = that.getTempDataStore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempDataStore", lhsTempDataStore), LocatorUtils.property(thatLocator, "tempDataStore", rhsTempDataStore), lhsTempDataStore, rhsTempDataStore)) {
                return false;
            }
        }
        {
            BigInteger lhsTimeBeforePurgeTempDestinations;
            lhsTimeBeforePurgeTempDestinations = this.getTimeBeforePurgeTempDestinations();
            BigInteger rhsTimeBeforePurgeTempDestinations;
            rhsTimeBeforePurgeTempDestinations = that.getTimeBeforePurgeTempDestinations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeBeforePurgeTempDestinations", lhsTimeBeforePurgeTempDestinations), LocatorUtils.property(thatLocator, "timeBeforePurgeTempDestinations", rhsTimeBeforePurgeTempDestinations), lhsTimeBeforePurgeTempDestinations, rhsTimeBeforePurgeTempDestinations)) {
                return false;
            }
        }
        {
            String lhsTmpDataDirectory;
            lhsTmpDataDirectory = this.getTmpDataDirectory();
            String rhsTmpDataDirectory;
            rhsTmpDataDirectory = that.getTmpDataDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tmpDataDirectory", lhsTmpDataDirectory), LocatorUtils.property(thatLocator, "tmpDataDirectory", rhsTmpDataDirectory), lhsTmpDataDirectory, rhsTmpDataDirectory)) {
                return false;
            }
        }
        {
            Boolean lhsUseAuthenticatedPrincipalForJMSXUserID;
            lhsUseAuthenticatedPrincipalForJMSXUserID = this.isUseAuthenticatedPrincipalForJMSXUserID();
            Boolean rhsUseAuthenticatedPrincipalForJMSXUserID;
            rhsUseAuthenticatedPrincipalForJMSXUserID = that.isUseAuthenticatedPrincipalForJMSXUserID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useAuthenticatedPrincipalForJMSXUserID", lhsUseAuthenticatedPrincipalForJMSXUserID), LocatorUtils.property(thatLocator, "useAuthenticatedPrincipalForJMSXUserID", rhsUseAuthenticatedPrincipalForJMSXUserID), lhsUseAuthenticatedPrincipalForJMSXUserID, rhsUseAuthenticatedPrincipalForJMSXUserID)) {
                return false;
            }
        }
        {
            String lhsUseJmx;
            lhsUseJmx = this.getUseJmx();
            String rhsUseJmx;
            rhsUseJmx = that.getUseJmx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useJmx", lhsUseJmx), LocatorUtils.property(thatLocator, "useJmx", rhsUseJmx), lhsUseJmx, rhsUseJmx)) {
                return false;
            }
        }
        {
            Boolean lhsUseLocalHostBrokerName;
            lhsUseLocalHostBrokerName = this.isUseLocalHostBrokerName();
            Boolean rhsUseLocalHostBrokerName;
            rhsUseLocalHostBrokerName = that.isUseLocalHostBrokerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useLocalHostBrokerName", lhsUseLocalHostBrokerName), LocatorUtils.property(thatLocator, "useLocalHostBrokerName", rhsUseLocalHostBrokerName), lhsUseLocalHostBrokerName, rhsUseLocalHostBrokerName)) {
                return false;
            }
        }
        {
            Boolean lhsUseLoggingForShutdownErrors;
            lhsUseLoggingForShutdownErrors = this.isUseLoggingForShutdownErrors();
            Boolean rhsUseLoggingForShutdownErrors;
            rhsUseLoggingForShutdownErrors = that.isUseLoggingForShutdownErrors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useLoggingForShutdownErrors", lhsUseLoggingForShutdownErrors), LocatorUtils.property(thatLocator, "useLoggingForShutdownErrors", rhsUseLoggingForShutdownErrors), lhsUseLoggingForShutdownErrors, rhsUseLoggingForShutdownErrors)) {
                return false;
            }
        }
        {
            Boolean lhsUseMirroredQueues;
            lhsUseMirroredQueues = this.isUseMirroredQueues();
            Boolean rhsUseMirroredQueues;
            rhsUseMirroredQueues = that.isUseMirroredQueues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useMirroredQueues", lhsUseMirroredQueues), LocatorUtils.property(thatLocator, "useMirroredQueues", rhsUseMirroredQueues), lhsUseMirroredQueues, rhsUseMirroredQueues)) {
                return false;
            }
        }
        {
            Boolean lhsUseShutdownHook;
            lhsUseShutdownHook = this.isUseShutdownHook();
            Boolean rhsUseShutdownHook;
            rhsUseShutdownHook = that.isUseShutdownHook();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useShutdownHook", lhsUseShutdownHook), LocatorUtils.property(thatLocator, "useShutdownHook", rhsUseShutdownHook), lhsUseShutdownHook, rhsUseShutdownHook)) {
                return false;
            }
        }
        {
            Boolean lhsUseTempMirroredQueues;
            lhsUseTempMirroredQueues = this.isUseTempMirroredQueues();
            Boolean rhsUseTempMirroredQueues;
            rhsUseTempMirroredQueues = that.isUseTempMirroredQueues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useTempMirroredQueues", lhsUseTempMirroredQueues), LocatorUtils.property(thatLocator, "useTempMirroredQueues", rhsUseTempMirroredQueues), lhsUseTempMirroredQueues, rhsUseTempMirroredQueues)) {
                return false;
            }
        }
        {
            Boolean lhsUseVirtualDestSubs;
            lhsUseVirtualDestSubs = this.isUseVirtualDestSubs();
            Boolean rhsUseVirtualDestSubs;
            rhsUseVirtualDestSubs = that.isUseVirtualDestSubs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useVirtualDestSubs", lhsUseVirtualDestSubs), LocatorUtils.property(thatLocator, "useVirtualDestSubs", rhsUseVirtualDestSubs), lhsUseVirtualDestSubs, rhsUseVirtualDestSubs)) {
                return false;
            }
        }
        {
            Boolean lhsUseVirtualDestSubsOnCreation;
            lhsUseVirtualDestSubsOnCreation = this.isUseVirtualDestSubsOnCreation();
            Boolean rhsUseVirtualDestSubsOnCreation;
            rhsUseVirtualDestSubsOnCreation = that.isUseVirtualDestSubsOnCreation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useVirtualDestSubsOnCreation", lhsUseVirtualDestSubsOnCreation), LocatorUtils.property(thatLocator, "useVirtualDestSubsOnCreation", rhsUseVirtualDestSubsOnCreation), lhsUseVirtualDestSubsOnCreation, rhsUseVirtualDestSubsOnCreation)) {
                return false;
            }
        }
        {
            Boolean lhsUseVirtualTopics;
            lhsUseVirtualTopics = this.isUseVirtualTopics();
            Boolean rhsUseVirtualTopics;
            rhsUseVirtualTopics = that.isUseVirtualTopics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useVirtualTopics", lhsUseVirtualTopics), LocatorUtils.property(thatLocator, "useVirtualTopics", rhsUseVirtualTopics), lhsUseVirtualTopics, rhsUseVirtualTopics)) {
                return false;
            }
        }
        {
            String lhsVmConnectorURI;
            lhsVmConnectorURI = this.getVmConnectorURI();
            String rhsVmConnectorURI;
            rhsVmConnectorURI = that.getVmConnectorURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vmConnectorURI", lhsVmConnectorURI), LocatorUtils.property(thatLocator, "vmConnectorURI", rhsVmConnectorURI), lhsVmConnectorURI, rhsVmConnectorURI)) {
                return false;
            }
        }
        {
            String lhsWaitForSlave;
            lhsWaitForSlave = this.getWaitForSlave();
            String rhsWaitForSlave;
            rhsWaitForSlave = that.getWaitForSlave();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waitForSlave", lhsWaitForSlave), LocatorUtils.property(thatLocator, "waitForSlave", rhsWaitForSlave), lhsWaitForSlave, rhsWaitForSlave)) {
                return false;
            }
        }
        {
            Long lhsWaitForSlaveTimeout;
            lhsWaitForSlaveTimeout = this.getWaitForSlaveTimeout();
            Long rhsWaitForSlaveTimeout;
            rhsWaitForSlaveTimeout = that.getWaitForSlaveTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waitForSlaveTimeout", lhsWaitForSlaveTimeout), LocatorUtils.property(thatLocator, "waitForSlaveTimeout", rhsWaitForSlaveTimeout), lhsWaitForSlaveTimeout, rhsWaitForSlaveTimeout)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
        return equals(null, null, object, strategy);
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AdminView
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.AdminView)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.AdminView that = ((DtoBroker.AdminView) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class BrokerContext
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.BrokerContext)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.BrokerContext that = ((DtoBroker.BrokerContext) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "systemUsage",
        "any"
    })
    public static class ConsumerSystemUsage
        implements Equals, HashCode, ToString
    {

        protected DtoSystemUsage systemUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡsystemUsage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoSystemUsage }
         *     
         */
        public DtoSystemUsage getSystemUsage() {
            return systemUsage;
        }

        /**
         * ����systemUsage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSystemUsage }
         *     
         */
        public void setSystemUsage(DtoSystemUsage value) {
            this.systemUsage = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                strategy.appendField(locator, this, "systemUsage", buffer, theSystemUsage);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemUsage", theSystemUsage), currentHashCode, theSystemUsage);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.ConsumerSystemUsage)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.ConsumerSystemUsage that = ((DtoBroker.ConsumerSystemUsage) object);
            {
                DtoSystemUsage lhsSystemUsage;
                lhsSystemUsage = this.getSystemUsage();
                DtoSystemUsage rhsSystemUsage;
                rhsSystemUsage = that.getSystemUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "systemUsage", lhsSystemUsage), LocatorUtils.property(thatLocator, "systemUsage", rhsSystemUsage), lhsSystemUsage, rhsSystemUsage)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class DestinationFactory
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.DestinationFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.DestinationFactory that = ((DtoBroker.DestinationFactory) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mirroredQueue"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}virtualDestinationInterceptor"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contents"
    })
    public static class DestinationInterceptors
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "virtualDestinationInterceptor", namespace = "http://activemq.apache.org/schema/core", type = DtoVirtualDestinationInterceptor.class, required = false),
            @XmlElementRef(name = "mirroredQueue", namespace = "http://activemq.apache.org/schema/core", type = DtoMirroredQueue.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> contents;

        /**
         * Gets the value of the contents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContents().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoVirtualDestinationInterceptor }
         * {@link DtoMirroredQueue }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getContents() {
            if (contents == null) {
                contents = new ArrayList<Object>();
            }
            return this.contents;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                strategy.appendField(locator, this, "contents", buffer, theContents);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.DestinationInterceptors)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.DestinationInterceptors that = ((DtoBroker.DestinationInterceptors) object);
            {
                List<Object> lhsContents;
                lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                List<Object> rhsContents;
                rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}policyMap"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contents"
    })
    public static class DestinationPolicy
        implements Equals, HashCode, ToString
    {

        @XmlElementRef(name = "policyMap", namespace = "http://activemq.apache.org/schema/core", type = DtoPolicyMap.class, required = false)
        @XmlAnyElement(lax = true)
        protected Object contents;

        /**
         * ��ȡcontents���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link DtoPolicyMap }
         *     
         */
        public Object getContents() {
            return contents;
        }

        /**
         * ����contents���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link DtoPolicyMap }
         *     
         */
        public void setContents(Object value) {
            this.contents = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                Object theContents;
                theContents = this.getContents();
                strategy.appendField(locator, this, "contents", buffer, theContents);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                Object theContents;
                theContents = this.getContents();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.DestinationPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.DestinationPolicy that = ((DtoBroker.DestinationPolicy) object);
            {
                Object lhsContents;
                lhsContents = this.getContents();
                Object rhsContents;
                rhsContents = that.getContents();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}queue"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempQueue"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempTopic"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contents"
    })
    public static class Destinations
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "queue", namespace = "http://activemq.apache.org/schema/core", type = DtoQueue.class, required = false),
            @XmlElementRef(name = "tempTopic", namespace = "http://activemq.apache.org/schema/core", type = DtoTempTopic.class, required = false),
            @XmlElementRef(name = "tempQueue", namespace = "http://activemq.apache.org/schema/core", type = DtoTempQueue.class, required = false),
            @XmlElementRef(name = "topic", namespace = "http://activemq.apache.org/schema/core", type = DtoTopic.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> contents;

        /**
         * Gets the value of the contents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContents().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoTempQueue }
         * {@link DtoTopic }
         * {@link Object }
         * {@link DtoQueue }
         * {@link DtoTempTopic }
         * 
         * 
         */
        public List<Object> getContents() {
            if (contents == null) {
                contents = new ArrayList<Object>();
            }
            return this.contents;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                strategy.appendField(locator, this, "contents", buffer, theContents);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.Destinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.Destinations that = ((DtoBroker.Destinations) object);
            {
                List<Object> lhsContents;
                lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                List<Object> rhsContents;
                rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}defaultIOExceptionHandler"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jDBCIOExceptionHandler"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}leaseLockerIOExceptionHandler"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultIOExceptionHandler",
        "jdbcioExceptionHandler",
        "leaseLockerIOExceptionHandler",
        "any"
    })
    public static class IoExceptionHandler
        implements Equals, HashCode, ToString
    {

        protected DtoDefaultIOExceptionHandler defaultIOExceptionHandler;
        @XmlElement(name = "jDBCIOExceptionHandler")
        protected DtoJDBCIOExceptionHandler jdbcioExceptionHandler;
        protected DtoLeaseLockerIOExceptionHandler leaseLockerIOExceptionHandler;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡdefaultIOExceptionHandler���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoDefaultIOExceptionHandler }
         *     
         */
        public DtoDefaultIOExceptionHandler getDefaultIOExceptionHandler() {
            return defaultIOExceptionHandler;
        }

        /**
         * ����defaultIOExceptionHandler���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDefaultIOExceptionHandler }
         *     
         */
        public void setDefaultIOExceptionHandler(DtoDefaultIOExceptionHandler value) {
            this.defaultIOExceptionHandler = value;
        }

        /**
         * ��ȡjdbcioExceptionHandler���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJDBCIOExceptionHandler }
         *     
         */
        public DtoJDBCIOExceptionHandler getJDBCIOExceptionHandler() {
            return jdbcioExceptionHandler;
        }

        /**
         * ����jdbcioExceptionHandler���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJDBCIOExceptionHandler }
         *     
         */
        public void setJDBCIOExceptionHandler(DtoJDBCIOExceptionHandler value) {
            this.jdbcioExceptionHandler = value;
        }

        /**
         * ��ȡleaseLockerIOExceptionHandler���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoLeaseLockerIOExceptionHandler }
         *     
         */
        public DtoLeaseLockerIOExceptionHandler getLeaseLockerIOExceptionHandler() {
            return leaseLockerIOExceptionHandler;
        }

        /**
         * ����leaseLockerIOExceptionHandler���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLeaseLockerIOExceptionHandler }
         *     
         */
        public void setLeaseLockerIOExceptionHandler(DtoLeaseLockerIOExceptionHandler value) {
            this.leaseLockerIOExceptionHandler = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoDefaultIOExceptionHandler theDefaultIOExceptionHandler;
                theDefaultIOExceptionHandler = this.getDefaultIOExceptionHandler();
                strategy.appendField(locator, this, "defaultIOExceptionHandler", buffer, theDefaultIOExceptionHandler);
            }
            {
                DtoJDBCIOExceptionHandler theJDBCIOExceptionHandler;
                theJDBCIOExceptionHandler = this.getJDBCIOExceptionHandler();
                strategy.appendField(locator, this, "jdbcioExceptionHandler", buffer, theJDBCIOExceptionHandler);
            }
            {
                DtoLeaseLockerIOExceptionHandler theLeaseLockerIOExceptionHandler;
                theLeaseLockerIOExceptionHandler = this.getLeaseLockerIOExceptionHandler();
                strategy.appendField(locator, this, "leaseLockerIOExceptionHandler", buffer, theLeaseLockerIOExceptionHandler);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoDefaultIOExceptionHandler theDefaultIOExceptionHandler;
                theDefaultIOExceptionHandler = this.getDefaultIOExceptionHandler();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultIOExceptionHandler", theDefaultIOExceptionHandler), currentHashCode, theDefaultIOExceptionHandler);
            }
            {
                DtoJDBCIOExceptionHandler theJDBCIOExceptionHandler;
                theJDBCIOExceptionHandler = this.getJDBCIOExceptionHandler();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jdbcioExceptionHandler", theJDBCIOExceptionHandler), currentHashCode, theJDBCIOExceptionHandler);
            }
            {
                DtoLeaseLockerIOExceptionHandler theLeaseLockerIOExceptionHandler;
                theLeaseLockerIOExceptionHandler = this.getLeaseLockerIOExceptionHandler();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseLockerIOExceptionHandler", theLeaseLockerIOExceptionHandler), currentHashCode, theLeaseLockerIOExceptionHandler);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.IoExceptionHandler)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.IoExceptionHandler that = ((DtoBroker.IoExceptionHandler) object);
            {
                DtoDefaultIOExceptionHandler lhsDefaultIOExceptionHandler;
                lhsDefaultIOExceptionHandler = this.getDefaultIOExceptionHandler();
                DtoDefaultIOExceptionHandler rhsDefaultIOExceptionHandler;
                rhsDefaultIOExceptionHandler = that.getDefaultIOExceptionHandler();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultIOExceptionHandler", lhsDefaultIOExceptionHandler), LocatorUtils.property(thatLocator, "defaultIOExceptionHandler", rhsDefaultIOExceptionHandler), lhsDefaultIOExceptionHandler, rhsDefaultIOExceptionHandler)) {
                    return false;
                }
            }
            {
                DtoJDBCIOExceptionHandler lhsJDBCIOExceptionHandler;
                lhsJDBCIOExceptionHandler = this.getJDBCIOExceptionHandler();
                DtoJDBCIOExceptionHandler rhsJDBCIOExceptionHandler;
                rhsJDBCIOExceptionHandler = that.getJDBCIOExceptionHandler();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jdbcioExceptionHandler", lhsJDBCIOExceptionHandler), LocatorUtils.property(thatLocator, "jdbcioExceptionHandler", rhsJDBCIOExceptionHandler), lhsJDBCIOExceptionHandler, rhsJDBCIOExceptionHandler)) {
                    return false;
                }
            }
            {
                DtoLeaseLockerIOExceptionHandler lhsLeaseLockerIOExceptionHandler;
                lhsLeaseLockerIOExceptionHandler = this.getLeaseLockerIOExceptionHandler();
                DtoLeaseLockerIOExceptionHandler rhsLeaseLockerIOExceptionHandler;
                rhsLeaseLockerIOExceptionHandler = that.getLeaseLockerIOExceptionHandler();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseLockerIOExceptionHandler", lhsLeaseLockerIOExceptionHandler), LocatorUtils.property(thatLocator, "leaseLockerIOExceptionHandler", rhsLeaseLockerIOExceptionHandler), lhsLeaseLockerIOExceptionHandler, rhsLeaseLockerIOExceptionHandler)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jmsQueueConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jmsTopicConnector"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jmsQueueConnectorOrJmsTopicConnectorOrAny"
    })
    public static class JmsBridgeConnectors
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "jmsQueueConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoJmsQueueConnector.class, required = false),
            @XmlElementRef(name = "jmsTopicConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoJmsTopicConnector.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> jmsQueueConnectorOrJmsTopicConnectorOrAny;

        /**
         * Gets the value of the jmsQueueConnectorOrJmsTopicConnectorOrAny property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jmsQueueConnectorOrJmsTopicConnectorOrAny property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJmsQueueConnectorOrJmsTopicConnectorOrAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoJmsTopicConnector }
         * {@link DtoJmsQueueConnector }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getJmsQueueConnectorOrJmsTopicConnectorOrAny() {
            if (jmsQueueConnectorOrJmsTopicConnectorOrAny == null) {
                jmsQueueConnectorOrJmsTopicConnectorOrAny = new ArrayList<Object>();
            }
            return this.jmsQueueConnectorOrJmsTopicConnectorOrAny;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theJmsQueueConnectorOrJmsTopicConnectorOrAny;
                theJmsQueueConnectorOrJmsTopicConnectorOrAny = (((this.jmsQueueConnectorOrJmsTopicConnectorOrAny!= null)&&(!this.jmsQueueConnectorOrJmsTopicConnectorOrAny.isEmpty()))?this.getJmsQueueConnectorOrJmsTopicConnectorOrAny():null);
                strategy.appendField(locator, this, "jmsQueueConnectorOrJmsTopicConnectorOrAny", buffer, theJmsQueueConnectorOrJmsTopicConnectorOrAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theJmsQueueConnectorOrJmsTopicConnectorOrAny;
                theJmsQueueConnectorOrJmsTopicConnectorOrAny = (((this.jmsQueueConnectorOrJmsTopicConnectorOrAny!= null)&&(!this.jmsQueueConnectorOrJmsTopicConnectorOrAny.isEmpty()))?this.getJmsQueueConnectorOrJmsTopicConnectorOrAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsQueueConnectorOrJmsTopicConnectorOrAny", theJmsQueueConnectorOrJmsTopicConnectorOrAny), currentHashCode, theJmsQueueConnectorOrJmsTopicConnectorOrAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.JmsBridgeConnectors)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.JmsBridgeConnectors that = ((DtoBroker.JmsBridgeConnectors) object);
            {
                List<Object> lhsJmsQueueConnectorOrJmsTopicConnectorOrAny;
                lhsJmsQueueConnectorOrJmsTopicConnectorOrAny = (((this.jmsQueueConnectorOrJmsTopicConnectorOrAny!= null)&&(!this.jmsQueueConnectorOrJmsTopicConnectorOrAny.isEmpty()))?this.getJmsQueueConnectorOrJmsTopicConnectorOrAny():null);
                List<Object> rhsJmsQueueConnectorOrJmsTopicConnectorOrAny;
                rhsJmsQueueConnectorOrJmsTopicConnectorOrAny = (((that.jmsQueueConnectorOrJmsTopicConnectorOrAny!= null)&&(!that.jmsQueueConnectorOrJmsTopicConnectorOrAny.isEmpty()))?that.getJmsQueueConnectorOrJmsTopicConnectorOrAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsQueueConnectorOrJmsTopicConnectorOrAny", lhsJmsQueueConnectorOrJmsTopicConnectorOrAny), LocatorUtils.property(thatLocator, "jmsQueueConnectorOrJmsTopicConnectorOrAny", rhsJmsQueueConnectorOrJmsTopicConnectorOrAny), lhsJmsQueueConnectorOrJmsTopicConnectorOrAny, rhsJmsQueueConnectorOrJmsTopicConnectorOrAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class JobSchedulerStore
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.JobSchedulerStore)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.JobSchedulerStore that = ((DtoBroker.JobSchedulerStore) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}managementContext"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "managementContext",
        "any"
    })
    public static class ManagementContext
        implements Equals, HashCode, ToString
    {

        protected DtoManagementContext managementContext;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡmanagementContext���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoManagementContext }
         *     
         */
        public DtoManagementContext getManagementContext() {
            return managementContext;
        }

        /**
         * ����managementContext���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoManagementContext }
         *     
         */
        public void setManagementContext(DtoManagementContext value) {
            this.managementContext = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoManagementContext theManagementContext;
                theManagementContext = this.getManagementContext();
                strategy.appendField(locator, this, "managementContext", buffer, theManagementContext);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoManagementContext theManagementContext;
                theManagementContext = this.getManagementContext();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "managementContext", theManagementContext), currentHashCode, theManagementContext);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.ManagementContext)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.ManagementContext that = ((DtoBroker.ManagementContext) object);
            {
                DtoManagementContext lhsManagementContext;
                lhsManagementContext = this.getManagementContext();
                DtoManagementContext rhsManagementContext;
                rhsManagementContext = that.getManagementContext();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "managementContext", lhsManagementContext), LocatorUtils.property(thatLocator, "managementContext", rhsManagementContext), lhsManagementContext, rhsManagementContext)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class MessageAuthorizationPolicy
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.MessageAuthorizationPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.MessageAuthorizationPolicy that = ((DtoBroker.MessageAuthorizationPolicy) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class NetworkConnectorURIs
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.NetworkConnectorURIs)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.NetworkConnectorURIs that = ((DtoBroker.NetworkConnectorURIs) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}ldapNetworkConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}multicastNetworkConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}networkConnector"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contents"
    })
    public static class NetworkConnectors
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "ldapNetworkConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoLdapNetworkConnector.class, required = false),
            @XmlElementRef(name = "networkConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoNetworkConnector.class, required = false),
            @XmlElementRef(name = "multicastNetworkConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoMulticastNetworkConnector.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> contents;

        /**
         * Gets the value of the contents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContents().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoNetworkConnector }
         * {@link Object }
         * {@link DtoMulticastNetworkConnector }
         * {@link DtoLdapNetworkConnector }
         * 
         * 
         */
        public List<Object> getContents() {
            if (contents == null) {
                contents = new ArrayList<Object>();
            }
            return this.contents;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                strategy.appendField(locator, this, "contents", buffer, theContents);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.NetworkConnectors)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.NetworkConnectors that = ((DtoBroker.NetworkConnectors) object);
            {
                List<Object> lhsContents;
                lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                List<Object> rhsContents;
                rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}memoryPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jdbcPersistenceAdapter",
        "journalPersistenceAdapter",
        "kahaDB",
        "levelDB",
        "mKahaDB",
        "memoryPersistenceAdapter",
        "replicatedLevelDB",
        "any"
    })
    public static class PersistenceAdapter
        implements Equals, HashCode, ToString
    {

        protected DtoJdbcPersistenceAdapter jdbcPersistenceAdapter;
        protected DtoJournalPersistenceAdapter journalPersistenceAdapter;
        protected DtoKahaDB kahaDB;
        protected DtoLevelDB levelDB;
        protected DtoMKahaDB mKahaDB;
        protected DtoMemoryPersistenceAdapter memoryPersistenceAdapter;
        protected DtoReplicatedLevelDB replicatedLevelDB;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡjdbcPersistenceAdapter���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJdbcPersistenceAdapter }
         *     
         */
        public DtoJdbcPersistenceAdapter getJdbcPersistenceAdapter() {
            return jdbcPersistenceAdapter;
        }

        /**
         * ����jdbcPersistenceAdapter���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJdbcPersistenceAdapter }
         *     
         */
        public void setJdbcPersistenceAdapter(DtoJdbcPersistenceAdapter value) {
            this.jdbcPersistenceAdapter = value;
        }

        /**
         * ��ȡjournalPersistenceAdapter���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJournalPersistenceAdapter }
         *     
         */
        public DtoJournalPersistenceAdapter getJournalPersistenceAdapter() {
            return journalPersistenceAdapter;
        }

        /**
         * ����journalPersistenceAdapter���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournalPersistenceAdapter }
         *     
         */
        public void setJournalPersistenceAdapter(DtoJournalPersistenceAdapter value) {
            this.journalPersistenceAdapter = value;
        }

        /**
         * ��ȡkahaDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoKahaDB }
         *     
         */
        public DtoKahaDB getKahaDB() {
            return kahaDB;
        }

        /**
         * ����kahaDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoKahaDB }
         *     
         */
        public void setKahaDB(DtoKahaDB value) {
            this.kahaDB = value;
        }

        /**
         * ��ȡlevelDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoLevelDB }
         *     
         */
        public DtoLevelDB getLevelDB() {
            return levelDB;
        }

        /**
         * ����levelDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLevelDB }
         *     
         */
        public void setLevelDB(DtoLevelDB value) {
            this.levelDB = value;
        }

        /**
         * ��ȡmKahaDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoMKahaDB }
         *     
         */
        public DtoMKahaDB getMKahaDB() {
            return mKahaDB;
        }

        /**
         * ����mKahaDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMKahaDB }
         *     
         */
        public void setMKahaDB(DtoMKahaDB value) {
            this.mKahaDB = value;
        }

        /**
         * ��ȡmemoryPersistenceAdapter���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoMemoryPersistenceAdapter }
         *     
         */
        public DtoMemoryPersistenceAdapter getMemoryPersistenceAdapter() {
            return memoryPersistenceAdapter;
        }

        /**
         * ����memoryPersistenceAdapter���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMemoryPersistenceAdapter }
         *     
         */
        public void setMemoryPersistenceAdapter(DtoMemoryPersistenceAdapter value) {
            this.memoryPersistenceAdapter = value;
        }

        /**
         * ��ȡreplicatedLevelDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public DtoReplicatedLevelDB getReplicatedLevelDB() {
            return replicatedLevelDB;
        }

        /**
         * ����replicatedLevelDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public void setReplicatedLevelDB(DtoReplicatedLevelDB value) {
            this.replicatedLevelDB = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoJdbcPersistenceAdapter theJdbcPersistenceAdapter;
                theJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                strategy.appendField(locator, this, "jdbcPersistenceAdapter", buffer, theJdbcPersistenceAdapter);
            }
            {
                DtoJournalPersistenceAdapter theJournalPersistenceAdapter;
                theJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                strategy.appendField(locator, this, "journalPersistenceAdapter", buffer, theJournalPersistenceAdapter);
            }
            {
                DtoKahaDB theKahaDB;
                theKahaDB = this.getKahaDB();
                strategy.appendField(locator, this, "kahaDB", buffer, theKahaDB);
            }
            {
                DtoLevelDB theLevelDB;
                theLevelDB = this.getLevelDB();
                strategy.appendField(locator, this, "levelDB", buffer, theLevelDB);
            }
            {
                DtoMKahaDB theMKahaDB;
                theMKahaDB = this.getMKahaDB();
                strategy.appendField(locator, this, "mKahaDB", buffer, theMKahaDB);
            }
            {
                DtoMemoryPersistenceAdapter theMemoryPersistenceAdapter;
                theMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                strategy.appendField(locator, this, "memoryPersistenceAdapter", buffer, theMemoryPersistenceAdapter);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                strategy.appendField(locator, this, "replicatedLevelDB", buffer, theReplicatedLevelDB);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoJdbcPersistenceAdapter theJdbcPersistenceAdapter;
                theJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jdbcPersistenceAdapter", theJdbcPersistenceAdapter), currentHashCode, theJdbcPersistenceAdapter);
            }
            {
                DtoJournalPersistenceAdapter theJournalPersistenceAdapter;
                theJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalPersistenceAdapter", theJournalPersistenceAdapter), currentHashCode, theJournalPersistenceAdapter);
            }
            {
                DtoKahaDB theKahaDB;
                theKahaDB = this.getKahaDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kahaDB", theKahaDB), currentHashCode, theKahaDB);
            }
            {
                DtoLevelDB theLevelDB;
                theLevelDB = this.getLevelDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "levelDB", theLevelDB), currentHashCode, theLevelDB);
            }
            {
                DtoMKahaDB theMKahaDB;
                theMKahaDB = this.getMKahaDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mKahaDB", theMKahaDB), currentHashCode, theMKahaDB);
            }
            {
                DtoMemoryPersistenceAdapter theMemoryPersistenceAdapter;
                theMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memoryPersistenceAdapter", theMemoryPersistenceAdapter), currentHashCode, theMemoryPersistenceAdapter);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replicatedLevelDB", theReplicatedLevelDB), currentHashCode, theReplicatedLevelDB);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.PersistenceAdapter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.PersistenceAdapter that = ((DtoBroker.PersistenceAdapter) object);
            {
                DtoJdbcPersistenceAdapter lhsJdbcPersistenceAdapter;
                lhsJdbcPersistenceAdapter = this.getJdbcPersistenceAdapter();
                DtoJdbcPersistenceAdapter rhsJdbcPersistenceAdapter;
                rhsJdbcPersistenceAdapter = that.getJdbcPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jdbcPersistenceAdapter", lhsJdbcPersistenceAdapter), LocatorUtils.property(thatLocator, "jdbcPersistenceAdapter", rhsJdbcPersistenceAdapter), lhsJdbcPersistenceAdapter, rhsJdbcPersistenceAdapter)) {
                    return false;
                }
            }
            {
                DtoJournalPersistenceAdapter lhsJournalPersistenceAdapter;
                lhsJournalPersistenceAdapter = this.getJournalPersistenceAdapter();
                DtoJournalPersistenceAdapter rhsJournalPersistenceAdapter;
                rhsJournalPersistenceAdapter = that.getJournalPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journalPersistenceAdapter", lhsJournalPersistenceAdapter), LocatorUtils.property(thatLocator, "journalPersistenceAdapter", rhsJournalPersistenceAdapter), lhsJournalPersistenceAdapter, rhsJournalPersistenceAdapter)) {
                    return false;
                }
            }
            {
                DtoKahaDB lhsKahaDB;
                lhsKahaDB = this.getKahaDB();
                DtoKahaDB rhsKahaDB;
                rhsKahaDB = that.getKahaDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kahaDB", lhsKahaDB), LocatorUtils.property(thatLocator, "kahaDB", rhsKahaDB), lhsKahaDB, rhsKahaDB)) {
                    return false;
                }
            }
            {
                DtoLevelDB lhsLevelDB;
                lhsLevelDB = this.getLevelDB();
                DtoLevelDB rhsLevelDB;
                rhsLevelDB = that.getLevelDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "levelDB", lhsLevelDB), LocatorUtils.property(thatLocator, "levelDB", rhsLevelDB), lhsLevelDB, rhsLevelDB)) {
                    return false;
                }
            }
            {
                DtoMKahaDB lhsMKahaDB;
                lhsMKahaDB = this.getMKahaDB();
                DtoMKahaDB rhsMKahaDB;
                rhsMKahaDB = that.getMKahaDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mKahaDB", lhsMKahaDB), LocatorUtils.property(thatLocator, "mKahaDB", rhsMKahaDB), lhsMKahaDB, rhsMKahaDB)) {
                    return false;
                }
            }
            {
                DtoMemoryPersistenceAdapter lhsMemoryPersistenceAdapter;
                lhsMemoryPersistenceAdapter = this.getMemoryPersistenceAdapter();
                DtoMemoryPersistenceAdapter rhsMemoryPersistenceAdapter;
                rhsMemoryPersistenceAdapter = that.getMemoryPersistenceAdapter();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "memoryPersistenceAdapter", lhsMemoryPersistenceAdapter), LocatorUtils.property(thatLocator, "memoryPersistenceAdapter", rhsMemoryPersistenceAdapter), lhsMemoryPersistenceAdapter, rhsMemoryPersistenceAdapter)) {
                    return false;
                }
            }
            {
                DtoReplicatedLevelDB lhsReplicatedLevelDB;
                lhsReplicatedLevelDB = this.getReplicatedLevelDB();
                DtoReplicatedLevelDB rhsReplicatedLevelDB;
                rhsReplicatedLevelDB = that.getReplicatedLevelDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "replicatedLevelDB", lhsReplicatedLevelDB), LocatorUtils.property(thatLocator, "replicatedLevelDB", rhsReplicatedLevelDB), lhsReplicatedLevelDB, rhsReplicatedLevelDB)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "journalPersistenceAdapterFactory",
        "journaledJDBC",
        "any"
    })
    public static class PersistenceFactory
        implements Equals, HashCode, ToString
    {

        protected DtoJournalPersistenceAdapterFactory journalPersistenceAdapterFactory;
        protected DtoJournaledJDBC journaledJDBC;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡjournalPersistenceAdapterFactory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJournalPersistenceAdapterFactory }
         *     
         */
        public DtoJournalPersistenceAdapterFactory getJournalPersistenceAdapterFactory() {
            return journalPersistenceAdapterFactory;
        }

        /**
         * ����journalPersistenceAdapterFactory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournalPersistenceAdapterFactory }
         *     
         */
        public void setJournalPersistenceAdapterFactory(DtoJournalPersistenceAdapterFactory value) {
            this.journalPersistenceAdapterFactory = value;
        }

        /**
         * ��ȡjournaledJDBC���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJournaledJDBC }
         *     
         */
        public DtoJournaledJDBC getJournaledJDBC() {
            return journaledJDBC;
        }

        /**
         * ����journaledJDBC���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournaledJDBC }
         *     
         */
        public void setJournaledJDBC(DtoJournaledJDBC value) {
            this.journaledJDBC = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoJournalPersistenceAdapterFactory theJournalPersistenceAdapterFactory;
                theJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                strategy.appendField(locator, this, "journalPersistenceAdapterFactory", buffer, theJournalPersistenceAdapterFactory);
            }
            {
                DtoJournaledJDBC theJournaledJDBC;
                theJournaledJDBC = this.getJournaledJDBC();
                strategy.appendField(locator, this, "journaledJDBC", buffer, theJournaledJDBC);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoJournalPersistenceAdapterFactory theJournalPersistenceAdapterFactory;
                theJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalPersistenceAdapterFactory", theJournalPersistenceAdapterFactory), currentHashCode, theJournalPersistenceAdapterFactory);
            }
            {
                DtoJournaledJDBC theJournaledJDBC;
                theJournaledJDBC = this.getJournaledJDBC();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journaledJDBC", theJournaledJDBC), currentHashCode, theJournaledJDBC);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.PersistenceFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.PersistenceFactory that = ((DtoBroker.PersistenceFactory) object);
            {
                DtoJournalPersistenceAdapterFactory lhsJournalPersistenceAdapterFactory;
                lhsJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                DtoJournalPersistenceAdapterFactory rhsJournalPersistenceAdapterFactory;
                rhsJournalPersistenceAdapterFactory = that.getJournalPersistenceAdapterFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journalPersistenceAdapterFactory", lhsJournalPersistenceAdapterFactory), LocatorUtils.property(thatLocator, "journalPersistenceAdapterFactory", rhsJournalPersistenceAdapterFactory), lhsJournalPersistenceAdapterFactory, rhsJournalPersistenceAdapterFactory)) {
                    return false;
                }
            }
            {
                DtoJournaledJDBC lhsJournaledJDBC;
                lhsJournaledJDBC = this.getJournaledJDBC();
                DtoJournaledJDBC rhsJournaledJDBC;
                rhsJournaledJDBC = that.getJournaledJDBC();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journaledJDBC", lhsJournaledJDBC), LocatorUtils.property(thatLocator, "journaledJDBC", rhsJournaledJDBC), lhsJournaledJDBC, rhsJournaledJDBC)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taskRunnerFactory",
        "any"
    })
    public static class PersistenceTaskRunnerFactory
        implements Equals, HashCode, ToString
    {

        protected DtoTaskRunnerFactory taskRunnerFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡtaskRunnerFactory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public DtoTaskRunnerFactory getTaskRunnerFactory() {
            return taskRunnerFactory;
        }

        /**
         * ����taskRunnerFactory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public void setTaskRunnerFactory(DtoTaskRunnerFactory value) {
            this.taskRunnerFactory = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                strategy.appendField(locator, this, "taskRunnerFactory", buffer, theTaskRunnerFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerFactory", theTaskRunnerFactory), currentHashCode, theTaskRunnerFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.PersistenceTaskRunnerFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.PersistenceTaskRunnerFactory that = ((DtoBroker.PersistenceTaskRunnerFactory) object);
            {
                DtoTaskRunnerFactory lhsTaskRunnerFactory;
                lhsTaskRunnerFactory = this.getTaskRunnerFactory();
                DtoTaskRunnerFactory rhsTaskRunnerFactory;
                rhsTaskRunnerFactory = that.getTaskRunnerFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "taskRunnerFactory", lhsTaskRunnerFactory), LocatorUtils.property(thatLocator, "taskRunnerFactory", rhsTaskRunnerFactory), lhsTaskRunnerFactory, rhsTaskRunnerFactory)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}authorizationPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}camelRoutesBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}connectionDotFilePlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationDotFilePlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}discardingDLQBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jaasAuthenticationPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jaasCertificateAuthenticationPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jaasDualAuthenticationPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}partitionBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}runtimeConfigurationPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}simpleAuthenticationPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}statisticsBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}virtualSelectorCacheBrokerPlugin"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contents"
    })
    public static class Plugins
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "multicastTraceBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoMulticastTraceBrokerPlugin.class, required = false),
            @XmlElementRef(name = "destinationDotFilePlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoDestinationDotFilePlugin.class, required = false),
            @XmlElementRef(name = "statisticsBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoStatisticsBrokerPlugin.class, required = false),
            @XmlElementRef(name = "destinationsPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoDestinationsPlugin.class, required = false),
            @XmlElementRef(name = "timeStampingBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoTimeStampingBrokerPlugin.class, required = false),
            @XmlElementRef(name = "loggingBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoLoggingBrokerPlugin.class, required = false),
            @XmlElementRef(name = "simpleAuthenticationPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoSimpleAuthenticationPlugin.class, required = false),
            @XmlElementRef(name = "jaasDualAuthenticationPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoJaasDualAuthenticationPlugin.class, required = false),
            @XmlElementRef(name = "jaasAuthenticationPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoJaasAuthenticationPlugin.class, required = false),
            @XmlElementRef(name = "jaasCertificateAuthenticationPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoJaasCertificateAuthenticationPlugin.class, required = false),
            @XmlElementRef(name = "camelRoutesBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoCamelRoutesBrokerPlugin.class, required = false),
            @XmlElementRef(name = "connectionDotFilePlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoConnectionDotFilePlugin.class, required = false),
            @XmlElementRef(name = "destinationPathSeparatorPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoDestinationPathSeparatorPlugin.class, required = false),
            @XmlElementRef(name = "authorizationPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoAuthorizationPlugin.class, required = false),
            @XmlElementRef(name = "discardingDLQBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoDiscardingDLQBrokerPlugin.class, required = false),
            @XmlElementRef(name = "traceBrokerPathPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoTraceBrokerPathPlugin.class, required = false),
            @XmlElementRef(name = "runtimeConfigurationPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoRuntimeConfigurationPlugin.class, required = false),
            @XmlElementRef(name = "redeliveryPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoRedeliveryPlugin.class, required = false),
            @XmlElementRef(name = "udpTraceBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoUdpTraceBrokerPlugin.class, required = false),
            @XmlElementRef(name = "partitionBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoPartitionBrokerPlugin.class, required = false),
            @XmlElementRef(name = "virtualSelectorCacheBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoVirtualSelectorCacheBrokerPlugin.class, required = false),
            @XmlElementRef(name = "forcePersistencyModeBrokerPlugin", namespace = "http://activemq.apache.org/schema/core", type = DtoForcePersistencyModeBrokerPlugin.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> contents;

        /**
         * Gets the value of the contents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContents().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoMulticastTraceBrokerPlugin }
         * {@link DtoDestinationDotFilePlugin }
         * {@link DtoStatisticsBrokerPlugin }
         * {@link DtoDestinationsPlugin }
         * {@link DtoTimeStampingBrokerPlugin }
         * {@link DtoLoggingBrokerPlugin }
         * {@link DtoSimpleAuthenticationPlugin }
         * {@link DtoJaasDualAuthenticationPlugin }
         * {@link DtoJaasAuthenticationPlugin }
         * {@link DtoJaasCertificateAuthenticationPlugin }
         * {@link DtoCamelRoutesBrokerPlugin }
         * {@link DtoConnectionDotFilePlugin }
         * {@link DtoDestinationPathSeparatorPlugin }
         * {@link Object }
         * {@link DtoAuthorizationPlugin }
         * {@link DtoDiscardingDLQBrokerPlugin }
         * {@link DtoTraceBrokerPathPlugin }
         * {@link DtoRuntimeConfigurationPlugin }
         * {@link DtoRedeliveryPlugin }
         * {@link DtoUdpTraceBrokerPlugin }
         * {@link DtoPartitionBrokerPlugin }
         * {@link DtoVirtualSelectorCacheBrokerPlugin }
         * {@link DtoForcePersistencyModeBrokerPlugin }
         * 
         * 
         */
        public List<Object> getContents() {
            if (contents == null) {
                contents = new ArrayList<Object>();
            }
            return this.contents;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                strategy.appendField(locator, this, "contents", buffer, theContents);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theContents;
                theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contents", theContents), currentHashCode, theContents);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.Plugins)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.Plugins that = ((DtoBroker.Plugins) object);
            {
                List<Object> lhsContents;
                lhsContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
                List<Object> rhsContents;
                rhsContents = (((that.contents!= null)&&(!that.contents.isEmpty()))?that.getContents():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "contents", lhsContents), LocatorUtils.property(thatLocator, "contents", rhsContents), lhsContents, rhsContents)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "systemUsage",
        "any"
    })
    public static class ProducerSystemUsage
        implements Equals, HashCode, ToString
    {

        protected DtoSystemUsage systemUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡsystemUsage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoSystemUsage }
         *     
         */
        public DtoSystemUsage getSystemUsage() {
            return systemUsage;
        }

        /**
         * ����systemUsage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSystemUsage }
         *     
         */
        public void setSystemUsage(DtoSystemUsage value) {
            this.systemUsage = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                strategy.appendField(locator, this, "systemUsage", buffer, theSystemUsage);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemUsage", theSystemUsage), currentHashCode, theSystemUsage);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.ProducerSystemUsage)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.ProducerSystemUsage that = ((DtoBroker.ProducerSystemUsage) object);
            {
                DtoSystemUsage lhsSystemUsage;
                lhsSystemUsage = this.getSystemUsage();
                DtoSystemUsage rhsSystemUsage;
                rhsSystemUsage = that.getSystemUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "systemUsage", lhsSystemUsage), LocatorUtils.property(thatLocator, "systemUsage", rhsSystemUsage), lhsSystemUsage, rhsSystemUsage)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ProxyConnectors
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.ProxyConnectors)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.ProxyConnectors that = ((DtoBroker.ProxyConnectors) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationPathSeparatorPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationsPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}forcePersistencyModeBroker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}loggingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}multicastTraceBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}timeStampingBrokerPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}traceBrokerPathPlugin"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}udpTraceBrokerPlugin"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destinationPathSeparatorPlugin",
        "destinationsPlugin",
        "forcePersistencyModeBroker",
        "loggingBrokerPlugin",
        "multicastTraceBrokerPlugin",
        "redeliveryPlugin",
        "timeStampingBrokerPlugin",
        "traceBrokerPathPlugin",
        "udpTraceBrokerPlugin",
        "any"
    })
    public static class RegionBroker
        implements Equals, HashCode, ToString
    {

        protected DtoDestinationPathSeparatorPlugin destinationPathSeparatorPlugin;
        protected DtoDestinationsPlugin destinationsPlugin;
        protected DtoForcePersistencyModeBroker forcePersistencyModeBroker;
        protected DtoLoggingBrokerPlugin loggingBrokerPlugin;
        protected DtoMulticastTraceBrokerPlugin multicastTraceBrokerPlugin;
        protected DtoRedeliveryPlugin redeliveryPlugin;
        protected DtoTimeStampingBrokerPlugin timeStampingBrokerPlugin;
        protected DtoTraceBrokerPathPlugin traceBrokerPathPlugin;
        protected DtoUdpTraceBrokerPlugin udpTraceBrokerPlugin;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡdestinationPathSeparatorPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoDestinationPathSeparatorPlugin }
         *     
         */
        public DtoDestinationPathSeparatorPlugin getDestinationPathSeparatorPlugin() {
            return destinationPathSeparatorPlugin;
        }

        /**
         * ����destinationPathSeparatorPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDestinationPathSeparatorPlugin }
         *     
         */
        public void setDestinationPathSeparatorPlugin(DtoDestinationPathSeparatorPlugin value) {
            this.destinationPathSeparatorPlugin = value;
        }

        /**
         * ��ȡdestinationsPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoDestinationsPlugin }
         *     
         */
        public DtoDestinationsPlugin getDestinationsPlugin() {
            return destinationsPlugin;
        }

        /**
         * ����destinationsPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDestinationsPlugin }
         *     
         */
        public void setDestinationsPlugin(DtoDestinationsPlugin value) {
            this.destinationsPlugin = value;
        }

        /**
         * ��ȡforcePersistencyModeBroker���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoForcePersistencyModeBroker }
         *     
         */
        public DtoForcePersistencyModeBroker getForcePersistencyModeBroker() {
            return forcePersistencyModeBroker;
        }

        /**
         * ����forcePersistencyModeBroker���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoForcePersistencyModeBroker }
         *     
         */
        public void setForcePersistencyModeBroker(DtoForcePersistencyModeBroker value) {
            this.forcePersistencyModeBroker = value;
        }

        /**
         * ��ȡloggingBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoLoggingBrokerPlugin }
         *     
         */
        public DtoLoggingBrokerPlugin getLoggingBrokerPlugin() {
            return loggingBrokerPlugin;
        }

        /**
         * ����loggingBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLoggingBrokerPlugin }
         *     
         */
        public void setLoggingBrokerPlugin(DtoLoggingBrokerPlugin value) {
            this.loggingBrokerPlugin = value;
        }

        /**
         * ��ȡmulticastTraceBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoMulticastTraceBrokerPlugin }
         *     
         */
        public DtoMulticastTraceBrokerPlugin getMulticastTraceBrokerPlugin() {
            return multicastTraceBrokerPlugin;
        }

        /**
         * ����multicastTraceBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMulticastTraceBrokerPlugin }
         *     
         */
        public void setMulticastTraceBrokerPlugin(DtoMulticastTraceBrokerPlugin value) {
            this.multicastTraceBrokerPlugin = value;
        }

        /**
         * ��ȡredeliveryPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPlugin }
         *     
         */
        public DtoRedeliveryPlugin getRedeliveryPlugin() {
            return redeliveryPlugin;
        }

        /**
         * ����redeliveryPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPlugin }
         *     
         */
        public void setRedeliveryPlugin(DtoRedeliveryPlugin value) {
            this.redeliveryPlugin = value;
        }

        /**
         * ��ȡtimeStampingBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTimeStampingBrokerPlugin }
         *     
         */
        public DtoTimeStampingBrokerPlugin getTimeStampingBrokerPlugin() {
            return timeStampingBrokerPlugin;
        }

        /**
         * ����timeStampingBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTimeStampingBrokerPlugin }
         *     
         */
        public void setTimeStampingBrokerPlugin(DtoTimeStampingBrokerPlugin value) {
            this.timeStampingBrokerPlugin = value;
        }

        /**
         * ��ȡtraceBrokerPathPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTraceBrokerPathPlugin }
         *     
         */
        public DtoTraceBrokerPathPlugin getTraceBrokerPathPlugin() {
            return traceBrokerPathPlugin;
        }

        /**
         * ����traceBrokerPathPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTraceBrokerPathPlugin }
         *     
         */
        public void setTraceBrokerPathPlugin(DtoTraceBrokerPathPlugin value) {
            this.traceBrokerPathPlugin = value;
        }

        /**
         * ��ȡudpTraceBrokerPlugin���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoUdpTraceBrokerPlugin }
         *     
         */
        public DtoUdpTraceBrokerPlugin getUdpTraceBrokerPlugin() {
            return udpTraceBrokerPlugin;
        }

        /**
         * ����udpTraceBrokerPlugin���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoUdpTraceBrokerPlugin }
         *     
         */
        public void setUdpTraceBrokerPlugin(DtoUdpTraceBrokerPlugin value) {
            this.udpTraceBrokerPlugin = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoDestinationPathSeparatorPlugin theDestinationPathSeparatorPlugin;
                theDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                strategy.appendField(locator, this, "destinationPathSeparatorPlugin", buffer, theDestinationPathSeparatorPlugin);
            }
            {
                DtoDestinationsPlugin theDestinationsPlugin;
                theDestinationsPlugin = this.getDestinationsPlugin();
                strategy.appendField(locator, this, "destinationsPlugin", buffer, theDestinationsPlugin);
            }
            {
                DtoForcePersistencyModeBroker theForcePersistencyModeBroker;
                theForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                strategy.appendField(locator, this, "forcePersistencyModeBroker", buffer, theForcePersistencyModeBroker);
            }
            {
                DtoLoggingBrokerPlugin theLoggingBrokerPlugin;
                theLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                strategy.appendField(locator, this, "loggingBrokerPlugin", buffer, theLoggingBrokerPlugin);
            }
            {
                DtoMulticastTraceBrokerPlugin theMulticastTraceBrokerPlugin;
                theMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                strategy.appendField(locator, this, "multicastTraceBrokerPlugin", buffer, theMulticastTraceBrokerPlugin);
            }
            {
                DtoRedeliveryPlugin theRedeliveryPlugin;
                theRedeliveryPlugin = this.getRedeliveryPlugin();
                strategy.appendField(locator, this, "redeliveryPlugin", buffer, theRedeliveryPlugin);
            }
            {
                DtoTimeStampingBrokerPlugin theTimeStampingBrokerPlugin;
                theTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                strategy.appendField(locator, this, "timeStampingBrokerPlugin", buffer, theTimeStampingBrokerPlugin);
            }
            {
                DtoTraceBrokerPathPlugin theTraceBrokerPathPlugin;
                theTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                strategy.appendField(locator, this, "traceBrokerPathPlugin", buffer, theTraceBrokerPathPlugin);
            }
            {
                DtoUdpTraceBrokerPlugin theUdpTraceBrokerPlugin;
                theUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                strategy.appendField(locator, this, "udpTraceBrokerPlugin", buffer, theUdpTraceBrokerPlugin);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoDestinationPathSeparatorPlugin theDestinationPathSeparatorPlugin;
                theDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationPathSeparatorPlugin", theDestinationPathSeparatorPlugin), currentHashCode, theDestinationPathSeparatorPlugin);
            }
            {
                DtoDestinationsPlugin theDestinationsPlugin;
                theDestinationsPlugin = this.getDestinationsPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationsPlugin", theDestinationsPlugin), currentHashCode, theDestinationsPlugin);
            }
            {
                DtoForcePersistencyModeBroker theForcePersistencyModeBroker;
                theForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forcePersistencyModeBroker", theForcePersistencyModeBroker), currentHashCode, theForcePersistencyModeBroker);
            }
            {
                DtoLoggingBrokerPlugin theLoggingBrokerPlugin;
                theLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loggingBrokerPlugin", theLoggingBrokerPlugin), currentHashCode, theLoggingBrokerPlugin);
            }
            {
                DtoMulticastTraceBrokerPlugin theMulticastTraceBrokerPlugin;
                theMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multicastTraceBrokerPlugin", theMulticastTraceBrokerPlugin), currentHashCode, theMulticastTraceBrokerPlugin);
            }
            {
                DtoRedeliveryPlugin theRedeliveryPlugin;
                theRedeliveryPlugin = this.getRedeliveryPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPlugin", theRedeliveryPlugin), currentHashCode, theRedeliveryPlugin);
            }
            {
                DtoTimeStampingBrokerPlugin theTimeStampingBrokerPlugin;
                theTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStampingBrokerPlugin", theTimeStampingBrokerPlugin), currentHashCode, theTimeStampingBrokerPlugin);
            }
            {
                DtoTraceBrokerPathPlugin theTraceBrokerPathPlugin;
                theTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceBrokerPathPlugin", theTraceBrokerPathPlugin), currentHashCode, theTraceBrokerPathPlugin);
            }
            {
                DtoUdpTraceBrokerPlugin theUdpTraceBrokerPlugin;
                theUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "udpTraceBrokerPlugin", theUdpTraceBrokerPlugin), currentHashCode, theUdpTraceBrokerPlugin);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.RegionBroker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.RegionBroker that = ((DtoBroker.RegionBroker) object);
            {
                DtoDestinationPathSeparatorPlugin lhsDestinationPathSeparatorPlugin;
                lhsDestinationPathSeparatorPlugin = this.getDestinationPathSeparatorPlugin();
                DtoDestinationPathSeparatorPlugin rhsDestinationPathSeparatorPlugin;
                rhsDestinationPathSeparatorPlugin = that.getDestinationPathSeparatorPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationPathSeparatorPlugin", lhsDestinationPathSeparatorPlugin), LocatorUtils.property(thatLocator, "destinationPathSeparatorPlugin", rhsDestinationPathSeparatorPlugin), lhsDestinationPathSeparatorPlugin, rhsDestinationPathSeparatorPlugin)) {
                    return false;
                }
            }
            {
                DtoDestinationsPlugin lhsDestinationsPlugin;
                lhsDestinationsPlugin = this.getDestinationsPlugin();
                DtoDestinationsPlugin rhsDestinationsPlugin;
                rhsDestinationsPlugin = that.getDestinationsPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationsPlugin", lhsDestinationsPlugin), LocatorUtils.property(thatLocator, "destinationsPlugin", rhsDestinationsPlugin), lhsDestinationsPlugin, rhsDestinationsPlugin)) {
                    return false;
                }
            }
            {
                DtoForcePersistencyModeBroker lhsForcePersistencyModeBroker;
                lhsForcePersistencyModeBroker = this.getForcePersistencyModeBroker();
                DtoForcePersistencyModeBroker rhsForcePersistencyModeBroker;
                rhsForcePersistencyModeBroker = that.getForcePersistencyModeBroker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "forcePersistencyModeBroker", lhsForcePersistencyModeBroker), LocatorUtils.property(thatLocator, "forcePersistencyModeBroker", rhsForcePersistencyModeBroker), lhsForcePersistencyModeBroker, rhsForcePersistencyModeBroker)) {
                    return false;
                }
            }
            {
                DtoLoggingBrokerPlugin lhsLoggingBrokerPlugin;
                lhsLoggingBrokerPlugin = this.getLoggingBrokerPlugin();
                DtoLoggingBrokerPlugin rhsLoggingBrokerPlugin;
                rhsLoggingBrokerPlugin = that.getLoggingBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "loggingBrokerPlugin", lhsLoggingBrokerPlugin), LocatorUtils.property(thatLocator, "loggingBrokerPlugin", rhsLoggingBrokerPlugin), lhsLoggingBrokerPlugin, rhsLoggingBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoMulticastTraceBrokerPlugin lhsMulticastTraceBrokerPlugin;
                lhsMulticastTraceBrokerPlugin = this.getMulticastTraceBrokerPlugin();
                DtoMulticastTraceBrokerPlugin rhsMulticastTraceBrokerPlugin;
                rhsMulticastTraceBrokerPlugin = that.getMulticastTraceBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "multicastTraceBrokerPlugin", lhsMulticastTraceBrokerPlugin), LocatorUtils.property(thatLocator, "multicastTraceBrokerPlugin", rhsMulticastTraceBrokerPlugin), lhsMulticastTraceBrokerPlugin, rhsMulticastTraceBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoRedeliveryPlugin lhsRedeliveryPlugin;
                lhsRedeliveryPlugin = this.getRedeliveryPlugin();
                DtoRedeliveryPlugin rhsRedeliveryPlugin;
                rhsRedeliveryPlugin = that.getRedeliveryPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPlugin", lhsRedeliveryPlugin), LocatorUtils.property(thatLocator, "redeliveryPlugin", rhsRedeliveryPlugin), lhsRedeliveryPlugin, rhsRedeliveryPlugin)) {
                    return false;
                }
            }
            {
                DtoTimeStampingBrokerPlugin lhsTimeStampingBrokerPlugin;
                lhsTimeStampingBrokerPlugin = this.getTimeStampingBrokerPlugin();
                DtoTimeStampingBrokerPlugin rhsTimeStampingBrokerPlugin;
                rhsTimeStampingBrokerPlugin = that.getTimeStampingBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStampingBrokerPlugin", lhsTimeStampingBrokerPlugin), LocatorUtils.property(thatLocator, "timeStampingBrokerPlugin", rhsTimeStampingBrokerPlugin), lhsTimeStampingBrokerPlugin, rhsTimeStampingBrokerPlugin)) {
                    return false;
                }
            }
            {
                DtoTraceBrokerPathPlugin lhsTraceBrokerPathPlugin;
                lhsTraceBrokerPathPlugin = this.getTraceBrokerPathPlugin();
                DtoTraceBrokerPathPlugin rhsTraceBrokerPathPlugin;
                rhsTraceBrokerPathPlugin = that.getTraceBrokerPathPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "traceBrokerPathPlugin", lhsTraceBrokerPathPlugin), LocatorUtils.property(thatLocator, "traceBrokerPathPlugin", rhsTraceBrokerPathPlugin), lhsTraceBrokerPathPlugin, rhsTraceBrokerPathPlugin)) {
                    return false;
                }
            }
            {
                DtoUdpTraceBrokerPlugin lhsUdpTraceBrokerPlugin;
                lhsUdpTraceBrokerPlugin = this.getUdpTraceBrokerPlugin();
                DtoUdpTraceBrokerPlugin rhsUdpTraceBrokerPlugin;
                rhsUdpTraceBrokerPlugin = that.getUdpTraceBrokerPlugin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "udpTraceBrokerPlugin", lhsUdpTraceBrokerPlugin), LocatorUtils.property(thatLocator, "udpTraceBrokerPlugin", rhsUdpTraceBrokerPlugin), lhsUdpTraceBrokerPlugin, rhsUdpTraceBrokerPlugin)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}forwardingBridge"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}inboundQueueBridge"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}inboundTopicBridge"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jmsQueueConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jmsTopicConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jobSchedulerUsage"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}ldapNetworkConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}managementContext"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}memoryUsage"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}multicastNetworkConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}networkConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}outboundQueueBridge"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}outboundTopicBridge"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}pListStoreImpl"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}proxyConnector"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}storeUsage"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempUsage"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "brokerOrBrokerServiceOrDatabaseLocker"
    })
    public static class Services
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "jmsQueueConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoJmsQueueConnector.class, required = false),
            @XmlElementRef(name = "jobSchedulerUsage", namespace = "http://activemq.apache.org/schema/core", type = DtoJobSchedulerUsage.class, required = false),
            @XmlElementRef(name = "pListStoreImpl", namespace = "http://activemq.apache.org/schema/core", type = DtoPListStoreImpl.class, required = false),
            @XmlElementRef(name = "memoryUsage", namespace = "http://activemq.apache.org/schema/core", type = DtoMemoryUsage.class, required = false),
            @XmlElementRef(name = "mKahaDB", namespace = "http://activemq.apache.org/schema/core", type = DtoMKahaDB.class, required = false),
            @XmlElementRef(name = "tempUsage", namespace = "http://activemq.apache.org/schema/core", type = DtoTempUsage.class, required = false),
            @XmlElementRef(name = "systemUsage", namespace = "http://activemq.apache.org/schema/core", type = DtoSystemUsage.class, required = false),
            @XmlElementRef(name = "jmsTopicConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoJmsTopicConnector.class, required = false),
            @XmlElementRef(name = "kahaDB", namespace = "http://activemq.apache.org/schema/core", type = DtoKahaDB.class, required = false),
            @XmlElementRef(name = "inboundQueueBridge", namespace = "http://activemq.apache.org/schema/core", type = DtoInboundQueueBridge.class, required = false),
            @XmlElementRef(name = "proxyConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoProxyConnector.class, required = false),
            @XmlElementRef(name = "shared-file-locker", namespace = "http://activemq.apache.org/schema/core", type = DtoSharedFileLocker.class, required = false),
            @XmlElementRef(name = "outboundTopicBridge", namespace = "http://activemq.apache.org/schema/core", type = DtoOutboundTopicBridge.class, required = false),
            @XmlElementRef(name = "broker", namespace = "http://activemq.apache.org/schema/core", type = DtoBroker.class, required = false),
            @XmlElementRef(name = "outboundQueueBridge", namespace = "http://activemq.apache.org/schema/core", type = DtoOutboundQueueBridge.class, required = false),
            @XmlElementRef(name = "journalPersistenceAdapterFactory", namespace = "http://activemq.apache.org/schema/core", type = DtoJournalPersistenceAdapterFactory.class, required = false),
            @XmlElementRef(name = "managementContext", namespace = "http://activemq.apache.org/schema/core", type = DtoManagementContext.class, required = false),
            @XmlElementRef(name = "replicatedLevelDB", namespace = "http://activemq.apache.org/schema/core", type = DtoReplicatedLevelDB.class, required = false),
            @XmlElementRef(name = "transact-database-locker", namespace = "http://activemq.apache.org/schema/core", type = DtoTransactDatabaseLocker.class, required = false),
            @XmlElementRef(name = "lease-database-locker", namespace = "http://activemq.apache.org/schema/core", type = DtoLeaseDatabaseLocker.class, required = false),
            @XmlElementRef(name = "levelDB", namespace = "http://activemq.apache.org/schema/core", type = DtoLevelDB.class, required = false),
            @XmlElementRef(name = "inboundTopicBridge", namespace = "http://activemq.apache.org/schema/core", type = DtoInboundTopicBridge.class, required = false),
            @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = DtoBrokerService.class, required = false),
            @XmlElementRef(name = "jdbcPersistenceAdapter", namespace = "http://activemq.apache.org/schema/core", type = DtoJdbcPersistenceAdapter.class, required = false),
            @XmlElementRef(name = "storeUsage", namespace = "http://activemq.apache.org/schema/core", type = DtoStoreUsage.class, required = false),
            @XmlElementRef(name = "ldapNetworkConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoLdapNetworkConnector.class, required = false),
            @XmlElementRef(name = "networkConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoNetworkConnector.class, required = false),
            @XmlElementRef(name = "multicastNetworkConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoMulticastNetworkConnector.class, required = false),
            @XmlElementRef(name = "journaledJDBC", namespace = "http://activemq.apache.org/schema/core", type = DtoJournaledJDBC.class, required = false),
            @XmlElementRef(name = "database-locker", namespace = "http://activemq.apache.org/schema/core", type = DtoDatabaseLocker.class, required = false),
            @XmlElementRef(name = "forwardingBridge", namespace = "http://activemq.apache.org/schema/core", type = DtoForwardingBridge.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> brokerOrBrokerServiceOrDatabaseLocker;

        /**
         * Gets the value of the brokerOrBrokerServiceOrDatabaseLocker property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the brokerOrBrokerServiceOrDatabaseLocker property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBrokerOrBrokerServiceOrDatabaseLocker().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoJmsQueueConnector }
         * {@link DtoJobSchedulerUsage }
         * {@link DtoPListStoreImpl }
         * {@link DtoMemoryUsage }
         * {@link DtoMKahaDB }
         * {@link DtoTempUsage }
         * {@link DtoSystemUsage }
         * {@link DtoJmsTopicConnector }
         * {@link DtoKahaDB }
         * {@link DtoInboundQueueBridge }
         * {@link DtoProxyConnector }
         * {@link Object }
         * {@link DtoSharedFileLocker }
         * {@link DtoOutboundTopicBridge }
         * {@link DtoBroker }
         * {@link DtoOutboundQueueBridge }
         * {@link DtoJournalPersistenceAdapterFactory }
         * {@link DtoManagementContext }
         * {@link DtoReplicatedLevelDB }
         * {@link DtoTransactDatabaseLocker }
         * {@link DtoLeaseDatabaseLocker }
         * {@link DtoLevelDB }
         * {@link DtoInboundTopicBridge }
         * {@link DtoBrokerService }
         * {@link DtoJdbcPersistenceAdapter }
         * {@link DtoStoreUsage }
         * {@link DtoLdapNetworkConnector }
         * {@link DtoNetworkConnector }
         * {@link DtoMulticastNetworkConnector }
         * {@link DtoJournaledJDBC }
         * {@link DtoDatabaseLocker }
         * {@link DtoForwardingBridge }
         * 
         * 
         */
        public List<Object> getBrokerOrBrokerServiceOrDatabaseLocker() {
            if (brokerOrBrokerServiceOrDatabaseLocker == null) {
                brokerOrBrokerServiceOrDatabaseLocker = new ArrayList<Object>();
            }
            return this.brokerOrBrokerServiceOrDatabaseLocker;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theBrokerOrBrokerServiceOrDatabaseLocker;
                theBrokerOrBrokerServiceOrDatabaseLocker = (((this.brokerOrBrokerServiceOrDatabaseLocker!= null)&&(!this.brokerOrBrokerServiceOrDatabaseLocker.isEmpty()))?this.getBrokerOrBrokerServiceOrDatabaseLocker():null);
                strategy.appendField(locator, this, "brokerOrBrokerServiceOrDatabaseLocker", buffer, theBrokerOrBrokerServiceOrDatabaseLocker);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theBrokerOrBrokerServiceOrDatabaseLocker;
                theBrokerOrBrokerServiceOrDatabaseLocker = (((this.brokerOrBrokerServiceOrDatabaseLocker!= null)&&(!this.brokerOrBrokerServiceOrDatabaseLocker.isEmpty()))?this.getBrokerOrBrokerServiceOrDatabaseLocker():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerOrBrokerServiceOrDatabaseLocker", theBrokerOrBrokerServiceOrDatabaseLocker), currentHashCode, theBrokerOrBrokerServiceOrDatabaseLocker);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.Services)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.Services that = ((DtoBroker.Services) object);
            {
                List<Object> lhsBrokerOrBrokerServiceOrDatabaseLocker;
                lhsBrokerOrBrokerServiceOrDatabaseLocker = (((this.brokerOrBrokerServiceOrDatabaseLocker!= null)&&(!this.brokerOrBrokerServiceOrDatabaseLocker.isEmpty()))?this.getBrokerOrBrokerServiceOrDatabaseLocker():null);
                List<Object> rhsBrokerOrBrokerServiceOrDatabaseLocker;
                rhsBrokerOrBrokerServiceOrDatabaseLocker = (((that.brokerOrBrokerServiceOrDatabaseLocker!= null)&&(!that.brokerOrBrokerServiceOrDatabaseLocker.isEmpty()))?that.getBrokerOrBrokerServiceOrDatabaseLocker():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerOrBrokerServiceOrDatabaseLocker", lhsBrokerOrBrokerServiceOrDatabaseLocker), LocatorUtils.property(thatLocator, "brokerOrBrokerServiceOrDatabaseLocker", rhsBrokerOrBrokerServiceOrDatabaseLocker), lhsBrokerOrBrokerServiceOrDatabaseLocker, rhsBrokerOrBrokerServiceOrDatabaseLocker)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ShutdownHooks
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.ShutdownHooks)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.ShutdownHooks that = ((DtoBroker.ShutdownHooks) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}sslContext"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sslContext",
        "any"
    })
    public static class SslContext
        implements Equals, HashCode, ToString
    {

        protected DtoSslContext sslContext;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡsslContext���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoSslContext }
         *     
         */
        public DtoSslContext getSslContext() {
            return sslContext;
        }

        /**
         * ����sslContext���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSslContext }
         *     
         */
        public void setSslContext(DtoSslContext value) {
            this.sslContext = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoSslContext theSslContext;
                theSslContext = this.getSslContext();
                strategy.appendField(locator, this, "sslContext", buffer, theSslContext);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoSslContext theSslContext;
                theSslContext = this.getSslContext();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sslContext", theSslContext), currentHashCode, theSslContext);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.SslContext)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.SslContext that = ((DtoBroker.SslContext) object);
            {
                DtoSslContext lhsSslContext;
                lhsSslContext = this.getSslContext();
                DtoSslContext rhsSslContext;
                rhsSslContext = that.getSslContext();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "sslContext", lhsSslContext), LocatorUtils.property(thatLocator, "sslContext", rhsSslContext), lhsSslContext, rhsSslContext)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class StartException
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.StartException)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.StartException that = ((DtoBroker.StartException) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}systemUsage"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "systemUsage",
        "any"
    })
    public static class SystemUsage
        implements Equals, HashCode, ToString
    {

        protected DtoSystemUsage systemUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡsystemUsage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoSystemUsage }
         *     
         */
        public DtoSystemUsage getSystemUsage() {
            return systemUsage;
        }

        /**
         * ����systemUsage���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSystemUsage }
         *     
         */
        public void setSystemUsage(DtoSystemUsage value) {
            this.systemUsage = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                strategy.appendField(locator, this, "systemUsage", buffer, theSystemUsage);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoSystemUsage theSystemUsage;
                theSystemUsage = this.getSystemUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemUsage", theSystemUsage), currentHashCode, theSystemUsage);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.SystemUsage)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.SystemUsage that = ((DtoBroker.SystemUsage) object);
            {
                DtoSystemUsage lhsSystemUsage;
                lhsSystemUsage = this.getSystemUsage();
                DtoSystemUsage rhsSystemUsage;
                rhsSystemUsage = that.getSystemUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "systemUsage", lhsSystemUsage), LocatorUtils.property(thatLocator, "systemUsage", rhsSystemUsage), lhsSystemUsage, rhsSystemUsage)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taskRunnerFactory",
        "any"
    })
    public static class TaskRunnerFactory
        implements Equals, HashCode, ToString
    {

        protected DtoTaskRunnerFactory taskRunnerFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡtaskRunnerFactory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public DtoTaskRunnerFactory getTaskRunnerFactory() {
            return taskRunnerFactory;
        }

        /**
         * ����taskRunnerFactory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public void setTaskRunnerFactory(DtoTaskRunnerFactory value) {
            this.taskRunnerFactory = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                strategy.appendField(locator, this, "taskRunnerFactory", buffer, theTaskRunnerFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerFactory", theTaskRunnerFactory), currentHashCode, theTaskRunnerFactory);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.TaskRunnerFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.TaskRunnerFactory that = ((DtoBroker.TaskRunnerFactory) object);
            {
                DtoTaskRunnerFactory lhsTaskRunnerFactory;
                lhsTaskRunnerFactory = this.getTaskRunnerFactory();
                DtoTaskRunnerFactory rhsTaskRunnerFactory;
                rhsTaskRunnerFactory = that.getTaskRunnerFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "taskRunnerFactory", lhsTaskRunnerFactory), LocatorUtils.property(thatLocator, "taskRunnerFactory", rhsTaskRunnerFactory), lhsTaskRunnerFactory, rhsTaskRunnerFactory)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}pListStoreImpl"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "levelDB",
        "pListStoreImpl",
        "replicatedLevelDB",
        "any"
    })
    public static class TempDataStore
        implements Equals, HashCode, ToString
    {

        protected DtoLevelDB levelDB;
        protected DtoPListStoreImpl pListStoreImpl;
        protected DtoReplicatedLevelDB replicatedLevelDB;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡlevelDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoLevelDB }
         *     
         */
        public DtoLevelDB getLevelDB() {
            return levelDB;
        }

        /**
         * ����levelDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLevelDB }
         *     
         */
        public void setLevelDB(DtoLevelDB value) {
            this.levelDB = value;
        }

        /**
         * ��ȡpListStoreImpl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoPListStoreImpl }
         *     
         */
        public DtoPListStoreImpl getPListStoreImpl() {
            return pListStoreImpl;
        }

        /**
         * ����pListStoreImpl���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPListStoreImpl }
         *     
         */
        public void setPListStoreImpl(DtoPListStoreImpl value) {
            this.pListStoreImpl = value;
        }

        /**
         * ��ȡreplicatedLevelDB���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public DtoReplicatedLevelDB getReplicatedLevelDB() {
            return replicatedLevelDB;
        }

        /**
         * ����replicatedLevelDB���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoReplicatedLevelDB }
         *     
         */
        public void setReplicatedLevelDB(DtoReplicatedLevelDB value) {
            this.replicatedLevelDB = value;
        }

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                DtoLevelDB theLevelDB;
                theLevelDB = this.getLevelDB();
                strategy.appendField(locator, this, "levelDB", buffer, theLevelDB);
            }
            {
                DtoPListStoreImpl thePListStoreImpl;
                thePListStoreImpl = this.getPListStoreImpl();
                strategy.appendField(locator, this, "pListStoreImpl", buffer, thePListStoreImpl);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                strategy.appendField(locator, this, "replicatedLevelDB", buffer, theReplicatedLevelDB);
            }
            {
                Object theAny;
                theAny = this.getAny();
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                DtoLevelDB theLevelDB;
                theLevelDB = this.getLevelDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "levelDB", theLevelDB), currentHashCode, theLevelDB);
            }
            {
                DtoPListStoreImpl thePListStoreImpl;
                thePListStoreImpl = this.getPListStoreImpl();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pListStoreImpl", thePListStoreImpl), currentHashCode, thePListStoreImpl);
            }
            {
                DtoReplicatedLevelDB theReplicatedLevelDB;
                theReplicatedLevelDB = this.getReplicatedLevelDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replicatedLevelDB", theReplicatedLevelDB), currentHashCode, theReplicatedLevelDB);
            }
            {
                Object theAny;
                theAny = this.getAny();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.TempDataStore)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.TempDataStore that = ((DtoBroker.TempDataStore) object);
            {
                DtoLevelDB lhsLevelDB;
                lhsLevelDB = this.getLevelDB();
                DtoLevelDB rhsLevelDB;
                rhsLevelDB = that.getLevelDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "levelDB", lhsLevelDB), LocatorUtils.property(thatLocator, "levelDB", rhsLevelDB), lhsLevelDB, rhsLevelDB)) {
                    return false;
                }
            }
            {
                DtoPListStoreImpl lhsPListStoreImpl;
                lhsPListStoreImpl = this.getPListStoreImpl();
                DtoPListStoreImpl rhsPListStoreImpl;
                rhsPListStoreImpl = that.getPListStoreImpl();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "pListStoreImpl", lhsPListStoreImpl), LocatorUtils.property(thatLocator, "pListStoreImpl", rhsPListStoreImpl), lhsPListStoreImpl, rhsPListStoreImpl)) {
                    return false;
                }
            }
            {
                DtoReplicatedLevelDB lhsReplicatedLevelDB;
                lhsReplicatedLevelDB = this.getReplicatedLevelDB();
                DtoReplicatedLevelDB rhsReplicatedLevelDB;
                rhsReplicatedLevelDB = that.getReplicatedLevelDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "replicatedLevelDB", lhsReplicatedLevelDB), LocatorUtils.property(thatLocator, "replicatedLevelDB", rhsReplicatedLevelDB), lhsReplicatedLevelDB, rhsReplicatedLevelDB)) {
                    return false;
                }
            }
            {
                Object lhsAny;
                lhsAny = this.getAny();
                Object rhsAny;
                rhsAny = that.getAny();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class TransportConnectorURIs
        implements Equals, HashCode, ToString
    {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                strategy.appendField(locator, this, "any", buffer, theAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theAny;
                theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.TransportConnectorURIs)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.TransportConnectorURIs that = ((DtoBroker.TransportConnectorURIs) object);
            {
                List<Object> lhsAny;
                lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                List<Object> rhsAny;
                rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}transportConnector"/>
     *         &lt;any namespace='##other'/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transportConnectorOrAny"
    })
    public static class TransportConnectors
        implements Equals, HashCode, ToString
    {

        @XmlElementRef(name = "transportConnector", namespace = "http://activemq.apache.org/schema/core", type = DtoTransportConnector.class, required = false)
        @XmlAnyElement(lax = true)
        protected List<Object> transportConnectorOrAny;

        /**
         * Gets the value of the transportConnectorOrAny property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transportConnectorOrAny property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransportConnectorOrAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoTransportConnector }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getTransportConnectorOrAny() {
            if (transportConnectorOrAny == null) {
                transportConnectorOrAny = new ArrayList<Object>();
            }
            return this.transportConnectorOrAny;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<Object> theTransportConnectorOrAny;
                theTransportConnectorOrAny = (((this.transportConnectorOrAny!= null)&&(!this.transportConnectorOrAny.isEmpty()))?this.getTransportConnectorOrAny():null);
                strategy.appendField(locator, this, "transportConnectorOrAny", buffer, theTransportConnectorOrAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theTransportConnectorOrAny;
                theTransportConnectorOrAny = (((this.transportConnectorOrAny!= null)&&(!this.transportConnectorOrAny.isEmpty()))?this.getTransportConnectorOrAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportConnectorOrAny", theTransportConnectorOrAny), currentHashCode, theTransportConnectorOrAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoBroker.TransportConnectors)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoBroker.TransportConnectors that = ((DtoBroker.TransportConnectors) object);
            {
                List<Object> lhsTransportConnectorOrAny;
                lhsTransportConnectorOrAny = (((this.transportConnectorOrAny!= null)&&(!this.transportConnectorOrAny.isEmpty()))?this.getTransportConnectorOrAny():null);
                List<Object> rhsTransportConnectorOrAny;
                rhsTransportConnectorOrAny = (((that.transportConnectorOrAny!= null)&&(!that.transportConnectorOrAny.isEmpty()))?that.getTransportConnectorOrAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "transportConnectorOrAny", lhsTransportConnectorOrAny), LocatorUtils.property(thatLocator, "transportConnectorOrAny", rhsTransportConnectorOrAny), lhsTransportConnectorOrAny, rhsTransportConnectorOrAny)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = new org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy();
            return equals(null, null, object, strategy);
        }

    }

}
