import java.util.Random;

public class classeSorteio {
    private classeDado valor = new classeDado();
    // classeDado é o tipo do objeto

    public int getValor(){
        return this.valor.getValorSelecionado();
    }

    public void lancarDado(){
        Random semente = new Random();

        valor.setValorSelecionado(semente.nextInt(6)+1);
    }

}
