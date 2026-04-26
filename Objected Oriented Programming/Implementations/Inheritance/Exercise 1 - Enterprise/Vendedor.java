public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salario, double comissao){
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        return getSalario() + comissao;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do Vendedor: "+getNome());
        System.out.println("Salário do Vendedor: "+calcularSalario());
        System.out.println("Comissão recebida: "+comissao);
        System.out.println();
    }
}
