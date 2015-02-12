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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IdentifieringsInformationTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifieringsInformationTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}KundNrLeveransMottagare"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}KundNrSlutkund"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}OrgNrSlutkund"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}UppdragsId" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}SlutAnvandarId"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}SlutAnvandarBehorighet"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}SlutAnvandarSekretessRatt"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Tidsstampel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifieringsInformationTYPE", propOrder = {
    "kundNrLeveransMottagare",
    "kundNrSlutkund",
    "orgNrSlutkund",
    "uppdragsId",
    "slutAnvandarId",
    "slutAnvandarBehorighet",
    "slutAnvandarSekretessRatt",
    "tidsstampel"
})
public class IdentifieringsInformationTYPE {

    @XmlElement(name = "KundNrLeveransMottagare")
    protected int kundNrLeveransMottagare;
    @XmlElement(name = "KundNrSlutkund")
    protected int kundNrSlutkund;
    @XmlElement(name = "OrgNrSlutkund", required = true)
    protected String orgNrSlutkund;
    @XmlElement(name = "UppdragsId")
    protected Long uppdragsId;
    @XmlElement(name = "SlutAnvandarId", required = true)
    protected String slutAnvandarId;
    @XmlElement(name = "SlutAnvandarBehorighet", required = true)
    protected SlutAnvandarBehorighetTYPE slutAnvandarBehorighet;
    @XmlElement(name = "SlutAnvandarSekretessRatt", required = true)
    protected SlutAnvandarSekretessRattTYPE slutAnvandarSekretessRatt;
    @XmlElement(name = "Tidsstampel", required = true)
    protected XMLGregorianCalendar tidsstampel;

    /**
     * Gets the value of the kundNrLeveransMottagare property.
     * 
     */
    public int getKundNrLeveransMottagare() {
        return kundNrLeveransMottagare;
    }

    /**
     * Sets the value of the kundNrLeveransMottagare property.
     * 
     */
    public void setKundNrLeveransMottagare(int value) {
        this.kundNrLeveransMottagare = value;
    }

    /**
     * Gets the value of the kundNrSlutkund property.
     * 
     */
    public int getKundNrSlutkund() {
        return kundNrSlutkund;
    }

    /**
     * Sets the value of the kundNrSlutkund property.
     * 
     */
    public void setKundNrSlutkund(int value) {
        this.kundNrSlutkund = value;
    }

    /**
     * Gets the value of the orgNrSlutkund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNrSlutkund() {
        return orgNrSlutkund;
    }

    /**
     * Sets the value of the orgNrSlutkund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNrSlutkund(String value) {
        this.orgNrSlutkund = value;
    }

    /**
     * Gets the value of the uppdragsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUppdragsId() {
        return uppdragsId;
    }

    /**
     * Sets the value of the uppdragsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUppdragsId(Long value) {
        this.uppdragsId = value;
    }

    /**
     * Gets the value of the slutAnvandarId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlutAnvandarId() {
        return slutAnvandarId;
    }

    /**
     * Sets the value of the slutAnvandarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlutAnvandarId(String value) {
        this.slutAnvandarId = value;
    }

    /**
     * Gets the value of the slutAnvandarBehorighet property.
     * 
     * @return
     *     possible object is
     *     {@link SlutAnvandarBehorighetTYPE }
     *     
     */
    public SlutAnvandarBehorighetTYPE getSlutAnvandarBehorighet() {
        return slutAnvandarBehorighet;
    }

    /**
     * Sets the value of the slutAnvandarBehorighet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlutAnvandarBehorighetTYPE }
     *     
     */
    public void setSlutAnvandarBehorighet(SlutAnvandarBehorighetTYPE value) {
        this.slutAnvandarBehorighet = value;
    }

    /**
     * Gets the value of the slutAnvandarSekretessRatt property.
     * 
     * @return
     *     possible object is
     *     {@link SlutAnvandarSekretessRattTYPE }
     *     
     */
    public SlutAnvandarSekretessRattTYPE getSlutAnvandarSekretessRatt() {
        return slutAnvandarSekretessRatt;
    }

    /**
     * Sets the value of the slutAnvandarSekretessRatt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlutAnvandarSekretessRattTYPE }
     *     
     */
    public void setSlutAnvandarSekretessRatt(SlutAnvandarSekretessRattTYPE value) {
        this.slutAnvandarSekretessRatt = value;
    }

    /**
     * Gets the value of the tidsstampel property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTidsstampel() {
        return tidsstampel;
    }

    /**
     * Sets the value of the tidsstampel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTidsstampel(XMLGregorianCalendar value) {
        this.tidsstampel = value;
    }

}
