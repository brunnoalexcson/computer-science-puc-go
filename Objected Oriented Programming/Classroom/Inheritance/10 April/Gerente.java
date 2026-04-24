public class Gerente extends Funcionario{
    private double bonus;
    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    @Override
    public void setGratificacao(double valor) {
        if (valor >= 1000.00) {
            System.out.println("Usando bônus...");
            setSalarioBase(bonus);
        }

    }

    public void organizaEquipe(){
        System.out.println(getNome()+" está na equipe de vendas.");
    }

}
