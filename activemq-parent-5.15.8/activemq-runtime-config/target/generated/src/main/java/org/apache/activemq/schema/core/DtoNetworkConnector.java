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
 *           &lt;element name="bridgeFactory" minOccurs="0">
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
 *           &lt;element name="connectionFilter" minOccurs="0">
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
 *           &lt;element name="discoveryAgent" minOccurs="0">
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
 *           &lt;element name="durableDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="dynamicallyIncludedDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="excludedDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="staticallyIncludedDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="advisoryAckPercentage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="advisoryForFailedForward" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="advisoryPrefetchSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="alwaysSyncSend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="bridgeFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bridgeTempDestinations" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkDuplicateMessagesOnDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="clientIdToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="conduitNetworkQueueSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="conduitSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="connectionFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumerPriorityBase" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="consumerTTL" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="decreaseNetworkConsumerPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="destinationFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="discoveryAgent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="discoveryURI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dispatchAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="duplex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dynamicOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gcDestinationViews" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="gcSweepTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="localUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageTTL" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="networkTTL" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prefetchSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="staticBridge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="suppressDuplicateQueueSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="suppressDuplicateTopicSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="syncDurableSubs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useBrokerNameAsIdSees" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useCompression" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useVirtualDestSubs" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "networkConnector")
