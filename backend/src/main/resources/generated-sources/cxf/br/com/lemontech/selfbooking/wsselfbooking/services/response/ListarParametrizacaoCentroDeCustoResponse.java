
package br.com.lemontech.selfbooking.wsselfbooking.services.response;

import java.util.ArrayList;
import java.util.List;
import br.com.lemontech.selfbooking.wsselfbooking.beans.solicitacaotolistarparametrizacaocentrodecusto.SolicitacaoListarParametrizacaoCentroDeCusto;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listarParametrizacaoCentroDeCustoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listarParametrizacaoCentroDeCustoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultadoAcao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoAcao" minOccurs="0"/&gt;
 *         &lt;element name="numeroSolicitacoes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="solicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/solicitacaotolistarparametrizacaocentrodecusto}solicitacaoListarParametrizacaoCentroDeCusto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mensagemRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarParametrizacaoCentroDeCustoResponse", propOrder = {
    "resultadoAcao",
    "numeroSolicitacoes",
    "solicitacao",
    "mensagemRetorno"
})
public class ListarParametrizacaoCentroDeCustoResponse {

    @XmlSchemaType(name = "string")
    protected ResultadoAcao resultadoAcao;
    protected Integer numeroSolicitacoes;
    protected List<SolicitacaoListarParametrizacaoCentroDeCusto> solicitacao;
    protected String mensagemRetorno;

    /**
     * Obtém o valor da propriedade resultadoAcao.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoAcao }
     *     
     */
    public ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }

    /**
     * Define o valor da propriedade resultadoAcao.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoAcao }
     *     
     */
    public void setResultadoAcao(ResultadoAcao value) {
        this.resultadoAcao = value;
    }

    /**
     * Obtém o valor da propriedade numeroSolicitacoes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroSolicitacoes() {
        return numeroSolicitacoes;
    }

    /**
     * Define o valor da propriedade numeroSolicitacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroSolicitacoes(Integer value) {
        this.numeroSolicitacoes = value;
    }

    /**
     * Gets the value of the solicitacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the solicitacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolicitacaoListarParametrizacaoCentroDeCusto }
     * 
     * 
     */
    public List<SolicitacaoListarParametrizacaoCentroDeCusto> getSolicitacao() {
        if (solicitacao == null) {
            solicitacao = new ArrayList<SolicitacaoListarParametrizacaoCentroDeCusto>();
        }
        return this.solicitacao;
    }

    /**
     * Obtém o valor da propriedade mensagemRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Define o valor da propriedade mensagemRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemRetorno(String value) {
        this.mensagemRetorno = value;
    }

}
