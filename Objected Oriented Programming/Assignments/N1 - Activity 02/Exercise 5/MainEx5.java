import java.util.Scanner;

public class MainEx5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Televisao samsung = new Televisao();
        ControleRemoto controleSamsung = new ControleRemoto(samsung);

        int op;

        System.out.println("========== Bem vindo a Televisão ==========");
        System.out.println("1. Aumentar / Diminuir volume");
        System.out.println("2. Aumentar / Diminuir canal");
        System.out.println("3. Trocar para um canal indicado");
        System.out.println("4. Consultar volume e canal");
        System.out.println("5. Encerrar programa");
        op = input.nextInt();

        int opAux;

        while (op != 5){
            switch(op){
                case 1:
                    System.out.println("1 para aumentar o volume e -1 para diminuir o volume.");
                    opAux = input.nextInt();
                    controleSamsung.controleVolume(opAux);
                    break;

                case 2:
                    System.out.println("1 para aumentar o canal e -1 para diminuir o canal.");
                    opAux = input.nextInt();
                    controleSamsung.controleCanal(opAux);
                    break;

                case 3:
                    System.out.println("Digite o número do canal em que deseja ir");
                    opAux = input.nextInt();
                    controleSamsung.canalIndicado(opAux);
                    break;

                case 4:
                    controleSamsung.consultaValor();
                    break;

                default:
                    System.out.println("Valor inválido. Digite novamente.");
            }
            System.out.println("========== Bem vindo a Televisão ==========");
            System.out.println("1. Aumentar / Diminuir volume");
            System.out.println("2. Aumentar / Diminuir canal");
            System.out.println("3. Trocar para um canal indicado");
            System.out.println("4. Consultar volume e canal");
            System.out.println("5. Encerrar programa");
            op = input.nextInt();
        }
        System.out.println("Encerrando programa...");

    }
}
