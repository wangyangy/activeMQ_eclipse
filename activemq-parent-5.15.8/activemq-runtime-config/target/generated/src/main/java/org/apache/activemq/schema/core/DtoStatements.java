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
 *           &lt;element name="createLockSchemaStatements" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="createSchemaStatements" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;element name="dropSchemaStatements" maxOccurs="unbounded" minOccurs="0">
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
 *           &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attribute name="addMessageStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="binaryDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clearDurableLastAckInTxStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clearXidFlagStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="containerNameDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createDurableSubStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="currentDateTimeStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deleteOldMessagesStatementWithPriority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deleteSubscriptionStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destinationMessageCountStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dropAckPKAlterStatementEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="durableSubAcksTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="durableSubscriberMessageCountStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="durableSubscriberMessageCountStatementWithPriority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findAcksPendingOutcomeStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findAllDestinationsStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findAllDurableSubMessagesStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findAllDurableSubsStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findAllMessageIdsStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findAllMessagesStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findDurableSubMessagesStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findDurableSubStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findLastSequenceIdInAcksStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findLastSequenceIdInMsgsStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findMessageByIdStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findMessageSequenceIdStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findMessageStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findNextMessagesByPriorityStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findNextMessagesStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findOpsPendingOutcomeStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="findXidByIdStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="insertDurablePriorityAckStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastAckedDurableSubscriberMessageStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastProducerSequenceIdStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leaseObtainStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leaseOwnerStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leaseUpdateStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lockCreateStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lockTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lockUpdateStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="longDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="messageTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msgIdDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nextDurableSubscriberMessageStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="removeAllMessagesStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="removeAllSubscriptionsStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="removeMessageStatment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="selectDurablePriorityAckStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequenceDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stringIdDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tablePrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDurableLastAckInTxStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDurableLastAckStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDurableLastAckWithPriorityInTxStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDurableLastAckWithPriorityStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateLastPriorityAckRowOfDurableSubStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateMessageStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateXidFlagStatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="useExternalMessageReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useLockCreateWhereClause" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements"
})
@XmlRootElement(name = "statements")
public class DtoStatements
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "createLockSchemaStatements", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "createSchemaStatements", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dropSchemaStatements", namespace = "http://activemq.apache.org/schema/core", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements;
    @XmlAttribute(name = "addMessageStatement")
    protected String addMessageStatement;
    @XmlAttribute(name = "binaryDataType")
    protected String binaryDataType;
    @XmlAttribute(name = "clearDurableLastAckInTxStatement")
    protected String clearDurableLastAckInTxStatement;
    @XmlAttribute(name = "clearXidFlagStatement")
    protected String clearXidFlagStatement;
    @XmlAttribute(name = "containerNameDataType")
    protected String containerNameDataType;
    @XmlAttribute(name = "createDurableSubStatement")
    protected String createDurableSubStatement;
    @XmlAttribute(name = "currentDateTimeStatement")
    protected String currentDateTimeStatement;
    @XmlAttribute(name = "deleteOldMessagesStatementWithPriority")
    protected String deleteOldMessagesStatementWithPriority;
    @XmlAttribute(name = "deleteSubscriptionStatement")
    protected String deleteSubscriptionStatement;
    @XmlAttribute(name = "destinationMessageCountStatement")
    protected String destinationMessageCountStatement;
    @XmlAttribute(name = "dropAckPKAlterStatementEnd")
    protected String dropAckPKAlterStatementEnd;
    @XmlAttribute(name = "durableSubAcksTableName")
    protected String durableSubAcksTableName;
    @XmlAttribute(name = "durableSubscriberMessageCountStatement")
    protected String durableSubscriberMessageCountStatement;
    @XmlAttribute(name = "durableSubscriberMessageCountStatementWithPriority")
    protected String durableSubscriberMessageCountStatementWithPriority;
    @XmlAttribute(name = "findAcksPendingOutcomeStatement")
    protected String findAcksPendingOutcomeStatement;
    @XmlAttribute(name = "findAllDestinationsStatement")
    protected String findAllDestinationsStatement;
    @XmlAttribute(name = "findAllDurableSubMessagesStatement")
    protected String findAllDurableSubMessagesStatement;
    @XmlAttribute(name = "findAllDurableSubsStatement")
    protected String findAllDurableSubsStatement;
    @XmlAttribute(name = "findAllMessageIdsStatement")
    protected String findAllMessageIdsStatement;
    @XmlAttribute(name = "findAllMessagesStatement")
    protected String findAllMessagesStatement;
    @XmlAttribute(name = "findDurableSubMessagesStatement")
    protected String findDurableSubMessagesStatement;
    @XmlAttribute(name = "findDurableSubStatement")
    protected String findDurableSubStatement;
    @XmlAttribute(name = "findLastSequenceIdInAcksStatement")
    protected String findLastSequenceIdInAcksStatement;
    @XmlAttribute(name = "findLastSequenceIdInMsgsStatement")
    protected String findLastSequenceIdInMsgsStatement;
    @XmlAttribute(name = "findMessageByIdStatement")
    protected String findMessageByIdStatement;
    @XmlAttribute(name = "findMessageSequenceIdStatement")
    protected String findMessageSequenceIdStatement;
    @XmlAttribute(name = "findMessageStatement")
    protected String findMessageStatement;
    @XmlAttribute(name = "findNextMessagesByPriorityStatement")
    protected String findNextMessagesByPriorityStatement;
    @XmlAttribute(name = "findNextMessagesStatement")
    protected String findNextMessagesStatement;
    @XmlAttribute(name = "findOpsPendingOutcomeStatement")
    protected String findOpsPendingOutcomeStatement;
    @XmlAttribute(name = "findXidByIdStatement")
    protected String findXidByIdStatement;
    @XmlAttribute(name = "insertDurablePriorityAckStatement")
    protected String insertDurablePriorityAckStatement;
    @XmlAttribute(name = "lastAckedDurableSubscriberMessageStatement")
    protected String lastAckedDurableSubscriberMessageStatement;
    @XmlAttribute(name = "lastProducerSequenceIdStatement")
    protected String lastProducerSequenceIdStatement;
    @XmlAttribute(name = "leaseObtainStatement")
    protected String leaseObtainStatement;
    @XmlAttribute(name = "leaseOwnerStatement")
    protected String leaseOwnerStatement;
    @XmlAttribute(name = "leaseUpdateStatement")
    protected String leaseUpdateStatement;
    @XmlAttribute(name = "lockCreateStatement")
    protected String lockCreateStatement;
    @XmlAttribute(name = "lockTableName")
    protected String lockTableName;
    @XmlAttribute(name = "lockUpdateStatement")
    protected String lockUpdateStatement;
    @XmlAttribute(name = "longDataType")
    protected String longDataType;
    @XmlAttribute(name = "messageTableName")
    protected String messageTableName;
    @XmlAttribute(name = "msgIdDataType")
    protected String msgIdDataType;
    @XmlAttribute(name = "nextDurableSubscriberMessageStatement")
    protected String nextDurableSubscriberMessageStatement;
    @XmlAttribute(name = "removeAllMessagesStatement")
    protected String removeAllMessagesStatement;
    @XmlAttribute(name = "removeAllSubscriptionsStatement")
    protected String removeAllSubscriptionsStatement;
    @XmlAttribute(name = "removeMessageStatment")
    protected String removeMessageStatment;
    @XmlAttribute(name = "selectDurablePriorityAckStatement")
    protected String selectDurablePriorityAckStatement;
    @XmlAttribute(name = "sequenceDataType")
    protected String sequenceDataType;
    @XmlAttribute(name = "stringIdDataType")
    protected String stringIdDataType;
    @XmlAttribute(name = "tablePrefix")
    protected String tablePrefix;
    @XmlAttribute(name = "updateDurableLastAckInTxStatement")
    protected String updateDurableLastAckInTxStatement;
    @XmlAttribute(name = "updateDurableLastAckStatement")
    protected String updateDurableLastAckStatement;
    @XmlAttribute(name = "updateDurableLastAckWithPriorityInTxStatement")
    protected String updateDurableLastAckWithPriorityInTxStatement;
    @XmlAttribute(name = "updateDurableLastAckWithPriorityStatement")
    protected String updateDurableLastAckWithPriorityStatement;
    @XmlAttribute(name = "updateLastPriorityAckRowOfDurableSubStatement")
    protected String updateLastPriorityAckRowOfDurableSubStatement;
    @XmlAttribute(name = "updateMessageStatement")
    protected String updateMessageStatement;
    @XmlAttribute(name = "updateXidFlagStatement")
    protected String updateXidFlagStatement;
    @XmlAttribute(name = "useExternalMessageReferences")
    protected Boolean useExternalMessageReferences;
    @XmlAttribute(name = "useLockCreateWhereClause")
    protected Boolean useLockCreateWhereClause;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DtoStatements.CreateLockSchemaStatements }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link DtoStatements.CreateSchemaStatements }{@code >}
     * {@link JAXBElement }{@code <}{@link DtoStatements.DropSchemaStatements }{@code >}
     * 
     * 
     */
    public List<Object> getCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements() {
        if (createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements == null) {
            createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements = new ArrayList<Object>();
        }
        return this.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements;
    }

    /**
     * 获取addMessageStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddMessageStatement() {
        return addMessageStatement;
    }

    /**
     * 设置addMessageStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddMessageStatement(String value) {
        this.addMessageStatement = value;
    }

    /**
     * 获取binaryDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryDataType() {
        return binaryDataType;
    }

    /**
     * 设置binaryDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryDataType(String value) {
        this.binaryDataType = value;
    }

    /**
     * 获取clearDurableLastAckInTxStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearDurableLastAckInTxStatement() {
        return clearDurableLastAckInTxStatement;
    }

    /**
     * 设置clearDurableLastAckInTxStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearDurableLastAckInTxStatement(String value) {
        this.clearDurableLastAckInTxStatement = value;
    }

    /**
     * 获取clearXidFlagStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearXidFlagStatement() {
        return clearXidFlagStatement;
    }

    /**
     * 设置clearXidFlagStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearXidFlagStatement(String value) {
        this.clearXidFlagStatement = value;
    }

    /**
     * 获取containerNameDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerNameDataType() {
        return containerNameDataType;
    }

    /**
     * 设置containerNameDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerNameDataType(String value) {
        this.containerNameDataType = value;
    }

    /**
     * 获取createDurableSubStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDurableSubStatement() {
        return createDurableSubStatement;
    }

    /**
     * 设置createDurableSubStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDurableSubStatement(String value) {
        this.createDurableSubStatement = value;
    }

    /**
     * 获取currentDateTimeStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDateTimeStatement() {
        return currentDateTimeStatement;
    }

    /**
     * 设置currentDateTimeStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDateTimeStatement(String value) {
        this.currentDateTimeStatement = value;
    }

    /**
     * 获取deleteOldMessagesStatementWithPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteOldMessagesStatementWithPriority() {
        return deleteOldMessagesStatementWithPriority;
    }

    /**
     * 设置deleteOldMessagesStatementWithPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteOldMessagesStatementWithPriority(String value) {
        this.deleteOldMessagesStatementWithPriority = value;
    }

    /**
     * 获取deleteSubscriptionStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteSubscriptionStatement() {
        return deleteSubscriptionStatement;
    }

    /**
     * 设置deleteSubscriptionStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteSubscriptionStatement(String value) {
        this.deleteSubscriptionStatement = value;
    }

    /**
     * 获取destinationMessageCountStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationMessageCountStatement() {
        return destinationMessageCountStatement;
    }

    /**
     * 设置destinationMessageCountStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationMessageCountStatement(String value) {
        this.destinationMessageCountStatement = value;
    }

    /**
     * 获取dropAckPKAlterStatementEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropAckPKAlterStatementEnd() {
        return dropAckPKAlterStatementEnd;
    }

    /**
     * 设置dropAckPKAlterStatementEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropAckPKAlterStatementEnd(String value) {
        this.dropAckPKAlterStatementEnd = value;
    }

    /**
     * 获取durableSubAcksTableName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurableSubAcksTableName() {
        return durableSubAcksTableName;
    }

    /**
     * 设置durableSubAcksTableName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurableSubAcksTableName(String value) {
        this.durableSubAcksTableName = value;
    }

    /**
     * 获取durableSubscriberMessageCountStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurableSubscriberMessageCountStatement() {
        return durableSubscriberMessageCountStatement;
    }

    /**
     * 设置durableSubscriberMessageCountStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurableSubscriberMessageCountStatement(String value) {
        this.durableSubscriberMessageCountStatement = value;
    }

    /**
     * 获取durableSubscriberMessageCountStatementWithPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurableSubscriberMessageCountStatementWithPriority() {
        return durableSubscriberMessageCountStatementWithPriority;
    }

    /**
     * 设置durableSubscriberMessageCountStatementWithPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurableSubscriberMessageCountStatementWithPriority(String value) {
        this.durableSubscriberMessageCountStatementWithPriority = value;
    }

    /**
     * 获取findAcksPendingOutcomeStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindAcksPendingOutcomeStatement() {
        return findAcksPendingOutcomeStatement;
    }

    /**
     * 设置findAcksPendingOutcomeStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindAcksPendingOutcomeStatement(String value) {
        this.findAcksPendingOutcomeStatement = value;
    }

    /**
     * 获取findAllDestinationsStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindAllDestinationsStatement() {
        return findAllDestinationsStatement;
    }

    /**
     * 设置findAllDestinationsStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindAllDestinationsStatement(String value) {
        this.findAllDestinationsStatement = value;
    }

    /**
     * 获取findAllDurableSubMessagesStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindAllDurableSubMessagesStatement() {
        return findAllDurableSubMessagesStatement;
    }

    /**
     * 设置findAllDurableSubMessagesStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindAllDurableSubMessagesStatement(String value) {
        this.findAllDurableSubMessagesStatement = value;
    }

    /**
     * 获取findAllDurableSubsStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindAllDurableSubsStatement() {
        return findAllDurableSubsStatement;
    }

    /**
     * 设置findAllDurableSubsStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindAllDurableSubsStatement(String value) {
        this.findAllDurableSubsStatement = value;
    }

    /**
     * 获取findAllMessageIdsStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindAllMessageIdsStatement() {
        return findAllMessageIdsStatement;
    }

    /**
     * 设置findAllMessageIdsStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindAllMessageIdsStatement(String value) {
        this.findAllMessageIdsStatement = value;
    }

    /**
     * 获取findAllMessagesStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindAllMessagesStatement() {
        return findAllMessagesStatement;
    }

    /**
     * 设置findAllMessagesStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindAllMessagesStatement(String value) {
        this.findAllMessagesStatement = value;
    }

    /**
     * 获取findDurableSubMessagesStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindDurableSubMessagesStatement() {
        return findDurableSubMessagesStatement;
    }

    /**
     * 设置findDurableSubMessagesStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindDurableSubMessagesStatement(String value) {
        this.findDurableSubMessagesStatement = value;
    }

    /**
     * 获取findDurableSubStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindDurableSubStatement() {
        return findDurableSubStatement;
    }

    /**
     * 设置findDurableSubStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindDurableSubStatement(String value) {
        this.findDurableSubStatement = value;
    }

    /**
     * 获取findLastSequenceIdInAcksStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindLastSequenceIdInAcksStatement() {
        return findLastSequenceIdInAcksStatement;
    }

    /**
     * 设置findLastSequenceIdInAcksStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindLastSequenceIdInAcksStatement(String value) {
        this.findLastSequenceIdInAcksStatement = value;
    }

    /**
     * 获取findLastSequenceIdInMsgsStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindLastSequenceIdInMsgsStatement() {
        return findLastSequenceIdInMsgsStatement;
    }

    /**
     * 设置findLastSequenceIdInMsgsStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindLastSequenceIdInMsgsStatement(String value) {
        this.findLastSequenceIdInMsgsStatement = value;
    }

    /**
     * 获取findMessageByIdStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindMessageByIdStatement() {
        return findMessageByIdStatement;
    }

    /**
     * 设置findMessageByIdStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindMessageByIdStatement(String value) {
        this.findMessageByIdStatement = value;
    }

    /**
     * 获取findMessageSequenceIdStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindMessageSequenceIdStatement() {
        return findMessageSequenceIdStatement;
    }

    /**
     * 设置findMessageSequenceIdStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindMessageSequenceIdStatement(String value) {
        this.findMessageSequenceIdStatement = value;
    }

    /**
     * 获取findMessageStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindMessageStatement() {
        return findMessageStatement;
    }

    /**
     * 设置findMessageStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindMessageStatement(String value) {
        this.findMessageStatement = value;
    }

    /**
     * 获取findNextMessagesByPriorityStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindNextMessagesByPriorityStatement() {
        return findNextMessagesByPriorityStatement;
    }

    /**
     * 设置findNextMessagesByPriorityStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindNextMessagesByPriorityStatement(String value) {
        this.findNextMessagesByPriorityStatement = value;
    }

    /**
     * 获取findNextMessagesStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindNextMessagesStatement() {
        return findNextMessagesStatement;
    }

    /**
     * 设置findNextMessagesStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindNextMessagesStatement(String value) {
        this.findNextMessagesStatement = value;
    }

    /**
     * 获取findOpsPendingOutcomeStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindOpsPendingOutcomeStatement() {
        return findOpsPendingOutcomeStatement;
    }

    /**
     * 设置findOpsPendingOutcomeStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindOpsPendingOutcomeStatement(String value) {
        this.findOpsPendingOutcomeStatement = value;
    }

    /**
     * 获取findXidByIdStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindXidByIdStatement() {
        return findXidByIdStatement;
    }

    /**
     * 设置findXidByIdStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindXidByIdStatement(String value) {
        this.findXidByIdStatement = value;
    }

    /**
     * 获取insertDurablePriorityAckStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertDurablePriorityAckStatement() {
        return insertDurablePriorityAckStatement;
    }

    /**
     * 设置insertDurablePriorityAckStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertDurablePriorityAckStatement(String value) {
        this.insertDurablePriorityAckStatement = value;
    }

    /**
     * 获取lastAckedDurableSubscriberMessageStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAckedDurableSubscriberMessageStatement() {
        return lastAckedDurableSubscriberMessageStatement;
    }

    /**
     * 设置lastAckedDurableSubscriberMessageStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAckedDurableSubscriberMessageStatement(String value) {
        this.lastAckedDurableSubscriberMessageStatement = value;
    }

    /**
     * 获取lastProducerSequenceIdStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastProducerSequenceIdStatement() {
        return lastProducerSequenceIdStatement;
    }

    /**
     * 设置lastProducerSequenceIdStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastProducerSequenceIdStatement(String value) {
        this.lastProducerSequenceIdStatement = value;
    }

    /**
     * 获取leaseObtainStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseObtainStatement() {
        return leaseObtainStatement;
    }

    /**
     * 设置leaseObtainStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseObtainStatement(String value) {
        this.leaseObtainStatement = value;
    }

    /**
     * 获取leaseOwnerStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseOwnerStatement() {
        return leaseOwnerStatement;
    }

    /**
     * 设置leaseOwnerStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseOwnerStatement(String value) {
        this.leaseOwnerStatement = value;
    }

    /**
     * 获取leaseUpdateStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseUpdateStatement() {
        return leaseUpdateStatement;
    }

    /**
     * 设置leaseUpdateStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseUpdateStatement(String value) {
        this.leaseUpdateStatement = value;
    }

    /**
     * 获取lockCreateStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockCreateStatement() {
        return lockCreateStatement;
    }

    /**
     * 设置lockCreateStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockCreateStatement(String value) {
        this.lockCreateStatement = value;
    }

    /**
     * 获取lockTableName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockTableName() {
        return lockTableName;
    }

    /**
     * 设置lockTableName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockTableName(String value) {
        this.lockTableName = value;
    }

    /**
     * 获取lockUpdateStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockUpdateStatement() {
        return lockUpdateStatement;
    }

    /**
     * 设置lockUpdateStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockUpdateStatement(String value) {
        this.lockUpdateStatement = value;
    }

    /**
     * 获取longDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDataType() {
        return longDataType;
    }

    /**
     * 设置longDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDataType(String value) {
        this.longDataType = value;
    }

    /**
     * 获取messageTableName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTableName() {
        return messageTableName;
    }

    /**
     * 设置messageTableName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTableName(String value) {
        this.messageTableName = value;
    }

    /**
     * 获取msgIdDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgIdDataType() {
        return msgIdDataType;
    }

    /**
     * 设置msgIdDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgIdDataType(String value) {
        this.msgIdDataType = value;
    }

    /**
     * 获取nextDurableSubscriberMessageStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDurableSubscriberMessageStatement() {
        return nextDurableSubscriberMessageStatement;
    }

    /**
     * 设置nextDurableSubscriberMessageStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDurableSubscriberMessageStatement(String value) {
        this.nextDurableSubscriberMessageStatement = value;
    }

    /**
     * 获取removeAllMessagesStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoveAllMessagesStatement() {
        return removeAllMessagesStatement;
    }

    /**
     * 设置removeAllMessagesStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoveAllMessagesStatement(String value) {
        this.removeAllMessagesStatement = value;
    }

    /**
     * 获取removeAllSubscriptionsStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoveAllSubscriptionsStatement() {
        return removeAllSubscriptionsStatement;
    }

    /**
     * 设置removeAllSubscriptionsStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoveAllSubscriptionsStatement(String value) {
        this.removeAllSubscriptionsStatement = value;
    }

    /**
     * 获取removeMessageStatment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoveMessageStatment() {
        return removeMessageStatment;
    }

    /**
     * 设置removeMessageStatment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoveMessageStatment(String value) {
        this.removeMessageStatment = value;
    }

    /**
     * 获取selectDurablePriorityAckStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectDurablePriorityAckStatement() {
        return selectDurablePriorityAckStatement;
    }

    /**
     * 设置selectDurablePriorityAckStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectDurablePriorityAckStatement(String value) {
        this.selectDurablePriorityAckStatement = value;
    }

    /**
     * 获取sequenceDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceDataType() {
        return sequenceDataType;
    }

    /**
     * 设置sequenceDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceDataType(String value) {
        this.sequenceDataType = value;
    }

    /**
     * 获取stringIdDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringIdDataType() {
        return stringIdDataType;
    }

    /**
     * 设置stringIdDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringIdDataType(String value) {
        this.stringIdDataType = value;
    }

    /**
     * 获取tablePrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTablePrefix() {
        return tablePrefix;
    }

    /**
     * 设置tablePrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTablePrefix(String value) {
        this.tablePrefix = value;
    }

    /**
     * 获取updateDurableLastAckInTxStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDurableLastAckInTxStatement() {
        return updateDurableLastAckInTxStatement;
    }

    /**
     * 设置updateDurableLastAckInTxStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDurableLastAckInTxStatement(String value) {
        this.updateDurableLastAckInTxStatement = value;
    }

    /**
     * 获取updateDurableLastAckStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDurableLastAckStatement() {
        return updateDurableLastAckStatement;
    }

    /**
     * 设置updateDurableLastAckStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDurableLastAckStatement(String value) {
        this.updateDurableLastAckStatement = value;
    }

    /**
     * 获取updateDurableLastAckWithPriorityInTxStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDurableLastAckWithPriorityInTxStatement() {
        return updateDurableLastAckWithPriorityInTxStatement;
    }

    /**
     * 设置updateDurableLastAckWithPriorityInTxStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDurableLastAckWithPriorityInTxStatement(String value) {
        this.updateDurableLastAckWithPriorityInTxStatement = value;
    }

    /**
     * 获取updateDurableLastAckWithPriorityStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDurableLastAckWithPriorityStatement() {
        return updateDurableLastAckWithPriorityStatement;
    }

    /**
     * 设置updateDurableLastAckWithPriorityStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDurableLastAckWithPriorityStatement(String value) {
        this.updateDurableLastAckWithPriorityStatement = value;
    }

    /**
     * 获取updateLastPriorityAckRowOfDurableSubStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateLastPriorityAckRowOfDurableSubStatement() {
        return updateLastPriorityAckRowOfDurableSubStatement;
    }

    /**
     * 设置updateLastPriorityAckRowOfDurableSubStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateLastPriorityAckRowOfDurableSubStatement(String value) {
        this.updateLastPriorityAckRowOfDurableSubStatement = value;
    }

    /**
     * 获取updateMessageStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateMessageStatement() {
        return updateMessageStatement;
    }

    /**
     * 设置updateMessageStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateMessageStatement(String value) {
        this.updateMessageStatement = value;
    }

    /**
     * 获取updateXidFlagStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateXidFlagStatement() {
        return updateXidFlagStatement;
    }

    /**
     * 设置updateXidFlagStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateXidFlagStatement(String value) {
        this.updateXidFlagStatement = value;
    }

    /**
     * 获取useExternalMessageReferences属性的值。
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
     * 设置useExternalMessageReferences属性的值。
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
     * 获取useLockCreateWhereClause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseLockCreateWhereClause() {
        return useLockCreateWhereClause;
    }

    /**
     * 设置useLockCreateWhereClause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseLockCreateWhereClause(Boolean value) {
        this.useLockCreateWhereClause = value;
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
            List<Object> theCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements;
            theCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements = (((this.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements!= null)&&(!this.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements.isEmpty()))?this.getCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements():null);
            strategy.appendField(locator, this, "createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements", buffer, theCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements);
        }
        {
            String theAddMessageStatement;
            theAddMessageStatement = this.getAddMessageStatement();
            strategy.appendField(locator, this, "addMessageStatement", buffer, theAddMessageStatement);
        }
        {
            String theBinaryDataType;
            theBinaryDataType = this.getBinaryDataType();
            strategy.appendField(locator, this, "binaryDataType", buffer, theBinaryDataType);
        }
        {
            String theClearDurableLastAckInTxStatement;
            theClearDurableLastAckInTxStatement = this.getClearDurableLastAckInTxStatement();
            strategy.appendField(locator, this, "clearDurableLastAckInTxStatement", buffer, theClearDurableLastAckInTxStatement);
        }
        {
            String theClearXidFlagStatement;
            theClearXidFlagStatement = this.getClearXidFlagStatement();
            strategy.appendField(locator, this, "clearXidFlagStatement", buffer, theClearXidFlagStatement);
        }
        {
            String theContainerNameDataType;
            theContainerNameDataType = this.getContainerNameDataType();
            strategy.appendField(locator, this, "containerNameDataType", buffer, theContainerNameDataType);
        }
        {
            String theCreateDurableSubStatement;
            theCreateDurableSubStatement = this.getCreateDurableSubStatement();
            strategy.appendField(locator, this, "createDurableSubStatement", buffer, theCreateDurableSubStatement);
        }
        {
            String theCurrentDateTimeStatement;
            theCurrentDateTimeStatement = this.getCurrentDateTimeStatement();
            strategy.appendField(locator, this, "currentDateTimeStatement", buffer, theCurrentDateTimeStatement);
        }
        {
            String theDeleteOldMessagesStatementWithPriority;
            theDeleteOldMessagesStatementWithPriority = this.getDeleteOldMessagesStatementWithPriority();
            strategy.appendField(locator, this, "deleteOldMessagesStatementWithPriority", buffer, theDeleteOldMessagesStatementWithPriority);
        }
        {
            String theDeleteSubscriptionStatement;
            theDeleteSubscriptionStatement = this.getDeleteSubscriptionStatement();
            strategy.appendField(locator, this, "deleteSubscriptionStatement", buffer, theDeleteSubscriptionStatement);
        }
        {
            String theDestinationMessageCountStatement;
            theDestinationMessageCountStatement = this.getDestinationMessageCountStatement();
            strategy.appendField(locator, this, "destinationMessageCountStatement", buffer, theDestinationMessageCountStatement);
        }
        {
            String theDropAckPKAlterStatementEnd;
            theDropAckPKAlterStatementEnd = this.getDropAckPKAlterStatementEnd();
            strategy.appendField(locator, this, "dropAckPKAlterStatementEnd", buffer, theDropAckPKAlterStatementEnd);
        }
        {
            String theDurableSubAcksTableName;
            theDurableSubAcksTableName = this.getDurableSubAcksTableName();
            strategy.appendField(locator, this, "durableSubAcksTableName", buffer, theDurableSubAcksTableName);
        }
        {
            String theDurableSubscriberMessageCountStatement;
            theDurableSubscriberMessageCountStatement = this.getDurableSubscriberMessageCountStatement();
            strategy.appendField(locator, this, "durableSubscriberMessageCountStatement", buffer, theDurableSubscriberMessageCountStatement);
        }
        {
            String theDurableSubscriberMessageCountStatementWithPriority;
            theDurableSubscriberMessageCountStatementWithPriority = this.getDurableSubscriberMessageCountStatementWithPriority();
            strategy.appendField(locator, this, "durableSubscriberMessageCountStatementWithPriority", buffer, theDurableSubscriberMessageCountStatementWithPriority);
        }
        {
            String theFindAcksPendingOutcomeStatement;
            theFindAcksPendingOutcomeStatement = this.getFindAcksPendingOutcomeStatement();
            strategy.appendField(locator, this, "findAcksPendingOutcomeStatement", buffer, theFindAcksPendingOutcomeStatement);
        }
        {
            String theFindAllDestinationsStatement;
            theFindAllDestinationsStatement = this.getFindAllDestinationsStatement();
            strategy.appendField(locator, this, "findAllDestinationsStatement", buffer, theFindAllDestinationsStatement);
        }
        {
            String theFindAllDurableSubMessagesStatement;
            theFindAllDurableSubMessagesStatement = this.getFindAllDurableSubMessagesStatement();
            strategy.appendField(locator, this, "findAllDurableSubMessagesStatement", buffer, theFindAllDurableSubMessagesStatement);
        }
        {
            String theFindAllDurableSubsStatement;
            theFindAllDurableSubsStatement = this.getFindAllDurableSubsStatement();
            strategy.appendField(locator, this, "findAllDurableSubsStatement", buffer, theFindAllDurableSubsStatement);
        }
        {
            String theFindAllMessageIdsStatement;
            theFindAllMessageIdsStatement = this.getFindAllMessageIdsStatement();
            strategy.appendField(locator, this, "findAllMessageIdsStatement", buffer, theFindAllMessageIdsStatement);
        }
        {
            String theFindAllMessagesStatement;
            theFindAllMessagesStatement = this.getFindAllMessagesStatement();
            strategy.appendField(locator, this, "findAllMessagesStatement", buffer, theFindAllMessagesStatement);
        }
        {
            String theFindDurableSubMessagesStatement;
            theFindDurableSubMessagesStatement = this.getFindDurableSubMessagesStatement();
            strategy.appendField(locator, this, "findDurableSubMessagesStatement", buffer, theFindDurableSubMessagesStatement);
        }
        {
            String theFindDurableSubStatement;
            theFindDurableSubStatement = this.getFindDurableSubStatement();
            strategy.appendField(locator, this, "findDurableSubStatement", buffer, theFindDurableSubStatement);
        }
        {
            String theFindLastSequenceIdInAcksStatement;
            theFindLastSequenceIdInAcksStatement = this.getFindLastSequenceIdInAcksStatement();
            strategy.appendField(locator, this, "findLastSequenceIdInAcksStatement", buffer, theFindLastSequenceIdInAcksStatement);
        }
        {
            String theFindLastSequenceIdInMsgsStatement;
            theFindLastSequenceIdInMsgsStatement = this.getFindLastSequenceIdInMsgsStatement();
            strategy.appendField(locator, this, "findLastSequenceIdInMsgsStatement", buffer, theFindLastSequenceIdInMsgsStatement);
        }
        {
            String theFindMessageByIdStatement;
            theFindMessageByIdStatement = this.getFindMessageByIdStatement();
            strategy.appendField(locator, this, "findMessageByIdStatement", buffer, theFindMessageByIdStatement);
        }
        {
            String theFindMessageSequenceIdStatement;
            theFindMessageSequenceIdStatement = this.getFindMessageSequenceIdStatement();
            strategy.appendField(locator, this, "findMessageSequenceIdStatement", buffer, theFindMessageSequenceIdStatement);
        }
        {
            String theFindMessageStatement;
            theFindMessageStatement = this.getFindMessageStatement();
            strategy.appendField(locator, this, "findMessageStatement", buffer, theFindMessageStatement);
        }
        {
            String theFindNextMessagesByPriorityStatement;
            theFindNextMessagesByPriorityStatement = this.getFindNextMessagesByPriorityStatement();
            strategy.appendField(locator, this, "findNextMessagesByPriorityStatement", buffer, theFindNextMessagesByPriorityStatement);
        }
        {
            String theFindNextMessagesStatement;
            theFindNextMessagesStatement = this.getFindNextMessagesStatement();
            strategy.appendField(locator, this, "findNextMessagesStatement", buffer, theFindNextMessagesStatement);
        }
        {
            String theFindOpsPendingOutcomeStatement;
            theFindOpsPendingOutcomeStatement = this.getFindOpsPendingOutcomeStatement();
            strategy.appendField(locator, this, "findOpsPendingOutcomeStatement", buffer, theFindOpsPendingOutcomeStatement);
        }
        {
            String theFindXidByIdStatement;
            theFindXidByIdStatement = this.getFindXidByIdStatement();
            strategy.appendField(locator, this, "findXidByIdStatement", buffer, theFindXidByIdStatement);
        }
        {
            String theInsertDurablePriorityAckStatement;
            theInsertDurablePriorityAckStatement = this.getInsertDurablePriorityAckStatement();
            strategy.appendField(locator, this, "insertDurablePriorityAckStatement", buffer, theInsertDurablePriorityAckStatement);
        }
        {
            String theLastAckedDurableSubscriberMessageStatement;
            theLastAckedDurableSubscriberMessageStatement = this.getLastAckedDurableSubscriberMessageStatement();
            strategy.appendField(locator, this, "lastAckedDurableSubscriberMessageStatement", buffer, theLastAckedDurableSubscriberMessageStatement);
        }
        {
            String theLastProducerSequenceIdStatement;
            theLastProducerSequenceIdStatement = this.getLastProducerSequenceIdStatement();
            strategy.appendField(locator, this, "lastProducerSequenceIdStatement", buffer, theLastProducerSequenceIdStatement);
        }
        {
            String theLeaseObtainStatement;
            theLeaseObtainStatement = this.getLeaseObtainStatement();
            strategy.appendField(locator, this, "leaseObtainStatement", buffer, theLeaseObtainStatement);
        }
        {
            String theLeaseOwnerStatement;
            theLeaseOwnerStatement = this.getLeaseOwnerStatement();
            strategy.appendField(locator, this, "leaseOwnerStatement", buffer, theLeaseOwnerStatement);
        }
        {
            String theLeaseUpdateStatement;
            theLeaseUpdateStatement = this.getLeaseUpdateStatement();
            strategy.appendField(locator, this, "leaseUpdateStatement", buffer, theLeaseUpdateStatement);
        }
        {
            String theLockCreateStatement;
            theLockCreateStatement = this.getLockCreateStatement();
            strategy.appendField(locator, this, "lockCreateStatement", buffer, theLockCreateStatement);
        }
        {
            String theLockTableName;
            theLockTableName = this.getLockTableName();
            strategy.appendField(locator, this, "lockTableName", buffer, theLockTableName);
        }
        {
            String theLockUpdateStatement;
            theLockUpdateStatement = this.getLockUpdateStatement();
            strategy.appendField(locator, this, "lockUpdateStatement", buffer, theLockUpdateStatement);
        }
        {
            String theLongDataType;
            theLongDataType = this.getLongDataType();
            strategy.appendField(locator, this, "longDataType", buffer, theLongDataType);
        }
        {
            String theMessageTableName;
            theMessageTableName = this.getMessageTableName();
            strategy.appendField(locator, this, "messageTableName", buffer, theMessageTableName);
        }
        {
            String theMsgIdDataType;
            theMsgIdDataType = this.getMsgIdDataType();
            strategy.appendField(locator, this, "msgIdDataType", buffer, theMsgIdDataType);
        }
        {
            String theNextDurableSubscriberMessageStatement;
            theNextDurableSubscriberMessageStatement = this.getNextDurableSubscriberMessageStatement();
            strategy.appendField(locator, this, "nextDurableSubscriberMessageStatement", buffer, theNextDurableSubscriberMessageStatement);
        }
        {
            String theRemoveAllMessagesStatement;
            theRemoveAllMessagesStatement = this.getRemoveAllMessagesStatement();
            strategy.appendField(locator, this, "removeAllMessagesStatement", buffer, theRemoveAllMessagesStatement);
        }
        {
            String theRemoveAllSubscriptionsStatement;
            theRemoveAllSubscriptionsStatement = this.getRemoveAllSubscriptionsStatement();
            strategy.appendField(locator, this, "removeAllSubscriptionsStatement", buffer, theRemoveAllSubscriptionsStatement);
        }
        {
            String theRemoveMessageStatment;
            theRemoveMessageStatment = this.getRemoveMessageStatment();
            strategy.appendField(locator, this, "removeMessageStatment", buffer, theRemoveMessageStatment);
        }
        {
            String theSelectDurablePriorityAckStatement;
            theSelectDurablePriorityAckStatement = this.getSelectDurablePriorityAckStatement();
            strategy.appendField(locator, this, "selectDurablePriorityAckStatement", buffer, theSelectDurablePriorityAckStatement);
        }
        {
            String theSequenceDataType;
            theSequenceDataType = this.getSequenceDataType();
            strategy.appendField(locator, this, "sequenceDataType", buffer, theSequenceDataType);
        }
        {
            String theStringIdDataType;
            theStringIdDataType = this.getStringIdDataType();
            strategy.appendField(locator, this, "stringIdDataType", buffer, theStringIdDataType);
        }
        {
            String theTablePrefix;
            theTablePrefix = this.getTablePrefix();
            strategy.appendField(locator, this, "tablePrefix", buffer, theTablePrefix);
        }
        {
            String theUpdateDurableLastAckInTxStatement;
            theUpdateDurableLastAckInTxStatement = this.getUpdateDurableLastAckInTxStatement();
            strategy.appendField(locator, this, "updateDurableLastAckInTxStatement", buffer, theUpdateDurableLastAckInTxStatement);
        }
        {
            String theUpdateDurableLastAckStatement;
            theUpdateDurableLastAckStatement = this.getUpdateDurableLastAckStatement();
            strategy.appendField(locator, this, "updateDurableLastAckStatement", buffer, theUpdateDurableLastAckStatement);
        }
        {
            String theUpdateDurableLastAckWithPriorityInTxStatement;
            theUpdateDurableLastAckWithPriorityInTxStatement = this.getUpdateDurableLastAckWithPriorityInTxStatement();
            strategy.appendField(locator, this, "updateDurableLastAckWithPriorityInTxStatement", buffer, theUpdateDurableLastAckWithPriorityInTxStatement);
        }
        {
            String theUpdateDurableLastAckWithPriorityStatement;
            theUpdateDurableLastAckWithPriorityStatement = this.getUpdateDurableLastAckWithPriorityStatement();
            strategy.appendField(locator, this, "updateDurableLastAckWithPriorityStatement", buffer, theUpdateDurableLastAckWithPriorityStatement);
        }
        {
            String theUpdateLastPriorityAckRowOfDurableSubStatement;
            theUpdateLastPriorityAckRowOfDurableSubStatement = this.getUpdateLastPriorityAckRowOfDurableSubStatement();
            strategy.appendField(locator, this, "updateLastPriorityAckRowOfDurableSubStatement", buffer, theUpdateLastPriorityAckRowOfDurableSubStatement);
        }
        {
            String theUpdateMessageStatement;
            theUpdateMessageStatement = this.getUpdateMessageStatement();
            strategy.appendField(locator, this, "updateMessageStatement", buffer, theUpdateMessageStatement);
        }
        {
            String theUpdateXidFlagStatement;
            theUpdateXidFlagStatement = this.getUpdateXidFlagStatement();
            strategy.appendField(locator, this, "updateXidFlagStatement", buffer, theUpdateXidFlagStatement);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            strategy.appendField(locator, this, "useExternalMessageReferences", buffer, theUseExternalMessageReferences);
        }
        {
            Boolean theUseLockCreateWhereClause;
            theUseLockCreateWhereClause = this.isUseLockCreateWhereClause();
            strategy.appendField(locator, this, "useLockCreateWhereClause", buffer, theUseLockCreateWhereClause);
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
            List<Object> theCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements;
            theCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements = (((this.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements!= null)&&(!this.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements.isEmpty()))?this.getCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements", theCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements), currentHashCode, theCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements);
        }
        {
            String theAddMessageStatement;
            theAddMessageStatement = this.getAddMessageStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addMessageStatement", theAddMessageStatement), currentHashCode, theAddMessageStatement);
        }
        {
            String theBinaryDataType;
            theBinaryDataType = this.getBinaryDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "binaryDataType", theBinaryDataType), currentHashCode, theBinaryDataType);
        }
        {
            String theClearDurableLastAckInTxStatement;
            theClearDurableLastAckInTxStatement = this.getClearDurableLastAckInTxStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clearDurableLastAckInTxStatement", theClearDurableLastAckInTxStatement), currentHashCode, theClearDurableLastAckInTxStatement);
        }
        {
            String theClearXidFlagStatement;
            theClearXidFlagStatement = this.getClearXidFlagStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clearXidFlagStatement", theClearXidFlagStatement), currentHashCode, theClearXidFlagStatement);
        }
        {
            String theContainerNameDataType;
            theContainerNameDataType = this.getContainerNameDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerNameDataType", theContainerNameDataType), currentHashCode, theContainerNameDataType);
        }
        {
            String theCreateDurableSubStatement;
            theCreateDurableSubStatement = this.getCreateDurableSubStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createDurableSubStatement", theCreateDurableSubStatement), currentHashCode, theCreateDurableSubStatement);
        }
        {
            String theCurrentDateTimeStatement;
            theCurrentDateTimeStatement = this.getCurrentDateTimeStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentDateTimeStatement", theCurrentDateTimeStatement), currentHashCode, theCurrentDateTimeStatement);
        }
        {
            String theDeleteOldMessagesStatementWithPriority;
            theDeleteOldMessagesStatementWithPriority = this.getDeleteOldMessagesStatementWithPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deleteOldMessagesStatementWithPriority", theDeleteOldMessagesStatementWithPriority), currentHashCode, theDeleteOldMessagesStatementWithPriority);
        }
        {
            String theDeleteSubscriptionStatement;
            theDeleteSubscriptionStatement = this.getDeleteSubscriptionStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deleteSubscriptionStatement", theDeleteSubscriptionStatement), currentHashCode, theDeleteSubscriptionStatement);
        }
        {
            String theDestinationMessageCountStatement;
            theDestinationMessageCountStatement = this.getDestinationMessageCountStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destinationMessageCountStatement", theDestinationMessageCountStatement), currentHashCode, theDestinationMessageCountStatement);
        }
        {
            String theDropAckPKAlterStatementEnd;
            theDropAckPKAlterStatementEnd = this.getDropAckPKAlterStatementEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dropAckPKAlterStatementEnd", theDropAckPKAlterStatementEnd), currentHashCode, theDropAckPKAlterStatementEnd);
        }
        {
            String theDurableSubAcksTableName;
            theDurableSubAcksTableName = this.getDurableSubAcksTableName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durableSubAcksTableName", theDurableSubAcksTableName), currentHashCode, theDurableSubAcksTableName);
        }
        {
            String theDurableSubscriberMessageCountStatement;
            theDurableSubscriberMessageCountStatement = this.getDurableSubscriberMessageCountStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durableSubscriberMessageCountStatement", theDurableSubscriberMessageCountStatement), currentHashCode, theDurableSubscriberMessageCountStatement);
        }
        {
            String theDurableSubscriberMessageCountStatementWithPriority;
            theDurableSubscriberMessageCountStatementWithPriority = this.getDurableSubscriberMessageCountStatementWithPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durableSubscriberMessageCountStatementWithPriority", theDurableSubscriberMessageCountStatementWithPriority), currentHashCode, theDurableSubscriberMessageCountStatementWithPriority);
        }
        {
            String theFindAcksPendingOutcomeStatement;
            theFindAcksPendingOutcomeStatement = this.getFindAcksPendingOutcomeStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findAcksPendingOutcomeStatement", theFindAcksPendingOutcomeStatement), currentHashCode, theFindAcksPendingOutcomeStatement);
        }
        {
            String theFindAllDestinationsStatement;
            theFindAllDestinationsStatement = this.getFindAllDestinationsStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findAllDestinationsStatement", theFindAllDestinationsStatement), currentHashCode, theFindAllDestinationsStatement);
        }
        {
            String theFindAllDurableSubMessagesStatement;
            theFindAllDurableSubMessagesStatement = this.getFindAllDurableSubMessagesStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findAllDurableSubMessagesStatement", theFindAllDurableSubMessagesStatement), currentHashCode, theFindAllDurableSubMessagesStatement);
        }
        {
            String theFindAllDurableSubsStatement;
            theFindAllDurableSubsStatement = this.getFindAllDurableSubsStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findAllDurableSubsStatement", theFindAllDurableSubsStatement), currentHashCode, theFindAllDurableSubsStatement);
        }
        {
            String theFindAllMessageIdsStatement;
            theFindAllMessageIdsStatement = this.getFindAllMessageIdsStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findAllMessageIdsStatement", theFindAllMessageIdsStatement), currentHashCode, theFindAllMessageIdsStatement);
        }
        {
            String theFindAllMessagesStatement;
            theFindAllMessagesStatement = this.getFindAllMessagesStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findAllMessagesStatement", theFindAllMessagesStatement), currentHashCode, theFindAllMessagesStatement);
        }
        {
            String theFindDurableSubMessagesStatement;
            theFindDurableSubMessagesStatement = this.getFindDurableSubMessagesStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findDurableSubMessagesStatement", theFindDurableSubMessagesStatement), currentHashCode, theFindDurableSubMessagesStatement);
        }
        {
            String theFindDurableSubStatement;
            theFindDurableSubStatement = this.getFindDurableSubStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findDurableSubStatement", theFindDurableSubStatement), currentHashCode, theFindDurableSubStatement);
        }
        {
            String theFindLastSequenceIdInAcksStatement;
            theFindLastSequenceIdInAcksStatement = this.getFindLastSequenceIdInAcksStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findLastSequenceIdInAcksStatement", theFindLastSequenceIdInAcksStatement), currentHashCode, theFindLastSequenceIdInAcksStatement);
        }
        {
            String theFindLastSequenceIdInMsgsStatement;
            theFindLastSequenceIdInMsgsStatement = this.getFindLastSequenceIdInMsgsStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findLastSequenceIdInMsgsStatement", theFindLastSequenceIdInMsgsStatement), currentHashCode, theFindLastSequenceIdInMsgsStatement);
        }
        {
            String theFindMessageByIdStatement;
            theFindMessageByIdStatement = this.getFindMessageByIdStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findMessageByIdStatement", theFindMessageByIdStatement), currentHashCode, theFindMessageByIdStatement);
        }
        {
            String theFindMessageSequenceIdStatement;
            theFindMessageSequenceIdStatement = this.getFindMessageSequenceIdStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findMessageSequenceIdStatement", theFindMessageSequenceIdStatement), currentHashCode, theFindMessageSequenceIdStatement);
        }
        {
            String theFindMessageStatement;
            theFindMessageStatement = this.getFindMessageStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findMessageStatement", theFindMessageStatement), currentHashCode, theFindMessageStatement);
        }
        {
            String theFindNextMessagesByPriorityStatement;
            theFindNextMessagesByPriorityStatement = this.getFindNextMessagesByPriorityStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findNextMessagesByPriorityStatement", theFindNextMessagesByPriorityStatement), currentHashCode, theFindNextMessagesByPriorityStatement);
        }
        {
            String theFindNextMessagesStatement;
            theFindNextMessagesStatement = this.getFindNextMessagesStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findNextMessagesStatement", theFindNextMessagesStatement), currentHashCode, theFindNextMessagesStatement);
        }
        {
            String theFindOpsPendingOutcomeStatement;
            theFindOpsPendingOutcomeStatement = this.getFindOpsPendingOutcomeStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findOpsPendingOutcomeStatement", theFindOpsPendingOutcomeStatement), currentHashCode, theFindOpsPendingOutcomeStatement);
        }
        {
            String theFindXidByIdStatement;
            theFindXidByIdStatement = this.getFindXidByIdStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "findXidByIdStatement", theFindXidByIdStatement), currentHashCode, theFindXidByIdStatement);
        }
        {
            String theInsertDurablePriorityAckStatement;
            theInsertDurablePriorityAckStatement = this.getInsertDurablePriorityAckStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insertDurablePriorityAckStatement", theInsertDurablePriorityAckStatement), currentHashCode, theInsertDurablePriorityAckStatement);
        }
        {
            String theLastAckedDurableSubscriberMessageStatement;
            theLastAckedDurableSubscriberMessageStatement = this.getLastAckedDurableSubscriberMessageStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastAckedDurableSubscriberMessageStatement", theLastAckedDurableSubscriberMessageStatement), currentHashCode, theLastAckedDurableSubscriberMessageStatement);
        }
        {
            String theLastProducerSequenceIdStatement;
            theLastProducerSequenceIdStatement = this.getLastProducerSequenceIdStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastProducerSequenceIdStatement", theLastProducerSequenceIdStatement), currentHashCode, theLastProducerSequenceIdStatement);
        }
        {
            String theLeaseObtainStatement;
            theLeaseObtainStatement = this.getLeaseObtainStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseObtainStatement", theLeaseObtainStatement), currentHashCode, theLeaseObtainStatement);
        }
        {
            String theLeaseOwnerStatement;
            theLeaseOwnerStatement = this.getLeaseOwnerStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseOwnerStatement", theLeaseOwnerStatement), currentHashCode, theLeaseOwnerStatement);
        }
        {
            String theLeaseUpdateStatement;
            theLeaseUpdateStatement = this.getLeaseUpdateStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseUpdateStatement", theLeaseUpdateStatement), currentHashCode, theLeaseUpdateStatement);
        }
        {
            String theLockCreateStatement;
            theLockCreateStatement = this.getLockCreateStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockCreateStatement", theLockCreateStatement), currentHashCode, theLockCreateStatement);
        }
        {
            String theLockTableName;
            theLockTableName = this.getLockTableName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockTableName", theLockTableName), currentHashCode, theLockTableName);
        }
        {
            String theLockUpdateStatement;
            theLockUpdateStatement = this.getLockUpdateStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lockUpdateStatement", theLockUpdateStatement), currentHashCode, theLockUpdateStatement);
        }
        {
            String theLongDataType;
            theLongDataType = this.getLongDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longDataType", theLongDataType), currentHashCode, theLongDataType);
        }
        {
            String theMessageTableName;
            theMessageTableName = this.getMessageTableName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageTableName", theMessageTableName), currentHashCode, theMessageTableName);
        }
        {
            String theMsgIdDataType;
            theMsgIdDataType = this.getMsgIdDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgIdDataType", theMsgIdDataType), currentHashCode, theMsgIdDataType);
        }
        {
            String theNextDurableSubscriberMessageStatement;
            theNextDurableSubscriberMessageStatement = this.getNextDurableSubscriberMessageStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nextDurableSubscriberMessageStatement", theNextDurableSubscriberMessageStatement), currentHashCode, theNextDurableSubscriberMessageStatement);
        }
        {
            String theRemoveAllMessagesStatement;
            theRemoveAllMessagesStatement = this.getRemoveAllMessagesStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "removeAllMessagesStatement", theRemoveAllMessagesStatement), currentHashCode, theRemoveAllMessagesStatement);
        }
        {
            String theRemoveAllSubscriptionsStatement;
            theRemoveAllSubscriptionsStatement = this.getRemoveAllSubscriptionsStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "removeAllSubscriptionsStatement", theRemoveAllSubscriptionsStatement), currentHashCode, theRemoveAllSubscriptionsStatement);
        }
        {
            String theRemoveMessageStatment;
            theRemoveMessageStatment = this.getRemoveMessageStatment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "removeMessageStatment", theRemoveMessageStatment), currentHashCode, theRemoveMessageStatment);
        }
        {
            String theSelectDurablePriorityAckStatement;
            theSelectDurablePriorityAckStatement = this.getSelectDurablePriorityAckStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectDurablePriorityAckStatement", theSelectDurablePriorityAckStatement), currentHashCode, theSelectDurablePriorityAckStatement);
        }
        {
            String theSequenceDataType;
            theSequenceDataType = this.getSequenceDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceDataType", theSequenceDataType), currentHashCode, theSequenceDataType);
        }
        {
            String theStringIdDataType;
            theStringIdDataType = this.getStringIdDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stringIdDataType", theStringIdDataType), currentHashCode, theStringIdDataType);
        }
        {
            String theTablePrefix;
            theTablePrefix = this.getTablePrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tablePrefix", theTablePrefix), currentHashCode, theTablePrefix);
        }
        {
            String theUpdateDurableLastAckInTxStatement;
            theUpdateDurableLastAckInTxStatement = this.getUpdateDurableLastAckInTxStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateDurableLastAckInTxStatement", theUpdateDurableLastAckInTxStatement), currentHashCode, theUpdateDurableLastAckInTxStatement);
        }
        {
            String theUpdateDurableLastAckStatement;
            theUpdateDurableLastAckStatement = this.getUpdateDurableLastAckStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateDurableLastAckStatement", theUpdateDurableLastAckStatement), currentHashCode, theUpdateDurableLastAckStatement);
        }
        {
            String theUpdateDurableLastAckWithPriorityInTxStatement;
            theUpdateDurableLastAckWithPriorityInTxStatement = this.getUpdateDurableLastAckWithPriorityInTxStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateDurableLastAckWithPriorityInTxStatement", theUpdateDurableLastAckWithPriorityInTxStatement), currentHashCode, theUpdateDurableLastAckWithPriorityInTxStatement);
        }
        {
            String theUpdateDurableLastAckWithPriorityStatement;
            theUpdateDurableLastAckWithPriorityStatement = this.getUpdateDurableLastAckWithPriorityStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateDurableLastAckWithPriorityStatement", theUpdateDurableLastAckWithPriorityStatement), currentHashCode, theUpdateDurableLastAckWithPriorityStatement);
        }
        {
            String theUpdateLastPriorityAckRowOfDurableSubStatement;
            theUpdateLastPriorityAckRowOfDurableSubStatement = this.getUpdateLastPriorityAckRowOfDurableSubStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateLastPriorityAckRowOfDurableSubStatement", theUpdateLastPriorityAckRowOfDurableSubStatement), currentHashCode, theUpdateLastPriorityAckRowOfDurableSubStatement);
        }
        {
            String theUpdateMessageStatement;
            theUpdateMessageStatement = this.getUpdateMessageStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateMessageStatement", theUpdateMessageStatement), currentHashCode, theUpdateMessageStatement);
        }
        {
            String theUpdateXidFlagStatement;
            theUpdateXidFlagStatement = this.getUpdateXidFlagStatement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateXidFlagStatement", theUpdateXidFlagStatement), currentHashCode, theUpdateXidFlagStatement);
        }
        {
            Boolean theUseExternalMessageReferences;
            theUseExternalMessageReferences = this.isUseExternalMessageReferences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useExternalMessageReferences", theUseExternalMessageReferences), currentHashCode, theUseExternalMessageReferences);
        }
        {
            Boolean theUseLockCreateWhereClause;
            theUseLockCreateWhereClause = this.isUseLockCreateWhereClause();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLockCreateWhereClause", theUseLockCreateWhereClause), currentHashCode, theUseLockCreateWhereClause);
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
        if (!(object instanceof DtoStatements)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoStatements that = ((DtoStatements) object);
        {
            List<Object> lhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements;
            lhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements = (((this.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements!= null)&&(!this.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements.isEmpty()))?this.getCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements():null);
            List<Object> rhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements;
            rhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements = (((that.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements!= null)&&(!that.createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements.isEmpty()))?that.getCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements", lhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements), LocatorUtils.property(thatLocator, "createLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements", rhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements), lhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements, rhsCreateLockSchemaStatementsOrCreateSchemaStatementsOrDropSchemaStatements)) {
                return false;
            }
        }
        {
            String lhsAddMessageStatement;
            lhsAddMessageStatement = this.getAddMessageStatement();
            String rhsAddMessageStatement;
            rhsAddMessageStatement = that.getAddMessageStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addMessageStatement", lhsAddMessageStatement), LocatorUtils.property(thatLocator, "addMessageStatement", rhsAddMessageStatement), lhsAddMessageStatement, rhsAddMessageStatement)) {
                return false;
            }
        }
        {
            String lhsBinaryDataType;
            lhsBinaryDataType = this.getBinaryDataType();
            String rhsBinaryDataType;
            rhsBinaryDataType = that.getBinaryDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "binaryDataType", lhsBinaryDataType), LocatorUtils.property(thatLocator, "binaryDataType", rhsBinaryDataType), lhsBinaryDataType, rhsBinaryDataType)) {
                return false;
            }
        }
        {
            String lhsClearDurableLastAckInTxStatement;
            lhsClearDurableLastAckInTxStatement = this.getClearDurableLastAckInTxStatement();
            String rhsClearDurableLastAckInTxStatement;
            rhsClearDurableLastAckInTxStatement = that.getClearDurableLastAckInTxStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clearDurableLastAckInTxStatement", lhsClearDurableLastAckInTxStatement), LocatorUtils.property(thatLocator, "clearDurableLastAckInTxStatement", rhsClearDurableLastAckInTxStatement), lhsClearDurableLastAckInTxStatement, rhsClearDurableLastAckInTxStatement)) {
                return false;
            }
        }
        {
            String lhsClearXidFlagStatement;
            lhsClearXidFlagStatement = this.getClearXidFlagStatement();
            String rhsClearXidFlagStatement;
            rhsClearXidFlagStatement = that.getClearXidFlagStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clearXidFlagStatement", lhsClearXidFlagStatement), LocatorUtils.property(thatLocator, "clearXidFlagStatement", rhsClearXidFlagStatement), lhsClearXidFlagStatement, rhsClearXidFlagStatement)) {
                return false;
            }
        }
        {
            String lhsContainerNameDataType;
            lhsContainerNameDataType = this.getContainerNameDataType();
            String rhsContainerNameDataType;
            rhsContainerNameDataType = that.getContainerNameDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerNameDataType", lhsContainerNameDataType), LocatorUtils.property(thatLocator, "containerNameDataType", rhsContainerNameDataType), lhsContainerNameDataType, rhsContainerNameDataType)) {
                return false;
            }
        }
        {
            String lhsCreateDurableSubStatement;
            lhsCreateDurableSubStatement = this.getCreateDurableSubStatement();
            String rhsCreateDurableSubStatement;
            rhsCreateDurableSubStatement = that.getCreateDurableSubStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createDurableSubStatement", lhsCreateDurableSubStatement), LocatorUtils.property(thatLocator, "createDurableSubStatement", rhsCreateDurableSubStatement), lhsCreateDurableSubStatement, rhsCreateDurableSubStatement)) {
                return false;
            }
        }
        {
            String lhsCurrentDateTimeStatement;
            lhsCurrentDateTimeStatement = this.getCurrentDateTimeStatement();
            String rhsCurrentDateTimeStatement;
            rhsCurrentDateTimeStatement = that.getCurrentDateTimeStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentDateTimeStatement", lhsCurrentDateTimeStatement), LocatorUtils.property(thatLocator, "currentDateTimeStatement", rhsCurrentDateTimeStatement), lhsCurrentDateTimeStatement, rhsCurrentDateTimeStatement)) {
                return false;
            }
        }
        {
            String lhsDeleteOldMessagesStatementWithPriority;
            lhsDeleteOldMessagesStatementWithPriority = this.getDeleteOldMessagesStatementWithPriority();
            String rhsDeleteOldMessagesStatementWithPriority;
            rhsDeleteOldMessagesStatementWithPriority = that.getDeleteOldMessagesStatementWithPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deleteOldMessagesStatementWithPriority", lhsDeleteOldMessagesStatementWithPriority), LocatorUtils.property(thatLocator, "deleteOldMessagesStatementWithPriority", rhsDeleteOldMessagesStatementWithPriority), lhsDeleteOldMessagesStatementWithPriority, rhsDeleteOldMessagesStatementWithPriority)) {
                return false;
            }
        }
        {
            String lhsDeleteSubscriptionStatement;
            lhsDeleteSubscriptionStatement = this.getDeleteSubscriptionStatement();
            String rhsDeleteSubscriptionStatement;
            rhsDeleteSubscriptionStatement = that.getDeleteSubscriptionStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deleteSubscriptionStatement", lhsDeleteSubscriptionStatement), LocatorUtils.property(thatLocator, "deleteSubscriptionStatement", rhsDeleteSubscriptionStatement), lhsDeleteSubscriptionStatement, rhsDeleteSubscriptionStatement)) {
                return false;
            }
        }
        {
            String lhsDestinationMessageCountStatement;
            lhsDestinationMessageCountStatement = this.getDestinationMessageCountStatement();
            String rhsDestinationMessageCountStatement;
            rhsDestinationMessageCountStatement = that.getDestinationMessageCountStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destinationMessageCountStatement", lhsDestinationMessageCountStatement), LocatorUtils.property(thatLocator, "destinationMessageCountStatement", rhsDestinationMessageCountStatement), lhsDestinationMessageCountStatement, rhsDestinationMessageCountStatement)) {
                return false;
            }
        }
        {
            String lhsDropAckPKAlterStatementEnd;
            lhsDropAckPKAlterStatementEnd = this.getDropAckPKAlterStatementEnd();
            String rhsDropAckPKAlterStatementEnd;
            rhsDropAckPKAlterStatementEnd = that.getDropAckPKAlterStatementEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dropAckPKAlterStatementEnd", lhsDropAckPKAlterStatementEnd), LocatorUtils.property(thatLocator, "dropAckPKAlterStatementEnd", rhsDropAckPKAlterStatementEnd), lhsDropAckPKAlterStatementEnd, rhsDropAckPKAlterStatementEnd)) {
                return false;
            }
        }
        {
            String lhsDurableSubAcksTableName;
            lhsDurableSubAcksTableName = this.getDurableSubAcksTableName();
            String rhsDurableSubAcksTableName;
            rhsDurableSubAcksTableName = that.getDurableSubAcksTableName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durableSubAcksTableName", lhsDurableSubAcksTableName), LocatorUtils.property(thatLocator, "durableSubAcksTableName", rhsDurableSubAcksTableName), lhsDurableSubAcksTableName, rhsDurableSubAcksTableName)) {
                return false;
            }
        }
        {
            String lhsDurableSubscriberMessageCountStatement;
            lhsDurableSubscriberMessageCountStatement = this.getDurableSubscriberMessageCountStatement();
            String rhsDurableSubscriberMessageCountStatement;
            rhsDurableSubscriberMessageCountStatement = that.getDurableSubscriberMessageCountStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durableSubscriberMessageCountStatement", lhsDurableSubscriberMessageCountStatement), LocatorUtils.property(thatLocator, "durableSubscriberMessageCountStatement", rhsDurableSubscriberMessageCountStatement), lhsDurableSubscriberMessageCountStatement, rhsDurableSubscriberMessageCountStatement)) {
                return false;
            }
        }
        {
            String lhsDurableSubscriberMessageCountStatementWithPriority;
            lhsDurableSubscriberMessageCountStatementWithPriority = this.getDurableSubscriberMessageCountStatementWithPriority();
            String rhsDurableSubscriberMessageCountStatementWithPriority;
            rhsDurableSubscriberMessageCountStatementWithPriority = that.getDurableSubscriberMessageCountStatementWithPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durableSubscriberMessageCountStatementWithPriority", lhsDurableSubscriberMessageCountStatementWithPriority), LocatorUtils.property(thatLocator, "durableSubscriberMessageCountStatementWithPriority", rhsDurableSubscriberMessageCountStatementWithPriority), lhsDurableSubscriberMessageCountStatementWithPriority, rhsDurableSubscriberMessageCountStatementWithPriority)) {
                return false;
            }
        }
        {
            String lhsFindAcksPendingOutcomeStatement;
            lhsFindAcksPendingOutcomeStatement = this.getFindAcksPendingOutcomeStatement();
            String rhsFindAcksPendingOutcomeStatement;
            rhsFindAcksPendingOutcomeStatement = that.getFindAcksPendingOutcomeStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findAcksPendingOutcomeStatement", lhsFindAcksPendingOutcomeStatement), LocatorUtils.property(thatLocator, "findAcksPendingOutcomeStatement", rhsFindAcksPendingOutcomeStatement), lhsFindAcksPendingOutcomeStatement, rhsFindAcksPendingOutcomeStatement)) {
                return false;
            }
        }
        {
            String lhsFindAllDestinationsStatement;
            lhsFindAllDestinationsStatement = this.getFindAllDestinationsStatement();
            String rhsFindAllDestinationsStatement;
            rhsFindAllDestinationsStatement = that.getFindAllDestinationsStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findAllDestinationsStatement", lhsFindAllDestinationsStatement), LocatorUtils.property(thatLocator, "findAllDestinationsStatement", rhsFindAllDestinationsStatement), lhsFindAllDestinationsStatement, rhsFindAllDestinationsStatement)) {
                return false;
            }
        }
        {
            String lhsFindAllDurableSubMessagesStatement;
            lhsFindAllDurableSubMessagesStatement = this.getFindAllDurableSubMessagesStatement();
            String rhsFindAllDurableSubMessagesStatement;
            rhsFindAllDurableSubMessagesStatement = that.getFindAllDurableSubMessagesStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findAllDurableSubMessagesStatement", lhsFindAllDurableSubMessagesStatement), LocatorUtils.property(thatLocator, "findAllDurableSubMessagesStatement", rhsFindAllDurableSubMessagesStatement), lhsFindAllDurableSubMessagesStatement, rhsFindAllDurableSubMessagesStatement)) {
                return false;
            }
        }
        {
            String lhsFindAllDurableSubsStatement;
            lhsFindAllDurableSubsStatement = this.getFindAllDurableSubsStatement();
            String rhsFindAllDurableSubsStatement;
            rhsFindAllDurableSubsStatement = that.getFindAllDurableSubsStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findAllDurableSubsStatement", lhsFindAllDurableSubsStatement), LocatorUtils.property(thatLocator, "findAllDurableSubsStatement", rhsFindAllDurableSubsStatement), lhsFindAllDurableSubsStatement, rhsFindAllDurableSubsStatement)) {
                return false;
            }
        }
        {
            String lhsFindAllMessageIdsStatement;
            lhsFindAllMessageIdsStatement = this.getFindAllMessageIdsStatement();
            String rhsFindAllMessageIdsStatement;
            rhsFindAllMessageIdsStatement = that.getFindAllMessageIdsStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findAllMessageIdsStatement", lhsFindAllMessageIdsStatement), LocatorUtils.property(thatLocator, "findAllMessageIdsStatement", rhsFindAllMessageIdsStatement), lhsFindAllMessageIdsStatement, rhsFindAllMessageIdsStatement)) {
                return false;
            }
        }
        {
            String lhsFindAllMessagesStatement;
            lhsFindAllMessagesStatement = this.getFindAllMessagesStatement();
            String rhsFindAllMessagesStatement;
            rhsFindAllMessagesStatement = that.getFindAllMessagesStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findAllMessagesStatement", lhsFindAllMessagesStatement), LocatorUtils.property(thatLocator, "findAllMessagesStatement", rhsFindAllMessagesStatement), lhsFindAllMessagesStatement, rhsFindAllMessagesStatement)) {
                return false;
            }
        }
        {
            String lhsFindDurableSubMessagesStatement;
            lhsFindDurableSubMessagesStatement = this.getFindDurableSubMessagesStatement();
            String rhsFindDurableSubMessagesStatement;
            rhsFindDurableSubMessagesStatement = that.getFindDurableSubMessagesStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findDurableSubMessagesStatement", lhsFindDurableSubMessagesStatement), LocatorUtils.property(thatLocator, "findDurableSubMessagesStatement", rhsFindDurableSubMessagesStatement), lhsFindDurableSubMessagesStatement, rhsFindDurableSubMessagesStatement)) {
                return false;
            }
        }
        {
            String lhsFindDurableSubStatement;
            lhsFindDurableSubStatement = this.getFindDurableSubStatement();
            String rhsFindDurableSubStatement;
            rhsFindDurableSubStatement = that.getFindDurableSubStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findDurableSubStatement", lhsFindDurableSubStatement), LocatorUtils.property(thatLocator, "findDurableSubStatement", rhsFindDurableSubStatement), lhsFindDurableSubStatement, rhsFindDurableSubStatement)) {
                return false;
            }
        }
        {
            String lhsFindLastSequenceIdInAcksStatement;
            lhsFindLastSequenceIdInAcksStatement = this.getFindLastSequenceIdInAcksStatement();
            String rhsFindLastSequenceIdInAcksStatement;
            rhsFindLastSequenceIdInAcksStatement = that.getFindLastSequenceIdInAcksStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findLastSequenceIdInAcksStatement", lhsFindLastSequenceIdInAcksStatement), LocatorUtils.property(thatLocator, "findLastSequenceIdInAcksStatement", rhsFindLastSequenceIdInAcksStatement), lhsFindLastSequenceIdInAcksStatement, rhsFindLastSequenceIdInAcksStatement)) {
                return false;
            }
        }
        {
            String lhsFindLastSequenceIdInMsgsStatement;
            lhsFindLastSequenceIdInMsgsStatement = this.getFindLastSequenceIdInMsgsStatement();
            String rhsFindLastSequenceIdInMsgsStatement;
            rhsFindLastSequenceIdInMsgsStatement = that.getFindLastSequenceIdInMsgsStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findLastSequenceIdInMsgsStatement", lhsFindLastSequenceIdInMsgsStatement), LocatorUtils.property(thatLocator, "findLastSequenceIdInMsgsStatement", rhsFindLastSequenceIdInMsgsStatement), lhsFindLastSequenceIdInMsgsStatement, rhsFindLastSequenceIdInMsgsStatement)) {
                return false;
            }
        }
        {
            String lhsFindMessageByIdStatement;
            lhsFindMessageByIdStatement = this.getFindMessageByIdStatement();
            String rhsFindMessageByIdStatement;
            rhsFindMessageByIdStatement = that.getFindMessageByIdStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findMessageByIdStatement", lhsFindMessageByIdStatement), LocatorUtils.property(thatLocator, "findMessageByIdStatement", rhsFindMessageByIdStatement), lhsFindMessageByIdStatement, rhsFindMessageByIdStatement)) {
                return false;
            }
        }
        {
            String lhsFindMessageSequenceIdStatement;
            lhsFindMessageSequenceIdStatement = this.getFindMessageSequenceIdStatement();
            String rhsFindMessageSequenceIdStatement;
            rhsFindMessageSequenceIdStatement = that.getFindMessageSequenceIdStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findMessageSequenceIdStatement", lhsFindMessageSequenceIdStatement), LocatorUtils.property(thatLocator, "findMessageSequenceIdStatement", rhsFindMessageSequenceIdStatement), lhsFindMessageSequenceIdStatement, rhsFindMessageSequenceIdStatement)) {
                return false;
            }
        }
        {
            String lhsFindMessageStatement;
            lhsFindMessageStatement = this.getFindMessageStatement();
            String rhsFindMessageStatement;
            rhsFindMessageStatement = that.getFindMessageStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findMessageStatement", lhsFindMessageStatement), LocatorUtils.property(thatLocator, "findMessageStatement", rhsFindMessageStatement), lhsFindMessageStatement, rhsFindMessageStatement)) {
                return false;
            }
        }
        {
            String lhsFindNextMessagesByPriorityStatement;
            lhsFindNextMessagesByPriorityStatement = this.getFindNextMessagesByPriorityStatement();
            String rhsFindNextMessagesByPriorityStatement;
            rhsFindNextMessagesByPriorityStatement = that.getFindNextMessagesByPriorityStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findNextMessagesByPriorityStatement", lhsFindNextMessagesByPriorityStatement), LocatorUtils.property(thatLocator, "findNextMessagesByPriorityStatement", rhsFindNextMessagesByPriorityStatement), lhsFindNextMessagesByPriorityStatement, rhsFindNextMessagesByPriorityStatement)) {
                return false;
            }
        }
        {
            String lhsFindNextMessagesStatement;
            lhsFindNextMessagesStatement = this.getFindNextMessagesStatement();
            String rhsFindNextMessagesStatement;
            rhsFindNextMessagesStatement = that.getFindNextMessagesStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findNextMessagesStatement", lhsFindNextMessagesStatement), LocatorUtils.property(thatLocator, "findNextMessagesStatement", rhsFindNextMessagesStatement), lhsFindNextMessagesStatement, rhsFindNextMessagesStatement)) {
                return false;
            }
        }
        {
            String lhsFindOpsPendingOutcomeStatement;
            lhsFindOpsPendingOutcomeStatement = this.getFindOpsPendingOutcomeStatement();
            String rhsFindOpsPendingOutcomeStatement;
            rhsFindOpsPendingOutcomeStatement = that.getFindOpsPendingOutcomeStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findOpsPendingOutcomeStatement", lhsFindOpsPendingOutcomeStatement), LocatorUtils.property(thatLocator, "findOpsPendingOutcomeStatement", rhsFindOpsPendingOutcomeStatement), lhsFindOpsPendingOutcomeStatement, rhsFindOpsPendingOutcomeStatement)) {
                return false;
            }
        }
        {
            String lhsFindXidByIdStatement;
            lhsFindXidByIdStatement = this.getFindXidByIdStatement();
            String rhsFindXidByIdStatement;
            rhsFindXidByIdStatement = that.getFindXidByIdStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "findXidByIdStatement", lhsFindXidByIdStatement), LocatorUtils.property(thatLocator, "findXidByIdStatement", rhsFindXidByIdStatement), lhsFindXidByIdStatement, rhsFindXidByIdStatement)) {
                return false;
            }
        }
        {
            String lhsInsertDurablePriorityAckStatement;
            lhsInsertDurablePriorityAckStatement = this.getInsertDurablePriorityAckStatement();
            String rhsInsertDurablePriorityAckStatement;
            rhsInsertDurablePriorityAckStatement = that.getInsertDurablePriorityAckStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insertDurablePriorityAckStatement", lhsInsertDurablePriorityAckStatement), LocatorUtils.property(thatLocator, "insertDurablePriorityAckStatement", rhsInsertDurablePriorityAckStatement), lhsInsertDurablePriorityAckStatement, rhsInsertDurablePriorityAckStatement)) {
                return false;
            }
        }
        {
            String lhsLastAckedDurableSubscriberMessageStatement;
            lhsLastAckedDurableSubscriberMessageStatement = this.getLastAckedDurableSubscriberMessageStatement();
            String rhsLastAckedDurableSubscriberMessageStatement;
            rhsLastAckedDurableSubscriberMessageStatement = that.getLastAckedDurableSubscriberMessageStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastAckedDurableSubscriberMessageStatement", lhsLastAckedDurableSubscriberMessageStatement), LocatorUtils.property(thatLocator, "lastAckedDurableSubscriberMessageStatement", rhsLastAckedDurableSubscriberMessageStatement), lhsLastAckedDurableSubscriberMessageStatement, rhsLastAckedDurableSubscriberMessageStatement)) {
                return false;
            }
        }
        {
            String lhsLastProducerSequenceIdStatement;
            lhsLastProducerSequenceIdStatement = this.getLastProducerSequenceIdStatement();
            String rhsLastProducerSequenceIdStatement;
            rhsLastProducerSequenceIdStatement = that.getLastProducerSequenceIdStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastProducerSequenceIdStatement", lhsLastProducerSequenceIdStatement), LocatorUtils.property(thatLocator, "lastProducerSequenceIdStatement", rhsLastProducerSequenceIdStatement), lhsLastProducerSequenceIdStatement, rhsLastProducerSequenceIdStatement)) {
                return false;
            }
        }
        {
            String lhsLeaseObtainStatement;
            lhsLeaseObtainStatement = this.getLeaseObtainStatement();
            String rhsLeaseObtainStatement;
            rhsLeaseObtainStatement = that.getLeaseObtainStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseObtainStatement", lhsLeaseObtainStatement), LocatorUtils.property(thatLocator, "leaseObtainStatement", rhsLeaseObtainStatement), lhsLeaseObtainStatement, rhsLeaseObtainStatement)) {
                return false;
            }
        }
        {
            String lhsLeaseOwnerStatement;
            lhsLeaseOwnerStatement = this.getLeaseOwnerStatement();
            String rhsLeaseOwnerStatement;
            rhsLeaseOwnerStatement = that.getLeaseOwnerStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseOwnerStatement", lhsLeaseOwnerStatement), LocatorUtils.property(thatLocator, "leaseOwnerStatement", rhsLeaseOwnerStatement), lhsLeaseOwnerStatement, rhsLeaseOwnerStatement)) {
                return false;
            }
        }
        {
            String lhsLeaseUpdateStatement;
            lhsLeaseUpdateStatement = this.getLeaseUpdateStatement();
            String rhsLeaseUpdateStatement;
            rhsLeaseUpdateStatement = that.getLeaseUpdateStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseUpdateStatement", lhsLeaseUpdateStatement), LocatorUtils.property(thatLocator, "leaseUpdateStatement", rhsLeaseUpdateStatement), lhsLeaseUpdateStatement, rhsLeaseUpdateStatement)) {
                return false;
            }
        }
        {
            String lhsLockCreateStatement;
            lhsLockCreateStatement = this.getLockCreateStatement();
            String rhsLockCreateStatement;
            rhsLockCreateStatement = that.getLockCreateStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockCreateStatement", lhsLockCreateStatement), LocatorUtils.property(thatLocator, "lockCreateStatement", rhsLockCreateStatement), lhsLockCreateStatement, rhsLockCreateStatement)) {
                return false;
            }
        }
        {
            String lhsLockTableName;
            lhsLockTableName = this.getLockTableName();
            String rhsLockTableName;
            rhsLockTableName = that.getLockTableName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockTableName", lhsLockTableName), LocatorUtils.property(thatLocator, "lockTableName", rhsLockTableName), lhsLockTableName, rhsLockTableName)) {
                return false;
            }
        }
        {
            String lhsLockUpdateStatement;
            lhsLockUpdateStatement = this.getLockUpdateStatement();
            String rhsLockUpdateStatement;
            rhsLockUpdateStatement = that.getLockUpdateStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lockUpdateStatement", lhsLockUpdateStatement), LocatorUtils.property(thatLocator, "lockUpdateStatement", rhsLockUpdateStatement), lhsLockUpdateStatement, rhsLockUpdateStatement)) {
                return false;
            }
        }
        {
            String lhsLongDataType;
            lhsLongDataType = this.getLongDataType();
            String rhsLongDataType;
            rhsLongDataType = that.getLongDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longDataType", lhsLongDataType), LocatorUtils.property(thatLocator, "longDataType", rhsLongDataType), lhsLongDataType, rhsLongDataType)) {
                return false;
            }
        }
        {
            String lhsMessageTableName;
            lhsMessageTableName = this.getMessageTableName();
            String rhsMessageTableName;
            rhsMessageTableName = that.getMessageTableName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageTableName", lhsMessageTableName), LocatorUtils.property(thatLocator, "messageTableName", rhsMessageTableName), lhsMessageTableName, rhsMessageTableName)) {
                return false;
            }
        }
        {
            String lhsMsgIdDataType;
            lhsMsgIdDataType = this.getMsgIdDataType();
            String rhsMsgIdDataType;
            rhsMsgIdDataType = that.getMsgIdDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgIdDataType", lhsMsgIdDataType), LocatorUtils.property(thatLocator, "msgIdDataType", rhsMsgIdDataType), lhsMsgIdDataType, rhsMsgIdDataType)) {
                return false;
            }
        }
        {
            String lhsNextDurableSubscriberMessageStatement;
            lhsNextDurableSubscriberMessageStatement = this.getNextDurableSubscriberMessageStatement();
            String rhsNextDurableSubscriberMessageStatement;
            rhsNextDurableSubscriberMessageStatement = that.getNextDurableSubscriberMessageStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nextDurableSubscriberMessageStatement", lhsNextDurableSubscriberMessageStatement), LocatorUtils.property(thatLocator, "nextDurableSubscriberMessageStatement", rhsNextDurableSubscriberMessageStatement), lhsNextDurableSubscriberMessageStatement, rhsNextDurableSubscriberMessageStatement)) {
                return false;
            }
        }
        {
            String lhsRemoveAllMessagesStatement;
            lhsRemoveAllMessagesStatement = this.getRemoveAllMessagesStatement();
            String rhsRemoveAllMessagesStatement;
            rhsRemoveAllMessagesStatement = that.getRemoveAllMessagesStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "removeAllMessagesStatement", lhsRemoveAllMessagesStatement), LocatorUtils.property(thatLocator, "removeAllMessagesStatement", rhsRemoveAllMessagesStatement), lhsRemoveAllMessagesStatement, rhsRemoveAllMessagesStatement)) {
                return false;
            }
        }
        {
            String lhsRemoveAllSubscriptionsStatement;
            lhsRemoveAllSubscriptionsStatement = this.getRemoveAllSubscriptionsStatement();
            String rhsRemoveAllSubscriptionsStatement;
            rhsRemoveAllSubscriptionsStatement = that.getRemoveAllSubscriptionsStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "removeAllSubscriptionsStatement", lhsRemoveAllSubscriptionsStatement), LocatorUtils.property(thatLocator, "removeAllSubscriptionsStatement", rhsRemoveAllSubscriptionsStatement), lhsRemoveAllSubscriptionsStatement, rhsRemoveAllSubscriptionsStatement)) {
                return false;
            }
        }
        {
            String lhsRemoveMessageStatment;
            lhsRemoveMessageStatment = this.getRemoveMessageStatment();
            String rhsRemoveMessageStatment;
            rhsRemoveMessageStatment = that.getRemoveMessageStatment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "removeMessageStatment", lhsRemoveMessageStatment), LocatorUtils.property(thatLocator, "removeMessageStatment", rhsRemoveMessageStatment), lhsRemoveMessageStatment, rhsRemoveMessageStatment)) {
                return false;
            }
        }
        {
            String lhsSelectDurablePriorityAckStatement;
            lhsSelectDurablePriorityAckStatement = this.getSelectDurablePriorityAckStatement();
            String rhsSelectDurablePriorityAckStatement;
            rhsSelectDurablePriorityAckStatement = that.getSelectDurablePriorityAckStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selectDurablePriorityAckStatement", lhsSelectDurablePriorityAckStatement), LocatorUtils.property(thatLocator, "selectDurablePriorityAckStatement", rhsSelectDurablePriorityAckStatement), lhsSelectDurablePriorityAckStatement, rhsSelectDurablePriorityAckStatement)) {
                return false;
            }
        }
        {
            String lhsSequenceDataType;
            lhsSequenceDataType = this.getSequenceDataType();
            String rhsSequenceDataType;
            rhsSequenceDataType = that.getSequenceDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceDataType", lhsSequenceDataType), LocatorUtils.property(thatLocator, "sequenceDataType", rhsSequenceDataType), lhsSequenceDataType, rhsSequenceDataType)) {
                return false;
            }
        }
        {
            String lhsStringIdDataType;
            lhsStringIdDataType = this.getStringIdDataType();
            String rhsStringIdDataType;
            rhsStringIdDataType = that.getStringIdDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stringIdDataType", lhsStringIdDataType), LocatorUtils.property(thatLocator, "stringIdDataType", rhsStringIdDataType), lhsStringIdDataType, rhsStringIdDataType)) {
                return false;
            }
        }
        {
            String lhsTablePrefix;
            lhsTablePrefix = this.getTablePrefix();
            String rhsTablePrefix;
            rhsTablePrefix = that.getTablePrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tablePrefix", lhsTablePrefix), LocatorUtils.property(thatLocator, "tablePrefix", rhsTablePrefix), lhsTablePrefix, rhsTablePrefix)) {
                return false;
            }
        }
        {
            String lhsUpdateDurableLastAckInTxStatement;
            lhsUpdateDurableLastAckInTxStatement = this.getUpdateDurableLastAckInTxStatement();
            String rhsUpdateDurableLastAckInTxStatement;
            rhsUpdateDurableLastAckInTxStatement = that.getUpdateDurableLastAckInTxStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateDurableLastAckInTxStatement", lhsUpdateDurableLastAckInTxStatement), LocatorUtils.property(thatLocator, "updateDurableLastAckInTxStatement", rhsUpdateDurableLastAckInTxStatement), lhsUpdateDurableLastAckInTxStatement, rhsUpdateDurableLastAckInTxStatement)) {
                return false;
            }
        }
        {
            String lhsUpdateDurableLastAckStatement;
            lhsUpdateDurableLastAckStatement = this.getUpdateDurableLastAckStatement();
            String rhsUpdateDurableLastAckStatement;
            rhsUpdateDurableLastAckStatement = that.getUpdateDurableLastAckStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateDurableLastAckStatement", lhsUpdateDurableLastAckStatement), LocatorUtils.property(thatLocator, "updateDurableLastAckStatement", rhsUpdateDurableLastAckStatement), lhsUpdateDurableLastAckStatement, rhsUpdateDurableLastAckStatement)) {
                return false;
            }
        }
        {
            String lhsUpdateDurableLastAckWithPriorityInTxStatement;
            lhsUpdateDurableLastAckWithPriorityInTxStatement = this.getUpdateDurableLastAckWithPriorityInTxStatement();
            String rhsUpdateDurableLastAckWithPriorityInTxStatement;
            rhsUpdateDurableLastAckWithPriorityInTxStatement = that.getUpdateDurableLastAckWithPriorityInTxStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateDurableLastAckWithPriorityInTxStatement", lhsUpdateDurableLastAckWithPriorityInTxStatement), LocatorUtils.property(thatLocator, "updateDurableLastAckWithPriorityInTxStatement", rhsUpdateDurableLastAckWithPriorityInTxStatement), lhsUpdateDurableLastAckWithPriorityInTxStatement, rhsUpdateDurableLastAckWithPriorityInTxStatement)) {
                return false;
            }
        }
        {
            String lhsUpdateDurableLastAckWithPriorityStatement;
            lhsUpdateDurableLastAckWithPriorityStatement = this.getUpdateDurableLastAckWithPriorityStatement();
            String rhsUpdateDurableLastAckWithPriorityStatement;
            rhsUpdateDurableLastAckWithPriorityStatement = that.getUpdateDurableLastAckWithPriorityStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateDurableLastAckWithPriorityStatement", lhsUpdateDurableLastAckWithPriorityStatement), LocatorUtils.property(thatLocator, "updateDurableLastAckWithPriorityStatement", rhsUpdateDurableLastAckWithPriorityStatement), lhsUpdateDurableLastAckWithPriorityStatement, rhsUpdateDurableLastAckWithPriorityStatement)) {
                return false;
            }
        }
        {
            String lhsUpdateLastPriorityAckRowOfDurableSubStatement;
            lhsUpdateLastPriorityAckRowOfDurableSubStatement = this.getUpdateLastPriorityAckRowOfDurableSubStatement();
            String rhsUpdateLastPriorityAckRowOfDurableSubStatement;
            rhsUpdateLastPriorityAckRowOfDurableSubStatement = that.getUpdateLastPriorityAckRowOfDurableSubStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateLastPriorityAckRowOfDurableSubStatement", lhsUpdateLastPriorityAckRowOfDurableSubStatement), LocatorUtils.property(thatLocator, "updateLastPriorityAckRowOfDurableSubStatement", rhsUpdateLastPriorityAckRowOfDurableSubStatement), lhsUpdateLastPriorityAckRowOfDurableSubStatement, rhsUpdateLastPriorityAckRowOfDurableSubStatement)) {
                return false;
            }
        }
        {
            String lhsUpdateMessageStatement;
            lhsUpdateMessageStatement = this.getUpdateMessageStatement();
            String rhsUpdateMessageStatement;
            rhsUpdateMessageStatement = that.getUpdateMessageStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateMessageStatement", lhsUpdateMessageStatement), LocatorUtils.property(thatLocator, "updateMessageStatement", rhsUpdateMessageStatement), lhsUpdateMessageStatement, rhsUpdateMessageStatement)) {
                return false;
            }
        }
        {
            String lhsUpdateXidFlagStatement;
            lhsUpdateXidFlagStatement = this.getUpdateXidFlagStatement();
            String rhsUpdateXidFlagStatement;
            rhsUpdateXidFlagStatement = that.getUpdateXidFlagStatement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateXidFlagStatement", lhsUpdateXidFlagStatement), LocatorUtils.property(thatLocator, "updateXidFlagStatement", rhsUpdateXidFlagStatement), lhsUpdateXidFlagStatement, rhsUpdateXidFlagStatement)) {
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
            Boolean lhsUseLockCreateWhereClause;
            lhsUseLockCreateWhereClause = this.isUseLockCreateWhereClause();
            Boolean rhsUseLockCreateWhereClause;
            rhsUseLockCreateWhereClause = that.isUseLockCreateWhereClause();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useLockCreateWhereClause", lhsUseLockCreateWhereClause), LocatorUtils.property(thatLocator, "useLockCreateWhereClause", rhsUseLockCreateWhereClause), lhsUseLockCreateWhereClause, rhsUseLockCreateWhereClause)) {
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
    public static class CreateLockSchemaStatements
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
            if (!(object instanceof DtoStatements.CreateLockSchemaStatements)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoStatements.CreateLockSchemaStatements that = ((DtoStatements.CreateLockSchemaStatements) object);
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
    public static class CreateSchemaStatements
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
            if (!(object instanceof DtoStatements.CreateSchemaStatements)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoStatements.CreateSchemaStatements that = ((DtoStatements.CreateSchemaStatements) object);
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
    public static class DropSchemaStatements
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
            if (!(object instanceof DtoStatements.DropSchemaStatements)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final DtoStatements.DropSchemaStatements that = ((DtoStatements.DropSchemaStatements) object);
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
