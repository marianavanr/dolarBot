package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_ESPEC
 * @generated
 */
@Entity
@Table(name = "\"HY_ESPEC\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyEspec")
public class HyEspec implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "espec", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String espec;

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
  @Column(name = "aluno", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String aluno;

  /**
  * @generated
  */
  @Column(name = "anestesia", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String anestesia;

  /**
  * @generated
  */
  @Column(name = "CBO_CNES", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String cboCnes;

  /**
  * @generated
  */
  @Column(name = "codigoaih", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer codigoaih;

  /**
  * @generated
  */
  @Column(name = "codigosus", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer codigosus;

  /**
  * @generated
  */
  @Column(name = "EMITE_ATEST", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String emiteAtest;

  /**
  * @generated
  */
  @Column(name = "ESPEC_INTEGRACAO", nullable = true, unique = false, length=15, insertable=true, updatable=true)
  
  private java.lang.String especIntegracao;

  /**
  * @generated
  */
  @Column(name = "EXIGE_ENC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String exigeEnc;

  /**
  * @generated
  */
  @Column(name = "FILA_ATEND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String filaAtend;

  /**
  * @generated
  */
  @Column(name = "homem", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String homem;

  /**
  * @generated
  */
  @Column(name = "idademax", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idademax;

  /**
  * @generated
  */
  @Column(name = "idademin", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.Integer idademin;

  /**
  * @generated
  */
  @Column(name = "IMP_OBS_REGULADOR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String impObsRegulador;

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
  @Column(name = "ocupacao", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String ocupacao;

  /**
  * @generated
  */
  @Column(name = "odonto", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String odonto;

  /**
  * @generated
  */
  @Column(name = "prescrevemed", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String prescrevemed;

  /**
  * @generated
  */
  @Column(name = "REF_UPA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String refUpa;

  /**
  * @generated
  */
  @Column(name = "referenciavel", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String referenciavel;

  /**
  * @generated
  */
  @Column(name = "TIPOESPEC_CODIGO", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String tipoespecCodigo;

  /**
  * @generated
  */
  @Column(name = "USA_AUTORIZA_AG", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String usaAutorizaAg;

  /**
  * @generated
  */
  @Column(name = "USA_SUBESPEC", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String usaSubespec;

  /**
   * Construtor
   * @generated
   */
  public HyEspec(){
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
  public HyEspec setAbrev(java.lang.String abrev){
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
  public HyEspec setAgenda(java.lang.String agenda){
    this.agenda = agenda;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public java.lang.String getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public HyEspec setAluno(java.lang.String aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * Obtém anestesia
   * return anestesia
   * @generated
   */
  
  public java.lang.String getAnestesia(){
    return this.anestesia;
  }

  /**
   * Define anestesia
   * @param anestesia anestesia
   * @generated
   */
  public HyEspec setAnestesia(java.lang.String anestesia){
    this.anestesia = anestesia;
    return this;
  }

  /**
   * Obtém cboCnes
   * return cboCnes
   * @generated
   */
  
  public java.lang.String getCboCnes(){
    return this.cboCnes;
  }

  /**
   * Define cboCnes
   * @param cboCnes cboCnes
   * @generated
   */
  public HyEspec setCboCnes(java.lang.String cboCnes){
    this.cboCnes = cboCnes;
    return this;
  }

  /**
   * Obtém codigoaih
   * return codigoaih
   * @generated
   */
  
  public java.lang.Integer getCodigoaih(){
    return this.codigoaih;
  }

  /**
   * Define codigoaih
   * @param codigoaih codigoaih
   * @generated
   */
  public HyEspec setCodigoaih(java.lang.Integer codigoaih){
    this.codigoaih = codigoaih;
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
  public HyEspec setCodigosus(java.lang.Integer codigosus){
    this.codigosus = codigosus;
    return this;
  }

  /**
   * Obtém emiteAtest
   * return emiteAtest
   * @generated
   */
  
  public java.lang.String getEmiteAtest(){
    return this.emiteAtest;
  }

  /**
   * Define emiteAtest
   * @param emiteAtest emiteAtest
   * @generated
   */
  public HyEspec setEmiteAtest(java.lang.String emiteAtest){
    this.emiteAtest = emiteAtest;
    return this;
  }

  /**
   * Obtém espec
   * return espec
   * @generated
   */
  
  public java.lang.String getEspec(){
    return this.espec;
  }

  /**
   * Define espec
   * @param espec espec
   * @generated
   */
  public HyEspec setEspec(java.lang.String espec){
    this.espec = espec;
    return this;
  }

  /**
   * Obtém especIntegracao
   * return especIntegracao
   * @generated
   */
  
  public java.lang.String getEspecIntegracao(){
    return this.especIntegracao;
  }

  /**
   * Define especIntegracao
   * @param especIntegracao especIntegracao
   * @generated
   */
  public HyEspec setEspecIntegracao(java.lang.String especIntegracao){
    this.especIntegracao = especIntegracao;
    return this;
  }

  /**
   * Obtém exigeEnc
   * return exigeEnc
   * @generated
   */
  
  public java.lang.String getExigeEnc(){
    return this.exigeEnc;
  }

  /**
   * Define exigeEnc
   * @param exigeEnc exigeEnc
   * @generated
   */
  public HyEspec setExigeEnc(java.lang.String exigeEnc){
    this.exigeEnc = exigeEnc;
    return this;
  }

  /**
   * Obtém filaAtend
   * return filaAtend
   * @generated
   */
  
  public java.lang.String getFilaAtend(){
    return this.filaAtend;
  }

  /**
   * Define filaAtend
   * @param filaAtend filaAtend
   * @generated
   */
  public HyEspec setFilaAtend(java.lang.String filaAtend){
    this.filaAtend = filaAtend;
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
  public HyEspec setHomem(java.lang.String homem){
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
  public HyEspec setIdademax(java.lang.Integer idademax){
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
  public HyEspec setIdademin(java.lang.Integer idademin){
    this.idademin = idademin;
    return this;
  }

  /**
   * Obtém impObsRegulador
   * return impObsRegulador
   * @generated
   */
  
  public java.lang.String getImpObsRegulador(){
    return this.impObsRegulador;
  }

  /**
   * Define impObsRegulador
   * @param impObsRegulador impObsRegulador
   * @generated
   */
  public HyEspec setImpObsRegulador(java.lang.String impObsRegulador){
    this.impObsRegulador = impObsRegulador;
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
  public HyEspec setMulher(java.lang.String mulher){
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
  public HyEspec setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém ocupacao
   * return ocupacao
   * @generated
   */
  
  public java.lang.String getOcupacao(){
    return this.ocupacao;
  }

  /**
   * Define ocupacao
   * @param ocupacao ocupacao
   * @generated
   */
  public HyEspec setOcupacao(java.lang.String ocupacao){
    this.ocupacao = ocupacao;
    return this;
  }

  /**
   * Obtém odonto
   * return odonto
   * @generated
   */
  
  public java.lang.String getOdonto(){
    return this.odonto;
  }

  /**
   * Define odonto
   * @param odonto odonto
   * @generated
   */
  public HyEspec setOdonto(java.lang.String odonto){
    this.odonto = odonto;
    return this;
  }

  /**
   * Obtém prescrevemed
   * return prescrevemed
   * @generated
   */
  
  public java.lang.String getPrescrevemed(){
    return this.prescrevemed;
  }

  /**
   * Define prescrevemed
   * @param prescrevemed prescrevemed
   * @generated
   */
  public HyEspec setPrescrevemed(java.lang.String prescrevemed){
    this.prescrevemed = prescrevemed;
    return this;
  }

  /**
   * Obtém refUpa
   * return refUpa
   * @generated
   */
  
  public java.lang.String getRefUpa(){
    return this.refUpa;
  }

  /**
   * Define refUpa
   * @param refUpa refUpa
   * @generated
   */
  public HyEspec setRefUpa(java.lang.String refUpa){
    this.refUpa = refUpa;
    return this;
  }

  /**
   * Obtém referenciavel
   * return referenciavel
   * @generated
   */
  
  public java.lang.String getReferenciavel(){
    return this.referenciavel;
  }

  /**
   * Define referenciavel
   * @param referenciavel referenciavel
   * @generated
   */
  public HyEspec setReferenciavel(java.lang.String referenciavel){
    this.referenciavel = referenciavel;
    return this;
  }

  /**
   * Obtém tipoespecCodigo
   * return tipoespecCodigo
   * @generated
   */
  
  public java.lang.String getTipoespecCodigo(){
    return this.tipoespecCodigo;
  }

  /**
   * Define tipoespecCodigo
   * @param tipoespecCodigo tipoespecCodigo
   * @generated
   */
  public HyEspec setTipoespecCodigo(java.lang.String tipoespecCodigo){
    this.tipoespecCodigo = tipoespecCodigo;
    return this;
  }

  /**
   * Obtém usaAutorizaAg
   * return usaAutorizaAg
   * @generated
   */
  
  public java.lang.String getUsaAutorizaAg(){
    return this.usaAutorizaAg;
  }

  /**
   * Define usaAutorizaAg
   * @param usaAutorizaAg usaAutorizaAg
   * @generated
   */
  public HyEspec setUsaAutorizaAg(java.lang.String usaAutorizaAg){
    this.usaAutorizaAg = usaAutorizaAg;
    return this;
  }

  /**
   * Obtém usaSubespec
   * return usaSubespec
   * @generated
   */
  
  public java.lang.String getUsaSubespec(){
    return this.usaSubespec;
  }

  /**
   * Define usaSubespec
   * @param usaSubespec usaSubespec
   * @generated
   */
  public HyEspec setUsaSubespec(java.lang.String usaSubespec){
    this.usaSubespec = usaSubespec;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyEspec object = (HyEspec)obj;
    if (espec != null ? !espec.equals(object.espec) : object.espec != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((espec == null) ? 0 : espec.hashCode());
    return result;
  }

}
