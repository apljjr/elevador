package algoritmo;

import elevador.Elevador;
import passageiro.Passageiro;

import java.util.*;

public class AlgoritmoElevador {

    public void algoritmoElevador (Elevador elevador) {

        List<Passageiro> passageirosAcima = passageirosAcima(elevador);
        List<Passageiro> passageirosAbaixo = passageirosAbaixo(elevador);

        Integer andarPassageiroMaisProximo = passageiroMaisProximo(elevador);


        passageirosAcima = ordenarListaPassageiro(passageirosAcima);
        passageirosAbaixo = ordenarListaPassageiro(passageirosAbaixo);
        Collections.reverse(passageirosAbaixo);

        if (subirOuDescer(elevador.getAndarAtual(), andarPassageiroMaisProximo) == "subir") {
            for (Passageiro passageiro : passageirosAcima) {
                System.out.printf(passageiro.getEvento().getAndarOrigem().toString());
            }

            for (Passageiro passageiro : passageirosAbaixo) {
                System.out.printf(passageiro.getEvento().getAndarOrigem().toString());
            }
        } else if(subirOuDescer(elevador.getAndarAtual(), andarPassageiroMaisProximo) == "descer") {
            for (Passageiro passageiro : passageirosAbaixo) {
                System.out.printf(passageiro.getEvento().getAndarOrigem().toString());
            }

            for (Passageiro passageiro : passageirosAcima) {
                System.out.printf(passageiro.getEvento().getAndarOrigem().toString());
            }
        }
    }

    private List<Passageiro> ordenarListaPassageiro (List<Passageiro> listaPassageiro) {
        Collections.sort(listaPassageiro, new Comparator<Passageiro>() {
            @Override
            public int compare(Passageiro o1, Passageiro o2) {
                return o1.getEvento().getAndarOrigem().compareTo(o2.getEvento().getAndarSolicitado());
            }
        });
        return listaPassageiro;
    }


    private Integer passageiroMaisProximo(Elevador elevador) {
        List<Passageiro> listaSortPassageiro = elevador.getListaPassageiro();
        Collections.sort(listaSortPassageiro, new Comparator<Passageiro>() {
            @Override
            public int compare(Passageiro o1, Passageiro o2) {
                return o1.getEvento().getAndarOrigem().compareTo(o2.getEvento().getAndarSolicitado());
            }
        });
        return listaSortPassageiro.get(0).getEvento().getAndarOrigem();
    }

    private List<Passageiro> passageirosAcima(Elevador elevador) {
        List<Passageiro> listaPassageirosAcima = new ArrayList<>();
        for (Passageiro passageiro: elevador.getListaPassageiro()) {
            if (passageiro.getEvento().getAndarOrigem() > elevador.getAndarAtual()) {
                listaPassageirosAcima.add(passageiro);
            }
        }
        return listaPassageirosAcima;
    }

    private List<Passageiro> passageirosAbaixo(Elevador elevador) {
        List<Passageiro> listaPassageirosAbaixo = new ArrayList<>();
        for (Passageiro passageiro: elevador.getListaPassageiro()) {
            if (passageiro.getEvento().getAndarOrigem() <= elevador.getAndarAtual()) {
                listaPassageirosAbaixo.add(passageiro);
            }
        }
        return listaPassageirosAbaixo;
    }

    private String subirOuDescer(Integer andarElevador, Integer andarPassageiroMaisProximo) {
        if (andarElevador > andarPassageiroMaisProximo) {
            return "descer";
        } else {
            return "subir";
        }
    }
}
