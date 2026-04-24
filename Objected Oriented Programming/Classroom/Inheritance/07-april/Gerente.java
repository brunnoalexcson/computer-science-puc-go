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
    public String toString(){
        return "Nome do Gerente: "+getNome()+"\nSalário Base: "+getSalarioBase()+"\n: "+getBonus()+"\nSalário Total: "+getSalarioBase()+getBonus();
    }


}
