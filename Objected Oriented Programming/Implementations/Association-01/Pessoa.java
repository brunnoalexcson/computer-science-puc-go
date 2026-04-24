// Superclasse

public class Pessoa {
    private String nome;
    private int rg;
    private int idade;
    private double peso;

    // Primeiro Construtor - Sem parâmetros (Utiliza-se GET e SET)
    public Pessoa (){ }

    // Segundo Construtor - Com parâmetros
    public Pessoa(String nome, int rg, int idade, double peso){
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.peso = peso;
    }

    // Métodos GETTERS
    public String getNome(){
        return nome;
    }

    public int getRg(){
        return rg;
    }

    public int getIdade(){
        return idade;
    }

    public double getPeso(){
        return peso;
    }

    // Métodos SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRg(int rg){
        this.rg = rg;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    // Método para Imprimir os dados de uma Pessoa
    @Override
    public String toString(){
        return "Nome: "+nome+"\nRg: "+rg+"\nIdade: "+idade+" anos\nPeso: "+peso+" kg";
    }

}
