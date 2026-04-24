import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;

        System.out.print("Digite o dia / mês / ano: ");
        dia = input.nextInt();
        mes = input.nextInt();
        ano = input.nextInt();

        classeData data = new classeData(dia, mes, ano);

        if (data.verificaData())
            System.out.println("A data é válida.");
        else
            System.out.println("A data é inválida.");

    }
}