public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("Cachorro: ");
        Cachorro dog = new Cachorro("Rex", 30, "Boxer");
        System.out.println(dog);

        System.out.println("====================================================");
        System.out.println("Peixe: ");
        Peixe fish = new Peixe("Neon", 0.2, "Ornamental");
        System.out.println(fish);

        System.out.println("====================================================");
        System.out.println("Animal: ");
        Animal animal = new Animal("Gato", 10);
        System.out.println(animal);
        System.out.println("====================================================");

    }
}
