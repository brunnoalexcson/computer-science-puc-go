public class Pagamento {
    protected double valor;

    // Construtor
    public Pagamento(double valor) {
        this.valor = valor;
    }

    // Sobrecarga 1
    public void configurarParcelas() {
        System.out.println("Pagamento: À vista (Valor: " + valor + ")");
    }

    // Sobrecarga 2
    public void configurarParcelas(int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.println("Pagamento: " + parcelas + "x de " + valorParcela);
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }
}