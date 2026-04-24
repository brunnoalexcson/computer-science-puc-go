public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString(){
        if (endereco != null){
            return "Nome: "+nome+"\nIdade: "+idade+"\nEndereço: "+endereco.getCidade()+" "+endereco.getRua()+" "+endereco.getNumero();
        } else{
            return "Nome: "+nome+"\nIdade: "+idade+"\nEndereço não associado";
        }
    }
}
