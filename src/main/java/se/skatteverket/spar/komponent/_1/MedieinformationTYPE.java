//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.11 at 09:36:20 PM CET 
//


package se.skatteverket.spar.komponent._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedieinformationTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedieinformationTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}KundNr" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}OrgNr" minOccurs="0"/>
 *         &lt;element name="Kontaktperson" type="{http://skatteverket.se/spar/komponent/1.0}KontaktpersonTYPE" minOccurs="0"/>
 *         &lt;element name="KontaktTelefon" type="{http://skatteverket.se/spar/komponent/1.0}KontaktTelefonTYPE" minOccurs="0"/>
 *         &lt;element name="KontaktEpost" type="{http://skatteverket.se/spar/komponent/1.0}KontaktEpostTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedieinformationTYPE", propOrder = {
    "kundNr",
    "orgNr",
    "kontaktperson",
    "kontaktTelefon",
    "kontaktEpost"
})
public class MedieinformationTYPE {

    @XmlElement(name = "KundNr")
    protected Integer kundNr;
    @XmlElement(name = "OrgNr")
    protected String orgNr;
    @XmlElement(name = "Kontaktperson")
    protected String kontaktperson;
    @XmlElement(name = "KontaktTelefon")
    protected String kontaktTelefon;
    @XmlElement(name = "KontaktEpost")
    protected String kontaktEpost;

    /**
     * Gets the value of the kundNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKundNr() {
        return kundNr;
    }

    /**
     * Sets the value of the kundNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKundNr(Integer value) {
        this.kundNr = value;
    }

    /**
     * Gets the value of the orgNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNr() {
        return orgNr;
    }

    /**
     * Sets the value of the orgNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNr(String value) {
        this.orgNr = value;
    }

    /**
     * Gets the value of the kontaktperson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontaktperson() {
        return kontaktperson;
    }

    /**
     * Sets the value of the kontaktperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontaktperson(String value) {
        this.kontaktperson = value;
    }

    /**
     * Gets the value of the kontaktTelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    /**
     * Sets the value of the kontaktTelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontaktTelefon(String value) {
        this.kontaktTelefon = value;
    }

    /**
     * Gets the value of the kontaktEpost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontaktEpost() {
        return kontaktEpost;
    }

    /**
     * Sets the value of the kontaktEpost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontaktEpost(String value) {
        this.kontaktEpost = value;
    }

}
