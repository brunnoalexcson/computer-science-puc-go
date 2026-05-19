public class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro(String nome, double preco, String status, String autor, int paginas) {
        super(nome, preco, status);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\nPreço: "+getPreco()+"\nStatus: "+getStatus()+"\nAutor: "+getAutor()+"\nNúmero de Páginas: "
                +getPaginas();
    }
}
