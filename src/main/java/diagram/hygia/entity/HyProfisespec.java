package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_PROFISESPEC
 * @generated
 */
@Entity
@IdClass(HyProfisespecPK.class)
@Table(name = "\"HY_PROFISESPEC\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyProfisespec")
public class HyProfisespec implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ESPEC_ESPEC", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String especEspec;

  /**
   * @generated
   */
  @Id
  @Column(name = "PROFIS_PROFIS", nullable = false, length=11, insertable=true, updatable=true)
  private java.lang.String profisProfis;

  /**
  * @generated
  */
  @Column(name = "ativo", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ativo;

  /**
   * Construtor
   * @generated
   */
  public HyProfisespec(){
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
  public HyProfisespec setAtivo(java.lang.String ativo){
    this.ativo = ativo;
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
  public HyProfisespec setEspecEspec(java.lang.String especEspec){
    this.especEspec = especEspec;
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
  public HyProfisespec setProfisProfis(java.lang.String profisProfis){
    this.profisProfis = profisProfis;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyProfisespec object = (HyProfisespec)obj;
    if (especEspec != null ? !especEspec.equals(object.especEspec) : object.especEspec != null) return false;
    if (profisProfis != null ? !profisProfis.equals(object.profisProfis) : object.profisProfis != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((especEspec == null) ? 0 : especEspec.hashCode());
    result = 31 * result + ((profisProfis == null) ? 0 : profisProfis.hashCode());
    return result;
  }

}
