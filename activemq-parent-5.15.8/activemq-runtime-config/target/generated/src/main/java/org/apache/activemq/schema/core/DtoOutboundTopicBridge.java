//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.10-b140310.1920 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.02.26 ʱ�� 09:59:41 AM CST 
//


package org.apache.activemq.schema.core;

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
 *           &lt;element name="consumer" minOccurs="0">
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
 *           &lt;element name="consumerConnection" minOccurs="0">
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
 *           &lt;element name="consumerTopic" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="jmsConnector" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsQueueConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jmsTopicConnector"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="jmsMessageConvertor" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}simpleJmsMessageConvertor"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="producerConnection" minOccurs="0">
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
 *           &lt;element name="producerTopic" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}topic"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="consumer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerTopic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="doHandleReplyTo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="jmsConnector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jmsMessageConvertor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localTopicName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundTopicName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="producerConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="producerTopic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="selector" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "consumerOrConsumerConnectionOrConsumerTopic"
})
@XmlRootElement(name = "outboundTopicBridge")
public class DtoOutboundTopicBridge implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "consumer", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "producerTopic", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consumerTopic", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jmsConnector", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jmsMessageConvertor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "producerConnection", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consumerConnection", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> consumerOrConsumerConnectionOrConsumerTopic;
    @XmlAttribute(name = "consumer")
    protected String consumer;
    @XmlAttribute(name = "consumerConnection")
    protected String consumerConnection;
    @XmlAttribute(name = "consumerName")
    protected String consumerName;
    @XmlAttribute(name = "consumerTopic")
    protected String consumerTopic;
    @XmlAttribute(name = "doHandleReplyTo")
    protected Boolean doHandleReplyTo;
    @XmlAttribute(name = "jmsConnector")
    protected String jmsConnector;
    @XmlAttribute(name = "jmsMessageConvertor")
    protected String jmsMessageConvertor;
    @XmlAttribute(name = "localTopicName")
    protected String localTopicName;
    @XmlAttribute(name = "outboundTopicName")
    protected String outboundTopicName;
    @XmlAttribute(name = "producerConnection")
    protected String producerConnection;
    @XmlAttribute(name = "producerTopic")
    protected String producerTopic;
    @XmlAttribute(name = "selector")
    protected String selector;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the consumerOrConsumerConnectionOrConsumerTopic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerOrConsumerConnectionOrConsumerTopic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerOrConsumerConnectionOrConsumerTopic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.Consumer }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ProducerTopic }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ConsumerTopic }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.JmsConnector }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.JmsMessageConvertor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ProducerConnection }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ConsumerConnection }{@code >}
     * 
     * 
     */
    public List<Object> getConsumerOrConsumerConnectionOrConsumerTopic() {
        if (consumerOrConsumerConnectionOrConsumerTopic == null) {
            consumerOrConsumerConnectionOrConsumerTopic = new ArrayList<Object>();
        }
        return this.consumerOrConsumerConnectionOrConsumerTopic;
    }

    /**
     * ��ȡconsumer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * ����consumer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumer(String value) {
        this.consumer = value;
    }

    /**
     * ��ȡconsumerConnection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerConnection() {
        return consumerConnection;
    }

    /**
     * ����consumerConnection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerConnection(String value) {
        this.consumerConnection = value;
    }

    /**
     * ��ȡconsumerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerName() {
        return consumerName;
    }

    /**
     * ����consumerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerName(String value) {
        this.consumerName = value;
    }

    /**
     * ��ȡconsumerTopic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerTopic() {
        return consumerTopic;
    }

    /**
     * ����consumerTopic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerTopic(String value) {
        this.consumerTopic = value;
    }

    /**
     * ��ȡdoHandleReplyTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoHandleReplyTo() {
        return doHandleReplyTo;
    }

    /**
     * ����doHandleReplyTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoHandleReplyTo(Boolean value) {
        this.doHandleReplyTo = value;
    }

    /**
     * ��ȡjmsConnector���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmsConnector() {
        return jmsConnector;
    }

    /**
     * ����jmsConnector���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmsConnector(String value) {
        this.jmsConnector = value;
    }

    /**
     * ��ȡjmsMessageConvertor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmsMessageConvertor() {
        return jmsMessageConvertor;
    }

    /**
     * ����jmsMessageConvertor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmsMessageConvertor(String value) {
        this.jmsMessageConvertor = value;
    }

    /**
     * ��ȡlocalTopicName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTopicName() {
        return localTopicName;
    }

    /**
     * ����localTopicName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTopicName(String value) {
        this.localTopicName = value;
    }

    /**
     * ��ȡoutboundTopicName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundTopicName() {
        return outboundTopicName;
    }

    /**
     * ����outboundTopicName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundTopicName(String value) {
        this.outboundTopicName = value;
    }

    /**
     * ��ȡproducerConnection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerConnection() {
        return producerConnection;
    }

    /**
     * ����producerConnection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerConnection(String value) {
        this.producerConnection = value;
    }

    /**
     * ��ȡproducerTopic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerTopic() {
        return producerTopic;
    }

    /**
     * ����producerTopic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerTopic(String value) {
        this.producerTopic = value;
    }

    /**
     * ��ȡselector���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelector() {
        return selector;
    }

    /**
     * ����selector���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelector(String value) {
        this.selector = value;
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
            List<Object> theConsumerOrConsumerConnectionOrConsumerTopic;
            theConsumerOrConsumerConnectionOrConsumerTopic = (((this.consumerOrConsumerConnectionOrConsumerTopic!= null)&&(!this.consumerOrConsumerConnectionOrConsumerTopic.isEmpty()))?this.getConsumerOrConsumerConnectionOrConsumerTopic():null);
            strategy.appendField(locator, this, "consumerOrConsumerConnectionOrConsumerTopic", buffer, theConsumerOrConsumerConnectionOrConsumerTopic);
        }
        {
            String theConsumer;
            theConsumer = this.getConsumer();
            strategy.appendField(locator, this, "consumer", buffer, theConsumer);
        }
        {
            String theConsumerConnection;
            theConsumerConnection = this.getConsumerConnection();
            strategy.appendField(locator, this, "consumerConnection", buffer, theConsumerConnection);
        }
        {
            String theConsumerName;
            theConsumerName = this.getConsumerName();
            strategy.appendField(locator, this, "consumerName", buffer, theConsumerName);
        }
        {
            String theConsumerTopic;
            theConsumerTopic = this.getConsumerTopic();
            strategy.appendField(locator, this, "consumerTopic", buffer, theConsumerTopic);
        }
        {
            Boolean theDoHandleReplyTo;
            theDoHandleReplyTo = this.isDoHandleReplyTo();
            strategy.appendField(locator, this, "doHandleReplyTo", buffer, theDoHandleReplyTo);
        }
        {
            String theJmsConnector;
            theJmsConnector = this.getJmsConnector();
            strategy.appendField(locator, this, "jmsConnector", buffer, theJmsConnector);
        }
        {
            String theJmsMessageConvertor;
            theJmsMessageConvertor = this.getJmsMessageConvertor();
            strategy.appendField(locator, this, "jmsMessageConvertor", buffer, theJmsMessageConvertor);
        }
        {
            String theLocalTopicName;
            theLocalTopicName = this.getLocalTopicName();
            strategy.appendField(locator, this, "localTopicName", buffer, theLocalTopicName);
        }
        {
            String theOutboundTopicName;
            theOutboundTopicName = this.getOutboundTopicName();
            strategy.appendField(locator, this, "outboundTopicName", buffer, theOutboundTopicName);
        }
        {
            String theProducerConnection;
            theProducerConnection = this.getProducerConnection();
            strategy.appendField(locator, this, "producerConnection", buffer, theProducerConnection);
        }
        {
            String theProducerTopic;
            theProducerTopic = this.getProducerTopic();
            strategy.appendField(locator, this, "producerTopic", buffer, theProducerTopic);
        }
        {
            String theSelector;
            theSelector = this.getSelector();
            strategy.appendField(locator, this, "selector", buffer, theSelector);
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
            List<Object> theConsumerOrConsumerConnectionOrConsumerTopic;
            theConsumerOrConsumerConnectionOrConsumerTopic = (((this.consumerOrConsumerConnectionOrConsumerTopic!= null)&&(!this.consumerOrConsumerConnectionOrConsumerTopic.isEmpty()))?this.getConsumerOrConsumerConnectionOrConsumerTopic():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerOrConsumerConnectionOrConsumerTopic", theConsumerOrConsumerConnectionOrConsumerTopic), currentHashCode, theConsumerOrConsumerConnectionOrConsumerTopic);
        }
        {
            String theConsumer;
            theConsumer = this.getConsumer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumer", theConsumer), currentHashCode, theConsumer);
        }
        {
            String theConsumerConnection;
            theConsumerConnection = this.getConsumerConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerConnection", theConsumerConnection), currentHashCode, theConsumerConnection);
        }
        {
            String theConsumerName;
            theConsumerName = this.getConsumerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerName", theConsumerName), currentHashCode, theConsumerName);
        }
        {
            String theConsumerTopic;
            theConsumerTopic = this.getConsumerTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerTopic", theConsumerTopic), currentHashCode, theConsumerTopic);
        }
        {
            Boolean theDoHandleReplyTo;
            theDoHandleReplyTo = this.isDoHandleReplyTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doHandleReplyTo", theDoHandleReplyTo), currentHashCode, theDoHandleReplyTo);
        }
        {
            String theJmsConnector;
            theJmsConnector = this.getJmsConnector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsConnector", theJmsConnector), currentHashCode, theJmsConnector);
        }
        {
            String theJmsMessageConvertor;
            theJmsMessageConvertor = this.getJmsMessageConvertor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsMessageConvertor", theJmsMessageConvertor), currentHashCode, theJmsMessageConvertor);
        }
        {
            String theLocalTopicName;
            theLocalTopicName = this.getLocalTopicName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localTopicName", theLocalTopicName), currentHashCode, theLocalTopicName);
        }
        {
            String theOutboundTopicName;
            theOutboundTopicName = this.getOutboundTopicName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundTopicName", theOutboundTopicName), currentHashCode, theOutboundTopicName);
        }
        {
            String theProducerConnection;
            theProducerConnection = this.getProducerConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerConnection", theProducerConnection), currentHashCode, theProducerConnection);
        }
        {
            String theProducerTopic;
            theProducerTopic = this.getProducerTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producerTopic", theProducerTopic), currentHashCode, theProducerTopic);
        }
        {
            String theSelector;
            theSelector = this.getSelector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selector", theSelector), currentHashCode, theSelector);
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
        if (!(object instanceof DtoOutboundTopicBridge)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoOutboundTopicBridge that = ((DtoOutboundTopicBridge) object);
        {
            List<Object> lhsConsumerOrConsumerConnectionOrConsumerTopic;
            lhsConsumerOrConsumerConnectionOrConsumerTopic = (((this.consumerOrConsumerConnectionOrConsumerTopic!= null)&&(!this.consumerOrConsumerConnectionOrConsumerTopic.isEmpty()))?this.getConsumerOrConsumerConnectionOrConsumerTopic():null);
            List<Object> rhsConsumerOrConsumerConnectionOrConsumerTopic;
            rhsConsumerOrConsumerConnectionOrConsumerTopic = (((that.consumerOrConsumerConnectionOrConsumerTopic!= null)&&(!that.consumerOrConsumerConnectionOrConsumerTopic.isEmpty()))?that.getConsumerOrConsumerConnectionOrConsumerTopic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerOrConsumerConnectionOrConsumerTopic", lhsConsumerOrConsumerConnectionOrConsumerTopic), LocatorUtils.property(thatLocator, "consumerOrConsumerConnectionOrConsumerTopic", rhsConsumerOrConsumerConnectionOrConsumerTopic), lhsConsumerOrConsumerConnectionOrConsumerTopic, rhsConsumerOrConsumerConnectionOrConsumerTopic)) {
                return false;
            }
        }
        {
            String lhsConsumer;
            lhsConsumer = this.getConsumer();
            String rhsConsumer;
            rhsConsumer = that.getConsumer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumer", lhsConsumer), LocatorUtils.property(thatLocator, "consumer", rhsConsumer), lhsConsumer, rhsConsumer)) {
                return false;
            }
        }
        {
            String lhsConsumerConnection;
            lhsConsumerConnection = this.getConsumerConnection();
            String rhsConsumerConnection;
            rhsConsumerConnection = that.getConsumerConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerConnection", lhsConsumerConnection), LocatorUtils.property(thatLocator, "consumerConnection", rhsConsumerConnection), lhsConsumerConnection, rhsConsumerConnection)) {
                return false;
            }
        }
        {
            String lhsConsumerName;
            lhsConsumerName = this.getConsumerName();
            String rhsConsumerName;
            rhsConsumerName = that.getConsumerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerName", lhsConsumerName), LocatorUtils.property(thatLocator, "consumerName", rhsConsumerName), lhsConsumerName, rhsConsumerName)) {
                return false;
            }
        }
        {
            String lhsConsumerTopic;
            lhsConsumerTopic = this.getConsumerTopic();
            String rhsConsumerTopic;
            rhsConsumerTopic = that.getConsumerTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerTopic", lhsConsumerTopic), LocatorUtils.property(thatLocator, "consumerTopic", rhsConsumerTopic), lhsConsumerTopic, rhsConsumerTopic)) {
                return false;
            }
        }
        {
            Boolean lhsDoHandleReplyTo;
            lhsDoHandleReplyTo = this.isDoHandleReplyTo();
            Boolean rhsDoHandleReplyTo;
            rhsDoHandleReplyTo = that.isDoHandleReplyTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doHandleReplyTo", lhsDoHandleReplyTo), LocatorUtils.property(thatLocator, "doHandleReplyTo", rhsDoHandleReplyTo), lhsDoHandleReplyTo, rhsDoHandleReplyTo)) {
                return false;
            }
        }
        {
            String lhsJmsConnector;
            lhsJmsConnector = this.getJmsConnector();
            String rhsJmsConnector;
            rhsJmsConnector = that.getJmsConnector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsConnector", lhsJmsConnector), LocatorUtils.property(thatLocator, "jmsConnector", rhsJmsConnector), lhsJmsConnector, rhsJmsConnector)) {
                return false;
            }
        }
        {
            String lhsJmsMessageConvertor;
            lhsJmsMessageConvertor = this.getJmsMessageConvertor();
            String rhsJmsMessageConvertor;
            rhsJmsMessageConvertor = that.getJmsMessageConvertor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsMessageConvertor", lhsJmsMessageConvertor), LocatorUtils.property(thatLocator, "jmsMessageConvertor", rhsJmsMessageConvertor), lhsJmsMessageConvertor, rhsJmsMessageConvertor)) {
                return false;
            }
        }
        {
            String lhsLocalTopicName;
            lhsLocalTopicName = this.getLocalTopicName();
            String rhsLocalTopicName;
            rhsLocalTopicName = that.getLocalTopicName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localTopicName", lhsLocalTopicName), LocatorUtils.property(thatLocator, "localTopicName", rhsLocalTopicName), lhsLocalTopicName, rhsLocalTopicName)) {
                return false;
            }
        }
        {
            String lhsOutboundTopicName;
            lhsOutboundTopicName = this.getOutboundTopicName();
            String rhsOutboundTopicName;
            rhsOutboundTopicName = that.getOutboundTopicName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundTopicName", lhsOutboundTopicName), LocatorUtils.property(thatLocator, "outboundTopicName", rhsOutboundTopicName), lhsOutboundTopicName, rhsOutboundTopicName)) {
                return false;
            }
        }
        {
            String lhsProducerConnection;
            lhsProducerConnection = this.getProducerConnection();
            String rhsProducerConnection;
            rhsProducerConnection = that.getProducerConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerConnection", lhsProducerConnection), LocatorUtils.property(thatLocator, "producerConnection", rhsProducerConnection), lhsProducerConnection, rhsProducerConnection)) {
                return false;
            }
        }
        {
            String lhsProducerTopic;
            lhsProducerTopic = this.getProducerTopic();
            String rhsProducerTopic;
            rhsProducerTopic = that.getProducerTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producerTopic", lhsProducerTopic), LocatorUtils.property(thatLocator, "producerTopic", rhsProducerTopic), lhsProducerTopic, rhsProducerTopic)) {
                return false;
            }
        }
        {
            String lhsSelector;
            lhsSelector = this.getSelector();
            String rhsSelector;
            rhsSelector = that.getSelector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selector", lhsSelector), LocatorUtils.property(thatLocator, "selector", rhsSelector), lhsSelector, rhsSelector)) {
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
    public static class Consumer
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
            if (!(object instanceof DtoOutboundTopicBridge.Consumer)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundTopicBridge.Consumer that = ((DtoOutboundTopicBridge.Consumer) object);
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
    public static class ConsumerConnection
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
            if (!(object instanceof DtoOutboundTopicBridge.ConsumerConnection)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundTopicBridge.ConsumerConnection that = ((DtoOutboundTopicBridge.ConsumerConnection) object);
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
        "topic",
        "any"
    })
    public static class ConsumerTopic
        implements Equals, HashCode, ToString
    {

        protected DtoTopic topic;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡtopic���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTopic }
         *     
         */
        public DtoTopic getTopic() {
            return topic;
        }

        /**
         * ����topic���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTopic }
         *     
         */
        public void setTopic(DtoTopic value) {
            this.topic = value;
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
                DtoTopic theTopic;
                theTopic = this.getTopic();
                strategy.appendField(locator, this, "topic", buffer, theTopic);
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
                DtoTopic theTopic;
                theTopic = this.getTopic();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
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
            if (!(object instanceof DtoOutboundTopicBridge.ConsumerTopic)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundTopicBridge.ConsumerTopic that = ((DtoOutboundTopicBridge.ConsumerTopic) object);
            {
                DtoTopic lhsTopic;
                lhsTopic = this.getTopic();
                DtoTopic rhsTopic;
                rhsTopic = that.getTopic();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
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
        "jmsQueueConnector",
        "jmsTopicConnector",
        "any"
    })
    public static class JmsConnector
        implements Equals, HashCode, ToString
    {

        protected DtoJmsQueueConnector jmsQueueConnector;
        protected DtoJmsTopicConnector jmsTopicConnector;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡjmsQueueConnector���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJmsQueueConnector }
         *     
         */
        public DtoJmsQueueConnector getJmsQueueConnector() {
            return jmsQueueConnector;
        }

        /**
         * ����jmsQueueConnector���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJmsQueueConnector }
         *     
         */
        public void setJmsQueueConnector(DtoJmsQueueConnector value) {
            this.jmsQueueConnector = value;
        }

        /**
         * ��ȡjmsTopicConnector���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJmsTopicConnector }
         *     
         */
        public DtoJmsTopicConnector getJmsTopicConnector() {
            return jmsTopicConnector;
        }

        /**
         * ����jmsTopicConnector���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJmsTopicConnector }
         *     
         */
        public void setJmsTopicConnector(DtoJmsTopicConnector value) {
            this.jmsTopicConnector = value;
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
                DtoJmsQueueConnector theJmsQueueConnector;
                theJmsQueueConnector = this.getJmsQueueConnector();
                strategy.appendField(locator, this, "jmsQueueConnector", buffer, theJmsQueueConnector);
            }
            {
                DtoJmsTopicConnector theJmsTopicConnector;
                theJmsTopicConnector = this.getJmsTopicConnector();
                strategy.appendField(locator, this, "jmsTopicConnector", buffer, theJmsTopicConnector);
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
                DtoJmsQueueConnector theJmsQueueConnector;
                theJmsQueueConnector = this.getJmsQueueConnector();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsQueueConnector", theJmsQueueConnector), currentHashCode, theJmsQueueConnector);
            }
            {
                DtoJmsTopicConnector theJmsTopicConnector;
                theJmsTopicConnector = this.getJmsTopicConnector();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsTopicConnector", theJmsTopicConnector), currentHashCode, theJmsTopicConnector);
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
            if (!(object instanceof DtoOutboundTopicBridge.JmsConnector)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundTopicBridge.JmsConnector that = ((DtoOutboundTopicBridge.JmsConnector) object);
            {
                DtoJmsQueueConnector lhsJmsQueueConnector;
                lhsJmsQueueConnector = this.getJmsQueueConnector();
                DtoJmsQueueConnector rhsJmsQueueConnector;
                rhsJmsQueueConnector = that.getJmsQueueConnector();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsQueueConnector", lhsJmsQueueConnector), LocatorUtils.property(thatLocator, "jmsQueueConnector", rhsJmsQueueConnector), lhsJmsQueueConnector, rhsJmsQueueConnector)) {
                    return false;
                }
            }
            {
                DtoJmsTopicConnector lhsJmsTopicConnector;
                lhsJmsTopicConnector = this.getJmsTopicConnector();
                DtoJmsTopicConnector rhsJmsTopicConnector;
                rhsJmsTopicConnector = that.getJmsTopicConnector();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsTopicConnector", lhsJmsTopicConnector), LocatorUtils.property(thatLocator, "jmsTopicConnector", rhsJmsTopicConnector), lhsJmsTopicConnector, rhsJmsTopicConnector)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}simpleJmsMessageConvertor"/>
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
        "simpleJmsMessageConvertor",
        "any"
    })
    public static class JmsMessageConvertor
        implements Equals, HashCode, ToString
    {

        protected DtoSimpleJmsMessageConvertor simpleJmsMessageConvertor;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡsimpleJmsMessageConvertor���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoSimpleJmsMessageConvertor }
         *     
         */
        public DtoSimpleJmsMessageConvertor getSimpleJmsMessageConvertor() {
            return simpleJmsMessageConvertor;
        }

        /**
         * ����simpleJmsMessageConvertor���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSimpleJmsMessageConvertor }
         *     
         */
        public void setSimpleJmsMessageConvertor(DtoSimpleJmsMessageConvertor value) {
            this.simpleJmsMessageConvertor = value;
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
                DtoSimpleJmsMessageConvertor theSimpleJmsMessageConvertor;
                theSimpleJmsMessageConvertor = this.getSimpleJmsMessageConvertor();
                strategy.appendField(locator, this, "simpleJmsMessageConvertor", buffer, theSimpleJmsMessageConvertor);
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
                DtoSimpleJmsMessageConvertor theSimpleJmsMessageConvertor;
                theSimpleJmsMessageConvertor = this.getSimpleJmsMessageConvertor();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleJmsMessageConvertor", theSimpleJmsMessageConvertor), currentHashCode, theSimpleJmsMessageConvertor);
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
            if (!(object instanceof DtoOutboundTopicBridge.JmsMessageConvertor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundTopicBridge.JmsMessageConvertor that = ((DtoOutboundTopicBridge.JmsMessageConvertor) object);
            {
                DtoSimpleJmsMessageConvertor lhsSimpleJmsMessageConvertor;
                lhsSimpleJmsMessageConvertor = this.getSimpleJmsMessageConvertor();
                DtoSimpleJmsMessageConvertor rhsSimpleJmsMessageConvertor;
                rhsSimpleJmsMessageConvertor = that.getSimpleJmsMessageConvertor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleJmsMessageConvertor", lhsSimpleJmsMessageConvertor), LocatorUtils.property(thatLocator, "simpleJmsMessageConvertor", rhsSimpleJmsMessageConvertor), lhsSimpleJmsMessageConvertor, rhsSimpleJmsMessageConvertor)) {
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
    public static class ProducerConnection
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
            if (!(object instanceof DtoOutboundTopicBridge.ProducerConnection)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundTopicBridge.ProducerConnection that = ((DtoOutboundTopicBridge.ProducerConnection) object);
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
        "topic",
        "any"
    })
    public static class ProducerTopic
        implements Equals, HashCode, ToString
    {

        protected DtoTopic topic;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡtopic���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTopic }
         *     
         */
        public DtoTopic getTopic() {
            return topic;
        }

        /**
         * ����topic���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTopic }
         *     
         */
        public void setTopic(DtoTopic value) {
            this.topic = value;
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
                DtoTopic theTopic;
                theTopic = this.getTopic();
                strategy.appendField(locator, this, "topic", buffer, theTopic);
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
                DtoTopic theTopic;
                theTopic = this.getTopic();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
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
            if (!(object instanceof DtoOutboundTopicBridge.ProducerTopic)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoOutboundTopicBridge.ProducerTopic that = ((DtoOutboundTopicBridge.ProducerTopic) object);
            {
                DtoTopic lhsTopic;
                lhsTopic = this.getTopic();
                DtoTopic rhsTopic;
                rhsTopic = that.getTopic();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
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

}