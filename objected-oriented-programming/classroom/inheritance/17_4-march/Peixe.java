public class Peixe extends Animal{


    // Boa prática de programação: explicita o Override
    // Soobreposição

    @Override
    public void mover(){
        super.mover();
        System.out.println("Peixes nadam...");
    }
}
