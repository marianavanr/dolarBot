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
@Repository("HyEspecDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyEspecDAO extends JpaRepository<HyEspec, java.lang.String> {

  /**
   * Obtém a instância de HyEspec utilizando os identificadores
   * 
   * @param espec
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyEspec entity WHERE entity.espec = :espec")
  public HyEspec findOne(@Param(value="espec") java.lang.String espec);

  /**
   * Remove a instância de HyEspec utilizando os identificadores
   * 
   * @param espec
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyEspec entity WHERE entity.espec = :espec")
  public void delete(@Param(value="espec") java.lang.String espec);



}
