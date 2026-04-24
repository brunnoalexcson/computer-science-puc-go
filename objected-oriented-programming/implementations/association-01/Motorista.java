public class Motorista extends Pessoa{
    private int identCarteira;

    public Motorista(){
        super();
    }

    public Motorista(String nome, int rg, int idade, double peso){
        super(nome, rg, idade, peso);
    }

    public int getIdentCarteira(){
        return identCarteira;
    }

    public void setIdentCarteira(int identCarteira){
        this.identCarteira = identCarteira;
    }

}
