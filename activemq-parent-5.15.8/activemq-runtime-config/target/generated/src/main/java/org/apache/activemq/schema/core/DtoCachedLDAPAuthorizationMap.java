//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.10-b140310.1920 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.02.26 ʱ�� 09:59:41 AM CST 
//


package org.apache.activemq.schema.core;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.apache.activemq.plugin.jaxb2_commons.ElementAwareEqualsStrategy;
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
 *       &lt;attribute name="adminPermissionGroupSearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="authentication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionProtocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupObjectClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="legacyGroupMapping" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="permissionGroupMemberAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueSearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="readPermissionGroupSearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refreshDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="refreshInterval" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="tempSearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topicSearchBase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userObjectClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="writePermissionGroupSearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "")
@XmlRootElement(name = "cachedLDAPAuthorizationMap")
public class DtoCachedLDAPAuthorizationMap
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "adminPermissionGroupSearchFilter")
    protected String adminPermissionGroupSearchFilter;
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
    @XmlAttribute(name = "groupClass")
    protected String groupClass;
    @XmlAttribute(name = "groupNameAttribute")
    protected String groupNameAttribute;
    @XmlAttribute(name = "groupObjectClass")
    protected String groupObjectClass;
    @XmlAttribute(name = "legacyGroupMapping")
    protected Boolean legacyGroupMapping;
    @XmlAttribute(name = "permissionGroupMemberAttribute")
    protected String permissionGroupMemberAttribute;
    @XmlAttribute(name = "queueSearchBase")
    protected String queueSearchBase;
    @XmlAttribute(name = "readPermissionGroupSearchFilter")
    protected String readPermissionGroupSearchFilter;
    @XmlAttribute(name = "refreshDisabled")
    protected Boolean refreshDisabled;
    @XmlAttribute(name = "refreshInterval")
    protected BigInteger refreshInterval;
    @XmlAttribute(name = "tempSearchBase")
    protected String tempSearchBase;
    @XmlAttribute(name = "topicSearchBase")
    protected String topicSearchBase;
    @XmlAttribute(name = "userNameAttribute")
    protected String userNameAttribute;
    @XmlAttribute(name = "userObjectClass")
    protected String userObjectClass;
    @XmlAttribute(name = "writePermissionGroupSearchFilter")
    protected String writePermissionGroupSearchFilter;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * ��ȡadminPermissionGroupSearchFilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPermissionGroupSearchFilter() {
        return adminPermissionGroupSearchFilter;
    }

    /**
     * ����adminPermissionGroupSearchFilter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPermissionGroupSearchFilter(String value) {
        this.adminPermissionGroupSearchFilter = value;
    }

    /**
     * ��ȡauthentication���Ե�ֵ��
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
     * ����authentication���Ե�ֵ��
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
     * ��ȡconnectionPassword���Ե�ֵ��
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
     * ����connectionPassword���Ե�ֵ��
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
     * ��ȡconnectionProtocol���Ե�ֵ��
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
     * ����connectionProtocol���Ե�ֵ��
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
     * ��ȡconnectionURL���Ե�ֵ��
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
     * ����connectionURL���Ե�ֵ��
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
     * ��ȡconnectionUsername���Ե�ֵ��
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
     * ����connectionUsername���Ե�ֵ��
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
     * ��ȡgroupClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupClass() {
        return groupClass;
    }

    /**
     * ����groupClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupClass(String value) {
        this.groupClass = value;
    }

    /**
     * ��ȡgroupNameAttribute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNameAttribute() {
        return groupNameAttribute;
    }

    /**
     * ����groupNameAttribute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNameAttribute(String value) {
        this.groupNameAttribute = value;
    }

    /**
     * ��ȡgroupObjectClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupObjectClass() {
        return groupObjectClass;
    }

    /**
     * ����groupObjectClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupObjectClass(String value) {
        this.groupObjectClass = value;
    }

    /**
     * ��ȡlegacyGroupMapping���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegacyGroupMapping() {
        return legacyGroupMapping;
    }

    /**
     * ����legacyGroupMapping���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegacyGroupMapping(Boolean value) {
        this.legacyGroupMapping = value;
    }

    /**
     * ��ȡpermissionGroupMemberAttribute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionGroupMemberAttribute() {
        return permissionGroupMemberAttribute;
    }

    /**
     * ����permissionGroupMemberAttribute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionGroupMemberAttribute(String value) {
        this.permissionGroupMemberAttribute = value;
    }

    /**
     * ��ȡqueueSearchBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueSearchBase() {
        return queueSearchBase;
    }

    /**
     * ����queueSearchBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueSearchBase(String value) {
        this.queueSearchBase = value;
    }

    /**
     * ��ȡreadPermissionGroupSearchFilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadPermissionGroupSearchFilter() {
        return readPermissionGroupSearchFilter;
    }

    /**
     * ����readPermissionGroupSearchFilter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadPermissionGroupSearchFilter(String value) {
        this.readPermissionGroupSearchFilter = value;
    }

    /**
     * ��ȡrefreshDisabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshDisabled() {
        return refreshDisabled;
    }

    /**
     * ����refreshDisabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshDisabled(Boolean value) {
        this.refreshDisabled = value;
    }

    /**
     * ��ȡrefreshInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * ����refreshInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefreshInterval(BigInteger value) {
        this.refreshInterval = value;
    }

    /**
     * ��ȡtempSearchBase���Ե�ֵ��
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
     * ����tempSearchBase���Ե�ֵ��
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
     * ��ȡtopicSearchBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicSearchBase() {
        return topicSearchBase;
    }

    /**
     * ����topicSearchBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicSearchBase(String value) {
        this.topicSearchBase = value;
    }

    /**
     * ��ȡuserNameAttribute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameAttribute() {
        return userNameAttribute;
    }

    /**
     * ����userNameAttribute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameAttribute(String value) {
        this.userNameAttribute = value;
    }

    /**
     * ��ȡuserObjectClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserObjectClass() {
        return userObjectClass;
    }

    /**
     * ����userObjectClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserObjectClass(String value) {
        this.userObjectClass = value;
    }

    /**
     * ��ȡwritePermissionGroupSearchFilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritePermissionGroupSearchFilter() {
        return writePermissionGroupSearchFilter;
    }

    /**
     * ����writePermissionGroupSearchFilter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritePermissionGroupSearchFilter(String value) {
        this.writePermissionGroupSearchFilter = value;
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
            String theAdminPermissionGroupSearchFilter;
            theAdminPermissionGroupSearchFilter = this.getAdminPermissionGroupSearchFilter();
            strategy.appendField(locator, this, "adminPermissionGroupSearchFilter", buffer, theAdminPermissionGroupSearchFilter);
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
            String theGroupClass;
            theGroupClass = this.getGroupClass();
            strategy.appendField(locator, this, "groupClass", buffer, theGroupClass);
        }
        {
            String theGroupNameAttribute;
            theGroupNameAttribute = this.getGroupNameAttribute();
            strategy.appendField(locator, this, "groupNameAttribute", buffer, theGroupNameAttribute);
        }
        {
            String theGroupObjectClass;
            theGroupObjectClass = this.getGroupObjectClass();
            strategy.appendField(locator, this, "groupObjectClass", buffer, theGroupObjectClass);
        }
        {
            Boolean theLegacyGroupMapping;
            theLegacyGroupMapping = this.isLegacyGroupMapping();
            strategy.appendField(locator, this, "legacyGroupMapping", buffer, theLegacyGroupMapping);
        }
        {
            String thePermissionGroupMemberAttribute;
            thePermissionGroupMemberAttribute = this.getPermissionGroupMemberAttribute();
            strategy.appendField(locator, this, "permissionGroupMemberAttribute", buffer, thePermissionGroupMemberAttribute);
        }
        {
            String theQueueSearchBase;
            theQueueSearchBase = this.getQueueSearchBase();
            strategy.appendField(locator, this, "queueSearchBase", buffer, theQueueSearchBase);
        }
        {
            String theReadPermissionGroupSearchFilter;
            theReadPermissionGroupSearchFilter = this.getReadPermissionGroupSearchFilter();
            strategy.appendField(locator, this, "readPermissionGroupSearchFilter", buffer, theReadPermissionGroupSearchFilter);
        }
        {
            Boolean theRefreshDisabled;
            theRefreshDisabled = this.isRefreshDisabled();
            strategy.appendField(locator, this, "refreshDisabled", buffer, theRefreshDisabled);
        }
        {
            BigInteger theRefreshInterval;
            theRefreshInterval = this.getRefreshInterval();
            strategy.appendField(locator, this, "refreshInterval", buffer, theRefreshInterval);
        }
        {
            String theTempSearchBase;
            theTempSearchBase = this.getTempSearchBase();
            strategy.appendField(locator, this, "tempSearchBase", buffer, theTempSearchBase);
        }
        {
            String theTopicSearchBase;
            theTopicSearchBase = this.getTopicSearchBase();
            strategy.appendField(locator, this, "topicSearchBase", buffer, theTopicSearchBase);
        }
        {
            String theUserNameAttribute;
            theUserNameAttribute = this.getUserNameAttribute();
            strategy.appendField(locator, this, "userNameAttribute", buffer, theUserNameAttribute);
        }
        {
            String theUserObjectClass;
            theUserObjectClass = this.getUserObjectClass();
            strategy.appendField(locator, this, "userObjectClass", buffer, theUserObjectClass);
        }
        {
            String theWritePermissionGroupSearchFilter;
            theWritePermissionGroupSearchFilter = this.getWritePermissionGroupSearchFilter();
            strategy.appendField(locator, this, "writePermissionGroupSearchFilter", buffer, theWritePermissionGroupSearchFilter);
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
            String theAdminPermissionGroupSearchFilter;
            theAdminPermissionGroupSearchFilter = this.getAdminPermissionGroupSearchFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adminPermissionGroupSearchFilter", theAdminPermissionGroupSearchFilter), currentHashCode, theAdminPermissionGroupSearchFilter);
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
            String theGroupClass;
            theGroupClass = this.getGroupClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupClass", theGroupClass), currentHashCode, theGroupClass);
        }
        {
            String theGroupNameAttribute;
            theGroupNameAttribute = this.getGroupNameAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupNameAttribute", theGroupNameAttribute), currentHashCode, theGroupNameAttribute);
        }
        {
            String theGroupObjectClass;
            theGroupObjectClass = this.getGroupObjectClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupObjectClass", theGroupObjectClass), currentHashCode, theGroupObjectClass);
        }
        {
            Boolean theLegacyGroupMapping;
            theLegacyGroupMapping = this.isLegacyGroupMapping();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legacyGroupMapping", theLegacyGroupMapping), currentHashCode, theLegacyGroupMapping);
        }
        {
            String thePermissionGroupMemberAttribute;
            thePermissionGroupMemberAttribute = this.getPermissionGroupMemberAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permissionGroupMemberAttribute", thePermissionGroupMemberAttribute), currentHashCode, thePermissionGroupMemberAttribute);
        }
        {
            String theQueueSearchBase;
            theQueueSearchBase = this.getQueueSearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queueSearchBase", theQueueSearchBase), currentHashCode, theQueueSearchBase);
        }
        {
            String theReadPermissionGroupSearchFilter;
            theReadPermissionGroupSearchFilter = this.getReadPermissionGroupSearchFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "readPermissionGroupSearchFilter", theReadPermissionGroupSearchFilter), currentHashCode, theReadPermissionGroupSearchFilter);
        }
        {
            Boolean theRefreshDisabled;
            theRefreshDisabled = this.isRefreshDisabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refreshDisabled", theRefreshDisabled), currentHashCode, theRefreshDisabled);
        }
        {
            BigInteger theRefreshInterval;
            theRefreshInterval = this.getRefreshInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refreshInterval", theRefreshInterval), currentHashCode, theRefreshInterval);
        }
        {
            String theTempSearchBase;
            theTempSearchBase = this.getTempSearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tempSearchBase", theTempSearchBase), currentHashCode, theTempSearchBase);
        }
        {
            String theTopicSearchBase;
            theTopicSearchBase = this.getTopicSearchBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topicSearchBase", theTopicSearchBase), currentHashCode, theTopicSearchBase);
        }
        {
            String theUserNameAttribute;
            theUserNameAttribute = this.getUserNameAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userNameAttribute", theUserNameAttribute), currentHashCode, theUserNameAttribute);
        }
        {
            String theUserObjectClass;
            theUserObjectClass = this.getUserObjectClass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userObjectClass", theUserObjectClass), currentHashCode, theUserObjectClass);
        }
        {
            String theWritePermissionGroupSearchFilter;
            theWritePermissionGroupSearchFilter = this.getWritePermissionGroupSearchFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "writePermissionGroupSearchFilter", theWritePermissionGroupSearchFilter), currentHashCode, theWritePermissionGroupSearchFilter);
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
        if (!(object instanceof DtoCachedLDAPAuthorizationMap)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoCachedLDAPAuthorizationMap that = ((DtoCachedLDAPAuthorizationMap) object);
        {
            String lhsAdminPermissionGroupSearchFilter;
            lhsAdminPermissionGroupSearchFilter = this.getAdminPermissionGroupSearchFilter();
            String rhsAdminPermissionGroupSearchFilter;
            rhsAdminPermissionGroupSearchFilter = that.getAdminPermissionGroupSearchFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminPermissionGroupSearchFilter", lhsAdminPermissionGroupSearchFilter), LocatorUtils.property(thatLocator, "adminPermissionGroupSearchFilter", rhsAdminPermissionGroupSearchFilter), lhsAdminPermissionGroupSearchFilter, rhsAdminPermissionGroupSearchFilter)) {
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
            String lhsGroupClass;
            lhsGroupClass = this.getGroupClass();
            String rhsGroupClass;
            rhsGroupClass = that.getGroupClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupClass", lhsGroupClass), LocatorUtils.property(thatLocator, "groupClass", rhsGroupClass), lhsGroupClass, rhsGroupClass)) {
                return false;
            }
        }
        {
            String lhsGroupNameAttribute;
            lhsGroupNameAttribute = this.getGroupNameAttribute();
            String rhsGroupNameAttribute;
            rhsGroupNameAttribute = that.getGroupNameAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupNameAttribute", lhsGroupNameAttribute), LocatorUtils.property(thatLocator, "groupNameAttribute", rhsGroupNameAttribute), lhsGroupNameAttribute, rhsGroupNameAttribute)) {
                return false;
            }
        }
        {
            String lhsGroupObjectClass;
            lhsGroupObjectClass = this.getGroupObjectClass();
            String rhsGroupObjectClass;
            rhsGroupObjectClass = that.getGroupObjectClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupObjectClass", lhsGroupObjectClass), LocatorUtils.property(thatLocator, "groupObjectClass", rhsGroupObjectClass), lhsGroupObjectClass, rhsGroupObjectClass)) {
                return false;
            }
        }
        {
            Boolean lhsLegacyGroupMapping;
            lhsLegacyGroupMapping = this.isLegacyGroupMapping();
            Boolean rhsLegacyGroupMapping;
            rhsLegacyGroupMapping = that.isLegacyGroupMapping();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legacyGroupMapping", lhsLegacyGroupMapping), LocatorUtils.property(thatLocator, "legacyGroupMapping", rhsLegacyGroupMapping), lhsLegacyGroupMapping, rhsLegacyGroupMapping)) {
                return false;
            }
        }
        {
            String lhsPermissionGroupMemberAttribute;
            lhsPermissionGroupMemberAttribute = this.getPermissionGroupMemberAttribute();
            String rhsPermissionGroupMemberAttribute;
            rhsPermissionGroupMemberAttribute = that.getPermissionGroupMemberAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permissionGroupMemberAttribute", lhsPermissionGroupMemberAttribute), LocatorUtils.property(thatLocator, "permissionGroupMemberAttribute", rhsPermissionGroupMemberAttribute), lhsPermissionGroupMemberAttribute, rhsPermissionGroupMemberAttribute)) {
                return false;
            }
        }
        {
            String lhsQueueSearchBase;
            lhsQueueSearchBase = this.getQueueSearchBase();
            String rhsQueueSearchBase;
            rhsQueueSearchBase = that.getQueueSearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queueSearchBase", lhsQueueSearchBase), LocatorUtils.property(thatLocator, "queueSearchBase", rhsQueueSearchBase), lhsQueueSearchBase, rhsQueueSearchBase)) {
                return false;
            }
        }
        {
            String lhsReadPermissionGroupSearchFilter;
            lhsReadPermissionGroupSearchFilter = this.getReadPermissionGroupSearchFilter();
            String rhsReadPermissionGroupSearchFilter;
            rhsReadPermissionGroupSearchFilter = that.getReadPermissionGroupSearchFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "readPermissionGroupSearchFilter", lhsReadPermissionGroupSearchFilter), LocatorUtils.property(thatLocator, "readPermissionGroupSearchFilter", rhsReadPermissionGroupSearchFilter), lhsReadPermissionGroupSearchFilter, rhsReadPermissionGroupSearchFilter)) {
                return false;
            }
        }
        {
            Boolean lhsRefreshDisabled;
            lhsRefreshDisabled = this.isRefreshDisabled();
            Boolean rhsRefreshDisabled;
            rhsRefreshDisabled = that.isRefreshDisabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refreshDisabled", lhsRefreshDisabled), LocatorUtils.property(thatLocator, "refreshDisabled", rhsRefreshDisabled), lhsRefreshDisabled, rhsRefreshDisabled)) {
                return false;
            }
        }
        {
            BigInteger lhsRefreshInterval;
            lhsRefreshInterval = this.getRefreshInterval();
            BigInteger rhsRefreshInterval;
            rhsRefreshInterval = that.getRefreshInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refreshInterval", lhsRefreshInterval), LocatorUtils.property(thatLocator, "refreshInterval", rhsRefreshInterval), lhsRefreshInterval, rhsRefreshInterval)) {
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
            String lhsTopicSearchBase;
            lhsTopicSearchBase = this.getTopicSearchBase();
            String rhsTopicSearchBase;
            rhsTopicSearchBase = that.getTopicSearchBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topicSearchBase", lhsTopicSearchBase), LocatorUtils.property(thatLocator, "topicSearchBase", rhsTopicSearchBase), lhsTopicSearchBase, rhsTopicSearchBase)) {
                return false;
            }
        }
        {
            String lhsUserNameAttribute;
            lhsUserNameAttribute = this.getUserNameAttribute();
            String rhsUserNameAttribute;
            rhsUserNameAttribute = that.getUserNameAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userNameAttribute", lhsUserNameAttribute), LocatorUtils.property(thatLocator, "userNameAttribute", rhsUserNameAttribute), lhsUserNameAttribute, rhsUserNameAttribute)) {
                return false;
            }
        }
        {
            String lhsUserObjectClass;
            lhsUserObjectClass = this.getUserObjectClass();
            String rhsUserObjectClass;
            rhsUserObjectClass = that.getUserObjectClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userObjectClass", lhsUserObjectClass), LocatorUtils.property(thatLocator, "userObjectClass", rhsUserObjectClass), lhsUserObjectClass, rhsUserObjectClass)) {
                return false;
            }
        }
        {
            String lhsWritePermissionGroupSearchFilter;
            lhsWritePermissionGroupSearchFilter = this.getWritePermissionGroupSearchFilter();
            String rhsWritePermissionGroupSearchFilter;
            rhsWritePermissionGroupSearchFilter = that.getWritePermissionGroupSearchFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "writePermissionGroupSearchFilter", lhsWritePermissionGroupSearchFilter), LocatorUtils.property(thatLocator, "writePermissionGroupSearchFilter", rhsWritePermissionGroupSearchFilter), lhsWritePermissionGroupSearchFilter, rhsWritePermissionGroupSearchFilter)) {
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
        final EqualsStrategy strategy = new ElementAwareEqualsStrategy();
        return equals(null, null, object, strategy);
    }

}