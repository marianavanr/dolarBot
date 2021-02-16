package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_PROFISSIONAIS
 * @generated
 */
@Entity
@Table(name = "\"HY_PROFISSIONAIS\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyProfissionais")
public class HyProfissionais implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "profis", nullable = false, length=11, insertable=true, updatable=true)
  private java.lang.String profis;

  /**
  * @generated
  */
  @Column(name = "agencia", nullable = true, unique = false, length=7, insertable=true, updatable=true)
  
  private java.lang.String agencia;

  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "banco", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long banco;

  /**
  * @generated
  */
  @Column(name = "CARGO_CARGO", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.Integer cargoCargo;

  /**
  * @generated
  */
  @Column(name = "cartoriociv", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String cartoriociv;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "cidadenasc", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String cidadenasc;

  /**
  * @generated
  */
  @Column(name = "cns", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.Long cns;

  /**
  * @generated
  */
  @Column(name = "complend", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String complend;

  /**
  * @generated
  */
  @Column(name = "conta", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String conta;

  /**
  * @generated
  */
  @Column(name = "cr", nullable = true, unique = false, length=12, insertable=true, updatable=true)
  
  private java.lang.String cr;

  /**
  * @generated
  */
  @Column(name = "ctps", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.Integer ctps;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "ctpsdata", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date ctpsdata;

  /**
  * @generated
  */
  @Column(name = "ctpsserie", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.Integer ctpsserie;

  /**
  * @generated
  */
  @Column(name = "ctpsuf", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ctpsuf;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_CAD", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataCad;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataemisciv", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataemisciv;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataemisident", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataemisident;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataentrest", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataentrest;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datanasc", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date datanasc;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datanatur", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date datanatur;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dtinativ", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtinativ;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, length=256, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "escolaridade", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer escolaridade;

  /**
  * @generated
  */
  @Column(name = "etnia", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.Long etnia;

  /**
  * @generated
  */
  @Column(name = "folhaciv", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.String folhaciv;

  /**
  * @generated
  */
  @Column(name = "fone", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String fone;

  /**
  * @generated
  */
  @Column(name = "FONE_DDD", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer foneDdd;

  /**
  * @generated
  */
  @Column(name = "freqescola", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String freqescola;

  /**
  * @generated
  */
  @Column(name = "FUNCAO_FUNCAO", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.Integer funcaoFuncao;

  /**
  * @generated
  */
  @Column(name = "gerarpessoa", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String gerarpessoa;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "lastupdate", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date lastupdate;

  /**
  * @generated
  */
  @Column(name = "lfces018", nullable = true, unique = false, length=16, insertable=true, updatable=true)
  
  private java.lang.String lfces018;

  /**
  * @generated
  */
  @Column(name = "livrociv", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String livrociv;

  /**
  * @generated
  */
  @Column(name = "LOGR_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String logrCodigo;

  /**
  * @generated
  */
  @Column(name = "logradouro", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String logradouro;

  /**
  * @generated
  */
  @Column(name = "mae", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String mae;

  /**
  * @generated
  */
  @Column(name = "matricula", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.Long matricula;

  /**
  * @generated
  */
  @Column(name = "MBAIRRO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String mbairroCodigo;

  /**
  * @generated
  */
  @Column(name = "MUNICIPIO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String municipioCodigo;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "numcpf", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.Long numcpf;

  /**
  * @generated
  */
  @Column(name = "numeroend", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String numeroend;

  /**
  * @generated
  */
  @Column(name = "numrg", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String numrg;

  /**
  * @generated
  */
  @Column(name = "numtiteleitor", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.Long numtiteleitor;

  /**
  * @generated
  */
  @Column(name = "obs", nullable = true, unique = false, length=1024, insertable=true, updatable=true)
  
  private java.lang.String obs;

  /**
  * @generated
  */
  @Column(name = "orgaorg", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String orgaorg;

  /**
  * @generated
  */
  @Column(name = "orgemisid", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer orgemisid;

  /**
  * @generated
  */
  @Column(name = "orgemisprof", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer orgemisprof;

  /**
  * @generated
  */
  @Column(name = "pai", nullable = true, unique = false, length=70, insertable=true, updatable=true)
  
  private java.lang.String pai;

  /**
  * @generated
  */
  @Column(name = "PAIS_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String paisCodigo;

  /**
  * @generated
  */
  @Column(name = "pessoa", nullable = true, unique = false, length=12, insertable=true, updatable=true)
  
  private java.lang.Long pessoa;

  /**
  * @generated
  */
  @Column(name = "PIS_PASEP", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.Long pisPasep;

  /**
  * @generated
  */
  @Column(name = "portarianatur", nullable = true, unique = false, length=16, insertable=true, updatable=true)
  
  private java.lang.String portarianatur;

  /**
  * @generated
  */
  @Column(name = "PROFIS_INTEGRACAO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String profisIntegracao;

  /**
  * @generated
  */
  @Column(name = "RACA_CODIGO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String racaCodigo;

  /**
  * @generated
  */
  @Column(name = "REFER_END", nullable = true, unique = false, length=256, insertable=true, updatable=true)
  
  private java.lang.String referEnd;

  /**
  * @generated
  */
  @Column(name = "secaotiteleitor", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer secaotiteleitor;

  /**
  * @generated
  */
  @Column(name = "sexo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String sexo;

  /**
  * @generated
  */
  @Column(name = "situacaofam", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer situacaofam;

  /**
  * @generated
  */
  @Column(name = "termociv", nullable = true, unique = false, length=8, insertable=true, updatable=true)
  
  private java.lang.String termociv;

  /**
  * @generated
  */
  @Column(name = "tipocertciv", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String tipocertciv;

  /**
  * @generated
  */
  @Column(name = "tipocr", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String tipocr;

  /**
  * @generated
  */
  @Column(name = "tipodoc", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String tipodoc;

  /**
  * @generated
  */
  @Column(name = "tipologend", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String tipologend;

  /**
  * @generated
  */
  @Column(name = "ufcr", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufcr;

  /**
  * @generated
  */
  @Column(name = "ufender", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufender;

  /**
  * @generated
  */
  @Column(name = "ufnasc", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufnasc;

  /**
  * @generated
  */
  @Column(name = "ufrg", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String ufrg;

  /**
  * @generated
  */
  @Column(name = "US_ATUALIZ", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usAtualiz;

  /**
  * @generated
  */
  @Column(name = "US_CAD", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usCad;

  /**
  * @generated
  */
  @Column(name = "USU_ATUALIZ", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuAtualiz;

  /**
  * @generated
  */
  @Column(name = "USU_CAD", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuCad;

  /**
  * @generated
  */
  @Column(name = "USUARIO_USUARIO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String usuarioUsuario;

  /**
  * @generated
  */
  @Column(name = "VIA_IMPCNES", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String viaImpcnes;

  /**
  * @generated
  */
  @Column(name = "zonatiteleitor", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer zonatiteleitor;

  /**
   * Construtor
   * @generated
   */
  public HyProfissionais(){
  }


  /**
   * Obtém agencia
   * return agencia
   * @generated
   */
  
  public java.lang.String getAgencia(){
    return this.agencia;
  }

  /**
   * Define agencia
   * @param agencia agencia
   * @generated
   */
  public HyProfissionais setAgencia(java.lang.String agencia){
    this.agencia = agencia;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public HyProfissionais setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém banco
   * return banco
   * @generated
   */
  
  public java.lang.Long getBanco(){
    return this.banco;
  }

  /**
   * Define banco
   * @param banco banco
   * @generated
   */
  public HyProfissionais setBanco(java.lang.Long banco){
    this.banco = banco;
    return this;
  }

  /**
   * Obtém cargoCargo
   * return cargoCargo
   * @generated
   */
  
  public java.lang.Integer getCargoCargo(){
    return this.cargoCargo;
  }

  /**
   * Define cargoCargo
   * @param cargoCargo cargoCargo
   * @generated
   */
  public HyProfissionais setCargoCargo(java.lang.Integer cargoCargo){
    this.cargoCargo = cargoCargo;
    return this;
  }

  /**
   * Obtém cartoriociv
   * return cartoriociv
   * @generated
   */
  
  public java.lang.String getCartoriociv(){
    return this.cartoriociv;
  }

  /**
   * Define cartoriociv
   * @param cartoriociv cartoriociv
   * @generated
   */
  public HyProfissionais setCartoriociv(java.lang.String cartoriociv){
    this.cartoriociv = cartoriociv;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public HyProfissionais setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém cidadenasc
   * return cidadenasc
   * @generated
   */
  
  public java.lang.String getCidadenasc(){
    return this.cidadenasc;
  }

  /**
   * Define cidadenasc
   * @param cidadenasc cidadenasc
   * @generated
   */
  public HyProfissionais setCidadenasc(java.lang.String cidadenasc){
    this.cidadenasc = cidadenasc;
    return this;
  }

  /**
   * Obtém cns
   * return cns
   * @generated
   */
  
  public java.lang.Long getCns(){
    return this.cns;
  }

  /**
   * Define cns
   * @param cns cns
   * @generated
   */
  public HyProfissionais setCns(java.lang.Long cns){
    this.cns = cns;
    return this;
  }

  /**
   * Obtém complend
   * return complend
   * @generated
   */
  
  public java.lang.String getComplend(){
    return this.complend;
  }

  /**
   * Define complend
   * @param complend complend
   * @generated
   */
  public HyProfissionais setComplend(java.lang.String complend){
    this.complend = complend;
    return this;
  }

  /**
   * Obtém conta
   * return conta
   * @generated
   */
  
  public java.lang.String getConta(){
    return this.conta;
  }

  /**
   * Define conta
   * @param conta conta
   * @generated
   */
  public HyProfissionais setConta(java.lang.String conta){
    this.conta = conta;
    return this;
  }

  /**
   * Obtém cr
   * return cr
   * @generated
   */
  
  public java.lang.String getCr(){
    return this.cr;
  }

  /**
   * Define cr
   * @param cr cr
   * @generated
   */
  public HyProfissionais setCr(java.lang.String cr){
    this.cr = cr;
    return this;
  }

  /**
   * Obtém ctps
   * return ctps
   * @generated
   */
  
  public java.lang.Integer getCtps(){
    return this.ctps;
  }

  /**
   * Define ctps
   * @param ctps ctps
   * @generated
   */
  public HyProfissionais setCtps(java.lang.Integer ctps){
    this.ctps = ctps;
    return this;
  }

  /**
   * Obtém ctpsdata
   * return ctpsdata
   * @generated
   */
  
  public java.util.Date getCtpsdata(){
    return this.ctpsdata;
  }

  /**
   * Define ctpsdata
   * @param ctpsdata ctpsdata
   * @generated
   */
  public HyProfissionais setCtpsdata(java.util.Date ctpsdata){
    this.ctpsdata = ctpsdata;
    return this;
  }

  /**
   * Obtém ctpsserie
   * return ctpsserie
   * @generated
   */
  
  public java.lang.Integer getCtpsserie(){
    return this.ctpsserie;
  }

  /**
   * Define ctpsserie
   * @param ctpsserie ctpsserie
   * @generated
   */
  public HyProfissionais setCtpsserie(java.lang.Integer ctpsserie){
    this.ctpsserie = ctpsserie;
    return this;
  }

  /**
   * Obtém ctpsuf
   * return ctpsuf
   * @generated
   */
  
  public java.lang.String getCtpsuf(){
    return this.ctpsuf;
  }

  /**
   * Define ctpsuf
   * @param ctpsuf ctpsuf
   * @generated
   */
  public HyProfissionais setCtpsuf(java.lang.String ctpsuf){
    this.ctpsuf = ctpsuf;
    return this;
  }

  /**
   * Obtém dataCad
   * return dataCad
   * @generated
   */
  
  public java.util.Date getDataCad(){
    return this.dataCad;
  }

  /**
   * Define dataCad
   * @param dataCad dataCad
   * @generated
   */
  public HyProfissionais setDataCad(java.util.Date dataCad){
    this.dataCad = dataCad;
    return this;
  }

  /**
   * Obtém dataemisciv
   * return dataemisciv
   * @generated
   */
  
  public java.util.Date getDataemisciv(){
    return this.dataemisciv;
  }

  /**
   * Define dataemisciv
   * @param dataemisciv dataemisciv
   * @generated
   */
  public HyProfissionais setDataemisciv(java.util.Date dataemisciv){
    this.dataemisciv = dataemisciv;
    return this;
  }

  /**
   * Obtém dataemisident
   * return dataemisident
   * @generated
   */
  
  public java.util.Date getDataemisident(){
    return this.dataemisident;
  }

  /**
   * Define dataemisident
   * @param dataemisident dataemisident
   * @generated
   */
  public HyProfissionais setDataemisident(java.util.Date dataemisident){
    this.dataemisident = dataemisident;
    return this;
  }

  /**
   * Obtém dataentrest
   * return dataentrest
   * @generated
   */
  
  public java.util.Date getDataentrest(){
    return this.dataentrest;
  }

  /**
   * Define dataentrest
   * @param dataentrest dataentrest
   * @generated
   */
  public HyProfissionais setDataentrest(java.util.Date dataentrest){
    this.dataentrest = dataentrest;
    return this;
  }

  /**
   * Obtém datanasc
   * return datanasc
   * @generated
   */
  
  public java.util.Date getDatanasc(){
    return this.datanasc;
  }

  /**
   * Define datanasc
   * @param datanasc datanasc
   * @generated
   */
  public HyProfissionais setDatanasc(java.util.Date datanasc){
    this.datanasc = datanasc;
    return this;
  }

  /**
   * Obtém datanatur
   * return datanatur
   * @generated
   */
  
  public java.util.Date getDatanatur(){
    return this.datanatur;
  }

  /**
   * Define datanatur
   * @param datanatur datanatur
   * @generated
   */
  public HyProfissionais setDatanatur(java.util.Date datanatur){
    this.datanatur = datanatur;
    return this;
  }

  /**
   * Obtém dtinativ
   * return dtinativ
   * @generated
   */
  
  public java.util.Date getDtinativ(){
    return this.dtinativ;
  }

  /**
   * Define dtinativ
   * @param dtinativ dtinativ
   * @generated
   */
  public HyProfissionais setDtinativ(java.util.Date dtinativ){
    this.dtinativ = dtinativ;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public HyProfissionais setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém escolaridade
   * return escolaridade
   * @generated
   */
  
  public java.lang.Integer getEscolaridade(){
    return this.escolaridade;
  }

  /**
   * Define escolaridade
   * @param escolaridade escolaridade
   * @generated
   */
  public HyProfissionais setEscolaridade(java.lang.Integer escolaridade){
    this.escolaridade = escolaridade;
    return this;
  }

  /**
   * Obtém etnia
   * return etnia
   * @generated
   */
  
  public java.lang.Long getEtnia(){
    return this.etnia;
  }

  /**
   * Define etnia
   * @param etnia etnia
   * @generated
   */
  public HyProfissionais setEtnia(java.lang.Long etnia){
    this.etnia = etnia;
    return this;
  }

  /**
   * Obtém folhaciv
   * return folhaciv
   * @generated
   */
  
  public java.lang.String getFolhaciv(){
    return this.folhaciv;
  }

  /**
   * Define folhaciv
   * @param folhaciv folhaciv
   * @generated
   */
  public HyProfissionais setFolhaciv(java.lang.String folhaciv){
    this.folhaciv = folhaciv;
    return this;
  }

  /**
   * Obtém fone
   * return fone
   * @generated
   */
  
  public java.lang.String getFone(){
    return this.fone;
  }

  /**
   * Define fone
   * @param fone fone
   * @generated
   */
  public HyProfissionais setFone(java.lang.String fone){
    this.fone = fone;
    return this;
  }

  /**
   * Obtém foneDdd
   * return foneDdd
   * @generated
   */
  
  public java.lang.Integer getFoneDdd(){
    return this.foneDdd;
  }

  /**
   * Define foneDdd
   * @param foneDdd foneDdd
   * @generated
   */
  public HyProfissionais setFoneDdd(java.lang.Integer foneDdd){
    this.foneDdd = foneDdd;
    return this;
  }

  /**
   * Obtém freqescola
   * return freqescola
   * @generated
   */
  
  public java.lang.String getFreqescola(){
    return this.freqescola;
  }

  /**
   * Define freqescola
   * @param freqescola freqescola
   * @generated
   */
  public HyProfissionais setFreqescola(java.lang.String freqescola){
    this.freqescola = freqescola;
    return this;
  }

  /**
   * Obtém funcaoFuncao
   * return funcaoFuncao
   * @generated
   */
  
  public java.lang.Integer getFuncaoFuncao(){
    return this.funcaoFuncao;
  }

  /**
   * Define funcaoFuncao
   * @param funcaoFuncao funcaoFuncao
   * @generated
   */
  public HyProfissionais setFuncaoFuncao(java.lang.Integer funcaoFuncao){
    this.funcaoFuncao = funcaoFuncao;
    return this;
  }

  /**
   * Obtém gerarpessoa
   * return gerarpessoa
   * @generated
   */
  
  public java.lang.String getGerarpessoa(){
    return this.gerarpessoa;
  }

  /**
   * Define gerarpessoa
   * @param gerarpessoa gerarpessoa
   * @generated
   */
  public HyProfissionais setGerarpessoa(java.lang.String gerarpessoa){
    this.gerarpessoa = gerarpessoa;
    return this;
  }

  /**
   * Obtém lastupdate
   * return lastupdate
   * @generated
   */
  
  public java.util.Date getLastupdate(){
    return this.lastupdate;
  }

  /**
   * Define lastupdate
   * @param lastupdate lastupdate
   * @generated
   */
  public HyProfissionais setLastupdate(java.util.Date lastupdate){
    this.lastupdate = lastupdate;
    return this;
  }

  /**
   * Obtém lfces018
   * return lfces018
   * @generated
   */
  
  public java.lang.String getLfces018(){
    return this.lfces018;
  }

  /**
   * Define lfces018
   * @param lfces018 lfces018
   * @generated
   */
  public HyProfissionais setLfces018(java.lang.String lfces018){
    this.lfces018 = lfces018;
    return this;
  }

  /**
   * Obtém livrociv
   * return livrociv
   * @generated
   */
  
  public java.lang.String getLivrociv(){
    return this.livrociv;
  }

  /**
   * Define livrociv
   * @param livrociv livrociv
   * @generated
   */
  public HyProfissionais setLivrociv(java.lang.String livrociv){
    this.livrociv = livrociv;
    return this;
  }

  /**
   * Obtém logrCodigo
   * return logrCodigo
   * @generated
   */
  
  public java.lang.String getLogrCodigo(){
    return this.logrCodigo;
  }

  /**
   * Define logrCodigo
   * @param logrCodigo logrCodigo
   * @generated
   */
  public HyProfissionais setLogrCodigo(java.lang.String logrCodigo){
    this.logrCodigo = logrCodigo;
    return this;
  }

  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }

  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public HyProfissionais setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Obtém mae
   * return mae
   * @generated
   */
  
  public java.lang.String getMae(){
    return this.mae;
  }

  /**
   * Define mae
   * @param mae mae
   * @generated
   */
  public HyProfissionais setMae(java.lang.String mae){
    this.mae = mae;
    return this;
  }

  /**
   * Obtém matricula
   * return matricula
   * @generated
   */
  
  public java.lang.Long getMatricula(){
    return this.matricula;
  }

  /**
   * Define matricula
   * @param matricula matricula
   * @generated
   */
  public HyProfissionais setMatricula(java.lang.Long matricula){
    this.matricula = matricula;
    return this;
  }

  /**
   * Obtém mbairroCodigo
   * return mbairroCodigo
   * @generated
   */
  
  public java.lang.String getMbairroCodigo(){
    return this.mbairroCodigo;
  }

  /**
   * Define mbairroCodigo
   * @param mbairroCodigo mbairroCodigo
   * @generated
   */
  public HyProfissionais setMbairroCodigo(java.lang.String mbairroCodigo){
    this.mbairroCodigo = mbairroCodigo;
    return this;
  }

  /**
   * Obtém municipioCodigo
   * return municipioCodigo
   * @generated
   */
  
  public java.lang.String getMunicipioCodigo(){
    return this.municipioCodigo;
  }

  /**
   * Define municipioCodigo
   * @param municipioCodigo municipioCodigo
   * @generated
   */
  public HyProfissionais setMunicipioCodigo(java.lang.String municipioCodigo){
    this.municipioCodigo = municipioCodigo;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public HyProfissionais setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém numcpf
   * return numcpf
   * @generated
   */
  
  public java.lang.Long getNumcpf(){
    return this.numcpf;
  }

  /**
   * Define numcpf
   * @param numcpf numcpf
   * @generated
   */
  public HyProfissionais setNumcpf(java.lang.Long numcpf){
    this.numcpf = numcpf;
    return this;
  }

  /**
   * Obtém numeroend
   * return numeroend
   * @generated
   */
  
  public java.lang.String getNumeroend(){
    return this.numeroend;
  }

  /**
   * Define numeroend
   * @param numeroend numeroend
   * @generated
   */
  public HyProfissionais setNumeroend(java.lang.String numeroend){
    this.numeroend = numeroend;
    return this;
  }

  /**
   * Obtém numrg
   * return numrg
   * @generated
   */
  
  public java.lang.String getNumrg(){
    return this.numrg;
  }

  /**
   * Define numrg
   * @param numrg numrg
   * @generated
   */
  public HyProfissionais setNumrg(java.lang.String numrg){
    this.numrg = numrg;
    return this;
  }

  /**
   * Obtém numtiteleitor
   * return numtiteleitor
   * @generated
   */
  
  public java.lang.Long getNumtiteleitor(){
    return this.numtiteleitor;
  }

  /**
   * Define numtiteleitor
   * @param numtiteleitor numtiteleitor
   * @generated
   */
  public HyProfissionais setNumtiteleitor(java.lang.Long numtiteleitor){
    this.numtiteleitor = numtiteleitor;
    return this;
  }

  /**
   * Obtém obs
   * return obs
   * @generated
   */
  
  public java.lang.String getObs(){
    return this.obs;
  }

  /**
   * Define obs
   * @param obs obs
   * @generated
   */
  public HyProfissionais setObs(java.lang.String obs){
    this.obs = obs;
    return this;
  }

  /**
   * Obtém orgaorg
   * return orgaorg
   * @generated
   */
  
  public java.lang.String getOrgaorg(){
    return this.orgaorg;
  }

  /**
   * Define orgaorg
   * @param orgaorg orgaorg
   * @generated
   */
  public HyProfissionais setOrgaorg(java.lang.String orgaorg){
    this.orgaorg = orgaorg;
    return this;
  }

  /**
   * Obtém orgemisid
   * return orgemisid
   * @generated
   */
  
  public java.lang.Integer getOrgemisid(){
    return this.orgemisid;
  }

  /**
   * Define orgemisid
   * @param orgemisid orgemisid
   * @generated
   */
  public HyProfissionais setOrgemisid(java.lang.Integer orgemisid){
    this.orgemisid = orgemisid;
    return this;
  }

  /**
   * Obtém orgemisprof
   * return orgemisprof
   * @generated
   */
  
  public java.lang.Integer getOrgemisprof(){
    return this.orgemisprof;
  }

  /**
   * Define orgemisprof
   * @param orgemisprof orgemisprof
   * @generated
   */
  public HyProfissionais setOrgemisprof(java.lang.Integer orgemisprof){
    this.orgemisprof = orgemisprof;
    return this;
  }

  /**
   * Obtém pai
   * return pai
   * @generated
   */
  
  public java.lang.String getPai(){
    return this.pai;
  }

  /**
   * Define pai
   * @param pai pai
   * @generated
   */
  public HyProfissionais setPai(java.lang.String pai){
    this.pai = pai;
    return this;
  }

  /**
   * Obtém paisCodigo
   * return paisCodigo
   * @generated
   */
  
  public java.lang.String getPaisCodigo(){
    return this.paisCodigo;
  }

  /**
   * Define paisCodigo
   * @param paisCodigo paisCodigo
   * @generated
   */
  public HyProfissionais setPaisCodigo(java.lang.String paisCodigo){
    this.paisCodigo = paisCodigo;
    return this;
  }

  /**
   * Obtém pessoa
   * return pessoa
   * @generated
   */
  
  public java.lang.Long getPessoa(){
    return this.pessoa;
  }

  /**
   * Define pessoa
   * @param pessoa pessoa
   * @generated
   */
  public HyProfissionais setPessoa(java.lang.Long pessoa){
    this.pessoa = pessoa;
    return this;
  }

  /**
   * Obtém pisPasep
   * return pisPasep
   * @generated
   */
  
  public java.lang.Long getPisPasep(){
    return this.pisPasep;
  }

  /**
   * Define pisPasep
   * @param pisPasep pisPasep
   * @generated
   */
  public HyProfissionais setPisPasep(java.lang.Long pisPasep){
    this.pisPasep = pisPasep;
    return this;
  }

  /**
   * Obtém portarianatur
   * return portarianatur
   * @generated
   */
  
  public java.lang.String getPortarianatur(){
    return this.portarianatur;
  }

  /**
   * Define portarianatur
   * @param portarianatur portarianatur
   * @generated
   */
  public HyProfissionais setPortarianatur(java.lang.String portarianatur){
    this.portarianatur = portarianatur;
    return this;
  }

  /**
   * Obtém profis
   * return profis
   * @generated
   */
  
  public java.lang.String getProfis(){
    return this.profis;
  }

  /**
   * Define profis
   * @param profis profis
   * @generated
   */
  public HyProfissionais setProfis(java.lang.String profis){
    this.profis = profis;
    return this;
  }

  /**
   * Obtém profisIntegracao
   * return profisIntegracao
   * @generated
   */
  
  public java.lang.String getProfisIntegracao(){
    return this.profisIntegracao;
  }

  /**
   * Define profisIntegracao
   * @param profisIntegracao profisIntegracao
   * @generated
   */
  public HyProfissionais setProfisIntegracao(java.lang.String profisIntegracao){
    this.profisIntegracao = profisIntegracao;
    return this;
  }

  /**
   * Obtém racaCodigo
   * return racaCodigo
   * @generated
   */
  
  public java.lang.String getRacaCodigo(){
    return this.racaCodigo;
  }

  /**
   * Define racaCodigo
   * @param racaCodigo racaCodigo
   * @generated
   */
  public HyProfissionais setRacaCodigo(java.lang.String racaCodigo){
    this.racaCodigo = racaCodigo;
    return this;
  }

  /**
   * Obtém referEnd
   * return referEnd
   * @generated
   */
  
  public java.lang.String getReferEnd(){
    return this.referEnd;
  }

  /**
   * Define referEnd
   * @param referEnd referEnd
   * @generated
   */
  public HyProfissionais setReferEnd(java.lang.String referEnd){
    this.referEnd = referEnd;
    return this;
  }

  /**
   * Obtém secaotiteleitor
   * return secaotiteleitor
   * @generated
   */
  
  public java.lang.Integer getSecaotiteleitor(){
    return this.secaotiteleitor;
  }

  /**
   * Define secaotiteleitor
   * @param secaotiteleitor secaotiteleitor
   * @generated
   */
  public HyProfissionais setSecaotiteleitor(java.lang.Integer secaotiteleitor){
    this.secaotiteleitor = secaotiteleitor;
    return this;
  }

  /**
   * Obtém sexo
   * return sexo
   * @generated
   */
  
  public java.lang.String getSexo(){
    return this.sexo;
  }

  /**
   * Define sexo
   * @param sexo sexo
   * @generated
   */
  public HyProfissionais setSexo(java.lang.String sexo){
    this.sexo = sexo;
    return this;
  }

  /**
   * Obtém situacaofam
   * return situacaofam
   * @generated
   */
  
  public java.lang.Integer getSituacaofam(){
    return this.situacaofam;
  }

  /**
   * Define situacaofam
   * @param situacaofam situacaofam
   * @generated
   */
  public HyProfissionais setSituacaofam(java.lang.Integer situacaofam){
    this.situacaofam = situacaofam;
    return this;
  }

  /**
   * Obtém termociv
   * return termociv
   * @generated
   */
  
  public java.lang.String getTermociv(){
    return this.termociv;
  }

  /**
   * Define termociv
   * @param termociv termociv
   * @generated
   */
  public HyProfissionais setTermociv(java.lang.String termociv){
    this.termociv = termociv;
    return this;
  }

  /**
   * Obtém tipocertciv
   * return tipocertciv
   * @generated
   */
  
  public java.lang.String getTipocertciv(){
    return this.tipocertciv;
  }

  /**
   * Define tipocertciv
   * @param tipocertciv tipocertciv
   * @generated
   */
  public HyProfissionais setTipocertciv(java.lang.String tipocertciv){
    this.tipocertciv = tipocertciv;
    return this;
  }

  /**
   * Obtém tipocr
   * return tipocr
   * @generated
   */
  
  public java.lang.String getTipocr(){
    return this.tipocr;
  }

  /**
   * Define tipocr
   * @param tipocr tipocr
   * @generated
   */
  public HyProfissionais setTipocr(java.lang.String tipocr){
    this.tipocr = tipocr;
    return this;
  }

  /**
   * Obtém tipodoc
   * return tipodoc
   * @generated
   */
  
  public java.lang.String getTipodoc(){
    return this.tipodoc;
  }

  /**
   * Define tipodoc
   * @param tipodoc tipodoc
   * @generated
   */
  public HyProfissionais setTipodoc(java.lang.String tipodoc){
    this.tipodoc = tipodoc;
    return this;
  }

  /**
   * Obtém tipologend
   * return tipologend
   * @generated
   */
  
  public java.lang.String getTipologend(){
    return this.tipologend;
  }

  /**
   * Define tipologend
   * @param tipologend tipologend
   * @generated
   */
  public HyProfissionais setTipologend(java.lang.String tipologend){
    this.tipologend = tipologend;
    return this;
  }

  /**
   * Obtém ufcr
   * return ufcr
   * @generated
   */
  
  public java.lang.String getUfcr(){
    return this.ufcr;
  }

  /**
   * Define ufcr
   * @param ufcr ufcr
   * @generated
   */
  public HyProfissionais setUfcr(java.lang.String ufcr){
    this.ufcr = ufcr;
    return this;
  }

  /**
   * Obtém ufender
   * return ufender
   * @generated
   */
  
  public java.lang.String getUfender(){
    return this.ufender;
  }

  /**
   * Define ufender
   * @param ufender ufender
   * @generated
   */
  public HyProfissionais setUfender(java.lang.String ufender){
    this.ufender = ufender;
    return this;
  }

  /**
   * Obtém ufnasc
   * return ufnasc
   * @generated
   */
  
  public java.lang.String getUfnasc(){
    return this.ufnasc;
  }

  /**
   * Define ufnasc
   * @param ufnasc ufnasc
   * @generated
   */
  public HyProfissionais setUfnasc(java.lang.String ufnasc){
    this.ufnasc = ufnasc;
    return this;
  }

  /**
   * Obtém ufrg
   * return ufrg
   * @generated
   */
  
  public java.lang.String getUfrg(){
    return this.ufrg;
  }

  /**
   * Define ufrg
   * @param ufrg ufrg
   * @generated
   */
  public HyProfissionais setUfrg(java.lang.String ufrg){
    this.ufrg = ufrg;
    return this;
  }

  /**
   * Obtém usAtualiz
   * return usAtualiz
   * @generated
   */
  
  public java.lang.String getUsAtualiz(){
    return this.usAtualiz;
  }

  /**
   * Define usAtualiz
   * @param usAtualiz usAtualiz
   * @generated
   */
  public HyProfissionais setUsAtualiz(java.lang.String usAtualiz){
    this.usAtualiz = usAtualiz;
    return this;
  }

  /**
   * Obtém usCad
   * return usCad
   * @generated
   */
  
  public java.lang.String getUsCad(){
    return this.usCad;
  }

  /**
   * Define usCad
   * @param usCad usCad
   * @generated
   */
  public HyProfissionais setUsCad(java.lang.String usCad){
    this.usCad = usCad;
    return this;
  }

  /**
   * Obtém usuAtualiz
   * return usuAtualiz
   * @generated
   */
  
  public java.lang.String getUsuAtualiz(){
    return this.usuAtualiz;
  }

  /**
   * Define usuAtualiz
   * @param usuAtualiz usuAtualiz
   * @generated
   */
  public HyProfissionais setUsuAtualiz(java.lang.String usuAtualiz){
    this.usuAtualiz = usuAtualiz;
    return this;
  }

  /**
   * Obtém usuCad
   * return usuCad
   * @generated
   */
  
  public java.lang.String getUsuCad(){
    return this.usuCad;
  }

  /**
   * Define usuCad
   * @param usuCad usuCad
   * @generated
   */
  public HyProfissionais setUsuCad(java.lang.String usuCad){
    this.usuCad = usuCad;
    return this;
  }

  /**
   * Obtém usuarioUsuario
   * return usuarioUsuario
   * @generated
   */
  
  public java.lang.String getUsuarioUsuario(){
    return this.usuarioUsuario;
  }

  /**
   * Define usuarioUsuario
   * @param usuarioUsuario usuarioUsuario
   * @generated
   */
  public HyProfissionais setUsuarioUsuario(java.lang.String usuarioUsuario){
    this.usuarioUsuario = usuarioUsuario;
    return this;
  }

  /**
   * Obtém viaImpcnes
   * return viaImpcnes
   * @generated
   */
  
  public java.lang.String getViaImpcnes(){
    return this.viaImpcnes;
  }

  /**
   * Define viaImpcnes
   * @param viaImpcnes viaImpcnes
   * @generated
   */
  public HyProfissionais setViaImpcnes(java.lang.String viaImpcnes){
    this.viaImpcnes = viaImpcnes;
    return this;
  }

  /**
   * Obtém zonatiteleitor
   * return zonatiteleitor
   * @generated
   */
  
  public java.lang.Integer getZonatiteleitor(){
    return this.zonatiteleitor;
  }

  /**
   * Define zonatiteleitor
   * @param zonatiteleitor zonatiteleitor
   * @generated
   */
  public HyProfissionais setZonatiteleitor(java.lang.Integer zonatiteleitor){
    this.zonatiteleitor = zonatiteleitor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyProfissionais object = (HyProfissionais)obj;
    if (profis != null ? !profis.equals(object.profis) : object.profis != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((profis == null) ? 0 : profis.hashCode());
    return result;
  }

}
