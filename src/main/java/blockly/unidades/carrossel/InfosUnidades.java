package blockly.unidades.carrossel;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class InfosUnidades {

public static final int TIMEOUT = 300;

/**
 *
 * @param context
 * @param intents
 * @param entities
 * @return Var
 */
// RetornoCarrossel
public static Var Executar(Var context, Var intents, Var entities) throws Exception {
 return new Callable<Var>() {

   private Var listaInfoUnidades = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        System.out.println(
        Var.valueOf("INFOS UNIDADES").getObjectAsString());

        System.out.println(context.getObjectAsString());

        listaInfoUnidades =
        cronapi.json.Operations.getJsonOrMapField(context,
        Var.valueOf("listaInfosUnidades"));

        System.out.println(listaInfoUnidades.getObjectAsString());

        System.out.println(
        Var.valueOf("imprimindo antes do for").getObjectAsString());

        for (Iterator it_i = listaInfoUnidades.iterator(); it_i.hasNext();) {
            i = Var.valueOf(it_i.next());

            System.out.println(
            Var.valueOf("IMPRIMINDO O i").getObjectAsString());

            System.out.println(i.getObjectAsString());
        } // end for

        System.out.println(
        Var.valueOf("IMPRIMINDO depois do for").getObjectAsString());
     } catch (Exception exception_exception) {
          exception = Var.valueOf(exception_exception);

        System.out.println(
        Var.valueOf("********EXCEPTION********").getObjectAsString());

        System.out.println(exception.getObjectAsString());

        cronapi.json.Operations.setJsonOrMapField(exception,
        Var.valueOf("erroUnidade"), exception);
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

