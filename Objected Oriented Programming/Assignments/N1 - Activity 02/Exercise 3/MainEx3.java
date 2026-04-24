public class MainEx3 {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada(true);
        Lampada lampada2 = new Lampada(false);

        System.out.println("A lâmpada 1 está "+lampada1.getStatus());
        System.out.println("A lâmpada 2 está "+lampada2.getStatus());
    }
}
