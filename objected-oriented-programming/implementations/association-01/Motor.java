public class Motor {
    private String tipo;
    private int numIdent;
    private double potencia;
    private int rotacao;

    public Motor(String tipo, int numIdent, double potencia, int rotacao){
        this.tipo = tipo;
        this.numIdent = numIdent;
        this.potencia = potencia;
        this.rotacao = rotacao;
    }

    // Métodos GETTERS
    // Métodos SETTERS

    public void acelerando(){
        System.out.println("Vrum, vrum, vrummmmmmmmmmmmmmmmm.");
    }
}
