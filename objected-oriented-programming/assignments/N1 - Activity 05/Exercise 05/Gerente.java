public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString(){
        return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nSexo: "+getSexo()+
                "\nSalário: "+getSalario()+"\nSalário com desconto do INSS: "+valorInss()+"\nDesconto do INSS: "+(getSalario()-valorInss()) +
                "\nMatrícula: "+getMatricula()+"\nNome da Gerência: "+getNomeGerencia();
    }
}
