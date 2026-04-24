public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(){
        nome = "";
        salarioBase = 0.0;
    }

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Funcionario(double salarioBase){
        nome = "";
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setGratificacao(double valor){
        setSalarioBase(getSalarioBase()+valor);
    }

    public void imprimir(){
        System.out.println("Nome : "+nome);
        System.out.println("Salário Base : "+salarioBase);
    }

    @Override
    public String toString(){
        return "Nome: "+nome+"\nSalário Base: "+salarioBase;
    }
}
