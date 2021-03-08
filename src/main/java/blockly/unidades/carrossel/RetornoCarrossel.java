package blockly.unidades.carrossel;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RetornoCarrossel {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// RetornoCarrossel
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.VAR_NULL;
   }
 }.call();
}

}

