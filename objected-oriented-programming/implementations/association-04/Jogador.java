public class Jogador {
    private String nome;
    private int numero;
    private String posicao;

    public Jogador(String nome, int numero, String posicao){
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getPosicao(){
        return posicao;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }



}
