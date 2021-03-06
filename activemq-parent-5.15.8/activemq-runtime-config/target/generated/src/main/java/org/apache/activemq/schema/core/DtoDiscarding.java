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
 *           &lt;element name="deadLetterQueue" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="deadLetterQueue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enableAudit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="expiration" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="maxAuditDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxProducersToAudit" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="processExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="processNonPersistent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "deadLetterQueueOrAny"
})
@XmlRootElement(name = "discarding")
public class DtoDiscarding
    implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "deadLetterQueue", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    @XmlAnyElement(lax = true)
    protected List<Object> deadLetterQueueOrAny;
    @XmlAttribute(name = "deadLetterQueue")
    protected String deadLetterQueue;
    @XmlAttribute(name = "enableAudit")
    protected Boolean enableAudit;
    @XmlAttribute(name = "expiration")
    protected Long expiration;
    @XmlAttribute(name = "maxAuditDepth")
    protected BigInteger maxAuditDepth;
    @XmlAttribute(name = "maxProducersToAudit")
    protected BigInteger maxProducersToAudit;
    @XmlAttribute(name = "processExpired")
    protected Boolean processExpired;
    @XmlAttribute(name = "processNonPersistent")
    protected Boolean processNonPersistent;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the deadLetterQueueOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deadLetterQueueOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeadLetterQueueOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoDiscarding.DeadLetterQueue }{@code >}
     * 
     * 
     */
    public List<Object> getDeadLetterQueueOrAny() {
        if (deadLetterQueueOrAny == null) {
            deadLetterQueueOrAny = new ArrayList<Object>();
        }
        return this.deadLetterQueueOrAny;
    }

    /**
     * 获取deadLetterQueue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadLetterQueue() {
        return deadLetterQueue;
    }

    /**
     * 设置deadLetterQueue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadLetterQueue(String value) {
        this.deadLetterQueue = value;
    }

    /**
     * 获取enableAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAudit() {
        return enableAudit;
    }

    /**
     * 设置enableAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAudit(Boolean value) {
        this.enableAudit = value;
    }

    /**
     * 获取expiration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpiration() {
        return expiration;
    }

    /**
     * 设置expiration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpiration(Long value) {
        this.expiration = value;
    }

    /**
     * 获取maxAuditDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAuditDepth() {
        return maxAuditDepth;
    }

    /**
     * 设置maxAuditDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAuditDepth(BigInteger value) {
        this.maxAuditDepth = value;
    }

    /**
     * 获取maxProducersToAudit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxProducersToAudit() {
        return maxProducersToAudit;
    }

    /**
     * 设置maxProducersToAudit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxProducersToAudit(BigInteger value) {
        this.maxProducersToAudit = value;
    }

    /**
     * 获取processExpired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessExpired() {
        return processExpired;
    }

    /**
     * 设置processExpired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessExpired(Boolean value) {
        this.processExpired = value;
    }

    /**
     * 获取processNonPersistent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessNonPersistent() {
        return processNonPersistent;
    }

    /**
     * 设置processNonPersistent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessNonPersistent(Boolean value) {
        this.processNonPersistent = value;
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
            List<Object> theDeadLetterQueueOrAny;
            theDeadLetterQueueOrAny = (((this.deadLetterQueueOrAny!= null)&&(!this.deadLetterQueueOrAny.isEmpty()))?this.getDeadLetterQueueOrAny():null);
            strategy.appendField(locator, this, "deadLetterQueueOrAny", buffer, theDeadLetterQueueOrAny);
        }
        {
            String theDeadLetterQueue;
            theDeadLetterQueue = this.getDeadLetterQueue();
            strategy.appendField(locator, this, "deadLetterQueue", buffer, theDeadLetterQueue);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            strategy.appendField(locator, this, "enableAudit", buffer, theEnableAudit);
        }
        {
            Long theExpiration;
            theExpiration = this.getExpiration();
            strategy.appendField(locator, this, "expiration", buffer, theExpiration);
        }
        {
            BigInteger theMaxAuditDepth;
            theMaxAuditDepth = this.getMaxAuditDepth();
            strategy.appendField(locator, this, "maxAuditDepth", buffer, theMaxAuditDepth);
        }
        {
            BigInteger theMaxProducersToAudit;
            theMaxProducersToAudit = this.getMaxProducersToAudit();
            strategy.appendField(locator, this, "maxProducersToAudit", buffer, theMaxProducersToAudit);
        }
        {
            Boolean theProcessExpired;
            theProcessExpired = this.isProcessExpired();
            strategy.appendField(locator, this, "processExpired", buffer, theProcessExpired);
        }
        {
            Boolean theProcessNonPersistent;
            theProcessNonPersistent = this.isProcessNonPersistent();
            strategy.appendField(locator, this, "processNonPersistent", buffer, theProcessNonPersistent);
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
            List<Object> theDeadLetterQueueOrAny;
            theDeadLetterQueueOrAny = (((this.deadLetterQueueOrAny!= null)&&(!this.deadLetterQueueOrAny.isEmpty()))?this.getDeadLetterQueueOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deadLetterQueueOrAny", theDeadLetterQueueOrAny), currentHashCode, theDeadLetterQueueOrAny);
        }
        {
            String theDeadLetterQueue;
            theDeadLetterQueue = this.getDeadLetterQueue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deadLetterQueue", theDeadLetterQueue), currentHashCode, theDeadLetterQueue);
        }
        {
            Boolean theEnableAudit;
            theEnableAudit = this.isEnableAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableAudit", theEnableAudit), currentHashCode, theEnableAudit);
        }
        {
            Long theExpiration;
            theExpiration = this.getExpiration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiration", theExpiration), currentHashCode, theExpiration);
        }
        {
            BigInteger theMaxAuditDepth;
            theMaxAuditDepth = this.getMaxAuditDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAuditDepth", theMaxAuditDepth), currentHashCode, theMaxAuditDepth);
        }
        {
            BigInteger theMaxProducersToAudit;
            theMaxProducersToAudit = this.getMaxProducersToAudit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxProducersToAudit", theMaxProducersToAudit), currentHashCode, theMaxProducersToAudit);
        }
        {
            Boolean theProcessExpired;
            theProcessExpired = this.isProcessExpired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processExpired", theProcessExpired), currentHashCode, theProcessExpired);
        }
        {
            Boolean theProcessNonPersistent;
            theProcessNonPersistent = this.isProcessNonPersistent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processNonPersistent", theProcessNonPersistent), currentHashCode, theProcessNonPersistent);
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
        if (!(object instanceof DtoDiscarding)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoDiscarding that = ((DtoDiscarding) object);
        {
            List<Object> lhsDeadLetterQueueOrAny;
            lhsDeadLetterQueueOrAny = (((this.deadLetterQueueOrAny!= null)&&(!this.deadLetterQueueOrAny.isEmpty()))?this.getDeadLetterQueueOrAny():null);
            List<Object> rhsDeadLetterQueueOrAny;
            rhsDeadLetterQueueOrAny = (((that.deadLetterQueueOrAny!= null)&&(!that.deadLetterQueueOrAny.isEmpty()))?that.getDeadLetterQueueOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deadLetterQueueOrAny", lhsDeadLetterQueueOrAny), LocatorUtils.property(thatLocator, "deadLetterQueueOrAny", rhsDeadLetterQueueOrAny), lhsDeadLetterQueueOrAny, rhsDeadLetterQueueOrAny)) {
                return false;
            }
        }
        {
            String lhsDeadLetterQueue;
            lhsDeadLetterQueue = this.getDeadLetterQueue();
            String rhsDeadLetterQueue;
            rhsDeadLetterQueue = that.getDeadLetterQueue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deadLetterQueue", lhsDeadLetterQueue), LocatorUtils.property(thatLocator, "deadLetterQueue", rhsDeadLetterQueue), lhsDeadLetterQueue, rhsDeadLetterQueue)) {
                return false;
            }
        }
        {
            Boolean lhsEnableAudit;
            lhsEnableAudit = this.isEnableAudit();
            Boolean rhsEnableAudit;
            rhsEnableAudit = that.isEnableAudit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableAudit", lhsEnableAudit), LocatorUtils.property(thatLocator, "enableAudit", rhsEnableAudit), lhsEnableAudit, rhsEnableAudit)) {
                return false;
            }
        }
        {
            Long lhsExpiration;
            lhsExpiration = this.getExpiration();
            Long rhsExpiration;
            rhsExpiration = that.getExpiration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiration", lhsExpiration), LocatorUtils.property(thatLocator, "expiration", rhsExpiration), lhsExpiration, rhsExpiration)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxAuditDepth;
            lhsMaxAuditDepth = this.getMaxAuditDepth();
            BigInteger rhsMaxAuditDepth;
            rhsMaxAuditDepth = that.getMaxAuditDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAuditDepth", lhsMaxAuditDepth), LocatorUtils.property(thatLocator, "maxAuditDepth", rhsMaxAuditDepth), lhsMaxAuditDepth, rhsMaxAuditDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxProducersToAudit;
            lhsMaxProducersToAudit = this.getMaxProducersToAudit();
            BigInteger rhsMaxProducersToAudit;
            rhsMaxProducersToAudit = that.getMaxProducersToAudit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxProducersToAudit", lhsMaxProducersToAudit), LocatorUtils.property(thatLocator, "maxProducersToAudit", rhsMaxProducersToAudit), lhsMaxProducersToAudit, rhsMaxProducersToAudit)) {
                return false;
            }
        }
        {
            Boolean lhsProcessExpired;
            lhsProcessExpired = this.isProcessExpired();
            Boolean rhsProcessExpired;
            rhsProcessExpired = that.isProcessExpired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processExpired", lhsProcessExpired), LocatorUtils.property(thatLocator, "processExpired", rhsProcessExpired), lhsProcessExpired, rhsProcessExpired)) {
                return false;
            }
        }
        {
            Boolean lhsProcessNonPersistent;
            lhsProcessNonPersistent = this.isProcessNonPersistent();
            Boolean rhsProcessNonPersistent;
            rhsProcessNonPersistent = that.isProcessNonPersistent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processNonPersistent", lhsProcessNonPersistent), LocatorUtils.property(thatLocator, "processNonPersistent", rhsProcessNonPersistent), lhsProcessNonPersistent, rhsProcessNonPersistent)) {
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
    public static class DeadLetterQueue
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
            if (!(object instanceof DtoDiscarding.DeadLetterQueue)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoDiscarding.DeadLetterQueue that = ((DtoDiscarding.DeadLetterQueue) object);
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

}
