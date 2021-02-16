package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_AGENDAS
 * @generated
 */
@Entity
@Table(name = "\"HY_AGENDAS\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyAgendas")
public class HyAgendas implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "numag", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.Long numag;

  /**
  * @generated
  */
  @Column(name = "administra", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String administra;

  /**
  * @generated
  */
  @Column(name = "atendgrupo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String atendgrupo;

  /**
  * @generated
  */
  @Column(name = "bloqueada", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String bloqueada;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_PROGRAMA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dataPrograma;

  /**
  * @generated
  */
  @Column(name = "ESPEC_ESPEC", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String especEspec;

  /**
  * @generated
  */
  @Column(name = "horafim", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer horafim;

  /**
  * @generated
  */
  @Column(name = "horaini", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Integer horaini;

  /**
  * @generated
  */
  @Column(name = "NUMAG_DC", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.Long numagDc;

  /**
  * @generated
  */
  @Column(name = "PROCED_PADRAO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String procedPadrao;

  /**
  * @generated
  */
  @Column(name = "PROFIS_PROFIS", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.String profisProfis;

  /**
  * @generated
  */
  @Column(name = "programa", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String programa;

  /**
  * @generated
  */
  @Column(name = "PUBLALVO_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String publalvoCodigo;

  /**
  * @generated
  */
  @Column(name = "quantag", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.Integer quantag;

  /**
  * @generated
  */
  @Column(name = "TIPOAT_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String tipoatCodigo;

  /**
  * @generated
  */
  @Column(name = "US_CODUNIDSAU", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usCodunidsau;

  /**
  * @generated
  */
  @Column(name = "vagas", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.Integer vagas;

  /**
   * Construtor
   * @generated
   */
  public HyAgendas(){
  }


  /**
   * Obtém administra
   * return administra
   * @generated
   */
  
  public java.lang.String getAdministra(){
    return this.administra;
  }

  /**
   * Define administra
   * @param administra administra
   * @generated
   */
  public HyAgendas setAdministra(java.lang.String administra){
    this.administra = administra;
    return this;
  }

  /**
   * Obtém atendgrupo
   * return atendgrupo
   * @generated
   */
  
  public java.lang.String getAtendgrupo(){
    return this.atendgrupo;
  }

  /**
   * Define atendgrupo
   * @param atendgrupo atendgrupo
   * @generated
   */
  public HyAgendas setAtendgrupo(java.lang.String atendgrupo){
    this.atendgrupo = atendgrupo;
    return this;
  }

  /**
   * Obtém bloqueada
   * return bloqueada
   * @generated
   */
  
  public java.lang.String getBloqueada(){
    return this.bloqueada;
  }

  /**
   * Define bloqueada
   * @param bloqueada bloqueada
   * @generated
   */
  public HyAgendas setBloqueada(java.lang.String bloqueada){
    this.bloqueada = bloqueada;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public HyAgendas setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém dataPrograma
   * return dataPrograma
   * @generated
   */
  
  public java.util.Date getDataPrograma(){
    return this.dataPrograma;
  }

  /**
   * Define dataPrograma
   * @param dataPrograma dataPrograma
   * @generated
   */
  public HyAgendas setDataPrograma(java.util.Date dataPrograma){
    this.dataPrograma = dataPrograma;
    return this;
  }

  /**
   * Obtém especEspec
   * return especEspec
   * @generated
   */
  
  public java.lang.String getEspecEspec(){
    return this.especEspec;
  }

  /**
   * Define especEspec
   * @param especEspec especEspec
   * @generated
   */
  public HyAgendas setEspecEspec(java.lang.String especEspec){
    this.especEspec = especEspec;
    return this;
  }

  /**
   * Obtém horafim
   * return horafim
   * @generated
   */
  
  public java.lang.Integer getHorafim(){
    return this.horafim;
  }

  /**
   * Define horafim
   * @param horafim horafim
   * @generated
   */
  public HyAgendas setHorafim(java.lang.Integer horafim){
    this.horafim = horafim;
    return this;
  }

  /**
   * Obtém horaini
   * return horaini
   * @generated
   */
  
  public java.lang.Integer getHoraini(){
    return this.horaini;
  }

  /**
   * Define horaini
   * @param horaini horaini
   * @generated
   */
  public HyAgendas setHoraini(java.lang.Integer horaini){
    this.horaini = horaini;
    return this;
  }

  /**
   * Obtém numag
   * return numag
   * @generated
   */
  
  public java.lang.Long getNumag(){
    return this.numag;
  }

  /**
   * Define numag
   * @param numag numag
   * @generated
   */
  public HyAgendas setNumag(java.lang.Long numag){
    this.numag = numag;
    return this;
  }

  /**
   * Obtém numagDc
   * return numagDc
   * @generated
   */
  
  public java.lang.Long getNumagDc(){
    return this.numagDc;
  }

  /**
   * Define numagDc
   * @param numagDc numagDc
   * @generated
   */
  public HyAgendas setNumagDc(java.lang.Long numagDc){
    this.numagDc = numagDc;
    return this;
  }

  /**
   * Obtém procedPadrao
   * return procedPadrao
   * @generated
   */
  
  public java.lang.String getProcedPadrao(){
    return this.procedPadrao;
  }

  /**
   * Define procedPadrao
   * @param procedPadrao procedPadrao
   * @generated
   */
  public HyAgendas setProcedPadrao(java.lang.String procedPadrao){
    this.procedPadrao = procedPadrao;
    return this;
  }

  /**
   * Obtém profisProfis
   * return profisProfis
   * @generated
   */
  
  public java.lang.String getProfisProfis(){
    return this.profisProfis;
  }

  /**
   * Define profisProfis
   * @param profisProfis profisProfis
   * @generated
   */
  public HyAgendas setProfisProfis(java.lang.String profisProfis){
    this.profisProfis = profisProfis;
    return this;
  }

  /**
   * Obtém programa
   * return programa
   * @generated
   */
  
  public java.lang.String getPrograma(){
    return this.programa;
  }

  /**
   * Define programa
   * @param programa programa
   * @generated
   */
  public HyAgendas setPrograma(java.lang.String programa){
    this.programa = programa;
    return this;
  }

  /**
   * Obtém publalvoCodigo
   * return publalvoCodigo
   * @generated
   */
  
  public java.lang.String getPublalvoCodigo(){
    return this.publalvoCodigo;
  }

  /**
   * Define publalvoCodigo
   * @param publalvoCodigo publalvoCodigo
   * @generated
   */
  public HyAgendas setPublalvoCodigo(java.lang.String publalvoCodigo){
    this.publalvoCodigo = publalvoCodigo;
    return this;
  }

  /**
   * Obtém quantag
   * return quantag
   * @generated
   */
  
  public java.lang.Integer getQuantag(){
    return this.quantag;
  }

  /**
   * Define quantag
   * @param quantag quantag
   * @generated
   */
  public HyAgendas setQuantag(java.lang.Integer quantag){
    this.quantag = quantag;
    return this;
  }

  /**
   * Obtém tipoatCodigo
   * return tipoatCodigo
   * @generated
   */
  
  public java.lang.String getTipoatCodigo(){
    return this.tipoatCodigo;
  }

  /**
   * Define tipoatCodigo
   * @param tipoatCodigo tipoatCodigo
   * @generated
   */
  public HyAgendas setTipoatCodigo(java.lang.String tipoatCodigo){
    this.tipoatCodigo = tipoatCodigo;
    return this;
  }

  /**
   * Obtém usCodunidsau
   * return usCodunidsau
   * @generated
   */
  
  public java.lang.String getUsCodunidsau(){
    return this.usCodunidsau;
  }

  /**
   * Define usCodunidsau
   * @param usCodunidsau usCodunidsau
   * @generated
   */
  public HyAgendas setUsCodunidsau(java.lang.String usCodunidsau){
    this.usCodunidsau = usCodunidsau;
    return this;
  }

  /**
   * Obtém vagas
   * return vagas
   * @generated
   */
  
  public java.lang.Integer getVagas(){
    return this.vagas;
  }

  /**
   * Define vagas
   * @param vagas vagas
   * @generated
   */
  public HyAgendas setVagas(java.lang.Integer vagas){
    this.vagas = vagas;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyAgendas object = (HyAgendas)obj;
    if (numag != null ? !numag.equals(object.numag) : object.numag != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((numag == null) ? 0 : numag.hashCode());
    return result;
  }

}
