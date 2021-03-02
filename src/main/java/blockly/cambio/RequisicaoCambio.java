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

   private Var moedaEscolhida = Var.VAR_NULL;
   private Var calculoCambio = Var.VAR_NULL;
   private Var listaCalculoCambio = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        System.out.println(
        Var.valueOf("Requisição de cálculo de Cambio").getObjectAsString());

        System.out.println(
        Var.valueOf("context").getObjectAsString());

        System.out.println(context.getObjectAsString());

        moedaEscolhida =
        cronapi.json.Operations.getJsonOrMapField(context,
        Var.valueOf("moeda"));

        System.out.println(
        Var.valueOf("moeda escolhida").getObjectAsString());

        System.out.println(moedaEscolhida.getObjectAsString());

        System.out.println(
        Var.valueOf("Requisição api").getObjectAsString());

        calculoCambio =
        Var.valueOf(Utilss.Extreme.requisitionGetNotAut(
        Var.valueOf("https://economia.awesomeapi.com.br/json/all")));

        System.out.println(calculoCambio.getObjectAsString());

        listaCalculoCambio =
        Var.valueOf(Utilss.Extreme.RemoveListJson(calculoCambio.getTypedObject(String.class)));

        System.out.println(listaCalculoCambio.getObjectAsString());
     } catch (Exception exception_exception) {
          exception = Var.valueOf(exception_exception);

        System.out.println(
        Var.valueOf("*********EXCEPTION*********").getObjectAsString());

        System.out.println(exception.getObjectAsString());

        cronapi.json.Operations.setJsonOrMapField(exception,
        Var.valueOf("erroUnidade"), exception);
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

