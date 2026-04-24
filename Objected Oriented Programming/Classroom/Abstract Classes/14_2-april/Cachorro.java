public class Cachorro extends Mamifero{
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void talk(){
        System.out.println("Au! au!");
    }
}
