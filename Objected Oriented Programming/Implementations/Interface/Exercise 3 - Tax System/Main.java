public class Main {
    public static void main(String[] args){
        double valor1 = 40.0, valor2 = 100.0, valor3 = 600.0;

        CalculadoraImposto calculadora = new CalculadoraImposto();
        calculadora.setEstrategia(new ImpostoAlimenticio());

        System.out.println("==================== IMPOSTO ALIMENTICIO ====================");
        System.out.println(calculadora.calcularTotal(valor1));
        System.out.println(calculadora.calcularTotal(valor2));
        System.out.println(calculadora.calcularTotal(valor3));
        System.out.println("============================================================");
        System.out.println();

        calculadora.setEstrategia(new ImpostoEletronico());

        System.out.println("==================== IMPOSTO ELETRONICO ====================");
        System.out.println(calculadora.calcularTotal(valor1));
        System.out.println(calculadora.calcularTotal(valor2));
        System.out.println(calculadora.calcularTotal(valor3));
        System.out.println("============================================================");
        System.out.println();

        calculadora.setEstrategia(new ImpostoLuxo());

        System.out.println("==================== IMPOSTO LUXO ==========================");
        System.out.println(calculadora.calcularTotal(valor1));
        System.out.println(calculadora.calcularTotal(valor2));
        System.out.println(calculadora.calcularTotal(valor3));
        System.out.println("============================================================");

    }
}
