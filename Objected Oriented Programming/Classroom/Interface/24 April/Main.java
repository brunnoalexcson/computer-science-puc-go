public class Main {
    public static void main(String[] args) {
        CalculadoraDeFrete calculadora = new CalculadoraDeFrete();
        double pesoProduto = 2.0;

        calculadora.setEstrategia(new FreteSedex());
        System.out.println("Frete Sedex: "+calculadora.realizarCalculo(pesoProduto));

        calculadora.setEstrategia(new FreteLoggi());
        System.out.println("Frete Loggi: "+calculadora.realizarCalculo(pesoProduto));
        
    }
}
