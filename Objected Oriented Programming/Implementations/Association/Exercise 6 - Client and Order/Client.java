import java.util.ArrayList;

public class Client {
    private String name;
    private String cpf;
    private ArrayList<Order> orders = new ArrayList<>();

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addOrder(Order order){
        orders.add(order);
        order.setClient(this);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(getName()).append("\n");
        sb.append("CPF: ").append(getCpf()).append("\n");
        sb.append("\nOrders list: ").append("\n");

        for (int i = 0; i < orders.size(); i++){
            sb.append("\nOrder ").append(i+1).append(": ").append("\n");
            sb.append(orders.get(i));
            if (i < orders.size() - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
