//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 07:19:45 em CET 
//


package se.sparavisering;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AviseringsPosterTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AviseringsPosterTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://skatteverket.se/spar/komponent/1.0}AviseringsPost" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AviseringsPosterTYPE", propOrder = {
    "aviseringsPost"
})
public class AviseringsPosterTYPE {

    @XmlElement(name = "AviseringsPost")
    protected List<AviseringsPostTYPE> aviseringsPost;

    /**
     * Gets the value of the aviseringsPost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aviseringsPost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAviseringsPost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AviseringsPostTYPE }
     * 
     * 
     */
    public List<AviseringsPostTYPE> getAviseringsPost() {
        if (aviseringsPost == null) {
            aviseringsPost = new ArrayList<AviseringsPostTYPE>();
        }
        return this.aviseringsPost;
    }

}
