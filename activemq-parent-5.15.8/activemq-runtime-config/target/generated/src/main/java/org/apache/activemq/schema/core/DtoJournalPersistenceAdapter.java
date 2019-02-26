//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.10-b140310.1920 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.02.26 ʱ�� 09:59:41 AM CST 
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
 *           &lt;element name="journal" minOccurs="0">
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
 *           &lt;element name="longTermPersistence" minOccurs="0">
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
 *           &lt;element name="persistenceAdapter" minOccurs="0">
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
 *           &lt;element name="taskRunnerFactory" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
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
 *       &lt;attribute name="checkpointInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="journal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="longTermPersistence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxCheckpointMessageAddSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxCheckpointWorkers" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="persistenceAdapter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskRunnerFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usageManager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useExternalMessageReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "brokerServiceOrJournalOrLongTermPersistence"
})
@XmlRootElement(name = "journalPersistenceAdapter")
public class DtoJournalPersistenceAdapter
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "usageManager", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskRunnerFactory", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brokerService", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "journal", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "longTermPersistence", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "persistenceAdapter", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> brokerServiceOrJournalOrLongTermPersistence;
    @XmlAttribute(name = "brokerName")
    protected String brokerName;
    @XmlAttribute(name = "brokerService")
    protected String brokerService;
    @XmlAttribute(name = "checkpointInterval")
    protected Long checkpointInterval;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "journal")
    protected String journal;
    @XmlAttribute(name = "longTermPersistence")
    protected String longTermPersistence;
    @XmlAttribute(name = "maxCheckpointMessageAddSize")
    protected BigInteger maxCheckpointMessageAddSize;
    @XmlAttribute(name = "maxCheckpointWorkers")
    protected BigInteger maxCheckpointWorkers;
    @XmlAttribute(name = "persistenceAdapter")
    protected String persistenceAdapter;
    @XmlAttribute(name = "taskRunnerFactory")
    protected String taskRunnerFactory;
    @XmlAttribute(name = "usageManager")
    protected String usageManager;
    @XmlAttribute(name = "useExternalMessageReferences")
    protected Boolean useExternalMessageReferences;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the brokerServiceOrJournalOrLongTermPersistence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerServiceOrJournalOrLongTermPersistence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerServiceOrJournalOrLongTermPersistence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.UsageManager }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.TaskRunnerFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.BrokerService }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.Journal }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.LongTermPersistence }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.PersistenceAdapter }{@code >}
     * 
     * 
     */
    public List<Object> getBrokerServiceOrJournalOrLongTermPersistence() {
        if (brokerServiceOrJournalOrLongTermPersistence == null) {
            brokerServiceOrJournalOrLongTermPersistence = new ArrayList<Object>();
        }
        return this.brokerServiceOrJournalOrLongTermPersistence;
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
     * ��ȡcheckpointInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckpointInterval() {
        return checkpointInterval;
    }

    /**
     * ����checkpointInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckpointInterval(Long value) {
        this.checkpointInterval = value;
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
     * ��ȡjournal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournal() {
        return journal;
    }

    /**
     * ����journal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournal(String value) {
        this.journal = value;
    }

    /**
     * ��ȡlongTermPersistence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongTermPersistence() {
        return longTermPersistence;
    }

    /**
     * ����longTermPersistence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongTermPersistence(String value) {
        this.longTermPersistence = value;
    }

    /**
     * ��ȡmaxCheckpointMessageAddSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxCheckpointMessageAddSize() {
        return maxCheckpointMessageAddSize;
    }

    /**
     * ����maxCheckpointMessageAddSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxCheckpointMessageAddSize(BigInteger value) {
        this.maxCheckpointMessageAddSize = value;
    }

    /**
     * ��ȡmaxCheckpointWorkers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxCheckpointWorkers() {
        return maxCheckpointWorkers;
    }

    /**
     * ����maxCheckpointWorkers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxCheckpointWorkers(BigInteger value) {
        this.maxCheckpointWorkers = value;
    }

    /**
     * ��ȡpersistenceAdapter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistenceAdapter() {
        return persistenceAdapter;
    }

    /**
     * ����persistenceAdapter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistenceAdapter(String value) {
        this.persistenceAdapter = value;
    }

    /**
     * ��ȡtaskRunnerFactory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskRunnerFactory() {
        return taskRunnerFactory;
    }

    /**
     * ����taskRunnerFactory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskRunnerFactory(String value) {
        this.taskRunnerFactory = value;
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
     * ��ȡuseExternalMessageReferences���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseExternalMessageReferences() {
        return useExternalMessageReferences;
    }

    /**
     * ����useExternalMessageReferences���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExternalMessageReferences(Boolean value) {
        this.useExternalMessageReferences = value;
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
            List<Object> theBrokerServiceOrJournalOrLongTermPersistence;
            theBrokerServiceOrJournalOrLongTermPersistence = (((this.brokerServiceOrJournalOrLongTermPersistence!= null)&&(!this.brokerServiceOrJournalOrLongTermPersistence.isEmpty()))?this.getBrokerServiceOrJournalOrLongTermPersistence():null);
            strategy.appendField(locator, this, "brokerServiceOrJournalOrLongTermPersistence", buffer, theBrokerServiceOrJournalOrLongTermPersistence);
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
            Long theCheckpointInterval;
            theCheckpointInterval = this.getCheckpointInterval();
            strategy.appendField(locator, this, "checkpointInterval", buffer, theCheckpointInterval);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            strategy.appendField(locator, this, "directory", buffer, theDirectory);
        }
        {
            String theJournal;
            theJournal = this.getJournal();
            strategy.appendField(locator, this, "journal", buffer, theJournal);
        }
        {
            String theLongTermPersistence;
            theLongTermPersistence = this.getLongTermPersistence();
            strategy.appendField(locator, this, "longTermPersistence", buffer, theLongTermPersistence);
        }
        {
            BigInteger theMaxCheckpointMessageAddSize;
            theMaxCheckpointMessageAddSize = this.getMaxCheckpointMessageAddSize();
            strategy.appendField(locator, this, "maxCheckpointMessageAddSize", buffer, theMaxCheckpointMessageAddSize);
        }
        {
            BigInteger theMaxCheckpointWorkers;
            theMaxCheckpointWorkers = this.getMaxCheckpointWorkers();
            strategy.appendField(locator, this, "maxCheckpointWorkers", buffer, theMaxCheckpointWorkers);
        }
        {
            String thePersistenceAdapter;
            thePersistenceAdapter = this.getPersistenceAdapter();
            strategy.appendField(locator, this, "persistenceAdapter", buffer, thePersistenceAdapter);
        }
        {
            String theTaskRunnerFactory;
            theTaskRunnerFactory = this.getTaskRunnerFactory();
            strategy.appendField(locator, this, "taskRunnerFactory", buffer, theTaskRunnerFactory);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            strategy.appendField(locator, this, "usageManager", buffer, theUsageManager);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            strategy.appendField(locator, this, "useExternalMessageReferences", buffer, theUseExternalMessageReferences);
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
            List<Object> theBrokerServiceOrJournalOrLongTermPersistence;
            theBrokerServiceOrJournalOrLongTermPersistence = (((this.brokerServiceOrJournalOrLongTermPersistence!= null)&&(!this.brokerServiceOrJournalOrLongTermPersistence.isEmpty()))?this.getBrokerServiceOrJournalOrLongTermPersistence():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerServiceOrJournalOrLongTermPersistence", theBrokerServiceOrJournalOrLongTermPersistence), currentHashCode, theBrokerServiceOrJournalOrLongTermPersistence);
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
            Long theCheckpointInterval;
            theCheckpointInterval = this.getCheckpointInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkpointInterval", theCheckpointInterval), currentHashCode, theCheckpointInterval);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directory", theDirectory), currentHashCode, theDirectory);
        }
        {
            String theJournal;
            theJournal = this.getJournal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journal", theJournal), currentHashCode, theJournal);
        }
        {
            String theLongTermPersistence;
            theLongTermPersistence = this.getLongTermPersistence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longTermPersistence", theLongTermPersistence), currentHashCode, theLongTermPersistence);
        }
        {
            BigInteger theMaxCheckpointMessageAddSize;
            theMaxCheckpointMessageAddSize = this.getMaxCheckpointMessageAddSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxCheckpointMessageAddSize", theMaxCheckpointMessageAddSize), currentHashCode, theMaxCheckpointMessageAddSize);
        }
        {
            BigInteger theMaxCheckpointWorkers;
            theMaxCheckpointWorkers = this.getMaxCheckpointWorkers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxCheckpointWorkers", theMaxCheckpointWorkers), currentHashCode, theMaxCheckpointWorkers);
        }
        {
            String thePersistenceAdapter;
            thePersistenceAdapter = this.getPersistenceAdapter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistenceAdapter", thePersistenceAdapter), currentHashCode, thePersistenceAdapter);
        }
        {
            String theTaskRunnerFactory;
            theTaskRunnerFactory = this.getTaskRunnerFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerFactory", theTaskRunnerFactory), currentHashCode, theTaskRunnerFactory);
        }
        {
            String theUsageManager;
            theUsageManager = this.getUsageManager();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usageManager", theUsageManager), currentHashCode, theUsageManager);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useExternalMessageReferences", theUseExternalMessageReferences), currentHashCode, theUseExternalMessageReferences);
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
        if (!(object instanceof DtoJournalPersistenceAdapter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoJournalPersistenceAdapter that = ((DtoJournalPersistenceAdapter) object);
        {
            List<Object> lhsBrokerServiceOrJournalOrLongTermPersistence;
            lhsBrokerServiceOrJournalOrLongTermPersistence = (((this.brokerServiceOrJournalOrLongTermPersistence!= null)&&(!this.brokerServiceOrJournalOrLongTermPersistence.isEmpty()))?this.getBrokerServiceOrJournalOrLongTermPersistence():null);
            List<Object> rhsBrokerServiceOrJournalOrLongTermPersistence;
            rhsBrokerServiceOrJournalOrLongTermPersistence = (((that.brokerServiceOrJournalOrLongTermPersistence!= null)&&(!that.brokerServiceOrJournalOrLongTermPersistence.isEmpty()))?that.getBrokerServiceOrJournalOrLongTermPersistence():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerServiceOrJournalOrLongTermPersistence", lhsBrokerServiceOrJournalOrLongTermPersistence), LocatorUtils.property(thatLocator, "brokerServiceOrJournalOrLongTermPersistence", rhsBrokerServiceOrJournalOrLongTermPersistence), lhsBrokerServiceOrJournalOrLongTermPersistence, rhsBrokerServiceOrJournalOrLongTermPersistence)) {
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
            Long lhsCheckpointInterval;
            lhsCheckpointInterval = this.getCheckpointInterval();
            Long rhsCheckpointInterval;
            rhsCheckpointInterval = that.getCheckpointInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkpointInterval", lhsCheckpointInterval), LocatorUtils.property(thatLocator, "checkpointInterval", rhsCheckpointInterval), lhsCheckpointInterval, rhsCheckpointInterval)) {
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
            String lhsJournal;
            lhsJournal = this.getJournal();
            String rhsJournal;
            rhsJournal = that.getJournal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journal", lhsJournal), LocatorUtils.property(thatLocator, "journal", rhsJournal), lhsJournal, rhsJournal)) {
                return false;
            }
        }
        {
            String lhsLongTermPersistence;
            lhsLongTermPersistence = this.getLongTermPersistence();
            String rhsLongTermPersistence;
            rhsLongTermPersistence = that.getLongTermPersistence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longTermPersistence", lhsLongTermPersistence), LocatorUtils.property(thatLocator, "longTermPersistence", rhsLongTermPersistence), lhsLongTermPersistence, rhsLongTermPersistence)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxCheckpointMessageAddSize;
            lhsMaxCheckpointMessageAddSize = this.getMaxCheckpointMessageAddSize();
            BigInteger rhsMaxCheckpointMessageAddSize;
            rhsMaxCheckpointMessageAddSize = that.getMaxCheckpointMessageAddSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxCheckpointMessageAddSize", lhsMaxCheckpointMessageAddSize), LocatorUtils.property(thatLocator, "maxCheckpointMessageAddSize", rhsMaxCheckpointMessageAddSize), lhsMaxCheckpointMessageAddSize, rhsMaxCheckpointMessageAddSize)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxCheckpointWorkers;
            lhsMaxCheckpointWorkers = this.getMaxCheckpointWorkers();
            BigInteger rhsMaxCheckpointWorkers;
            rhsMaxCheckpointWorkers = that.getMaxCheckpointWorkers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxCheckpointWorkers", lhsMaxCheckpointWorkers), LocatorUtils.property(thatLocator, "maxCheckpointWorkers", rhsMaxCheckpointWorkers), lhsMaxCheckpointWorkers, rhsMaxCheckpointWorkers)) {
                return false;
            }
        }
        {
            String lhsPersistenceAdapter;
            lhsPersistenceAdapter = this.getPersistenceAdapter();
            String rhsPersistenceAdapter;
            rhsPersistenceAdapter = that.getPersistenceAdapter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistenceAdapter", lhsPersistenceAdapter), LocatorUtils.property(thatLocator, "persistenceAdapter", rhsPersistenceAdapter), lhsPersistenceAdapter, rhsPersistenceAdapter)) {
                return false;
            }
        }
        {
            String lhsTaskRunnerFactory;
            lhsTaskRunnerFactory = this.getTaskRunnerFactory();
            String rhsTaskRunnerFactory;
            rhsTaskRunnerFactory = that.getTaskRunnerFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taskRunnerFactory", lhsTaskRunnerFactory), LocatorUtils.property(thatLocator, "taskRunnerFactory", rhsTaskRunnerFactory), lhsTaskRunnerFactory, rhsTaskRunnerFactory)) {
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
            Boolean lhsUseExternalMessageReferences;
            lhsUseExternalMessageReferences = this.isUseExternalMessageReferences();
            Boolean rhsUseExternalMessageReferences;
            rhsUseExternalMessageReferences = that.isUseExternalMessageReferences();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useExternalMessageReferences", lhsUseExternalMessageReferences), LocatorUtils.property(thatLocator, "useExternalMessageReferences", rhsUseExternalMessageReferences), lhsUseExternalMessageReferences, rhsUseExternalMessageReferences)) {
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
            if (!(object instanceof DtoJournalPersistenceAdapter.BrokerService)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJournalPersistenceAdapter.BrokerService that = ((DtoJournalPersistenceAdapter.BrokerService) object);
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
    public static class Journal
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
            if (!(object instanceof DtoJournalPersistenceAdapter.Journal)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJournalPersistenceAdapter.Journal that = ((DtoJournalPersistenceAdapter.Journal) object);
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
    public static class LongTermPersistence
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
         * ��ȡjdbcPersistenceAdapter���Ե�ֵ��
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
         * ����jdbcPersistenceAdapter���Ե�ֵ��
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
         * ��ȡjournalPersistenceAdapter���Ե�ֵ��
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
         * ����journalPersistenceAdapter���Ե�ֵ��
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
         * ��ȡkahaDB���Ե�ֵ��
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
         * ����kahaDB���Ե�ֵ��
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
         * ��ȡlevelDB���Ե�ֵ��
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
         * ����levelDB���Ե�ֵ��
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
         * ��ȡmKahaDB���Ե�ֵ��
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
         * ����mKahaDB���Ե�ֵ��
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
         * ��ȡmemoryPersistenceAdapter���Ե�ֵ��
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
         * ����memoryPersistenceAdapter���Ե�ֵ��
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
         * ��ȡreplicatedLevelDB���Ե�ֵ��
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
         * ����replicatedLevelDB���Ե�ֵ��
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
            if (!(object instanceof DtoJournalPersistenceAdapter.LongTermPersistence)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJournalPersistenceAdapter.LongTermPersistence that = ((DtoJournalPersistenceAdapter.LongTermPersistence) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
    public static class PersistenceAdapter
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
         * ��ȡjdbcPersistenceAdapter���Ե�ֵ��
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
         * ����jdbcPersistenceAdapter���Ե�ֵ��
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
         * ��ȡjournalPersistenceAdapter���Ե�ֵ��
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
         * ����journalPersistenceAdapter���Ե�ֵ��
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
         * ��ȡkahaDB���Ե�ֵ��
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
         * ����kahaDB���Ե�ֵ��
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
         * ��ȡlevelDB���Ե�ֵ��
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
         * ����levelDB���Ե�ֵ��
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
         * ��ȡmKahaDB���Ե�ֵ��
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
         * ����mKahaDB���Ե�ֵ��
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
         * ��ȡmemoryPersistenceAdapter���Ե�ֵ��
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
         * ����memoryPersistenceAdapter���Ե�ֵ��
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
         * ��ȡreplicatedLevelDB���Ե�ֵ��
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
         * ����replicatedLevelDB���Ե�ֵ��
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
            if (!(object instanceof DtoJournalPersistenceAdapter.PersistenceAdapter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJournalPersistenceAdapter.PersistenceAdapter that = ((DtoJournalPersistenceAdapter.PersistenceAdapter) object);
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice minOccurs="0">
     *         &lt;element ref="{http://activemq.apache.org/schema/core}taskRunnerFactory"/>
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
        "taskRunnerFactory",
        "any"
    })
    public static class TaskRunnerFactory
        implements Equals, HashCode, ToString
    {

        protected DtoTaskRunnerFactory taskRunnerFactory;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡtaskRunnerFactory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public DtoTaskRunnerFactory getTaskRunnerFactory() {
            return taskRunnerFactory;
        }

        /**
         * ����taskRunnerFactory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoTaskRunnerFactory }
         *     
         */
        public void setTaskRunnerFactory(DtoTaskRunnerFactory value) {
            this.taskRunnerFactory = value;
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
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                strategy.appendField(locator, this, "taskRunnerFactory", buffer, theTaskRunnerFactory);
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
                DtoTaskRunnerFactory theTaskRunnerFactory;
                theTaskRunnerFactory = this.getTaskRunnerFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taskRunnerFactory", theTaskRunnerFactory), currentHashCode, theTaskRunnerFactory);
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
            if (!(object instanceof DtoJournalPersistenceAdapter.TaskRunnerFactory)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJournalPersistenceAdapter.TaskRunnerFactory that = ((DtoJournalPersistenceAdapter.TaskRunnerFactory) object);
            {
                DtoTaskRunnerFactory lhsTaskRunnerFactory;
                lhsTaskRunnerFactory = this.getTaskRunnerFactory();
                DtoTaskRunnerFactory rhsTaskRunnerFactory;
                rhsTaskRunnerFactory = that.getTaskRunnerFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "taskRunnerFactory", lhsTaskRunnerFactory), LocatorUtils.property(thatLocator, "taskRunnerFactory", rhsTaskRunnerFactory), lhsTaskRunnerFactory, rhsTaskRunnerFactory)) {
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
            if (!(object instanceof DtoJournalPersistenceAdapter.UsageManager)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoJournalPersistenceAdapter.UsageManager that = ((DtoJournalPersistenceAdapter.UsageManager) object);
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