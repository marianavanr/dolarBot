package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_TIPOAT
 * @generated
 */
@Entity
@Table(name = "\"HY_TIPOAT\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyTipoat")
public class HyTipoat implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "codigo", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String codigo;

  /**
  * @generated
  */
  @Column(name = "abrev", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String abrev;

  /**
  * @generated
  */
  @Column(name = "agenda", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String agenda;

  /**
  * @generated
  */
  @Column(name = "atende", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String atende;

  /**
  * @generated
  */
  @Column(name = "atexterno", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String atexterno;

  /**
  * @generated
  */
  @Column(name = "ativo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ativo;

  /**
  * @generated
  */
  @Column(name = "AUTO_ESPEC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String autoEspec;

  /**
  * @generated
  */
  @Column(name = "COD_ESUS", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer codEsus;

  /**
  * @generated
  */
  @Column(name = "COD_RAAS", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer codRaas;

  /**
  * @generated
  */
  @Column(name = "codigosus", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer codigosus;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "domiciliar", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String domiciliar;

  /**
  * @generated
  */
  @Column(name = "exames", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String exames;

  /**
  * @generated
  */
  @Column(name = "fichatriagemdef", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String fichatriagemdef;

  /**
  * @generated
  */
  @Column(name = "filaagenda", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String filaagenda;

  /**
  * @generated
  */
  @Column(name = "internacao", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String internacao;

  /**
  * @generated
  */
  @Column(name = "PRE_NATAL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String preNatal;

  /**
  * @generated
  */
  @Column(name = "puerperal", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String puerperal;

  /**
  * @generated
  */
  @Column(name = "referencia", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String referencia;

  /**
  * @generated
  */
  @Column(name = "retorno", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String retorno;

  /**
  * @generated
  */
  @Column(name = "tipotrat", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String tipotrat;

  /**
  * @generated
  */
  @Column(name = "vacinacao", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String vacinacao;

  /**
   * Construtor
   * @generated
   */
  public HyTipoat(){
  }


  /**
   * Obtém abrev
   * return abrev
   * @generated
   */
  
  public java.lang.String getAbrev(){
    return this.abrev;
  }

  /**
   * Define abrev
   * @param abrev abrev
   * @generated
   */
  public HyTipoat setAbrev(java.lang.String abrev){
    this.abrev = abrev;
    return this;
  }

  /**
   * Obtém agenda
   * return agenda
   * @generated
   */
  
  public java.lang.String getAgenda(){
    return this.agenda;
  }

  /**
   * Define agenda
   * @param agenda agenda
   * @generated
   */
  public HyTipoat setAgenda(java.lang.String agenda){
    this.agenda = agenda;
    return this;
  }

  /**
   * Obtém atende
   * return atende
   * @generated
   */
  
  public java.lang.String getAtende(){
    return this.atende;
  }

  /**
   * Define atende
   * @param atende atende
   * @generated
   */
  public HyTipoat setAtende(java.lang.String atende){
    this.atende = atende;
    return this;
  }

  /**
   * Obtém atexterno
   * return atexterno
   * @generated
   */
  
  public java.lang.String getAtexterno(){
    return this.atexterno;
  }

  /**
   * Define atexterno
   * @param atexterno atexterno
   * @generated
   */
  public HyTipoat setAtexterno(java.lang.String atexterno){
    this.atexterno = atexterno;
    return this;
  }

  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  
  public java.lang.String getAtivo(){
    return this.ativo;
  }

  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public HyTipoat setAtivo(java.lang.String ativo){
    this.ativo = ativo;
    return this;
  }

  /**
   * Obtém autoEspec
   * return autoEspec
   * @generated
   */
  
  public java.lang.String getAutoEspec(){
    return this.autoEspec;
  }

  /**
   * Define autoEspec
   * @param autoEspec autoEspec
   * @generated
   */
  public HyTipoat setAutoEspec(java.lang.String autoEspec){
    this.autoEspec = autoEspec;
    return this;
  }

  /**
   * Obtém codEsus
   * return codEsus
   * @generated
   */
  
  public java.lang.Integer getCodEsus(){
    return this.codEsus;
  }

  /**
   * Define codEsus
   * @param codEsus codEsus
   * @generated
   */
  public HyTipoat setCodEsus(java.lang.Integer codEsus){
    this.codEsus = codEsus;
    return this;
  }

  /**
   * Obtém codRaas
   * return codRaas
   * @generated
   */
  
  public java.lang.Integer getCodRaas(){
    return this.codRaas;
  }

  /**
   * Define codRaas
   * @param codRaas codRaas
   * @generated
   */
  public HyTipoat setCodRaas(java.lang.Integer codRaas){
    this.codRaas = codRaas;
    return this;
  }

  /**
   * Obtém codigo
   * return codigo
   * @generated
   */
  
  public java.lang.String getCodigo(){
    return this.codigo;
  }

  /**
   * Define codigo
   * @param codigo codigo
   * @generated
   */
  public HyTipoat setCodigo(java.lang.String codigo){
    this.codigo = codigo;
    return this;
  }

  /**
   * Obtém codigosus
   * return codigosus
   * @generated
   */
  
  public java.lang.Integer getCodigosus(){
    return this.codigosus;
  }

  /**
   * Define codigosus
   * @param codigosus codigosus
   * @generated
   */
  public HyTipoat setCodigosus(java.lang.Integer codigosus){
    this.codigosus = codigosus;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public HyTipoat setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém domiciliar
   * return domiciliar
   * @generated
   */
  
  public java.lang.String getDomiciliar(){
    return this.domiciliar;
  }

  /**
   * Define domiciliar
   * @param domiciliar domiciliar
   * @generated
   */
  public HyTipoat setDomiciliar(java.lang.String domiciliar){
    this.domiciliar = domiciliar;
    return this;
  }

  /**
   * Obtém exames
   * return exames
   * @generated
   */
  
  public java.lang.String getExames(){
    return this.exames;
  }

  /**
   * Define exames
   * @param exames exames
   * @generated
   */
  public HyTipoat setExames(java.lang.String exames){
    this.exames = exames;
    return this;
  }

  /**
   * Obtém fichatriagemdef
   * return fichatriagemdef
   * @generated
   */
  
  public java.lang.String getFichatriagemdef(){
    return this.fichatriagemdef;
  }

  /**
   * Define fichatriagemdef
   * @param fichatriagemdef fichatriagemdef
   * @generated
   */
  public HyTipoat setFichatriagemdef(java.lang.String fichatriagemdef){
    this.fichatriagemdef = fichatriagemdef;
    return this;
  }

  /**
   * Obtém filaagenda
   * return filaagenda
   * @generated
   */
  
  public java.lang.String getFilaagenda(){
    return this.filaagenda;
  }

  /**
   * Define filaagenda
   * @param filaagenda filaagenda
   * @generated
   */
  public HyTipoat setFilaagenda(java.lang.String filaagenda){
    this.filaagenda = filaagenda;
    return this;
  }

  /**
   * Obtém internacao
   * return internacao
   * @generated
   */
  
  public java.lang.String getInternacao(){
    return this.internacao;
  }

  /**
   * Define internacao
   * @param internacao internacao
   * @generated
   */
  public HyTipoat setInternacao(java.lang.String internacao){
    this.internacao = internacao;
    return this;
  }

  /**
   * Obtém preNatal
   * return preNatal
   * @generated
   */
  
  public java.lang.String getPreNatal(){
    return this.preNatal;
  }

  /**
   * Define preNatal
   * @param preNatal preNatal
   * @generated
   */
  public HyTipoat setPreNatal(java.lang.String preNatal){
    this.preNatal = preNatal;
    return this;
  }

  /**
   * Obtém puerperal
   * return puerperal
   * @generated
   */
  
  public java.lang.String getPuerperal(){
    return this.puerperal;
  }

  /**
   * Define puerperal
   * @param puerperal puerperal
   * @generated
   */
  public HyTipoat setPuerperal(java.lang.String puerperal){
    this.puerperal = puerperal;
    return this;
  }

  /**
   * Obtém referencia
   * return referencia
   * @generated
   */
  
  public java.lang.String getReferencia(){
    return this.referencia;
  }

  /**
   * Define referencia
   * @param referencia referencia
   * @generated
   */
  public HyTipoat setReferencia(java.lang.String referencia){
    this.referencia = referencia;
    return this;
  }

  /**
   * Obtém retorno
   * return retorno
   * @generated
   */
  
  public java.lang.String getRetorno(){
    return this.retorno;
  }

  /**
   * Define retorno
   * @param retorno retorno
   * @generated
   */
  public HyTipoat setRetorno(java.lang.String retorno){
    this.retorno = retorno;
    return this;
  }

  /**
   * Obtém tipotrat
   * return tipotrat
   * @generated
   */
  
  public java.lang.String getTipotrat(){
    return this.tipotrat;
  }

  /**
   * Define tipotrat
   * @param tipotrat tipotrat
   * @generated
   */
  public HyTipoat setTipotrat(java.lang.String tipotrat){
    this.tipotrat = tipotrat;
    return this;
  }

  /**
   * Obtém vacinacao
   * return vacinacao
   * @generated
   */
  
  public java.lang.String getVacinacao(){
    return this.vacinacao;
  }

  /**
   * Define vacinacao
   * @param vacinacao vacinacao
   * @generated
   */
  public HyTipoat setVacinacao(java.lang.String vacinacao){
    this.vacinacao = vacinacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyTipoat object = (HyTipoat)obj;
    if (codigo != null ? !codigo.equals(object.codigo) : object.codigo != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((codigo == null) ? 0 : codigo.hashCode());
    return result;
  }

}
