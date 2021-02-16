package diagram.hygia.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class HyProfiusPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.String profisProfis;
  
  /**
   * @generated
   */
  private java.lang.String usCodunidsau;
  
  /**
   * Construtor
   * @generated
   */
  public HyProfiusPK(){
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
  public HyProfiusPK setProfisProfis(java.lang.String profisProfis){
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
  public HyProfiusPK setUsCodunidsau(java.lang.String usCodunidsau){
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
    HyProfiusPK object = (HyProfiusPK)obj;
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
