public class Produto {
    private String nome;
    private double preco;
    private String status;

    public Produto(){
        nome = "";
        preco = 0.0;
        status = "";
    }

    public Produto(String nome, double preco, String status) {
        this.nome = nome;
        this.preco = preco;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getStatus() {
        return status;
    }
}
