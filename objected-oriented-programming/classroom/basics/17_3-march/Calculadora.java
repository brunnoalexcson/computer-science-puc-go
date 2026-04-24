public class Calculadora {

    // Mesma função chamada soma. Ele irá ser identificado pelos parâmetros
    // Isso é polimorfismo dinâmico
    public int soma(int x, int y){
        return x+y;
    }

    public double soma(double x, double y){
        return x+y;
    }

}
