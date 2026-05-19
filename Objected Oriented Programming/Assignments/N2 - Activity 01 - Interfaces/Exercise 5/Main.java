public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rottweiler");

        System.out.println("========== CACHORRO ==========");
        cachorro.imprimirDados();

        Passaro passaro = new Passaro("Bem-te-vi");

        System.out.println("========== PASSARO ==========");
        passaro.imprimirDados();

        Morcego morcego = new Morcego();

        System.out.println("========== MORCEGO ==========");
        morcego.imprimirDados();
    }
}
