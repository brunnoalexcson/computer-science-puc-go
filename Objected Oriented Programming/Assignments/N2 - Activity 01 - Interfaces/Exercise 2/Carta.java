public class Carta extends Encomenda implements Entrega{
    private String texto;

    public Carta(String id, String Org, String Dst, String texto) {
        super(id, Org, Dst);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
