
package br.com.lemontech.selfbooking.wsselfbooking.beans.traslado;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remarks;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de traslado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="traslado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dataOrigem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paisOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidadeOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enderecoOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paisDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidadeDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enderecoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoTipoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoFornecedorBackOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeloVeiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacaoOrcamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obsemissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoControleAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="aprovado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canceladoEmitido" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="consolidadora" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}consolidadora" minOccurs="0"/&gt;
 *         &lt;element name="nomeConsultorReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeConsultorEmissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="justificativamaiortarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sequenciaProdutoAgencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="statusPagamentoFatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="taxaCancelamento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataModificacaoStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nomeUsuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadeOperacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pontoVenda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}pontoVendaOrcamento" minOccurs="0"/&gt;
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPassageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}remarks" minOccurs="0"/&gt;
 *         &lt;element name="usuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traslado", propOrder = {
    "id",
    "dataOrigem",
    "paisOrigem",
    "estadoOrigem",
    "cidadeOrigem",
    "enderecoOrigem",
    "paisDestino",
    "estadoDestino",
    "cidadeDestino",
    "enderecoDestino",
    "valor",
    "taxa",
    "taxaFee",
    "moeda",
    "codigoTipoPagamento",
    "fornecedor",
    "codigoFornecedorBackOffice",
    "modeloVeiculo",
    "nomeMotorista",
    "contato",
    "observacaoOrcamento",
    "obsemissor",
    "codigoControleAgencia",
    "dataCadastro",
    "dataVencimento",
    "aprovado",
    "canceladoEmitido",
    "consolidadora",
    "nomeConsultorReserva",
    "nomeConsultorEmissao",
    "justificativamaiortarifa",
    "complementoJustificativaMaiorTarifa",
    "sequenciaProdutoAgencia",
    "statusPagamentoFatura",
    "statusCancelamento",
    "taxaCancelamento",
    "dataModificacaoStatusCancelamento",
    "nomeUsuarioModificouStatusCancelamento",
    "unidadeOperacional",
    "pontoVenda",
    "codigoFornecedor",
    "codigoEmissor",
    "codigoJustificativaMaiorTarifa",
    "idPassageiroRef",
    "remarks",
    "usuarioModificouStatusCancelamento"
})
public class Traslado {

    protected int id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOrigem;
    protected String paisOrigem;
    protected String estadoOrigem;
    protected String cidadeOrigem;
    protected String enderecoOrigem;
    protected String paisDestino;
    protected String estadoDestino;
    protected String cidadeDestino;
    protected String enderecoDestino;
    protected Double valor;
    protected Double taxa;
    protected Double taxaFee;
    protected String moeda;
    protected String codigoTipoPagamento;
    protected String fornecedor;
    protected String codigoFornecedorBackOffice;
    protected String modeloVeiculo;
    protected String nomeMotorista;
    protected String contato;
    protected String observacaoOrcamento;
    protected String obsemissor;
    protected String codigoControleAgencia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCadastro;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    protected boolean aprovado;
    protected boolean canceladoEmitido;
    protected Consolidadora consolidadora;
    protected String nomeConsultorReserva;
    protected String nomeConsultorEmissao;
    protected String justificativamaiortarifa;
    protected String complementoJustificativaMaiorTarifa;
    protected Integer sequenciaProdutoAgencia;
    protected String statusPagamentoFatura;
    protected Integer statusCancelamento;
    protected Double taxaCancelamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModificacaoStatusCancelamento;
    protected String nomeUsuarioModificouStatusCancelamento;
    protected String unidadeOperacional;
    protected PontoVendaOrcamento pontoVenda;
    protected String codigoFornecedor;
    protected String codigoEmissor;
    protected String codigoJustificativaMaiorTarifa;
    @XmlElement(nillable = true)
    protected List<Integer> idPassageiroRef;
    protected Remarks remarks;
    protected Integer usuarioModificouStatusCancelamento;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade dataOrigem.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOrigem() {
        return dataOrigem;
    }

