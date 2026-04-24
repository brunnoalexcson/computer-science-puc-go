import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro fusca = new Carro();

        int opcao = 0;
        while (opcao != 4){

            System.out.println("=========      MENU      =========");
            System.out.println("1 - Liga / Desliga");
            System.out.println("2 - Calibre o Carro");
            System.out.println("3 - Imprima o Status");
            System.out.println("4 - Sair");

            opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer de entrada

            String op;
            int p1, p2, p3, p4;

            switch(opcao){
                case 1:
                    System.out.print("Digite on para ligar o carro e off para desligar: ");
                    op = input.nextLine();

                    fusca.liga_desliga(op);
                    break;

                case 2:
                    System.out.print("Digite a pressão do pneu 1: ");
                    p1 = input.nextInt();

                    System.out.print("Digite a pressão do pneu 2: ");
                    p2 = input.nextInt();

                    System.out.print("Digite a pressão do pneu 3: ");
                    p3 = input.nextInt();

                    System.out.print("Digite a pressão do pneu 4: ");
                    p4 = input.nextInt();

                    fusca.calibreCarro(p1, p2, p3, p4);
                    break;

                case 3:
                    fusca.Imprimir();
                    break;

                case 4:
                    fusca.Sair();
                    break;

                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }
    }
}
