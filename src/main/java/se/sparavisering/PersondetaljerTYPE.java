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
 * Detaljerad information direkt relaterad till personen som SPAR f�r de uppgifter SPAR sparar historik. Poster som saknar elementen DatumFrom och DatumTom avser aktuell information.
 * 
 * <p>Java class for PersondetaljerTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersondetaljerTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="DatumFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="DatumTom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Aviseringsnamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Fornamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Tilltalsnamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Mellannamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Efternamn" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Sekretessmarkering" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}AvregistreringsorsakKod" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Avregistreringsdatum" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}HanvisningsPersonNrByttFran" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}HanvisningsPersonNrByttTill" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Fodelsetid" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}FodelselanKod" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Fodelseforsamling" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}Kon" minOccurs="0"/>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}SvenskMedborgare" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersondetaljerTYPE", propOrder = {
    "datumFrom",
    "datumTom",
    "aviseringsnamn",
    "fornamn",
    "tilltalsnamn",
    "mellannamn",
    "efternamn",
    "sekretessmarkering",
    "avregistreringsorsakKod",
    "avregistreringsdatum",
    "hanvisningsPersonNrByttFran",
    "hanvisningsPersonNrByttTill",
    "fodelsetid",
    "fodelselanKod",
    "fodelseforsamling",
    "kon",
    "svenskMedborgare"
})
public class PersondetaljerTYPE {

    @XmlElement(name = "DatumFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumFrom;
    @XmlElement(name = "DatumTom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumTom;
    @XmlElement(name = "Aviseringsnamn")
    protected String aviseringsnamn;
    @XmlElement(name = "Fornamn")
    protected String fornamn;
    @XmlElement(name = "Tilltalsnamn")
    protected Integer tilltalsnamn;
    @XmlElement(name = "Mellannamn")
    protected String mellannamn;
    @XmlElement(name = "Efternamn")
    protected String efternamn;
    @XmlElement(name = "Sekretessmarkering")
    protected SekretessmarkeringTYPE sekretessmarkering;
    @XmlElement(name = "AvregistreringsorsakKod")
    protected AvregistreringsorsakKodTYPE avregistreringsorsakKod;
    @XmlElement(name = "Avregistreringsdatum")
    protected String avregistreringsdatum;
    @XmlElement(name = "HanvisningsPersonNrByttFran")
    protected String hanvisningsPersonNrByttFran;
    @XmlElement(name = "HanvisningsPersonNrByttTill")
    protected String hanvisningsPersonNrByttTill;
    @XmlElement(name = "Fodelsetid")
    protected XMLGregorianCalendar fodelsetid;
    @XmlElement(name = "FodelselanKod")
    protected String fodelselanKod;
    @XmlElement(name = "Fodelseforsamling")
    protected String fodelseforsamling;
    @XmlElement(name = "Kon")
    protected KonTYPE kon;
    @XmlElement(name = "SvenskMedborgare")
    protected SvenskMedborgareTYPE svenskMedborgare;

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
     * Gets the value of the aviseringsnamn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAviseringsnamn() {
        return aviseringsnamn;
    }

    /**
     * Sets the value of the aviseringsnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAviseringsnamn(String value) {
        this.aviseringsnamn = value;
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
     * Gets the value of the tilltalsnamn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTilltalsnamn() {
        return tilltalsnamn;
    }

    /**
     * Sets the value of the tilltalsnamn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTilltalsnamn(Integer value) {
        this.tilltalsnamn = value;
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
     * Gets the value of the sekretessmarkering property.
     * 
     * @return
     *     possible object is
     *     {@link SekretessmarkeringTYPE }
     *     
     */
    public SekretessmarkeringTYPE getSekretessmarkering() {
        return sekretessmarkering;
    }

    /**
     * Sets the value of the sekretessmarkering property.
     * 
     * @param value
     *     allowed object is
     *     {@link SekretessmarkeringTYPE }
     *     
     */
    public void setSekretessmarkering(SekretessmarkeringTYPE value) {
        this.sekretessmarkering = value;
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

    /**
     * Gets the value of the hanvisningsPersonNrByttFran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHanvisningsPersonNrByttFran() {
        return hanvisningsPersonNrByttFran;
    }

    /**
     * Sets the value of the hanvisningsPersonNrByttFran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHanvisningsPersonNrByttFran(String value) {
        this.hanvisningsPersonNrByttFran = value;
    }

    /**
     * Gets the value of the hanvisningsPersonNrByttTill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHanvisningsPersonNrByttTill() {
        return hanvisningsPersonNrByttTill;
    }

    /**
     * Sets the value of the hanvisningsPersonNrByttTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHanvisningsPersonNrByttTill(String value) {
        this.hanvisningsPersonNrByttTill = value;
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
     * Gets the value of the fodelselanKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFodelselanKod() {
        return fodelselanKod;
    }

    /**
     * Sets the value of the fodelselanKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFodelselanKod(String value) {
        this.fodelselanKod = value;
    }

    /**
     * Gets the value of the fodelseforsamling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFodelseforsamling() {
        return fodelseforsamling;
    }

    /**
     * Sets the value of the fodelseforsamling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFodelseforsamling(String value) {
        this.fodelseforsamling = value;
    }

    /**
     * Gets the value of the kon property.
     * 
     * @return
     *     possible object is
     *     {@link KonTYPE }
     *     
     */
    public KonTYPE getKon() {
        return kon;
    }

    /**
     * Sets the value of the kon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonTYPE }
     *     
     */
    public void setKon(KonTYPE value) {
        this.kon = value;
    }

    /**
     * Gets the value of the svenskMedborgare property.
     * 
     * @return
     *     possible object is
     *     {@link SvenskMedborgareTYPE }
     *     
     */
    public SvenskMedborgareTYPE getSvenskMedborgare() {
        return svenskMedborgare;
    }

    /**
     * Sets the value of the svenskMedborgare property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvenskMedborgareTYPE }
     *     
     */
    public void setSvenskMedborgare(SvenskMedborgareTYPE value) {
        this.svenskMedborgare = value;
    }

}