import java.awt.Point;
// Biblioteca que tem várias soluções para geometria analítica

public class exemplo1 {
    public static void modificarPonto(Point ponto, int i){
        i = 15;
        ponto.setLocation(5,5);
        System.out.println("Ponto modificado = "+ ponto +"\ni = "+i);
    }

    public static void main(String[] args){
        Point p = new Point(0,0);
        int i = 100;

        System.out.println("Ponto original = "+ p +"\ni = "+i);
        modificarPonto(p, i);
        System.out.println("Ponto original = "+ p +"\ni = "+i);
        // Valores PRIMITIVOS passados por REFERÊNCIA não alteram o valor.
        // Valores NÃO PRIMITIVOS (Estruturas, ojbetos) passados por REFERÊNCIA alteram o valor.

    }
}
