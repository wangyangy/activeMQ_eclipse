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
 *           &lt;element name="lockable" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
 *                     &lt;element ref="{http://activemq.apache.org/schema/core}replicatedLevelDB"/>
 *                     &lt;any namespace='##other'/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failIfLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="lockAcquireSleepInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lockable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "lockableOrAny"
})
@XmlRootElement(name = "shared-file-locker")
public class DtoSharedFileLocker implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "lockable", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    @XmlAnyElement(lax = true)
    protected List<Object> lockableOrAny;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "failIfLocked")
    protected Boolean failIfLocked;
    @XmlAttribute(name = "lockAcquireSleepInterval")
    protected Long lockAcquireSleepInterval;
    @XmlAttribute(name = "lockable")
    protected String lockable;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the lockableOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lockableOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLockableOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoSharedFileLocker.Lockable }{@code >}
     * 
     * 
     */
    public List<Object> getLockableOrAny() {
        if (lockableOrAny == null) {
            lockableOrAny = new ArrayList<Object>();
        }
        return this.lockableOrAny;
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
     * ��ȡfailIfLocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailIfLocked() {
        return failIfLocked;
    }

    /**
     * ����failIfLocked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailIfLocked(Boolean value) {
        this.failIfLocked = value;
    }

    /**
     * ��ȡlockAcquireSleepInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLockAcquireSleepInterval() {
        return lockAcquireSleepInterval;
    }

    /**
     * ����lockAcquireSleepInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLockAcquireSleepInterval(Long value) {
        this.lockAcquireSleepInterval = value;
    }

    /**
     * ��ȡlockable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockable() {
        return lockable;
    }

    /**
     * ����lockable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockable(String value) {
        this.lockable = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
            List<Object> theLockableOrAny;
            theLockableOrAny = (((this.lockableOrAny!= null)&&(!this.lockableOrAny.isEmpty()))?this.getLockableOrAny():null);
            strategy.appendField(locator, this, "lockableOrAny", buffer, theLockableOrAny);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            strategy.appendField(locator, this, "directory", buffer, theDirectory);
        }
        {
            Boolean theFailIfLocked;
            theFailIfLocked = this.isFailIfLocked();
            strategy.appendField(locator, this, "failIfLocked", buffer, theFailIfLocked);
        }
        {
            Long theLockAcquireSleepInterval;
            theLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            strategy.appendField(locator, this, "lockAcquireSleepInterval", buffer, theLockAcquireSleepInterval);
        }
        {
            String theLockable;
            theLockable = this.getLockable();
            strategy.appendField(locator, this, "lockable", buffer, theLockable);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
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
            List<Object> theLockableOrAny;
            theLockableOrAny = (((this.lockableOrAny!= null)&&(!this.lockableOrAny.isEmpty()))?this.getLockableOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockableOrAny", theLockableOrAny), currentHashCode, theLockableOrAny);
        }
        {
            String theDirectory;
            theDirectory = this.getDirectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directory", theDirectory), currentHashCode, theDirectory);
        }
        {
            Boolean theFailIfLocked;
            theFailIfLocked = this.isFailIfLocked();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failIfLocked", theFailIfLocked), currentHashCode, theFailIfLocked);
        }
        {
            Long theLockAcquireSleepInterval;
            theLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockAcquireSleepInterval", theLockAcquireSleepInterval), currentHashCode, theLockAcquireSleepInterval);
        }
        {
            String theLockable;
            theLockable = this.getLockable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockable", theLockable), currentHashCode, theLockable);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
        if (!(object instanceof DtoSharedFileLocker)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoSharedFileLocker that = ((DtoSharedFileLocker) object);
        {
            List<Object> lhsLockableOrAny;
            lhsLockableOrAny = (((this.lockableOrAny!= null)&&(!this.lockableOrAny.isEmpty()))?this.getLockableOrAny():null);
            List<Object> rhsLockableOrAny;
            rhsLockableOrAny = (((that.lockableOrAny!= null)&&(!that.lockableOrAny.isEmpty()))?that.getLockableOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockableOrAny", lhsLockableOrAny), LocatorUtils.property(thatLocator, "lockableOrAny", rhsLockableOrAny), lhsLockableOrAny, rhsLockableOrAny)) {
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
            Boolean lhsFailIfLocked;
            lhsFailIfLocked = this.isFailIfLocked();
            Boolean rhsFailIfLocked;
            rhsFailIfLocked = that.isFailIfLocked();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failIfLocked", lhsFailIfLocked), LocatorUtils.property(thatLocator, "failIfLocked", rhsFailIfLocked), lhsFailIfLocked, rhsFailIfLocked)) {
                return false;
            }
        }
        {
            Long lhsLockAcquireSleepInterval;
            lhsLockAcquireSleepInterval = this.getLockAcquireSleepInterval();
            Long rhsLockAcquireSleepInterval;
            rhsLockAcquireSleepInterval = that.getLockAcquireSleepInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockAcquireSleepInterval", lhsLockAcquireSleepInterval), LocatorUtils.property(thatLocator, "lockAcquireSleepInterval", rhsLockAcquireSleepInterval), lhsLockAcquireSleepInterval, rhsLockAcquireSleepInterval)) {
                return false;
            }
        }
        {
            String lhsLockable;
            lhsLockable = this.getLockable();
            String rhsLockable;
            rhsLockable = that.getLockable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockable", lhsLockable), LocatorUtils.property(thatLocator, "lockable", rhsLockable), lhsLockable, rhsLockable)) {
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
     *         &lt;element ref="{http://activemq.apache.org/schema/core}jdbcPersistenceAdapter"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journalPersistenceAdapterFactory"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}journaledJDBC"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}kahaDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}levelDB"/>
     *         &lt;element ref="{http://activemq.apache.org/schema/core}mKahaDB"/>
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
        "journalPersistenceAdapterFactory",
        "journaledJDBC",
        "kahaDB",
        "levelDB",
        "mKahaDB",
        "replicatedLevelDB",
        "any"
    })
    public static class Lockable
        implements Equals, HashCode, ToString
    {

        protected DtoJdbcPersistenceAdapter jdbcPersistenceAdapter;
        protected DtoJournalPersistenceAdapterFactory journalPersistenceAdapterFactory;
        protected DtoJournaledJDBC journaledJDBC;
        protected DtoKahaDB kahaDB;
        protected DtoLevelDB levelDB;
        protected DtoMKahaDB mKahaDB;
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
         * ��ȡjournalPersistenceAdapterFactory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJournalPersistenceAdapterFactory }
         *     
         */
        public DtoJournalPersistenceAdapterFactory getJournalPersistenceAdapterFactory() {
            return journalPersistenceAdapterFactory;
        }

        /**
         * ����journalPersistenceAdapterFactory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournalPersistenceAdapterFactory }
         *     
         */
        public void setJournalPersistenceAdapterFactory(DtoJournalPersistenceAdapterFactory value) {
            this.journalPersistenceAdapterFactory = value;
        }

        /**
         * ��ȡjournaledJDBC���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DtoJournaledJDBC }
         *     
         */
        public DtoJournaledJDBC getJournaledJDBC() {
            return journaledJDBC;
        }

        /**
         * ����journaledJDBC���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DtoJournaledJDBC }
         *     
         */
        public void setJournaledJDBC(DtoJournaledJDBC value) {
            this.journaledJDBC = value;
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
                DtoJournalPersistenceAdapterFactory theJournalPersistenceAdapterFactory;
                theJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                strategy.appendField(locator, this, "journalPersistenceAdapterFactory", buffer, theJournalPersistenceAdapterFactory);
            }
            {
                DtoJournaledJDBC theJournaledJDBC;
                theJournaledJDBC = this.getJournaledJDBC();
                strategy.appendField(locator, this, "journaledJDBC", buffer, theJournaledJDBC);
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
                DtoJournalPersistenceAdapterFactory theJournalPersistenceAdapterFactory;
                theJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journalPersistenceAdapterFactory", theJournalPersistenceAdapterFactory), currentHashCode, theJournalPersistenceAdapterFactory);
            }
            {
                DtoJournaledJDBC theJournaledJDBC;
                theJournaledJDBC = this.getJournaledJDBC();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journaledJDBC", theJournaledJDBC), currentHashCode, theJournaledJDBC);
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
            if (!(object instanceof DtoSharedFileLocker.Lockable)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoSharedFileLocker.Lockable that = ((DtoSharedFileLocker.Lockable) object);
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
                DtoJournalPersistenceAdapterFactory lhsJournalPersistenceAdapterFactory;
                lhsJournalPersistenceAdapterFactory = this.getJournalPersistenceAdapterFactory();
                DtoJournalPersistenceAdapterFactory rhsJournalPersistenceAdapterFactory;
                rhsJournalPersistenceAdapterFactory = that.getJournalPersistenceAdapterFactory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journalPersistenceAdapterFactory", lhsJournalPersistenceAdapterFactory), LocatorUtils.property(thatLocator, "journalPersistenceAdapterFactory", rhsJournalPersistenceAdapterFactory), lhsJournalPersistenceAdapterFactory, rhsJournalPersistenceAdapterFactory)) {
                    return false;
                }
            }
            {
                DtoJournaledJDBC lhsJournaledJDBC;
                lhsJournaledJDBC = this.getJournaledJDBC();
                DtoJournaledJDBC rhsJournaledJDBC;
                rhsJournaledJDBC = that.getJournaledJDBC();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "journaledJDBC", lhsJournaledJDBC), LocatorUtils.property(thatLocator, "journaledJDBC", rhsJournaledJDBC), lhsJournaledJDBC, rhsJournaledJDBC)) {
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

}
