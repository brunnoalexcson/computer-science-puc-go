public class Mago extends Heroi{
    public Mago(String nome, int nivel) {
        super(nome, nivel);
    }

    public void atacar(){
        System.out.println("O mago lança uma bola de fogo!");
    }

    public void lancarFeitico(){
        System.out.println("Lançando feitiço...");
    }

    public void lancarFeitico(String nomeFeitico){
        System.out.println("Lançando feitiço "+nomeFeitico+"...");
    }

    public void lancarFeitico(String nomeFeitico, int mana){
        if (mana == 1){
            System.out.println("Lançando feitiço "+nomeFeitico+", custando "+mana+" mana...");
        } else{
            System.out.println("Lançando feitiço "+nomeFeitico+", custando "+mana+" manas...");
        }
    }
}