public class DtoNetworkConnector implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "durableDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "connectionFilter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bridgeFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "excludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "staticallyIncludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dynamicallyIncludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discoveryAgent", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> contents;
    @XmlAttribute(name = "advisoryAckPercentage")
    protected BigInteger advisoryAckPercentage;
    @XmlAttribute(name = "advisoryForFailedForward")
    protected Boolean advisoryForFailedForward;
    @XmlAttribute(name = "advisoryPrefetchSize")
    protected BigInteger advisoryPrefetchSize;
    @XmlAttribute(name = "alwaysSyncSend")
    protected Boolean alwaysSyncSend;
    @XmlAttribute(name = "bridgeFactory")
    protected String bridgeFactory;
    @XmlAttribute(name = "bridgeTempDestinations")
    protected Boolean bridgeTempDestinations;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "brokerURL")
    protected String brokerURL;
    @XmlAttribute(name = "checkDuplicateMessagesOnDuplex")
    protected Boolean checkDuplicateMessagesOnDuplex;
    @XmlAttribute(name = "clientIdToken")
    protected String clientIdToken;
    @XmlAttribute(name = "conduitNetworkQueueSubscriptions")
    protected Boolean conduitNetworkQueueSubscriptions;
    @XmlAttribute(name = "conduitSubscriptions")
    protected Boolean conduitSubscriptions;
    @XmlAttribute(name = "connectionFilter")
    protected String connectionFilter;
    @XmlAttribute(name = "consumerPriorityBase")
    protected BigInteger consumerPriorityBase;
    @XmlAttribute(name = "consumerTTL")
    protected BigInteger consumerTTL;
    @XmlAttribute(name = "decreaseNetworkConsumerPriority")
    protected Boolean decreaseNetworkConsumerPriority;
    @XmlAttribute(name = "destinationFilter")
    protected String destinationFilter;
    @XmlAttribute(name = "discoveryAgent")
    protected String discoveryAgent;
    @XmlAttribute(name = "discoveryURI")
    protected String discoveryURI;
    @XmlAttribute(name = "dispatchAsync")
    protected Boolean dispatchAsync;
    @XmlAttribute(name = "duplex")
    protected Boolean duplex;
    @XmlAttribute(name = "dynamicOnly")
    protected Boolean dynamicOnly;
    @XmlAttribute(name = "gcDestinationViews")
    protected Boolean gcDestinationViews;
    @XmlAttribute(name = "gcSweepTime")
    protected Long gcSweepTime;
    @XmlAttribute(name = "localUri")
    protected String localUri;
    @XmlAttribute(name = "messageTTL")
    protected BigInteger messageTTL;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "networkTTL")
    protected BigInteger networkTTL;
    @XmlAttribute(name = "objectName")
    protected String objectName;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "prefetchSize")
    protected String prefetchSize;
    @XmlAttribute(name = "staticBridge")
    protected Boolean staticBridge;
    @XmlAttribute(name = "suppressDuplicateQueueSubscriptions")
    protected Boolean suppressDuplicateQueueSubscriptions;
    @XmlAttribute(name = "suppressDuplicateTopicSubscriptions")
    protected Boolean suppressDuplicateTopicSubscriptions;
    @XmlAttribute(name = "syncDurableSubs")
    protected Boolean syncDurableSubs;
    @XmlAttribute(name = "uri")
    protected String uri;
    @XmlAttribute(name = "useBrokerNameAsIdSees")
    protected Boolean useBrokerNameAsIdSees;
    @XmlAttribute(name = "useCompression")
    protected Boolean useCompression;
    @XmlAttribute(name = "useVirtualDestSubs")
    protected Boolean useVirtualDestSubs;
    @XmlAttribute(name = "userName")
    protected String userName;
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
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.DurableDestinations }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.ConnectionFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.BridgeFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.ExcludedDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.StaticallyIncludedDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.DynamicallyIncludedDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoNetworkConnector.DiscoveryAgent }{@code >}
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
     * 获取advisoryAckPercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvisoryAckPercentage() {
        return advisoryAckPercentage;
    }

    /**
     * 设置advisoryAckPercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdvisoryAckPercentage(BigInteger value) {
        this.advisoryAckPercentage = value;
    }

    /**
     * 获取advisoryForFailedForward属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisoryForFailedForward() {
        return advisoryForFailedForward;
    }

    /**
     * 设置advisoryForFailedForward属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisoryForFailedForward(Boolean value) {
        this.advisoryForFailedForward = value;
    }

    /**
     * 获取advisoryPrefetchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdvisoryPrefetchSize() {
        return advisoryPrefetchSize;
    }

    /**
     * 设置advisoryPrefetchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdvisoryPrefetchSize(BigInteger value) {
        this.advisoryPrefetchSize = value;
    }

    /**
     * 获取alwaysSyncSend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysSyncSend() {
        return alwaysSyncSend;
    }

    /**
     * 设置alwaysSyncSend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysSyncSend(Boolean value) {
        this.alwaysSyncSend = value;
    }

    /**
     * 获取bridgeFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgeFactory() {
        return bridgeFactory;
    }

    /**
     * 设置bridgeFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgeFactory(String value) {
        this.bridgeFactory = value;
    }

    /**
     * 获取bridgeTempDestinations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBridgeTempDestinations() {
        return bridgeTempDestinations;
    }

    /**
     * 设置bridgeTempDestinations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBridgeTempDestinations(Boolean value) {
        this.bridgeTempDestinations = value;
    }

    /**
     * 获取brokerName属性的值。
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
     * 设置brokerName属性的值。
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
     * 获取brokerURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerURL() {
        return brokerURL;
    }

    /**
     * 设置brokerURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerURL(String value) {
        this.brokerURL = value;
    }

    /**
     * 获取checkDuplicateMessagesOnDuplex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckDuplicateMessagesOnDuplex() {
        return checkDuplicateMessagesOnDuplex;
    }

    /**
     * 设置checkDuplicateMessagesOnDuplex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckDuplicateMessagesOnDuplex(Boolean value) {
        this.checkDuplicateMessagesOnDuplex = value;
    }

    /**
     * 获取clientIdToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdToken() {
        return clientIdToken;
    }

    /**
     * 设置clientIdToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdToken(String value) {
        this.clientIdToken = value;
    }

    /**
     * 获取conduitNetworkQueueSubscriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConduitNetworkQueueSubscriptions() {
        return conduitNetworkQueueSubscriptions;
    }

    /**
     * 设置conduitNetworkQueueSubscriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConduitNetworkQueueSubscriptions(Boolean value) {
        this.conduitNetworkQueueSubscriptions = value;
    }

    /**
     * 获取conduitSubscriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConduitSubscriptions() {
        return conduitSubscriptions;
    }

    /**
     * 设置conduitSubscriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConduitSubscriptions(Boolean value) {
        this.conduitSubscriptions = value;
    }

    /**
     * 获取connectionFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionFilter() {
        return connectionFilter;
    }

    /**
     * 设置connectionFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionFilter(String value) {
        this.connectionFilter = value;
    }

    /**
     * 获取consumerPriorityBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumerPriorityBase() {
        return consumerPriorityBase;
    }

    /**
     * 设置consumerPriorityBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumerPriorityBase(BigInteger value) {
        this.consumerPriorityBase = value;
    }

    /**
     * 获取consumerTTL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsumerTTL() {
        return consumerTTL;
    }

    /**
     * 设置consumerTTL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsumerTTL(BigInteger value) {
        this.consumerTTL = value;
    }

    /**
     * 获取decreaseNetworkConsumerPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecreaseNetworkConsumerPriority() {
        return decreaseNetworkConsumerPriority;
    }

    /**
     * 设置decreaseNetworkConsumerPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecreaseNetworkConsumerPriority(Boolean value) {
        this.decreaseNetworkConsumerPriority = value;
    }

    /**
     * 获取destinationFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationFilter() {
        return destinationFilter;
    }

    /**
     * 设置destinationFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationFilter(String value) {
        this.destinationFilter = value;
    }

    /**
     * 获取discoveryAgent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryAgent() {
        return discoveryAgent;
    }

    /**
     * 设置discoveryAgent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryAgent(String value) {
        this.discoveryAgent = value;
    }

    /**
     * 获取discoveryURI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryURI() {
        return discoveryURI;
    }

    /**
     * 设置discoveryURI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryURI(String value) {
        this.discoveryURI = value;
    }

    /**
     * 获取dispatchAsync属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispatchAsync() {
        return dispatchAsync;
    }

    /**
     * 设置dispatchAsync属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatchAsync(Boolean value) {
        this.dispatchAsync = value;
    }

    /**
     * 获取duplex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplex() {
        return duplex;
    }

    /**
     * 设置duplex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplex(Boolean value) {
        this.duplex = value;
    }

    /**
     * 获取dynamicOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicOnly() {
        return dynamicOnly;
    }

    /**
     * 设置dynamicOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicOnly(Boolean value) {
        this.dynamicOnly = value;
    }

    /**
     * 获取gcDestinationViews属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGcDestinationViews() {
        return gcDestinationViews;
    }

    /**
     * 设置gcDestinationViews属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGcDestinationViews(Boolean value) {
        this.gcDestinationViews = value;
    }

    /**
     * 获取gcSweepTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGcSweepTime() {
        return gcSweepTime;
    }

    /**
     * 设置gcSweepTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGcSweepTime(Long value) {
        this.gcSweepTime = value;
    }

    /**
     * 获取localUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalUri() {
        return localUri;
    }

    /**
     * 设置localUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalUri(String value) {
        this.localUri = value;
    }

    /**
     * 获取messageTTL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageTTL() {
        return messageTTL;
    }

    /**
     * 设置messageTTL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageTTL(BigInteger value) {
        this.messageTTL = value;
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
     * 获取networkTTL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetworkTTL() {
        return networkTTL;
    }

    /**
     * 设置networkTTL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetworkTTL(BigInteger value) {
        this.networkTTL = value;
    }

    /**
     * 获取objectName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * 设置objectName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取prefetchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefetchSize() {
        return prefetchSize;
    }

    /**
     * 设置prefetchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefetchSize(String value) {
        this.prefetchSize = value;
    }

    /**
     * 获取staticBridge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaticBridge() {
        return staticBridge;
    }

    /**
     * 设置staticBridge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaticBridge(Boolean value) {
        this.staticBridge = value;
    }

    /**
     * 获取suppressDuplicateQueueSubscriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressDuplicateQueueSubscriptions() {
        return suppressDuplicateQueueSubscriptions;
    }

    /**
     * 设置suppressDuplicateQueueSubscriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressDuplicateQueueSubscriptions(Boolean value) {
        this.suppressDuplicateQueueSubscriptions = value;
    }

    /**
     * 获取suppressDuplicateTopicSubscriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressDuplicateTopicSubscriptions() {
        return suppressDuplicateTopicSubscriptions;
    }

    /**
     * 设置suppressDuplicateTopicSubscriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressDuplicateTopicSubscriptions(Boolean value) {
        this.suppressDuplicateTopicSubscriptions = value;
    }

    /**
     * 获取syncDurableSubs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncDurableSubs() {
        return syncDurableSubs;
    }

    /**
     * 设置syncDurableSubs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncDurableSubs(Boolean value) {
        this.syncDurableSubs = value;
    }

    /**
     * 获取uri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置uri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * 获取useBrokerNameAsIdSees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBrokerNameAsIdSees() {
        return useBrokerNameAsIdSees;
    }

    /**
     * 设置useBrokerNameAsIdSees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBrokerNameAsIdSees(Boolean value) {
        this.useBrokerNameAsIdSees = value;
    }

    /**
     * 获取useCompression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCompression() {
        return useCompression;
    }

    /**
     * 设置useCompression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCompression(Boolean value) {
        this.useCompression = value;
    }

    /**
     * 获取useVirtualDestSubs属性的值。
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
     * 设置useVirtualDestSubs属性的值。
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
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
            List<Object> theContents;
            theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            strategy.appendField(locator, this, "contents", buffer, theContents);
        }
        {
            BigInteger theAdvisoryAckPercentage;
            theAdvisoryAckPercentage = this.getAdvisoryAckPercentage();
            strategy.appendField(locator, this, "advisoryAckPercentage", buffer, theAdvisoryAckPercentage);
        }
        {
            Boolean theAdvisoryForFailedForward;
            theAdvisoryForFailedForward = this.isAdvisoryForFailedForward();
            strategy.appendField(locator, this, "advisoryForFailedForward", buffer, theAdvisoryForFailedForward);
        }
        {
            BigInteger theAdvisoryPrefetchSize;
            theAdvisoryPrefetchSize = this.getAdvisoryPrefetchSize();
            strategy.appendField(locator, this, "advisoryPrefetchSize", buffer, theAdvisoryPrefetchSize);
        }
        {
            Boolean theAlwaysSyncSend;
            theAlwaysSyncSend = this.isAlwaysSyncSend();
            strategy.appendField(locator, this, "alwaysSyncSend", buffer, theAlwaysSyncSend);
        }
        {
            String theBridgeFactory;
            theBridgeFactory = this.getBridgeFactory();
            strategy.appendField(locator, this, "bridgeFactory", buffer, theBridgeFactory);
        }
        {
            Boolean theBridgeTempDestinations;
            theBridgeTempDestinations = this.isBridgeTempDestinations();
            strategy.appendField(locator, this, "bridgeTempDestinations", buffer, theBridgeTempDestinations);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            strategy.appendField(locator, this, "brokerName", buffer, theBrokerName);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            String theBrokerURL;
            theBrokerURL = this.getBrokerURL();
            strategy.appendField(locator, this, "brokerURL", buffer, theBrokerURL);
        }
        {
            Boolean theCheckDuplicateMessagesOnDuplex;
            theCheckDuplicateMessagesOnDuplex = this.isCheckDuplicateMessagesOnDuplex();
            strategy.appendField(locator, this, "checkDuplicateMessagesOnDuplex", buffer, theCheckDuplicateMessagesOnDuplex);
        }
        {
            String theClientIdToken;
            theClientIdToken = this.getClientIdToken();
            strategy.appendField(locator, this, "clientIdToken", buffer, theClientIdToken);
        }
        {
            Boolean theConduitNetworkQueueSubscriptions;
            theConduitNetworkQueueSubscriptions = this.isConduitNetworkQueueSubscriptions();
            strategy.appendField(locator, this, "conduitNetworkQueueSubscriptions", buffer, theConduitNetworkQueueSubscriptions);
        }
        {
            Boolean theConduitSubscriptions;
            theConduitSubscriptions = this.isConduitSubscriptions();
            strategy.appendField(locator, this, "conduitSubscriptions", buffer, theConduitSubscriptions);
        }
        {
            String theConnectionFilter;
            theConnectionFilter = this.getConnectionFilter();
            strategy.appendField(locator, this, "connectionFilter", buffer, theConnectionFilter);
        }
        {
            BigInteger theConsumerPriorityBase;
            theConsumerPriorityBase = this.getConsumerPriorityBase();
            strategy.appendField(locator, this, "consumerPriorityBase", buffer, theConsumerPriorityBase);
        }
        {
            BigInteger theConsumerTTL;
            theConsumerTTL = this.getConsumerTTL();
            strategy.appendField(locator, this, "consumerTTL", buffer, theConsumerTTL);
        }
        {
            Boolean theDecreaseNetworkConsumerPriority;
            theDecreaseNetworkConsumerPriority = this.isDecreaseNetworkConsumerPriority();
            strategy.appendField(locator, this, "decreaseNetworkConsumerPriority", buffer, theDecreaseNetworkConsumerPriority);
        }
        {
            String theDestinationFilter;
            theDestinationFilter = this.getDestinationFilter();
            strategy.appendField(locator, this, "destinationFilter", buffer, theDestinationFilter);
        }
        {
            String theDiscoveryAgent;
            theDiscoveryAgent = this.getDiscoveryAgent();
            strategy.appendField(locator, this, "discoveryAgent", buffer, theDiscoveryAgent);
        }
        {
            String theDiscoveryURI;
            theDiscoveryURI = this.getDiscoveryURI();
            strategy.appendField(locator, this, "discoveryURI", buffer, theDiscoveryURI);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            strategy.appendField(locator, this, "dispatchAsync", buffer, theDispatchAsync);
        }
        {
            Boolean theDuplex;
            theDuplex = this.isDuplex();
            strategy.appendField(locator, this, "duplex", buffer, theDuplex);
        }
        {
            Boolean theDynamicOnly;
            theDynamicOnly = this.isDynamicOnly();
            strategy.appendField(locator, this, "dynamicOnly", buffer, theDynamicOnly);
        }
        {
            Boolean theGcDestinationViews;
            theGcDestinationViews = this.isGcDestinationViews();
            strategy.appendField(locator, this, "gcDestinationViews", buffer, theGcDestinationViews);
        }
        {
            Long theGcSweepTime;
            theGcSweepTime = this.getGcSweepTime();
            strategy.appendField(locator, this, "gcSweepTime", buffer, theGcSweepTime);
        }
        {
            String theLocalUri;
            theLocalUri = this.getLocalUri();
            strategy.appendField(locator, this, "localUri", buffer, theLocalUri);
        }
        {
            BigInteger theMessageTTL;
            theMessageTTL = this.getMessageTTL();
            strategy.appendField(locator, this, "messageTTL", buffer, theMessageTTL);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            BigInteger theNetworkTTL;
            theNetworkTTL = this.getNetworkTTL();
            strategy.appendField(locator, this, "networkTTL", buffer, theNetworkTTL);
        }
        {
            String theObjectName;
            theObjectName = this.getObjectName();
            strategy.appendField(locator, this, "objectName", buffer, theObjectName);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword);
        }
        {
            String thePrefetchSize;
            thePrefetchSize = this.getPrefetchSize();
            strategy.appendField(locator, this, "prefetchSize", buffer, thePrefetchSize);
        }
        {
            Boolean theStaticBridge;
            theStaticBridge = this.isStaticBridge();
            strategy.appendField(locator, this, "staticBridge", buffer, theStaticBridge);
        }
        {
            Boolean theSuppressDuplicateQueueSubscriptions;
            theSuppressDuplicateQueueSubscriptions = this.isSuppressDuplicateQueueSubscriptions();
            strategy.appendField(locator, this, "suppressDuplicateQueueSubscriptions", buffer, theSuppressDuplicateQueueSubscriptions);
        }
        {
            Boolean theSuppressDuplicateTopicSubscriptions;
            theSuppressDuplicateTopicSubscriptions = this.isSuppressDuplicateTopicSubscriptions();
            strategy.appendField(locator, this, "suppressDuplicateTopicSubscriptions", buffer, theSuppressDuplicateTopicSubscriptions);
        }
        {
            Boolean theSyncDurableSubs;
            theSyncDurableSubs = this.isSyncDurableSubs();
            strategy.appendField(locator, this, "syncDurableSubs", buffer, theSyncDurableSubs);
        }
        {
            String theUri;
            theUri = this.getUri();
            strategy.appendField(locator, this, "uri", buffer, theUri);
        }
        {
            Boolean theUseBrokerNameAsIdSees;
            theUseBrokerNameAsIdSees = this.isUseBrokerNameAsIdSees();
            strategy.appendField(locator, this, "useBrokerNameAsIdSees", buffer, theUseBrokerNameAsIdSees);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            strategy.appendField(locator, this, "useCompression", buffer, theUseCompression);
        }
        {
            Boolean theUseVirtualDestSubs;
            theUseVirtualDestSubs = this.isUseVirtualDestSubs();
            strategy.appendField(locator, this, "useVirtualDestSubs", buffer, theUseVirtualDestSubs);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            strategy.appendField(locator, this, "userName", buffer, theUserName);
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
            BigInteger theAdvisoryAckPercentage;
            theAdvisoryAckPercentage = this.getAdvisoryAckPercentage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryAckPercentage", theAdvisoryAckPercentage), currentHashCode, theAdvisoryAckPercentage);
        }
        {
            Boolean theAdvisoryForFailedForward;
            theAdvisoryForFailedForward = this.isAdvisoryForFailedForward();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryForFailedForward", theAdvisoryForFailedForward), currentHashCode, theAdvisoryForFailedForward);
        }
        {
            BigInteger theAdvisoryPrefetchSize;
            theAdvisoryPrefetchSize = this.getAdvisoryPrefetchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisoryPrefetchSize", theAdvisoryPrefetchSize), currentHashCode, theAdvisoryPrefetchSize);
        }
        {
            Boolean theAlwaysSyncSend;
            theAlwaysSyncSend = this.isAlwaysSyncSend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alwaysSyncSend", theAlwaysSyncSend), currentHashCode, theAlwaysSyncSend);
        }
        {
            String theBridgeFactory;
            theBridgeFactory = this.getBridgeFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bridgeFactory", theBridgeFactory), currentHashCode, theBridgeFactory);
        }
        {
            Boolean theBridgeTempDestinations;
            theBridgeTempDestinations = this.isBridgeTempDestinations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bridgeTempDestinations", theBridgeTempDestinations), currentHashCode, theBridgeTempDestinations);
        }
        {
            String theBrokerName;
            theBrokerName = this.getBrokerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerName", theBrokerName), currentHashCode, theBrokerName);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            String theBrokerURL;
            theBrokerURL = this.getBrokerURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerURL", theBrokerURL), currentHashCode, theBrokerURL);
        }
        {
            Boolean theCheckDuplicateMessagesOnDuplex;
            theCheckDuplicateMessagesOnDuplex = this.isCheckDuplicateMessagesOnDuplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkDuplicateMessagesOnDuplex", theCheckDuplicateMessagesOnDuplex), currentHashCode, theCheckDuplicateMessagesOnDuplex);
        }
        {
            String theClientIdToken;
            theClientIdToken = this.getClientIdToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientIdToken", theClientIdToken), currentHashCode, theClientIdToken);
        }
        {
            Boolean theConduitNetworkQueueSubscriptions;
            theConduitNetworkQueueSubscriptions = this.isConduitNetworkQueueSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conduitNetworkQueueSubscriptions", theConduitNetworkQueueSubscriptions), currentHashCode, theConduitNetworkQueueSubscriptions);
        }
        {
            Boolean theConduitSubscriptions;
            theConduitSubscriptions = this.isConduitSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conduitSubscriptions", theConduitSubscriptions), currentHashCode, theConduitSubscriptions);
        }
        {
            String theConnectionFilter;
            theConnectionFilter = this.getConnectionFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFilter", theConnectionFilter), currentHashCode, theConnectionFilter);
        }
        {
            BigInteger theConsumerPriorityBase;
            theConsumerPriorityBase = this.getConsumerPriorityBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerPriorityBase", theConsumerPriorityBase), currentHashCode, theConsumerPriorityBase);
        }
        {
            BigInteger theConsumerTTL;
            theConsumerTTL = this.getConsumerTTL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerTTL", theConsumerTTL), currentHashCode, theConsumerTTL);
        }
        {
            Boolean theDecreaseNetworkConsumerPriority;
            theDecreaseNetworkConsumerPriority = this.isDecreaseNetworkConsumerPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decreaseNetworkConsumerPriority", theDecreaseNetworkConsumerPriority), currentHashCode, theDecreaseNetworkConsumerPriority);
        }
        {
            String theDestinationFilter;
            theDestinationFilter = this.getDestinationFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationFilter", theDestinationFilter), currentHashCode, theDestinationFilter);
        }
        {
            String theDiscoveryAgent;
            theDiscoveryAgent = this.getDiscoveryAgent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discoveryAgent", theDiscoveryAgent), currentHashCode, theDiscoveryAgent);
        }
        {
            String theDiscoveryURI;
            theDiscoveryURI = this.getDiscoveryURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discoveryURI", theDiscoveryURI), currentHashCode, theDiscoveryURI);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispatchAsync", theDispatchAsync), currentHashCode, theDispatchAsync);
        }
        {
            Boolean theDuplex;
            theDuplex = this.isDuplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duplex", theDuplex), currentHashCode, theDuplex);
        }
        {
            Boolean theDynamicOnly;
            theDynamicOnly = this.isDynamicOnly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dynamicOnly", theDynamicOnly), currentHashCode, theDynamicOnly);
        }
        {
            Boolean theGcDestinationViews;
            theGcDestinationViews = this.isGcDestinationViews();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gcDestinationViews", theGcDestinationViews), currentHashCode, theGcDestinationViews);
        }
        {
            Long theGcSweepTime;
            theGcSweepTime = this.getGcSweepTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gcSweepTime", theGcSweepTime), currentHashCode, theGcSweepTime);
        }
        {
            String theLocalUri;
            theLocalUri = this.getLocalUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localUri", theLocalUri), currentHashCode, theLocalUri);
        }
        {
            BigInteger theMessageTTL;
            theMessageTTL = this.getMessageTTL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageTTL", theMessageTTL), currentHashCode, theMessageTTL);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            BigInteger theNetworkTTL;
            theNetworkTTL = this.getNetworkTTL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkTTL", theNetworkTTL), currentHashCode, theNetworkTTL);
        }
        {
            String theObjectName;
            theObjectName = this.getObjectName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectName", theObjectName), currentHashCode, theObjectName);
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "password", thePassword), currentHashCode, thePassword);
        }
        {
            String thePrefetchSize;
            thePrefetchSize = this.getPrefetchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefetchSize", thePrefetchSize), currentHashCode, thePrefetchSize);
        }
        {
            Boolean theStaticBridge;
            theStaticBridge = this.isStaticBridge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staticBridge", theStaticBridge), currentHashCode, theStaticBridge);
        }
        {
            Boolean theSuppressDuplicateQueueSubscriptions;
            theSuppressDuplicateQueueSubscriptions = this.isSuppressDuplicateQueueSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suppressDuplicateQueueSubscriptions", theSuppressDuplicateQueueSubscriptions), currentHashCode, theSuppressDuplicateQueueSubscriptions);
        }
        {
            Boolean theSuppressDuplicateTopicSubscriptions;
            theSuppressDuplicateTopicSubscriptions = this.isSuppressDuplicateTopicSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suppressDuplicateTopicSubscriptions", theSuppressDuplicateTopicSubscriptions), currentHashCode, theSuppressDuplicateTopicSubscriptions);
        }
        {
            Boolean theSyncDurableSubs;
            theSyncDurableSubs = this.isSyncDurableSubs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncDurableSubs", theSyncDurableSubs), currentHashCode, theSyncDurableSubs);
        }
        {
            String theUri;
            theUri = this.getUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theUri), currentHashCode, theUri);
        }
        {
            Boolean theUseBrokerNameAsIdSees;
            theUseBrokerNameAsIdSees = this.isUseBrokerNameAsIdSees();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useBrokerNameAsIdSees", theUseBrokerNameAsIdSees), currentHashCode, theUseBrokerNameAsIdSees);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useCompression", theUseCompression), currentHashCode, theUseCompression);
        }
        {
            Boolean theUseVirtualDestSubs;
            theUseVirtualDestSubs = this.isUseVirtualDestSubs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useVirtualDestSubs", theUseVirtualDestSubs), currentHashCode, theUseVirtualDestSubs);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userName", theUserName), currentHashCode, theUserName);
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
        if (!(object instanceof DtoNetworkConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoNetworkConnector that = ((DtoNetworkConnector) object);
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
            BigInteger lhsAdvisoryAckPercentage;
            lhsAdvisoryAckPercentage = this.getAdvisoryAckPercentage();
            BigInteger rhsAdvisoryAckPercentage;
            rhsAdvisoryAckPercentage = that.getAdvisoryAckPercentage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryAckPercentage", lhsAdvisoryAckPercentage), LocatorUtils.property(thatLocator, "advisoryAckPercentage", rhsAdvisoryAckPercentage), lhsAdvisoryAckPercentage, rhsAdvisoryAckPercentage)) {
                return false;
            }
        }
        {
            Boolean lhsAdvisoryForFailedForward;
            lhsAdvisoryForFailedForward = this.isAdvisoryForFailedForward();
            Boolean rhsAdvisoryForFailedForward;
            rhsAdvisoryForFailedForward = that.isAdvisoryForFailedForward();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryForFailedForward", lhsAdvisoryForFailedForward), LocatorUtils.property(thatLocator, "advisoryForFailedForward", rhsAdvisoryForFailedForward), lhsAdvisoryForFailedForward, rhsAdvisoryForFailedForward)) {
                return false;
            }
        }
        {
            BigInteger lhsAdvisoryPrefetchSize;
            lhsAdvisoryPrefetchSize = this.getAdvisoryPrefetchSize();
            BigInteger rhsAdvisoryPrefetchSize;
            rhsAdvisoryPrefetchSize = that.getAdvisoryPrefetchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisoryPrefetchSize", lhsAdvisoryPrefetchSize), LocatorUtils.property(thatLocator, "advisoryPrefetchSize", rhsAdvisoryPrefetchSize), lhsAdvisoryPrefetchSize, rhsAdvisoryPrefetchSize)) {
                return false;
            }
        }
        {
            Boolean lhsAlwaysSyncSend;
            lhsAlwaysSyncSend = this.isAlwaysSyncSend();
            Boolean rhsAlwaysSyncSend;
            rhsAlwaysSyncSend = that.isAlwaysSyncSend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alwaysSyncSend", lhsAlwaysSyncSend), LocatorUtils.property(thatLocator, "alwaysSyncSend", rhsAlwaysSyncSend), lhsAlwaysSyncSend, rhsAlwaysSyncSend)) {
                return false;
            }
        }
        {
            String lhsBridgeFactory;
            lhsBridgeFactory = this.getBridgeFactory();
            String rhsBridgeFactory;
            rhsBridgeFactory = that.getBridgeFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bridgeFactory", lhsBridgeFactory), LocatorUtils.property(thatLocator, "bridgeFactory", rhsBridgeFactory), lhsBridgeFactory, rhsBridgeFactory)) {
                return false;
            }
        }
        {
            Boolean lhsBridgeTempDestinations;
            lhsBridgeTempDestinations = this.isBridgeTempDestinations();
            Boolean rhsBridgeTempDestinations;
            rhsBridgeTempDestinations = that.isBridgeTempDestinations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bridgeTempDestinations", lhsBridgeTempDestinations), LocatorUtils.property(thatLocator, "bridgeTempDestinations", rhsBridgeTempDestinations), lhsBridgeTempDestinations, rhsBridgeTempDestinations)) {
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
            String lhsBrokerService;
            lhsBrokerService = this.getBrokerService();
            String rhsBrokerService;
            rhsBrokerService = that.getBrokerService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerService", lhsBrokerService), LocatorUtils.property(thatLocator, "brokerService", rhsBrokerService), lhsBrokerService, rhsBrokerService)) {
                return false;
            }
        }
        {
            String lhsBrokerURL;
            lhsBrokerURL = this.getBrokerURL();
            String rhsBrokerURL;
            rhsBrokerURL = that.getBrokerURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerURL", lhsBrokerURL), LocatorUtils.property(thatLocator, "brokerURL", rhsBrokerURL), lhsBrokerURL, rhsBrokerURL)) {
                return false;
            }
        }
        {
            Boolean lhsCheckDuplicateMessagesOnDuplex;
            lhsCheckDuplicateMessagesOnDuplex = this.isCheckDuplicateMessagesOnDuplex();
            Boolean rhsCheckDuplicateMessagesOnDuplex;
            rhsCheckDuplicateMessagesOnDuplex = that.isCheckDuplicateMessagesOnDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkDuplicateMessagesOnDuplex", lhsCheckDuplicateMessagesOnDuplex), LocatorUtils.property(thatLocator, "checkDuplicateMessagesOnDuplex", rhsCheckDuplicateMessagesOnDuplex), lhsCheckDuplicateMessagesOnDuplex, rhsCheckDuplicateMessagesOnDuplex)) {
                return false;
            }
        }
        {
            String lhsClientIdToken;
            lhsClientIdToken = this.getClientIdToken();
            String rhsClientIdToken;
            rhsClientIdToken = that.getClientIdToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientIdToken", lhsClientIdToken), LocatorUtils.property(thatLocator, "clientIdToken", rhsClientIdToken), lhsClientIdToken, rhsClientIdToken)) {
                return false;
            }
        }
        {
            Boolean lhsConduitNetworkQueueSubscriptions;
            lhsConduitNetworkQueueSubscriptions = this.isConduitNetworkQueueSubscriptions();
            Boolean rhsConduitNetworkQueueSubscriptions;
            rhsConduitNetworkQueueSubscriptions = that.isConduitNetworkQueueSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conduitNetworkQueueSubscriptions", lhsConduitNetworkQueueSubscriptions), LocatorUtils.property(thatLocator, "conduitNetworkQueueSubscriptions", rhsConduitNetworkQueueSubscriptions), lhsConduitNetworkQueueSubscriptions, rhsConduitNetworkQueueSubscriptions)) {
                return false;
            }
        }
        {
            Boolean lhsConduitSubscriptions;
            lhsConduitSubscriptions = this.isConduitSubscriptions();
            Boolean rhsConduitSubscriptions;
            rhsConduitSubscriptions = that.isConduitSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conduitSubscriptions", lhsConduitSubscriptions), LocatorUtils.property(thatLocator, "conduitSubscriptions", rhsConduitSubscriptions), lhsConduitSubscriptions, rhsConduitSubscriptions)) {
                return false;
            }
        }
        {
            String lhsConnectionFilter;
            lhsConnectionFilter = this.getConnectionFilter();
            String rhsConnectionFilter;
            rhsConnectionFilter = that.getConnectionFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFilter", lhsConnectionFilter), LocatorUtils.property(thatLocator, "connectionFilter", rhsConnectionFilter), lhsConnectionFilter, rhsConnectionFilter)) {
                return false;
            }
        }
        {
            BigInteger lhsConsumerPriorityBase;
            lhsConsumerPriorityBase = this.getConsumerPriorityBase();
            BigInteger rhsConsumerPriorityBase;
            rhsConsumerPriorityBase = that.getConsumerPriorityBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerPriorityBase", lhsConsumerPriorityBase), LocatorUtils.property(thatLocator, "consumerPriorityBase", rhsConsumerPriorityBase), lhsConsumerPriorityBase, rhsConsumerPriorityBase)) {
                return false;
            }
        }
        {
            BigInteger lhsConsumerTTL;
            lhsConsumerTTL = this.getConsumerTTL();
            BigInteger rhsConsumerTTL;
            rhsConsumerTTL = that.getConsumerTTL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerTTL", lhsConsumerTTL), LocatorUtils.property(thatLocator, "consumerTTL", rhsConsumerTTL), lhsConsumerTTL, rhsConsumerTTL)) {
                return false;
            }
        }
        {
            Boolean lhsDecreaseNetworkConsumerPriority;
            lhsDecreaseNetworkConsumerPriority = this.isDecreaseNetworkConsumerPriority();
            Boolean rhsDecreaseNetworkConsumerPriority;
            rhsDecreaseNetworkConsumerPriority = that.isDecreaseNetworkConsumerPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decreaseNetworkConsumerPriority", lhsDecreaseNetworkConsumerPriority), LocatorUtils.property(thatLocator, "decreaseNetworkConsumerPriority", rhsDecreaseNetworkConsumerPriority), lhsDecreaseNetworkConsumerPriority, rhsDecreaseNetworkConsumerPriority)) {
                return false;
            }
        }
        {
            String lhsDestinationFilter;
            lhsDestinationFilter = this.getDestinationFilter();
            String rhsDestinationFilter;
            rhsDestinationFilter = that.getDestinationFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationFilter", lhsDestinationFilter), LocatorUtils.property(thatLocator, "destinationFilter", rhsDestinationFilter), lhsDestinationFilter, rhsDestinationFilter)) {
                return false;
            }
        }
        {
            String lhsDiscoveryAgent;
            lhsDiscoveryAgent = this.getDiscoveryAgent();
            String rhsDiscoveryAgent;
            rhsDiscoveryAgent = that.getDiscoveryAgent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discoveryAgent", lhsDiscoveryAgent), LocatorUtils.property(thatLocator, "discoveryAgent", rhsDiscoveryAgent), lhsDiscoveryAgent, rhsDiscoveryAgent)) {
                return false;
            }
        }
        {
            String lhsDiscoveryURI;
            lhsDiscoveryURI = this.getDiscoveryURI();
            String rhsDiscoveryURI;
            rhsDiscoveryURI = that.getDiscoveryURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discoveryURI", lhsDiscoveryURI), LocatorUtils.property(thatLocator, "discoveryURI", rhsDiscoveryURI), lhsDiscoveryURI, rhsDiscoveryURI)) {
                return false;
            }
        }
        {
            Boolean lhsDispatchAsync;
            lhsDispatchAsync = this.isDispatchAsync();
            Boolean rhsDispatchAsync;
            rhsDispatchAsync = that.isDispatchAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispatchAsync", lhsDispatchAsync), LocatorUtils.property(thatLocator, "dispatchAsync", rhsDispatchAsync), lhsDispatchAsync, rhsDispatchAsync)) {
                return false;
            }
        }
        {
            Boolean lhsDuplex;
            lhsDuplex = this.isDuplex();
            Boolean rhsDuplex;
            rhsDuplex = that.isDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duplex", lhsDuplex), LocatorUtils.property(thatLocator, "duplex", rhsDuplex), lhsDuplex, rhsDuplex)) {
                return false;
            }
        }
        {
            Boolean lhsDynamicOnly;
            lhsDynamicOnly = this.isDynamicOnly();
            Boolean rhsDynamicOnly;
            rhsDynamicOnly = that.isDynamicOnly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dynamicOnly", lhsDynamicOnly), LocatorUtils.property(thatLocator, "dynamicOnly", rhsDynamicOnly), lhsDynamicOnly, rhsDynamicOnly)) {
                return false;
            }
        }
        {
            Boolean lhsGcDestinationViews;
            lhsGcDestinationViews = this.isGcDestinationViews();
            Boolean rhsGcDestinationViews;
            rhsGcDestinationViews = that.isGcDestinationViews();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gcDestinationViews", lhsGcDestinationViews), LocatorUtils.property(thatLocator, "gcDestinationViews", rhsGcDestinationViews), lhsGcDestinationViews, rhsGcDestinationViews)) {
                return false;
            }
        }
        {
            Long lhsGcSweepTime;
            lhsGcSweepTime = this.getGcSweepTime();
            Long rhsGcSweepTime;
            rhsGcSweepTime = that.getGcSweepTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gcSweepTime", lhsGcSweepTime), LocatorUtils.property(thatLocator, "gcSweepTime", rhsGcSweepTime), lhsGcSweepTime, rhsGcSweepTime)) {
                return false;
            }
        }
        {
            String lhsLocalUri;
            lhsLocalUri = this.getLocalUri();
            String rhsLocalUri;
            rhsLocalUri = that.getLocalUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localUri", lhsLocalUri), LocatorUtils.property(thatLocator, "localUri", rhsLocalUri), lhsLocalUri, rhsLocalUri)) {
                return false;
            }
        }
        {
            BigInteger lhsMessageTTL;
            lhsMessageTTL = this.getMessageTTL();
            BigInteger rhsMessageTTL;
            rhsMessageTTL = that.getMessageTTL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageTTL", lhsMessageTTL), LocatorUtils.property(thatLocator, "messageTTL", rhsMessageTTL), lhsMessageTTL, rhsMessageTTL)) {
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
            BigInteger lhsNetworkTTL;
            lhsNetworkTTL = this.getNetworkTTL();
            BigInteger rhsNetworkTTL;
            rhsNetworkTTL = that.getNetworkTTL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkTTL", lhsNetworkTTL), LocatorUtils.property(thatLocator, "networkTTL", rhsNetworkTTL), lhsNetworkTTL, rhsNetworkTTL)) {
                return false;
            }
        }
        {
            String lhsObjectName;
            lhsObjectName = this.getObjectName();
            String rhsObjectName;
            rhsObjectName = that.getObjectName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectName", lhsObjectName), LocatorUtils.property(thatLocator, "objectName", rhsObjectName), lhsObjectName, rhsObjectName)) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword)) {
                return false;
            }
        }
        {
            String lhsPrefetchSize;
            lhsPrefetchSize = this.getPrefetchSize();
            String rhsPrefetchSize;
            rhsPrefetchSize = that.getPrefetchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prefetchSize", lhsPrefetchSize), LocatorUtils.property(thatLocator, "prefetchSize", rhsPrefetchSize), lhsPrefetchSize, rhsPrefetchSize)) {
                return false;
            }
        }
        {
            Boolean lhsStaticBridge;
            lhsStaticBridge = this.isStaticBridge();
            Boolean rhsStaticBridge;
            rhsStaticBridge = that.isStaticBridge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staticBridge", lhsStaticBridge), LocatorUtils.property(thatLocator, "staticBridge", rhsStaticBridge), lhsStaticBridge, rhsStaticBridge)) {
                return false;
            }
        }
        {
            Boolean lhsSuppressDuplicateQueueSubscriptions;
            lhsSuppressDuplicateQueueSubscriptions = this.isSuppressDuplicateQueueSubscriptions();
            Boolean rhsSuppressDuplicateQueueSubscriptions;
            rhsSuppressDuplicateQueueSubscriptions = that.isSuppressDuplicateQueueSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suppressDuplicateQueueSubscriptions", lhsSuppressDuplicateQueueSubscriptions), LocatorUtils.property(thatLocator, "suppressDuplicateQueueSubscriptions", rhsSuppressDuplicateQueueSubscriptions), lhsSuppressDuplicateQueueSubscriptions, rhsSuppressDuplicateQueueSubscriptions)) {
                return false;
            }
        }
        {
            Boolean lhsSuppressDuplicateTopicSubscriptions;
            lhsSuppressDuplicateTopicSubscriptions = this.isSuppressDuplicateTopicSubscriptions();
            Boolean rhsSuppressDuplicateTopicSubscriptions;
            rhsSuppressDuplicateTopicSubscriptions = that.isSuppressDuplicateTopicSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suppressDuplicateTopicSubscriptions", lhsSuppressDuplicateTopicSubscriptions), LocatorUtils.property(thatLocator, "suppressDuplicateTopicSubscriptions", rhsSuppressDuplicateTopicSubscriptions), lhsSuppressDuplicateTopicSubscriptions, rhsSuppressDuplicateTopicSubscriptions)) {
                return false;
            }
        }
        {
            Boolean lhsSyncDurableSubs;
            lhsSyncDurableSubs = this.isSyncDurableSubs();
            Boolean rhsSyncDurableSubs;
            rhsSyncDurableSubs = that.isSyncDurableSubs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncDurableSubs", lhsSyncDurableSubs), LocatorUtils.property(thatLocator, "syncDurableSubs", rhsSyncDurableSubs), lhsSyncDurableSubs, rhsSyncDurableSubs)) {
                return false;
            }
        }
        {
            String lhsUri;
            lhsUri = this.getUri();
            String rhsUri;
            rhsUri = that.getUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsUri), LocatorUtils.property(thatLocator, "uri", rhsUri), lhsUri, rhsUri)) {
                return false;
            }
        }
        {
            Boolean lhsUseBrokerNameAsIdSees;
            lhsUseBrokerNameAsIdSees = this.isUseBrokerNameAsIdSees();
            Boolean rhsUseBrokerNameAsIdSees;
            rhsUseBrokerNameAsIdSees = that.isUseBrokerNameAsIdSees();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useBrokerNameAsIdSees", lhsUseBrokerNameAsIdSees), LocatorUtils.property(thatLocator, "useBrokerNameAsIdSees", rhsUseBrokerNameAsIdSees), lhsUseBrokerNameAsIdSees, rhsUseBrokerNameAsIdSees)) {
                return false;
            }
        }
        {
            Boolean lhsUseCompression;
            lhsUseCompression = this.isUseCompression();
            Boolean rhsUseCompression;
            rhsUseCompression = that.isUseCompression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useCompression", lhsUseCompression), LocatorUtils.property(thatLocator, "useCompression", rhsUseCompression), lhsUseCompression, rhsUseCompression)) {
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
            String lhsUserName;
            lhsUserName = this.getUserName();
            String rhsUserName;
            rhsUserName = that.getUserName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userName", lhsUserName), LocatorUtils.property(thatLocator, "userName", rhsUserName), lhsUserName, rhsUserName)) {
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
    public static class BridgeFactory
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
            if (!(object instanceof DtoNetworkConnector.BridgeFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.BridgeFactory that = ((DtoNetworkConnector.BridgeFactory) object);
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
            if (!(object instanceof DtoNetworkConnector.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.BrokerService that = ((DtoNetworkConnector.BrokerService) object);
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
    public static class ConnectionFilter
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
            if (!(object instanceof DtoNetworkConnector.ConnectionFilter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.ConnectionFilter that = ((DtoNetworkConnector.ConnectionFilter) object);
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
    public static class DiscoveryAgent
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
            if (!(object instanceof DtoNetworkConnector.DiscoveryAgent)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.DiscoveryAgent that = ((DtoNetworkConnector.DiscoveryAgent) object);
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
        "contents"
    })
    public static class DurableDestinations
        implements Equals, HashCode, ToString
    {

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
            if (!(object instanceof DtoNetworkConnector.DurableDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.DurableDestinations that = ((DtoNetworkConnector.DurableDestinations) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
        "contents"
    })
    public static class DynamicallyIncludedDestinations
        implements Equals, HashCode, ToString
    {

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
            if (!(object instanceof DtoNetworkConnector.DynamicallyIncludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.DynamicallyIncludedDestinations that = ((DtoNetworkConnector.DynamicallyIncludedDestinations) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
        "contents"
    })
    public static class ExcludedDestinations
        implements Equals, HashCode, ToString
    {

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
            if (!(object instanceof DtoNetworkConnector.ExcludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.ExcludedDestinations that = ((DtoNetworkConnector.ExcludedDestinations) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
        "contents"
    })
    public static class StaticallyIncludedDestinations
        implements Equals, HashCode, ToString
    {

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
            if (!(object instanceof DtoNetworkConnector.StaticallyIncludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoNetworkConnector.StaticallyIncludedDestinations that = ((DtoNetworkConnector.StaticallyIncludedDestinations) object);
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

}
