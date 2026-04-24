public class FreteSedex implements InterfaceFrete {
    @Override
    public double calcular(double peso) {
        return peso*1.5 + 10.0;
    }
}
