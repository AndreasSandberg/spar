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
 * Sammanhållet element för folkbokföringsadress, särskild postadress samt utlandsadress. Om elementen DatumFrom och DatumTom saknas avser posten aktuell information.
 * 
 * <p>Java class for AdressTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdressTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="DatumFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="DatumTom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Folkbokforingsadress" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}SarskildPostadress" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Utlandsadress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdressTYPE", propOrder = {
    "datumFrom",
    "datumTom",
    "folkbokforingsadress",
    "sarskildPostadress",
    "utlandsadress"
})
public class AdressTYPE {

    @XmlElement(name = "DatumFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumFrom;
    @XmlElement(name = "DatumTom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumTom;
    @XmlElement(name = "Folkbokforingsadress")
    protected FolkbokforingsadressTYPE folkbokforingsadress;
    @XmlElement(name = "SarskildPostadress")
    protected SarskildPostadressTYPE sarskildPostadress;
    @XmlElement(name = "Utlandsadress")
    protected UtlandsadressTYPE utlandsadress;

    /**
     * Gets the value of the datumFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumFrom() {
        return datumFrom;
    }

    /**
     * Sets the value of the datumFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumFrom(XMLGregorianCalendar value) {
        this.datumFrom = value;
    }

    /**
     * Gets the value of the datumTom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumTom() {
        return datumTom;
    }

    /**
     * Sets the value of the datumTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumTom(XMLGregorianCalendar value) {
        this.datumTom = value;
    }

    /**
     * Gets the value of the folkbokforingsadress property.
     * 
     * @return
     *     possible object is
     *     {@link FolkbokforingsadressTYPE }
     *     
     */
    public FolkbokforingsadressTYPE getFolkbokforingsadress() {
        return folkbokforingsadress;
    }

    /**
     * Sets the value of the folkbokforingsadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolkbokforingsadressTYPE }
     *     
     */
    public void setFolkbokforingsadress(FolkbokforingsadressTYPE value) {
        this.folkbokforingsadress = value;
    }

    /**
     * Gets the value of the sarskildPostadress property.
     * 
     * @return
     *     possible object is
     *     {@link SarskildPostadressTYPE }
     *     
     */
    public SarskildPostadressTYPE getSarskildPostadress() {
        return sarskildPostadress;
    }

    /**
     * Sets the value of the sarskildPostadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SarskildPostadressTYPE }
     *     
     */
    public void setSarskildPostadress(SarskildPostadressTYPE value) {
        this.sarskildPostadress = value;
    }

    /**
     * Gets the value of the utlandsadress property.
     * 
     * @return
     *     possible object is
     *     {@link UtlandsadressTYPE }
     *     
     */
    public UtlandsadressTYPE getUtlandsadress() {
        return utlandsadress;
    }

    /**
     * Sets the value of the utlandsadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtlandsadressTYPE }
     *     
     */
    public void setUtlandsadress(UtlandsadressTYPE value) {
        this.utlandsadress = value;
    }

}
