import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carrinhos {
    private ArrayList<Produtos> itens;

    public Carrinhos() {
        itens = new ArrayList<>();
    }

    public Carrinhos(Produtos item){
        itens = new ArrayList<>();
        itens.add(item);
    }

    public Carrinhos(ArrayList<Produtos> lista){
        itens = new ArrayList<>();
        itens = lista;
    }

    public void incluirItem(Produtos item){
        itens.add(item);
    }

    public void exibirCarrinho(){
        for (Produtos item : itens){
            item.listarDados();
            System.out.println("");
        }
    }

    public float fecharCompra(){
        float total = 0.0f;
        for (Produtos item: itens){
            total += item.preco*item.qtde;
        }
        return total;
    }


}
