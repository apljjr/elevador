package algoritmo;

import elevador.Elevador;
import passageiro.Passageiro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AlgoritmoElevador {

    public static List<String> algoritmoElevador (Elevador elevador) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (Passageiro passageiro: elevador.getListaPassageiro()) {
            Integer distElevadorPassageiro = Math.abs(elevador.getAndarAtual() - passageiro.getEvento().getAndarOrigem());
            Integer distPassageiroDestino = Math.abs(passageiro.getEvento().getAndarOrigem() - passageiro.getEvento().getAndarSolicitado());
            passageiro.setCalculoRota(distElevadorPassageiro + distPassageiroDestino);

            map.put(passageiro.getPassageiro(), passageiro.getCalculoRota());
        }

        Map<String, Integer> mapSort = new TreeMap<String, Integer>(map);



        return null;
    }

}
