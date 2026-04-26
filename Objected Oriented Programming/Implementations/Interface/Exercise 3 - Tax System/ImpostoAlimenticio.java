public class ImpostoAlimenticio implements Imposto{
    @Override
    public double calcular(double valor) {
        if (valor < 50.00){
            return valor;
        } else{
            return valor * 1.05;
        }
    }
}
