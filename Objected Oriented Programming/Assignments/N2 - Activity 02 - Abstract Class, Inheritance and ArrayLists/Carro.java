public class Carro extends Veiculo{
    private double quilometragem;
    private double indice;

    public Carro(String tipo, String motor, double quilometragem, double indice) {
        super(tipo, motor);
        this.quilometragem = quilometragem;
        this.indice = indice;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getIndice() {
        return indice;
    }

    @Override
    public double calculaCO2(){
        return quilometragem*indice;
    }

    @Override
    public String toString(){
        return "Carro:\nTipo: "+getTipo()+"\nMotor: "+getMotor()+"\nQuilometragem: "+getQuilometragem()+
                "\nEmissão de CO2: "+calculaCO2()+" KG/mes\n";
    }
}