    /**
     * Define o valor da propriedade dataOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOrigem(XMLGregorianCalendar value) {
        this.dataOrigem = value;
    }

    /**
     * Obtém o valor da propriedade paisOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigem() {
        return paisOrigem;
    }

    /**
     * Define o valor da propriedade paisOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigem(String value) {
        this.paisOrigem = value;
    }

    /**
     * Obtém o valor da propriedade estadoOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    /**
     * Define o valor da propriedade estadoOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoOrigem(String value) {
        this.estadoOrigem = value;
    }

    /**
     * Obtém o valor da propriedade cidadeOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    /**
     * Define o valor da propriedade cidadeOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeOrigem(String value) {
        this.cidadeOrigem = value;
    }

    /**
     * Obtém o valor da propriedade enderecoOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoOrigem() {
        return enderecoOrigem;
    }

    /**
     * Define o valor da propriedade enderecoOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoOrigem(String value) {
        this.enderecoOrigem = value;
    }

    /**
     * Obtém o valor da propriedade paisDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestino() {
        return paisDestino;
    }

    /**
     * Define o valor da propriedade paisDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestino(String value) {
        this.paisDestino = value;
    }

    /**
     * Obtém o valor da propriedade estadoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDestino() {
        return estadoDestino;
    }

    /**
     * Define o valor da propriedade estadoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDestino(String value) {
        this.estadoDestino = value;
    }

    /**
     * Obtém o valor da propriedade cidadeDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDestino() {
        return cidadeDestino;
    }

    /**
     * Define o valor da propriedade cidadeDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDestino(String value) {
        this.cidadeDestino = value;
    }

    /**
     * Obtém o valor da propriedade enderecoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    /**
     * Define o valor da propriedade enderecoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoDestino(String value) {
        this.enderecoDestino = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade taxa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxa() {
        return taxa;
    }

    /**
     * Define o valor da propriedade taxa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxa(Double value) {
        this.taxa = value;
    }

    /**
     * Obtém o valor da propriedade taxaFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Define o valor da propriedade taxaFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade codigoTipoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoPagamento() {
        return codigoTipoPagamento;
    }

    /**
     * Define o valor da propriedade codigoTipoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoPagamento(String value) {
        this.codigoTipoPagamento = value;
    }

    /**
     * Obtém o valor da propriedade fornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * Define o valor da propriedade fornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornecedor(String value) {
        this.fornecedor = value;
    }

    /**
     * Obtém o valor da propriedade codigoFornecedorBackOffice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFornecedorBackOffice() {
        return codigoFornecedorBackOffice;
    }

    /**
     * Define o valor da propriedade codigoFornecedorBackOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFornecedorBackOffice(String value) {
        this.codigoFornecedorBackOffice = value;
    }

    /**
     * Obtém o valor da propriedade modeloVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    /**
     * Define o valor da propriedade modeloVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloVeiculo(String value) {
        this.modeloVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade nomeMotorista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMotorista() {
        return nomeMotorista;
    }

    /**
     * Define o valor da propriedade nomeMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMotorista(String value) {
        this.nomeMotorista = value;
    }

    /**
     * Obtém o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContato(String value) {
        this.contato = value;
    }

    /**
     * Obtém o valor da propriedade observacaoOrcamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoOrcamento() {
        return observacaoOrcamento;
    }

    /**
     * Define o valor da propriedade observacaoOrcamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoOrcamento(String value) {
        this.observacaoOrcamento = value;
    }

    /**
     * Obtém o valor da propriedade obsemissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsemissor() {
        return obsemissor;
    }

    /**
     * Define o valor da propriedade obsemissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsemissor(String value) {
        this.obsemissor = value;
    }

    /**
     * Obtém o valor da propriedade codigoControleAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoControleAgencia() {
        return codigoControleAgencia;
    }

    /**
     * Define o valor da propriedade codigoControleAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoControleAgencia(String value) {
        this.codigoControleAgencia = value;
    }

    /**
     * Obtém o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCadastro(XMLGregorianCalendar value) {
        this.dataCadastro = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade aprovado.
     * 
     */
    public boolean isAprovado() {
        return aprovado;
    }

    /**
     * Define o valor da propriedade aprovado.
     * 
     */
    public void setAprovado(boolean value) {
        this.aprovado = value;
    }

    /**
     * Obtém o valor da propriedade canceladoEmitido.
     * 
     */
    public boolean isCanceladoEmitido() {
        return canceladoEmitido;
    }

