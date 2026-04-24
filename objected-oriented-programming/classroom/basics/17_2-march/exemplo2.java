import java.util.ArrayList;
// Todas as estruturas prontas
import java.util.Stack;
// import java.util.Queue;
// import java.util.Deque;
// import java.util.Hashmap;
// import java.util.Hashtable;
// import java.util.TreeMap;
// import java.util.*;

public class exemplo2{

    public static void inicializarArray(ArrayList<Integer> l){
        for(int i = 0; i < 5;i ++) {
            l.add(i + 10);
        }
    }

    public static void imprimirArray(ArrayList<Integer> l){
        for (int num: l)
            System.out.println(num+" ");
        System.out.println("");
    }

    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        // Criado uma lista vazia e dinâmica

        inicializarArray(lista);
        imprimirArray(lista);

        // Passagem de estrutura, array... é modificado. Por isso o ArrayList é modificado
        // Int, float, bool... não é modificado

        Stack<Integer> pilha = new Stack<>();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println(pilha);
    }
}
