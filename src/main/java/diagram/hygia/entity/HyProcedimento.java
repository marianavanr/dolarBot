package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_PROCEDIMENTO
 * @generated
 */
@Entity
@Table(name = "\"HY_PROCEDIMENTO\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyProcedimento")
public class HyProcedimento implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "procedimento", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String procedimento;

  /**
  * @generated
  */
  @Column(name = "abrev", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String abrev;

  /**
  * @generated
  */
  @Column(name = "agenda", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String agenda;

  /**
  * @generated
  */
  @Column(name = "ambulat", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ambulat;

  /**
  * @generated
  */
  @Column(name = "cid", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cid;

  /**
  * @generated
  */
  @Column(name = "complexo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String complexo;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datadesativ", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date datadesativ;

  /**
  * @generated
  */
  @Column(name = "desativado", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String desativado;

  /**
  * @generated
  */
  @Column(name = "DIAS_INTERNACAO", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer diasInternacao;

  /**
  * @generated
  */
  @Column(name = "ESPEC_BPA", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String especBpa;

  /**
  * @generated
  */
  @Column(name = "EX_AUT", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String exAut;

  /**
  * @generated
  */
  @Column(name = "exame", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String exame;

  /**
  * @generated
  */
  @Column(name = "faturavel", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String faturavel;

  /**
  * @generated
  */
  @Column(name = "formaorg", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String formaorg;

  /**
  * @generated
  */
  @Column(name = "fxetaria", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String fxetaria;

  /**
  * @generated
  */
  @Column(name = "grupoat", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String grupoat;

  /**
  * @generated
  */
  @Column(name = "homem", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String homem;

  /**
  * @generated
  */
  @Column(name = "idademax", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.Integer idademax;

  /**
  * @generated
  */
  @Column(name = "idademin", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.Integer idademin;

  /**
  * @generated
  */
  @Column(name = "internacao", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String internacao;

  /**
  * @generated
  */
  @Column(name = "intervalo", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer intervalo;

  /**
  * @generated
  */
  @Column(name = "mapadiario", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mapadiario;

  /**
  * @generated
  */
  @Column(name = "maxlanc", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer maxlanc;

  /**
  * @generated
  */
  @Column(name = "MAXLANC_MD", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer maxlancMd;

  /**
  * @generated
  */
  @Column(name = "motivodesativ", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String motivodesativ;

  /**
  * @generated
  */
  @Column(name = "mulher", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mulher;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, length=250, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "prorrogavel", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String prorrogavel;

  /**
  * @generated
  */
  @Column(name = "qtdmax", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.Integer qtdmax;

  /**
  * @generated
  */
  @Column(name = "qtdmin", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.Integer qtdmin;

  /**
  * @generated
  */
  @Column(name = "SUBGRPROC_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String subgrprocCodigo;

  /**
  * @generated
  */
  @Column(name = "SUBGRPROC_GRUPOPROC_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String subgrprocGrupoprocCodigo;

  /**
  * @generated
  */
  @Column(name = "tempoexec", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer tempoexec;

  /**
  * @generated
  */
  @Column(name = "TIPO_FINAN", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String tipoFinan;

  /**
  * @generated
  */
  @Column(name = "tipoat", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String tipoat;

  /**
  * @generated
  */
  @Column(name = "vacina", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String vacina;

  /**
   * Construtor
   * @generated
   */
  public HyProcedimento(){
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
  public HyProcedimento setAbrev(java.lang.String abrev){
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
  public HyProcedimento setAgenda(java.lang.String agenda){
    this.agenda = agenda;
    return this;
  }

  /**
   * Obtém ambulat
   * return ambulat
   * @generated
   */
  
  public java.lang.String getAmbulat(){
    return this.ambulat;
  }

  /**
   * Define ambulat
   * @param ambulat ambulat
   * @generated
   */
  public HyProcedimento setAmbulat(java.lang.String ambulat){
    this.ambulat = ambulat;
    return this;
  }

  /**
   * Obtém cid
   * return cid
   * @generated
   */
  
  public java.lang.String getCid(){
    return this.cid;
  }

  /**
   * Define cid
   * @param cid cid
   * @generated
   */
  public HyProcedimento setCid(java.lang.String cid){
    this.cid = cid;
    return this;
  }

  /**
   * Obtém complexo
   * return complexo
   * @generated
   */
  
  public java.lang.String getComplexo(){
    return this.complexo;
  }

  /**
   * Define complexo
   * @param complexo complexo
   * @generated
   */
  public HyProcedimento setComplexo(java.lang.String complexo){
    this.complexo = complexo;
    return this;
  }

  /**
   * Obtém datadesativ
   * return datadesativ
   * @generated
   */
  
  public java.util.Date getDatadesativ(){
    return this.datadesativ;
  }

  /**
   * Define datadesativ
   * @param datadesativ datadesativ
   * @generated
   */
  public HyProcedimento setDatadesativ(java.util.Date datadesativ){
    this.datadesativ = datadesativ;
    return this;
  }

  /**
   * Obtém desativado
   * return desativado
   * @generated
   */
  
  public java.lang.String getDesativado(){
    return this.desativado;
  }

  /**
   * Define desativado
   * @param desativado desativado
   * @generated
   */
  public HyProcedimento setDesativado(java.lang.String desativado){
    this.desativado = desativado;
    return this;
  }

  /**
   * Obtém diasInternacao
   * return diasInternacao
   * @generated
   */
  
  public java.lang.Integer getDiasInternacao(){
    return this.diasInternacao;
  }

  /**
   * Define diasInternacao
   * @param diasInternacao diasInternacao
   * @generated
   */
  public HyProcedimento setDiasInternacao(java.lang.Integer diasInternacao){
    this.diasInternacao = diasInternacao;
    return this;
  }

  /**
   * Obtém especBpa
   * return especBpa
   * @generated
   */
  
  public java.lang.String getEspecBpa(){
    return this.especBpa;
  }

  /**
   * Define especBpa
   * @param especBpa especBpa
   * @generated
   */
  public HyProcedimento setEspecBpa(java.lang.String especBpa){
    this.especBpa = especBpa;
    return this;
  }

  /**
   * Obtém exAut
   * return exAut
   * @generated
   */
  
  public java.lang.String getExAut(){
    return this.exAut;
  }

  /**
   * Define exAut
   * @param exAut exAut
   * @generated
   */
  public HyProcedimento setExAut(java.lang.String exAut){
    this.exAut = exAut;
    return this;
  }

  /**
   * Obtém exame
   * return exame
   * @generated
   */
  
  public java.lang.String getExame(){
    return this.exame;
  }

  /**
   * Define exame
   * @param exame exame
   * @generated
   */
  public HyProcedimento setExame(java.lang.String exame){
    this.exame = exame;
    return this;
  }

  /**
   * Obtém faturavel
   * return faturavel
   * @generated
   */
  
  public java.lang.String getFaturavel(){
    return this.faturavel;
  }

  /**
   * Define faturavel
   * @param faturavel faturavel
   * @generated
   */
  public HyProcedimento setFaturavel(java.lang.String faturavel){
    this.faturavel = faturavel;
    return this;
  }

  /**
   * Obtém formaorg
   * return formaorg
   * @generated
   */
  
  public java.lang.String getFormaorg(){
    return this.formaorg;
  }

  /**
   * Define formaorg
   * @param formaorg formaorg
   * @generated
   */
  public HyProcedimento setFormaorg(java.lang.String formaorg){
    this.formaorg = formaorg;
    return this;
  }

  /**
   * Obtém fxetaria
   * return fxetaria
   * @generated
   */
  
  public java.lang.String getFxetaria(){
    return this.fxetaria;
  }

  /**
   * Define fxetaria
   * @param fxetaria fxetaria
   * @generated
   */
  public HyProcedimento setFxetaria(java.lang.String fxetaria){
    this.fxetaria = fxetaria;
    return this;
  }

  /**
   * Obtém grupoat
   * return grupoat
   * @generated
   */
  
  public java.lang.String getGrupoat(){
    return this.grupoat;
  }

  /**
   * Define grupoat
   * @param grupoat grupoat
   * @generated
   */
  public HyProcedimento setGrupoat(java.lang.String grupoat){
    this.grupoat = grupoat;
    return this;
  }

  /**
   * Obtém homem
   * return homem
   * @generated
   */
  
  public java.lang.String getHomem(){
    return this.homem;
  }

  /**
   * Define homem
   * @param homem homem
   * @generated
   */
  public HyProcedimento setHomem(java.lang.String homem){
    this.homem = homem;
    return this;
  }

  /**
   * Obtém idademax
   * return idademax
   * @generated
   */
  
  public java.lang.Integer getIdademax(){
    return this.idademax;
  }

  /**
   * Define idademax
   * @param idademax idademax
   * @generated
   */
  public HyProcedimento setIdademax(java.lang.Integer idademax){
    this.idademax = idademax;
    return this;
  }

  /**
   * Obtém idademin
   * return idademin
   * @generated
   */
  
  public java.lang.Integer getIdademin(){
    return this.idademin;
  }

  /**
   * Define idademin
   * @param idademin idademin
   * @generated
   */
  public HyProcedimento setIdademin(java.lang.Integer idademin){
    this.idademin = idademin;
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
  public HyProcedimento setInternacao(java.lang.String internacao){
    this.internacao = internacao;
    return this;
  }

  /**
   * Obtém intervalo
   * return intervalo
   * @generated
   */
  
  public java.lang.Integer getIntervalo(){
    return this.intervalo;
  }

  /**
   * Define intervalo
   * @param intervalo intervalo
   * @generated
   */
  public HyProcedimento setIntervalo(java.lang.Integer intervalo){
    this.intervalo = intervalo;
    return this;
  }

  /**
   * Obtém mapadiario
   * return mapadiario
   * @generated
   */
  
  public java.lang.String getMapadiario(){
    return this.mapadiario;
  }

  /**
   * Define mapadiario
   * @param mapadiario mapadiario
   * @generated
   */
  public HyProcedimento setMapadiario(java.lang.String mapadiario){
    this.mapadiario = mapadiario;
    return this;
  }

  /**
   * Obtém maxlanc
   * return maxlanc
   * @generated
   */
  
  public java.lang.Integer getMaxlanc(){
    return this.maxlanc;
  }

  /**
   * Define maxlanc
   * @param maxlanc maxlanc
   * @generated
   */
  public HyProcedimento setMaxlanc(java.lang.Integer maxlanc){
    this.maxlanc = maxlanc;
    return this;
  }

  /**
   * Obtém maxlancMd
   * return maxlancMd
   * @generated
   */
  
  public java.lang.Integer getMaxlancMd(){
    return this.maxlancMd;
  }

  /**
   * Define maxlancMd
   * @param maxlancMd maxlancMd
   * @generated
   */
  public HyProcedimento setMaxlancMd(java.lang.Integer maxlancMd){
    this.maxlancMd = maxlancMd;
    return this;
  }

  /**
   * Obtém motivodesativ
   * return motivodesativ
   * @generated
   */
  
  public java.lang.String getMotivodesativ(){
    return this.motivodesativ;
  }

  /**
   * Define motivodesativ
   * @param motivodesativ motivodesativ
   * @generated
   */
  public HyProcedimento setMotivodesativ(java.lang.String motivodesativ){
    this.motivodesativ = motivodesativ;
    return this;
  }

  /**
   * Obtém mulher
   * return mulher
   * @generated
   */
  
  public java.lang.String getMulher(){
    return this.mulher;
  }

  /**
   * Define mulher
   * @param mulher mulher
   * @generated
   */
  public HyProcedimento setMulher(java.lang.String mulher){
    this.mulher = mulher;
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
  public HyProcedimento setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém procedimento
   * return procedimento
   * @generated
   */
  
  public java.lang.String getProcedimento(){
    return this.procedimento;
  }

  /**
   * Define procedimento
   * @param procedimento procedimento
   * @generated
   */
  public HyProcedimento setProcedimento(java.lang.String procedimento){
    this.procedimento = procedimento;
    return this;
  }

  /**
   * Obtém prorrogavel
   * return prorrogavel
   * @generated
   */
  
  public java.lang.String getProrrogavel(){
    return this.prorrogavel;
  }

  /**
   * Define prorrogavel
   * @param prorrogavel prorrogavel
   * @generated
   */
  public HyProcedimento setProrrogavel(java.lang.String prorrogavel){
    this.prorrogavel = prorrogavel;
    return this;
  }

  /**
   * Obtém qtdmax
   * return qtdmax
   * @generated
   */
  
  public java.lang.Integer getQtdmax(){
    return this.qtdmax;
  }

  /**
   * Define qtdmax
   * @param qtdmax qtdmax
   * @generated
   */
  public HyProcedimento setQtdmax(java.lang.Integer qtdmax){
    this.qtdmax = qtdmax;
    return this;
  }

  /**
   * Obtém qtdmin
   * return qtdmin
   * @generated
   */
  
  public java.lang.Integer getQtdmin(){
    return this.qtdmin;
  }

  /**
   * Define qtdmin
   * @param qtdmin qtdmin
   * @generated
   */
  public HyProcedimento setQtdmin(java.lang.Integer qtdmin){
    this.qtdmin = qtdmin;
    return this;
  }

  /**
   * Obtém subgrprocCodigo
   * return subgrprocCodigo
   * @generated
   */
  
  public java.lang.String getSubgrprocCodigo(){
    return this.subgrprocCodigo;
  }

  /**
   * Define subgrprocCodigo
   * @param subgrprocCodigo subgrprocCodigo
   * @generated
   */
  public HyProcedimento setSubgrprocCodigo(java.lang.String subgrprocCodigo){
    this.subgrprocCodigo = subgrprocCodigo;
    return this;
  }

  /**
   * Obtém subgrprocGrupoprocCodigo
   * return subgrprocGrupoprocCodigo
   * @generated
   */
  
  public java.lang.String getSubgrprocGrupoprocCodigo(){
    return this.subgrprocGrupoprocCodigo;
  }

  /**
   * Define subgrprocGrupoprocCodigo
   * @param subgrprocGrupoprocCodigo subgrprocGrupoprocCodigo
   * @generated
   */
  public HyProcedimento setSubgrprocGrupoprocCodigo(java.lang.String subgrprocGrupoprocCodigo){
    this.subgrprocGrupoprocCodigo = subgrprocGrupoprocCodigo;
    return this;
  }

  /**
   * Obtém tempoexec
   * return tempoexec
   * @generated
   */
  
  public java.lang.Integer getTempoexec(){
    return this.tempoexec;
  }

  /**
   * Define tempoexec
   * @param tempoexec tempoexec
   * @generated
   */
  public HyProcedimento setTempoexec(java.lang.Integer tempoexec){
    this.tempoexec = tempoexec;
    return this;
  }

  /**
   * Obtém tipoFinan
   * return tipoFinan
   * @generated
   */
  
  public java.lang.String getTipoFinan(){
    return this.tipoFinan;
  }

  /**
   * Define tipoFinan
   * @param tipoFinan tipoFinan
   * @generated
   */
  public HyProcedimento setTipoFinan(java.lang.String tipoFinan){
    this.tipoFinan = tipoFinan;
    return this;
  }

  /**
   * Obtém tipoat
   * return tipoat
   * @generated
   */
  
  public java.lang.String getTipoat(){
    return this.tipoat;
  }

  /**
   * Define tipoat
   * @param tipoat tipoat
   * @generated
   */
  public HyProcedimento setTipoat(java.lang.String tipoat){
    this.tipoat = tipoat;
    return this;
  }

  /**
   * Obtém vacina
   * return vacina
   * @generated
   */
  
  public java.lang.String getVacina(){
    return this.vacina;
  }

  /**
   * Define vacina
   * @param vacina vacina
   * @generated
   */
  public HyProcedimento setVacina(java.lang.String vacina){
    this.vacina = vacina;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyProcedimento object = (HyProcedimento)obj;
    if (procedimento != null ? !procedimento.equals(object.procedimento) : object.procedimento != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((procedimento == null) ? 0 : procedimento.hashCode());
    return result;
  }

}
