public class Boleto extends Pagamento {

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando via Boleto: Aguardando compensação bancária.");
    }
}