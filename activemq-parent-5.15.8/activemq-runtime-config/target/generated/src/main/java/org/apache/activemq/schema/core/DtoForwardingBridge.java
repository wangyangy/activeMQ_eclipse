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
 *           &lt;element name="networkBridgeFailedListener" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destinationFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dispatchAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="localBroker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="networkBridgeFailedListener" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prefetchSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="remoteBroker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useCompression" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker"
})
@XmlRootElement(name = "forwardingBridge")
public class DtoForwardingBridge implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "localBroker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remoteBroker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "networkBridgeFailedListener", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker;
    @XmlAttribute(name = "clientId")
    protected String clientId;
    @XmlAttribute(name = "destinationFilter")
    protected String destinationFilter;
    @XmlAttribute(name = "dispatchAsync")
    protected Boolean dispatchAsync;
    @XmlAttribute(name = "localBroker")
    protected String localBroker;
    @XmlAttribute(name = "networkBridgeFailedListener")
    protected String networkBridgeFailedListener;
    @XmlAttribute(name = "prefetchSize")
    protected BigInteger prefetchSize;
    @XmlAttribute(name = "remoteBroker")
    protected String remoteBroker;
    @XmlAttribute(name = "useCompression")
    protected Boolean useCompression;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoForwardingBridge.NetworkBridgeFailedListener }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoForwardingBridge.LocalBroker }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoForwardingBridge.RemoteBroker }{@code >}
     * 
     * 
     */
    public List<Object> getLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker() {
        if (localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker == null) {
            localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker = new ArrayList<Object>();
        }
        return this.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker;
    }

    /**
     * 获取clientId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置clientId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
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
     * 获取networkBridgeFailedListener属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkBridgeFailedListener() {
        return networkBridgeFailedListener;
    }

    /**
     * 设置networkBridgeFailedListener属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkBridgeFailedListener(String value) {
        this.networkBridgeFailedListener = value;
    }

    /**
     * 获取prefetchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrefetchSize() {
        return prefetchSize;
    }

    /**
     * 设置prefetchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrefetchSize(BigInteger value) {
        this.prefetchSize = value;
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
            List<Object> theLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker;
            theLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker = (((this.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker!= null)&&(!this.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker.isEmpty()))?this.getLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker():null);
            strategy.appendField(locator, this, "localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker", buffer, theLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker);
        }
        {
            String theClientId;
            theClientId = this.getClientId();
            strategy.appendField(locator, this, "clientId", buffer, theClientId);
        }
        {
            String theDestinationFilter;
            theDestinationFilter = this.getDestinationFilter();
            strategy.appendField(locator, this, "destinationFilter", buffer, theDestinationFilter);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            strategy.appendField(locator, this, "dispatchAsync", buffer, theDispatchAsync);
        }
        {
            String theLocalBroker;
            theLocalBroker = this.getLocalBroker();
            strategy.appendField(locator, this, "localBroker", buffer, theLocalBroker);
        }
        {
            String theNetworkBridgeFailedListener;
            theNetworkBridgeFailedListener = this.getNetworkBridgeFailedListener();
            strategy.appendField(locator, this, "networkBridgeFailedListener", buffer, theNetworkBridgeFailedListener);
        }
        {
            BigInteger thePrefetchSize;
            thePrefetchSize = this.getPrefetchSize();
            strategy.appendField(locator, this, "prefetchSize", buffer, thePrefetchSize);
        }
        {
            String theRemoteBroker;
            theRemoteBroker = this.getRemoteBroker();
            strategy.appendField(locator, this, "remoteBroker", buffer, theRemoteBroker);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            strategy.appendField(locator, this, "useCompression", buffer, theUseCompression);
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
            List<Object> theLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker;
            theLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker = (((this.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker!= null)&&(!this.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker.isEmpty()))?this.getLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker", theLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker), currentHashCode, theLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker);
        }
        {
            String theClientId;
            theClientId = this.getClientId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientId", theClientId), currentHashCode, theClientId);
        }
        {
            String theDestinationFilter;
            theDestinationFilter = this.getDestinationFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationFilter", theDestinationFilter), currentHashCode, theDestinationFilter);
        }
        {
            Boolean theDispatchAsync;
            theDispatchAsync = this.isDispatchAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispatchAsync", theDispatchAsync), currentHashCode, theDispatchAsync);
        }
        {
            String theLocalBroker;
            theLocalBroker = this.getLocalBroker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localBroker", theLocalBroker), currentHashCode, theLocalBroker);
        }
        {
            String theNetworkBridgeFailedListener;
            theNetworkBridgeFailedListener = this.getNetworkBridgeFailedListener();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkBridgeFailedListener", theNetworkBridgeFailedListener), currentHashCode, theNetworkBridgeFailedListener);
        }
        {
            BigInteger thePrefetchSize;
            thePrefetchSize = this.getPrefetchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefetchSize", thePrefetchSize), currentHashCode, thePrefetchSize);
        }
        {
            String theRemoteBroker;
            theRemoteBroker = this.getRemoteBroker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteBroker", theRemoteBroker), currentHashCode, theRemoteBroker);
        }
        {
            Boolean theUseCompression;
            theUseCompression = this.isUseCompression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useCompression", theUseCompression), currentHashCode, theUseCompression);
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
        if (!(object instanceof DtoForwardingBridge)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoForwardingBridge that = ((DtoForwardingBridge) object);
        {
            List<Object> lhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker;
            lhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker = (((this.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker!= null)&&(!this.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker.isEmpty()))?this.getLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker():null);
            List<Object> rhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker;
            rhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker = (((that.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker!= null)&&(!that.localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker.isEmpty()))?that.getLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker", lhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker), LocatorUtils.property(thatLocator, "localBrokerOrNetworkBridgeFailedListenerOrRemoteBroker", rhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker), lhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker, rhsLocalBrokerOrNetworkBridgeFailedListenerOrRemoteBroker)) {
                return false;
            }
        }
        {
            String lhsClientId;
            lhsClientId = this.getClientId();
            String rhsClientId;
            rhsClientId = that.getClientId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientId", lhsClientId), LocatorUtils.property(thatLocator, "clientId", rhsClientId), lhsClientId, rhsClientId)) {
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
            Boolean lhsDispatchAsync;
            lhsDispatchAsync = this.isDispatchAsync();
            Boolean rhsDispatchAsync;
            rhsDispatchAsync = that.isDispatchAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispatchAsync", lhsDispatchAsync), LocatorUtils.property(thatLocator, "dispatchAsync", rhsDispatchAsync), lhsDispatchAsync, rhsDispatchAsync)) {
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
            String lhsNetworkBridgeFailedListener;
            lhsNetworkBridgeFailedListener = this.getNetworkBridgeFailedListener();
            String rhsNetworkBridgeFailedListener;
            rhsNetworkBridgeFailedListener = that.getNetworkBridgeFailedListener();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkBridgeFailedListener", lhsNetworkBridgeFailedListener), LocatorUtils.property(thatLocator, "networkBridgeFailedListener", rhsNetworkBridgeFailedListener), lhsNetworkBridgeFailedListener, rhsNetworkBridgeFailedListener)) {
                return false;
            }
        }
        {
            BigInteger lhsPrefetchSize;
            lhsPrefetchSize = this.getPrefetchSize();
            BigInteger rhsPrefetchSize;
            rhsPrefetchSize = that.getPrefetchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prefetchSize", lhsPrefetchSize), LocatorUtils.property(thatLocator, "prefetchSize", rhsPrefetchSize), lhsPrefetchSize, rhsPrefetchSize)) {
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
            Boolean lhsUseCompression;
            lhsUseCompression = this.isUseCompression();
            Boolean rhsUseCompression;
            rhsUseCompression = that.isUseCompression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useCompression", lhsUseCompression), LocatorUtils.property(thatLocator, "useCompression", rhsUseCompression), lhsUseCompression, rhsUseCompression)) {
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
            if (!(object instanceof DtoForwardingBridge.LocalBroker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoForwardingBridge.LocalBroker that = ((DtoForwardingBridge.LocalBroker) object);
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
    public static class NetworkBridgeFailedListener
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
            if (!(object instanceof DtoForwardingBridge.NetworkBridgeFailedListener)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoForwardingBridge.NetworkBridgeFailedListener that = ((DtoForwardingBridge.NetworkBridgeFailedListener) object);
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
            if (!(object instanceof DtoForwardingBridge.RemoteBroker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoForwardingBridge.RemoteBroker that = ((DtoForwardingBridge.RemoteBroker) object);
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

}
