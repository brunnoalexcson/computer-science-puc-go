import java.util.ArrayList;

public class DVD extends Midia{
    private int duracao;
    private ArrayList<Box> boxes;

    public DVD(String nome, double preco, String status, String artista, int duracao, ArrayList<Box> boxes) {
        super(nome, preco, status, artista);
        this.duracao = duracao;
        this.boxes = boxes;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(ArrayList<Box> boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString(){
        String texto = "Nome: "+getNome()+
                "\nPreço: "+getPreco()+
                "\nStatus: "+getStatus()+
                "\nArtista: "+getArtista()+
                "\nDuração: "+getDuracao()+
                "\nBoxes:\n";

        for (Box box : boxes){
            texto += " - " + box.getTitulo() + "\n";
        }

        return texto;
    }
}

/*

@Override
public String toString(){
    StringBuilder sb = new StringBuilder();

    sb.append("Nome: ").append(getNome()).append("\n");
    sb.append("Preço: ").append(getPreco()).append("\n");
    sb.append("Status: ").append(getStatus()).append("\n");
    sb.append("Artista: ").append(getArtista()).append("\n");
    sb.append("Duração: ").append(getDuracao()).append("\n");

    sb.append("Boxes:\n");
    for (Box box : boxes){
        sb.append(" - ").append(box.getTitulo()).append("\n");
    }

    return sb.toString();
}

 */
