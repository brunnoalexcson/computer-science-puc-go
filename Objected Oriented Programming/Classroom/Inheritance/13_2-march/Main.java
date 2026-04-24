public class Main {
    public static void main(String[] args){
        Cachorro cachorro1 = new Cachorro("Jose");
        Gato gato1 = new Gato("Eu");

        cachorro1.setRaca("Shitzu");
        gato1.setRaca("Alaranjado");

        System.out.println("Cachorro: "+cachorro1.getNome());
        System.out.println("Raça: "+cachorro1.getRaca());
        cachorro1.late();
        System.out.println("========================================================");
        System.out.println("Gato: "+gato1.getNome());
        System.out.println("Raça: "+gato1.getRaca());
        gato1.mia();

        Animal cao2 = new Cachorro("TOTO");
        // Instanciou um cachorro com características de animal. Não tem acesso as funções de cachorro
        // Vantagens: instanciar um objeto da classe superior constante
        // Quando se utiliza isso: depende do modelo de programação que está usando
        Animal gato2 = new Gato("Coxinha");

        // Aqui eles não são cachorros e gatos, mas sim animais

        Animal animal = new Animal();


        System.out.println("Teste:");
        if (Cachorro.class.isInstance(animal)){
            Cachorro cao3 = Cachorro.class.cast(animal);
            cao3.caminha();
            cao3.late();
        }

        if (Cachorro.class.isInstance(animal)){
            Cachorro cao4 = (Cachorro)animal;
            cao4.caminha();
            cao4.late();
        }

        Cachorro cao5 = (Cachorro)animal;
        cao5.caminha();
    }
}
