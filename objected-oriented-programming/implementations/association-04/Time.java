public class Time {
    private String nome;
    private Jogador[] jogador;

    public Time(String nome){
        this.nome = nome;
        Jogador[] jogador = new Jogador[10];
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setJogador(int index, Jogador jogador) {
        this.jogador[index] = jogador;
    }

    public void imprimirJogadores(int tamanho){
        for (int i = 0; i < tamanho; i++){
            System.out.println(jogador[i]);
        }
    }
}
