package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_ESPECUS
 * @generated
 */
@Entity
@IdClass(HyEspecusPK.class)
@Table(name = "\"HY_ESPECUS\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyEspecus")
public class HyEspecus implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "codunidsau", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String codunidsau;

  /**
   * @generated
   */
  @Id
  @Column(name = "espec", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String espec;

  /**
  * @generated
  */
  @Column(name = "IDADE_PR", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.Integer idadePr;

  /**
  * @generated
  */
  @Column(name = "POS_CONS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String posCons;

  /**
  * @generated
  */
  @Column(name = "PRE_CONS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String preCons;

  /**
   * Construtor
   * @generated
   */
  public HyEspecus(){
  }


  /**
   * Obtém codunidsau
   * return codunidsau
   * @generated
   */
  
  public java.lang.String getCodunidsau(){
    return this.codunidsau;
  }

  /**
   * Define codunidsau
   * @param codunidsau codunidsau
   * @generated
   */
  public HyEspecus setCodunidsau(java.lang.String codunidsau){
    this.codunidsau = codunidsau;
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
  public HyEspecus setEspec(java.lang.String espec){
    this.espec = espec;
    return this;
  }

  /**
   * Obtém idadePr
   * return idadePr
   * @generated
   */
  
  public java.lang.Integer getIdadePr(){
    return this.idadePr;
  }

  /**
   * Define idadePr
   * @param idadePr idadePr
   * @generated
   */
  public HyEspecus setIdadePr(java.lang.Integer idadePr){
    this.idadePr = idadePr;
    return this;
  }

  /**
   * Obtém posCons
   * return posCons
   * @generated
   */
  
  public java.lang.String getPosCons(){
    return this.posCons;
  }

  /**
   * Define posCons
   * @param posCons posCons
   * @generated
   */
  public HyEspecus setPosCons(java.lang.String posCons){
    this.posCons = posCons;
    return this;
  }

  /**
   * Obtém preCons
   * return preCons
   * @generated
   */
  
  public java.lang.String getPreCons(){
    return this.preCons;
  }

  /**
   * Define preCons
   * @param preCons preCons
   * @generated
   */
  public HyEspecus setPreCons(java.lang.String preCons){
    this.preCons = preCons;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyEspecus object = (HyEspecus)obj;
    if (codunidsau != null ? !codunidsau.equals(object.codunidsau) : object.codunidsau != null) return false;
    if (espec != null ? !espec.equals(object.espec) : object.espec != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((codunidsau == null) ? 0 : codunidsau.hashCode());
    result = 31 * result + ((espec == null) ? 0 : espec.hashCode());
    return result;
  }

}
