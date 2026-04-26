public class CalculadoraImposto {
    private Imposto estrategia;

    public void setEstrategia(Imposto estrategia){
        this.estrategia = estrategia;
    }

    public double calcularTotal(double valor){
        if (estrategia == null){
            System.out.println("Nenhuma estratégia aplicada. Erro.");
            return -1;
        }

        double resultado = estrategia.calcular(valor);

        if (resultado < 0){
            return 0;
        }

        return resultado;
    }
}
