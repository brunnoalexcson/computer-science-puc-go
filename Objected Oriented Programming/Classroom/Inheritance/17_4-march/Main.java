public class Main {
    public static void main(String[] args){
        Animal obj1 = new Animal();
        obj1.mover();

        Peixe obj2 = new Peixe();
        obj2.mover();

        Anfibio obj3 = new Anfibio();
        obj3.mover();

        Passaro obj4 = new Passaro();
        obj4.mover();

        // Polimorfismo dinâmico em herança
        Animal obj5 = new Passaro();
        obj5.mover();

        System.out.println("Utilizando o Super()");
        Animal obj6 = new Peixe();
        obj6.mover();
    }
}
