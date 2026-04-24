public class CalculadoraDeFrete {
    private InterfaceFrete estrategia;

    public void setEstrategia(InterfaceFrete estrategia){
        this.estrategia = estrategia;
    }

    public double realizarCalculo(double peso){
        if (estrategia == null){
            System.out.println("Frete não cadastrado.");
        }
        return estrategia.calcular(peso);
    }

}
