public class CalculadoraDesconto{
    private Desconto estrategia;

    public void setEstrategia(Desconto estrategia){
        this.estrategia = estrategia;
    }

    public double calcular(double valor){
        if (estrategia == null){
            System.out.println("Nenhuma estratégia definida. Retornou -1 indicando erro.");
            return -1;
        }

        if (estrategia.aplicar(valor) < 0){
            return 0;
        }

        return estrategia.aplicar(valor);

    }
}
