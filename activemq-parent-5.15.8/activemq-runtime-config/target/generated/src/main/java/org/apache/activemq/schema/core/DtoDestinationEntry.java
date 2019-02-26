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
 *           &lt;element name="destination" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
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
 *           &lt;element name="value" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}authorizationEntry"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}destinationEntry"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}filteredKahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}policyEntry"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicy"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempDestinationAuthorizationEntry"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="tempTopic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="topic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "destinationOrValueOrAny"
})
@XmlRootElement(name = "destinationEntry")
public class DtoDestinationEntry
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "destination", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "value", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> destinationOrValueOrAny;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "queue")
    protected String queue;
    @XmlAttribute(name = "tempQueue")
    protected Boolean tempQueue;
    @XmlAttribute(name = "tempTopic")
    protected Boolean tempTopic;
    @XmlAttribute(name = "topic")
    protected String topic;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the destinationOrValueOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationOrValueOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationOrValueOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoDestinationEntry.Destination }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoDestinationEntry.Value }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDestinationOrValueOrAny() {
        if (destinationOrValueOrAny == null) {
            destinationOrValueOrAny = new ArrayList<Object>();
        }
        return this.destinationOrValueOrAny;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * 获取queue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * 设置queue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * 获取tempQueue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempQueue() {
        return tempQueue;
    }

    /**
     * 设置tempQueue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempQueue(Boolean value) {
        this.tempQueue = value;
    }

    /**
     * 获取tempTopic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempTopic() {
        return tempTopic;
    }

    /**
     * 设置tempTopic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempTopic(Boolean value) {
        this.tempTopic = value;
    }

    /**
     * 获取topic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 设置topic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
            List<Object> theDestinationOrValueOrAny;
            theDestinationOrValueOrAny = (((this.destinationOrValueOrAny!= null)&&(!this.destinationOrValueOrAny.isEmpty()))?this.getDestinationOrValueOrAny():null);
            strategy.appendField(locator, this, "destinationOrValueOrAny", buffer, theDestinationOrValueOrAny);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            strategy.appendField(locator, this, "destination", buffer, theDestination);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            strategy.appendField(locator, this, "queue", buffer, theQueue);
        }
        {
            Boolean theTempQueue;
            theTempQueue = this.isTempQueue();
            strategy.appendField(locator, this, "tempQueue", buffer, theTempQueue);
        }
        {
            Boolean theTempTopic;
            theTempTopic = this.isTempTopic();
            strategy.appendField(locator, this, "tempTopic", buffer, theTempTopic);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            strategy.appendField(locator, this, "topic", buffer, theTopic);
        }
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
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
            List<Object> theDestinationOrValueOrAny;
            theDestinationOrValueOrAny = (((this.destinationOrValueOrAny!= null)&&(!this.destinationOrValueOrAny.isEmpty()))?this.getDestinationOrValueOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationOrValueOrAny", theDestinationOrValueOrAny), currentHashCode, theDestinationOrValueOrAny);
        }
        {
            String theDestination;
            theDestination = this.getDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destination", theDestination), currentHashCode, theDestination);
        }
        {
            String theQueue;
            theQueue = this.getQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queue", theQueue), currentHashCode, theQueue);
        }
        {
            Boolean theTempQueue;
            theTempQueue = this.isTempQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempQueue", theTempQueue), currentHashCode, theTempQueue);
        }
        {
            Boolean theTempTopic;
            theTempTopic = this.isTempTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempTopic", theTempTopic), currentHashCode, theTempTopic);
        }
        {
            String theTopic;
            theTopic = this.getTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
        }
        {
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
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
        if (!(object instanceof DtoDestinationEntry)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoDestinationEntry that = ((DtoDestinationEntry) object);
        {
            List<Object> lhsDestinationOrValueOrAny;
            lhsDestinationOrValueOrAny = (((this.destinationOrValueOrAny!= null)&&(!this.destinationOrValueOrAny.isEmpty()))?this.getDestinationOrValueOrAny():null);
            List<Object> rhsDestinationOrValueOrAny;
            rhsDestinationOrValueOrAny = (((that.destinationOrValueOrAny!= null)&&(!that.destinationOrValueOrAny.isEmpty()))?that.getDestinationOrValueOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationOrValueOrAny", lhsDestinationOrValueOrAny), LocatorUtils.property(thatLocator, "destinationOrValueOrAny", rhsDestinationOrValueOrAny), lhsDestinationOrValueOrAny, rhsDestinationOrValueOrAny)) {
                return false;
            }
        }
        {
            String lhsDestination;
            lhsDestination = this.getDestination();
            String rhsDestination;
            rhsDestination = that.getDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destination", lhsDestination), LocatorUtils.property(thatLocator, "destination", rhsDestination), lhsDestination, rhsDestination)) {
                return false;
            }
        }
        {
            String lhsQueue;
            lhsQueue = this.getQueue();
            String rhsQueue;
            rhsQueue = that.getQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queue", lhsQueue), LocatorUtils.property(thatLocator, "queue", rhsQueue), lhsQueue, rhsQueue)) {
                return false;
            }
        }
        {
            Boolean lhsTempQueue;
            lhsTempQueue = this.isTempQueue();
            Boolean rhsTempQueue;
            rhsTempQueue = that.isTempQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempQueue", lhsTempQueue), LocatorUtils.property(thatLocator, "tempQueue", rhsTempQueue), lhsTempQueue, rhsTempQueue)) {
                return false;
            }
        }
        {
            Boolean lhsTempTopic;
            lhsTempTopic = this.isTempTopic();
            Boolean rhsTempTopic;
            rhsTempTopic = that.isTempTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempTopic", lhsTempTopic), LocatorUtils.property(thatLocator, "tempTopic", rhsTempTopic), lhsTempTopic, rhsTempTopic)) {
                return false;
            }
        }
        {
            String lhsTopic;
            lhsTopic = this.getTopic();
            String rhsTopic;
            rhsTopic = that.getTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                return false;
            }
        }
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
        "queue",
        "tempQueue",
        "tempTopic",
        "topic",
        "any"
    })
    public static class Destination
        implements Equals, HashCode, ToString
    {

        protected DtoQueue queue;
        protected DtoTempQueue tempQueue;
        protected DtoTempTopic tempTopic;
        protected DtoTopic topic;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取queue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoQueue }
         *     
         */
        public DtoQueue getQueue() {
            return queue;
        }

        /**
         * 设置queue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoQueue }
         *     
         */
        public void setQueue(DtoQueue value) {
            this.queue = value;
        }

        /**
         * 获取tempQueue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTempQueue }
         *     
         */
        public DtoTempQueue getTempQueue() {
            return tempQueue;
        }

        /**
         * 设置tempQueue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempQueue }
         *     
         */
        public void setTempQueue(DtoTempQueue value) {
            this.tempQueue = value;
        }

        /**
         * 获取tempTopic属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTempTopic }
         *     
         */
        public DtoTempTopic getTempTopic() {
            return tempTopic;
        }

        /**
         * 设置tempTopic属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempTopic }
         *     
         */
        public void setTempTopic(DtoTempTopic value) {
            this.tempTopic = value;
        }

        /**
         * 获取topic属性的值。
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
         * 设置topic属性的值。
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
                DtoQueue theQueue;
                theQueue = this.getQueue();
                strategy.appendField(locator, this, "queue", buffer, theQueue);
            }
            {
                DtoTempQueue theTempQueue;
                theTempQueue = this.getTempQueue();
                strategy.appendField(locator, this, "tempQueue", buffer, theTempQueue);
            }
            {
                DtoTempTopic theTempTopic;
                theTempTopic = this.getTempTopic();
                strategy.appendField(locator, this, "tempTopic", buffer, theTempTopic);
            }
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
                DtoQueue theQueue;
                theQueue = this.getQueue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queue", theQueue), currentHashCode, theQueue);
            }
            {
                DtoTempQueue theTempQueue;
                theTempQueue = this.getTempQueue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempQueue", theTempQueue), currentHashCode, theTempQueue);
            }
            {
                DtoTempTopic theTempTopic;
                theTempTopic = this.getTempTopic();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempTopic", theTempTopic), currentHashCode, theTempTopic);
            }
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
            if (!(object instanceof DtoDestinationEntry.Destination)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDestinationEntry.Destination that = ((DtoDestinationEntry.Destination) object);
            {
                DtoQueue lhsQueue;
                lhsQueue = this.getQueue();
                DtoQueue rhsQueue;
                rhsQueue = that.getQueue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queue", lhsQueue), LocatorUtils.property(thatLocator, "queue", rhsQueue), lhsQueue, rhsQueue)) {
                    return false;
                }
            }
            {
                DtoTempQueue lhsTempQueue;
                lhsTempQueue = this.getTempQueue();
                DtoTempQueue rhsTempQueue;
                rhsTempQueue = that.getTempQueue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempQueue", lhsTempQueue), LocatorUtils.property(thatLocator, "tempQueue", rhsTempQueue), lhsTempQueue, rhsTempQueue)) {
                    return false;
                }
            }
            {
                DtoTempTopic lhsTempTopic;
                lhsTempTopic = this.getTempTopic();
                DtoTempTopic rhsTempTopic;
                rhsTempTopic = that.getTempTopic();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempTopic", lhsTempTopic), LocatorUtils.property(thatLocator, "tempTopic", rhsTempTopic), lhsTempTopic, rhsTempTopic)) {
                    return false;
                }
            }
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}authorizationEntry"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}destinationEntry"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}filteredKahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}policyEntry"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}redeliveryPolicy"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempDestinationAuthorizationEntry"/>
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
        "authorizationEntry",
        "destinationEntry",
        "filteredKahaDB",
        "policyEntry",
        "redeliveryPolicy",
        "tempDestinationAuthorizationEntry",
        "any"
    })
    public static class Value
        implements Equals, HashCode, ToString
    {

        protected DtoAuthorizationEntry authorizationEntry;
        protected DtoDestinationEntry destinationEntry;
        protected DtoFilteredKahaDB filteredKahaDB;
        protected DtoPolicyEntry policyEntry;
        protected DtoRedeliveryPolicy redeliveryPolicy;
        protected DtoTempDestinationAuthorizationEntry tempDestinationAuthorizationEntry;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取authorizationEntry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoAuthorizationEntry }
         *     
         */
        public DtoAuthorizationEntry getAuthorizationEntry() {
            return authorizationEntry;
        }

        /**
         * 设置authorizationEntry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoAuthorizationEntry }
         *     
         */
        public void setAuthorizationEntry(DtoAuthorizationEntry value) {
            this.authorizationEntry = value;
        }

        /**
         * 获取destinationEntry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDestinationEntry }
         *     
         */
        public DtoDestinationEntry getDestinationEntry() {
            return destinationEntry;
        }

        /**
         * 设置destinationEntry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDestinationEntry }
         *     
         */
        public void setDestinationEntry(DtoDestinationEntry value) {
            this.destinationEntry = value;
        }

        /**
         * 获取filteredKahaDB属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoFilteredKahaDB }
         *     
         */
        public DtoFilteredKahaDB getFilteredKahaDB() {
            return filteredKahaDB;
        }

        /**
         * 设置filteredKahaDB属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoFilteredKahaDB }
         *     
         */
        public void setFilteredKahaDB(DtoFilteredKahaDB value) {
            this.filteredKahaDB = value;
        }

        /**
         * 获取policyEntry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoPolicyEntry }
         *     
         */
        public DtoPolicyEntry getPolicyEntry() {
            return policyEntry;
        }

        /**
         * 设置policyEntry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoPolicyEntry }
         *     
         */
        public void setPolicyEntry(DtoPolicyEntry value) {
            this.policyEntry = value;
        }

        /**
         * 获取redeliveryPolicy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoRedeliveryPolicy }
         *     
         */
        public DtoRedeliveryPolicy getRedeliveryPolicy() {
            return redeliveryPolicy;
        }

        /**
         * 设置redeliveryPolicy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoRedeliveryPolicy }
         *     
         */
        public void setRedeliveryPolicy(DtoRedeliveryPolicy value) {
            this.redeliveryPolicy = value;
        }

        /**
         * 获取tempDestinationAuthorizationEntry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTempDestinationAuthorizationEntry }
         *     
         */
        public DtoTempDestinationAuthorizationEntry getTempDestinationAuthorizationEntry() {
            return tempDestinationAuthorizationEntry;
        }

        /**
         * 设置tempDestinationAuthorizationEntry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempDestinationAuthorizationEntry }
         *     
         */
        public void setTempDestinationAuthorizationEntry(DtoTempDestinationAuthorizationEntry value) {
            this.tempDestinationAuthorizationEntry = value;
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
                DtoAuthorizationEntry theAuthorizationEntry;
                theAuthorizationEntry = this.getAuthorizationEntry();
                strategy.appendField(locator, this, "authorizationEntry", buffer, theAuthorizationEntry);
            }
            {
                DtoDestinationEntry theDestinationEntry;
                theDestinationEntry = this.getDestinationEntry();
                strategy.appendField(locator, this, "destinationEntry", buffer, theDestinationEntry);
            }
            {
                DtoFilteredKahaDB theFilteredKahaDB;
                theFilteredKahaDB = this.getFilteredKahaDB();
                strategy.appendField(locator, this, "filteredKahaDB", buffer, theFilteredKahaDB);
            }
            {
                DtoPolicyEntry thePolicyEntry;
                thePolicyEntry = this.getPolicyEntry();
                strategy.appendField(locator, this, "policyEntry", buffer, thePolicyEntry);
            }
            {
                DtoRedeliveryPolicy theRedeliveryPolicy;
                theRedeliveryPolicy = this.getRedeliveryPolicy();
                strategy.appendField(locator, this, "redeliveryPolicy", buffer, theRedeliveryPolicy);
            }
            {
                DtoTempDestinationAuthorizationEntry theTempDestinationAuthorizationEntry;
                theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
                strategy.appendField(locator, this, "tempDestinationAuthorizationEntry", buffer, theTempDestinationAuthorizationEntry);
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
                DtoAuthorizationEntry theAuthorizationEntry;
                theAuthorizationEntry = this.getAuthorizationEntry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizationEntry", theAuthorizationEntry), currentHashCode, theAuthorizationEntry);
            }
            {
                DtoDestinationEntry theDestinationEntry;
                theDestinationEntry = this.getDestinationEntry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationEntry", theDestinationEntry), currentHashCode, theDestinationEntry);
            }
            {
                DtoFilteredKahaDB theFilteredKahaDB;
                theFilteredKahaDB = this.getFilteredKahaDB();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filteredKahaDB", theFilteredKahaDB), currentHashCode, theFilteredKahaDB);
            }
            {
                DtoPolicyEntry thePolicyEntry;
                thePolicyEntry = this.getPolicyEntry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "policyEntry", thePolicyEntry), currentHashCode, thePolicyEntry);
            }
            {
                DtoRedeliveryPolicy theRedeliveryPolicy;
                theRedeliveryPolicy = this.getRedeliveryPolicy();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "redeliveryPolicy", theRedeliveryPolicy), currentHashCode, theRedeliveryPolicy);
            }
            {
                DtoTempDestinationAuthorizationEntry theTempDestinationAuthorizationEntry;
                theTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempDestinationAuthorizationEntry", theTempDestinationAuthorizationEntry), currentHashCode, theTempDestinationAuthorizationEntry);
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
            if (!(object instanceof DtoDestinationEntry.Value)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDestinationEntry.Value that = ((DtoDestinationEntry.Value) object);
            {
                DtoAuthorizationEntry lhsAuthorizationEntry;
                lhsAuthorizationEntry = this.getAuthorizationEntry();
                DtoAuthorizationEntry rhsAuthorizationEntry;
                rhsAuthorizationEntry = that.getAuthorizationEntry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizationEntry", lhsAuthorizationEntry), LocatorUtils.property(thatLocator, "authorizationEntry", rhsAuthorizationEntry), lhsAuthorizationEntry, rhsAuthorizationEntry)) {
                    return false;
                }
            }
            {
                DtoDestinationEntry lhsDestinationEntry;
                lhsDestinationEntry = this.getDestinationEntry();
                DtoDestinationEntry rhsDestinationEntry;
                rhsDestinationEntry = that.getDestinationEntry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationEntry", lhsDestinationEntry), LocatorUtils.property(thatLocator, "destinationEntry", rhsDestinationEntry), lhsDestinationEntry, rhsDestinationEntry)) {
                    return false;
                }
            }
            {
                DtoFilteredKahaDB lhsFilteredKahaDB;
                lhsFilteredKahaDB = this.getFilteredKahaDB();
                DtoFilteredKahaDB rhsFilteredKahaDB;
                rhsFilteredKahaDB = that.getFilteredKahaDB();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "filteredKahaDB", lhsFilteredKahaDB), LocatorUtils.property(thatLocator, "filteredKahaDB", rhsFilteredKahaDB), lhsFilteredKahaDB, rhsFilteredKahaDB)) {
                    return false;
                }
            }
            {
                DtoPolicyEntry lhsPolicyEntry;
                lhsPolicyEntry = this.getPolicyEntry();
                DtoPolicyEntry rhsPolicyEntry;
                rhsPolicyEntry = that.getPolicyEntry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "policyEntry", lhsPolicyEntry), LocatorUtils.property(thatLocator, "policyEntry", rhsPolicyEntry), lhsPolicyEntry, rhsPolicyEntry)) {
                    return false;
                }
            }
            {
                DtoRedeliveryPolicy lhsRedeliveryPolicy;
                lhsRedeliveryPolicy = this.getRedeliveryPolicy();
                DtoRedeliveryPolicy rhsRedeliveryPolicy;
                rhsRedeliveryPolicy = that.getRedeliveryPolicy();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "redeliveryPolicy", lhsRedeliveryPolicy), LocatorUtils.property(thatLocator, "redeliveryPolicy", rhsRedeliveryPolicy), lhsRedeliveryPolicy, rhsRedeliveryPolicy)) {
                    return false;
                }
            }
            {
                DtoTempDestinationAuthorizationEntry lhsTempDestinationAuthorizationEntry;
                lhsTempDestinationAuthorizationEntry = this.getTempDestinationAuthorizationEntry();
                DtoTempDestinationAuthorizationEntry rhsTempDestinationAuthorizationEntry;
                rhsTempDestinationAuthorizationEntry = that.getTempDestinationAuthorizationEntry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempDestinationAuthorizationEntry", lhsTempDestinationAuthorizationEntry), LocatorUtils.property(thatLocator, "tempDestinationAuthorizationEntry", rhsTempDestinationAuthorizationEntry), lhsTempDestinationAuthorizationEntry, rhsTempDestinationAuthorizationEntry)) {
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
