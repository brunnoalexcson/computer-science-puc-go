public class ImpostoEletronico implements Imposto{
    @Override
    public double calcular(double valor) {
        if (valor <= 500.00){
            return valor * 1.15;
        } else{
            return valor * 1.20;
        }
    }
}
