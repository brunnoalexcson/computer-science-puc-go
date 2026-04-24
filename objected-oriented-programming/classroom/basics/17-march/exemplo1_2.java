import java.util.ArrayList;

public class exemplo1_2 {
    public static void modificarValor(int x, ArrayList<Integer> l){
         x += 15;
         for (int i = 0; i < 5; i++){
             l.add(i, i+1);
         }
    }

    public static void imprimirDados(int x, ArrayList<Integer> l){
        System.out.println("x: "+x);
        System.out.println("Array: ");
        for (int num : l)
            System.out.print(num+" ");
    }

    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();

        int x = 10;

        modificarValor(x, lista);
        imprimirDados(x, lista);

    }
}
