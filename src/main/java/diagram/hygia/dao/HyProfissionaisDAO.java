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
@Repository("HyProfissionaisDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyProfissionaisDAO extends JpaRepository<HyProfissionais, java.lang.String> {

  /**
   * Obtém a instância de HyProfissionais utilizando os identificadores
   * 
   * @param profis
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyProfissionais entity WHERE entity.profis = :profis")
  public HyProfissionais findOne(@Param(value="profis") java.lang.String profis);

  /**
   * Remove a instância de HyProfissionais utilizando os identificadores
   * 
   * @param profis
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyProfissionais entity WHERE entity.profis = :profis")
  public void delete(@Param(value="profis") java.lang.String profis);



}
