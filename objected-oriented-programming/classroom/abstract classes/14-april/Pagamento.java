public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public void exibirRecibo(){
        System.out.println("Recibo gerado no valor de R$ "+valor);
    }

    public abstract void processar();
}
