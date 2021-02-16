package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HY_PROFIUS
 * @generated
 */
@Entity
@IdClass(HyProfiusPK.class)
@Table(name = "\"HY_PROFIUS\"", schema="\"HYGIAWEB\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("diagram.hygia.entity.HyProfius")
public class HyProfius implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "PROFIS_PROFIS", nullable = false, length=11, insertable=true, updatable=true)
  private java.lang.String profisProfis;

  /**
   * @generated
   */
  @Id
  @Column(name = "US_CODUNIDSAU", nullable = false, length=10, insertable=true, updatable=true)
  private java.lang.String usCodunidsau;

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
  @Column(name = "espec", nullable = true, unique = false, length=10, insertable=true, updatable=true)
  
  private java.lang.String espec;

  /**
   * Construtor
   * @generated
   */
  public HyProfius(){
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
  public HyProfius setAgenda(java.lang.String agenda){
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
  public HyProfius setAluno(java.lang.String aluno){
    this.aluno = aluno;
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
  public HyProfius setEspec(java.lang.String espec){
    this.espec = espec;
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
  public HyProfius setProfisProfis(java.lang.String profisProfis){
    this.profisProfis = profisProfis;
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
  public HyProfius setUsCodunidsau(java.lang.String usCodunidsau){
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
    HyProfius object = (HyProfius)obj;
    if (profisProfis != null ? !profisProfis.equals(object.profisProfis) : object.profisProfis != null) return false;
    if (usCodunidsau != null ? !usCodunidsau.equals(object.usCodunidsau) : object.usCodunidsau != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((profisProfis == null) ? 0 : profisProfis.hashCode());
    result = 31 * result + ((usCodunidsau == null) ? 0 : usCodunidsau.hashCode());
    return result;
  }

}
