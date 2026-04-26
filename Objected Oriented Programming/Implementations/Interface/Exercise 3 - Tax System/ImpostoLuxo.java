public class ImpostoLuxo implements Imposto{
    @Override
    public double calcular(double valor) {
        return (valor * 1.25) + 50.00;
    }
}
