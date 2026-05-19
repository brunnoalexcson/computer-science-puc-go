public class Revista extends Encomenda implements Entrega{
    private String titulo;
    private int mes;

    public Revista(String id, String Org, String Dst, String titulo, int mes) {
        super(id, Org, Dst);
        this.titulo = titulo;
        this.mes = mes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
