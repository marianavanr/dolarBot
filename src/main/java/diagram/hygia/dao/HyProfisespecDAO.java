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
@Repository("HyProfisespecDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyProfisespecDAO extends JpaRepository<HyProfisespec, HyProfisespecPK> {

  /**
   * Obtém a instância de HyProfisespec utilizando os identificadores
   * 
   * @param especEspec
   *          Identificador 
   * @param profisProfis
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyProfisespec entity WHERE entity.especEspec = :especEspec AND entity.profisProfis = :profisProfis")
  public HyProfisespec findOne(@Param(value="especEspec") java.lang.String especEspec, @Param(value="profisProfis") java.lang.String profisProfis);

  /**
   * Remove a instância de HyProfisespec utilizando os identificadores
   * 
   * @param especEspec
   *          Identificador 
   * @param profisProfis
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyProfisespec entity WHERE entity.especEspec = :especEspec AND entity.profisProfis = :profisProfis")
  public void delete(@Param(value="especEspec") java.lang.String especEspec, @Param(value="profisProfis") java.lang.String profisProfis);



}
