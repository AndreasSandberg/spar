//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 07:19:45 em CET 
//


package se.sparavisering;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Folkbokföringsadress i Sverige kompleterad med folkbokföringsinformation.
 * 
 * <p>Java class for FolkbokforingsadressTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolkbokforingsadressTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://skatteverket.se/spar/komponent/1.0}SvenskAdress"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}FolkbokfordLanKod" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}FolkbokfordKommunKod" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}FolkbokfordForsamlingKod" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Folkbokforingsdatum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolkbokforingsadressTYPE", propOrder = {
    "careOf",
    "utdelningsadress1",
    "utdelningsadress2",
    "postNr",
    "postort",
    "folkbokfordLanKod",
    "folkbokfordKommunKod",
    "folkbokfordForsamlingKod",
    "folkbokforingsdatum"
})
public class FolkbokforingsadressTYPE {

    @XmlElement(name = "CareOf")
    protected String careOf;
    @XmlElement(name = "Utdelningsadress1")
    protected String utdelningsadress1;
    @XmlElement(name = "Utdelningsadress2")
    protected String utdelningsadress2;
    @XmlElement(name = "PostNr")
    protected String postNr;
    @XmlElement(name = "Postort")
    protected String postort;
    @XmlElement(name = "FolkbokfordLanKod")
    protected String folkbokfordLanKod;
    @XmlElement(name = "FolkbokfordKommunKod")
    protected String folkbokfordKommunKod;
    @XmlElement(name = "FolkbokfordForsamlingKod")
    protected String folkbokfordForsamlingKod;
    @XmlElement(name = "Folkbokforingsdatum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar folkbokforingsdatum;

    /**
     * Gets the value of the careOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Sets the value of the careOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
    }

    /**
     * Gets the value of the utdelningsadress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtdelningsadress1() {
        return utdelningsadress1;
    }

    /**
     * Sets the value of the utdelningsadress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtdelningsadress1(String value) {
        this.utdelningsadress1 = value;
    }

    /**
     * Gets the value of the utdelningsadress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtdelningsadress2() {
        return utdelningsadress2;
    }

    /**
     * Sets the value of the utdelningsadress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtdelningsadress2(String value) {
        this.utdelningsadress2 = value;
    }

    /**
     * Gets the value of the postNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostNr() {
        return postNr;
    }

    /**
     * Sets the value of the postNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostNr(String value) {
        this.postNr = value;
    }

    /**
     * Gets the value of the postort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostort() {
        return postort;
    }

    /**
     * Sets the value of the postort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostort(String value) {
        this.postort = value;
    }

    /**
     * Gets the value of the folkbokfordLanKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolkbokfordLanKod() {
        return folkbokfordLanKod;
    }

    /**
     * Sets the value of the folkbokfordLanKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolkbokfordLanKod(String value) {
        this.folkbokfordLanKod = value;
    }

    /**
     * Gets the value of the folkbokfordKommunKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolkbokfordKommunKod() {
        return folkbokfordKommunKod;
    }

    /**
     * Sets the value of the folkbokfordKommunKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolkbokfordKommunKod(String value) {
        this.folkbokfordKommunKod = value;
    }

    /**
     * Gets the value of the folkbokfordForsamlingKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolkbokfordForsamlingKod() {
        return folkbokfordForsamlingKod;
    }

    /**
     * Sets the value of the folkbokfordForsamlingKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolkbokfordForsamlingKod(String value) {
        this.folkbokfordForsamlingKod = value;
    }

    /**
     * Gets the value of the folkbokforingsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFolkbokforingsdatum() {
        return folkbokforingsdatum;
    }

    /**
     * Sets the value of the folkbokforingsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFolkbokforingsdatum(XMLGregorianCalendar value) {
        this.folkbokforingsdatum = value;
    }

}
