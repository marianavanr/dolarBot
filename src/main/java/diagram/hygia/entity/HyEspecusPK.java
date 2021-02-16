package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class HyEspecusPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.String codunidsau;
  
  /**
   * @generated
   */
  private java.lang.String espec;
  
  /**
   * Construtor
   * @generated
   */
  public HyEspecusPK(){
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
  public HyEspecusPK setCodunidsau(java.lang.String codunidsau){
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
  public HyEspecusPK setEspec(java.lang.String espec){
    this.espec = espec;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    HyEspecusPK object = (HyEspecusPK)obj;
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
