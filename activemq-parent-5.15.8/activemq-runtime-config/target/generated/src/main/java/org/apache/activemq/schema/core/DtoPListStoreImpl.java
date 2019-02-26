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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cleanupInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enableIndexWriteAsync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="failIfDatabaseIsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="indexCacheSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="indexDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indexEnablePageCaching" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="indexPageSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="indexWriteBatchSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="journalMaxFileLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="journalMaxWriteBatchSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lazyInit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "brokerServiceOrAny"
})
@XmlRootElement(name = "pListStoreImpl")
public class DtoPListStoreImpl implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrAny;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "cleanupInterval")
    protected Long cleanupInterval;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "enableIndexWriteAsync")
    protected Boolean enableIndexWriteAsync;
    @XmlAttribute(name = "failIfDatabaseIsLocked")
    protected Boolean failIfDatabaseIsLocked;
    @XmlAttribute(name = "indexCacheSize")
    protected BigInteger indexCacheSize;
    @XmlAttribute(name = "indexDirectory")
    protected String indexDirectory;
    @XmlAttribute(name = "indexEnablePageCaching")
    protected Boolean indexEnablePageCaching;
    @XmlAttribute(name = "indexPageSize")
    protected BigInteger indexPageSize;
    @XmlAttribute(name = "indexWriteBatchSize")
    protected BigInteger indexWriteBatchSize;
    @XmlAttribute(name = "journalMaxFileLength")
    protected BigInteger journalMaxFileLength;
    @XmlAttribute(name = "journalMaxWriteBatchSize")
    protected BigInteger journalMaxWriteBatchSize;
    @XmlAttribute(name = "lazyInit")
    protected Boolean lazyInit;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoPListStoreImpl.BrokerService }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerServiceOrAny() {
        if (brokerServiceOrAny == null) {
            brokerServiceOrAny = new ArrayList<Object>();
        }
        return this.brokerServiceOrAny;
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
     * 获取cleanupInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCleanupInterval() {
        return cleanupInterval;
    }

    /**
     * 设置cleanupInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCleanupInterval(Long value) {
        this.cleanupInterval = value;
    }

    /**
     * 获取directory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * 设置directory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * 获取enableIndexWriteAsync属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableIndexWriteAsync() {
        return enableIndexWriteAsync;
    }

    /**
     * 设置enableIndexWriteAsync属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableIndexWriteAsync(Boolean value) {
        this.enableIndexWriteAsync = value;
    }

    /**
     * 获取failIfDatabaseIsLocked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailIfDatabaseIsLocked() {
        return failIfDatabaseIsLocked;
    }

    /**
     * 设置failIfDatabaseIsLocked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailIfDatabaseIsLocked(Boolean value) {
        this.failIfDatabaseIsLocked = value;
    }

    /**
     * 获取indexCacheSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexCacheSize() {
        return indexCacheSize;
    }

    /**
     * 设置indexCacheSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexCacheSize(BigInteger value) {
        this.indexCacheSize = value;
    }

    /**
     * 获取indexDirectory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexDirectory() {
        return indexDirectory;
    }

    /**
     * 设置indexDirectory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexDirectory(String value) {
        this.indexDirectory = value;
    }

    /**
     * 获取indexEnablePageCaching属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndexEnablePageCaching() {
        return indexEnablePageCaching;
    }

    /**
     * 设置indexEnablePageCaching属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndexEnablePageCaching(Boolean value) {
        this.indexEnablePageCaching = value;
    }

    /**
     * 获取indexPageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexPageSize() {
        return indexPageSize;
    }

    /**
     * 设置indexPageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexPageSize(BigInteger value) {
        this.indexPageSize = value;
    }

    /**
     * 获取indexWriteBatchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexWriteBatchSize() {
        return indexWriteBatchSize;
    }

    /**
     * 设置indexWriteBatchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexWriteBatchSize(BigInteger value) {
        this.indexWriteBatchSize = value;
    }

    /**
     * 获取journalMaxFileLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJournalMaxFileLength() {
        return journalMaxFileLength;
    }

    /**
     * 设置journalMaxFileLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJournalMaxFileLength(BigInteger value) {
        this.journalMaxFileLength = value;
    }

    /**
     * 获取journalMaxWriteBatchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJournalMaxWriteBatchSize() {
        return journalMaxWriteBatchSize;
    }

    /**
     * 设置journalMaxWriteBatchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJournalMaxWriteBatchSize(BigInteger value) {
        this.journalMaxWriteBatchSize = value;
    }

    /**
     * 获取lazyInit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLazyInit() {
        return lazyInit;
    }

    /**
     * 设置lazyInit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLazyInit(Boolean value) {
        this.lazyInit = value;
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
            List<Object> theBrokerServiceOrAny;
            theBrokerServiceOrAny = (((this.brokerServiceOrAny!= null)&&(!this.brokerServiceOrAny.isEmpty()))?this.getBrokerServiceOrAny():null);
            strategy.appendField(locator, this, "brokerServiceOrAny", buffer, theBrokerServiceOrAny);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            strategy.appendField(locator, this, "brokerService", buffer, theBrokerService);
        }
        {
            Long theCleanupInterval;
            theCleanupInterval = this.getCleanupInterval();
            strategy.appendField(locator, this, "cleanupInterval", buffer, theCleanupInterval);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            strategy.appendField(locator, this, "directory", buffer, theDirectory);
        }
        {
            Boolean theEnableIndexWriteAsync;
            theEnableIndexWriteAsync = this.isEnableIndexWriteAsync();
            strategy.appendField(locator, this, "enableIndexWriteAsync", buffer, theEnableIndexWriteAsync);
        }
        {
            Boolean theFailIfDatabaseIsLocked;
            theFailIfDatabaseIsLocked = this.isFailIfDatabaseIsLocked();
            strategy.appendField(locator, this, "failIfDatabaseIsLocked", buffer, theFailIfDatabaseIsLocked);
        }
        {
            BigInteger theIndexCacheSize;
            theIndexCacheSize = this.getIndexCacheSize();
            strategy.appendField(locator, this, "indexCacheSize", buffer, theIndexCacheSize);
        }
        {
            String theIndexDirectory;
            theIndexDirectory = this.getIndexDirectory();
            strategy.appendField(locator, this, "indexDirectory", buffer, theIndexDirectory);
        }
        {
            Boolean theIndexEnablePageCaching;
            theIndexEnablePageCaching = this.isIndexEnablePageCaching();
            strategy.appendField(locator, this, "indexEnablePageCaching", buffer, theIndexEnablePageCaching);
        }
        {
            BigInteger theIndexPageSize;
            theIndexPageSize = this.getIndexPageSize();
            strategy.appendField(locator, this, "indexPageSize", buffer, theIndexPageSize);
        }
        {
            BigInteger theIndexWriteBatchSize;
            theIndexWriteBatchSize = this.getIndexWriteBatchSize();
            strategy.appendField(locator, this, "indexWriteBatchSize", buffer, theIndexWriteBatchSize);
        }
        {
            BigInteger theJournalMaxFileLength;
            theJournalMaxFileLength = this.getJournalMaxFileLength();
            strategy.appendField(locator, this, "journalMaxFileLength", buffer, theJournalMaxFileLength);
        }
        {
            BigInteger theJournalMaxWriteBatchSize;
            theJournalMaxWriteBatchSize = this.getJournalMaxWriteBatchSize();
            strategy.appendField(locator, this, "journalMaxWriteBatchSize", buffer, theJournalMaxWriteBatchSize);
        }
        {
            Boolean theLazyInit;
            theLazyInit = this.isLazyInit();
            strategy.appendField(locator, this, "lazyInit", buffer, theLazyInit);
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
            List<Object> theBrokerServiceOrAny;
            theBrokerServiceOrAny = (((this.brokerServiceOrAny!= null)&&(!this.brokerServiceOrAny.isEmpty()))?this.getBrokerServiceOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrAny", theBrokerServiceOrAny), currentHashCode, theBrokerServiceOrAny);
        }
        {
            String theBrokerService;
            theBrokerService = this.getBrokerService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerService", theBrokerService), currentHashCode, theBrokerService);
        }
        {
            Long theCleanupInterval;
            theCleanupInterval = this.getCleanupInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cleanupInterval", theCleanupInterval), currentHashCode, theCleanupInterval);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directory", theDirectory), currentHashCode, theDirectory);
        }
        {
            Boolean theEnableIndexWriteAsync;
            theEnableIndexWriteAsync = this.isEnableIndexWriteAsync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableIndexWriteAsync", theEnableIndexWriteAsync), currentHashCode, theEnableIndexWriteAsync);
        }
        {
            Boolean theFailIfDatabaseIsLocked;
            theFailIfDatabaseIsLocked = this.isFailIfDatabaseIsLocked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failIfDatabaseIsLocked", theFailIfDatabaseIsLocked), currentHashCode, theFailIfDatabaseIsLocked);
        }
        {
            BigInteger theIndexCacheSize;
            theIndexCacheSize = this.getIndexCacheSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexCacheSize", theIndexCacheSize), currentHashCode, theIndexCacheSize);
        }
        {
            String theIndexDirectory;
            theIndexDirectory = this.getIndexDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexDirectory", theIndexDirectory), currentHashCode, theIndexDirectory);
        }
        {
            Boolean theIndexEnablePageCaching;
            theIndexEnablePageCaching = this.isIndexEnablePageCaching();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexEnablePageCaching", theIndexEnablePageCaching), currentHashCode, theIndexEnablePageCaching);
        }
        {
            BigInteger theIndexPageSize;
            theIndexPageSize = this.getIndexPageSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexPageSize", theIndexPageSize), currentHashCode, theIndexPageSize);
        }
        {
            BigInteger theIndexWriteBatchSize;
            theIndexWriteBatchSize = this.getIndexWriteBatchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexWriteBatchSize", theIndexWriteBatchSize), currentHashCode, theIndexWriteBatchSize);
        }
        {
            BigInteger theJournalMaxFileLength;
            theJournalMaxFileLength = this.getJournalMaxFileLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalMaxFileLength", theJournalMaxFileLength), currentHashCode, theJournalMaxFileLength);
        }
        {
            BigInteger theJournalMaxWriteBatchSize;
            theJournalMaxWriteBatchSize = this.getJournalMaxWriteBatchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalMaxWriteBatchSize", theJournalMaxWriteBatchSize), currentHashCode, theJournalMaxWriteBatchSize);
        }
        {
            Boolean theLazyInit;
            theLazyInit = this.isLazyInit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lazyInit", theLazyInit), currentHashCode, theLazyInit);
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
        if (!(object instanceof DtoPListStoreImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoPListStoreImpl that = ((DtoPListStoreImpl) object);
        {
            List<Object> lhsBrokerServiceOrAny;
            lhsBrokerServiceOrAny = (((this.brokerServiceOrAny!= null)&&(!this.brokerServiceOrAny.isEmpty()))?this.getBrokerServiceOrAny():null);
            List<Object> rhsBrokerServiceOrAny;
            rhsBrokerServiceOrAny = (((that.brokerServiceOrAny!= null)&&(!that.brokerServiceOrAny.isEmpty()))?that.getBrokerServiceOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrAny", lhsBrokerServiceOrAny), LocatorUtils.property(thatLocator, "brokerServiceOrAny", rhsBrokerServiceOrAny), lhsBrokerServiceOrAny, rhsBrokerServiceOrAny)) {
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
            Long lhsCleanupInterval;
            lhsCleanupInterval = this.getCleanupInterval();
            Long rhsCleanupInterval;
            rhsCleanupInterval = that.getCleanupInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cleanupInterval", lhsCleanupInterval), LocatorUtils.property(thatLocator, "cleanupInterval", rhsCleanupInterval), lhsCleanupInterval, rhsCleanupInterval)) {
                return false;
            }
        }
        {
            String lhsDirectory;
            lhsDirectory = this.getDirectory();
            String rhsDirectory;
            rhsDirectory = that.getDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directory", lhsDirectory), LocatorUtils.property(thatLocator, "directory", rhsDirectory), lhsDirectory, rhsDirectory)) {
                return false;
            }
        }
        {
            Boolean lhsEnableIndexWriteAsync;
            lhsEnableIndexWriteAsync = this.isEnableIndexWriteAsync();
            Boolean rhsEnableIndexWriteAsync;
            rhsEnableIndexWriteAsync = that.isEnableIndexWriteAsync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableIndexWriteAsync", lhsEnableIndexWriteAsync), LocatorUtils.property(thatLocator, "enableIndexWriteAsync", rhsEnableIndexWriteAsync), lhsEnableIndexWriteAsync, rhsEnableIndexWriteAsync)) {
                return false;
            }
        }
        {
            Boolean lhsFailIfDatabaseIsLocked;
            lhsFailIfDatabaseIsLocked = this.isFailIfDatabaseIsLocked();
            Boolean rhsFailIfDatabaseIsLocked;
            rhsFailIfDatabaseIsLocked = that.isFailIfDatabaseIsLocked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failIfDatabaseIsLocked", lhsFailIfDatabaseIsLocked), LocatorUtils.property(thatLocator, "failIfDatabaseIsLocked", rhsFailIfDatabaseIsLocked), lhsFailIfDatabaseIsLocked, rhsFailIfDatabaseIsLocked)) {
                return false;
            }
        }
        {
            BigInteger lhsIndexCacheSize;
            lhsIndexCacheSize = this.getIndexCacheSize();
            BigInteger rhsIndexCacheSize;
            rhsIndexCacheSize = that.getIndexCacheSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexCacheSize", lhsIndexCacheSize), LocatorUtils.property(thatLocator, "indexCacheSize", rhsIndexCacheSize), lhsIndexCacheSize, rhsIndexCacheSize)) {
                return false;
            }
        }
        {
            String lhsIndexDirectory;
            lhsIndexDirectory = this.getIndexDirectory();
            String rhsIndexDirectory;
            rhsIndexDirectory = that.getIndexDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexDirectory", lhsIndexDirectory), LocatorUtils.property(thatLocator, "indexDirectory", rhsIndexDirectory), lhsIndexDirectory, rhsIndexDirectory)) {
                return false;
            }
        }
        {
            Boolean lhsIndexEnablePageCaching;
            lhsIndexEnablePageCaching = this.isIndexEnablePageCaching();
            Boolean rhsIndexEnablePageCaching;
            rhsIndexEnablePageCaching = that.isIndexEnablePageCaching();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexEnablePageCaching", lhsIndexEnablePageCaching), LocatorUtils.property(thatLocator, "indexEnablePageCaching", rhsIndexEnablePageCaching), lhsIndexEnablePageCaching, rhsIndexEnablePageCaching)) {
                return false;
            }
        }
        {
            BigInteger lhsIndexPageSize;
            lhsIndexPageSize = this.getIndexPageSize();
            BigInteger rhsIndexPageSize;
            rhsIndexPageSize = that.getIndexPageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexPageSize", lhsIndexPageSize), LocatorUtils.property(thatLocator, "indexPageSize", rhsIndexPageSize), lhsIndexPageSize, rhsIndexPageSize)) {
                return false;
            }
        }
        {
            BigInteger lhsIndexWriteBatchSize;
            lhsIndexWriteBatchSize = this.getIndexWriteBatchSize();
            BigInteger rhsIndexWriteBatchSize;
            rhsIndexWriteBatchSize = that.getIndexWriteBatchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexWriteBatchSize", lhsIndexWriteBatchSize), LocatorUtils.property(thatLocator, "indexWriteBatchSize", rhsIndexWriteBatchSize), lhsIndexWriteBatchSize, rhsIndexWriteBatchSize)) {
                return false;
            }
        }
        {
            BigInteger lhsJournalMaxFileLength;
            lhsJournalMaxFileLength = this.getJournalMaxFileLength();
            BigInteger rhsJournalMaxFileLength;
            rhsJournalMaxFileLength = that.getJournalMaxFileLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalMaxFileLength", lhsJournalMaxFileLength), LocatorUtils.property(thatLocator, "journalMaxFileLength", rhsJournalMaxFileLength), lhsJournalMaxFileLength, rhsJournalMaxFileLength)) {
                return false;
            }
        }
        {
            BigInteger lhsJournalMaxWriteBatchSize;
            lhsJournalMaxWriteBatchSize = this.getJournalMaxWriteBatchSize();
            BigInteger rhsJournalMaxWriteBatchSize;
            rhsJournalMaxWriteBatchSize = that.getJournalMaxWriteBatchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalMaxWriteBatchSize", lhsJournalMaxWriteBatchSize), LocatorUtils.property(thatLocator, "journalMaxWriteBatchSize", rhsJournalMaxWriteBatchSize), lhsJournalMaxWriteBatchSize, rhsJournalMaxWriteBatchSize)) {
                return false;
            }
        }
        {
            Boolean lhsLazyInit;
            lhsLazyInit = this.isLazyInit();
            Boolean rhsLazyInit;
            rhsLazyInit = that.isLazyInit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lazyInit", lhsLazyInit), LocatorUtils.property(thatLocator, "lazyInit", rhsLazyInit), lhsLazyInit, rhsLazyInit)) {
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
            if (!(object instanceof DtoPListStoreImpl.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoPListStoreImpl.BrokerService that = ((DtoPListStoreImpl.BrokerService) object);
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

}
