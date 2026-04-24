import java.util.Random;

public class AdivinhaNumero {
    private int numero;

    public AdivinhaNumero(){
        sorteiaNumero();
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    private void sorteiaNumero(){
        Random numRandom = new Random();
        numero = numRandom.nextInt(100)+1; // [1, 100]
    }

    public void dica(int tentativa){
        if (tentativa > numero)
            System.out.println("O número aleatório é menor.\n");
        else
            System.out.println("O número aleatório é maior.\n");
    }
}
