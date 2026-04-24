public class Circulo extends Figura{
    private double raio;

    public Circulo(double area, double raio){
        super(area);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString(){
        return "Área: "+getArea()+"\nRaio: "+getRaio()+"\n";
    }
}
