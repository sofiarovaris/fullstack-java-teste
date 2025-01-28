
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aereoDetalheBaseTarifa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoDetalheBaseTarifa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classeTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoDetalheBaseTarifa", propOrder = {
    "baseTarifaria",
    "classeTarifaria"
})
public class AereoDetalheBaseTarifa {

    protected String baseTarifaria;
    protected String classeTarifaria;

    /**
     * Obtém o valor da propriedade baseTarifaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTarifaria() {
        return baseTarifaria;
    }

    /**
     * Define o valor da propriedade baseTarifaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTarifaria(String value) {
        this.baseTarifaria = value;
    }

    /**
     * Obtém o valor da propriedade classeTarifaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasseTarifaria() {
        return classeTarifaria;
    }

    /**
     * Define o valor da propriedade classeTarifaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasseTarifaria(String value) {
        this.classeTarifaria = value;
    }

}
