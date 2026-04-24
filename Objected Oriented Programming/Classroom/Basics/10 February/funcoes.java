import java.util.Scanner;

public class funcoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        int x,y;
        String continuar="s";
        while(opcao!=5)
        {
            System.out.print("digite o valor 1: ");
            x=entrada.nextInt();
            System.out.print("digite o valor 2: ");
            y=entrada.nextInt();
            menu.exibirMenu();
            opcao=entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("x+y=" + matematica.soma(x,y));
                    break;
                case 2:
                    System.out.println("x-y=" + matematica.subtrai(x,y));
                    break;
                case 3:
                    System.out.println("x*y=" + matematica.multiplica(x,y));
                    break;
                case 4:
                    System.out.println("x/y=" + matematica.divide(x,y));
                    break;
                case 5:
                    System.out.println("Desligando...");
                    break;
                default:
                    System.out.println("Opcao inválida.");
                    break;
            }
            System.out.println("Deseja continuar? (s/n)");
            continuar=entrada.next();
            if (continuar.toLowerCase().equals("s"))
                opcao=0;
            else
                //System.exit(0);
                opcao=5;
        }

        entrada.close();
    }
}