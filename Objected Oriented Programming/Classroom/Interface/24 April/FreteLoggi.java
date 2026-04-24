public class FreteLoggi implements InterfaceFrete{
    @Override
    public double calcular(double peso) {
        return peso*2.5 + 3.0;
    }
}
