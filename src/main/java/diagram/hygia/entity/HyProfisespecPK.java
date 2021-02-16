package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class HyProfisespecPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.String especEspec;
  
  /**
   * @generated
   */
  private java.lang.String profisProfis;
  
  /**
   * Construtor
   * @generated
   */
  public HyProfisespecPK(){
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
  public HyProfisespecPK setEspecEspec(java.lang.String especEspec){
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
  public HyProfisespecPK setProfisProfis(java.lang.String profisProfis){
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
    HyProfisespecPK object = (HyProfisespecPK)obj;
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
