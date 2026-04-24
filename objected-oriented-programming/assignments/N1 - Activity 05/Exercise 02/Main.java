public class Main {
    public static void main(String[] args) {
        Assistente a1 = new Tecnico("Goku","04411122202", "2000", 500);
        Assistente a2 = new Administrativo("Naruto", "12345678900", "2001", "Noturno");


        a1.imprimir();
        System.out.println();
        a2.imprimir();
    }
}
