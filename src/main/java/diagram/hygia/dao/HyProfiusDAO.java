package diagram.hygia.dao;

import diagram.hygia.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("HyProfiusDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyProfiusDAO extends JpaRepository<HyProfius, HyProfiusPK> {

  /**
   * Obtém a instância de HyProfius utilizando os identificadores
   * 
   * @param profisProfis
   *          Identificador 
   * @param usCodunidsau
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyProfius entity WHERE entity.profisProfis = :profisProfis AND entity.usCodunidsau = :usCodunidsau")
  public HyProfius findOne(@Param(value="profisProfis") java.lang.String profisProfis, @Param(value="usCodunidsau") java.lang.String usCodunidsau);

  /**
   * Remove a instância de HyProfius utilizando os identificadores
   * 
   * @param profisProfis
   *          Identificador 
   * @param usCodunidsau
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyProfius entity WHERE entity.profisProfis = :profisProfis AND entity.usCodunidsau = :usCodunidsau")
  public void delete(@Param(value="profisProfis") java.lang.String profisProfis, @Param(value="usCodunidsau") java.lang.String usCodunidsau);



}
