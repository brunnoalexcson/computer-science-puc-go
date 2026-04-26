public class DescontoFixo implements Desconto{
    @Override
    public double aplicar(double valor){
        return valor-20;
    }
}
