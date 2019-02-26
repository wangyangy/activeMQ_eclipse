//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.02.26 时间 09:59:41 AM CST 
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
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bucketCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="cacheSize" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlRootElement(name = "messageGroupHashBucketFactory")
public class DtoMessageGroupHashBucketFactory
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "bucketCount")
    protected BigInteger bucketCount;
    @XmlAttribute(name = "cacheSize")
    protected BigInteger cacheSize;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取bucketCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBucketCount() {
        return bucketCount;
    }

    /**
     * 设置bucketCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBucketCount(BigInteger value) {
        this.bucketCount = value;
    }

    /**
     * 获取cacheSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCacheSize() {
        return cacheSize;
    }

    /**
     * 设置cacheSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCacheSize(BigInteger value) {
        this.cacheSize = value;
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
            BigInteger theBucketCount;
            theBucketCount = this.getBucketCount();
            strategy.appendField(locator, this, "bucketCount", buffer, theBucketCount);
        }
        {
            BigInteger theCacheSize;
            theCacheSize = this.getCacheSize();
            strategy.appendField(locator, this, "cacheSize", buffer, theCacheSize);
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
            BigInteger theBucketCount;
            theBucketCount = this.getBucketCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bucketCount", theBucketCount), currentHashCode, theBucketCount);
        }
        {
            BigInteger theCacheSize;
            theCacheSize = this.getCacheSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cacheSize", theCacheSize), currentHashCode, theCacheSize);
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
        if (!(object instanceof DtoMessageGroupHashBucketFactory)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DtoMessageGroupHashBucketFactory that = ((DtoMessageGroupHashBucketFactory) object);
        {
            BigInteger lhsBucketCount;
            lhsBucketCount = this.getBucketCount();
            BigInteger rhsBucketCount;
            rhsBucketCount = that.getBucketCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bucketCount", lhsBucketCount), LocatorUtils.property(thatLocator, "bucketCount", rhsBucketCount), lhsBucketCount, rhsBucketCount)) {
                return false;
            }
        }
        {
            BigInteger lhsCacheSize;
            lhsCacheSize = this.getCacheSize();
            BigInteger rhsCacheSize;
            rhsCacheSize = that.getCacheSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cacheSize", lhsCacheSize), LocatorUtils.property(thatLocator, "cacheSize", rhsCacheSize), lhsCacheSize, rhsCacheSize)) {
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
