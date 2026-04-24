public class Funcionario {
    private String nome;
    private double salario;

    // Não foi especificado na questão sobre os construtores, então criarei um utilizado os dois atributos
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Outros métodos
    public double calcularSalario() {
        return salario;
    }

    public void exibirDados(){
        System.out.println("Nome do Funcionário: "+nome);
        System.out.println("Salário do Funcionário: "+calcularSalario());
        System.out.println();
    }
}
