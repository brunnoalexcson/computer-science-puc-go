public class Pessoa {
    private String nome;
    private int idade;
    private int rg;

    // Construtor
    public Pessoa(String nome, int idade, int rg){
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
    }

    // Métodos Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public int getRg(){
        return rg;
    }

    // Métodos Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setRg(int rg){
        this.rg = rg;
    }

}
