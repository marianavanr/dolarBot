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
@Repository("HyProcedimentoDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyProcedimentoDAO extends JpaRepository<HyProcedimento, java.lang.String> {

  /**
   * Obtém a instância de HyProcedimento utilizando os identificadores
   * 
   * @param procedimento
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyProcedimento entity WHERE entity.procedimento = :procedimento")
  public HyProcedimento findOne(@Param(value="procedimento") java.lang.String procedimento);

  /**
   * Remove a instância de HyProcedimento utilizando os identificadores
   * 
   * @param procedimento
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyProcedimento entity WHERE entity.procedimento = :procedimento")
  public void delete(@Param(value="procedimento") java.lang.String procedimento);



}
