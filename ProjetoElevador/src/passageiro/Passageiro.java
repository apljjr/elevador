package passageiro;

public class Passageiro {

    private String passageiro;
    private EventoPassageiro evento;

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
}
