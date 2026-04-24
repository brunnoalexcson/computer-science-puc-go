public class Figura {
    private double area;

    public Figura(){
        area = 0.0;
    }

    public Figura(double area){
        this.area = area;
    }

    @Override
    public String toString(){
        return "Área: "+area+"\n";
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
