import java.util.Scanner;

public class Main {
    public static void ligaDesliga(Controle t){
        if (t instanceof Aparelho){
            Aparelho a = (Aparelho) t;
            if (a.getStatus()){
                System.out.println("Status: ON");
            } else{
                System.out.println("Status: OFF");
            }
        }
    }

    public static void controlaVolume(Controle t, Scanner input){
        if (t instanceof Aparelho){
            Aparelho a = (Aparelho) t;
            System.out.print("Digite o novo valor para o volume: ");
            int vol = input.nextInt();

            a.setVolume(vol);
        }
    }

    public static void selecionaCanal(Controle t, Scanner input){
        System.out.print("Escreva o número do canal em que deseja colocar: ");
        int canal = input.nextInt();

        if (t instanceof TV){
            TV tv = (TV) t;
            tv.setCanal(canal);
        } else{
            System.out.println("Aparelho selecionado incorretamente.");
        }
    }

    public static void selecionaFaixa(Controle t, Scanner input){
        System.out.print("Escreva o número da faixa em que deseja colocar: ");
        double faixa = input.nextDouble();

        if (t instanceof Radio){
            Radio r = (Radio) t;
            r.setFaixa(faixa);
        } else{
            System.out.println("Aparelho selecionado incorretamente.");
        }
    }

    public static void imprimeDados(Controle t){
        if (t instanceof TV){
            TV tv = (TV) t;
            System.out.println("========== TV ==========");
            System.out.println("Status: "+tv.getStatus());
            System.out.println("Canal atual: "+tv.getCanal());
            System.out.println("Volume atual: "+tv.getVolume());
        } else{
            Radio radio = (Radio) t;
            System.out.println("========== RADIO ==========");
            System.out.println("Status: "+radio.getStatus());
            System.out.println("Faixa atual: "+radio.getFaixa());
            System.out.println("Volume atual: "+radio.getVolume());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aparelho Toshiba = new TV(false, 30, 10);

        Aparelho Pioneer = new Radio(true, 15, 8.1);

        int opcao;
        do{
            System.out.println("--------Escolha a opção--------");
            System.out.println("- 1 - Liga/Desliga            -");
            System.out.println("- 2 - Controla Volume         -");
            System.out.println("- 3 - TV - Seleciona Canal    -");
            System.out.println("- 4 - Radio - Seleciona Faixa -");
            System.out.println("- 5 - Informações TV          -");
            System.out.println("- 6 - Informações Radio       -");
            System.out.println("- 0 - Sair                    -");
            System.out.println("-------------------------------");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            int op;
            switch (opcao){
                case 1:
                    System.out.print("Deseja verificar o status de qual aparelho?\n1. TV\n2. Radio\nOpção: ");
                    op = input.nextInt();

                    if (op == 1){
                        ligaDesliga(Toshiba);
                    } else if (op == 2){
                        ligaDesliga(Pioneer);
                    } else{
                        System.out.println("Opção Inválida. Voltando...");
                    }

                    break;

                case 2:
                    System.out.print("Deseja alterar o volume de qual aparelho?\n1. TV\n2. Radio\nOpção: ");
                    op = input.nextInt();

                    if (op == 1){
                        controlaVolume(Toshiba, input);
                    } else if (op == 2){
                        controlaVolume(Pioneer, input);
                    } else{
                        System.out.println("Opção Inválida. Voltando...");
                    }

                    break;

                case 3:
                    selecionaCanal(Toshiba, input);
                    break;

                case 4:
                    selecionaFaixa(Pioneer, input);
                    break;

                case 5:
                    imprimeDados(Toshiba);
                    break;

                case 6:
                    imprimeDados(Pioneer);
                    break;

                case 0:
                    System.out.println("Finalizando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}
