package elevador;

import passageiro.Passageiro;

import java.util.List;

public class Elevador {

    private Integer qtdAndares;
    private Integer andarAtual;
    private List<Passageiro> listaPassageiro;

    public Elevador() {}

    public Elevador(Integer qtdAndares, Integer andarAtual) {
        this.qtdAndares = qtdAndares;
        this.andarAtual = andarAtual;
    }

    public Integer getQtdAndares() {
        return qtdAndares;
    }

    public void setQtdAndares(Integer qtdAndares) {
        this.qtdAndares = qtdAndares;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public List<Passageiro> getListaPassageiro() {
        return listaPassageiro;
    }

    public void setListaPassageiro(List<Passageiro> listaPassageiro) {
        this.listaPassageiro = listaPassageiro;
    }
}
