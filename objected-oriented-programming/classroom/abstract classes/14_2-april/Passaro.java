public class Passaro extends Animal{
    public Passaro(String nome){
        super(nome);
    }

    @Override
    public void talk() {
        System.out.println("Piu! Piu!");
    }
}
