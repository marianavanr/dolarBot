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
@Repository("HyPacientesDAO")
@Transactional(transactionManager="diagram.hygia-TransactionManager")
public interface HyPacientesDAO extends JpaRepository<HyPacientes, java.lang.Long> {

  /**
   * Obtém a instância de HyPacientes utilizando os identificadores
   * 
   * @param numpac
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM HyPacientes entity WHERE entity.numpac = :numpac")
  public HyPacientes findOne(@Param(value="numpac") java.lang.Long numpac);

  /**
   * Remove a instância de HyPacientes utilizando os identificadores
   * 
   * @param numpac
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM HyPacientes entity WHERE entity.numpac = :numpac")
  public void delete(@Param(value="numpac") java.lang.Long numpac);



}
