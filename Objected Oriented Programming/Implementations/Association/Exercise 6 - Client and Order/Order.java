public class Order {
    private int id;
    private double value;
    private Client client;

    public Order(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString(){
        return "Id: "+getId()+"\nValue: "+getValue();
    }
}