    /**
     * Define o valor da propriedade canceladoEmitido.
     * 
     */
    public void setCanceladoEmitido(boolean value) {
        this.canceladoEmitido = value;
    }

    /**
     * Obtém o valor da propriedade consolidadora.
     * 
     * @return
     *     possible object is
     *     {@link Consolidadora }
     *     
     */
    public Consolidadora getConsolidadora() {
        return consolidadora;
    }

    /**
     * Define o valor da propriedade consolidadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidadora }
     *     
     */
    public void setConsolidadora(Consolidadora value) {
        this.consolidadora = value;
    }

    /**
     * Obtém o valor da propriedade nomeConsultorReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConsultorReserva() {
        return nomeConsultorReserva;
    }

    /**
     * Define o valor da propriedade nomeConsultorReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConsultorReserva(String value) {
        this.nomeConsultorReserva = value;
    }

    /**
     * Obtém o valor da propriedade nomeConsultorEmissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConsultorEmissao() {
        return nomeConsultorEmissao;
    }

    /**
     * Define o valor da propriedade nomeConsultorEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConsultorEmissao(String value) {
        this.nomeConsultorEmissao = value;
    }

    /**
     * Obtém o valor da propriedade justificativamaiortarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativamaiortarifa() {
        return justificativamaiortarifa;
    }

    /**
     * Define o valor da propriedade justificativamaiortarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativamaiortarifa(String value) {
        this.justificativamaiortarifa = value;
    }

    /**
     * Obtém o valor da propriedade complementoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoJustificativaMaiorTarifa() {
        return complementoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade complementoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoJustificativaMaiorTarifa(String value) {
        this.complementoJustificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade sequenciaProdutoAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenciaProdutoAgencia() {
        return sequenciaProdutoAgencia;
    }

    /**
     * Define o valor da propriedade sequenciaProdutoAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenciaProdutoAgencia(Integer value) {
        this.sequenciaProdutoAgencia = value;
    }

    /**
     * Obtém o valor da propriedade statusPagamentoFatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPagamentoFatura() {
        return statusPagamentoFatura;
    }

    /**
     * Define o valor da propriedade statusPagamentoFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPagamentoFatura(String value) {
        this.statusPagamentoFatura = value;
    }

    /**
     * Obtém o valor da propriedade statusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Define o valor da propriedade statusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCancelamento(Integer value) {
        this.statusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade taxaCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaCancelamento() {
        return taxaCancelamento;
    }

    /**
     * Define o valor da propriedade taxaCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaCancelamento(Double value) {
        this.taxaCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }

    /**
     * Define o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModificacaoStatusCancelamento(XMLGregorianCalendar value) {
        this.dataModificacaoStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade nomeUsuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUsuarioModificouStatusCancelamento() {
        return nomeUsuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade nomeUsuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUsuarioModificouStatusCancelamento(String value) {
        this.nomeUsuarioModificouStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade unidadeOperacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeOperacional() {
        return unidadeOperacional;
    }

    /**
     * Define o valor da propriedade unidadeOperacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeOperacional(String value) {
        this.unidadeOperacional = value;
    }

    /**
     * Obtém o valor da propriedade pontoVenda.
     * 
     * @return
     *     possible object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }

    /**
     * Define o valor da propriedade pontoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public void setPontoVenda(PontoVendaOrcamento value) {
        this.pontoVenda = value;
    }

    /**
     * Obtém o valor da propriedade codigoFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * Define o valor da propriedade codigoFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFornecedor(String value) {
        this.codigoFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade codigoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmissor() {
        return codigoEmissor;
    }

    /**
     * Define o valor da propriedade codigoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmissor(String value) {
        this.codigoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJustificativaMaiorTarifa(String value) {
        this.codigoJustificativaMaiorTarifa = value;
    }

    /**
     * Gets the value of the idPassageiroRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the idPassageiroRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdPassageiroRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdPassageiroRef() {
        if (idPassageiroRef == null) {
            idPassageiroRef = new ArrayList<Integer>();
        }
        return this.idPassageiroRef;
    }

    /**
     * Obtém o valor da propriedade remarks.
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * Define o valor da propriedade remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
    }

    /**
     * Obtém o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioModificouStatusCancelamento(Integer value) {
        this.usuarioModificouStatusCancelamento = value;
    }

}
