package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_TIPOESPEC
 * @generated
 */
@Entity
@Table(name = "\"HY_TIPOESPEC\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyTipoespec")
public class HyTipoespec implements Serializable {

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
  @Column(name = "ASS_SOCIAL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String assSocial;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "enfermeiro", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String enfermeiro;

  /**
  * @generated
  */
  @Column(name = "medicacao", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String medicacao;

  /**
  * @generated
  */
  @Column(name = "medico", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String medico;

  /**
  * @generated
  */
  @Column(name = "sadt", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String sadt;

  /**
  * @generated
  */
  @Column(name = "sigilo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String sigilo;

  /**
   * Construtor
   * @generated
   */
  public HyTipoespec(){
  }


  /**
   * Obtém assSocial
   * return assSocial
   * @generated
   */
  
  public java.lang.String getAssSocial(){
    return this.assSocial;
  }

  /**
   * Define assSocial
   * @param assSocial assSocial
   * @generated
   */
  public HyTipoespec setAssSocial(java.lang.String assSocial){
    this.assSocial = assSocial;
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
  public HyTipoespec setCodigo(java.lang.String codigo){
    this.codigo = codigo;
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
  public HyTipoespec setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém enfermeiro
   * return enfermeiro
   * @generated
   */
  
  public java.lang.String getEnfermeiro(){
    return this.enfermeiro;
  }

  /**
   * Define enfermeiro
   * @param enfermeiro enfermeiro
   * @generated
   */
  public HyTipoespec setEnfermeiro(java.lang.String enfermeiro){
    this.enfermeiro = enfermeiro;
    return this;
  }

  /**
   * Obtém medicacao
   * return medicacao
   * @generated
   */
  
  public java.lang.String getMedicacao(){
    return this.medicacao;
  }

  /**
   * Define medicacao
   * @param medicacao medicacao
   * @generated
   */
  public HyTipoespec setMedicacao(java.lang.String medicacao){
    this.medicacao = medicacao;
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
  public HyTipoespec setMedico(java.lang.String medico){
    this.medico = medico;
    return this;
  }

  /**
   * Obtém sadt
   * return sadt
   * @generated
   */
  
  public java.lang.String getSadt(){
    return this.sadt;
  }

  /**
   * Define sadt
   * @param sadt sadt
   * @generated
   */
  public HyTipoespec setSadt(java.lang.String sadt){
    this.sadt = sadt;
    return this;
  }

  /**
   * Obtém sigilo
   * return sigilo
   * @generated
   */
  
  public java.lang.String getSigilo(){
    return this.sigilo;
  }

  /**
   * Define sigilo
   * @param sigilo sigilo
   * @generated
   */
  public HyTipoespec setSigilo(java.lang.String sigilo){
    this.sigilo = sigilo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyTipoespec object = (HyTipoespec)obj;
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
