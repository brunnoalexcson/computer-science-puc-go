import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Heroi> herois = new ArrayList<>();

        Heroi h1 = new Guerreiro("Guerreiro de Londres", 1);
        herois.add(h1);

        Heroi h2 = new Mago("Mago de Gelo", 1);
        herois.add(h2);

        Heroi h3 = new Mago("Maguinho da deep web", 5);
        herois.add(h3);

        herois.add(new Guerreiro("Neymar Jr", 100));

        Heroi h4 = new Mago("Joãozinho do Cascalho", 500);
        herois.add(h4);

        int count = 1;

        for (Heroi heroi : herois){
            System.out.println("======================== HEROI "+count+" ========================");
            heroi.atacar();

            if (heroi instanceof Mago){
                Mago m = (Mago) heroi;
                if(m.getNome().equals("Mago de Gelo")){
                    m.lancarFeitico("de Gelo", 10);
                } else if(m.getNome().equals("Maguinho da deep web")){
                    m.lancarFeitico("de Enganar", 5);
                } else{
                    m.lancarFeitico("Padrão", 1);
                }
            }

            count++;
            System.out.println();
        }
    }
}
