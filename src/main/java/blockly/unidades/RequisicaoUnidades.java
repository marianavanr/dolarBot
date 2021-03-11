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

   private Var ufCliente = Var.VAR_NULL;
   private Var unidadesCambio = Var.VAR_NULL;
   private Var listaOpcoesUnidades = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var jsonUnidades = Var.VAR_NULL;
   private Var carousel = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        System.out.println(
        Var.valueOf("Requisição Unidades de Câmbio").getObjectAsString());

        System.out.println(
        Var.valueOf("Context").getObjectAsString());

        System.out.println(context.getObjectAsString());

        ufCliente =
        cronapi.json.Operations.getJsonOrMapField(context,
        Var.valueOf("cidade"));

        System.out.println(
        Var.valueOf("cidade escolhida do cliente").getObjectAsString());

        System.out.println(ufCliente.getObjectAsString());

        System.out.println(
        Var.valueOf("Requisição api").getObjectAsString());

        unidadesCambio =
        cronapi.json.Operations.toJson(
        Var.valueOf(Utilss.Extreme.requisitionGetNotAut(
        Var.valueOf("https://www3.bcb.gov.br/vet/rest/v2/listaPontoCambio?cnpj=00000000"))));

        System.out.println(unidadesCambio.getObjectAsString());

        listaOpcoesUnidades =
        cronapi.list.Operations.newList();

        for (Iterator it_i =
        cronapi.json.Operations.getJsonOrMapField(unidadesCambio,
        Var.valueOf("listaPontoCambio")).iterator(); it_i.hasNext();) {
            i = Var.valueOf(it_i.next());

            if (
            Var.valueOf(
            Var.valueOf((
            cronapi.json.Operations.getJsonOrMapField(i,
            Var.valueOf("uf"))).getObjectAsString().toUpperCase()).equals(
            Var.valueOf(ufCliente.getObjectAsString().toUpperCase()))).getObjectAsBoolean()) {

                jsonUnidades =
                cronapi.map.Operations.createObjectMapWith(Var.valueOf("cidade",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("cidade"))) , Var.valueOf("endereco",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("endereco"))) , Var.valueOf("horaAbreDiaUtil",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("horaAbreDiaUtil"))) , Var.valueOf("horaFechaDiaUtil",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("horaFechaDiaUtil"))) , Var.valueOf("nome",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("nome"))) , Var.valueOf("telefone1",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("telefone1"))) , Var.valueOf("uf",
                cronapi.json.Operations.getJsonOrMapField(i,
                Var.valueOf("uf"))));

                cronapi.list.Operations.addLast(listaOpcoesUnidades,jsonUnidades);
            }
        } // end for

        System.out.println(
        Var.valueOf("lista opções unidades").getObjectAsString());

        System.out.println(listaOpcoesUnidades.getObjectAsString());

        carousel =
        blockly.unidades.carrossel.Gerenciador.Executar(listaOpcoesUnidades,
        cronapi.json.Operations.getJsonOrMapField(context,
        Var.valueOf("indiceCarousel")), context);

        cronapi.json.Operations.setJsonOrMapField(context,
        Var.valueOf("carousel"), carousel);

        cronapi.json.Operations.setJsonOrMapField(context,
        Var.valueOf("listaInfosUnidades"), listaOpcoesUnidades);
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

