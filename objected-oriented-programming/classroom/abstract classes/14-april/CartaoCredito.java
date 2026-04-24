public class CartaoCredito extends Pagamento{
    private String numCartao;

    public CartaoCredito(double valor, String numCartao) {
        super(valor);
        this.numCartao = numCartao;
    }

    @Override
    public void processar() {
        System.out.println("Pagamento validado no cartão "+numCartao);
    }
}
