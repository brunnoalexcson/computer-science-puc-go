public class Main {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("Pessoa: ");

        Pessoa p1 = new Pessoa("Joao", 33, "Masculino");
        System.out.println(p1);

        System.out.println("======================================================");
        System.out.println("Empregado: ");

        Empregado e1 = new Empregado("Ana", 21, "Feminino", 5000.00, "1400");
        System.out.println(e1);

        System.out.println("======================================================");
        System.out.println("Cliente: ");

        Cliente c1 = new Cliente("Almir", 40, "Masculino", 2000.00, 1976);
        System.out.println(c1);

        System.out.println("======================================================");
        System.out.println("Gerente: ");

        Gerente g1 = new Gerente("Tania", 30, "Feminino", 15000.00, "1300", "Atendimento");
        System.out.println(g1);

        System.out.println("======================================================");
        System.out.println("Vendedor: ");

        Vendedor v1 = new Vendedor("Igor", 25, "Masculino", 7000.00, "1301", 14000.00, 120);
        System.out.println(v1);
    }
}
