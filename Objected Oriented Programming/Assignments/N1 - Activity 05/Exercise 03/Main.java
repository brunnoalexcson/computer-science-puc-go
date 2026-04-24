public class Main {
    public static void main(String[] args) {
        Normal ingresso1 = new Normal(150);
        CamaroteInferior camaroteI1 = new CamaroteInferior("A-12", ingresso1);

        System.out.println(camaroteI1);

        VIP ingresso2 = new VIP(300, 100);
        CamaroteSuperior camaroteS1 = new CamaroteSuperior("B-3", ingresso2);
        System.out.println(camaroteS1);

    }
}
