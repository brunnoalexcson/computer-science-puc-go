public class Pacote extends Encomenda implements Entrega{
    private double peso;
    private String descricao;

    public Pacote(String id, String Org, String Dst, double peso, String descricao) {
        super(id, Org, Dst);
        this.peso = peso;
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
