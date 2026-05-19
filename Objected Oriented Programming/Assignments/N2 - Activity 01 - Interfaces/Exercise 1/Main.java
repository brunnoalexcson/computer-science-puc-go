public class Main {
    public static void escreverTexto(Caneta c, String texto){
        c.escrever(texto);
        System.out.println("Cor = "+c.getCor());
    }

    public static void main(String[] args) {
        Caneta c1 = new Esferografica("Azul");
        escreverTexto(c1, "Teste de Escrita");

        Caneta c2 = new Giz("Verde");
        escreverTexto(c2, "Teste de Escrita");

        Caneta c3 = new Lapis("Preto");
        escreverTexto(c3, "Teste de Escrita");
    }
}
