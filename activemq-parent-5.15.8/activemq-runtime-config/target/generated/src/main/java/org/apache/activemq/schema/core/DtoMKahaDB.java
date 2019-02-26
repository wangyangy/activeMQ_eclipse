//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.10-b140310.1920 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.02.26 ʱ�� 09:59:41 AM CST 
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
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
 *           &lt;element name="filteredPersistenceAdapters" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="transactionStore" minOccurs="0">
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
 *       &lt;attribute name="brokerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brokerService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="journalMaxFileLength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="journalWriteBatchSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lockKeepAlivePeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="locker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scheduledThreadPoolExecutor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transactionStore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usageManager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "brokerServiceOrFilteredPersistenceAdaptersOrLocker"
})
@XmlRootElement(name = "mKahaDB")
public class DtoMKahaDB implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transactionStore", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "usageManager", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locker", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "scheduledThreadPoolExecutor", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filteredPersistenceAdapters", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrFilteredPersistenceAdaptersOrLocker;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "journalMaxFileLength")
    protected String journalMaxFileLength;
    @XmlAttribute(name = "journalWriteBatchSize")
    protected String journalWriteBatchSize;
    @XmlAttribute(name = "lockKeepAlivePeriod")
    protected Long lockKeepAlivePeriod;
    @XmlAttribute(name = "locker")
    protected String locker;
    @XmlAttribute(name = "scheduledThreadPoolExecutor")
    protected String scheduledThreadPoolExecutor;
    @XmlAttribute(name = "transactionStore")
    protected String transactionStore;
    @XmlAttribute(name = "usageManager")
    protected String usageManager;
    @XmlAttribute(name = "useLock")
    protected Boolean useLock;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrFilteredPersistenceAdaptersOrLocker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrFilteredPersistenceAdaptersOrLocker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrFilteredPersistenceAdaptersOrLocker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoMKahaDB.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMKahaDB.TransactionStore }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMKahaDB.UsageManager }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMKahaDB.Locker }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMKahaDB.ScheduledThreadPoolExecutor }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoMKahaDB.FilteredPersistenceAdapters }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerServiceOrFilteredPersistenceAdaptersOrLocker() {
        if (brokerServiceOrFilteredPersistenceAdaptersOrLocker == null) {
            brokerServiceOrFilteredPersistenceAdaptersOrLocker = new ArrayList<Object>();
        }
        return this.brokerServiceOrFilteredPersistenceAdaptersOrLocker;
    }

    /**
     * ��ȡbrokerName���Ե�ֵ��
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
     * ����brokerName���Ե�ֵ��
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
     * ��ȡbrokerService���Ե�ֵ��
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
     * ����brokerService���Ե�ֵ��
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
     * ��ȡdirectory���Ե�ֵ��
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
     * ����directory���Ե�ֵ��
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
     * ��ȡjournalMaxFileLength���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalMaxFileLength() {
        return journalMaxFileLength;
    }

    /**
     * ����journalMaxFileLength���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalMaxFileLength(String value) {
        this.journalMaxFileLength = value;
    }

    /**
     * ��ȡjournalWriteBatchSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalWriteBatchSize() {
        return journalWriteBatchSize;
    }

    /**
     * ����journalWriteBatchSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalWriteBatchSize(String value) {
        this.journalWriteBatchSize = value;
    }

    /**
     * ��ȡlockKeepAlivePeriod���Ե�ֵ��
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
     * ����lockKeepAlivePeriod���Ե�ֵ��
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
     * ��ȡlocker���Ե�ֵ��
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
     * ����locker���Ե�ֵ��
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
     * ��ȡscheduledThreadPoolExecutor���Ե�ֵ��
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
     * ����scheduledThreadPoolExecutor���Ե�ֵ��
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
     * ��ȡtransactionStore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStore() {
        return transactionStore;
    }

    /**
     * ����transactionStore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStore(String value) {
        this.transactionStore = value;
    }

    /**
     * ��ȡusageManager���Ե�ֵ��
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
     * ����usageManager���Ե�ֵ��
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
     * ��ȡuseLock���Ե�ֵ��
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
     * ����useLock���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
            List<Object> theBrokerServiceOrFilteredPersistenceAdaptersOrLocker;
            theBrokerServiceOrFilteredPersistenceAdaptersOrLocker = (((this.brokerServiceOrFilteredPersistenceAdaptersOrLocker!= null)&&(!this.brokerServiceOrFilteredPersistenceAdaptersOrLocker.isEmpty()))?this.getBrokerServiceOrFilteredPersistenceAdaptersOrLocker():null);
            strategy.appendField(locator, this, "brokerServiceOrFilteredPersistenceAdaptersOrLocker", buffer, theBrokerServiceOrFilteredPersistenceAdaptersOrLocker);
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
            String theJournalMaxFileLength;
            theJournalMaxFileLength = this.getJournalMaxFileLength();
            strategy.appendField(locator, this, "journalMaxFileLength", buffer, theJournalMaxFileLength);
        }
        {
            String theJournalWriteBatchSize;
            theJournalWriteBatchSize = this.getJournalWriteBatchSize();
            strategy.appendField(locator, this, "journalWriteBatchSize", buffer, theJournalWriteBatchSize);
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
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            strategy.appendField(locator, this, "scheduledThreadPoolExecutor", buffer, theScheduledThreadPoolExecutor);
        }
        {
            String theTransactionStore;
            theTransactionStore = this.getTransactionStore();
            strategy.appendField(locator, this, "transactionStore", buffer, theTransactionStore);
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Object> theBrokerServiceOrFilteredPersistenceAdaptersOrLocker;
            theBrokerServiceOrFilteredPersistenceAdaptersOrLocker = (((this.brokerServiceOrFilteredPersistenceAdaptersOrLocker!= null)&&(!this.brokerServiceOrFilteredPersistenceAdaptersOrLocker.isEmpty()))?this.getBrokerServiceOrFilteredPersistenceAdaptersOrLocker():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrFilteredPersistenceAdaptersOrLocker", theBrokerServiceOrFilteredPersistenceAdaptersOrLocker), currentHashCode, theBrokerServiceOrFilteredPersistenceAdaptersOrLocker);
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
            String theJournalMaxFileLength;
            theJournalMaxFileLength = this.getJournalMaxFileLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalMaxFileLength", theJournalMaxFileLength), currentHashCode, theJournalMaxFileLength);
        }
        {
            String theJournalWriteBatchSize;
            theJournalWriteBatchSize = this.getJournalWriteBatchSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalWriteBatchSize", theJournalWriteBatchSize), currentHashCode, theJournalWriteBatchSize);
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
            String theScheduledThreadPoolExecutor;
            theScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledThreadPoolExecutor", theScheduledThreadPoolExecutor), currentHashCode, theScheduledThreadPoolExecutor);
        }
        {
            String theTransactionStore;
            theTransactionStore = this.getTransactionStore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionStore", theTransactionStore), currentHashCode, theTransactionStore);
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
        if (!(object instanceof DtoMKahaDB)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoMKahaDB that = ((DtoMKahaDB) object);
        {
            List<Object> lhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker;
            lhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker = (((this.brokerServiceOrFilteredPersistenceAdaptersOrLocker!= null)&&(!this.brokerServiceOrFilteredPersistenceAdaptersOrLocker.isEmpty()))?this.getBrokerServiceOrFilteredPersistenceAdaptersOrLocker():null);
            List<Object> rhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker;
            rhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker = (((that.brokerServiceOrFilteredPersistenceAdaptersOrLocker!= null)&&(!that.brokerServiceOrFilteredPersistenceAdaptersOrLocker.isEmpty()))?that.getBrokerServiceOrFilteredPersistenceAdaptersOrLocker():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrFilteredPersistenceAdaptersOrLocker", lhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker), LocatorUtils.property(thatLocator, "brokerServiceOrFilteredPersistenceAdaptersOrLocker", rhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker), lhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker, rhsBrokerServiceOrFilteredPersistenceAdaptersOrLocker)) {
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
            String lhsJournalMaxFileLength;
            lhsJournalMaxFileLength = this.getJournalMaxFileLength();
            String rhsJournalMaxFileLength;
            rhsJournalMaxFileLength = that.getJournalMaxFileLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalMaxFileLength", lhsJournalMaxFileLength), LocatorUtils.property(thatLocator, "journalMaxFileLength", rhsJournalMaxFileLength), lhsJournalMaxFileLength, rhsJournalMaxFileLength)) {
                return false;
            }
        }
        {
            String lhsJournalWriteBatchSize;
            lhsJournalWriteBatchSize = this.getJournalWriteBatchSize();
            String rhsJournalWriteBatchSize;
            rhsJournalWriteBatchSize = that.getJournalWriteBatchSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journalWriteBatchSize", lhsJournalWriteBatchSize), LocatorUtils.property(thatLocator, "journalWriteBatchSize", rhsJournalWriteBatchSize), lhsJournalWriteBatchSize, rhsJournalWriteBatchSize)) {
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
            String lhsScheduledThreadPoolExecutor;
            lhsScheduledThreadPoolExecutor = this.getScheduledThreadPoolExecutor();
            String rhsScheduledThreadPoolExecutor;
            rhsScheduledThreadPoolExecutor = that.getScheduledThreadPoolExecutor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledThreadPoolExecutor", lhsScheduledThreadPoolExecutor), LocatorUtils.property(thatLocator, "scheduledThreadPoolExecutor", rhsScheduledThreadPoolExecutor), lhsScheduledThreadPoolExecutor, rhsScheduledThreadPoolExecutor)) {
                return false;
            }
        }
        {
            String lhsTransactionStore;
            lhsTransactionStore = this.getTransactionStore();
            String rhsTransactionStore;
            rhsTransactionStore = that.getTransactionStore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionStore", lhsTransactionStore), LocatorUtils.property(thatLocator, "transactionStore", rhsTransactionStore), lhsTransactionStore, rhsTransactionStore)) {
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * ��ȡbroker���Ե�ֵ��
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
         * ����broker���Ե�ֵ��
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
         * ��ȡbrokerService���Ե�ֵ��
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
         * ����brokerService���Ե�ֵ��
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
         * ��ȡany���Ե�ֵ��
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
         * ����any���Ե�ֵ��
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
            if (!(object instanceof DtoMKahaDB.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMKahaDB.BrokerService that = ((DtoMKahaDB.BrokerService) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    public static class FilteredPersistenceAdapters
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
            if (!(object instanceof DtoMKahaDB.FilteredPersistenceAdapters)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMKahaDB.FilteredPersistenceAdapters that = ((DtoMKahaDB.FilteredPersistenceAdapters) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * ��ȡdatabaseLocker���Ե�ֵ��
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
         * ����databaseLocker���Ե�ֵ��
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
         * ��ȡleaseDatabaseLocker���Ե�ֵ��
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
         * ����leaseDatabaseLocker���Ե�ֵ��
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
         * ��ȡsharedFileLocker���Ե�ֵ��
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
         * ����sharedFileLocker���Ե�ֵ��
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
         * ��ȡtransactDatabaseLocker���Ե�ֵ��
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
         * ����transactDatabaseLocker���Ե�ֵ��
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
         * ��ȡany���Ե�ֵ��
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
         * ����any���Ե�ֵ��
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
            if (!(object instanceof DtoMKahaDB.Locker)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMKahaDB.Locker that = ((DtoMKahaDB.Locker) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
            if (!(object instanceof DtoMKahaDB.ScheduledThreadPoolExecutor)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMKahaDB.ScheduledThreadPoolExecutor that = ((DtoMKahaDB.ScheduledThreadPoolExecutor) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    public static class TransactionStore
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
            if (!(object instanceof DtoMKahaDB.TransactionStore)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMKahaDB.TransactionStore that = ((DtoMKahaDB.TransactionStore) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * ��ȡsystemUsage���Ե�ֵ��
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
         * ����systemUsage���Ե�ֵ��
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
         * ��ȡany���Ե�ֵ��
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
         * ����any���Ե�ֵ��
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
            if (!(object instanceof DtoMKahaDB.UsageManager)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoMKahaDB.UsageManager that = ((DtoMKahaDB.UsageManager) object);
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