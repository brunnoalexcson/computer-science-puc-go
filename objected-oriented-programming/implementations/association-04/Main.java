public class Main {
    public static void main(String[] args){
        Time time = new Time("Flamengo");
        Jogador goleiro = new Jogador("Rossi", 1, "Goleiro");

        int tamanho = 0;
        time.setJogador(0, goleiro);
        tamanho++;

        time.imprimirJogadores(tamanho);
    }
}
