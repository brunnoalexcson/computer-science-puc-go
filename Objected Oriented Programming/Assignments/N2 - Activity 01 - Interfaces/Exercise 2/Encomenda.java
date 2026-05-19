public class Encomenda implements Entrega{
    private String Identificador;
    private String CidadeOrigem;
    private String CidadeDestino;

    protected Encomenda(String id, String Org, String Dst){
        Identificador = id;
        CidadeOrigem = Org;
        CidadeDestino = Dst;
    }

    @Override
    public String getIdentificador() {
        return Identificador;
    }

    @Override
    public String getCidadeOrigem() {
        return CidadeOrigem;
    }

    @Override
    public String getCidadeDestino() {
        return CidadeDestino;
    }

    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        CidadeOrigem = cidadeOrigem;
    }

    public void setCidadeDestino(String cidadeDestino) {
        CidadeDestino = cidadeDestino;
    }

    public void imprimirBase(){
        System.out.println("ID: "+getIdentificador());
        System.out.println("Cidade Origem: "+getCidadeOrigem());
        System.out.println("Cidade Destino: "+getCidadeDestino());
    }
}
