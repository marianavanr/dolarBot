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
@Repository("HyTipoatDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyTipoatDAO extends JpaRepository<HyTipoat, java.lang.String> {

  /**
   * Obtém a instância de HyTipoat utilizando os identificadores
   * 
   * @param codigo
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyTipoat entity WHERE entity.codigo = :codigo")
  public HyTipoat findOne(@Param(value="codigo") java.lang.String codigo);

  /**
   * Remove a instância de HyTipoat utilizando os identificadores
   * 
   * @param codigo
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyTipoat entity WHERE entity.codigo = :codigo")
  public void delete(@Param(value="codigo") java.lang.String codigo);



}
