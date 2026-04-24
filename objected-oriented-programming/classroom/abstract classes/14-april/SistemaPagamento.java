public class SistemaPagamento {
    public static void main(String[] args){
        Pagamento pg1 = new CartaoCredito(300.00, "2381");
        Pagamento pg2 = new Pix(1500.00);

        pg1.processar();
        pg1.exibirRecibo();

        pg2.processar();
        pg2.exibirRecibo();
    }
}
