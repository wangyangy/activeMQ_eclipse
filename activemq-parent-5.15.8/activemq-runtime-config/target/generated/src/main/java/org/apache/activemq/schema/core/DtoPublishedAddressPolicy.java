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
 *           &lt;element name="hostMapping" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="portMapping" maxOccurs="unbounded" minOccurs="0">
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
 *       &lt;attribute name="clusterClientUriQuery" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hostMapping" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="portMapping" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publishedHostStrategy" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "hostMappingOrPortMappingOrAny"
})
@XmlRootElement(name = "publishedAddressPolicy")
public class DtoPublishedAddressPolicy
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "hostMapping", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "portMapping", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> hostMappingOrPortMappingOrAny;
    @XmlAttribute(name = "clusterClientUriQuery")
    protected String clusterClientUriQuery;
    @XmlAttribute(name = "hostMapping")
    protected String hostMapping;
    @XmlAttribute(name = "portMapping")
    protected String portMapping;
    @XmlAttribute(name = "publishedHostStrategy")
    protected String publishedHostStrategy;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the hostMappingOrPortMappingOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostMappingOrPortMappingOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostMappingOrPortMappingOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoPublishedAddressPolicy.HostMapping }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoPublishedAddressPolicy.PortMapping }{@code >}
     * 
     * 
     */
    public List<Object> getHostMappingOrPortMappingOrAny() {
        if (hostMappingOrPortMappingOrAny == null) {
            hostMappingOrPortMappingOrAny = new ArrayList<Object>();
        }
        return this.hostMappingOrPortMappingOrAny;
    }

    /**
     * 获取clusterClientUriQuery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterClientUriQuery() {
        return clusterClientUriQuery;
    }

    /**
     * 设置clusterClientUriQuery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterClientUriQuery(String value) {
        this.clusterClientUriQuery = value;
    }

    /**
     * 获取hostMapping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMapping() {
        return hostMapping;
    }

    /**
     * 设置hostMapping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMapping(String value) {
        this.hostMapping = value;
    }

    /**
     * 获取portMapping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortMapping() {
        return portMapping;
    }

    /**
     * 设置portMapping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortMapping(String value) {
        this.portMapping = value;
    }

    /**
     * 获取publishedHostStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedHostStrategy() {
        return publishedHostStrategy;
    }

    /**
     * 设置publishedHostStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedHostStrategy(String value) {
        this.publishedHostStrategy = value;
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
            List<Object> theHostMappingOrPortMappingOrAny;
            theHostMappingOrPortMappingOrAny = (((this.hostMappingOrPortMappingOrAny!= null)&&(!this.hostMappingOrPortMappingOrAny.isEmpty()))?this.getHostMappingOrPortMappingOrAny():null);
            strategy.appendField(locator, this, "hostMappingOrPortMappingOrAny", buffer, theHostMappingOrPortMappingOrAny);
        }
        {
            String theClusterClientUriQuery;
            theClusterClientUriQuery = this.getClusterClientUriQuery();
            strategy.appendField(locator, this, "clusterClientUriQuery", buffer, theClusterClientUriQuery);
        }
        {
            String theHostMapping;
            theHostMapping = this.getHostMapping();
            strategy.appendField(locator, this, "hostMapping", buffer, theHostMapping);
        }
        {
            String thePortMapping;
            thePortMapping = this.getPortMapping();
            strategy.appendField(locator, this, "portMapping", buffer, thePortMapping);
        }
        {
            String thePublishedHostStrategy;
            thePublishedHostStrategy = this.getPublishedHostStrategy();
            strategy.appendField(locator, this, "publishedHostStrategy", buffer, thePublishedHostStrategy);
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
            List<Object> theHostMappingOrPortMappingOrAny;
            theHostMappingOrPortMappingOrAny = (((this.hostMappingOrPortMappingOrAny!= null)&&(!this.hostMappingOrPortMappingOrAny.isEmpty()))?this.getHostMappingOrPortMappingOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hostMappingOrPortMappingOrAny", theHostMappingOrPortMappingOrAny), currentHashCode, theHostMappingOrPortMappingOrAny);
        }
        {
            String theClusterClientUriQuery;
            theClusterClientUriQuery = this.getClusterClientUriQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clusterClientUriQuery", theClusterClientUriQuery), currentHashCode, theClusterClientUriQuery);
        }
        {
            String theHostMapping;
            theHostMapping = this.getHostMapping();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hostMapping", theHostMapping), currentHashCode, theHostMapping);
        }
        {
            String thePortMapping;
            thePortMapping = this.getPortMapping();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portMapping", thePortMapping), currentHashCode, thePortMapping);
        }
        {
            String thePublishedHostStrategy;
            thePublishedHostStrategy = this.getPublishedHostStrategy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publishedHostStrategy", thePublishedHostStrategy), currentHashCode, thePublishedHostStrategy);
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
        if (!(object instanceof DtoPublishedAddressPolicy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoPublishedAddressPolicy that = ((DtoPublishedAddressPolicy) object);
        {
            List<Object> lhsHostMappingOrPortMappingOrAny;
            lhsHostMappingOrPortMappingOrAny = (((this.hostMappingOrPortMappingOrAny!= null)&&(!this.hostMappingOrPortMappingOrAny.isEmpty()))?this.getHostMappingOrPortMappingOrAny():null);
            List<Object> rhsHostMappingOrPortMappingOrAny;
            rhsHostMappingOrPortMappingOrAny = (((that.hostMappingOrPortMappingOrAny!= null)&&(!that.hostMappingOrPortMappingOrAny.isEmpty()))?that.getHostMappingOrPortMappingOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hostMappingOrPortMappingOrAny", lhsHostMappingOrPortMappingOrAny), LocatorUtils.property(thatLocator, "hostMappingOrPortMappingOrAny", rhsHostMappingOrPortMappingOrAny), lhsHostMappingOrPortMappingOrAny, rhsHostMappingOrPortMappingOrAny)) {
                return false;
            }
        }
        {
            String lhsClusterClientUriQuery;
            lhsClusterClientUriQuery = this.getClusterClientUriQuery();
            String rhsClusterClientUriQuery;
            rhsClusterClientUriQuery = that.getClusterClientUriQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clusterClientUriQuery", lhsClusterClientUriQuery), LocatorUtils.property(thatLocator, "clusterClientUriQuery", rhsClusterClientUriQuery), lhsClusterClientUriQuery, rhsClusterClientUriQuery)) {
                return false;
            }
        }
        {
            String lhsHostMapping;
            lhsHostMapping = this.getHostMapping();
            String rhsHostMapping;
            rhsHostMapping = that.getHostMapping();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hostMapping", lhsHostMapping), LocatorUtils.property(thatLocator, "hostMapping", rhsHostMapping), lhsHostMapping, rhsHostMapping)) {
                return false;
            }
        }
        {
            String lhsPortMapping;
            lhsPortMapping = this.getPortMapping();
            String rhsPortMapping;
            rhsPortMapping = that.getPortMapping();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portMapping", lhsPortMapping), LocatorUtils.property(thatLocator, "portMapping", rhsPortMapping), lhsPortMapping, rhsPortMapping)) {
                return false;
            }
        }
        {
            String lhsPublishedHostStrategy;
            lhsPublishedHostStrategy = this.getPublishedHostStrategy();
            String rhsPublishedHostStrategy;
            rhsPublishedHostStrategy = that.getPublishedHostStrategy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishedHostStrategy", lhsPublishedHostStrategy), LocatorUtils.property(thatLocator, "publishedHostStrategy", rhsPublishedHostStrategy), lhsPublishedHostStrategy, rhsPublishedHostStrategy)) {
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
    public static class HostMapping
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
            if (!(object instanceof DtoPublishedAddressPolicy.HostMapping)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPublishedAddressPolicy.HostMapping that = ((DtoPublishedAddressPolicy.HostMapping) object);
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
        "any"
    })
    public static class PortMapping
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
            if (!(object instanceof DtoPublishedAddressPolicy.PortMapping)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPublishedAddressPolicy.PortMapping that = ((DtoPublishedAddressPolicy.PortMapping) object);
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
