//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.02.26 时间 09:59:41 AM CST 
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
 *           &lt;element name="configuration" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}ldapNetworkConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}multicastNetworkConnector"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}networkConnector"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="durableDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="dynamicallyIncludedDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="excludedDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="localBroker" minOccurs="0">
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
 *           &lt;element name="networkBridgeListener" minOccurs="0">
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
 *           &lt;element name="remoteBroker" minOccurs="0">
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
 *           &lt;element name="staticallyIncludedDestinations" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="configuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createdByDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="localBroker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mbeanObjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="networkBridgeListener" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remoteBroker" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "brokerServiceOrConfigurationOrDurableDestinations"
})
@XmlRootElement(name = "demandForwardingBridge")
public class DtoDemandForwardingBridge
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "networkBridgeListener", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remoteBroker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "staticallyIncludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "durableDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "localBroker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dynamicallyIncludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "excludedDestinations", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "configuration", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrConfigurationOrDurableDestinations;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "configuration")
    protected String configuration;
    @XmlAttribute(name = "createdByDuplex")
    protected Boolean createdByDuplex;
    @XmlAttribute(name = "localBroker")
    protected String localBroker;
    @XmlAttribute(name = "mbeanObjectName")
    protected String mbeanObjectName;
    @XmlAttribute(name = "networkBridgeListener")
    protected String networkBridgeListener;
    @XmlAttribute(name = "remoteBroker")
    protected String remoteBroker;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrConfigurationOrDurableDestinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrConfigurationOrDurableDestinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrConfigurationOrDurableDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.NetworkBridgeListener }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.RemoteBroker }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.StaticallyIncludedDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.DurableDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.LocalBroker }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.DynamicallyIncludedDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.ExcludedDestinations }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.Configuration }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerServiceOrConfigurationOrDurableDestinations() {
        if (brokerServiceOrConfigurationOrDurableDestinations == null) {
            brokerServiceOrConfigurationOrDurableDestinations = new ArrayList<Object>();
        }
        return this.brokerServiceOrConfigurationOrDurableDestinations;
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
     * 获取configuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * 设置configuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    /**
     * 获取createdByDuplex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedByDuplex() {
        return createdByDuplex;
    }

    /**
     * 设置createdByDuplex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedByDuplex(Boolean value) {
        this.createdByDuplex = value;
    }

    /**
     * 获取localBroker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBroker() {
        return localBroker;
    }

    /**
     * 设置localBroker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBroker(String value) {
        this.localBroker = value;
    }

    /**
     * 获取mbeanObjectName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbeanObjectName() {
        return mbeanObjectName;
    }

    /**
     * 设置mbeanObjectName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbeanObjectName(String value) {
        this.mbeanObjectName = value;
    }

    /**
     * 获取networkBridgeListener属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkBridgeListener() {
        return networkBridgeListener;
    }

    /**
     * 设置networkBridgeListener属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkBridgeListener(String value) {
        this.networkBridgeListener = value;
    }

    /**
     * 获取remoteBroker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteBroker() {
        return remoteBroker;
    }

    /**
     * 设置remoteBroker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteBroker(String value) {
        this.remoteBroker = value;
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
            List<Object> theBrokerServiceOrConfigurationOrDurableDestinations;
            theBrokerServiceOrConfigurationOrDurableDestinations = (((this.brokerServiceOrConfigurationOrDurableDestinations!= null)&&(!this.brokerServiceOrConfigurationOrDurableDestinations.isEmpty()))?this.getBrokerServiceOrConfigurationOrDurableDestinations():null);
            strategy.appendField(locator, this, "brokerServiceOrConfigurationOrDurableDestinations", buffer, theBrokerServiceOrConfigurationOrDurableDestinations);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            String theConfiguration;
            theConfiguration = this.getConfiguration();
            strategy.appendField(locator, this, "configuration", buffer, theConfiguration);
        }
        {
            Boolean theCreatedByDuplex;
            theCreatedByDuplex = this.isCreatedByDuplex();
            strategy.appendField(locator, this, "createdByDuplex", buffer, theCreatedByDuplex);
        }
        {
            String theLocalBroker;
            theLocalBroker = this.getLocalBroker();
            strategy.appendField(locator, this, "localBroker", buffer, theLocalBroker);
        }
        {
            String theMbeanObjectName;
            theMbeanObjectName = this.getMbeanObjectName();
            strategy.appendField(locator, this, "mbeanObjectName", buffer, theMbeanObjectName);
        }
        {
            String theNetworkBridgeListener;
            theNetworkBridgeListener = this.getNetworkBridgeListener();
            strategy.appendField(locator, this, "networkBridgeListener", buffer, theNetworkBridgeListener);
        }
        {
            String theRemoteBroker;
            theRemoteBroker = this.getRemoteBroker();
            strategy.appendField(locator, this, "remoteBroker", buffer, theRemoteBroker);
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
            List<Object> theBrokerServiceOrConfigurationOrDurableDestinations;
            theBrokerServiceOrConfigurationOrDurableDestinations = (((this.brokerServiceOrConfigurationOrDurableDestinations!= null)&&(!this.brokerServiceOrConfigurationOrDurableDestinations.isEmpty()))?this.getBrokerServiceOrConfigurationOrDurableDestinations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrConfigurationOrDurableDestinations", theBrokerServiceOrConfigurationOrDurableDestinations), currentHashCode, theBrokerServiceOrConfigurationOrDurableDestinations);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            String theConfiguration;
            theConfiguration = this.getConfiguration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "configuration", theConfiguration), currentHashCode, theConfiguration);
        }
        {
            Boolean theCreatedByDuplex;
            theCreatedByDuplex = this.isCreatedByDuplex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdByDuplex", theCreatedByDuplex), currentHashCode, theCreatedByDuplex);
        }
        {
            String theLocalBroker;
            theLocalBroker = this.getLocalBroker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localBroker", theLocalBroker), currentHashCode, theLocalBroker);
        }
        {
            String theMbeanObjectName;
            theMbeanObjectName = this.getMbeanObjectName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mbeanObjectName", theMbeanObjectName), currentHashCode, theMbeanObjectName);
        }
        {
            String theNetworkBridgeListener;
            theNetworkBridgeListener = this.getNetworkBridgeListener();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkBridgeListener", theNetworkBridgeListener), currentHashCode, theNetworkBridgeListener);
        }
        {
            String theRemoteBroker;
            theRemoteBroker = this.getRemoteBroker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteBroker", theRemoteBroker), currentHashCode, theRemoteBroker);
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
        if (!(object instanceof DtoDemandForwardingBridge)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoDemandForwardingBridge that = ((DtoDemandForwardingBridge) object);
        {
            List<Object> lhsBrokerServiceOrConfigurationOrDurableDestinations;
            lhsBrokerServiceOrConfigurationOrDurableDestinations = (((this.brokerServiceOrConfigurationOrDurableDestinations!= null)&&(!this.brokerServiceOrConfigurationOrDurableDestinations.isEmpty()))?this.getBrokerServiceOrConfigurationOrDurableDestinations():null);
            List<Object> rhsBrokerServiceOrConfigurationOrDurableDestinations;
            rhsBrokerServiceOrConfigurationOrDurableDestinations = (((that.brokerServiceOrConfigurationOrDurableDestinations!= null)&&(!that.brokerServiceOrConfigurationOrDurableDestinations.isEmpty()))?that.getBrokerServiceOrConfigurationOrDurableDestinations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrConfigurationOrDurableDestinations", lhsBrokerServiceOrConfigurationOrDurableDestinations), LocatorUtils.property(thatLocator, "brokerServiceOrConfigurationOrDurableDestinations", rhsBrokerServiceOrConfigurationOrDurableDestinations), lhsBrokerServiceOrConfigurationOrDurableDestinations, rhsBrokerServiceOrConfigurationOrDurableDestinations)) {
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
            String lhsConfiguration;
            lhsConfiguration = this.getConfiguration();
            String rhsConfiguration;
            rhsConfiguration = that.getConfiguration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "configuration", lhsConfiguration), LocatorUtils.property(thatLocator, "configuration", rhsConfiguration), lhsConfiguration, rhsConfiguration)) {
                return false;
            }
        }
        {
            Boolean lhsCreatedByDuplex;
            lhsCreatedByDuplex = this.isCreatedByDuplex();
            Boolean rhsCreatedByDuplex;
            rhsCreatedByDuplex = that.isCreatedByDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdByDuplex", lhsCreatedByDuplex), LocatorUtils.property(thatLocator, "createdByDuplex", rhsCreatedByDuplex), lhsCreatedByDuplex, rhsCreatedByDuplex)) {
                return false;
            }
        }
        {
            String lhsLocalBroker;
            lhsLocalBroker = this.getLocalBroker();
            String rhsLocalBroker;
            rhsLocalBroker = that.getLocalBroker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localBroker", lhsLocalBroker), LocatorUtils.property(thatLocator, "localBroker", rhsLocalBroker), lhsLocalBroker, rhsLocalBroker)) {
                return false;
            }
        }
        {
            String lhsMbeanObjectName;
            lhsMbeanObjectName = this.getMbeanObjectName();
            String rhsMbeanObjectName;
            rhsMbeanObjectName = that.getMbeanObjectName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mbeanObjectName", lhsMbeanObjectName), LocatorUtils.property(thatLocator, "mbeanObjectName", rhsMbeanObjectName), lhsMbeanObjectName, rhsMbeanObjectName)) {
                return false;
            }
        }
        {
            String lhsNetworkBridgeListener;
            lhsNetworkBridgeListener = this.getNetworkBridgeListener();
            String rhsNetworkBridgeListener;
            rhsNetworkBridgeListener = that.getNetworkBridgeListener();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkBridgeListener", lhsNetworkBridgeListener), LocatorUtils.property(thatLocator, "networkBridgeListener", rhsNetworkBridgeListener), lhsNetworkBridgeListener, rhsNetworkBridgeListener)) {
                return false;
            }
        }
        {
            String lhsRemoteBroker;
            lhsRemoteBroker = this.getRemoteBroker();
            String rhsRemoteBroker;
            rhsRemoteBroker = that.getRemoteBroker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteBroker", lhsRemoteBroker), LocatorUtils.property(thatLocator, "remoteBroker", rhsRemoteBroker), lhsRemoteBroker, rhsRemoteBroker)) {
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
            if (!(object instanceof DtoDemandForwardingBridge.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.BrokerService that = ((DtoDemandForwardingBridge.BrokerService) object);
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
        "ldapNetworkConnector",
        "multicastNetworkConnector",
        "networkConnector",
        "any"
    })
    public static class Configuration
        implements Equals, HashCode, ToString
    {

        protected DtoLdapNetworkConnector ldapNetworkConnector;
        protected DtoMulticastNetworkConnector multicastNetworkConnector;
        protected DtoNetworkConnector networkConnector;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取ldapNetworkConnector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoLdapNetworkConnector }
         *     
         */
        public DtoLdapNetworkConnector getLdapNetworkConnector() {
            return ldapNetworkConnector;
        }

        /**
         * 设置ldapNetworkConnector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLdapNetworkConnector }
         *     
         */
        public void setLdapNetworkConnector(DtoLdapNetworkConnector value) {
            this.ldapNetworkConnector = value;
        }

        /**
         * 获取multicastNetworkConnector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMulticastNetworkConnector }
         *     
         */
        public DtoMulticastNetworkConnector getMulticastNetworkConnector() {
            return multicastNetworkConnector;
        }

        /**
         * 设置multicastNetworkConnector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMulticastNetworkConnector }
         *     
         */
        public void setMulticastNetworkConnector(DtoMulticastNetworkConnector value) {
            this.multicastNetworkConnector = value;
        }

        /**
         * 获取networkConnector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoNetworkConnector }
         *     
         */
        public DtoNetworkConnector getNetworkConnector() {
            return networkConnector;
        }

        /**
         * 设置networkConnector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoNetworkConnector }
         *     
         */
        public void setNetworkConnector(DtoNetworkConnector value) {
            this.networkConnector = value;
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
                DtoLdapNetworkConnector theLdapNetworkConnector;
                theLdapNetworkConnector = this.getLdapNetworkConnector();
                strategy.appendField(locator, this, "ldapNetworkConnector", buffer, theLdapNetworkConnector);
            }
            {
                DtoMulticastNetworkConnector theMulticastNetworkConnector;
                theMulticastNetworkConnector = this.getMulticastNetworkConnector();
                strategy.appendField(locator, this, "multicastNetworkConnector", buffer, theMulticastNetworkConnector);
            }
            {
                DtoNetworkConnector theNetworkConnector;
                theNetworkConnector = this.getNetworkConnector();
                strategy.appendField(locator, this, "networkConnector", buffer, theNetworkConnector);
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
                DtoLdapNetworkConnector theLdapNetworkConnector;
                theLdapNetworkConnector = this.getLdapNetworkConnector();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ldapNetworkConnector", theLdapNetworkConnector), currentHashCode, theLdapNetworkConnector);
            }
            {
                DtoMulticastNetworkConnector theMulticastNetworkConnector;
                theMulticastNetworkConnector = this.getMulticastNetworkConnector();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multicastNetworkConnector", theMulticastNetworkConnector), currentHashCode, theMulticastNetworkConnector);
            }
            {
                DtoNetworkConnector theNetworkConnector;
                theNetworkConnector = this.getNetworkConnector();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkConnector", theNetworkConnector), currentHashCode, theNetworkConnector);
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
            if (!(object instanceof DtoDemandForwardingBridge.Configuration)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.Configuration that = ((DtoDemandForwardingBridge.Configuration) object);
            {
                DtoLdapNetworkConnector lhsLdapNetworkConnector;
                lhsLdapNetworkConnector = this.getLdapNetworkConnector();
                DtoLdapNetworkConnector rhsLdapNetworkConnector;
                rhsLdapNetworkConnector = that.getLdapNetworkConnector();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "ldapNetworkConnector", lhsLdapNetworkConnector), LocatorUtils.property(thatLocator, "ldapNetworkConnector", rhsLdapNetworkConnector), lhsLdapNetworkConnector, rhsLdapNetworkConnector)) {
                    return false;
                }
            }
            {
                DtoMulticastNetworkConnector lhsMulticastNetworkConnector;
                lhsMulticastNetworkConnector = this.getMulticastNetworkConnector();
                DtoMulticastNetworkConnector rhsMulticastNetworkConnector;
                rhsMulticastNetworkConnector = that.getMulticastNetworkConnector();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "multicastNetworkConnector", lhsMulticastNetworkConnector), LocatorUtils.property(thatLocator, "multicastNetworkConnector", rhsMulticastNetworkConnector), lhsMulticastNetworkConnector, rhsMulticastNetworkConnector)) {
                    return false;
                }
            }
            {
                DtoNetworkConnector lhsNetworkConnector;
                lhsNetworkConnector = this.getNetworkConnector();
                DtoNetworkConnector rhsNetworkConnector;
                rhsNetworkConnector = that.getNetworkConnector();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "networkConnector", lhsNetworkConnector), LocatorUtils.property(thatLocator, "networkConnector", rhsNetworkConnector), lhsNetworkConnector, rhsNetworkConnector)) {
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
        "queueOrTempQueueOrTempTopic"
    })
    public static class DurableDestinations
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "queue", namespace = "http://activemq.apache.org/schema/core", type = DtoQueue.class, required = false),
            @XmlElementRef(name = "tempTopic", namespace = "http://activemq.apache.org/schema/core", type = DtoTempTopic.class, required = false),
            @XmlElementRef(name = "tempQueue", namespace = "http://activemq.apache.org/schema/core", type = DtoTempQueue.class, required = false),
            @XmlElementRef(name = "topic", namespace = "http://activemq.apache.org/schema/core", type = DtoTopic.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> queueOrTempQueueOrTempTopic;

        /**
         * Gets the value of the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueOrTempQueueOrTempTopic().add(newItem);
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
        public List<Object> getQueueOrTempQueueOrTempTopic() {
            if (queueOrTempQueueOrTempTopic == null) {
                queueOrTempQueueOrTempTopic = new ArrayList<Object>();
            }
            return this.queueOrTempQueueOrTempTopic;
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
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                strategy.appendField(locator, this, "queueOrTempQueueOrTempTopic", buffer, theQueueOrTempQueueOrTempTopic);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueOrTempQueueOrTempTopic", theQueueOrTempQueueOrTempTopic), currentHashCode, theQueueOrTempQueueOrTempTopic);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoDemandForwardingBridge.DurableDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.DurableDestinations that = ((DtoDemandForwardingBridge.DurableDestinations) object);
            {
                List<Object> lhsQueueOrTempQueueOrTempTopic;
                lhsQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                List<Object> rhsQueueOrTempQueueOrTempTopic;
                rhsQueueOrTempQueueOrTempTopic = (((that.queueOrTempQueueOrTempTopic!= null)&&(!that.queueOrTempQueueOrTempTopic.isEmpty()))?that.getQueueOrTempQueueOrTempTopic():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queueOrTempQueueOrTempTopic", lhsQueueOrTempQueueOrTempTopic), LocatorUtils.property(thatLocator, "queueOrTempQueueOrTempTopic", rhsQueueOrTempQueueOrTempTopic), lhsQueueOrTempQueueOrTempTopic, rhsQueueOrTempQueueOrTempTopic)) {
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
        "queueOrTempQueueOrTempTopic"
    })
    public static class DynamicallyIncludedDestinations
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "queue", namespace = "http://activemq.apache.org/schema/core", type = DtoQueue.class, required = false),
            @XmlElementRef(name = "tempTopic", namespace = "http://activemq.apache.org/schema/core", type = DtoTempTopic.class, required = false),
            @XmlElementRef(name = "tempQueue", namespace = "http://activemq.apache.org/schema/core", type = DtoTempQueue.class, required = false),
            @XmlElementRef(name = "topic", namespace = "http://activemq.apache.org/schema/core", type = DtoTopic.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> queueOrTempQueueOrTempTopic;

        /**
         * Gets the value of the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueOrTempQueueOrTempTopic().add(newItem);
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
        public List<Object> getQueueOrTempQueueOrTempTopic() {
            if (queueOrTempQueueOrTempTopic == null) {
                queueOrTempQueueOrTempTopic = new ArrayList<Object>();
            }
            return this.queueOrTempQueueOrTempTopic;
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
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                strategy.appendField(locator, this, "queueOrTempQueueOrTempTopic", buffer, theQueueOrTempQueueOrTempTopic);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueOrTempQueueOrTempTopic", theQueueOrTempQueueOrTempTopic), currentHashCode, theQueueOrTempQueueOrTempTopic);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoDemandForwardingBridge.DynamicallyIncludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.DynamicallyIncludedDestinations that = ((DtoDemandForwardingBridge.DynamicallyIncludedDestinations) object);
            {
                List<Object> lhsQueueOrTempQueueOrTempTopic;
                lhsQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                List<Object> rhsQueueOrTempQueueOrTempTopic;
                rhsQueueOrTempQueueOrTempTopic = (((that.queueOrTempQueueOrTempTopic!= null)&&(!that.queueOrTempQueueOrTempTopic.isEmpty()))?that.getQueueOrTempQueueOrTempTopic():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queueOrTempQueueOrTempTopic", lhsQueueOrTempQueueOrTempTopic), LocatorUtils.property(thatLocator, "queueOrTempQueueOrTempTopic", rhsQueueOrTempQueueOrTempTopic), lhsQueueOrTempQueueOrTempTopic, rhsQueueOrTempQueueOrTempTopic)) {
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
        "queueOrTempQueueOrTempTopic"
    })
    public static class ExcludedDestinations
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "queue", namespace = "http://activemq.apache.org/schema/core", type = DtoQueue.class, required = false),
            @XmlElementRef(name = "tempTopic", namespace = "http://activemq.apache.org/schema/core", type = DtoTempTopic.class, required = false),
            @XmlElementRef(name = "tempQueue", namespace = "http://activemq.apache.org/schema/core", type = DtoTempQueue.class, required = false),
            @XmlElementRef(name = "topic", namespace = "http://activemq.apache.org/schema/core", type = DtoTopic.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> queueOrTempQueueOrTempTopic;

        /**
         * Gets the value of the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueOrTempQueueOrTempTopic().add(newItem);
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
        public List<Object> getQueueOrTempQueueOrTempTopic() {
            if (queueOrTempQueueOrTempTopic == null) {
                queueOrTempQueueOrTempTopic = new ArrayList<Object>();
            }
            return this.queueOrTempQueueOrTempTopic;
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
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                strategy.appendField(locator, this, "queueOrTempQueueOrTempTopic", buffer, theQueueOrTempQueueOrTempTopic);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueOrTempQueueOrTempTopic", theQueueOrTempQueueOrTempTopic), currentHashCode, theQueueOrTempQueueOrTempTopic);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoDemandForwardingBridge.ExcludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.ExcludedDestinations that = ((DtoDemandForwardingBridge.ExcludedDestinations) object);
            {
                List<Object> lhsQueueOrTempQueueOrTempTopic;
                lhsQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                List<Object> rhsQueueOrTempQueueOrTempTopic;
                rhsQueueOrTempQueueOrTempTopic = (((that.queueOrTempQueueOrTempTopic!= null)&&(!that.queueOrTempQueueOrTempTopic.isEmpty()))?that.getQueueOrTempQueueOrTempTopic():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queueOrTempQueueOrTempTopic", lhsQueueOrTempQueueOrTempTopic), LocatorUtils.property(thatLocator, "queueOrTempQueueOrTempTopic", rhsQueueOrTempQueueOrTempTopic), lhsQueueOrTempQueueOrTempTopic, rhsQueueOrTempQueueOrTempTopic)) {
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
    public static class LocalBroker
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
            if (!(object instanceof DtoDemandForwardingBridge.LocalBroker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.LocalBroker that = ((DtoDemandForwardingBridge.LocalBroker) object);
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
    public static class NetworkBridgeListener
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
            if (!(object instanceof DtoDemandForwardingBridge.NetworkBridgeListener)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.NetworkBridgeListener that = ((DtoDemandForwardingBridge.NetworkBridgeListener) object);
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
    public static class RemoteBroker
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
            if (!(object instanceof DtoDemandForwardingBridge.RemoteBroker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.RemoteBroker that = ((DtoDemandForwardingBridge.RemoteBroker) object);
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
        "queueOrTempQueueOrTempTopic"
    })
    public static class StaticallyIncludedDestinations
        implements Equals, HashCode, ToString
    {

        @XmlElementRefs({
            @XmlElementRef(name = "queue", namespace = "http://activemq.apache.org/schema/core", type = DtoQueue.class, required = false),
            @XmlElementRef(name = "tempTopic", namespace = "http://activemq.apache.org/schema/core", type = DtoTempTopic.class, required = false),
            @XmlElementRef(name = "tempQueue", namespace = "http://activemq.apache.org/schema/core", type = DtoTempQueue.class, required = false),
            @XmlElementRef(name = "topic", namespace = "http://activemq.apache.org/schema/core", type = DtoTopic.class, required = false)
        })
        @XmlAnyElement(lax = true)
        protected List<Object> queueOrTempQueueOrTempTopic;

        /**
         * Gets the value of the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueOrTempQueueOrTempTopic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueOrTempQueueOrTempTopic().add(newItem);
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
        public List<Object> getQueueOrTempQueueOrTempTopic() {
            if (queueOrTempQueueOrTempTopic == null) {
                queueOrTempQueueOrTempTopic = new ArrayList<Object>();
            }
            return this.queueOrTempQueueOrTempTopic;
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
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                strategy.appendField(locator, this, "queueOrTempQueueOrTempTopic", buffer, theQueueOrTempQueueOrTempTopic);
            }
            return buffer;
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Object> theQueueOrTempQueueOrTempTopic;
                theQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueOrTempQueueOrTempTopic", theQueueOrTempQueueOrTempTopic), currentHashCode, theQueueOrTempQueueOrTempTopic);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof DtoDemandForwardingBridge.StaticallyIncludedDestinations)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDemandForwardingBridge.StaticallyIncludedDestinations that = ((DtoDemandForwardingBridge.StaticallyIncludedDestinations) object);
            {
                List<Object> lhsQueueOrTempQueueOrTempTopic;
                lhsQueueOrTempQueueOrTempTopic = (((this.queueOrTempQueueOrTempTopic!= null)&&(!this.queueOrTempQueueOrTempTopic.isEmpty()))?this.getQueueOrTempQueueOrTempTopic():null);
                List<Object> rhsQueueOrTempQueueOrTempTopic;
                rhsQueueOrTempQueueOrTempTopic = (((that.queueOrTempQueueOrTempTopic!= null)&&(!that.queueOrTempQueueOrTempTopic.isEmpty()))?that.getQueueOrTempQueueOrTempTopic():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queueOrTempQueueOrTempTopic", lhsQueueOrTempQueueOrTempTopic), LocatorUtils.property(thatLocator, "queueOrTempQueueOrTempTopic", rhsQueueOrTempQueueOrTempTopic), lhsQueueOrTempQueueOrTempTopic, rhsQueueOrTempQueueOrTempTopic)) {
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
