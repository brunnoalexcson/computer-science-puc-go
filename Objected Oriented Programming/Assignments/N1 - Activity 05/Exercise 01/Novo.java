public class Novo extends Imovel{
    private double adicional;

    public Novo(String endereco, double preco, double adicional){
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getPrecoFinal(){
        return getPreco() + adicional;
    }

    @Override
    public String toString() {
        return "Endereço: "+getEndereco()+"\nPreço Base: R$ "+getPreco()+"\nAdicional: R$ "+adicional+"\nPreço Final: R$ "+getPrecoFinal();
    }
}
