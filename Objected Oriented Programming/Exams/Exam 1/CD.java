public class CD extends Midia{
    private int faixas;

    public CD(String nome, double preco, String status, String artista, int faixas) {
        super(nome, preco, status, artista);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    @Override
    public String toString(){
        return "Nome: "+getNome()+"\nPreço: "+getPreco()+"\nStatus: "+getStatus()+"\nArtista: "+getArtista()+"\nFaixas: "+getFaixas();
    }
}
