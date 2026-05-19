public class Midia extends Produto{
    private String artista;

    public Midia(String nome, double preco, String status, String artista) {
        super(nome, preco, status);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }
}
