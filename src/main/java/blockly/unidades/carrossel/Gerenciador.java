package blockly.unidades.carrossel;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Gerenciador {

public static final int TIMEOUT = 300;

/**
 *
 * @param listaRecebida
 * @param param_numeroAtual
 * @param context
 * @return Var
 */
// GerenciadorCarousel
public static Var Executar(Var listaRecebida, Var param_numeroAtual, Var context) throws Exception {
 return new Callable<Var>() {

   // param
   private Var numeroAtual = param_numeroAtual;
   // end
   private Var retorno = Var.VAR_NULL;
   private Var contador = Var.VAR_NULL;
   private Var subLista = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var quick_reply = Var.VAR_NULL;
   private Var itemCarousel = Var.VAR_NULL;
   private Var exception = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        System.out.println(
        Var.valueOf("GERENCIADOR CAROUSEL DE UNIDADES").getObjectAsString());

        retorno =
        cronapi.list.Operations.newList();

        contador =
        Var.valueOf(1);

        subLista =
        cronapi.list.Operations.getSublistFromNToN(listaRecebida,numeroAtual,
        cronapi.list.Operations.size(listaRecebida));

        for (Iterator it_i = subLista.iterator(); it_i.hasNext();) {
            i = Var.valueOf(it_i.next());

            quick_reply =
            cronapi.list.Operations.newList();

            cronapi.list.Operations.addLast(quick_reply,
            cronapi.map.Operations.createObjectMapWith(Var.valueOf("data",
            cronapi.json.Operations.getJsonOrMapField(i,
            Var.valueOf("nome"))) , Var.valueOf("text",
            Var.valueOf("Mais informações"))));

            itemCarousel =
            cronapi.map.Operations.createObjectMapWith(Var.valueOf("image",
            Var.valueOf(
            cronapi.json.Operations.getJsonOrMapField(
            Var.valueOf(Config.ReadFromMetaInf.readFromMetaInf()),
            Var.valueOf("published_url")).toString() +
            Var.valueOf("img/bancodobrasil.png").toString())) , Var.valueOf("message",
            cronapi.json.Operations.getJsonOrMapField(i,
            Var.valueOf("nome"))) , Var.valueOf("quick_reply",quick_reply));

            cronapi.list.Operations.addLast(retorno,itemCarousel);

            if (
            Var.valueOf(contador.equals(
            Var.valueOf(9))).getObjectAsBoolean()) {

                if (
                Var.valueOf(
                cronapi.list.Operations.size(subLista).compareTo(
                Var.valueOf(9)) > 0).getObjectAsBoolean()) {

                    quick_reply =
                    cronapi.list.Operations.newList();

                    cronapi.list.Operations.addLast(quick_reply,
                    cronapi.map.Operations.createObjectMapWith(Var.valueOf("data",
                    Var.valueOf("VerMais")) , Var.valueOf("text",
                    Var.valueOf("Ver Mais"))));

                    cronapi.list.Operations.addLast(retorno,
                    cronapi.map.Operations.createObjectMapWith(Var.valueOf("image",
                    Var.valueOf(
                    cronapi.json.Operations.getJsonOrMapField(
                    Var.valueOf(Config.ReadFromMetaInf.readFromMetaInf()),
                    Var.valueOf("published_url")).toString() +
                    Var.valueOf("img/vermais.png").toString())) , Var.valueOf("message",
                    Var.valueOf("Ver Mais")) , Var.valueOf("quick_reply",quick_reply)));

                    break;
                }
            }

            contador =
            cronapi.math.Operations.sum(contador,
            Var.valueOf(1));
        } // end for

        if (
        Var.valueOf(
        Var.valueOf(
        cronapi.list.Operations.size(retorno).compareTo(
        Var.valueOf(10)) < 0).getObjectAsBoolean() &&
        Var.valueOf(
        cronapi.list.Operations.size(retorno).compareTo(
        Var.valueOf(1)) >= 0).getObjectAsBoolean()).getObjectAsBoolean()) {

            numeroAtual =
            Var.valueOf(1);

            cronapi.json.Operations.setJsonOrMapField(context,
            Var.valueOf("indiceCarousel"), numeroAtual);

            quick_reply =
            cronapi.list.Operations.newList();

            cronapi.list.Operations.addLast(quick_reply,
            cronapi.map.Operations.createObjectMapWith(Var.valueOf("data",
            Var.valueOf("BuscarNovamente")) , Var.valueOf("text",
            Var.valueOf("Buscar Novamente"))));

            cronapi.list.Operations.addLast(retorno,
            cronapi.map.Operations.createObjectMapWith(Var.valueOf("image",
            Var.valueOf(
            cronapi.json.Operations.getJsonOrMapField(
            Var.valueOf(Config.ReadFromMetaInf.readFromMetaInf()),
            Var.valueOf("published_url")).toString() +
            Var.valueOf("img/buscarmais.png").toString())) , Var.valueOf("message",
            Var.valueOf("Buscar Novamente")) , Var.valueOf("quick_reply",quick_reply)));

            return Var.valueOf(retorno);
        }

        numeroAtual =
        cronapi.math.Operations.sum(numeroAtual,contador);

        cronapi.json.Operations.setJsonOrMapField(context,
        Var.valueOf("indiceCarousel"), numeroAtual);
     } catch (Exception exception_exception) {
          exception = Var.valueOf(exception_exception);

        System.out.println(
        Var.valueOf("****************************************************").getObjectAsString());

        System.out.println(exception.getObjectAsString());

        cronapi.json.Operations.setJsonOrMapField(context,
        Var.valueOf("falhaConstrucaoCarousel"),
        Var.VAR_TRUE);
     }
    return retorno;
   }
 }.call();
}

}

