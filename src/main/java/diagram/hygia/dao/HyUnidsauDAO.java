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
@Repository("HyUnidsauDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyUnidsauDAO extends JpaRepository<HyUnidsau, java.lang.String> {

  /**
   * Obtém a instância de HyUnidsau utilizando os identificadores
   * 
   * @param codunidsau
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyUnidsau entity WHERE entity.codunidsau = :codunidsau")
  public HyUnidsau findOne(@Param(value="codunidsau") java.lang.String codunidsau);

  /**
   * Remove a instância de HyUnidsau utilizando os identificadores
   * 
   * @param codunidsau
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyUnidsau entity WHERE entity.codunidsau = :codunidsau")
  public void delete(@Param(value="codunidsau") java.lang.String codunidsau);



}
