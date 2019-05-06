package passageiro;

public class Passageiro {

    private String passageiro;
    private EventoPassageiro evento;
    private Integer calculoRota;

    public Passageiro() {}

    public Passageiro(EventoPassageiro evento) {
        this.evento = evento;
    }

    public String getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }

    public EventoPassageiro getEvento() {
        return evento;
    }

    public void setEvento(EventoPassageiro evento) {
        this.evento = evento;
    }

    public Integer getCalculoRota() {
        return calculoRota;
    }

    public void setCalculoRota(Integer calculoRota) {
        this.calculoRota = calculoRota;
    }
}
