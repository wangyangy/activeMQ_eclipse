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
 *           &lt;element name="adapter" minOccurs="0">
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
 *           &lt;element name="executor" minOccurs="0">
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
 *           &lt;element name="jobSchedulerUsage" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jobSchedulerUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="memoryUsage" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}memoryUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="parent" minOccurs="0">
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
 *           &lt;element name="storeUsage" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}storeUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="tempStore" minOccurs="0">
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
 *           &lt;element name="tempUsage" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}tempUsage"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="adapter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkLimitsLogLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="executor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobSchedulerStore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobSchedulerUsage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="memoryUsage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendFailIfNoSpace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="sendFailIfNoSpaceAfterTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sendFailIfNoSpaceExplicitySet" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="storeUsage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempStore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempUsage" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "adapterOrExecutorOrJobSchedulerStore"
})
@XmlRootElement(name = "systemUsage")
public class DtoSystemUsage implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "adapter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jobSchedulerStore", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tempUsage", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "executor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "parent", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jobSchedulerUsage", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "storeUsage", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tempStore", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "memoryUsage", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> adapterOrExecutorOrJobSchedulerStore;
    @XmlAttribute(name = "adapter")
    protected String adapter;
    @XmlAttribute(name = "checkLimitsLogLevel")
    protected String checkLimitsLogLevel;
    @XmlAttribute(name = "executor")
    protected String executor;
    @XmlAttribute(name = "jobSchedulerStore")
    protected String jobSchedulerStore;
    @XmlAttribute(name = "jobSchedulerUsage")
    protected String jobSchedulerUsage;
    @XmlAttribute(name = "memoryUsage")
    protected String memoryUsage;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "parent")
    protected String parent;
    @XmlAttribute(name = "sendFailIfNoSpace")
    protected Boolean sendFailIfNoSpace;
    @XmlAttribute(name = "sendFailIfNoSpaceAfterTimeout")
    protected Long sendFailIfNoSpaceAfterTimeout;
    @XmlAttribute(name = "sendFailIfNoSpaceExplicitySet")
    protected Boolean sendFailIfNoSpaceExplicitySet;
    @XmlAttribute(name = "storeUsage")
    protected String storeUsage;
    @XmlAttribute(name = "tempStore")
    protected String tempStore;
    @XmlAttribute(name = "tempUsage")
    protected String tempUsage;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the adapterOrExecutorOrJobSchedulerStore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adapterOrExecutorOrJobSchedulerStore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdapterOrExecutorOrJobSchedulerStore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.Adapter }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.JobSchedulerStore }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.TempUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.Executor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.Parent }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.JobSchedulerUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.StoreUsage }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.TempStore }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoSystemUsage.MemoryUsage }{@code >}
     * 
     * 
     */
    public List<Object> getAdapterOrExecutorOrJobSchedulerStore() {
        if (adapterOrExecutorOrJobSchedulerStore == null) {
            adapterOrExecutorOrJobSchedulerStore = new ArrayList<Object>();
        }
        return this.adapterOrExecutorOrJobSchedulerStore;
    }

    /**
     * 获取adapter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdapter() {
        return adapter;
    }

    /**
     * 设置adapter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdapter(String value) {
        this.adapter = value;
    }

    /**
     * 获取checkLimitsLogLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckLimitsLogLevel() {
        return checkLimitsLogLevel;
    }

    /**
     * 设置checkLimitsLogLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckLimitsLogLevel(String value) {
        this.checkLimitsLogLevel = value;
    }

    /**
     * 获取executor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutor() {
        return executor;
    }

    /**
     * 设置executor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutor(String value) {
        this.executor = value;
    }

    /**
     * 获取jobSchedulerStore属性的值。
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
     * 设置jobSchedulerStore属性的值。
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
     * 获取jobSchedulerUsage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobSchedulerUsage() {
        return jobSchedulerUsage;
    }

    /**
     * 设置jobSchedulerUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobSchedulerUsage(String value) {
        this.jobSchedulerUsage = value;
    }

    /**
     * 获取memoryUsage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryUsage() {
        return memoryUsage;
    }

    /**
     * 设置memoryUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryUsage(String value) {
        this.memoryUsage = value;
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
     * 获取parent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * 设置parent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * 获取sendFailIfNoSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendFailIfNoSpace() {
        return sendFailIfNoSpace;
    }

    /**
     * 设置sendFailIfNoSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendFailIfNoSpace(Boolean value) {
        this.sendFailIfNoSpace = value;
    }

    /**
     * 获取sendFailIfNoSpaceAfterTimeout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSendFailIfNoSpaceAfterTimeout() {
        return sendFailIfNoSpaceAfterTimeout;
    }

    /**
     * 设置sendFailIfNoSpaceAfterTimeout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSendFailIfNoSpaceAfterTimeout(Long value) {
        this.sendFailIfNoSpaceAfterTimeout = value;
    }

    /**
     * 获取sendFailIfNoSpaceExplicitySet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendFailIfNoSpaceExplicitySet() {
        return sendFailIfNoSpaceExplicitySet;
    }

    /**
     * 设置sendFailIfNoSpaceExplicitySet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendFailIfNoSpaceExplicitySet(Boolean value) {
        this.sendFailIfNoSpaceExplicitySet = value;
    }

    /**
     * 获取storeUsage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreUsage() {
        return storeUsage;
    }

    /**
     * 设置storeUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreUsage(String value) {
        this.storeUsage = value;
    }

    /**
     * 获取tempStore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempStore() {
        return tempStore;
    }

    /**
     * 设置tempStore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempStore(String value) {
        this.tempStore = value;
    }

    /**
     * 获取tempUsage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempUsage() {
        return tempUsage;
    }

    /**
     * 设置tempUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempUsage(String value) {
        this.tempUsage = value;
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
            List<Object> theAdapterOrExecutorOrJobSchedulerStore;
            theAdapterOrExecutorOrJobSchedulerStore = (((this.adapterOrExecutorOrJobSchedulerStore!= null)&&(!this.adapterOrExecutorOrJobSchedulerStore.isEmpty()))?this.getAdapterOrExecutorOrJobSchedulerStore():null);
            strategy.appendField(locator, this, "adapterOrExecutorOrJobSchedulerStore", buffer, theAdapterOrExecutorOrJobSchedulerStore);
        }
        {
            String theAdapter;
            theAdapter = this.getAdapter();
            strategy.appendField(locator, this, "adapter", buffer, theAdapter);
        }
        {
            String theCheckLimitsLogLevel;
            theCheckLimitsLogLevel = this.getCheckLimitsLogLevel();
            strategy.appendField(locator, this, "checkLimitsLogLevel", buffer, theCheckLimitsLogLevel);
        }
        {
            String theExecutor;
            theExecutor = this.getExecutor();
            strategy.appendField(locator, this, "executor", buffer, theExecutor);
        }
        {
            String theJobSchedulerStore;
            theJobSchedulerStore = this.getJobSchedulerStore();
            strategy.appendField(locator, this, "jobSchedulerStore", buffer, theJobSchedulerStore);
        }
        {
            String theJobSchedulerUsage;
            theJobSchedulerUsage = this.getJobSchedulerUsage();
            strategy.appendField(locator, this, "jobSchedulerUsage", buffer, theJobSchedulerUsage);
        }
        {
            String theMemoryUsage;
            theMemoryUsage = this.getMemoryUsage();
            strategy.appendField(locator, this, "memoryUsage", buffer, theMemoryUsage);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theParent;
            theParent = this.getParent();
            strategy.appendField(locator, this, "parent", buffer, theParent);
        }
        {
            Boolean theSendFailIfNoSpace;
            theSendFailIfNoSpace = this.isSendFailIfNoSpace();
            strategy.appendField(locator, this, "sendFailIfNoSpace", buffer, theSendFailIfNoSpace);
        }
        {
            Long theSendFailIfNoSpaceAfterTimeout;
            theSendFailIfNoSpaceAfterTimeout = this.getSendFailIfNoSpaceAfterTimeout();
            strategy.appendField(locator, this, "sendFailIfNoSpaceAfterTimeout", buffer, theSendFailIfNoSpaceAfterTimeout);
        }
        {
            Boolean theSendFailIfNoSpaceExplicitySet;
            theSendFailIfNoSpaceExplicitySet = this.isSendFailIfNoSpaceExplicitySet();
            strategy.appendField(locator, this, "sendFailIfNoSpaceExplicitySet", buffer, theSendFailIfNoSpaceExplicitySet);
        }
        {
            String theStoreUsage;
            theStoreUsage = this.getStoreUsage();
            strategy.appendField(locator, this, "storeUsage", buffer, theStoreUsage);
        }
        {
            String theTempStore;
            theTempStore = this.getTempStore();
            strategy.appendField(locator, this, "tempStore", buffer, theTempStore);
        }
        {
            String theTempUsage;
            theTempUsage = this.getTempUsage();
            strategy.appendField(locator, this, "tempUsage", buffer, theTempUsage);
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
            List<Object> theAdapterOrExecutorOrJobSchedulerStore;
            theAdapterOrExecutorOrJobSchedulerStore = (((this.adapterOrExecutorOrJobSchedulerStore!= null)&&(!this.adapterOrExecutorOrJobSchedulerStore.isEmpty()))?this.getAdapterOrExecutorOrJobSchedulerStore():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adapterOrExecutorOrJobSchedulerStore", theAdapterOrExecutorOrJobSchedulerStore), currentHashCode, theAdapterOrExecutorOrJobSchedulerStore);
        }
        {
            String theAdapter;
            theAdapter = this.getAdapter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adapter", theAdapter), currentHashCode, theAdapter);
        }
        {
            String theCheckLimitsLogLevel;
            theCheckLimitsLogLevel = this.getCheckLimitsLogLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkLimitsLogLevel", theCheckLimitsLogLevel), currentHashCode, theCheckLimitsLogLevel);
        }
        {
            String theExecutor;
            theExecutor = this.getExecutor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executor", theExecutor), currentHashCode, theExecutor);
        }
        {
            String theJobSchedulerStore;
            theJobSchedulerStore = this.getJobSchedulerStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jobSchedulerStore", theJobSchedulerStore), currentHashCode, theJobSchedulerStore);
        }
        {
            String theJobSchedulerUsage;
            theJobSchedulerUsage = this.getJobSchedulerUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jobSchedulerUsage", theJobSchedulerUsage), currentHashCode, theJobSchedulerUsage);
        }
        {
            String theMemoryUsage;
            theMemoryUsage = this.getMemoryUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memoryUsage", theMemoryUsage), currentHashCode, theMemoryUsage);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theParent;
            theParent = this.getParent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parent", theParent), currentHashCode, theParent);
        }
        {
            Boolean theSendFailIfNoSpace;
            theSendFailIfNoSpace = this.isSendFailIfNoSpace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendFailIfNoSpace", theSendFailIfNoSpace), currentHashCode, theSendFailIfNoSpace);
        }
        {
            Long theSendFailIfNoSpaceAfterTimeout;
            theSendFailIfNoSpaceAfterTimeout = this.getSendFailIfNoSpaceAfterTimeout();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendFailIfNoSpaceAfterTimeout", theSendFailIfNoSpaceAfterTimeout), currentHashCode, theSendFailIfNoSpaceAfterTimeout);
        }
        {
            Boolean theSendFailIfNoSpaceExplicitySet;
            theSendFailIfNoSpaceExplicitySet = this.isSendFailIfNoSpaceExplicitySet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sendFailIfNoSpaceExplicitySet", theSendFailIfNoSpaceExplicitySet), currentHashCode, theSendFailIfNoSpaceExplicitySet);
        }
        {
            String theStoreUsage;
            theStoreUsage = this.getStoreUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storeUsage", theStoreUsage), currentHashCode, theStoreUsage);
        }
        {
            String theTempStore;
            theTempStore = this.getTempStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempStore", theTempStore), currentHashCode, theTempStore);
        }
        {
            String theTempUsage;
            theTempUsage = this.getTempUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempUsage", theTempUsage), currentHashCode, theTempUsage);
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
        if (!(object instanceof DtoSystemUsage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoSystemUsage that = ((DtoSystemUsage) object);
        {
            List<Object> lhsAdapterOrExecutorOrJobSchedulerStore;
            lhsAdapterOrExecutorOrJobSchedulerStore = (((this.adapterOrExecutorOrJobSchedulerStore!= null)&&(!this.adapterOrExecutorOrJobSchedulerStore.isEmpty()))?this.getAdapterOrExecutorOrJobSchedulerStore():null);
            List<Object> rhsAdapterOrExecutorOrJobSchedulerStore;
            rhsAdapterOrExecutorOrJobSchedulerStore = (((that.adapterOrExecutorOrJobSchedulerStore!= null)&&(!that.adapterOrExecutorOrJobSchedulerStore.isEmpty()))?that.getAdapterOrExecutorOrJobSchedulerStore():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adapterOrExecutorOrJobSchedulerStore", lhsAdapterOrExecutorOrJobSchedulerStore), LocatorUtils.property(thatLocator, "adapterOrExecutorOrJobSchedulerStore", rhsAdapterOrExecutorOrJobSchedulerStore), lhsAdapterOrExecutorOrJobSchedulerStore, rhsAdapterOrExecutorOrJobSchedulerStore)) {
                return false;
            }
        }
        {
            String lhsAdapter;
            lhsAdapter = this.getAdapter();
            String rhsAdapter;
            rhsAdapter = that.getAdapter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adapter", lhsAdapter), LocatorUtils.property(thatLocator, "adapter", rhsAdapter), lhsAdapter, rhsAdapter)) {
                return false;
            }
        }
        {
            String lhsCheckLimitsLogLevel;
            lhsCheckLimitsLogLevel = this.getCheckLimitsLogLevel();
            String rhsCheckLimitsLogLevel;
            rhsCheckLimitsLogLevel = that.getCheckLimitsLogLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkLimitsLogLevel", lhsCheckLimitsLogLevel), LocatorUtils.property(thatLocator, "checkLimitsLogLevel", rhsCheckLimitsLogLevel), lhsCheckLimitsLogLevel, rhsCheckLimitsLogLevel)) {
                return false;
            }
        }
        {
            String lhsExecutor;
            lhsExecutor = this.getExecutor();
            String rhsExecutor;
            rhsExecutor = that.getExecutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executor", lhsExecutor), LocatorUtils.property(thatLocator, "executor", rhsExecutor), lhsExecutor, rhsExecutor)) {
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
            String lhsJobSchedulerUsage;
            lhsJobSchedulerUsage = this.getJobSchedulerUsage();
            String rhsJobSchedulerUsage;
            rhsJobSchedulerUsage = that.getJobSchedulerUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jobSchedulerUsage", lhsJobSchedulerUsage), LocatorUtils.property(thatLocator, "jobSchedulerUsage", rhsJobSchedulerUsage), lhsJobSchedulerUsage, rhsJobSchedulerUsage)) {
                return false;
            }
        }
        {
            String lhsMemoryUsage;
            lhsMemoryUsage = this.getMemoryUsage();
            String rhsMemoryUsage;
            rhsMemoryUsage = that.getMemoryUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "memoryUsage", lhsMemoryUsage), LocatorUtils.property(thatLocator, "memoryUsage", rhsMemoryUsage), lhsMemoryUsage, rhsMemoryUsage)) {
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
            String lhsParent;
            lhsParent = this.getParent();
            String rhsParent;
            rhsParent = that.getParent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parent", lhsParent), LocatorUtils.property(thatLocator, "parent", rhsParent), lhsParent, rhsParent)) {
                return false;
            }
        }
        {
            Boolean lhsSendFailIfNoSpace;
            lhsSendFailIfNoSpace = this.isSendFailIfNoSpace();
            Boolean rhsSendFailIfNoSpace;
            rhsSendFailIfNoSpace = that.isSendFailIfNoSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendFailIfNoSpace", lhsSendFailIfNoSpace), LocatorUtils.property(thatLocator, "sendFailIfNoSpace", rhsSendFailIfNoSpace), lhsSendFailIfNoSpace, rhsSendFailIfNoSpace)) {
                return false;
            }
        }
        {
            Long lhsSendFailIfNoSpaceAfterTimeout;
            lhsSendFailIfNoSpaceAfterTimeout = this.getSendFailIfNoSpaceAfterTimeout();
            Long rhsSendFailIfNoSpaceAfterTimeout;
            rhsSendFailIfNoSpaceAfterTimeout = that.getSendFailIfNoSpaceAfterTimeout();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendFailIfNoSpaceAfterTimeout", lhsSendFailIfNoSpaceAfterTimeout), LocatorUtils.property(thatLocator, "sendFailIfNoSpaceAfterTimeout", rhsSendFailIfNoSpaceAfterTimeout), lhsSendFailIfNoSpaceAfterTimeout, rhsSendFailIfNoSpaceAfterTimeout)) {
                return false;
            }
        }
        {
            Boolean lhsSendFailIfNoSpaceExplicitySet;
            lhsSendFailIfNoSpaceExplicitySet = this.isSendFailIfNoSpaceExplicitySet();
            Boolean rhsSendFailIfNoSpaceExplicitySet;
            rhsSendFailIfNoSpaceExplicitySet = that.isSendFailIfNoSpaceExplicitySet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendFailIfNoSpaceExplicitySet", lhsSendFailIfNoSpaceExplicitySet), LocatorUtils.property(thatLocator, "sendFailIfNoSpaceExplicitySet", rhsSendFailIfNoSpaceExplicitySet), lhsSendFailIfNoSpaceExplicitySet, rhsSendFailIfNoSpaceExplicitySet)) {
                return false;
            }
        }
        {
            String lhsStoreUsage;
            lhsStoreUsage = this.getStoreUsage();
            String rhsStoreUsage;
            rhsStoreUsage = that.getStoreUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "storeUsage", lhsStoreUsage), LocatorUtils.property(thatLocator, "storeUsage", rhsStoreUsage), lhsStoreUsage, rhsStoreUsage)) {
                return false;
            }
        }
        {
            String lhsTempStore;
            lhsTempStore = this.getTempStore();
            String rhsTempStore;
            rhsTempStore = that.getTempStore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempStore", lhsTempStore), LocatorUtils.property(thatLocator, "tempStore", rhsTempStore), lhsTempStore, rhsTempStore)) {
                return false;
            }
        }
        {
            String lhsTempUsage;
            lhsTempUsage = this.getTempUsage();
            String rhsTempUsage;
            rhsTempUsage = that.getTempUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempUsage", lhsTempUsage), LocatorUtils.property(thatLocator, "tempUsage", rhsTempUsage), lhsTempUsage, rhsTempUsage)) {
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
    public static class Adapter
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
         * 获取jdbcPersistenceAdapter属性的值。
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
         * 设置jdbcPersistenceAdapter属性的值。
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
         * 获取journalPersistenceAdapter属性的值。
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
         * 设置journalPersistenceAdapter属性的值。
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
         * 获取kahaDB属性的值。
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
         * 设置kahaDB属性的值。
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
         * 获取levelDB属性的值。
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
         * 设置levelDB属性的值。
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
         * 获取mKahaDB属性的值。
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
         * 设置mKahaDB属性的值。
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
         * 获取memoryPersistenceAdapter属性的值。
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
         * 设置memoryPersistenceAdapter属性的值。
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
         * 获取replicatedLevelDB属性的值。
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
         * 设置replicatedLevelDB属性的值。
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
            if (!(object instanceof DtoSystemUsage.Adapter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.Adapter that = ((DtoSystemUsage.Adapter) object);
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
    public static class Executor
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
            if (!(object instanceof DtoSystemUsage.Executor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.Executor that = ((DtoSystemUsage.Executor) object);
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
            if (!(object instanceof DtoSystemUsage.JobSchedulerStore)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.JobSchedulerStore that = ((DtoSystemUsage.JobSchedulerStore) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jobSchedulerUsage"/>
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
        "jobSchedulerUsage",
        "any"
    })
    public static class JobSchedulerUsage
        implements Equals, HashCode, ToString
    {

        protected DtoJobSchedulerUsage jobSchedulerUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取jobSchedulerUsage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoJobSchedulerUsage }
         *     
         */
        public DtoJobSchedulerUsage getJobSchedulerUsage() {
            return jobSchedulerUsage;
        }

        /**
         * 设置jobSchedulerUsage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJobSchedulerUsage }
         *     
         */
        public void setJobSchedulerUsage(DtoJobSchedulerUsage value) {
            this.jobSchedulerUsage = value;
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
                DtoJobSchedulerUsage theJobSchedulerUsage;
                theJobSchedulerUsage = this.getJobSchedulerUsage();
                strategy.appendField(locator, this, "jobSchedulerUsage", buffer, theJobSchedulerUsage);
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
                DtoJobSchedulerUsage theJobSchedulerUsage;
                theJobSchedulerUsage = this.getJobSchedulerUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jobSchedulerUsage", theJobSchedulerUsage), currentHashCode, theJobSchedulerUsage);
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
            if (!(object instanceof DtoSystemUsage.JobSchedulerUsage)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.JobSchedulerUsage that = ((DtoSystemUsage.JobSchedulerUsage) object);
            {
                DtoJobSchedulerUsage lhsJobSchedulerUsage;
                lhsJobSchedulerUsage = this.getJobSchedulerUsage();
                DtoJobSchedulerUsage rhsJobSchedulerUsage;
                rhsJobSchedulerUsage = that.getJobSchedulerUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "jobSchedulerUsage", lhsJobSchedulerUsage), LocatorUtils.property(thatLocator, "jobSchedulerUsage", rhsJobSchedulerUsage), lhsJobSchedulerUsage, rhsJobSchedulerUsage)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}memoryUsage"/>
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
        "memoryUsage",
        "any"
    })
    public static class MemoryUsage
        implements Equals, HashCode, ToString
    {

        protected DtoMemoryUsage memoryUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取memoryUsage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoMemoryUsage }
         *     
         */
        public DtoMemoryUsage getMemoryUsage() {
            return memoryUsage;
        }

        /**
         * 设置memoryUsage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoMemoryUsage }
         *     
         */
        public void setMemoryUsage(DtoMemoryUsage value) {
            this.memoryUsage = value;
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
                DtoMemoryUsage theMemoryUsage;
                theMemoryUsage = this.getMemoryUsage();
                strategy.appendField(locator, this, "memoryUsage", buffer, theMemoryUsage);
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
                DtoMemoryUsage theMemoryUsage;
                theMemoryUsage = this.getMemoryUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memoryUsage", theMemoryUsage), currentHashCode, theMemoryUsage);
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
            if (!(object instanceof DtoSystemUsage.MemoryUsage)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.MemoryUsage that = ((DtoSystemUsage.MemoryUsage) object);
            {
                DtoMemoryUsage lhsMemoryUsage;
                lhsMemoryUsage = this.getMemoryUsage();
                DtoMemoryUsage rhsMemoryUsage;
                rhsMemoryUsage = that.getMemoryUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "memoryUsage", lhsMemoryUsage), LocatorUtils.property(thatLocator, "memoryUsage", rhsMemoryUsage), lhsMemoryUsage, rhsMemoryUsage)) {
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
    public static class Parent
        implements Equals, HashCode, ToString
    {

        protected DtoSystemUsage systemUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取systemUsage属性的值。
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
         * 设置systemUsage属性的值。
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
            if (!(object instanceof DtoSystemUsage.Parent)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.Parent that = ((DtoSystemUsage.Parent) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}storeUsage"/>
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
        "storeUsage",
        "any"
    })
    public static class StoreUsage
        implements Equals, HashCode, ToString
    {

        protected DtoStoreUsage storeUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取storeUsage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoStoreUsage }
         *     
         */
        public DtoStoreUsage getStoreUsage() {
            return storeUsage;
        }

        /**
         * 设置storeUsage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoStoreUsage }
         *     
         */
        public void setStoreUsage(DtoStoreUsage value) {
            this.storeUsage = value;
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
                DtoStoreUsage theStoreUsage;
                theStoreUsage = this.getStoreUsage();
                strategy.appendField(locator, this, "storeUsage", buffer, theStoreUsage);
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
                DtoStoreUsage theStoreUsage;
                theStoreUsage = this.getStoreUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storeUsage", theStoreUsage), currentHashCode, theStoreUsage);
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
            if (!(object instanceof DtoSystemUsage.StoreUsage)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.StoreUsage that = ((DtoSystemUsage.StoreUsage) object);
            {
                DtoStoreUsage lhsStoreUsage;
                lhsStoreUsage = this.getStoreUsage();
                DtoStoreUsage rhsStoreUsage;
                rhsStoreUsage = that.getStoreUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "storeUsage", lhsStoreUsage), LocatorUtils.property(thatLocator, "storeUsage", rhsStoreUsage), lhsStoreUsage, rhsStoreUsage)) {
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
    public static class TempStore
        implements Equals, HashCode, ToString
    {

        protected DtoLevelDB levelDB;
        protected DtoPListStoreImpl pListStoreImpl;
        protected DtoReplicatedLevelDB replicatedLevelDB;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取levelDB属性的值。
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
         * 设置levelDB属性的值。
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
         * 获取pListStoreImpl属性的值。
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
         * 设置pListStoreImpl属性的值。
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
         * 获取replicatedLevelDB属性的值。
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
         * 设置replicatedLevelDB属性的值。
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
            if (!(object instanceof DtoSystemUsage.TempStore)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.TempStore that = ((DtoSystemUsage.TempStore) object);
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}tempUsage"/>
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
        "tempUsage",
        "any"
    })
    public static class TempUsage
        implements Equals, HashCode, ToString
    {

        protected DtoTempUsage tempUsage;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取tempUsage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTempUsage }
         *     
         */
        public DtoTempUsage getTempUsage() {
            return tempUsage;
        }

        /**
         * 设置tempUsage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTempUsage }
         *     
         */
        public void setTempUsage(DtoTempUsage value) {
            this.tempUsage = value;
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
                DtoTempUsage theTempUsage;
                theTempUsage = this.getTempUsage();
                strategy.appendField(locator, this, "tempUsage", buffer, theTempUsage);
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
                DtoTempUsage theTempUsage;
                theTempUsage = this.getTempUsage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempUsage", theTempUsage), currentHashCode, theTempUsage);
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
            if (!(object instanceof DtoSystemUsage.TempUsage)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSystemUsage.TempUsage that = ((DtoSystemUsage.TempUsage) object);
            {
                DtoTempUsage lhsTempUsage;
                lhsTempUsage = this.getTempUsage();
                DtoTempUsage rhsTempUsage;
                rhsTempUsage = that.getTempUsage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tempUsage", lhsTempUsage), LocatorUtils.property(thatLocator, "tempUsage", rhsTempUsage), lhsTempUsage, rhsTempUsage)) {
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
