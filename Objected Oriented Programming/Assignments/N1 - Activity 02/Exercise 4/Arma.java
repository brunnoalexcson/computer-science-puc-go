public class Arma {
    private int capacidade_municao;
    private int quantidade_municao;

    // 1° Construtor
    public Arma(){
        capacidade_municao = 8;
    }

    // 2° Construtor
    public Arma(int capacidade_municao){
        this.capacidade_municao = capacidade_municao;
    }

    // 3° Construtor
    public Arma(int capacidade_municao, int quantidade_municao){
        this.capacidade_municao = capacidade_municao;

        if (quantidade_municao > capacidade_municao){
            this.quantidade_municao = capacidade_municao;
        } else{
            this.quantidade_municao = quantidade_municao;
        }
    }

    // Métodos GETTERS
    public int getCapacidadeMunicao(){
        return capacidade_municao;
    }

    public int getQuantidadeMunicao(){
        return quantidade_municao;
    }

    // Métodos SETTERS
    public void setCapacidadeMunicao(int capacidade_municao){
        this.capacidade_municao = capacidade_municao;
    }

    public void setQuantidadeMunicao(int quantidade_municao){
        this.quantidade_municao = quantidade_municao;
    }

    // Métodos da Classe
    public boolean disparar(){
        if (quantidade_municao > 0){
            System.out.println("Disparando...");
            quantidade_municao--;
            return true;
        } else{
            System.out.println("Não há munição.");
            return false;
        }
    }

    public void recarregar(){
        System.out.println("Recarregando a arma...");
        quantidade_municao = capacidade_municao;
    }

    public int recarregar(int quantidade_municao){
        while (this.quantidade_municao < capacidade_municao && quantidade_municao > 0){
            quantidade_municao--; // Retirei de, por exemplo, um estojo (estojo esse que guarda munições)
            this.quantidade_municao++; // Coloquei no carregador
        }
        return quantidade_municao;
    }
}
