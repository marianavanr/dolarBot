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
@Repository("HyProgramasDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyProgramasDAO extends JpaRepository<HyProgramas, java.lang.String> {

  /**
   * Obtém a instância de HyProgramas utilizando os identificadores
   * 
   * @param programa
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyProgramas entity WHERE entity.programa = :programa")
  public HyProgramas findOne(@Param(value="programa") java.lang.String programa);

  /**
   * Remove a instância de HyProgramas utilizando os identificadores
   * 
   * @param programa
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyProgramas entity WHERE entity.programa = :programa")
  public void delete(@Param(value="programa") java.lang.String programa);



}
