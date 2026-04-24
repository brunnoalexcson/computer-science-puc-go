public class Passaro extends Animal{

    // Com override e sem override imprime o pássaro do mesmo jeito
    // Ele é padrão do Java (Fica implícito na linguagem)
    // Em versões mais novas do Java. Mais antigas não era implícito

    @Override
    public void mover(){
        System.out.println("Passaros voam...");
    }
}
