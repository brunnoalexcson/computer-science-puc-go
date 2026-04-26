public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        double valor = 100.00;

        calculadora.setEstrategia(new DescontoFixo());
        System.out.println("Valor: "+valor+"\nFixo: "+calculadora.calcular(valor));

        calculadora.setEstrategia(new DescontoPercentual());
        System.out.println("Percentual: "+calculadora.calcular(valor));

        calculadora.setEstrategia(new SemDesconto());
        System.out.println("Sem desconto: "+calculadora.calcular(valor));


    }
}
