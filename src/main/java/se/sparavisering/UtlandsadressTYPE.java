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
import javax.xml.bind.annotation.XmlType;


/**
 * Adress i utomlands.
 * 
 * <p>Java class for UtlandsadressTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtlandsadressTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}CareOf" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Utdelningsadress1" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Utdelningsadress2" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Utdelningsadress3" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}PostKodUtland" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}PostortUtland" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Landskod" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Land" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtlandsadressTYPE", propOrder = {
    "careOf",
    "utdelningsadress1",
    "utdelningsadress2",
    "utdelningsadress3",
    "postKodUtland",
    "postortUtland",
    "landskod",
    "land"
})
public class UtlandsadressTYPE {

    @XmlElement(name = "CareOf")
    protected String careOf;
    @XmlElement(name = "Utdelningsadress1")
    protected String utdelningsadress1;
    @XmlElement(name = "Utdelningsadress2")
    protected String utdelningsadress2;
    @XmlElement(name = "Utdelningsadress3")
    protected String utdelningsadress3;
    @XmlElement(name = "PostKodUtland")
    protected String postKodUtland;
    @XmlElement(name = "PostortUtland")
    protected String postortUtland;
    @XmlElement(name = "Landskod")
    protected String landskod;
    @XmlElement(name = "Land")
    protected String land;

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
     * Gets the value of the utdelningsadress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtdelningsadress3() {
        return utdelningsadress3;
    }

    /**
     * Sets the value of the utdelningsadress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtdelningsadress3(String value) {
        this.utdelningsadress3 = value;
    }

    /**
     * Gets the value of the postKodUtland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostKodUtland() {
        return postKodUtland;
    }

    /**
     * Sets the value of the postKodUtland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostKodUtland(String value) {
        this.postKodUtland = value;
    }

    /**
     * Gets the value of the postortUtland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostortUtland() {
        return postortUtland;
    }

    /**
     * Sets the value of the postortUtland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostortUtland(String value) {
        this.postortUtland = value;
    }

    /**
     * Gets the value of the landskod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandskod() {
        return landskod;
    }

    /**
     * Sets the value of the landskod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandskod(String value) {
        this.landskod = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

}
