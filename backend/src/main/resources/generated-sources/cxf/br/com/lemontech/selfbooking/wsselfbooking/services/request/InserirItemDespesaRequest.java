
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Deslocamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inserirItemDespesaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserirItemDespesaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSolicitacaoRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipoDespesa"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda"/&gt;
 *         &lt;element name="imagem"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deslocamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}deslocamento" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorExterno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirItemDespesaRequest", propOrder = {
    "version",
    "idSolicitacaoRef",
    "tipoDespesa",
    "valor",
    "moeda",
    "imagem",
    "deslocamento",
    "observacao",
    "identificadorExterno"
})
public class InserirItemDespesaRequest {

    protected String version;
    protected int idSolicitacaoRef;
    @XmlElement(required = true)
    protected String tipoDespesa;
    protected double valor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    @XmlElement(required = true)
    protected String imagem;
    protected Deslocamento deslocamento;
    protected String observacao;
    @XmlElement(required = true)
    protected String identificadorExterno;

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtém o valor da propriedade idSolicitacaoRef.
     * 
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }

    /**
     * Define o valor da propriedade idSolicitacaoRef.
     * 
     */
    public void setIdSolicitacaoRef(int value) {
        this.idSolicitacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade tipoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Define o valor da propriedade tipoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDespesa(String value) {
        this.tipoDespesa = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade imagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * Define o valor da propriedade imagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagem(String value) {
        this.imagem = value;
    }

    /**
     * Obtém o valor da propriedade deslocamento.
     * 
     * @return
     *     possible object is
     *     {@link Deslocamento }
     *     
     */
    public Deslocamento getDeslocamento() {
        return deslocamento;
    }

    /**
     * Define o valor da propriedade deslocamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Deslocamento }
     *     
     */
    public void setDeslocamento(Deslocamento value) {
        this.deslocamento = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade identificadorExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorExterno() {
        return identificadorExterno;
    }

    /**
     * Define o valor da propriedade identificadorExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorExterno(String value) {
        this.identificadorExterno = value;
    }

}
