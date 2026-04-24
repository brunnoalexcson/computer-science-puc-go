public class Nave {
    String modelo;
    Capitao tripulante;

    // Construtor 1 - Recebe apenas o modelo (a nave inicia sem capitão).
    public Nave(String modelo){
        this.modelo = modelo;
    }

    // Construtor 2 - Recebe o modelo e um objeto Capitao já existente.
    public Nave(String modelo, Capitao tripulante){
        this.modelo = modelo;
        this.tripulante = tripulante;
    }

    @Override
    public String toString(){
        return "Nave: "+modelo+"\nTripulante: "+tripulante.getNome()+"\nNível de Experiência: "+tripulante.getNivelExperiencia();
    }
}
