package blockly.cambio;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RequisicaoCambio {

public static final int TIMEOUT = 300;

/**
 *
 * @param context
 * @param intents
 * @param entities
 * @return Var
 */
// RequisicaoCambio
public static Var Executar(Var context, Var intents, Var entities) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.VAR_NULL;
   }
 }.call();
}

}

