public class CartaoCredito implements Pagamento{
    @Override
    public double pagar(double valor){
        return valor * 1.05;
    }
}
