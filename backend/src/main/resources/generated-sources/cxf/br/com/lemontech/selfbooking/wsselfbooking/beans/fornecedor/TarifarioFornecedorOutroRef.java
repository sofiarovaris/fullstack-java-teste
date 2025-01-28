
package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tarifarioFornecedorOutroRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorOutroRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorBackofficeFornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/&gt;
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/&gt;
 *         &lt;element name="identificadorBackOffice" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorOutroRef", propOrder = {
    "identificadorBackofficeFornecedor",
    "identificadorBackofficeCliente",
    "identificadorBackOffice"
})
@XmlSeeAlso({
    TarifarioFornecedorOutro.class
})
public class TarifarioFornecedorOutroRef {

    @XmlElement(required = true)
    protected String identificadorBackofficeFornecedor;
    protected String identificadorBackofficeCliente;
    @XmlElement(required = true)
    protected String identificadorBackOffice;

    /**
     * Obtém o valor da propriedade identificadorBackofficeFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFornecedor(String value) {
        this.identificadorBackofficeFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackofficeCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackOffice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOffice() {
        return identificadorBackOffice;
    }

    /**
     * Define o valor da propriedade identificadorBackOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOffice(String value) {
        this.identificadorBackOffice = value;
    }

}
