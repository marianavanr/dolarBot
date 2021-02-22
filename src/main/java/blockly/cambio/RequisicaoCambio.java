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

   private Var unidadesCambio = Var.VAR_NULL;
   private Var cepCliente = Var.VAR_NULL;
   private Var retornoUnidade = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        System.out.println(
        Var.valueOf("Requisição Unidades de Câmbio").getObjectAsString());

        unidadesCambio =
        cronapi.util.Operations.getURLFromOthers(
        Var.valueOf("GET"),
        Var.valueOf("application/x-www-form-urlencoded"),
        Var.valueOf("https://www3.bcb.gov.br/vet/rest/v2/listaPontoCambio?cnpj=00000000"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);

        System.out.println(
        Var.valueOf("retorno unidades Cambio").getObjectAsString());

        System.out.println(unidadesCambio.getObjectAsString());

        cepCliente =
        cronapi.json.Operations.getJsonOrMapField(context,
        Var.valueOf("inputUsuario"));

        System.out.println(
        Var.valueOf("cep").getObjectAsString());

        System.out.println(buscarUnidade.getObjectAsString());

        System.out.println(
        Var.valueOf("Buscar Unidade de Cambio").getObjectAsString());

        System.out.println(
        Var.valueOf(
        cronapi.json.Operations.getJsonOrMapField(
        cronapi.json.Operations.getJsonOrMapField(
        Var.valueOf("https://www3.bcb.gov.br/vet/rest/v2/listaPontoCambio?cnpj=00000000"),
        Var.valueOf("unidadesCambio")),
        Var.valueOf("url")).toString() +
        Var.valueOf("/unidade/").toString() +
        cepCliente.toString()).getObjectAsString());

        retornoUnidade =
        cronapi.json.Operations.toJson(
        cronapi.json.Operations.getJsonOrMapField(context,
        Var.valueOf("inputUsuario")));
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

