public class Velho extends Imovel{
    private double desconto;

    public Velho(String endereco, double preco, double desconto){
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoFinal(){
        if (desconto > getPreco()){
            System.out.println("Desconto maior que o preço base. Nenhum desconto aplicado");
            return getPreco();
        } else{
            return getPreco()-desconto;
        }
    }

    @Override
    public String toString() {
        return "Endereço: "+getEndereco()+"\nPreço Base: R$ "+getPreco()+"\nDesconto: R$ "+desconto+"\nPreço Final: R$ "+getPrecoFinal();
    }
}
