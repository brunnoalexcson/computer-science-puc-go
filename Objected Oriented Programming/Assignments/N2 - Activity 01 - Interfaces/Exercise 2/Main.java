public class Main {
    public static void entregas(Entrega e){
        if (e instanceof Revista){
            Revista r = (Revista) e;
            System.out.println("========== REVISTA ==========");
            r.imprimirBase();
            System.out.println("Título: "+r.getTitulo()+"\nMês: "+r.getMes());
            System.out.println();
        } else if(e instanceof Carta){
            Carta c = (Carta) e;
            System.out.println("========== CARTA ==========");
            c.imprimirBase();
            System.out.println("Texto: "+c.getTexto());
            System.out.println();
        } else if(e instanceof Pacote){
            Pacote p = (Pacote) e;
            System.out.println("========== PACOTE ==========");
            p.imprimirBase();
            System.out.println("Descrição: "+p.getDescricao()+"\nPeso: "+p.getPeso());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Entrega e1 = new Revista("1001", "Goiânia", "São Paulo", "Veja", 5);
        entregas(e1);

        Entrega e2 = new Carta("1002", "Recife", "Alagoas", "Presente do Papai Noel");
        entregas(e2);

        Entrega e3 = new Pacote("1003", "Rio de Janeiro", "Porto Alegre", 1.5, "Talheres de Inox");
        entregas(e3);
    }
}
