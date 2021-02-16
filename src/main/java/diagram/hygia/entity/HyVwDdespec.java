package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_VW_DDESPEC
 * @generated
 */
@Entity
@Table(name = "\"HY_VW_DDESPEC\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyVwDdespec")
public class HyVwDdespec implements Serializable {

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
  @Column(name = "agenda", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String agenda;

  /**
  * @generated
  */
  @Column(name = "ativo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ativo;

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
  @Column(name = "FILA_ATEND", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String filaAtend;

  /**
  * @generated
  */
  @Column(name = "medico", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String medico;

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
  @Column(name = "PROFIS_PROFIS", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  
  private java.lang.String profisProfis;

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
  @Column(name = "US_CODUNIDSAU", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String usCodunidsau;

  /**
   * Construtor
   * @generated
   */
  public HyVwDdespec(){
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
  public HyVwDdespec setAgenda(java.lang.String agenda){
    this.agenda = agenda;
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
  public HyVwDdespec setAtivo(java.lang.String ativo){
    this.ativo = ativo;
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
  public HyVwDdespec setCodigoaih(java.lang.Integer codigoaih){
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
  public HyVwDdespec setCodigosus(java.lang.Integer codigosus){
    this.codigosus = codigosus;
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
  public HyVwDdespec setEspec(java.lang.String espec){
    this.espec = espec;
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
  public HyVwDdespec setFilaAtend(java.lang.String filaAtend){
    this.filaAtend = filaAtend;
    return this;
  }

  /**
   * Obtém medico
   * return medico
   * @generated
   */
  
  public java.lang.String getMedico(){
    return this.medico;
  }

  /**
   * Define medico
   * @param medico medico
   * @generated
   */
  public HyVwDdespec setMedico(java.lang.String medico){
    this.medico = medico;
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
  public HyVwDdespec setNome(java.lang.String nome){
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
  public HyVwDdespec setOcupacao(java.lang.String ocupacao){
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
  public HyVwDdespec setOdonto(java.lang.String odonto){
    this.odonto = odonto;
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
  public HyVwDdespec setProfisProfis(java.lang.String profisProfis){
    this.profisProfis = profisProfis;
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
  public HyVwDdespec setRefUpa(java.lang.String refUpa){
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
  public HyVwDdespec setReferenciavel(java.lang.String referenciavel){
    this.referenciavel = referenciavel;
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
  public HyVwDdespec setUsCodunidsau(java.lang.String usCodunidsau){
    this.usCodunidsau = usCodunidsau;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyVwDdespec object = (HyVwDdespec)obj;
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
