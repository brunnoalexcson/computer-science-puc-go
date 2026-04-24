public class Cartao extends Pagamento {

    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando via Cartão: Transação autorizada.");
    }
}