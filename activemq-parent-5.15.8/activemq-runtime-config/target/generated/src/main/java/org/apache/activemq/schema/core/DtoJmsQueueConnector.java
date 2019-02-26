//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.02.26 时间 09:59:41 AM CST 
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="brokerService" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="inboundMessageConvertor" minOccurs="0">
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
 *           &lt;element name="inboundQueueBridges" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}inboundQueueBridge"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="localQueueConnection" minOccurs="0">
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
 *           &lt;element name="localQueueConnectionFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}connectionFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}xaConnectionFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="outboundMessageConvertor" minOccurs="0">
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
 *           &lt;element name="outboundQueueBridges" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}outboundQueueBridge"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="outboundQueueConnection" minOccurs="0">
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
 *           &lt;element name="outboundQueueConnectionFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}connectionFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}xaConnectionFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="reconnectionPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}reconnectionPolicy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inboundMessageConvertor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jndiLocalTemplate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jndiOutboundTemplate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localClientId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localConnectionFactoryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localQueueConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localQueueConnectionFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="localUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundClientId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundMessageConvertor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundQueueConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundQueueConnectionFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundQueueConnectionFactoryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outboundUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="preferJndiDestinationLookup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="reconnectionPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="replyToDestinationCacheSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "brokerServiceOrInboundMessageConvertorOrInboundQueueBridges"
})
@XmlRootElement(name = "jmsQueueConnector")
public class DtoJmsQueueConnector implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "outboundQueueConnectionFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "localQueueConnection", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inboundQueueBridges", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inboundMessageConvertor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reconnectionPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "localQueueConnectionFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outboundMessageConvertor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outboundQueueConnection", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outboundQueueBridges", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrInboundMessageConvertorOrInboundQueueBridges;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "inboundMessageConvertor")
    protected String inboundMessageConvertor;
    @XmlAttribute(name = "jndiLocalTemplate")
    protected String jndiLocalTemplate;
    @XmlAttribute(name = "jndiOutboundTemplate")
    protected String jndiOutboundTemplate;
    @XmlAttribute(name = "localClientId")
    protected String localClientId;
    @XmlAttribute(name = "localConnectionFactoryName")
    protected String localConnectionFactoryName;
    @XmlAttribute(name = "localPassword")
    protected String localPassword;
    @XmlAttribute(name = "localQueueConnection")
    protected String localQueueConnection;
    @XmlAttribute(name = "localQueueConnectionFactory")
    protected String localQueueConnectionFactory;
    @XmlAttribute(name = "localUsername")
    protected String localUsername;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "outboundClientId")
    protected String outboundClientId;
    @XmlAttribute(name = "outboundMessageConvertor")
    protected String outboundMessageConvertor;
    @XmlAttribute(name = "outboundPassword")
    protected String outboundPassword;
    @XmlAttribute(name = "outboundQueueConnection")
    protected String outboundQueueConnection;
    @XmlAttribute(name = "outboundQueueConnectionFactory")
    protected String outboundQueueConnectionFactory;
    @XmlAttribute(name = "outboundQueueConnectionFactoryName")
    protected String outboundQueueConnectionFactoryName;
    @XmlAttribute(name = "outboundUsername")
    protected String outboundUsername;
    @XmlAttribute(name = "preferJndiDestinationLookup")
    protected Boolean preferJndiDestinationLookup;
    @XmlAttribute(name = "reconnectionPolicy")
    protected String reconnectionPolicy;
    @XmlAttribute(name = "replyToDestinationCacheSize")
    protected BigInteger replyToDestinationCacheSize;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrInboundMessageConvertorOrInboundQueueBridges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrInboundMessageConvertorOrInboundQueueBridges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundQueueConnectionFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.LocalQueueConnection }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.InboundQueueBridges }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.InboundMessageConvertor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.ReconnectionPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.LocalQueueConnectionFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundMessageConvertor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundQueueConnection }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundQueueBridges }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges() {
        if (brokerServiceOrInboundMessageConvertorOrInboundQueueBridges == null) {
            brokerServiceOrInboundMessageConvertorOrInboundQueueBridges = new ArrayList<Object>();
        }
        return this.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges;
    }

    /**
     * 获取brokerService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerService() {
        return brokerService;
    }

    /**
     * 设置brokerService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerService(String value) {
        this.brokerService = value;
    }

    /**
     * 获取inboundMessageConvertor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundMessageConvertor() {
        return inboundMessageConvertor;
    }

    /**
     * 设置inboundMessageConvertor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundMessageConvertor(String value) {
        this.inboundMessageConvertor = value;
    }

    /**
     * 获取jndiLocalTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiLocalTemplate() {
        return jndiLocalTemplate;
    }

    /**
     * 设置jndiLocalTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiLocalTemplate(String value) {
        this.jndiLocalTemplate = value;
    }

    /**
     * 获取jndiOutboundTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiOutboundTemplate() {
        return jndiOutboundTemplate;
    }

    /**
     * 设置jndiOutboundTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiOutboundTemplate(String value) {
        this.jndiOutboundTemplate = value;
    }

    /**
     * 获取localClientId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalClientId() {
        return localClientId;
    }

    /**
     * 设置localClientId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalClientId(String value) {
        this.localClientId = value;
    }

    /**
     * 获取localConnectionFactoryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalConnectionFactoryName() {
        return localConnectionFactoryName;
    }

    /**
     * 设置localConnectionFactoryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalConnectionFactoryName(String value) {
        this.localConnectionFactoryName = value;
    }

    /**
     * 获取localPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPassword() {
        return localPassword;
    }

    /**
     * 设置localPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPassword(String value) {
        this.localPassword = value;
    }

    /**
     * 获取localQueueConnection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalQueueConnection() {
        return localQueueConnection;
    }

    /**
     * 设置localQueueConnection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalQueueConnection(String value) {
        this.localQueueConnection = value;
    }

    /**
     * 获取localQueueConnectionFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalQueueConnectionFactory() {
        return localQueueConnectionFactory;
    }

    /**
     * 设置localQueueConnectionFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalQueueConnectionFactory(String value) {
        this.localQueueConnectionFactory = value;
    }

    /**
     * 获取localUsername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalUsername() {
        return localUsername;
    }

    /**
     * 设置localUsername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalUsername(String value) {
        this.localUsername = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取outboundClientId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundClientId() {
        return outboundClientId;
    }

    /**
     * 设置outboundClientId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundClientId(String value) {
        this.outboundClientId = value;
    }

    /**
     * 获取outboundMessageConvertor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundMessageConvertor() {
        return outboundMessageConvertor;
    }

    /**
     * 设置outboundMessageConvertor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundMessageConvertor(String value) {
        this.outboundMessageConvertor = value;
    }

    /**
     * 获取outboundPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundPassword() {
        return outboundPassword;
    }

    /**
     * 设置outboundPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundPassword(String value) {
        this.outboundPassword = value;
    }

    /**
     * 获取outboundQueueConnection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundQueueConnection() {
        return outboundQueueConnection;
    }

    /**
     * 设置outboundQueueConnection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundQueueConnection(String value) {
        this.outboundQueueConnection = value;
    }

    /**
     * 获取outboundQueueConnectionFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundQueueConnectionFactory() {
        return outboundQueueConnectionFactory;
    }

    /**
     * 设置outboundQueueConnectionFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundQueueConnectionFactory(String value) {
        this.outboundQueueConnectionFactory = value;
    }

    /**
     * 获取outboundQueueConnectionFactoryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundQueueConnectionFactoryName() {
        return outboundQueueConnectionFactoryName;
    }

    /**
     * 设置outboundQueueConnectionFactoryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundQueueConnectionFactoryName(String value) {
        this.outboundQueueConnectionFactoryName = value;
    }

    /**
     * 获取outboundUsername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundUsername() {
        return outboundUsername;
    }

    /**
     * 设置outboundUsername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundUsername(String value) {
        this.outboundUsername = value;
    }

    /**
     * 获取preferJndiDestinationLookup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferJndiDestinationLookup() {
        return preferJndiDestinationLookup;
    }

    /**
     * 设置preferJndiDestinationLookup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferJndiDestinationLookup(Boolean value) {
        this.preferJndiDestinationLookup = value;
    }

    /**
     * 获取reconnectionPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconnectionPolicy() {
        return reconnectionPolicy;
    }

    /**
     * 设置reconnectionPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconnectionPolicy(String value) {
        this.reconnectionPolicy = value;
    }

    /**
     * 获取replyToDestinationCacheSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplyToDestinationCacheSize() {
        return replyToDestinationCacheSize;
    }

    /**
     * 设置replyToDestinationCacheSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplyToDestinationCacheSize(BigInteger value) {
        this.replyToDestinationCacheSize = value;
    }

    /**
     * 获取id属性的值。
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
     * 设置id属性的值。
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
            List<Object> theBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges;
            theBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges = (((this.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges!= null)&&(!this.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges.isEmpty()))?this.getBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges():null);
            strategy.appendField(locator, this, "brokerServiceOrInboundMessageConvertorOrInboundQueueBridges", buffer, theBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            String theInboundMessageConvertor;
            theInboundMessageConvertor = this.getInboundMessageConvertor();
            strategy.appendField(locator, this, "inboundMessageConvertor", buffer, theInboundMessageConvertor);
        }
        {
            String theJndiLocalTemplate;
            theJndiLocalTemplate = this.getJndiLocalTemplate();
            strategy.appendField(locator, this, "jndiLocalTemplate", buffer, theJndiLocalTemplate);
        }
        {
            String theJndiOutboundTemplate;
            theJndiOutboundTemplate = this.getJndiOutboundTemplate();
            strategy.appendField(locator, this, "jndiOutboundTemplate", buffer, theJndiOutboundTemplate);
        }
        {
            String theLocalClientId;
            theLocalClientId = this.getLocalClientId();
            strategy.appendField(locator, this, "localClientId", buffer, theLocalClientId);
        }
        {
            String theLocalConnectionFactoryName;
            theLocalConnectionFactoryName = this.getLocalConnectionFactoryName();
            strategy.appendField(locator, this, "localConnectionFactoryName", buffer, theLocalConnectionFactoryName);
        }
        {
            String theLocalPassword;
            theLocalPassword = this.getLocalPassword();
            strategy.appendField(locator, this, "localPassword", buffer, theLocalPassword);
        }
        {
            String theLocalQueueConnection;
            theLocalQueueConnection = this.getLocalQueueConnection();
            strategy.appendField(locator, this, "localQueueConnection", buffer, theLocalQueueConnection);
        }
        {
            String theLocalQueueConnectionFactory;
            theLocalQueueConnectionFactory = this.getLocalQueueConnectionFactory();
            strategy.appendField(locator, this, "localQueueConnectionFactory", buffer, theLocalQueueConnectionFactory);
        }
        {
            String theLocalUsername;
            theLocalUsername = this.getLocalUsername();
            strategy.appendField(locator, this, "localUsername", buffer, theLocalUsername);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theOutboundClientId;
            theOutboundClientId = this.getOutboundClientId();
            strategy.appendField(locator, this, "outboundClientId", buffer, theOutboundClientId);
        }
        {
            String theOutboundMessageConvertor;
            theOutboundMessageConvertor = this.getOutboundMessageConvertor();
            strategy.appendField(locator, this, "outboundMessageConvertor", buffer, theOutboundMessageConvertor);
        }
        {
            String theOutboundPassword;
            theOutboundPassword = this.getOutboundPassword();
            strategy.appendField(locator, this, "outboundPassword", buffer, theOutboundPassword);
        }
        {
            String theOutboundQueueConnection;
            theOutboundQueueConnection = this.getOutboundQueueConnection();
            strategy.appendField(locator, this, "outboundQueueConnection", buffer, theOutboundQueueConnection);
        }
        {
            String theOutboundQueueConnectionFactory;
            theOutboundQueueConnectionFactory = this.getOutboundQueueConnectionFactory();
            strategy.appendField(locator, this, "outboundQueueConnectionFactory", buffer, theOutboundQueueConnectionFactory);
        }
        {
            String theOutboundQueueConnectionFactoryName;
            theOutboundQueueConnectionFactoryName = this.getOutboundQueueConnectionFactoryName();
            strategy.appendField(locator, this, "outboundQueueConnectionFactoryName", buffer, theOutboundQueueConnectionFactoryName);
        }
        {
            String theOutboundUsername;
            theOutboundUsername = this.getOutboundUsername();
            strategy.appendField(locator, this, "outboundUsername", buffer, theOutboundUsername);
        }
        {
            Boolean thePreferJndiDestinationLookup;
            thePreferJndiDestinationLookup = this.isPreferJndiDestinationLookup();
            strategy.appendField(locator, this, "preferJndiDestinationLookup", buffer, thePreferJndiDestinationLookup);
        }
        {
            String theReconnectionPolicy;
            theReconnectionPolicy = this.getReconnectionPolicy();
            strategy.appendField(locator, this, "reconnectionPolicy", buffer, theReconnectionPolicy);
        }
        {
            BigInteger theReplyToDestinationCacheSize;
            theReplyToDestinationCacheSize = this.getReplyToDestinationCacheSize();
            strategy.appendField(locator, this, "replyToDestinationCacheSize", buffer, theReplyToDestinationCacheSize);
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
            List<Object> theBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges;
            theBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges = (((this.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges!= null)&&(!this.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges.isEmpty()))?this.getBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrInboundMessageConvertorOrInboundQueueBridges", theBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges), currentHashCode, theBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            String theInboundMessageConvertor;
            theInboundMessageConvertor = this.getInboundMessageConvertor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inboundMessageConvertor", theInboundMessageConvertor), currentHashCode, theInboundMessageConvertor);
        }
        {
            String theJndiLocalTemplate;
            theJndiLocalTemplate = this.getJndiLocalTemplate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jndiLocalTemplate", theJndiLocalTemplate), currentHashCode, theJndiLocalTemplate);
        }
        {
            String theJndiOutboundTemplate;
            theJndiOutboundTemplate = this.getJndiOutboundTemplate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jndiOutboundTemplate", theJndiOutboundTemplate), currentHashCode, theJndiOutboundTemplate);
        }
        {
            String theLocalClientId;
            theLocalClientId = this.getLocalClientId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localClientId", theLocalClientId), currentHashCode, theLocalClientId);
        }
        {
            String theLocalConnectionFactoryName;
            theLocalConnectionFactoryName = this.getLocalConnectionFactoryName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localConnectionFactoryName", theLocalConnectionFactoryName), currentHashCode, theLocalConnectionFactoryName);
        }
        {
            String theLocalPassword;
            theLocalPassword = this.getLocalPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localPassword", theLocalPassword), currentHashCode, theLocalPassword);
        }
        {
            String theLocalQueueConnection;
            theLocalQueueConnection = this.getLocalQueueConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localQueueConnection", theLocalQueueConnection), currentHashCode, theLocalQueueConnection);
        }
        {
            String theLocalQueueConnectionFactory;
            theLocalQueueConnectionFactory = this.getLocalQueueConnectionFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localQueueConnectionFactory", theLocalQueueConnectionFactory), currentHashCode, theLocalQueueConnectionFactory);
        }
        {
            String theLocalUsername;
            theLocalUsername = this.getLocalUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localUsername", theLocalUsername), currentHashCode, theLocalUsername);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theOutboundClientId;
            theOutboundClientId = this.getOutboundClientId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundClientId", theOutboundClientId), currentHashCode, theOutboundClientId);
        }
        {
            String theOutboundMessageConvertor;
            theOutboundMessageConvertor = this.getOutboundMessageConvertor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundMessageConvertor", theOutboundMessageConvertor), currentHashCode, theOutboundMessageConvertor);
        }
        {
            String theOutboundPassword;
            theOutboundPassword = this.getOutboundPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundPassword", theOutboundPassword), currentHashCode, theOutboundPassword);
        }
        {
            String theOutboundQueueConnection;
            theOutboundQueueConnection = this.getOutboundQueueConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundQueueConnection", theOutboundQueueConnection), currentHashCode, theOutboundQueueConnection);
        }
        {
            String theOutboundQueueConnectionFactory;
            theOutboundQueueConnectionFactory = this.getOutboundQueueConnectionFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundQueueConnectionFactory", theOutboundQueueConnectionFactory), currentHashCode, theOutboundQueueConnectionFactory);
        }
        {
            String theOutboundQueueConnectionFactoryName;
            theOutboundQueueConnectionFactoryName = this.getOutboundQueueConnectionFactoryName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundQueueConnectionFactoryName", theOutboundQueueConnectionFactoryName), currentHashCode, theOutboundQueueConnectionFactoryName);
        }
        {
            String theOutboundUsername;
            theOutboundUsername = this.getOutboundUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundUsername", theOutboundUsername), currentHashCode, theOutboundUsername);
        }
        {
            Boolean thePreferJndiDestinationLookup;
            thePreferJndiDestinationLookup = this.isPreferJndiDestinationLookup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferJndiDestinationLookup", thePreferJndiDestinationLookup), currentHashCode, thePreferJndiDestinationLookup);
        }
        {
            String theReconnectionPolicy;
            theReconnectionPolicy = this.getReconnectionPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reconnectionPolicy", theReconnectionPolicy), currentHashCode, theReconnectionPolicy);
        }
        {
            BigInteger theReplyToDestinationCacheSize;
            theReplyToDestinationCacheSize = this.getReplyToDestinationCacheSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replyToDestinationCacheSize", theReplyToDestinationCacheSize), currentHashCode, theReplyToDestinationCacheSize);
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
        if (!(object instanceof DtoJmsQueueConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoJmsQueueConnector that = ((DtoJmsQueueConnector) object);
        {
            List<Object> lhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges;
            lhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges = (((this.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges!= null)&&(!this.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges.isEmpty()))?this.getBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges():null);
            List<Object> rhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges;
            rhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges = (((that.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges!= null)&&(!that.brokerServiceOrInboundMessageConvertorOrInboundQueueBridges.isEmpty()))?that.getBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrInboundMessageConvertorOrInboundQueueBridges", lhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges), LocatorUtils.property(thatLocator, "brokerServiceOrInboundMessageConvertorOrInboundQueueBridges", rhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges), lhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges, rhsBrokerServiceOrInboundMessageConvertorOrInboundQueueBridges)) {
                return false;
            }
        }
        {
            String lhsBrokerService;
            lhsBrokerService = this.getBrokerService();
            String rhsBrokerService;
            rhsBrokerService = that.getBrokerService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerService", lhsBrokerService), LocatorUtils.property(thatLocator, "brokerService", rhsBrokerService), lhsBrokerService, rhsBrokerService)) {
                return false;
            }
        }
        {
            String lhsInboundMessageConvertor;
            lhsInboundMessageConvertor = this.getInboundMessageConvertor();
            String rhsInboundMessageConvertor;
            rhsInboundMessageConvertor = that.getInboundMessageConvertor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inboundMessageConvertor", lhsInboundMessageConvertor), LocatorUtils.property(thatLocator, "inboundMessageConvertor", rhsInboundMessageConvertor), lhsInboundMessageConvertor, rhsInboundMessageConvertor)) {
                return false;
            }
        }
        {
            String lhsJndiLocalTemplate;
            lhsJndiLocalTemplate = this.getJndiLocalTemplate();
            String rhsJndiLocalTemplate;
            rhsJndiLocalTemplate = that.getJndiLocalTemplate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jndiLocalTemplate", lhsJndiLocalTemplate), LocatorUtils.property(thatLocator, "jndiLocalTemplate", rhsJndiLocalTemplate), lhsJndiLocalTemplate, rhsJndiLocalTemplate)) {
                return false;
            }
        }
        {
            String lhsJndiOutboundTemplate;
            lhsJndiOutboundTemplate = this.getJndiOutboundTemplate();
            String rhsJndiOutboundTemplate;
            rhsJndiOutboundTemplate = that.getJndiOutboundTemplate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jndiOutboundTemplate", lhsJndiOutboundTemplate), LocatorUtils.property(thatLocator, "jndiOutboundTemplate", rhsJndiOutboundTemplate), lhsJndiOutboundTemplate, rhsJndiOutboundTemplate)) {
                return false;
            }
        }
        {
            String lhsLocalClientId;
            lhsLocalClientId = this.getLocalClientId();
            String rhsLocalClientId;
            rhsLocalClientId = that.getLocalClientId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localClientId", lhsLocalClientId), LocatorUtils.property(thatLocator, "localClientId", rhsLocalClientId), lhsLocalClientId, rhsLocalClientId)) {
                return false;
            }
        }
        {
            String lhsLocalConnectionFactoryName;
            lhsLocalConnectionFactoryName = this.getLocalConnectionFactoryName();
            String rhsLocalConnectionFactoryName;
            rhsLocalConnectionFactoryName = that.getLocalConnectionFactoryName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localConnectionFactoryName", lhsLocalConnectionFactoryName), LocatorUtils.property(thatLocator, "localConnectionFactoryName", rhsLocalConnectionFactoryName), lhsLocalConnectionFactoryName, rhsLocalConnectionFactoryName)) {
                return false;
            }
        }
        {
            String lhsLocalPassword;
            lhsLocalPassword = this.getLocalPassword();
            String rhsLocalPassword;
            rhsLocalPassword = that.getLocalPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localPassword", lhsLocalPassword), LocatorUtils.property(thatLocator, "localPassword", rhsLocalPassword), lhsLocalPassword, rhsLocalPassword)) {
                return false;
            }
        }
        {
            String lhsLocalQueueConnection;
            lhsLocalQueueConnection = this.getLocalQueueConnection();
            String rhsLocalQueueConnection;
            rhsLocalQueueConnection = that.getLocalQueueConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localQueueConnection", lhsLocalQueueConnection), LocatorUtils.property(thatLocator, "localQueueConnection", rhsLocalQueueConnection), lhsLocalQueueConnection, rhsLocalQueueConnection)) {
                return false;
            }
        }
        {
            String lhsLocalQueueConnectionFactory;
            lhsLocalQueueConnectionFactory = this.getLocalQueueConnectionFactory();
            String rhsLocalQueueConnectionFactory;
            rhsLocalQueueConnectionFactory = that.getLocalQueueConnectionFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localQueueConnectionFactory", lhsLocalQueueConnectionFactory), LocatorUtils.property(thatLocator, "localQueueConnectionFactory", rhsLocalQueueConnectionFactory), lhsLocalQueueConnectionFactory, rhsLocalQueueConnectionFactory)) {
                return false;
            }
        }
        {
            String lhsLocalUsername;
            lhsLocalUsername = this.getLocalUsername();
            String rhsLocalUsername;
            rhsLocalUsername = that.getLocalUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localUsername", lhsLocalUsername), LocatorUtils.property(thatLocator, "localUsername", rhsLocalUsername), lhsLocalUsername, rhsLocalUsername)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsOutboundClientId;
            lhsOutboundClientId = this.getOutboundClientId();
            String rhsOutboundClientId;
            rhsOutboundClientId = that.getOutboundClientId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundClientId", lhsOutboundClientId), LocatorUtils.property(thatLocator, "outboundClientId", rhsOutboundClientId), lhsOutboundClientId, rhsOutboundClientId)) {
                return false;
            }
        }
        {
            String lhsOutboundMessageConvertor;
            lhsOutboundMessageConvertor = this.getOutboundMessageConvertor();
            String rhsOutboundMessageConvertor;
            rhsOutboundMessageConvertor = that.getOutboundMessageConvertor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundMessageConvertor", lhsOutboundMessageConvertor), LocatorUtils.property(thatLocator, "outboundMessageConvertor", rhsOutboundMessageConvertor), lhsOutboundMessageConvertor, rhsOutboundMessageConvertor)) {
                return false;
            }
        }
        {
            String lhsOutboundPassword;
            lhsOutboundPassword = this.getOutboundPassword();
            String rhsOutboundPassword;
            rhsOutboundPassword = that.getOutboundPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundPassword", lhsOutboundPassword), LocatorUtils.property(thatLocator, "outboundPassword", rhsOutboundPassword), lhsOutboundPassword, rhsOutboundPassword)) {
                return false;
            }
        }
        {
            String lhsOutboundQueueConnection;
            lhsOutboundQueueConnection = this.getOutboundQueueConnection();
            String rhsOutboundQueueConnection;
            rhsOutboundQueueConnection = that.getOutboundQueueConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundQueueConnection", lhsOutboundQueueConnection), LocatorUtils.property(thatLocator, "outboundQueueConnection", rhsOutboundQueueConnection), lhsOutboundQueueConnection, rhsOutboundQueueConnection)) {
                return false;
            }
        }
        {
            String lhsOutboundQueueConnectionFactory;
            lhsOutboundQueueConnectionFactory = this.getOutboundQueueConnectionFactory();
            String rhsOutboundQueueConnectionFactory;
            rhsOutboundQueueConnectionFactory = that.getOutboundQueueConnectionFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundQueueConnectionFactory", lhsOutboundQueueConnectionFactory), LocatorUtils.property(thatLocator, "outboundQueueConnectionFactory", rhsOutboundQueueConnectionFactory), lhsOutboundQueueConnectionFactory, rhsOutboundQueueConnectionFactory)) {
                return false;
            }
        }
        {
            String lhsOutboundQueueConnectionFactoryName;
            lhsOutboundQueueConnectionFactoryName = this.getOutboundQueueConnectionFactoryName();
            String rhsOutboundQueueConnectionFactoryName;
            rhsOutboundQueueConnectionFactoryName = that.getOutboundQueueConnectionFactoryName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundQueueConnectionFactoryName", lhsOutboundQueueConnectionFactoryName), LocatorUtils.property(thatLocator, "outboundQueueConnectionFactoryName", rhsOutboundQueueConnectionFactoryName), lhsOutboundQueueConnectionFactoryName, rhsOutboundQueueConnectionFactoryName)) {
                return false;
            }
        }
        {
            String lhsOutboundUsername;
            lhsOutboundUsername = this.getOutboundUsername();
            String rhsOutboundUsername;
            rhsOutboundUsername = that.getOutboundUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundUsername", lhsOutboundUsername), LocatorUtils.property(thatLocator, "outboundUsername", rhsOutboundUsername), lhsOutboundUsername, rhsOutboundUsername)) {
                return false;
            }
        }
        {
            Boolean lhsPreferJndiDestinationLookup;
            lhsPreferJndiDestinationLookup = this.isPreferJndiDestinationLookup();
            Boolean rhsPreferJndiDestinationLookup;
            rhsPreferJndiDestinationLookup = that.isPreferJndiDestinationLookup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferJndiDestinationLookup", lhsPreferJndiDestinationLookup), LocatorUtils.property(thatLocator, "preferJndiDestinationLookup", rhsPreferJndiDestinationLookup), lhsPreferJndiDestinationLookup, rhsPreferJndiDestinationLookup)) {
                return false;
            }
        }
        {
            String lhsReconnectionPolicy;
            lhsReconnectionPolicy = this.getReconnectionPolicy();
            String rhsReconnectionPolicy;
            rhsReconnectionPolicy = that.getReconnectionPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reconnectionPolicy", lhsReconnectionPolicy), LocatorUtils.property(thatLocator, "reconnectionPolicy", rhsReconnectionPolicy), lhsReconnectionPolicy, rhsReconnectionPolicy)) {
                return false;
            }
        }
        {
            BigInteger lhsReplyToDestinationCacheSize;
            lhsReplyToDestinationCacheSize = this.getReplyToDestinationCacheSize();
            BigInteger rhsReplyToDestinationCacheSize;
            rhsReplyToDestinationCacheSize = that.getReplyToDestinationCacheSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replyToDestinationCacheSize", lhsReplyToDestinationCacheSize), LocatorUtils.property(thatLocator, "replyToDestinationCacheSize", rhsReplyToDestinationCacheSize), lhsReplyToDestinationCacheSize, rhsReplyToDestinationCacheSize)) {
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}broker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}brokerService"/>
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
        "broker",
        "brokerService",
        "any"
    })
    public static class BrokerService
        implements Equals, HashCode, ToString
    {

        protected DtoBroker broker;
        protected DtoBrokerService brokerService;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取broker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBroker }
         *     
         */
        public DtoBroker getBroker() {
            return broker;
        }

        /**
         * 设置broker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBroker }
         *     
         */
        public void setBroker(DtoBroker value) {
            this.broker = value;
        }

        /**
         * 获取brokerService属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoBrokerService }
         *     
         */
        public DtoBrokerService getBrokerService() {
            return brokerService;
        }

        /**
         * 设置brokerService属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoBrokerService }
         *     
         */
        public void setBrokerService(DtoBrokerService value) {
            this.brokerService = value;
        }

        /**
         * 获取any属性的值。
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
         * 设置any属性的值。
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
                DtoBroker theBroker;
                theBroker = this.getBroker();
                strategy.appendField(locator, this, "broker", buffer, theBroker);
            }
            {
                DtoBrokerService theBrokerService;
                theBrokerService = this.getBrokerService();
                strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
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
                DtoBroker theBroker;
                theBroker = this.getBroker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "broker", theBroker), currentHashCode, theBroker);
            }
            {
                DtoBrokerService theBrokerService;
                theBrokerService = this.getBrokerService();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
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
            if (!(object instanceof DtoJmsQueueConnector.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.BrokerService that = ((DtoJmsQueueConnector.BrokerService) object);
            {
                DtoBroker lhsBroker;
                lhsBroker = this.getBroker();
                DtoBroker rhsBroker;
                rhsBroker = that.getBroker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "broker", lhsBroker), LocatorUtils.property(thatLocator, "broker", rhsBroker), lhsBroker, rhsBroker)) {
                    return false;
                }
            }
            {
                DtoBrokerService lhsBrokerService;
                lhsBrokerService = this.getBrokerService();
                DtoBrokerService rhsBrokerService;
                rhsBrokerService = that.getBrokerService();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerService", lhsBrokerService), LocatorUtils.property(thatLocator, "brokerService", rhsBrokerService), lhsBrokerService, rhsBrokerService)) {
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
    public static class InboundMessageConvertor
        implements Equals, HashCode, ToString
    {

        protected DtoSimpleJmsMessageConvertor simpleJmsMessageConvertor;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取simpleJmsMessageConvertor属性的值。
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
         * 设置simpleJmsMessageConvertor属性的值。
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
         * 获取any属性的值。
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
         * 设置any属性的值。
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
            if (!(object instanceof DtoJmsQueueConnector.InboundMessageConvertor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.InboundMessageConvertor that = ((DtoJmsQueueConnector.InboundMessageConvertor) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}inboundQueueBridge"/>
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
        "inboundQueueBridgeOrAny"
    })
    public static class InboundQueueBridges
        implements Equals, HashCode, ToString
    {

        @XmlElementRef(name = "inboundQueueBridge", namespace = "http://activemq.apache.org/schema/core", type = DtoInboundQueueBridge.class, required = false)
        @XmlAnyElement(lax = true)
        protected List<Object> inboundQueueBridgeOrAny;

        /**
         * Gets the value of the inboundQueueBridgeOrAny property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inboundQueueBridgeOrAny property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInboundQueueBridgeOrAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoInboundQueueBridge }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getInboundQueueBridgeOrAny() {
            if (inboundQueueBridgeOrAny == null) {
                inboundQueueBridgeOrAny = new ArrayList<Object>();
            }
            return this.inboundQueueBridgeOrAny;
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
                List<Object> theInboundQueueBridgeOrAny;
                theInboundQueueBridgeOrAny = (((this.inboundQueueBridgeOrAny!= null)&&(!this.inboundQueueBridgeOrAny.isEmpty()))?this.getInboundQueueBridgeOrAny():null);
                strategy.appendField(locator, this, "inboundQueueBridgeOrAny", buffer, theInboundQueueBridgeOrAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theInboundQueueBridgeOrAny;
                theInboundQueueBridgeOrAny = (((this.inboundQueueBridgeOrAny!= null)&&(!this.inboundQueueBridgeOrAny.isEmpty()))?this.getInboundQueueBridgeOrAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inboundQueueBridgeOrAny", theInboundQueueBridgeOrAny), currentHashCode, theInboundQueueBridgeOrAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoJmsQueueConnector.InboundQueueBridges)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.InboundQueueBridges that = ((DtoJmsQueueConnector.InboundQueueBridges) object);
            {
                List<Object> lhsInboundQueueBridgeOrAny;
                lhsInboundQueueBridgeOrAny = (((this.inboundQueueBridgeOrAny!= null)&&(!this.inboundQueueBridgeOrAny.isEmpty()))?this.getInboundQueueBridgeOrAny():null);
                List<Object> rhsInboundQueueBridgeOrAny;
                rhsInboundQueueBridgeOrAny = (((that.inboundQueueBridgeOrAny!= null)&&(!that.inboundQueueBridgeOrAny.isEmpty()))?that.getInboundQueueBridgeOrAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "inboundQueueBridgeOrAny", lhsInboundQueueBridgeOrAny), LocatorUtils.property(thatLocator, "inboundQueueBridgeOrAny", rhsInboundQueueBridgeOrAny), lhsInboundQueueBridgeOrAny, rhsInboundQueueBridgeOrAny)) {
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
    public static class LocalQueueConnection
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
            if (!(object instanceof DtoJmsQueueConnector.LocalQueueConnection)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.LocalQueueConnection that = ((DtoJmsQueueConnector.LocalQueueConnection) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}connectionFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}xaConnectionFactory"/>
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
        "connectionFactory",
        "xaConnectionFactory",
        "any"
    })
    public static class LocalQueueConnectionFactory
        implements Equals, HashCode, ToString
    {

        protected DtoConnectionFactory connectionFactory;
        protected DtoXaConnectionFactory xaConnectionFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取connectionFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoConnectionFactory }
         *     
         */
        public DtoConnectionFactory getConnectionFactory() {
            return connectionFactory;
        }

        /**
         * 设置connectionFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoConnectionFactory }
         *     
         */
        public void setConnectionFactory(DtoConnectionFactory value) {
            this.connectionFactory = value;
        }

        /**
         * 获取xaConnectionFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoXaConnectionFactory }
         *     
         */
        public DtoXaConnectionFactory getXaConnectionFactory() {
            return xaConnectionFactory;
        }

        /**
         * 设置xaConnectionFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoXaConnectionFactory }
         *     
         */
        public void setXaConnectionFactory(DtoXaConnectionFactory value) {
            this.xaConnectionFactory = value;
        }

        /**
         * 获取any属性的值。
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
         * 设置any属性的值。
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
                DtoConnectionFactory theConnectionFactory;
                theConnectionFactory = this.getConnectionFactory();
                strategy.appendField(locator, this, "connectionFactory", buffer, theConnectionFactory);
            }
            {
                DtoXaConnectionFactory theXaConnectionFactory;
                theXaConnectionFactory = this.getXaConnectionFactory();
                strategy.appendField(locator, this, "xaConnectionFactory", buffer, theXaConnectionFactory);
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
                DtoConnectionFactory theConnectionFactory;
                theConnectionFactory = this.getConnectionFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFactory", theConnectionFactory), currentHashCode, theConnectionFactory);
            }
            {
                DtoXaConnectionFactory theXaConnectionFactory;
                theXaConnectionFactory = this.getXaConnectionFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xaConnectionFactory", theXaConnectionFactory), currentHashCode, theXaConnectionFactory);
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
            if (!(object instanceof DtoJmsQueueConnector.LocalQueueConnectionFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.LocalQueueConnectionFactory that = ((DtoJmsQueueConnector.LocalQueueConnectionFactory) object);
            {
                DtoConnectionFactory lhsConnectionFactory;
                lhsConnectionFactory = this.getConnectionFactory();
                DtoConnectionFactory rhsConnectionFactory;
                rhsConnectionFactory = that.getConnectionFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFactory", lhsConnectionFactory), LocatorUtils.property(thatLocator, "connectionFactory", rhsConnectionFactory), lhsConnectionFactory, rhsConnectionFactory)) {
                    return false;
                }
            }
            {
                DtoXaConnectionFactory lhsXaConnectionFactory;
                lhsXaConnectionFactory = this.getXaConnectionFactory();
                DtoXaConnectionFactory rhsXaConnectionFactory;
                rhsXaConnectionFactory = that.getXaConnectionFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "xaConnectionFactory", lhsXaConnectionFactory), LocatorUtils.property(thatLocator, "xaConnectionFactory", rhsXaConnectionFactory), lhsXaConnectionFactory, rhsXaConnectionFactory)) {
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
    public static class OutboundMessageConvertor
        implements Equals, HashCode, ToString
    {

        protected DtoSimpleJmsMessageConvertor simpleJmsMessageConvertor;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取simpleJmsMessageConvertor属性的值。
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
         * 设置simpleJmsMessageConvertor属性的值。
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
         * 获取any属性的值。
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
         * 设置any属性的值。
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
            if (!(object instanceof DtoJmsQueueConnector.OutboundMessageConvertor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.OutboundMessageConvertor that = ((DtoJmsQueueConnector.OutboundMessageConvertor) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}outboundQueueBridge"/>
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
        "outboundQueueBridgeOrAny"
    })
    public static class OutboundQueueBridges
        implements Equals, HashCode, ToString
    {

        @XmlElementRef(name = "outboundQueueBridge", namespace = "http://activemq.apache.org/schema/core", type = DtoOutboundQueueBridge.class, required = false)
        @XmlAnyElement(lax = true)
        protected List<Object> outboundQueueBridgeOrAny;

        /**
         * Gets the value of the outboundQueueBridgeOrAny property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outboundQueueBridgeOrAny property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutboundQueueBridgeOrAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DtoOutboundQueueBridge }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getOutboundQueueBridgeOrAny() {
            if (outboundQueueBridgeOrAny == null) {
                outboundQueueBridgeOrAny = new ArrayList<Object>();
            }
            return this.outboundQueueBridgeOrAny;
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
                List<Object> theOutboundQueueBridgeOrAny;
                theOutboundQueueBridgeOrAny = (((this.outboundQueueBridgeOrAny!= null)&&(!this.outboundQueueBridgeOrAny.isEmpty()))?this.getOutboundQueueBridgeOrAny():null);
                strategy.appendField(locator, this, "outboundQueueBridgeOrAny", buffer, theOutboundQueueBridgeOrAny);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theOutboundQueueBridgeOrAny;
                theOutboundQueueBridgeOrAny = (((this.outboundQueueBridgeOrAny!= null)&&(!this.outboundQueueBridgeOrAny.isEmpty()))?this.getOutboundQueueBridgeOrAny():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundQueueBridgeOrAny", theOutboundQueueBridgeOrAny), currentHashCode, theOutboundQueueBridgeOrAny);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoJmsQueueConnector.OutboundQueueBridges)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.OutboundQueueBridges that = ((DtoJmsQueueConnector.OutboundQueueBridges) object);
            {
                List<Object> lhsOutboundQueueBridgeOrAny;
                lhsOutboundQueueBridgeOrAny = (((this.outboundQueueBridgeOrAny!= null)&&(!this.outboundQueueBridgeOrAny.isEmpty()))?this.getOutboundQueueBridgeOrAny():null);
                List<Object> rhsOutboundQueueBridgeOrAny;
                rhsOutboundQueueBridgeOrAny = (((that.outboundQueueBridgeOrAny!= null)&&(!that.outboundQueueBridgeOrAny.isEmpty()))?that.getOutboundQueueBridgeOrAny():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundQueueBridgeOrAny", lhsOutboundQueueBridgeOrAny), LocatorUtils.property(thatLocator, "outboundQueueBridgeOrAny", rhsOutboundQueueBridgeOrAny), lhsOutboundQueueBridgeOrAny, rhsOutboundQueueBridgeOrAny)) {
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
    public static class OutboundQueueConnection
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
            if (!(object instanceof DtoJmsQueueConnector.OutboundQueueConnection)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.OutboundQueueConnection that = ((DtoJmsQueueConnector.OutboundQueueConnection) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}connectionFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}xaConnectionFactory"/>
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
        "connectionFactory",
        "xaConnectionFactory",
        "any"
    })
    public static class OutboundQueueConnectionFactory
        implements Equals, HashCode, ToString
    {

        protected DtoConnectionFactory connectionFactory;
        protected DtoXaConnectionFactory xaConnectionFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取connectionFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoConnectionFactory }
         *     
         */
        public DtoConnectionFactory getConnectionFactory() {
            return connectionFactory;
        }

        /**
         * 设置connectionFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoConnectionFactory }
         *     
         */
        public void setConnectionFactory(DtoConnectionFactory value) {
            this.connectionFactory = value;
        }

        /**
         * 获取xaConnectionFactory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoXaConnectionFactory }
         *     
         */
        public DtoXaConnectionFactory getXaConnectionFactory() {
            return xaConnectionFactory;
        }

        /**
         * 设置xaConnectionFactory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoXaConnectionFactory }
         *     
         */
        public void setXaConnectionFactory(DtoXaConnectionFactory value) {
            this.xaConnectionFactory = value;
        }

        /**
         * 获取any属性的值。
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
         * 设置any属性的值。
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
                DtoConnectionFactory theConnectionFactory;
                theConnectionFactory = this.getConnectionFactory();
                strategy.appendField(locator, this, "connectionFactory", buffer, theConnectionFactory);
            }
            {
                DtoXaConnectionFactory theXaConnectionFactory;
                theXaConnectionFactory = this.getXaConnectionFactory();
                strategy.appendField(locator, this, "xaConnectionFactory", buffer, theXaConnectionFactory);
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
                DtoConnectionFactory theConnectionFactory;
                theConnectionFactory = this.getConnectionFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFactory", theConnectionFactory), currentHashCode, theConnectionFactory);
            }
            {
                DtoXaConnectionFactory theXaConnectionFactory;
                theXaConnectionFactory = this.getXaConnectionFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xaConnectionFactory", theXaConnectionFactory), currentHashCode, theXaConnectionFactory);
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
            if (!(object instanceof DtoJmsQueueConnector.OutboundQueueConnectionFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.OutboundQueueConnectionFactory that = ((DtoJmsQueueConnector.OutboundQueueConnectionFactory) object);
            {
                DtoConnectionFactory lhsConnectionFactory;
                lhsConnectionFactory = this.getConnectionFactory();
                DtoConnectionFactory rhsConnectionFactory;
                rhsConnectionFactory = that.getConnectionFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFactory", lhsConnectionFactory), LocatorUtils.property(thatLocator, "connectionFactory", rhsConnectionFactory), lhsConnectionFactory, rhsConnectionFactory)) {
                    return false;
                }
            }
            {
                DtoXaConnectionFactory lhsXaConnectionFactory;
                lhsXaConnectionFactory = this.getXaConnectionFactory();
                DtoXaConnectionFactory rhsXaConnectionFactory;
                rhsXaConnectionFactory = that.getXaConnectionFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "xaConnectionFactory", lhsXaConnectionFactory), LocatorUtils.property(thatLocator, "xaConnectionFactory", rhsXaConnectionFactory), lhsXaConnectionFactory, rhsXaConnectionFactory)) {
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}reconnectionPolicy"/>
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
        "reconnectionPolicy",
        "any"
    })
    public static class ReconnectionPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoReconnectionPolicy reconnectionPolicy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取reconnectionPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoReconnectionPolicy }
         *     
         */
        public DtoReconnectionPolicy getReconnectionPolicy() {
            return reconnectionPolicy;
        }

        /**
         * 设置reconnectionPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoReconnectionPolicy }
         *     
         */
        public void setReconnectionPolicy(DtoReconnectionPolicy value) {
            this.reconnectionPolicy = value;
        }

        /**
         * 获取any属性的值。
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
         * 设置any属性的值。
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
                DtoReconnectionPolicy theReconnectionPolicy;
                theReconnectionPolicy = this.getReconnectionPolicy();
                strategy.appendField(locator, this, "reconnectionPolicy", buffer, theReconnectionPolicy);
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
                DtoReconnectionPolicy theReconnectionPolicy;
                theReconnectionPolicy = this.getReconnectionPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reconnectionPolicy", theReconnectionPolicy), currentHashCode, theReconnectionPolicy);
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
            if (!(object instanceof DtoJmsQueueConnector.ReconnectionPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJmsQueueConnector.ReconnectionPolicy that = ((DtoJmsQueueConnector.ReconnectionPolicy) object);
            {
                DtoReconnectionPolicy lhsReconnectionPolicy;
                lhsReconnectionPolicy = this.getReconnectionPolicy();
                DtoReconnectionPolicy rhsReconnectionPolicy;
                rhsReconnectionPolicy = that.getReconnectionPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "reconnectionPolicy", lhsReconnectionPolicy), LocatorUtils.property(thatLocator, "reconnectionPolicy", rhsReconnectionPolicy), lhsReconnectionPolicy, rhsReconnectionPolicy)) {
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
