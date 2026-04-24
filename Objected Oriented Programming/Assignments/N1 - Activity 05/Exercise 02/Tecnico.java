public class Tecnico extends Assistente{
    private double bonus;

    protected Tecnico(String nome, String cpf, String matricula, double bonus) {
        super(nome, cpf, matricula);
        this.bonus = bonus;
    }

    protected double getBonus() {
        return bonus;
    }

    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Bônus: " + getBonus());
    }
}
