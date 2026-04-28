public class Main {
    public static void main(String[] args) {
        AparelhoAmericano batedeira = new AparelhoAmericano();
        Tomada220v tomada = new Transformador(batedeira);

        System.out.println("Ligando batedeira");
        tomada.fornecerEnergia220v();
    }
}
