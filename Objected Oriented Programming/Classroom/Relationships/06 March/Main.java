// Código para treinar ASSOCIAÇÃO em POO

public class Main {
    public static void main(String[] args) {
        classeSorteio jogador1 = new classeSorteio();
        classeSorteio jogador2 = new classeSorteio();

        System.out.println("Lançamento de dado do João...");
        jogador1.lancarDado();
        System.out.println("Número sorteado: "+jogador1.getValor());

        System.out.println("Lançamento de dado do Marco...");
        jogador2.lancarDado();
        System.out.println("Número sorteado: "+jogador2.getValor());

        if (jogador1.getValor() > jogador2.getValor()){
            System.out.println("Jogador João venceu");
        } else if (jogador2.getValor() > jogador1.getValor()){
            System.out.println("Jogador Marco venceu");
        } else{
            System.out.println("Os jogadores empataram.");
        }

    }
}
