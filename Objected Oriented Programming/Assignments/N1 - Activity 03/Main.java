public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new Cartao(200.0);
        Pagamento p2 = new Boleto(150.0);

        p1.configurarParcelas();
        p1.configurarParcelas(3);

        System.out.println();

        p1.processarPagamento();
        p2.processarPagamento();
    }
}