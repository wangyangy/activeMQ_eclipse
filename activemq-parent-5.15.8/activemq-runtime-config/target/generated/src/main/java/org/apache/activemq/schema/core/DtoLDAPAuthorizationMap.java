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
 *           &lt;element name="context" minOccurs="0">
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
 *           &lt;element name="options" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="queueSearchMatchingFormat" minOccurs="0">
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
 *           &lt;element name="topicSearchMatchingFormat" minOccurs="0">
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
 *       &lt;attribute name="adminAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="adminBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="advisorySearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="authentication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionProtocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initialContextFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="options" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueSearchMatchingFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueSearchSubtreeBool" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="readAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="readBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tempSearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicSearchMatchingFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicSearchSubtreeBool" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useAdvisorySearchBase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="writeAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="writeBase" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "contextOrOptionsOrQueueSearchMatchingFormat"
})
@XmlRootElement(name = "lDAPAuthorizationMap")
public class DtoLDAPAuthorizationMap
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "context", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "topicSearchMatchingFormat", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "options", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "queueSearchMatchingFormat", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> contextOrOptionsOrQueueSearchMatchingFormat;
    @XmlAttribute(name = "adminAttribute")
    protected String adminAttribute;
    @XmlAttribute(name = "adminBase")
    protected String adminBase;
    @XmlAttribute(name = "advisorySearchBase")
    protected String advisorySearchBase;
    @XmlAttribute(name = "authentication")
    protected String authentication;
    @XmlAttribute(name = "connectionPassword")
    protected String connectionPassword;
    @XmlAttribute(name = "connectionProtocol")
    protected String connectionProtocol;
    @XmlAttribute(name = "connectionURL")
    protected String connectionURL;
    @XmlAttribute(name = "connectionUsername")
    protected String connectionUsername;
    @XmlAttribute(name = "context")
    protected String context;
    @XmlAttribute(name = "initialContextFactory")
    protected String initialContextFactory;
    @XmlAttribute(name = "options")
    protected String options;
    @XmlAttribute(name = "queueSearchMatchingFormat")
    protected String queueSearchMatchingFormat;
    @XmlAttribute(name = "queueSearchSubtreeBool")
    protected Boolean queueSearchSubtreeBool;
    @XmlAttribute(name = "readAttribute")
    protected String readAttribute;
    @XmlAttribute(name = "readBase")
    protected String readBase;
    @XmlAttribute(name = "tempSearchBase")
    protected String tempSearchBase;
    @XmlAttribute(name = "topicSearchMatchingFormat")
    protected String topicSearchMatchingFormat;
    @XmlAttribute(name = "topicSearchSubtreeBool")
    protected Boolean topicSearchSubtreeBool;
    @XmlAttribute(name = "useAdvisorySearchBase")
    protected Boolean useAdvisorySearchBase;
    @XmlAttribute(name = "writeAttribute")
    protected String writeAttribute;
    @XmlAttribute(name = "writeBase")
    protected String writeBase;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the contextOrOptionsOrQueueSearchMatchingFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextOrOptionsOrQueueSearchMatchingFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextOrOptionsOrQueueSearchMatchingFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.Context }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.TopicSearchMatchingFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.Options }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.QueueSearchMatchingFormat }{@code >}
     * 
     * 
     */
    public List<Object> getContextOrOptionsOrQueueSearchMatchingFormat() {
        if (contextOrOptionsOrQueueSearchMatchingFormat == null) {
            contextOrOptionsOrQueueSearchMatchingFormat = new ArrayList<Object>();
        }
        return this.contextOrOptionsOrQueueSearchMatchingFormat;
    }

    /**
     * 获取adminAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminAttribute() {
        return adminAttribute;
    }

    /**
     * 设置adminAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminAttribute(String value) {
        this.adminAttribute = value;
    }

    /**
     * 获取adminBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminBase() {
        return adminBase;
    }

    /**
     * 设置adminBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminBase(String value) {
        this.adminBase = value;
    }

    /**
     * 获取advisorySearchBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisorySearchBase() {
        return advisorySearchBase;
    }

    /**
     * 设置advisorySearchBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisorySearchBase(String value) {
        this.advisorySearchBase = value;
    }

    /**
     * 获取authentication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * 设置authentication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthentication(String value) {
        this.authentication = value;
    }

    /**
     * 获取connectionPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPassword() {
        return connectionPassword;
    }

    /**
     * 设置connectionPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionPassword(String value) {
        this.connectionPassword = value;
    }

    /**
     * 获取connectionProtocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionProtocol() {
        return connectionProtocol;
    }

    /**
     * 设置connectionProtocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionProtocol(String value) {
        this.connectionProtocol = value;
    }

    /**
     * 获取connectionURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionURL() {
        return connectionURL;
    }

    /**
     * 设置connectionURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionURL(String value) {
        this.connectionURL = value;
    }

    /**
     * 获取connectionUsername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionUsername() {
        return connectionUsername;
    }

    /**
     * 设置connectionUsername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionUsername(String value) {
        this.connectionUsername = value;
    }

    /**
     * 获取context属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置context属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * 获取initialContextFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialContextFactory() {
        return initialContextFactory;
    }

    /**
     * 设置initialContextFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialContextFactory(String value) {
        this.initialContextFactory = value;
    }

    /**
     * 获取options属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * 设置options属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

    /**
     * 获取queueSearchMatchingFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueSearchMatchingFormat() {
        return queueSearchMatchingFormat;
    }

    /**
     * 设置queueSearchMatchingFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueSearchMatchingFormat(String value) {
        this.queueSearchMatchingFormat = value;
    }

    /**
     * 获取queueSearchSubtreeBool属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueueSearchSubtreeBool() {
        return queueSearchSubtreeBool;
    }

    /**
     * 设置queueSearchSubtreeBool属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueueSearchSubtreeBool(Boolean value) {
        this.queueSearchSubtreeBool = value;
    }

    /**
     * 获取readAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadAttribute() {
        return readAttribute;
    }

    /**
     * 设置readAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadAttribute(String value) {
        this.readAttribute = value;
    }

    /**
     * 获取readBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadBase() {
        return readBase;
    }

    /**
     * 设置readBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadBase(String value) {
        this.readBase = value;
    }

    /**
     * 获取tempSearchBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempSearchBase() {
        return tempSearchBase;
    }

    /**
     * 设置tempSearchBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempSearchBase(String value) {
        this.tempSearchBase = value;
    }

    /**
     * 获取topicSearchMatchingFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicSearchMatchingFormat() {
        return topicSearchMatchingFormat;
    }

    /**
     * 设置topicSearchMatchingFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicSearchMatchingFormat(String value) {
        this.topicSearchMatchingFormat = value;
    }

    /**
     * 获取topicSearchSubtreeBool属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopicSearchSubtreeBool() {
        return topicSearchSubtreeBool;
    }

    /**
     * 设置topicSearchSubtreeBool属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopicSearchSubtreeBool(Boolean value) {
        this.topicSearchSubtreeBool = value;
    }

    /**
     * 获取useAdvisorySearchBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAdvisorySearchBase() {
        return useAdvisorySearchBase;
    }

    /**
     * 设置useAdvisorySearchBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAdvisorySearchBase(Boolean value) {
        this.useAdvisorySearchBase = value;
    }

    /**
     * 获取writeAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteAttribute() {
        return writeAttribute;
    }

    /**
     * 设置writeAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteAttribute(String value) {
        this.writeAttribute = value;
    }

    /**
     * 获取writeBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteBase() {
        return writeBase;
    }

    /**
     * 设置writeBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteBase(String value) {
        this.writeBase = value;
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
            List<Object> theContextOrOptionsOrQueueSearchMatchingFormat;
            theContextOrOptionsOrQueueSearchMatchingFormat = (((this.contextOrOptionsOrQueueSearchMatchingFormat!= null)&&(!this.contextOrOptionsOrQueueSearchMatchingFormat.isEmpty()))?this.getContextOrOptionsOrQueueSearchMatchingFormat():null);
            strategy.appendField(locator, this, "contextOrOptionsOrQueueSearchMatchingFormat", buffer, theContextOrOptionsOrQueueSearchMatchingFormat);
        }
        {
            String theAdminAttribute;
            theAdminAttribute = this.getAdminAttribute();
            strategy.appendField(locator, this, "adminAttribute", buffer, theAdminAttribute);
        }
        {
            String theAdminBase;
            theAdminBase = this.getAdminBase();
            strategy.appendField(locator, this, "adminBase", buffer, theAdminBase);
        }
        {
            String theAdvisorySearchBase;
            theAdvisorySearchBase = this.getAdvisorySearchBase();
            strategy.appendField(locator, this, "advisorySearchBase", buffer, theAdvisorySearchBase);
        }
        {
            String theAuthentication;
            theAuthentication = this.getAuthentication();
            strategy.appendField(locator, this, "authentication", buffer, theAuthentication);
        }
        {
            String theConnectionPassword;
            theConnectionPassword = this.getConnectionPassword();
            strategy.appendField(locator, this, "connectionPassword", buffer, theConnectionPassword);
        }
        {
            String theConnectionProtocol;
            theConnectionProtocol = this.getConnectionProtocol();
            strategy.appendField(locator, this, "connectionProtocol", buffer, theConnectionProtocol);
        }
        {
            String theConnectionURL;
            theConnectionURL = this.getConnectionURL();
            strategy.appendField(locator, this, "connectionURL", buffer, theConnectionURL);
        }
        {
            String theConnectionUsername;
            theConnectionUsername = this.getConnectionUsername();
            strategy.appendField(locator, this, "connectionUsername", buffer, theConnectionUsername);
        }
        {
            String theContext;
            theContext = this.getContext();
            strategy.appendField(locator, this, "context", buffer, theContext);
        }
        {
            String theInitialContextFactory;
            theInitialContextFactory = this.getInitialContextFactory();
            strategy.appendField(locator, this, "initialContextFactory", buffer, theInitialContextFactory);
        }
        {
            String theOptions;
            theOptions = this.getOptions();
            strategy.appendField(locator, this, "options", buffer, theOptions);
        }
        {
            String theQueueSearchMatchingFormat;
            theQueueSearchMatchingFormat = this.getQueueSearchMatchingFormat();
            strategy.appendField(locator, this, "queueSearchMatchingFormat", buffer, theQueueSearchMatchingFormat);
        }
        {
            Boolean theQueueSearchSubtreeBool;
            theQueueSearchSubtreeBool = this.isQueueSearchSubtreeBool();
            strategy.appendField(locator, this, "queueSearchSubtreeBool", buffer, theQueueSearchSubtreeBool);
        }
        {
            String theReadAttribute;
            theReadAttribute = this.getReadAttribute();
            strategy.appendField(locator, this, "readAttribute", buffer, theReadAttribute);
        }
        {
            String theReadBase;
            theReadBase = this.getReadBase();
            strategy.appendField(locator, this, "readBase", buffer, theReadBase);
        }
        {
            String theTempSearchBase;
            theTempSearchBase = this.getTempSearchBase();
            strategy.appendField(locator, this, "tempSearchBase", buffer, theTempSearchBase);
        }
        {
            String theTopicSearchMatchingFormat;
            theTopicSearchMatchingFormat = this.getTopicSearchMatchingFormat();
            strategy.appendField(locator, this, "topicSearchMatchingFormat", buffer, theTopicSearchMatchingFormat);
        }
        {
            Boolean theTopicSearchSubtreeBool;
            theTopicSearchSubtreeBool = this.isTopicSearchSubtreeBool();
            strategy.appendField(locator, this, "topicSearchSubtreeBool", buffer, theTopicSearchSubtreeBool);
        }
        {
            Boolean theUseAdvisorySearchBase;
            theUseAdvisorySearchBase = this.isUseAdvisorySearchBase();
            strategy.appendField(locator, this, "useAdvisorySearchBase", buffer, theUseAdvisorySearchBase);
        }
        {
            String theWriteAttribute;
            theWriteAttribute = this.getWriteAttribute();
            strategy.appendField(locator, this, "writeAttribute", buffer, theWriteAttribute);
        }
        {
            String theWriteBase;
            theWriteBase = this.getWriteBase();
            strategy.appendField(locator, this, "writeBase", buffer, theWriteBase);
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
            List<Object> theContextOrOptionsOrQueueSearchMatchingFormat;
            theContextOrOptionsOrQueueSearchMatchingFormat = (((this.contextOrOptionsOrQueueSearchMatchingFormat!= null)&&(!this.contextOrOptionsOrQueueSearchMatchingFormat.isEmpty()))?this.getContextOrOptionsOrQueueSearchMatchingFormat():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextOrOptionsOrQueueSearchMatchingFormat", theContextOrOptionsOrQueueSearchMatchingFormat), currentHashCode, theContextOrOptionsOrQueueSearchMatchingFormat);
        }
        {
            String theAdminAttribute;
            theAdminAttribute = this.getAdminAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminAttribute", theAdminAttribute), currentHashCode, theAdminAttribute);
        }
        {
            String theAdminBase;
            theAdminBase = this.getAdminBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminBase", theAdminBase), currentHashCode, theAdminBase);
        }
        {
            String theAdvisorySearchBase;
            theAdvisorySearchBase = this.getAdvisorySearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "advisorySearchBase", theAdvisorySearchBase), currentHashCode, theAdvisorySearchBase);
        }
        {
            String theAuthentication;
            theAuthentication = this.getAuthentication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authentication", theAuthentication), currentHashCode, theAuthentication);
        }
        {
            String theConnectionPassword;
            theConnectionPassword = this.getConnectionPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionPassword", theConnectionPassword), currentHashCode, theConnectionPassword);
        }
        {
            String theConnectionProtocol;
            theConnectionProtocol = this.getConnectionProtocol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionProtocol", theConnectionProtocol), currentHashCode, theConnectionProtocol);
        }
        {
            String theConnectionURL;
            theConnectionURL = this.getConnectionURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionURL", theConnectionURL), currentHashCode, theConnectionURL);
        }
        {
            String theConnectionUsername;
            theConnectionUsername = this.getConnectionUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionUsername", theConnectionUsername), currentHashCode, theConnectionUsername);
        }
        {
            String theContext;
            theContext = this.getContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "context", theContext), currentHashCode, theContext);
        }
        {
            String theInitialContextFactory;
            theInitialContextFactory = this.getInitialContextFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initialContextFactory", theInitialContextFactory), currentHashCode, theInitialContextFactory);
        }
        {
            String theOptions;
            theOptions = this.getOptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "options", theOptions), currentHashCode, theOptions);
        }
        {
            String theQueueSearchMatchingFormat;
            theQueueSearchMatchingFormat = this.getQueueSearchMatchingFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueSearchMatchingFormat", theQueueSearchMatchingFormat), currentHashCode, theQueueSearchMatchingFormat);
        }
        {
            Boolean theQueueSearchSubtreeBool;
            theQueueSearchSubtreeBool = this.isQueueSearchSubtreeBool();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueSearchSubtreeBool", theQueueSearchSubtreeBool), currentHashCode, theQueueSearchSubtreeBool);
        }
        {
            String theReadAttribute;
            theReadAttribute = this.getReadAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "readAttribute", theReadAttribute), currentHashCode, theReadAttribute);
        }
        {
            String theReadBase;
            theReadBase = this.getReadBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "readBase", theReadBase), currentHashCode, theReadBase);
        }
        {
            String theTempSearchBase;
            theTempSearchBase = this.getTempSearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempSearchBase", theTempSearchBase), currentHashCode, theTempSearchBase);
        }
        {
            String theTopicSearchMatchingFormat;
            theTopicSearchMatchingFormat = this.getTopicSearchMatchingFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicSearchMatchingFormat", theTopicSearchMatchingFormat), currentHashCode, theTopicSearchMatchingFormat);
        }
        {
            Boolean theTopicSearchSubtreeBool;
            theTopicSearchSubtreeBool = this.isTopicSearchSubtreeBool();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicSearchSubtreeBool", theTopicSearchSubtreeBool), currentHashCode, theTopicSearchSubtreeBool);
        }
        {
            Boolean theUseAdvisorySearchBase;
            theUseAdvisorySearchBase = this.isUseAdvisorySearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useAdvisorySearchBase", theUseAdvisorySearchBase), currentHashCode, theUseAdvisorySearchBase);
        }
        {
            String theWriteAttribute;
            theWriteAttribute = this.getWriteAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "writeAttribute", theWriteAttribute), currentHashCode, theWriteAttribute);
        }
        {
            String theWriteBase;
            theWriteBase = this.getWriteBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "writeBase", theWriteBase), currentHashCode, theWriteBase);
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
        if (!(object instanceof DtoLDAPAuthorizationMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoLDAPAuthorizationMap that = ((DtoLDAPAuthorizationMap) object);
        {
            List<Object> lhsContextOrOptionsOrQueueSearchMatchingFormat;
            lhsContextOrOptionsOrQueueSearchMatchingFormat = (((this.contextOrOptionsOrQueueSearchMatchingFormat!= null)&&(!this.contextOrOptionsOrQueueSearchMatchingFormat.isEmpty()))?this.getContextOrOptionsOrQueueSearchMatchingFormat():null);
            List<Object> rhsContextOrOptionsOrQueueSearchMatchingFormat;
            rhsContextOrOptionsOrQueueSearchMatchingFormat = (((that.contextOrOptionsOrQueueSearchMatchingFormat!= null)&&(!that.contextOrOptionsOrQueueSearchMatchingFormat.isEmpty()))?that.getContextOrOptionsOrQueueSearchMatchingFormat():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextOrOptionsOrQueueSearchMatchingFormat", lhsContextOrOptionsOrQueueSearchMatchingFormat), LocatorUtils.property(thatLocator, "contextOrOptionsOrQueueSearchMatchingFormat", rhsContextOrOptionsOrQueueSearchMatchingFormat), lhsContextOrOptionsOrQueueSearchMatchingFormat, rhsContextOrOptionsOrQueueSearchMatchingFormat)) {
                return false;
            }
        }
        {
            String lhsAdminAttribute;
            lhsAdminAttribute = this.getAdminAttribute();
            String rhsAdminAttribute;
            rhsAdminAttribute = that.getAdminAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminAttribute", lhsAdminAttribute), LocatorUtils.property(thatLocator, "adminAttribute", rhsAdminAttribute), lhsAdminAttribute, rhsAdminAttribute)) {
                return false;
            }
        }
        {
            String lhsAdminBase;
            lhsAdminBase = this.getAdminBase();
            String rhsAdminBase;
            rhsAdminBase = that.getAdminBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminBase", lhsAdminBase), LocatorUtils.property(thatLocator, "adminBase", rhsAdminBase), lhsAdminBase, rhsAdminBase)) {
                return false;
            }
        }
        {
            String lhsAdvisorySearchBase;
            lhsAdvisorySearchBase = this.getAdvisorySearchBase();
            String rhsAdvisorySearchBase;
            rhsAdvisorySearchBase = that.getAdvisorySearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "advisorySearchBase", lhsAdvisorySearchBase), LocatorUtils.property(thatLocator, "advisorySearchBase", rhsAdvisorySearchBase), lhsAdvisorySearchBase, rhsAdvisorySearchBase)) {
                return false;
            }
        }
        {
            String lhsAuthentication;
            lhsAuthentication = this.getAuthentication();
            String rhsAuthentication;
            rhsAuthentication = that.getAuthentication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authentication", lhsAuthentication), LocatorUtils.property(thatLocator, "authentication", rhsAuthentication), lhsAuthentication, rhsAuthentication)) {
                return false;
            }
        }
        {
            String lhsConnectionPassword;
            lhsConnectionPassword = this.getConnectionPassword();
            String rhsConnectionPassword;
            rhsConnectionPassword = that.getConnectionPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionPassword", lhsConnectionPassword), LocatorUtils.property(thatLocator, "connectionPassword", rhsConnectionPassword), lhsConnectionPassword, rhsConnectionPassword)) {
                return false;
            }
        }
        {
            String lhsConnectionProtocol;
            lhsConnectionProtocol = this.getConnectionProtocol();
            String rhsConnectionProtocol;
            rhsConnectionProtocol = that.getConnectionProtocol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionProtocol", lhsConnectionProtocol), LocatorUtils.property(thatLocator, "connectionProtocol", rhsConnectionProtocol), lhsConnectionProtocol, rhsConnectionProtocol)) {
                return false;
            }
        }
        {
            String lhsConnectionURL;
            lhsConnectionURL = this.getConnectionURL();
            String rhsConnectionURL;
            rhsConnectionURL = that.getConnectionURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionURL", lhsConnectionURL), LocatorUtils.property(thatLocator, "connectionURL", rhsConnectionURL), lhsConnectionURL, rhsConnectionURL)) {
                return false;
            }
        }
        {
            String lhsConnectionUsername;
            lhsConnectionUsername = this.getConnectionUsername();
            String rhsConnectionUsername;
            rhsConnectionUsername = that.getConnectionUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionUsername", lhsConnectionUsername), LocatorUtils.property(thatLocator, "connectionUsername", rhsConnectionUsername), lhsConnectionUsername, rhsConnectionUsername)) {
                return false;
            }
        }
        {
            String lhsContext;
            lhsContext = this.getContext();
            String rhsContext;
            rhsContext = that.getContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "context", lhsContext), LocatorUtils.property(thatLocator, "context", rhsContext), lhsContext, rhsContext)) {
                return false;
            }
        }
        {
            String lhsInitialContextFactory;
            lhsInitialContextFactory = this.getInitialContextFactory();
            String rhsInitialContextFactory;
            rhsInitialContextFactory = that.getInitialContextFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initialContextFactory", lhsInitialContextFactory), LocatorUtils.property(thatLocator, "initialContextFactory", rhsInitialContextFactory), lhsInitialContextFactory, rhsInitialContextFactory)) {
                return false;
            }
        }
        {
            String lhsOptions;
            lhsOptions = this.getOptions();
            String rhsOptions;
            rhsOptions = that.getOptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "options", lhsOptions), LocatorUtils.property(thatLocator, "options", rhsOptions), lhsOptions, rhsOptions)) {
                return false;
            }
        }
        {
            String lhsQueueSearchMatchingFormat;
            lhsQueueSearchMatchingFormat = this.getQueueSearchMatchingFormat();
            String rhsQueueSearchMatchingFormat;
            rhsQueueSearchMatchingFormat = that.getQueueSearchMatchingFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queueSearchMatchingFormat", lhsQueueSearchMatchingFormat), LocatorUtils.property(thatLocator, "queueSearchMatchingFormat", rhsQueueSearchMatchingFormat), lhsQueueSearchMatchingFormat, rhsQueueSearchMatchingFormat)) {
                return false;
            }
        }
        {
            Boolean lhsQueueSearchSubtreeBool;
            lhsQueueSearchSubtreeBool = this.isQueueSearchSubtreeBool();
            Boolean rhsQueueSearchSubtreeBool;
            rhsQueueSearchSubtreeBool = that.isQueueSearchSubtreeBool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queueSearchSubtreeBool", lhsQueueSearchSubtreeBool), LocatorUtils.property(thatLocator, "queueSearchSubtreeBool", rhsQueueSearchSubtreeBool), lhsQueueSearchSubtreeBool, rhsQueueSearchSubtreeBool)) {
                return false;
            }
        }
        {
            String lhsReadAttribute;
            lhsReadAttribute = this.getReadAttribute();
            String rhsReadAttribute;
            rhsReadAttribute = that.getReadAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "readAttribute", lhsReadAttribute), LocatorUtils.property(thatLocator, "readAttribute", rhsReadAttribute), lhsReadAttribute, rhsReadAttribute)) {
                return false;
            }
        }
        {
            String lhsReadBase;
            lhsReadBase = this.getReadBase();
            String rhsReadBase;
            rhsReadBase = that.getReadBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "readBase", lhsReadBase), LocatorUtils.property(thatLocator, "readBase", rhsReadBase), lhsReadBase, rhsReadBase)) {
                return false;
            }
        }
        {
            String lhsTempSearchBase;
            lhsTempSearchBase = this.getTempSearchBase();
            String rhsTempSearchBase;
            rhsTempSearchBase = that.getTempSearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempSearchBase", lhsTempSearchBase), LocatorUtils.property(thatLocator, "tempSearchBase", rhsTempSearchBase), lhsTempSearchBase, rhsTempSearchBase)) {
                return false;
            }
        }
        {
            String lhsTopicSearchMatchingFormat;
            lhsTopicSearchMatchingFormat = this.getTopicSearchMatchingFormat();
            String rhsTopicSearchMatchingFormat;
            rhsTopicSearchMatchingFormat = that.getTopicSearchMatchingFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicSearchMatchingFormat", lhsTopicSearchMatchingFormat), LocatorUtils.property(thatLocator, "topicSearchMatchingFormat", rhsTopicSearchMatchingFormat), lhsTopicSearchMatchingFormat, rhsTopicSearchMatchingFormat)) {
                return false;
            }
        }
        {
            Boolean lhsTopicSearchSubtreeBool;
            lhsTopicSearchSubtreeBool = this.isTopicSearchSubtreeBool();
            Boolean rhsTopicSearchSubtreeBool;
            rhsTopicSearchSubtreeBool = that.isTopicSearchSubtreeBool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicSearchSubtreeBool", lhsTopicSearchSubtreeBool), LocatorUtils.property(thatLocator, "topicSearchSubtreeBool", rhsTopicSearchSubtreeBool), lhsTopicSearchSubtreeBool, rhsTopicSearchSubtreeBool)) {
                return false;
            }
        }
        {
            Boolean lhsUseAdvisorySearchBase;
            lhsUseAdvisorySearchBase = this.isUseAdvisorySearchBase();
            Boolean rhsUseAdvisorySearchBase;
            rhsUseAdvisorySearchBase = that.isUseAdvisorySearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useAdvisorySearchBase", lhsUseAdvisorySearchBase), LocatorUtils.property(thatLocator, "useAdvisorySearchBase", rhsUseAdvisorySearchBase), lhsUseAdvisorySearchBase, rhsUseAdvisorySearchBase)) {
                return false;
            }
        }
        {
            String lhsWriteAttribute;
            lhsWriteAttribute = this.getWriteAttribute();
            String rhsWriteAttribute;
            rhsWriteAttribute = that.getWriteAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "writeAttribute", lhsWriteAttribute), LocatorUtils.property(thatLocator, "writeAttribute", rhsWriteAttribute), lhsWriteAttribute, rhsWriteAttribute)) {
                return false;
            }
        }
        {
            String lhsWriteBase;
            lhsWriteBase = this.getWriteBase();
            String rhsWriteBase;
            rhsWriteBase = that.getWriteBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "writeBase", lhsWriteBase), LocatorUtils.property(thatLocator, "writeBase", rhsWriteBase), lhsWriteBase, rhsWriteBase)) {
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
    public static class Context
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
            if (!(object instanceof DtoLDAPAuthorizationMap.Context)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLDAPAuthorizationMap.Context that = ((DtoLDAPAuthorizationMap.Context) object);
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
    public static class Options
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
            if (!(object instanceof DtoLDAPAuthorizationMap.Options)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLDAPAuthorizationMap.Options that = ((DtoLDAPAuthorizationMap.Options) object);
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
    public static class QueueSearchMatchingFormat
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
            if (!(object instanceof DtoLDAPAuthorizationMap.QueueSearchMatchingFormat)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLDAPAuthorizationMap.QueueSearchMatchingFormat that = ((DtoLDAPAuthorizationMap.QueueSearchMatchingFormat) object);
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
    public static class TopicSearchMatchingFormat
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
            if (!(object instanceof DtoLDAPAuthorizationMap.TopicSearchMatchingFormat)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLDAPAuthorizationMap.TopicSearchMatchingFormat that = ((DtoLDAPAuthorizationMap.TopicSearchMatchingFormat) object);
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
