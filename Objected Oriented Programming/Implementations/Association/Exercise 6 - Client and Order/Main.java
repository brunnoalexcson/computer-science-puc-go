import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();

        clients.add(new Client("Ricardo", "12345678900"));
        clients.add(new Client("Gabriel", "52112345699"));
        clients.add(new Client("Ricardo", "11001100112"));

        Order o1 = new Order(11, 235.40);
        Order o2 = new Order(12, 50.00);
        Order o3 = new Order(13, 150.00);
        Order o4 = new Order(14, 175.00);
        Order o5 = new Order(15, 555.31);

        clients.get(0).addOrder(o1);
        clients.get(0).addOrder(o2);

        clients.get(1).addOrder(o3);
        clients.get(1).addOrder(o4);

        clients.get(2).addOrder(o5);

        for (Client client : clients){
            System.out.println("========== CLIENT ==========");
            System.out.println(client);
            System.out.println("============================");
        }
    }
}
