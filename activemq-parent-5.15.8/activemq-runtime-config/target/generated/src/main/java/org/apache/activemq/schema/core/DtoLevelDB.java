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
import javax.xml.bind.annotation.XmlElement;
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
 *           &lt;element name="locker" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="scheduledThreadPoolExecutor" minOccurs="0">
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
 *           &lt;element name="transactionIdTransformer" minOccurs="0">
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
 *           &lt;element name="usageManager" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="asyncBufferSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="autoCompactionRatio" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failoverProducersAuditDepth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="flushDelay" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="indexBlockRestartInterval" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="indexBlockSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="indexCacheSize" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="indexCompression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indexFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indexMaxOpenFiles" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="indexWriteBufferSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lockKeepAlivePeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="locker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="logCompression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="logDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="logSize" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="maxFailoverProducersToTrack" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="monitorStats" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="paranoidChecks" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="scheduledThreadPoolExecutor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transactionIdTransformer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usageManager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="verifyChecksums" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "brokerServiceOrLockerOrScheduledThreadPoolExecutor"
})
@XmlRootElement(name = "levelDB")
public class DtoLevelDB implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "scheduledThreadPoolExecutor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "usageManager", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transactionIdTransformer", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrLockerOrScheduledThreadPoolExecutor;
    @XmlAttribute(name = "asyncBufferSize")
    protected BigInteger asyncBufferSize;
    @XmlAttribute(name = "autoCompactionRatio")
    protected BigInteger autoCompactionRatio;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "failoverProducersAuditDepth")
    protected BigInteger failoverProducersAuditDepth;
    @XmlAttribute(name = "flushDelay")
    protected BigInteger flushDelay;
    @XmlAttribute(name = "indexBlockRestartInterval")
    protected BigInteger indexBlockRestartInterval;
    @XmlAttribute(name = "indexBlockSize")
    protected BigInteger indexBlockSize;
    @XmlAttribute(name = "indexCacheSize")
    protected Long indexCacheSize;
    @XmlAttribute(name = "indexCompression")
    protected String indexCompression;
    @XmlAttribute(name = "indexFactory")
    protected String indexFactory;
    @XmlAttribute(name = "indexMaxOpenFiles")
    protected BigInteger indexMaxOpenFiles;
    @XmlAttribute(name = "indexWriteBufferSize")
    protected BigInteger indexWriteBufferSize;
    @XmlAttribute(name = "lockKeepAlivePeriod")
    protected Long lockKeepAlivePeriod;
    @XmlAttribute(name = "locker")
    protected String locker;
    @XmlAttribute(name = "logCompression")
    protected String logCompression;
    @XmlAttribute(name = "logDirectory")
    protected String logDirectory;
    @XmlAttribute(name = "logSize")
    protected Long logSize;
    @XmlAttribute(name = "maxFailoverProducersToTrack")
    protected BigInteger maxFailoverProducersToTrack;
    @XmlAttribute(name = "monitorStats")
    protected Boolean monitorStats;
    @XmlAttribute(name = "paranoidChecks")
    protected Boolean paranoidChecks;
    @XmlAttribute(name = "scheduledThreadPoolExecutor")
    protected String scheduledThreadPoolExecutor;
    @XmlAttribute(name = "sync")
    protected Boolean sync;
    @XmlAttribute(name = "transactionIdTransformer")
    protected String transactionIdTransformer;
    @XmlAttribute(name = "usageManager")
    protected String usageManager;
    @XmlAttribute(name = "useLock")
    protected Boolean useLock;
    @XmlAttribute(name = "verifyChecksums")
    protected Boolean verifyChecksums;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrLockerOrScheduledThreadPoolExecutor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrLockerOrScheduledThreadPoolExecutor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrLockerOrScheduledThreadPoolExecutor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoLevelDB.BrokerService }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoLevelDB.ScheduledThreadPoolExecutor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLevelDB.Locker }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLevelDB.UsageManager }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoLevelDB.TransactionIdTransformer }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerServiceOrLockerOrScheduledThreadPoolExecutor() {
        if (brokerServiceOrLockerOrScheduledThreadPoolExecutor == null) {
            brokerServiceOrLockerOrScheduledThreadPoolExecutor = new ArrayList<Object>();
        }
        return this.brokerServiceOrLockerOrScheduledThreadPoolExecutor;
    }

    /**
     * 获取asyncBufferSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAsyncBufferSize() {
        return asyncBufferSize;
    }

    /**
     * 设置asyncBufferSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAsyncBufferSize(BigInteger value) {
        this.asyncBufferSize = value;
    }

    /**
     * 获取autoCompactionRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAutoCompactionRatio() {
        return autoCompactionRatio;
    }

    /**
     * 设置autoCompactionRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAutoCompactionRatio(BigInteger value) {
        this.autoCompactionRatio = value;
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
     * 获取failoverProducersAuditDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailoverProducersAuditDepth() {
        return failoverProducersAuditDepth;
    }

    /**
     * 设置failoverProducersAuditDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailoverProducersAuditDepth(BigInteger value) {
        this.failoverProducersAuditDepth = value;
    }

    /**
     * 获取flushDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlushDelay() {
        return flushDelay;
    }

    /**
     * 设置flushDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlushDelay(BigInteger value) {
        this.flushDelay = value;
    }

    /**
     * 获取indexBlockRestartInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexBlockRestartInterval() {
        return indexBlockRestartInterval;
    }

    /**
     * 设置indexBlockRestartInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexBlockRestartInterval(BigInteger value) {
        this.indexBlockRestartInterval = value;
    }

    /**
     * 获取indexBlockSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexBlockSize() {
        return indexBlockSize;
    }

    /**
     * 设置indexBlockSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexBlockSize(BigInteger value) {
        this.indexBlockSize = value;
    }

    /**
     * 获取indexCacheSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndexCacheSize() {
        return indexCacheSize;
    }

    /**
     * 设置indexCacheSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndexCacheSize(Long value) {
        this.indexCacheSize = value;
    }

    /**
     * 获取indexCompression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexCompression() {
        return indexCompression;
    }

    /**
     * 设置indexCompression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexCompression(String value) {
        this.indexCompression = value;
    }

    /**
     * 获取indexFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexFactory() {
        return indexFactory;
    }

    /**
     * 设置indexFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexFactory(String value) {
        this.indexFactory = value;
    }

    /**
     * 获取indexMaxOpenFiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexMaxOpenFiles() {
        return indexMaxOpenFiles;
    }

    /**
     * 设置indexMaxOpenFiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexMaxOpenFiles(BigInteger value) {
        this.indexMaxOpenFiles = value;
    }

    /**
     * 获取indexWriteBufferSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexWriteBufferSize() {
        return indexWriteBufferSize;
    }

    /**
     * 设置indexWriteBufferSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexWriteBufferSize(BigInteger value) {
        this.indexWriteBufferSize = value;
    }

    /**
     * 获取lockKeepAlivePeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLockKeepAlivePeriod() {
        return lockKeepAlivePeriod;
    }

    /**
     * 设置lockKeepAlivePeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLockKeepAlivePeriod(Long value) {
        this.lockKeepAlivePeriod = value;
    }

    /**
     * 获取locker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocker() {
        return locker;
    }

    /**
     * 设置locker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocker(String value) {
        this.locker = value;
    }

    /**
     * 获取logCompression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogCompression() {
        return logCompression;
    }

    /**
     * 设置logCompression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogCompression(String value) {
        this.logCompression = value;
    }

    /**
     * 获取logDirectory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDirectory() {
        return logDirectory;
    }

    /**
     * 设置logDirectory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDirectory(String value) {
        this.logDirectory = value;
    }

    /**
     * 获取logSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLogSize() {
        return logSize;
    }

    /**
     * 设置logSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLogSize(Long value) {
        this.logSize = value;
    }

    /**
     * 获取maxFailoverProducersToTrack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFailoverProducersToTrack() {
        return maxFailoverProducersToTrack;
    }

    /**
     * 设置maxFailoverProducersToTrack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFailoverProducersToTrack(BigInteger value) {
        this.maxFailoverProducersToTrack = value;
    }

    /**
     * 获取monitorStats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitorStats() {
        return monitorStats;
    }

    /**
     * 设置monitorStats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitorStats(Boolean value) {
        this.monitorStats = value;
    }

    /**
     * 获取paranoidChecks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParanoidChecks() {
        return paranoidChecks;
    }

    /**
     * 设置paranoidChecks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParanoidChecks(Boolean value) {
        this.paranoidChecks = value;
    }

    /**
     * 获取scheduledThreadPoolExecutor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledThreadPoolExecutor() {
        return scheduledThreadPoolExecutor;
    }

    /**
     * 设置scheduledThreadPoolExecutor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledThreadPoolExecutor(String value) {
        this.scheduledThreadPoolExecutor = value;
    }

    /**
     * 获取sync属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSync() {
        return sync;
    }

    /**
     * 设置sync属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSync(Boolean value) {
        this.sync = value;
    }

    /**
     * 获取transactionIdTransformer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdTransformer() {
        return transactionIdTransformer;
    }

    /**
     * 设置transactionIdTransformer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdTransformer(String value) {
        this.transactionIdTransformer = value;
    }

    /**
     * 获取usageManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageManager() {
        return usageManager;
    }

    /**
     * 设置usageManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageManager(String value) {
        this.usageManager = value;
    }

    /**
     * 获取useLock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLock() {
        return useLock;
    }

    /**
     * 设置useLock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLock(Boolean value) {
        this.useLock = value;
    }

    /**
     * 获取verifyChecksums属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifyChecksums() {
        return verifyChecksums;
    }

    /**
     * 设置verifyChecksums属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifyChecksums(Boolean value) {
        this.verifyChecksums = value;
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
            List<Object> theBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            theBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((this.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!this.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?this.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            strategy.appendField(locator, this, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", buffer, theBrokerServiceOrLockerOrScheduledThreadPoolExecutor);
        }
        {
            BigInteger theAsyncBufferSize;
            theAsyncBufferSize = this.getAsyncBufferSize();
            strategy.appendField(locator, this, "asyncBufferSize", buffer, theAsyncBufferSize);
        }
        {
            BigInteger theAutoCompactionRatio;
            theAutoCompactionRatio = this.getAutoCompactionRatio();
            strategy.appendField(locator, this, "autoCompactionRatio", buffer, theAutoCompactionRatio);
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
            String theDirectory;
            theDirectory = this.getDirectory();
            strategy.appendField(locator, this, "directory", buffer, theDirectory);
        }
        {
            BigInteger theFailoverProducersAuditDepth;
            theFailoverProducersAuditDepth = this.getFailoverProducersAuditDepth();
            strategy.appendField(locator, this, "failoverProducersAuditDepth", buffer, theFailoverProducersAuditDepth);
        }
        {
            BigInteger theFlushDelay;
            theFlushDelay = this.getFlushDelay();
            strategy.appendField(locator, this, "flushDelay", buffer, theFlushDelay);
        }
        {
            BigInteger theIndexBlockRestartInterval;
            theIndexBlockRestartInterval = this.getIndexBlockRestartInterval();
            strategy.appendField(locator, this, "indexBlockRestartInterval", buffer, theIndexBlockRestartInterval);
        }
        {
            BigInteger theIndexBlockSize;
            theIndexBlockSize = this.getIndexBlockSize();
            strategy.appendField(locator, this, "indexBlockSize", buffer, theIndexBlockSize);
        }
        {
            Long theIndexCacheSize;
            theIndexCacheSize = this.getIndexCacheSize();
            strategy.appendField(locator, this, "indexCacheSize", buffer, theIndexCacheSize);
        }
        {
            String theIndexCompression;
            theIndexCompression = this.getIndexCompression();
            strategy.appendField(locator, this, "indexCompression", buffer, theIndexCompression);
        }
        {
            String theIndexFactory;
            theIndexFactory = this.getIndexFactory();
            strategy.appendField(locator, this, "indexFactory", buffer, theIndexFactory);
        }
        {
            BigInteger theIndexMaxOpenFiles;
            theIndexMaxOpenFiles = this.getIndexMaxOpenFiles();
            strategy.appendField(locator, this, "indexMaxOpenFiles", buffer, theIndexMaxOpenFiles);
        }
        {
            BigInteger theIndexWriteBufferSize;
            theIndexWriteBufferSize = this.getIndexWriteBufferSize();
            strategy.appendField(locator, this, "indexWriteBufferSize", buffer, theIndexWriteBufferSize);
        }
        {
            Long theLockKeepAlivePeriod;
            theLockKeepAlivePeriod = this.getLockKeepAlivePeriod();
            strategy.appendField(locator, this, "lockKeepAlivePeriod", buffer, theLockKeepAlivePeriod);
        }
        {
            String theLocker;
            theLocker = this.getLocker();
            strategy.appendField(locator, this, "locker", buffer, theLocker);
        }
        {
            String theLogCompression;
            theLogCompression = this.getLogCompression();
            strategy.appendField(locator, this, "logCompression", buffer, theLogCompression);
        }
        {
            String theLogDirectory;
            theLogDirectory = this.getLogDirectory();
            strategy.appendField(locator, this, "logDirectory", buffer, theLogDirectory);
        }
        {
            Long theLogSize;
            theLogSize = this.getLogSize();
            strategy.appendField(locator, this, "logSize", buffer, theLogSize);
        }
        {
            BigInteger theMaxFailoverProducersToTrack;
            theMaxFailoverProducersToTrack = this.getMaxFailoverProducersToTrack();
            strategy.appendField(locator, this, "maxFailoverProducersToTrack", buffer, theMaxFailoverProducersToTrack);
        }
        {
            Boolean theMonitorStats;
            theMonitorStats = this.isMonitorStats();
            strategy.appendField(locator, this, "monitorStats", buffer, theMonitorStats);
        }
        {
            Boolean theParanoidChecks;
            theParanoidChecks = this.isParanoidChecks();
            strategy.appendField(locator, this, "paranoidChecks", buffer, theParanoidChecks);
        }
        {
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            strategy.appendField(locator, this, "scheduledThreadPoolExecutor", buffer, theScheduledThreadPoolExecutor);
        }
        {
            Boolean theSync;
            theSync = this.isSync();
            strategy.appendField(locator, this, "sync", buffer, theSync);
        }
        {
            String theTransactionIdTransformer;
            theTransactionIdTransformer = this.getTransactionIdTransformer();
            strategy.appendField(locator, this, "transactionIdTransformer", buffer, theTransactionIdTransformer);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            strategy.appendField(locator, this, "usageManager", buffer, theUsageManager);
        }
        {
            Boolean theUseLock;
            theUseLock = this.isUseLock();
            strategy.appendField(locator, this, "useLock", buffer, theUseLock);
        }
        {
            Boolean theVerifyChecksums;
            theVerifyChecksums = this.isVerifyChecksums();
            strategy.appendField(locator, this, "verifyChecksums", buffer, theVerifyChecksums);
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
            List<Object> theBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            theBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((this.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!this.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?this.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", theBrokerServiceOrLockerOrScheduledThreadPoolExecutor), currentHashCode, theBrokerServiceOrLockerOrScheduledThreadPoolExecutor);
        }
        {
            BigInteger theAsyncBufferSize;
            theAsyncBufferSize = this.getAsyncBufferSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asyncBufferSize", theAsyncBufferSize), currentHashCode, theAsyncBufferSize);
        }
        {
            BigInteger theAutoCompactionRatio;
            theAutoCompactionRatio = this.getAutoCompactionRatio();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "autoCompactionRatio", theAutoCompactionRatio), currentHashCode, theAutoCompactionRatio);
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
            String theDirectory;
            theDirectory = this.getDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directory", theDirectory), currentHashCode, theDirectory);
        }
        {
            BigInteger theFailoverProducersAuditDepth;
            theFailoverProducersAuditDepth = this.getFailoverProducersAuditDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failoverProducersAuditDepth", theFailoverProducersAuditDepth), currentHashCode, theFailoverProducersAuditDepth);
        }
        {
            BigInteger theFlushDelay;
            theFlushDelay = this.getFlushDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flushDelay", theFlushDelay), currentHashCode, theFlushDelay);
        }
        {
            BigInteger theIndexBlockRestartInterval;
            theIndexBlockRestartInterval = this.getIndexBlockRestartInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexBlockRestartInterval", theIndexBlockRestartInterval), currentHashCode, theIndexBlockRestartInterval);
        }
        {
            BigInteger theIndexBlockSize;
            theIndexBlockSize = this.getIndexBlockSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexBlockSize", theIndexBlockSize), currentHashCode, theIndexBlockSize);
        }
        {
            Long theIndexCacheSize;
            theIndexCacheSize = this.getIndexCacheSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexCacheSize", theIndexCacheSize), currentHashCode, theIndexCacheSize);
        }
        {
            String theIndexCompression;
            theIndexCompression = this.getIndexCompression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexCompression", theIndexCompression), currentHashCode, theIndexCompression);
        }
        {
            String theIndexFactory;
            theIndexFactory = this.getIndexFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexFactory", theIndexFactory), currentHashCode, theIndexFactory);
        }
        {
            BigInteger theIndexMaxOpenFiles;
            theIndexMaxOpenFiles = this.getIndexMaxOpenFiles();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexMaxOpenFiles", theIndexMaxOpenFiles), currentHashCode, theIndexMaxOpenFiles);
        }
        {
            BigInteger theIndexWriteBufferSize;
            theIndexWriteBufferSize = this.getIndexWriteBufferSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexWriteBufferSize", theIndexWriteBufferSize), currentHashCode, theIndexWriteBufferSize);
        }
        {
            Long theLockKeepAlivePeriod;
            theLockKeepAlivePeriod = this.getLockKeepAlivePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockKeepAlivePeriod", theLockKeepAlivePeriod), currentHashCode, theLockKeepAlivePeriod);
        }
        {
            String theLocker;
            theLocker = this.getLocker();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locker", theLocker), currentHashCode, theLocker);
        }
        {
            String theLogCompression;
            theLogCompression = this.getLogCompression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logCompression", theLogCompression), currentHashCode, theLogCompression);
        }
        {
            String theLogDirectory;
            theLogDirectory = this.getLogDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logDirectory", theLogDirectory), currentHashCode, theLogDirectory);
        }
        {
            Long theLogSize;
            theLogSize = this.getLogSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logSize", theLogSize), currentHashCode, theLogSize);
        }
        {
            BigInteger theMaxFailoverProducersToTrack;
            theMaxFailoverProducersToTrack = this.getMaxFailoverProducersToTrack();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxFailoverProducersToTrack", theMaxFailoverProducersToTrack), currentHashCode, theMaxFailoverProducersToTrack);
        }
        {
            Boolean theMonitorStats;
            theMonitorStats = this.isMonitorStats();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monitorStats", theMonitorStats), currentHashCode, theMonitorStats);
        }
        {
            Boolean theParanoidChecks;
            theParanoidChecks = this.isParanoidChecks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paranoidChecks", theParanoidChecks), currentHashCode, theParanoidChecks);
        }
        {
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledThreadPoolExecutor", theScheduledThreadPoolExecutor), currentHashCode, theScheduledThreadPoolExecutor);
        }
        {
            Boolean theSync;
            theSync = this.isSync();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sync", theSync), currentHashCode, theSync);
        }
        {
            String theTransactionIdTransformer;
            theTransactionIdTransformer = this.getTransactionIdTransformer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionIdTransformer", theTransactionIdTransformer), currentHashCode, theTransactionIdTransformer);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usageManager", theUsageManager), currentHashCode, theUsageManager);
        }
        {
            Boolean theUseLock;
            theUseLock = this.isUseLock();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLock", theUseLock), currentHashCode, theUseLock);
        }
        {
            Boolean theVerifyChecksums;
            theVerifyChecksums = this.isVerifyChecksums();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verifyChecksums", theVerifyChecksums), currentHashCode, theVerifyChecksums);
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
        if (!(object instanceof DtoLevelDB)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoLevelDB that = ((DtoLevelDB) object);
        {
            List<Object> lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((this.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!this.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?this.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            List<Object> rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor;
            rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor = (((that.brokerServiceOrLockerOrScheduledThreadPoolExecutor!= null)&&(!that.brokerServiceOrLockerOrScheduledThreadPoolExecutor.isEmpty()))?that.getBrokerServiceOrLockerOrScheduledThreadPoolExecutor():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor), LocatorUtils.property(thatLocator, "brokerServiceOrLockerOrScheduledThreadPoolExecutor", rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor), lhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor, rhsBrokerServiceOrLockerOrScheduledThreadPoolExecutor)) {
                return false;
            }
        }
        {
            BigInteger lhsAsyncBufferSize;
            lhsAsyncBufferSize = this.getAsyncBufferSize();
            BigInteger rhsAsyncBufferSize;
            rhsAsyncBufferSize = that.getAsyncBufferSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asyncBufferSize", lhsAsyncBufferSize), LocatorUtils.property(thatLocator, "asyncBufferSize", rhsAsyncBufferSize), lhsAsyncBufferSize, rhsAsyncBufferSize)) {
                return false;
            }
        }
        {
            BigInteger lhsAutoCompactionRatio;
            lhsAutoCompactionRatio = this.getAutoCompactionRatio();
            BigInteger rhsAutoCompactionRatio;
            rhsAutoCompactionRatio = that.getAutoCompactionRatio();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autoCompactionRatio", lhsAutoCompactionRatio), LocatorUtils.property(thatLocator, "autoCompactionRatio", rhsAutoCompactionRatio), lhsAutoCompactionRatio, rhsAutoCompactionRatio)) {
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
            String lhsDirectory;
            lhsDirectory = this.getDirectory();
            String rhsDirectory;
            rhsDirectory = that.getDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directory", lhsDirectory), LocatorUtils.property(thatLocator, "directory", rhsDirectory), lhsDirectory, rhsDirectory)) {
                return false;
            }
        }
        {
            BigInteger lhsFailoverProducersAuditDepth;
            lhsFailoverProducersAuditDepth = this.getFailoverProducersAuditDepth();
            BigInteger rhsFailoverProducersAuditDepth;
            rhsFailoverProducersAuditDepth = that.getFailoverProducersAuditDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failoverProducersAuditDepth", lhsFailoverProducersAuditDepth), LocatorUtils.property(thatLocator, "failoverProducersAuditDepth", rhsFailoverProducersAuditDepth), lhsFailoverProducersAuditDepth, rhsFailoverProducersAuditDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsFlushDelay;
            lhsFlushDelay = this.getFlushDelay();
            BigInteger rhsFlushDelay;
            rhsFlushDelay = that.getFlushDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flushDelay", lhsFlushDelay), LocatorUtils.property(thatLocator, "flushDelay", rhsFlushDelay), lhsFlushDelay, rhsFlushDelay)) {
                return false;
            }
        }
        {
            BigInteger lhsIndexBlockRestartInterval;
            lhsIndexBlockRestartInterval = this.getIndexBlockRestartInterval();
            BigInteger rhsIndexBlockRestartInterval;
            rhsIndexBlockRestartInterval = that.getIndexBlockRestartInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexBlockRestartInterval", lhsIndexBlockRestartInterval), LocatorUtils.property(thatLocator, "indexBlockRestartInterval", rhsIndexBlockRestartInterval), lhsIndexBlockRestartInterval, rhsIndexBlockRestartInterval)) {
                return false;
            }
        }
        {
            BigInteger lhsIndexBlockSize;
            lhsIndexBlockSize = this.getIndexBlockSize();
            BigInteger rhsIndexBlockSize;
            rhsIndexBlockSize = that.getIndexBlockSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexBlockSize", lhsIndexBlockSize), LocatorUtils.property(thatLocator, "indexBlockSize", rhsIndexBlockSize), lhsIndexBlockSize, rhsIndexBlockSize)) {
                return false;
            }
        }
        {
            Long lhsIndexCacheSize;
            lhsIndexCacheSize = this.getIndexCacheSize();
            Long rhsIndexCacheSize;
            rhsIndexCacheSize = that.getIndexCacheSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexCacheSize", lhsIndexCacheSize), LocatorUtils.property(thatLocator, "indexCacheSize", rhsIndexCacheSize), lhsIndexCacheSize, rhsIndexCacheSize)) {
                return false;
            }
        }
        {
            String lhsIndexCompression;
            lhsIndexCompression = this.getIndexCompression();
            String rhsIndexCompression;
            rhsIndexCompression = that.getIndexCompression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexCompression", lhsIndexCompression), LocatorUtils.property(thatLocator, "indexCompression", rhsIndexCompression), lhsIndexCompression, rhsIndexCompression)) {
                return false;
            }
        }
        {
            String lhsIndexFactory;
            lhsIndexFactory = this.getIndexFactory();
            String rhsIndexFactory;
            rhsIndexFactory = that.getIndexFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexFactory", lhsIndexFactory), LocatorUtils.property(thatLocator, "indexFactory", rhsIndexFactory), lhsIndexFactory, rhsIndexFactory)) {
                return false;
            }
        }
        {
            BigInteger lhsIndexMaxOpenFiles;
            lhsIndexMaxOpenFiles = this.getIndexMaxOpenFiles();
            BigInteger rhsIndexMaxOpenFiles;
            rhsIndexMaxOpenFiles = that.getIndexMaxOpenFiles();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexMaxOpenFiles", lhsIndexMaxOpenFiles), LocatorUtils.property(thatLocator, "indexMaxOpenFiles", rhsIndexMaxOpenFiles), lhsIndexMaxOpenFiles, rhsIndexMaxOpenFiles)) {
                return false;
            }
        }
        {
            BigInteger lhsIndexWriteBufferSize;
            lhsIndexWriteBufferSize = this.getIndexWriteBufferSize();
            BigInteger rhsIndexWriteBufferSize;
            rhsIndexWriteBufferSize = that.getIndexWriteBufferSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexWriteBufferSize", lhsIndexWriteBufferSize), LocatorUtils.property(thatLocator, "indexWriteBufferSize", rhsIndexWriteBufferSize), lhsIndexWriteBufferSize, rhsIndexWriteBufferSize)) {
                return false;
            }
        }
        {
            Long lhsLockKeepAlivePeriod;
            lhsLockKeepAlivePeriod = this.getLockKeepAlivePeriod();
            Long rhsLockKeepAlivePeriod;
            rhsLockKeepAlivePeriod = that.getLockKeepAlivePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockKeepAlivePeriod", lhsLockKeepAlivePeriod), LocatorUtils.property(thatLocator, "lockKeepAlivePeriod", rhsLockKeepAlivePeriod), lhsLockKeepAlivePeriod, rhsLockKeepAlivePeriod)) {
                return false;
            }
        }
        {
            String lhsLocker;
            lhsLocker = this.getLocker();
            String rhsLocker;
            rhsLocker = that.getLocker();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locker", lhsLocker), LocatorUtils.property(thatLocator, "locker", rhsLocker), lhsLocker, rhsLocker)) {
                return false;
            }
        }
        {
            String lhsLogCompression;
            lhsLogCompression = this.getLogCompression();
            String rhsLogCompression;
            rhsLogCompression = that.getLogCompression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logCompression", lhsLogCompression), LocatorUtils.property(thatLocator, "logCompression", rhsLogCompression), lhsLogCompression, rhsLogCompression)) {
                return false;
            }
        }
        {
            String lhsLogDirectory;
            lhsLogDirectory = this.getLogDirectory();
            String rhsLogDirectory;
            rhsLogDirectory = that.getLogDirectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logDirectory", lhsLogDirectory), LocatorUtils.property(thatLocator, "logDirectory", rhsLogDirectory), lhsLogDirectory, rhsLogDirectory)) {
                return false;
            }
        }
        {
            Long lhsLogSize;
            lhsLogSize = this.getLogSize();
            Long rhsLogSize;
            rhsLogSize = that.getLogSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logSize", lhsLogSize), LocatorUtils.property(thatLocator, "logSize", rhsLogSize), lhsLogSize, rhsLogSize)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxFailoverProducersToTrack;
            lhsMaxFailoverProducersToTrack = this.getMaxFailoverProducersToTrack();
            BigInteger rhsMaxFailoverProducersToTrack;
            rhsMaxFailoverProducersToTrack = that.getMaxFailoverProducersToTrack();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxFailoverProducersToTrack", lhsMaxFailoverProducersToTrack), LocatorUtils.property(thatLocator, "maxFailoverProducersToTrack", rhsMaxFailoverProducersToTrack), lhsMaxFailoverProducersToTrack, rhsMaxFailoverProducersToTrack)) {
                return false;
            }
        }
        {
            Boolean lhsMonitorStats;
            lhsMonitorStats = this.isMonitorStats();
            Boolean rhsMonitorStats;
            rhsMonitorStats = that.isMonitorStats();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monitorStats", lhsMonitorStats), LocatorUtils.property(thatLocator, "monitorStats", rhsMonitorStats), lhsMonitorStats, rhsMonitorStats)) {
                return false;
            }
        }
        {
            Boolean lhsParanoidChecks;
            lhsParanoidChecks = this.isParanoidChecks();
            Boolean rhsParanoidChecks;
            rhsParanoidChecks = that.isParanoidChecks();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paranoidChecks", lhsParanoidChecks), LocatorUtils.property(thatLocator, "paranoidChecks", rhsParanoidChecks), lhsParanoidChecks, rhsParanoidChecks)) {
                return false;
            }
        }
        {
            String lhsScheduledThreadPoolExecutor;
            lhsScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            String rhsScheduledThreadPoolExecutor;
            rhsScheduledThreadPoolExecutor = that.getScheduledThreadPoolExecutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledThreadPoolExecutor", lhsScheduledThreadPoolExecutor), LocatorUtils.property(thatLocator, "scheduledThreadPoolExecutor", rhsScheduledThreadPoolExecutor), lhsScheduledThreadPoolExecutor, rhsScheduledThreadPoolExecutor)) {
                return false;
            }
        }
        {
            Boolean lhsSync;
            lhsSync = this.isSync();
            Boolean rhsSync;
            rhsSync = that.isSync();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sync", lhsSync), LocatorUtils.property(thatLocator, "sync", rhsSync), lhsSync, rhsSync)) {
                return false;
            }
        }
        {
            String lhsTransactionIdTransformer;
            lhsTransactionIdTransformer = this.getTransactionIdTransformer();
            String rhsTransactionIdTransformer;
            rhsTransactionIdTransformer = that.getTransactionIdTransformer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionIdTransformer", lhsTransactionIdTransformer), LocatorUtils.property(thatLocator, "transactionIdTransformer", rhsTransactionIdTransformer), lhsTransactionIdTransformer, rhsTransactionIdTransformer)) {
                return false;
            }
        }
        {
            String lhsUsageManager;
            lhsUsageManager = this.getUsageManager();
            String rhsUsageManager;
            rhsUsageManager = that.getUsageManager();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usageManager", lhsUsageManager), LocatorUtils.property(thatLocator, "usageManager", rhsUsageManager), lhsUsageManager, rhsUsageManager)) {
                return false;
            }
        }
        {
            Boolean lhsUseLock;
            lhsUseLock = this.isUseLock();
            Boolean rhsUseLock;
            rhsUseLock = that.isUseLock();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useLock", lhsUseLock), LocatorUtils.property(thatLocator, "useLock", rhsUseLock), lhsUseLock, rhsUseLock)) {
                return false;
            }
        }
        {
            Boolean lhsVerifyChecksums;
            lhsVerifyChecksums = this.isVerifyChecksums();
            Boolean rhsVerifyChecksums;
            rhsVerifyChecksums = that.isVerifyChecksums();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verifyChecksums", lhsVerifyChecksums), LocatorUtils.property(thatLocator, "verifyChecksums", rhsVerifyChecksums), lhsVerifyChecksums, rhsVerifyChecksums)) {
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
            if (!(object instanceof DtoLevelDB.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLevelDB.BrokerService that = ((DtoLevelDB.BrokerService) object);
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}lease-database-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}shared-file-locker"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}transact-database-locker"/>
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
        "databaseLocker",
        "leaseDatabaseLocker",
        "sharedFileLocker",
        "transactDatabaseLocker",
        "any"
    })
    public static class Locker
        implements Equals, HashCode, ToString
    {

        @XmlElement(name = "database-locker")
        protected DtoDatabaseLocker databaseLocker;
        @XmlElement(name = "lease-database-locker")
        protected DtoLeaseDatabaseLocker leaseDatabaseLocker;
        @XmlElement(name = "shared-file-locker")
        protected DtoSharedFileLocker sharedFileLocker;
        @XmlElement(name = "transact-database-locker")
        protected DtoTransactDatabaseLocker transactDatabaseLocker;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * 获取databaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoDatabaseLocker }
         *     
         */
        public DtoDatabaseLocker getDatabaseLocker() {
            return databaseLocker;
        }

        /**
         * 设置databaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoDatabaseLocker }
         *     
         */
        public void setDatabaseLocker(DtoDatabaseLocker value) {
            this.databaseLocker = value;
        }

        /**
         * 获取leaseDatabaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoLeaseDatabaseLocker }
         *     
         */
        public DtoLeaseDatabaseLocker getLeaseDatabaseLocker() {
            return leaseDatabaseLocker;
        }

        /**
         * 设置leaseDatabaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoLeaseDatabaseLocker }
         *     
         */
        public void setLeaseDatabaseLocker(DtoLeaseDatabaseLocker value) {
            this.leaseDatabaseLocker = value;
        }

        /**
         * 获取sharedFileLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoSharedFileLocker }
         *     
         */
        public DtoSharedFileLocker getSharedFileLocker() {
            return sharedFileLocker;
        }

        /**
         * 设置sharedFileLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoSharedFileLocker }
         *     
         */
        public void setSharedFileLocker(DtoSharedFileLocker value) {
            this.sharedFileLocker = value;
        }

        /**
         * 获取transactDatabaseLocker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DtoTransactDatabaseLocker }
         *     
         */
        public DtoTransactDatabaseLocker getTransactDatabaseLocker() {
            return transactDatabaseLocker;
        }

        /**
         * 设置transactDatabaseLocker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTransactDatabaseLocker }
         *     
         */
        public void setTransactDatabaseLocker(DtoTransactDatabaseLocker value) {
            this.transactDatabaseLocker = value;
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
                DtoDatabaseLocker theDatabaseLocker;
                theDatabaseLocker = this.getDatabaseLocker();
                strategy.appendField(locator, this, "databaseLocker", buffer, theDatabaseLocker);
            }
            {
                DtoLeaseDatabaseLocker theLeaseDatabaseLocker;
                theLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                strategy.appendField(locator, this, "leaseDatabaseLocker", buffer, theLeaseDatabaseLocker);
            }
            {
                DtoSharedFileLocker theSharedFileLocker;
                theSharedFileLocker = this.getSharedFileLocker();
                strategy.appendField(locator, this, "sharedFileLocker", buffer, theSharedFileLocker);
            }
            {
                DtoTransactDatabaseLocker theTransactDatabaseLocker;
                theTransactDatabaseLocker = this.getTransactDatabaseLocker();
                strategy.appendField(locator, this, "transactDatabaseLocker", buffer, theTransactDatabaseLocker);
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
                DtoDatabaseLocker theDatabaseLocker;
                theDatabaseLocker = this.getDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "databaseLocker", theDatabaseLocker), currentHashCode, theDatabaseLocker);
            }
            {
                DtoLeaseDatabaseLocker theLeaseDatabaseLocker;
                theLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseDatabaseLocker", theLeaseDatabaseLocker), currentHashCode, theLeaseDatabaseLocker);
            }
            {
                DtoSharedFileLocker theSharedFileLocker;
                theSharedFileLocker = this.getSharedFileLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sharedFileLocker", theSharedFileLocker), currentHashCode, theSharedFileLocker);
            }
            {
                DtoTransactDatabaseLocker theTransactDatabaseLocker;
                theTransactDatabaseLocker = this.getTransactDatabaseLocker();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactDatabaseLocker", theTransactDatabaseLocker), currentHashCode, theTransactDatabaseLocker);
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
            if (!(object instanceof DtoLevelDB.Locker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLevelDB.Locker that = ((DtoLevelDB.Locker) object);
            {
                DtoDatabaseLocker lhsDatabaseLocker;
                lhsDatabaseLocker = this.getDatabaseLocker();
                DtoDatabaseLocker rhsDatabaseLocker;
                rhsDatabaseLocker = that.getDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "databaseLocker", lhsDatabaseLocker), LocatorUtils.property(thatLocator, "databaseLocker", rhsDatabaseLocker), lhsDatabaseLocker, rhsDatabaseLocker)) {
                    return false;
                }
            }
            {
                DtoLeaseDatabaseLocker lhsLeaseDatabaseLocker;
                lhsLeaseDatabaseLocker = this.getLeaseDatabaseLocker();
                DtoLeaseDatabaseLocker rhsLeaseDatabaseLocker;
                rhsLeaseDatabaseLocker = that.getLeaseDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseDatabaseLocker", lhsLeaseDatabaseLocker), LocatorUtils.property(thatLocator, "leaseDatabaseLocker", rhsLeaseDatabaseLocker), lhsLeaseDatabaseLocker, rhsLeaseDatabaseLocker)) {
                    return false;
                }
            }
            {
                DtoSharedFileLocker lhsSharedFileLocker;
                lhsSharedFileLocker = this.getSharedFileLocker();
                DtoSharedFileLocker rhsSharedFileLocker;
                rhsSharedFileLocker = that.getSharedFileLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "sharedFileLocker", lhsSharedFileLocker), LocatorUtils.property(thatLocator, "sharedFileLocker", rhsSharedFileLocker), lhsSharedFileLocker, rhsSharedFileLocker)) {
                    return false;
                }
            }
            {
                DtoTransactDatabaseLocker lhsTransactDatabaseLocker;
                lhsTransactDatabaseLocker = this.getTransactDatabaseLocker();
                DtoTransactDatabaseLocker rhsTransactDatabaseLocker;
                rhsTransactDatabaseLocker = that.getTransactDatabaseLocker();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "transactDatabaseLocker", lhsTransactDatabaseLocker), LocatorUtils.property(thatLocator, "transactDatabaseLocker", rhsTransactDatabaseLocker), lhsTransactDatabaseLocker, rhsTransactDatabaseLocker)) {
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
    public static class ScheduledThreadPoolExecutor
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
            if (!(object instanceof DtoLevelDB.ScheduledThreadPoolExecutor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLevelDB.ScheduledThreadPoolExecutor that = ((DtoLevelDB.ScheduledThreadPoolExecutor) object);
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
    public static class TransactionIdTransformer
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
            if (!(object instanceof DtoLevelDB.TransactionIdTransformer)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLevelDB.TransactionIdTransformer that = ((DtoLevelDB.TransactionIdTransformer) object);
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
    public static class UsageManager
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
            if (!(object instanceof DtoLevelDB.UsageManager)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoLevelDB.UsageManager that = ((DtoLevelDB.UsageManager) object);
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

}
