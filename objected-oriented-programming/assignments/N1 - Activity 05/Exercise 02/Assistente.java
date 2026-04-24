public abstract class Assistente extends Funcionario{
    private String matricula;

    public Assistente(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract void imprimir();
}
