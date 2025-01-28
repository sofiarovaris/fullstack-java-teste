
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotelRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterarStatusTarifarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusTarifarioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioHotelRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorHotelRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioCarroRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorCarroRef"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="tarifarioOutroRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorOutroRef"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusTarifarioRequest", propOrder = {
    "ativo",
    "tarifarioHotelRef",
    "tarifarioCarroRef",
    "tarifarioOutroRef"
})
public class AlterarStatusTarifarioRequest {

    protected boolean ativo;
    protected TarifarioFornecedorHotelRef tarifarioHotelRef;
    protected TarifarioFornecedorCarroRef tarifarioCarroRef;
    protected TarifarioFornecedorOutroRef tarifarioOutroRef;

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioHotelRef.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorHotelRef }
     *     
     */
    public TarifarioFornecedorHotelRef getTarifarioHotelRef() {
        return tarifarioHotelRef;
    }

    /**
     * Define o valor da propriedade tarifarioHotelRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorHotelRef }
     *     
     */
    public void setTarifarioHotelRef(TarifarioFornecedorHotelRef value) {
        this.tarifarioHotelRef = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioCarroRef.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorCarroRef }
     *     
     */
    public TarifarioFornecedorCarroRef getTarifarioCarroRef() {
        return tarifarioCarroRef;
    }

    /**
     * Define o valor da propriedade tarifarioCarroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorCarroRef }
     *     
     */
    public void setTarifarioCarroRef(TarifarioFornecedorCarroRef value) {
        this.tarifarioCarroRef = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioOutroRef.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorOutroRef }
     *     
     */
    public TarifarioFornecedorOutroRef getTarifarioOutroRef() {
        return tarifarioOutroRef;
    }

    /**
     * Define o valor da propriedade tarifarioOutroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorOutroRef }
     *     
     */
    public void setTarifarioOutroRef(TarifarioFornecedorOutroRef value) {
        this.tarifarioOutroRef = value;
    }

}
