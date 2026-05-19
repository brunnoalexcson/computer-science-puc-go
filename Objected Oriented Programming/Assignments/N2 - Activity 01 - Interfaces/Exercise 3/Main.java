public class Main {
    public static void calculo(FormaGeometrica FG){
        if (FG instanceof Quadrado){
            Quadrado q = (Quadrado) FG;
            System.out.println("========== QUADRADO ==========");
            System.out.println("Área: "+q.area()+"\nComprimento: "+q.comprimento()+"\nLado: "+q.getLado());
        } else if (FG instanceof Circulo){
            Circulo c = (Circulo) FG;
            System.out.println("========== CIRCULO ==========");
            System.out.println("Área: "+c.area()+"\nComprimento: "+c.comprimento()+"\nRaio: "+c.getRaio());
        }
    }

    public static void main(String[] args) {
        FormaGeometrica q1 = new Quadrado(4);
        calculo(q1);

        FormaGeometrica c1 = new Circulo(3.5);
        calculo(c1);
    }
}
