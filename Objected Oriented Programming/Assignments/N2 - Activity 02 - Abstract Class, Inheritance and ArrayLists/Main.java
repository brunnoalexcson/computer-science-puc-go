import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void imprimirDados(ArrayList<Veiculo> Lista){
        int count = 1;
        for (Veiculo veiculo : Lista){
            System.out.println("Veiculo "+count+" -\n"+veiculo.toString());
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de veículos: ");
        int qtd = input.nextInt();

        ArrayList<Veiculo> Lista = new ArrayList<>();
        int op;
        for (int i = 0; i < qtd; i++){
            do {
                System.out.println("==========================");
                System.out.println("Veículo "+(i+1));
                System.out.println("1. Carro");
                System.out.println("2. Barco");
                System.out.println("3. Bicicleta");
                System.out.println("==========================");
                System.out.print("Digite o número do tipo do veículo: ");
                op = input.nextInt();
                input.nextLine();

                if (op < 1 || op > 3) System.out.println("Opção inválida. Tente novamente.");

            } while (op < 1 || op > 3);

            System.out.print("Digite o tipo do veículo (Gasolina, Diesel, Elétrica, Álcool, Normal): ");
            String tipo = input.nextLine();

            System.out.print("Digite o motor: ");
            String motor = input.nextLine();

            System.out.print("Digite a Quilometragem: ");
            double km = input.nextDouble();
            input.nextLine();

            switch(op){
                case 1:
                    Veiculo c = new Carro(tipo, motor, km, 1.24);
                    Lista.add(c);
                    break;
                case 2:
                    Veiculo b = new Barco(tipo, motor, km, 0.23);
                    Lista.add(b);
                    break;
                case 3:
                    Veiculo bic = new Bicicleta(tipo, motor, km, 0.0);
                    Lista.add(bic);
                    break;
            }
        }

        imprimirDados(Lista);

        input.close();
    }
}
