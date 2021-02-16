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
@Repository("HyAgendasDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyAgendasDAO extends JpaRepository<HyAgendas, java.lang.Long> {

  /**
   * Obtém a instância de HyAgendas utilizando os identificadores
   * 
   * @param numag
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyAgendas entity WHERE entity.numag = :numag")
  public HyAgendas findOne(@Param(value="numag") java.lang.Long numag);

  /**
   * Remove a instância de HyAgendas utilizando os identificadores
   * 
   * @param numag
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyAgendas entity WHERE entity.numag = :numag")
  public void delete(@Param(value="numag") java.lang.Long numag);



}
