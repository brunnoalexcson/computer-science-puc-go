public class ProcessadorPagamento {
    private Pagamento metodo;

    public void setMetodo(Pagamento metodo){
        this.metodo = metodo;
    }

    public double processar(double valor){
        if (metodo == null){
            System.out.println("Nenhum método de pagamento cadastrado.");
            return -1;
        }
        return metodo.pagar(valor);
    }
}
