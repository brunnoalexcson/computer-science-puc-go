public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        return getSalario() + bonus;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do Gerente: "+getNome());
        System.out.println("Salário do Gerente: "+calcularSalario());
        System.out.println("Bônus recebido: "+bonus);
        System.out.println();
    }
}
