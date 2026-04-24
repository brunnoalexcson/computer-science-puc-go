public class Aluno extends Pessoa {
    private int matricula;

    // Construtor
    public Aluno(String nome, int idade, int rg, int matricula){
        super(nome, idade, rg);
        this.matricula = matricula;
    }

    // Métodos Getters
    public int getMatricula(){
        return matricula;
    }

    // Métodos Setters
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
