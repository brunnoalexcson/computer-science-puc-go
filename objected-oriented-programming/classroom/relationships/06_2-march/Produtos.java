public class Produtos {
    public int codigo;
    public String descProduto;
    public float preco;
    public int qtde;

    public void listarDados(){
        System.out.println("Dados do Produto: ");
        System.out.println("Código: "+codigo);
        System.out.println("Descrição: "+descProduto);
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade: "+qtde);
    }


    @Override
    public String toString(){
        return "Dados do Produto:\nCódigo: "+codigo+"\nDescrição: "+descProduto+"\nPreço: "+preco+"\nQuantidade: "+qtde+"\n";
    }

}
