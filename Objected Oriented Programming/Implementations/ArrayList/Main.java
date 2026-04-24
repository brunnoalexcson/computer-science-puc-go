import java.util.ArrayList;

/*
ArrayList é uma estrutura de dados baseada em array que:
    . Cresce e diminui automaticamente
    . Armazena elementos de forma sequencial
    . Fornece métodos prontos para manipulação

 */

public class Main {
    public static void main() {
        ArrayList<Time> time = new ArrayList<>();
        // 1° forma de adicionar um objeto em um arraylist : FORMA DIRETA
        time.add(new Time("Flamengo", "Arrascaeta"));

        // 2° forma de adicionar um objeto em um arraylist : CRIANDO ANTES
        Time t1 = new Time("Corinthians", "Memphis Depay");
        time.add(t1);

        // 3° forma de adicionar um objeto em um arraylist : ADICIONANDO EM UMA POSIÇÃO ESPECÍFICA
        time.add(2, new Time("Palmeiras", "Vitor Roque"));

        // 4° forma de adicionar um objeto em um arraylist : USANDO ADDALL() -> VÁRIOS DE UMA VEZ
        ArrayList<Time> outros = new ArrayList<>();
        outros.add(new Time("Santos", "Neymar Jr"));
        outros.add(new Time("São Paulo", "Calleri"));

        time.addAll(outros);
        // Muito útil para juntar listas

        // 5° forma : CRIANDO LISTA JÁ COM ELEMENTOS
        ArrayList<Time> time2 = new ArrayList<>(
                java.util.Arrays.asList(new Time("Flamengo", "Pedro"),
                        new Time("Corinthians", "Yuri Alberto"))
        );
        // Inicializa já populado

        // 6° forma : USANDO SET (NÃO ADICIONA, SUBSTITUI)
        time.set(4, new Time("Bahia", "Everton Ribeiro"));

        for (Time times : time){
            System.out.println(times);
        }
    }
}
