public class Main {
    public static void main(String[] args) {
        // Exemplo de UPCASTING (Cast "para cima")
        Cachorro c1 = new Cachorro("Rocky", "Shit-zu", 3, 5);

        Animal a = c1; // Upcasting (implícito)
        // a perde acesso a métodos específicos da classe filha

        // Exemplo de DOWNCASTING (Cast "para baixo")
        Animal a1 = new Animal();

        Cachorro c = (Cachorro) a1; // Downcasting (explícito)
        // Esse animal é um cachorro, logo ele pode utilizar as características de um cachorro


    }
}
