package passageiro;

public class Passageiro {

    private EventoPassageiro evento;

    public Passageiro() {}

    public Passageiro(EventoPassageiro evento) {
        this.evento = evento;
    }

    public EventoPassageiro getEvento() {
        return evento;
    }

    public void setEvento(EventoPassageiro evento) {
        this.evento = evento;
    }
}
