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
 * Relations person
 * 
 * <p>Java class for RelationTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}DatumFrom" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}DatumTom" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Relationstyp"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}PersonId" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Fornamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Mellannamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Efternamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Fodelsetid" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}AvregistreringsorsakKod" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Avregistreringsdatum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationTYPE", propOrder = {
    "datumFrom",
    "datumTom",
    "relationstyp",
    "personId",
    "fornamn",
    "mellannamn",
    "efternamn",
    "fodelsetid",
    "avregistreringsorsakKod",
    "avregistreringsdatum"
})
public class RelationTYPE {

    @XmlElement(name = "DatumFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumFrom;
    @XmlElement(name = "DatumTom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumTom;
    @XmlElement(name = "Relationstyp", required = true)
    protected RelationstypTYPE relationstyp;
    @XmlElement(name = "PersonId")
    protected PersonIdTYPE personId;
    @XmlElement(name = "Fornamn")
    protected String fornamn;
    @XmlElement(name = "Mellannamn")
    protected String mellannamn;
    @XmlElement(name = "Efternamn")
    protected String efternamn;
    @XmlElement(name = "Fodelsetid")
    protected XMLGregorianCalendar fodelsetid;
    @XmlElement(name = "AvregistreringsorsakKod")
    protected AvregistreringsorsakKodTYPE avregistreringsorsakKod;
    @XmlElement(name = "Avregistreringsdatum")
    protected String avregistreringsdatum;

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
     * Gets the value of the relationstyp property.
     * 
     * @return
     *     possible object is
     *     {@link RelationstypTYPE }
     *     
     */
    public RelationstypTYPE getRelationstyp() {
        return relationstyp;
    }

    /**
     * Sets the value of the relationstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationstypTYPE }
     *     
     */
    public void setRelationstyp(RelationstypTYPE value) {
        this.relationstyp = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdTYPE }
     *     
     */
    public PersonIdTYPE getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdTYPE }
     *     
     */
    public void setPersonId(PersonIdTYPE value) {
        this.personId = value;
    }

    /**
     * Gets the value of the fornamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornamn() {
        return fornamn;
    }

    /**
     * Sets the value of the fornamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornamn(String value) {
        this.fornamn = value;
    }

    /**
     * Gets the value of the mellannamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMellannamn() {
        return mellannamn;
    }

    /**
     * Sets the value of the mellannamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMellannamn(String value) {
        this.mellannamn = value;
    }

    /**
     * Gets the value of the efternamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfternamn() {
        return efternamn;
    }

    /**
     * Sets the value of the efternamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfternamn(String value) {
        this.efternamn = value;
    }

    /**
     * Gets the value of the fodelsetid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFodelsetid() {
        return fodelsetid;
    }

    /**
     * Sets the value of the fodelsetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFodelsetid(XMLGregorianCalendar value) {
        this.fodelsetid = value;
    }

    /**
     * Gets the value of the avregistreringsorsakKod property.
     * 
     * @return
     *     possible object is
     *     {@link AvregistreringsorsakKodTYPE }
     *     
     */
    public AvregistreringsorsakKodTYPE getAvregistreringsorsakKod() {
        return avregistreringsorsakKod;
    }

    /**
     * Sets the value of the avregistreringsorsakKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvregistreringsorsakKodTYPE }
     *     
     */
    public void setAvregistreringsorsakKod(AvregistreringsorsakKodTYPE value) {
        this.avregistreringsorsakKod = value;
    }

    /**
     * Gets the value of the avregistreringsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvregistreringsdatum() {
        return avregistreringsdatum;
    }

    /**
     * Sets the value of the avregistreringsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvregistreringsdatum(String value) {
        this.avregistreringsdatum = value;
    }

}
