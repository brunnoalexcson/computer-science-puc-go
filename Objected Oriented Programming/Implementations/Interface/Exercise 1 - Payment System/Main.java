public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        processador.setMetodo(new CartaoCredito());
        System.out.println("Pagamento pelo Cartão de Crédito (Taxa de 5%): "+processador.processar(100));

        processador.setMetodo(new Pix());
        System.out.println("Pagamento pelo Pix (Taxa 0): "+processador.processar(100));

        // processador.setMetodo(null);
        // System.out.println("Teste de Pagamento sem setar: "+processador.processar(100));
        // NullPointerException -> Para isso é importante a validação

    }
}
