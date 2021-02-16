package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_PROGRAMAS
 * @generated
 */
@Entity
@Table(name = "\"HY_PROGRAMAS\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyProgramas")
public class HyProgramas implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "programa", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String programa;

  /**
  * @generated
  */
  @Column(name = "ativa", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ativa;

  /**
  * @generated
  */
  @Column(name = "bebe", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String bebe;

  /**
  * @generated
  */
  @Column(name = "diabetes", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String diabetes;

  /**
  * @generated
  */
  @Column(name = "DIAS_ENTRE_AT", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer diasEntreAt;

  /**
  * @generated
  */
  @Column(name = "GRUPOATEND_CODIGO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String grupoatendCodigo;

  /**
  * @generated
  */
  @Column(name = "hipertensao", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String hipertensao;

  /**
  * @generated
  */
  @Column(name = "homem", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String homem;

  /**
  * @generated
  */
  @Column(name = "HORUS_PROG", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String horusProg;

  /**
  * @generated
  */
  @Column(name = "idademax", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idademax;

  /**
  * @generated
  */
  @Column(name = "idademin", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer idademin;

  /**
  * @generated
  */
  @Column(name = "MAX_DIAS_DUM", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer maxDiasDum;

  /**
  * @generated
  */
  @Column(name = "mulher", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mulher;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "PRE_NATAL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String preNatal;

  /**
  * @generated
  */
  @Column(name = "procedimento", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String procedimento;

  /**
  * @generated
  */
  @Column(name = "sigiloso", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String sigiloso;

  /**
  * @generated
  */
  @Column(name = "sigla", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String sigla;

  /**
  * @generated
  */
  @Column(name = "TIPOPROG_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String tipoprogCodigo;

  /**
  * @generated
  */
  @Column(name = "tuberculose", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String tuberculose;

  /**
  * @generated
  */
  @Column(name = "UPA_CLASSRISCO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String upaClassrisco;

  /**
   * Construtor
   * @generated
   */
  public HyProgramas(){
  }


  /**
   * Obtém ativa
   * return ativa
   * @generated
   */
  
  public java.lang.String getAtiva(){
    return this.ativa;
  }

  /**
   * Define ativa
   * @param ativa ativa
   * @generated
   */
  public HyProgramas setAtiva(java.lang.String ativa){
    this.ativa = ativa;
    return this;
  }

  /**
   * Obtém bebe
   * return bebe
   * @generated
   */
  
  public java.lang.String getBebe(){
    return this.bebe;
  }

  /**
   * Define bebe
   * @param bebe bebe
   * @generated
   */
  public HyProgramas setBebe(java.lang.String bebe){
    this.bebe = bebe;
    return this;
  }

  /**
   * Obtém diabetes
   * return diabetes
   * @generated
   */
  
  public java.lang.String getDiabetes(){
    return this.diabetes;
  }

  /**
   * Define diabetes
   * @param diabetes diabetes
   * @generated
   */
  public HyProgramas setDiabetes(java.lang.String diabetes){
    this.diabetes = diabetes;
    return this;
  }

  /**
   * Obtém diasEntreAt
   * return diasEntreAt
   * @generated
   */
  
  public java.lang.Integer getDiasEntreAt(){
    return this.diasEntreAt;
  }

  /**
   * Define diasEntreAt
   * @param diasEntreAt diasEntreAt
   * @generated
   */
  public HyProgramas setDiasEntreAt(java.lang.Integer diasEntreAt){
    this.diasEntreAt = diasEntreAt;
    return this;
  }

  /**
   * Obtém grupoatendCodigo
   * return grupoatendCodigo
   * @generated
   */
  
  public java.lang.String getGrupoatendCodigo(){
    return this.grupoatendCodigo;
  }

  /**
   * Define grupoatendCodigo
   * @param grupoatendCodigo grupoatendCodigo
   * @generated
   */
  public HyProgramas setGrupoatendCodigo(java.lang.String grupoatendCodigo){
    this.grupoatendCodigo = grupoatendCodigo;
    return this;
  }

  /**
   * Obtém hipertensao
   * return hipertensao
   * @generated
   */
  
  public java.lang.String getHipertensao(){
    return this.hipertensao;
  }

  /**
   * Define hipertensao
   * @param hipertensao hipertensao
   * @generated
   */
  public HyProgramas setHipertensao(java.lang.String hipertensao){
    this.hipertensao = hipertensao;
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
  public HyProgramas setHomem(java.lang.String homem){
    this.homem = homem;
    return this;
  }

  /**
   * Obtém horusProg
   * return horusProg
   * @generated
   */
  
  public java.lang.String getHorusProg(){
    return this.horusProg;
  }

  /**
   * Define horusProg
   * @param horusProg horusProg
   * @generated
   */
  public HyProgramas setHorusProg(java.lang.String horusProg){
    this.horusProg = horusProg;
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
  public HyProgramas setIdademax(java.lang.Integer idademax){
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
  public HyProgramas setIdademin(java.lang.Integer idademin){
    this.idademin = idademin;
    return this;
  }

  /**
   * Obtém maxDiasDum
   * return maxDiasDum
   * @generated
   */
  
  public java.lang.Integer getMaxDiasDum(){
    return this.maxDiasDum;
  }

  /**
   * Define maxDiasDum
   * @param maxDiasDum maxDiasDum
   * @generated
   */
  public HyProgramas setMaxDiasDum(java.lang.Integer maxDiasDum){
    this.maxDiasDum = maxDiasDum;
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
  public HyProgramas setMulher(java.lang.String mulher){
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
  public HyProgramas setNome(java.lang.String nome){
    this.nome = nome;
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
  public HyProgramas setPreNatal(java.lang.String preNatal){
    this.preNatal = preNatal;
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
  public HyProgramas setProcedimento(java.lang.String procedimento){
    this.procedimento = procedimento;
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
  public HyProgramas setPrograma(java.lang.String programa){
    this.programa = programa;
    return this;
  }

  /**
   * Obtém sigiloso
   * return sigiloso
   * @generated
   */
  
  public java.lang.String getSigiloso(){
    return this.sigiloso;
  }

  /**
   * Define sigiloso
   * @param sigiloso sigiloso
   * @generated
   */
  public HyProgramas setSigiloso(java.lang.String sigiloso){
    this.sigiloso = sigiloso;
    return this;
  }

  /**
   * Obtém sigla
   * return sigla
   * @generated
   */
  
  public java.lang.String getSigla(){
    return this.sigla;
  }

  /**
   * Define sigla
   * @param sigla sigla
   * @generated
   */
  public HyProgramas setSigla(java.lang.String sigla){
    this.sigla = sigla;
    return this;
  }

  /**
   * Obtém tipoprogCodigo
   * return tipoprogCodigo
   * @generated
   */
  
  public java.lang.String getTipoprogCodigo(){
    return this.tipoprogCodigo;
  }

  /**
   * Define tipoprogCodigo
   * @param tipoprogCodigo tipoprogCodigo
   * @generated
   */
  public HyProgramas setTipoprogCodigo(java.lang.String tipoprogCodigo){
    this.tipoprogCodigo = tipoprogCodigo;
    return this;
  }

  /**
   * Obtém tuberculose
   * return tuberculose
   * @generated
   */
  
  public java.lang.String getTuberculose(){
    return this.tuberculose;
  }

  /**
   * Define tuberculose
   * @param tuberculose tuberculose
   * @generated
   */
  public HyProgramas setTuberculose(java.lang.String tuberculose){
    this.tuberculose = tuberculose;
    return this;
  }

  /**
   * Obtém upaClassrisco
   * return upaClassrisco
   * @generated
   */
  
  public java.lang.String getUpaClassrisco(){
    return this.upaClassrisco;
  }

  /**
   * Define upaClassrisco
   * @param upaClassrisco upaClassrisco
   * @generated
   */
  public HyProgramas setUpaClassrisco(java.lang.String upaClassrisco){
    this.upaClassrisco = upaClassrisco;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyProgramas object = (HyProgramas)obj;
    if (programa != null ? !programa.equals(object.programa) : object.programa != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((programa == null) ? 0 : programa.hashCode());
    return result;
  }

}
