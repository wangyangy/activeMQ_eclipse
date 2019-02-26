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
 *           &lt;element name="brokerInfo" minOccurs="0">
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
 *           &lt;element name="publishedAddressPolicy" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}publishedAddressPolicy"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="server" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="allowLinkStealing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="auditNetworkProducers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="brokerInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disableAsyncDispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="discoveryAgent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="discoveryUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enableStatusMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maximumConsumersAllowedPerConnection" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maximumProducersAllowedPerConnection" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="messageAuthorizationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publishedAddressPolicy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rebalanceClusterClients" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskRunnerFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateClusterClients" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="updateClusterClientsOnRemove" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="updateClusterFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "brokerInfoOrBrokerServiceOrDiscoveryAgent"
})
@XmlRootElement(name = "transportConnector")
public class DtoTransportConnector implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "publishedAddressPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "discoveryAgent", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskRunnerFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "messageAuthorizationPolicy", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brokerInfo", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "server", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> brokerInfoOrBrokerServiceOrDiscoveryAgent;
    @XmlAttribute(name = "allowLinkStealing")
    protected Boolean allowLinkStealing;
    @XmlAttribute(name = "auditNetworkProducers")
    protected Boolean auditNetworkProducers;
    @XmlAttribute(name = "brokerInfo")
    protected String brokerInfo;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "disableAsyncDispatch")
    protected Boolean disableAsyncDispatch;
    @XmlAttribute(name = "discoveryAgent")
    protected String discoveryAgent;
    @XmlAttribute(name = "discoveryUri")
    protected String discoveryUri;
    @XmlAttribute(name = "enableStatusMonitor")
    protected Boolean enableStatusMonitor;
    @XmlAttribute(name = "maximumConsumersAllowedPerConnection")
    protected BigInteger maximumConsumersAllowedPerConnection;
    @XmlAttribute(name = "maximumProducersAllowedPerConnection")
    protected BigInteger maximumProducersAllowedPerConnection;
    @XmlAttribute(name = "messageAuthorizationPolicy")
    protected String messageAuthorizationPolicy;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "publishedAddressPolicy")
    protected String publishedAddressPolicy;
    @XmlAttribute(name = "rebalanceClusterClients")
    protected Boolean rebalanceClusterClients;
    @XmlAttribute(name = "server")
    protected String server;
    @XmlAttribute(name = "taskRunnerFactory")
    protected String taskRunnerFactory;
    @XmlAttribute(name = "updateClusterClients")
    protected Boolean updateClusterClients;
    @XmlAttribute(name = "updateClusterClientsOnRemove")
    protected Boolean updateClusterClientsOnRemove;
    @XmlAttribute(name = "updateClusterFilter")
    protected String updateClusterFilter;
    @XmlAttribute(name = "uri")
    protected String uri;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerInfoOrBrokerServiceOrDiscoveryAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerInfoOrBrokerServiceOrDiscoveryAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerInfoOrBrokerServiceOrDiscoveryAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoTransportConnector.PublishedAddressPolicy }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoTransportConnector.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTransportConnector.DiscoveryAgent }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTransportConnector.TaskRunnerFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTransportConnector.MessageAuthorizationPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTransportConnector.BrokerInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoTransportConnector.Server }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerInfoOrBrokerServiceOrDiscoveryAgent() {
        if (brokerInfoOrBrokerServiceOrDiscoveryAgent == null) {
            brokerInfoOrBrokerServiceOrDiscoveryAgent = new ArrayList<Object>();
        }
        return this.brokerInfoOrBrokerServiceOrDiscoveryAgent;
    }

    /**
     * 获取allowLinkStealing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowLinkStealing() {
        return allowLinkStealing;
    }

    /**
     * 设置allowLinkStealing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowLinkStealing(Boolean value) {
        this.allowLinkStealing = value;
    }

    /**
     * 获取auditNetworkProducers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditNetworkProducers() {
        return auditNetworkProducers;
    }

    /**
     * 设置auditNetworkProducers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditNetworkProducers(Boolean value) {
        this.auditNetworkProducers = value;
    }

    /**
     * 获取brokerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerInfo() {
        return brokerInfo;
    }

    /**
     * 设置brokerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerInfo(String value) {
        this.brokerInfo = value;
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
     * 获取disableAsyncDispatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableAsyncDispatch() {
        return disableAsyncDispatch;
    }

    /**
     * 设置disableAsyncDispatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableAsyncDispatch(Boolean value) {
        this.disableAsyncDispatch = value;
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
     * 获取discoveryUri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryUri() {
        return discoveryUri;
    }

    /**
     * 设置discoveryUri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryUri(String value) {
        this.discoveryUri = value;
    }

    /**
     * 获取enableStatusMonitor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableStatusMonitor() {
        return enableStatusMonitor;
    }

    /**
     * 设置enableStatusMonitor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableStatusMonitor(Boolean value) {
        this.enableStatusMonitor = value;
    }

    /**
     * 获取maximumConsumersAllowedPerConnection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumConsumersAllowedPerConnection() {
        return maximumConsumersAllowedPerConnection;
    }

    /**
     * 设置maximumConsumersAllowedPerConnection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumConsumersAllowedPerConnection(BigInteger value) {
        this.maximumConsumersAllowedPerConnection = value;
    }

    /**
     * 获取maximumProducersAllowedPerConnection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumProducersAllowedPerConnection() {
        return maximumProducersAllowedPerConnection;
    }

    /**
     * 设置maximumProducersAllowedPerConnection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumProducersAllowedPerConnection(BigInteger value) {
        this.maximumProducersAllowedPerConnection = value;
    }

    /**
     * 获取messageAuthorizationPolicy属性的值。
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
     * 设置messageAuthorizationPolicy属性的值。
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
     * 获取publishedAddressPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedAddressPolicy() {
        return publishedAddressPolicy;
    }

    /**
     * 设置publishedAddressPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedAddressPolicy(String value) {
        this.publishedAddressPolicy = value;
    }

    /**
     * 获取rebalanceClusterClients属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRebalanceClusterClients() {
        return rebalanceClusterClients;
    }

    /**
     * 设置rebalanceClusterClients属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRebalanceClusterClients(Boolean value) {
        this.rebalanceClusterClients = value;
    }

    /**
     * 获取server属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * 设置server属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * 获取taskRunnerFactory属性的值。
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
     * 设置taskRunnerFactory属性的值。
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
     * 获取updateClusterClients属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateClusterClients() {
        return updateClusterClients;
    }

    /**
     * 设置updateClusterClients属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateClusterClients(Boolean value) {
        this.updateClusterClients = value;
    }

    /**
     * 获取updateClusterClientsOnRemove属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateClusterClientsOnRemove() {
        return updateClusterClientsOnRemove;
    }

    /**
     * 设置updateClusterClientsOnRemove属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateClusterClientsOnRemove(Boolean value) {
        this.updateClusterClientsOnRemove = value;
    }

    /**
     * 获取updateClusterFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateClusterFilter() {
        return updateClusterFilter;
    }

    /**
     * 设置updateClusterFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateClusterFilter(String value) {
        this.updateClusterFilter = value;
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
            List<Object> theBrokerInfoOrBrokerServiceOrDiscoveryAgent;
            theBrokerInfoOrBrokerServiceOrDiscoveryAgent = (((this.brokerInfoOrBrokerServiceOrDiscoveryAgent!= null)&&(!this.brokerInfoOrBrokerServiceOrDiscoveryAgent.isEmpty()))?this.getBrokerInfoOrBrokerServiceOrDiscoveryAgent():null);
            strategy.appendField(locator, this, "brokerInfoOrBrokerServiceOrDiscoveryAgent", buffer, theBrokerInfoOrBrokerServiceOrDiscoveryAgent);
        }
        {
            Boolean theAllowLinkStealing;
            theAllowLinkStealing = this.isAllowLinkStealing();
            strategy.appendField(locator, this, "allowLinkStealing", buffer, theAllowLinkStealing);
        }
        {
            Boolean theAuditNetworkProducers;
            theAuditNetworkProducers = this.isAuditNetworkProducers();
            strategy.appendField(locator, this, "auditNetworkProducers", buffer, theAuditNetworkProducers);
        }
        {
            String theBrokerInfo;
            theBrokerInfo = this.getBrokerInfo();
            strategy.appendField(locator, this, "brokerInfo", buffer, theBrokerInfo);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            Boolean theDisableAsyncDispatch;
            theDisableAsyncDispatch = this.isDisableAsyncDispatch();
            strategy.appendField(locator, this, "disableAsyncDispatch", buffer, theDisableAsyncDispatch);
        }
        {
            String theDiscoveryAgent;
            theDiscoveryAgent = this.getDiscoveryAgent();
            strategy.appendField(locator, this, "discoveryAgent", buffer, theDiscoveryAgent);
        }
        {
            String theDiscoveryUri;
            theDiscoveryUri = this.getDiscoveryUri();
            strategy.appendField(locator, this, "discoveryUri", buffer, theDiscoveryUri);
        }
        {
            Boolean theEnableStatusMonitor;
            theEnableStatusMonitor = this.isEnableStatusMonitor();
            strategy.appendField(locator, this, "enableStatusMonitor", buffer, theEnableStatusMonitor);
        }
        {
            BigInteger theMaximumConsumersAllowedPerConnection;
            theMaximumConsumersAllowedPerConnection = this.getMaximumConsumersAllowedPerConnection();
            strategy.appendField(locator, this, "maximumConsumersAllowedPerConnection", buffer, theMaximumConsumersAllowedPerConnection);
        }
        {
            BigInteger theMaximumProducersAllowedPerConnection;
            theMaximumProducersAllowedPerConnection = this.getMaximumProducersAllowedPerConnection();
            strategy.appendField(locator, this, "maximumProducersAllowedPerConnection", buffer, theMaximumProducersAllowedPerConnection);
        }
        {
            String theMessageAuthorizationPolicy;
            theMessageAuthorizationPolicy = this.getMessageAuthorizationPolicy();
            strategy.appendField(locator, this, "messageAuthorizationPolicy", buffer, theMessageAuthorizationPolicy);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String thePublishedAddressPolicy;
            thePublishedAddressPolicy = this.getPublishedAddressPolicy();
            strategy.appendField(locator, this, "publishedAddressPolicy", buffer, thePublishedAddressPolicy);
        }
        {
            Boolean theRebalanceClusterClients;
            theRebalanceClusterClients = this.isRebalanceClusterClients();
            strategy.appendField(locator, this, "rebalanceClusterClients", buffer, theRebalanceClusterClients);
        }
        {
            String theServer;
            theServer = this.getServer();
            strategy.appendField(locator, this, "server", buffer, theServer);
        }
        {
            String theTaskRunnerFactory;
            theTaskRunnerFactory = this.getTaskRunnerFactory();
            strategy.appendField(locator, this, "taskRunnerFactory", buffer, theTaskRunnerFactory);
        }
        {
            Boolean theUpdateClusterClients;
            theUpdateClusterClients = this.isUpdateClusterClients();
            strategy.appendField(locator, this, "updateClusterClients", buffer, theUpdateClusterClients);
        }
        {
            Boolean theUpdateClusterClientsOnRemove;
            theUpdateClusterClientsOnRemove = this.isUpdateClusterClientsOnRemove();
            strategy.appendField(locator, this, "updateClusterClientsOnRemove", buffer, theUpdateClusterClientsOnRemove);
        }
        {
            String theUpdateClusterFilter;
            theUpdateClusterFilter = this.getUpdateClusterFilter();
            strategy.appendField(locator, this, "updateClusterFilter", buffer, theUpdateClusterFilter);
        }
        {
            String theUri;
            theUri = this.getUri();
            strategy.appendField(locator, this, "uri", buffer, theUri);
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
            List<Object> theBrokerInfoOrBrokerServiceOrDiscoveryAgent;
            theBrokerInfoOrBrokerServiceOrDiscoveryAgent = (((this.brokerInfoOrBrokerServiceOrDiscoveryAgent!= null)&&(!this.brokerInfoOrBrokerServiceOrDiscoveryAgent.isEmpty()))?this.getBrokerInfoOrBrokerServiceOrDiscoveryAgent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerInfoOrBrokerServiceOrDiscoveryAgent", theBrokerInfoOrBrokerServiceOrDiscoveryAgent), currentHashCode, theBrokerInfoOrBrokerServiceOrDiscoveryAgent);
        }
        {
            Boolean theAllowLinkStealing;
            theAllowLinkStealing = this.isAllowLinkStealing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowLinkStealing", theAllowLinkStealing), currentHashCode, theAllowLinkStealing);
        }
        {
            Boolean theAuditNetworkProducers;
            theAuditNetworkProducers = this.isAuditNetworkProducers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auditNetworkProducers", theAuditNetworkProducers), currentHashCode, theAuditNetworkProducers);
        }
        {
            String theBrokerInfo;
            theBrokerInfo = this.getBrokerInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerInfo", theBrokerInfo), currentHashCode, theBrokerInfo);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            Boolean theDisableAsyncDispatch;
            theDisableAsyncDispatch = this.isDisableAsyncDispatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disableAsyncDispatch", theDisableAsyncDispatch), currentHashCode, theDisableAsyncDispatch);
        }
        {
            String theDiscoveryAgent;
            theDiscoveryAgent = this.getDiscoveryAgent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discoveryAgent", theDiscoveryAgent), currentHashCode, theDiscoveryAgent);
        }
        {
            String theDiscoveryUri;
            theDiscoveryUri = this.getDiscoveryUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discoveryUri", theDiscoveryUri), currentHashCode, theDiscoveryUri);
        }
        {
            Boolean theEnableStatusMonitor;
            theEnableStatusMonitor = this.isEnableStatusMonitor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableStatusMonitor", theEnableStatusMonitor), currentHashCode, theEnableStatusMonitor);
        }
        {
            BigInteger theMaximumConsumersAllowedPerConnection;
            theMaximumConsumersAllowedPerConnection = this.getMaximumConsumersAllowedPerConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumConsumersAllowedPerConnection", theMaximumConsumersAllowedPerConnection), currentHashCode, theMaximumConsumersAllowedPerConnection);
        }
        {
            BigInteger theMaximumProducersAllowedPerConnection;
            theMaximumProducersAllowedPerConnection = this.getMaximumProducersAllowedPerConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumProducersAllowedPerConnection", theMaximumProducersAllowedPerConnection), currentHashCode, theMaximumProducersAllowedPerConnection);
        }
        {
            String theMessageAuthorizationPolicy;
            theMessageAuthorizationPolicy = this.getMessageAuthorizationPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageAuthorizationPolicy", theMessageAuthorizationPolicy), currentHashCode, theMessageAuthorizationPolicy);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String thePublishedAddressPolicy;
            thePublishedAddressPolicy = this.getPublishedAddressPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publishedAddressPolicy", thePublishedAddressPolicy), currentHashCode, thePublishedAddressPolicy);
        }
        {
            Boolean theRebalanceClusterClients;
            theRebalanceClusterClients = this.isRebalanceClusterClients();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rebalanceClusterClients", theRebalanceClusterClients), currentHashCode, theRebalanceClusterClients);
        }
        {
            String theServer;
            theServer = this.getServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "server", theServer), currentHashCode, theServer);
        }
        {
            String theTaskRunnerFactory;
            theTaskRunnerFactory = this.getTaskRunnerFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerFactory", theTaskRunnerFactory), currentHashCode, theTaskRunnerFactory);
        }
        {
            Boolean theUpdateClusterClients;
            theUpdateClusterClients = this.isUpdateClusterClients();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateClusterClients", theUpdateClusterClients), currentHashCode, theUpdateClusterClients);
        }
        {
            Boolean theUpdateClusterClientsOnRemove;
            theUpdateClusterClientsOnRemove = this.isUpdateClusterClientsOnRemove();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateClusterClientsOnRemove", theUpdateClusterClientsOnRemove), currentHashCode, theUpdateClusterClientsOnRemove);
        }
        {
            String theUpdateClusterFilter;
            theUpdateClusterFilter = this.getUpdateClusterFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateClusterFilter", theUpdateClusterFilter), currentHashCode, theUpdateClusterFilter);
        }
        {
            String theUri;
            theUri = this.getUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theUri), currentHashCode, theUri);
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
        if (!(object instanceof DtoTransportConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoTransportConnector that = ((DtoTransportConnector) object);
        {
            List<Object> lhsBrokerInfoOrBrokerServiceOrDiscoveryAgent;
            lhsBrokerInfoOrBrokerServiceOrDiscoveryAgent = (((this.brokerInfoOrBrokerServiceOrDiscoveryAgent!= null)&&(!this.brokerInfoOrBrokerServiceOrDiscoveryAgent.isEmpty()))?this.getBrokerInfoOrBrokerServiceOrDiscoveryAgent():null);
            List<Object> rhsBrokerInfoOrBrokerServiceOrDiscoveryAgent;
            rhsBrokerInfoOrBrokerServiceOrDiscoveryAgent = (((that.brokerInfoOrBrokerServiceOrDiscoveryAgent!= null)&&(!that.brokerInfoOrBrokerServiceOrDiscoveryAgent.isEmpty()))?that.getBrokerInfoOrBrokerServiceOrDiscoveryAgent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerInfoOrBrokerServiceOrDiscoveryAgent", lhsBrokerInfoOrBrokerServiceOrDiscoveryAgent), LocatorUtils.property(thatLocator, "brokerInfoOrBrokerServiceOrDiscoveryAgent", rhsBrokerInfoOrBrokerServiceOrDiscoveryAgent), lhsBrokerInfoOrBrokerServiceOrDiscoveryAgent, rhsBrokerInfoOrBrokerServiceOrDiscoveryAgent)) {
                return false;
            }
        }
        {
            Boolean lhsAllowLinkStealing;
            lhsAllowLinkStealing = this.isAllowLinkStealing();
            Boolean rhsAllowLinkStealing;
            rhsAllowLinkStealing = that.isAllowLinkStealing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowLinkStealing", lhsAllowLinkStealing), LocatorUtils.property(thatLocator, "allowLinkStealing", rhsAllowLinkStealing), lhsAllowLinkStealing, rhsAllowLinkStealing)) {
                return false;
            }
        }
        {
            Boolean lhsAuditNetworkProducers;
            lhsAuditNetworkProducers = this.isAuditNetworkProducers();
            Boolean rhsAuditNetworkProducers;
            rhsAuditNetworkProducers = that.isAuditNetworkProducers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auditNetworkProducers", lhsAuditNetworkProducers), LocatorUtils.property(thatLocator, "auditNetworkProducers", rhsAuditNetworkProducers), lhsAuditNetworkProducers, rhsAuditNetworkProducers)) {
                return false;
            }
        }
        {
            String lhsBrokerInfo;
            lhsBrokerInfo = this.getBrokerInfo();
            String rhsBrokerInfo;
            rhsBrokerInfo = that.getBrokerInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerInfo", lhsBrokerInfo), LocatorUtils.property(thatLocator, "brokerInfo", rhsBrokerInfo), lhsBrokerInfo, rhsBrokerInfo)) {
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
            Boolean lhsDisableAsyncDispatch;
            lhsDisableAsyncDispatch = this.isDisableAsyncDispatch();
            Boolean rhsDisableAsyncDispatch;
            rhsDisableAsyncDispatch = that.isDisableAsyncDispatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disableAsyncDispatch", lhsDisableAsyncDispatch), LocatorUtils.property(thatLocator, "disableAsyncDispatch", rhsDisableAsyncDispatch), lhsDisableAsyncDispatch, rhsDisableAsyncDispatch)) {
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
            String lhsDiscoveryUri;
            lhsDiscoveryUri = this.getDiscoveryUri();
            String rhsDiscoveryUri;
            rhsDiscoveryUri = that.getDiscoveryUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discoveryUri", lhsDiscoveryUri), LocatorUtils.property(thatLocator, "discoveryUri", rhsDiscoveryUri), lhsDiscoveryUri, rhsDiscoveryUri)) {
                return false;
            }
        }
        {
            Boolean lhsEnableStatusMonitor;
            lhsEnableStatusMonitor = this.isEnableStatusMonitor();
            Boolean rhsEnableStatusMonitor;
            rhsEnableStatusMonitor = that.isEnableStatusMonitor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableStatusMonitor", lhsEnableStatusMonitor), LocatorUtils.property(thatLocator, "enableStatusMonitor", rhsEnableStatusMonitor), lhsEnableStatusMonitor, rhsEnableStatusMonitor)) {
                return false;
            }
        }
        {
            BigInteger lhsMaximumConsumersAllowedPerConnection;
            lhsMaximumConsumersAllowedPerConnection = this.getMaximumConsumersAllowedPerConnection();
            BigInteger rhsMaximumConsumersAllowedPerConnection;
            rhsMaximumConsumersAllowedPerConnection = that.getMaximumConsumersAllowedPerConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumConsumersAllowedPerConnection", lhsMaximumConsumersAllowedPerConnection), LocatorUtils.property(thatLocator, "maximumConsumersAllowedPerConnection", rhsMaximumConsumersAllowedPerConnection), lhsMaximumConsumersAllowedPerConnection, rhsMaximumConsumersAllowedPerConnection)) {
                return false;
            }
        }
        {
            BigInteger lhsMaximumProducersAllowedPerConnection;
            lhsMaximumProducersAllowedPerConnection = this.getMaximumProducersAllowedPerConnection();
            BigInteger rhsMaximumProducersAllowedPerConnection;
            rhsMaximumProducersAllowedPerConnection = that.getMaximumProducersAllowedPerConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumProducersAllowedPerConnection", lhsMaximumProducersAllowedPerConnection), LocatorUtils.property(thatLocator, "maximumProducersAllowedPerConnection", rhsMaximumProducersAllowedPerConnection), lhsMaximumProducersAllowedPerConnection, rhsMaximumProducersAllowedPerConnection)) {
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsPublishedAddressPolicy;
            lhsPublishedAddressPolicy = this.getPublishedAddressPolicy();
            String rhsPublishedAddressPolicy;
            rhsPublishedAddressPolicy = that.getPublishedAddressPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishedAddressPolicy", lhsPublishedAddressPolicy), LocatorUtils.property(thatLocator, "publishedAddressPolicy", rhsPublishedAddressPolicy), lhsPublishedAddressPolicy, rhsPublishedAddressPolicy)) {
                return false;
            }
        }
        {
            Boolean lhsRebalanceClusterClients;
            lhsRebalanceClusterClients = this.isRebalanceClusterClients();
            Boolean rhsRebalanceClusterClients;
            rhsRebalanceClusterClients = that.isRebalanceClusterClients();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rebalanceClusterClients", lhsRebalanceClusterClients), LocatorUtils.property(thatLocator, "rebalanceClusterClients", rhsRebalanceClusterClients), lhsRebalanceClusterClients, rhsRebalanceClusterClients)) {
                return false;
            }
        }
        {
            String lhsServer;
            lhsServer = this.getServer();
            String rhsServer;
            rhsServer = that.getServer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "server", lhsServer), LocatorUtils.property(thatLocator, "server", rhsServer), lhsServer, rhsServer)) {
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
            Boolean lhsUpdateClusterClients;
            lhsUpdateClusterClients = this.isUpdateClusterClients();
            Boolean rhsUpdateClusterClients;
            rhsUpdateClusterClients = that.isUpdateClusterClients();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateClusterClients", lhsUpdateClusterClients), LocatorUtils.property(thatLocator, "updateClusterClients", rhsUpdateClusterClients), lhsUpdateClusterClients, rhsUpdateClusterClients)) {
                return false;
            }
        }
        {
            Boolean lhsUpdateClusterClientsOnRemove;
            lhsUpdateClusterClientsOnRemove = this.isUpdateClusterClientsOnRemove();
            Boolean rhsUpdateClusterClientsOnRemove;
            rhsUpdateClusterClientsOnRemove = that.isUpdateClusterClientsOnRemove();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateClusterClientsOnRemove", lhsUpdateClusterClientsOnRemove), LocatorUtils.property(thatLocator, "updateClusterClientsOnRemove", rhsUpdateClusterClientsOnRemove), lhsUpdateClusterClientsOnRemove, rhsUpdateClusterClientsOnRemove)) {
                return false;
            }
        }
        {
            String lhsUpdateClusterFilter;
            lhsUpdateClusterFilter = this.getUpdateClusterFilter();
            String rhsUpdateClusterFilter;
            rhsUpdateClusterFilter = that.getUpdateClusterFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateClusterFilter", lhsUpdateClusterFilter), LocatorUtils.property(thatLocator, "updateClusterFilter", rhsUpdateClusterFilter), lhsUpdateClusterFilter, rhsUpdateClusterFilter)) {
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
    public static class BrokerInfo
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
            if (!(object instanceof DtoTransportConnector.BrokerInfo)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTransportConnector.BrokerInfo that = ((DtoTransportConnector.BrokerInfo) object);
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
            if (!(object instanceof DtoTransportConnector.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTransportConnector.BrokerService that = ((DtoTransportConnector.BrokerService) object);
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
            if (!(object instanceof DtoTransportConnector.DiscoveryAgent)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTransportConnector.DiscoveryAgent that = ((DtoTransportConnector.DiscoveryAgent) object);
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
            if (!(object instanceof DtoTransportConnector.MessageAuthorizationPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTransportConnector.MessageAuthorizationPolicy that = ((DtoTransportConnector.MessageAuthorizationPolicy) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}publishedAddressPolicy"/>
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
        "publishedAddressPolicy",
        "any"
    })
    public static class PublishedAddressPolicy
        implements Equals, HashCode, ToString
    {

        protected DtoPublishedAddressPolicy publishedAddressPolicy;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取publishedAddressPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPublishedAddressPolicy }
         *     
         */
        public DtoPublishedAddressPolicy getPublishedAddressPolicy() {
            return publishedAddressPolicy;
        }

        /**
         * 设置publishedAddressPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPublishedAddressPolicy }
         *     
         */
        public void setPublishedAddressPolicy(DtoPublishedAddressPolicy value) {
            this.publishedAddressPolicy = value;
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
                DtoPublishedAddressPolicy thePublishedAddressPolicy;
                thePublishedAddressPolicy = this.getPublishedAddressPolicy();
                strategy.appendField(locator, this, "publishedAddressPolicy", buffer, thePublishedAddressPolicy);
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
                DtoPublishedAddressPolicy thePublishedAddressPolicy;
                thePublishedAddressPolicy = this.getPublishedAddressPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publishedAddressPolicy", thePublishedAddressPolicy), currentHashCode, thePublishedAddressPolicy);
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
            if (!(object instanceof DtoTransportConnector.PublishedAddressPolicy)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTransportConnector.PublishedAddressPolicy that = ((DtoTransportConnector.PublishedAddressPolicy) object);
            {
                DtoPublishedAddressPolicy lhsPublishedAddressPolicy;
                lhsPublishedAddressPolicy = this.getPublishedAddressPolicy();
                DtoPublishedAddressPolicy rhsPublishedAddressPolicy;
                rhsPublishedAddressPolicy = that.getPublishedAddressPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "publishedAddressPolicy", lhsPublishedAddressPolicy), LocatorUtils.property(thatLocator, "publishedAddressPolicy", rhsPublishedAddressPolicy), lhsPublishedAddressPolicy, rhsPublishedAddressPolicy)) {
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
    public static class Server
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
            if (!(object instanceof DtoTransportConnector.Server)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTransportConnector.Server that = ((DtoTransportConnector.Server) object);
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
         * 获取taskRunnerFactory属性的值。
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
         * 设置taskRunnerFactory属性的值。
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
            if (!(object instanceof DtoTransportConnector.TaskRunnerFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoTransportConnector.TaskRunnerFactory that = ((DtoTransportConnector.TaskRunnerFactory) object);
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

}
