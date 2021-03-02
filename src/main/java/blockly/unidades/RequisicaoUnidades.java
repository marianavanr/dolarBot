package blockly.unidades;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
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

   private Var cidadeCliente = Var.VAR_NULL;
   private Var unidadesCambio = Var.VAR_NULL;
   private Var listaUnidades = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var jsonEscolhaUnidade = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        System.out.println(
        Var.valueOf("Requisição Unidades de Câmbio").getObjectAsString());

        System.out.println(
        Var.valueOf("Context").getObjectAsString());

        System.out.println(context.getObjectAsString());

        cidadeCliente =
        cronapi.json.Operations.getJsonOrMapField(context,
        Var.valueOf("cidade"));

        System.out.println(
        Var.valueOf("requisição api").getObjectAsString());

        unidadesCambio =
        Var.valueOf(Utilss.Extreme.requisitionGetNotAut(
        Var.valueOf("https://www3.bcb.gov.br/vet/rest/v2/listaPontoCambio?cnpj=00000000")));

        System.out.println(unidadesCambio.getObjectAsString());

        listaUnidades =
        cronapi.list.Operations.newList();

        for (Iterator it_i =
        cronapi.json.Operations.getJsonOrMapField(unidadesCambio,
        Var.valueOf("listaPontoCambio")).iterator(); it_i.hasNext();) {
            i = Var.valueOf(it_i.next());

            if (
            Var.valueOf(
            Var.valueOf((
            cronapi.json.Operations.getJsonOrMapField(i,
            Var.valueOf("cidade"))).getObjectAsString().toUpperCase()).equals(
            Var.valueOf(cidadeCliente.getObjectAsString().toUpperCase()))).getObjectAsBoolean()) {

                jsonEscolhaUnidade =
                cronapi.map.Operations.createObjectMapWith(Var.valueOf("cidade",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("cidade"))) , Var.valueOf("endereco",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("endereco"))) , Var.valueOf("horaAbreDiaUtil",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("horaAbreDiaUtil"))) , Var.valueOf("horaFechaDiaUtil",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("horaFechaDiaUtil"))) , Var.valueOf("telefone1",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("telefone1"))));

                cronapi.list.Operations.addLast(listaUnidades,jsonEscolhaUnidade);
            }
        } // end for

        System.out.println(
        Var.valueOf("listaUnidades").getObjectAsString());

        System.out.println(listaUnidades.getObjectAsString());

        System.out.println(
        Var.valueOf("carrossel").getObjectAsString());
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

