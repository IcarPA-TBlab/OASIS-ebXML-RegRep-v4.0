//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.03 at 05:33:42 PM MEZ 
//


package org.oasis.ebxml.registry.bindings.query;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.oasis.ebxml.registry.bindings.rim.QueryType;
import org.oasis.ebxml.registry.bindings.rs.RegistryRequestType;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:4.0}RegistryRequestType">
 *       &lt;sequence>
 *         &lt;element name="ResponseOption" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:4.0}ResponseOptionType"/>
 *         &lt;element name="Query" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}QueryType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="federated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="federation" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" default="application/ebrim+xml" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;attribute name="startIndex" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}integer" default="-1" />
 *       &lt;attribute name="depth" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="matchOlderVersions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseOption",
    "query"
})
@XmlRootElement(name = "QueryRequest")
public class QueryRequest
    extends RegistryRequestType
{

    @XmlElement(name = "ResponseOption", required = true)
    protected ResponseOptionType responseOption;
    @XmlElement(name = "Query", required = true)
    protected QueryType query;
    @XmlAttribute
    protected Boolean federated;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String federation;
    @XmlAttribute
    protected String format;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute
    protected BigInteger startIndex;
    @XmlAttribute
    protected BigInteger maxResults;
    @XmlAttribute
    protected BigInteger depth;
    @XmlAttribute
    protected Boolean matchOlderVersions;

    /**
     * Gets the value of the responseOption property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOptionType }
     *     
     */
    public ResponseOptionType getResponseOption() {
        return responseOption;
    }

    /**
     * Sets the value of the responseOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOptionType }
     *     
     */
    public void setResponseOption(ResponseOptionType value) {
        this.responseOption = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuery(QueryType value) {
        this.query = value;
    }

    /**
     * Gets the value of the federated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFederated() {
        if (federated == null) {
            return false;
        } else {
            return federated;
        }
    }

    /**
     * Sets the value of the federated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederated(Boolean value) {
        this.federated = value;
    }

    /**
     * Gets the value of the federation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederation() {
        return federation;
    }

    /**
     * Sets the value of the federation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederation(String value) {
        this.federation = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        if (format == null) {
            return "application/ebrim+xml";
        } else {
            return format;
        }
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndex() {
        if (startIndex == null) {
            return new BigInteger("0");
        } else {
            return startIndex;
        }
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResults() {
        if (maxResults == null) {
            return new BigInteger("-1");
        } else {
            return maxResults;
        }
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResults(BigInteger value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepth() {
        if (depth == null) {
            return new BigInteger("0");
        } else {
            return depth;
        }
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepth(BigInteger value) {
        this.depth = value;
    }

    /**
     * Gets the value of the matchOlderVersions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMatchOlderVersions() {
        if (matchOlderVersions == null) {
            return false;
        } else {
            return matchOlderVersions;
        }
    }

    /**
     * Sets the value of the matchOlderVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchOlderVersions(Boolean value) {
        this.matchOlderVersions = value;
    }

}