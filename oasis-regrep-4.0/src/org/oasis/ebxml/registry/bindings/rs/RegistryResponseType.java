//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.03 at 05:40:14 PM MEZ 
//


package org.oasis.ebxml.registry.bindings.rs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.oasis.ebxml.registry.bindings.rim.ExtensibleObjectType;
import org.oasis.ebxml.registry.bindings.rim.ObjectRefListType;
import org.oasis.ebxml.registry.bindings.rim.RegistryObjectListType;
import org.oasis.ebxml.registry.bindings.spi.CatalogObjectsResponse;
import org.oasis.ebxml.registry.bindings.spi.FilterObjectsResponse;
import org.oasis.ebxml.registry.bindings.spi.ValidateObjectsResponse;



/**
 * Base type for all ebXML Registry responses
 * 
 * <p>Java class for RegistryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}ExtensibleObjectType">
 *       &lt;sequence>
 *         &lt;element name="Exception" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:4.0}RegistryExceptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}RegistryObjectList" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}ObjectRefList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}objectReferenceType" />
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryResponseType", propOrder = {
    "exception",
    "registryObjectList",
    "objectRefList"
})
@XmlSeeAlso({
    ValidateObjectsResponse.class,
    CatalogObjectsResponse.class,
    FilterObjectsResponse.class
})
public class RegistryResponseType
    extends ExtensibleObjectType
{

    @XmlElement(name = "Exception")
    protected List<RegistryExceptionType> exception;
    @XmlElement(name = "RegistryObjectList", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0")
    protected RegistryObjectListType registryObjectList;
    @XmlElement(name = "ObjectRefList", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0")
    protected ObjectRefListType objectRefList;
    @XmlAttribute(required = true)
    protected String status;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String requestId;

    /**
     * Gets the value of the exception property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exception property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryExceptionType }
     * 
     * 
     */
    public List<RegistryExceptionType> getException() {
        if (exception == null) {
            exception = new ArrayList<RegistryExceptionType>();
        }
        return this.exception;
    }

    /**
     * Gets the value of the registryObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getRegistryObjectList() {
        return registryObjectList;
    }

    /**
     * Sets the value of the registryObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setRegistryObjectList(RegistryObjectListType value) {
        this.registryObjectList = value;
    }

    /**
     * Gets the value of the objectRefList property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefListType }
     *     
     */
    public ObjectRefListType getObjectRefList() {
        return objectRefList;
    }

    /**
     * Sets the value of the objectRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefListType }
     *     
     */
    public void setObjectRefList(ObjectRefListType value) {
        this.objectRefList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
