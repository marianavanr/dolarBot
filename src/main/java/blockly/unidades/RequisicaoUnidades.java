package blockly.unidades;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RequisicaoUnidades {

public static final int TIMEOUT = 300;

/**
 *
 * @param context
 * @param intents
 * @param entities
 * @return Var
 */
// RequisicaoPaises
public static Var Executar(Var context, Var intents, Var entities) throws Exception {
 return new Callable<Var>() {

   private Var retornoPais = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        System.out.println(
        Var.valueOf("requisição países").getObjectAsString());

        retornoPais =
        cronapi.util.Operations.getURLFromOthers(
        Var.valueOf("GET"),
        Var.valueOf("application/json"),
        Var.valueOf("https://gist.githubusercontent.com/jonasruth/61bde1fcf0893bd35eea/raw/10ce80ddeec6b893b514c3537985072bbe9bb265/paises-gentilicos-google-maps.json"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
     } catch (Exception ex1_exception) {

     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

