
package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tarifarioFornecedorHotelRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorHotelRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorBackofficeFornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/&gt;
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/&gt;
 *         &lt;element name="categoriaApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilHospedagem"/&gt;
 *         &lt;element name="tipoApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoApartamento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorHotelRef", propOrder = {
    "identificadorBackofficeFornecedor",
    "identificadorBackofficeCliente",
    "categoriaApartamento",
    "tipoApartamento"
})
@XmlSeeAlso({
    TarifarioFornecedorHotel.class
})
public class TarifarioFornecedorHotelRef {

    @XmlElement(required = true)
    protected String identificadorBackofficeFornecedor;
    protected String identificadorBackofficeCliente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerfilHospedagem categoriaApartamento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoApartamento tipoApartamento;

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
     * Obtém o valor da propriedade categoriaApartamento.
     * 
     * @return
     *     possible object is
     *     {@link PerfilHospedagem }
     *     
     */
    public PerfilHospedagem getCategoriaApartamento() {
        return categoriaApartamento;
    }

    /**
     * Define o valor da propriedade categoriaApartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilHospedagem }
     *     
     */
    public void setCategoriaApartamento(PerfilHospedagem value) {
        this.categoriaApartamento = value;
    }

    /**
     * Obtém o valor da propriedade tipoApartamento.
     * 
     * @return
     *     possible object is
     *     {@link TipoApartamento }
     *     
     */
    public TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }

    /**
     * Define o valor da propriedade tipoApartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoApartamento }
     *     
     */
    public void setTipoApartamento(TipoApartamento value) {
        this.tipoApartamento = value;
    }

}
