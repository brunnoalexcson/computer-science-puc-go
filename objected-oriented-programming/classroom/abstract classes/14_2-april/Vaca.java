public class Vaca extends Mamifero{
    public Vaca(String nome){
        super(nome);
    }

    @Override
    public void talk(){
        System.out.println("Muuu! Muuu!");
    }
}
