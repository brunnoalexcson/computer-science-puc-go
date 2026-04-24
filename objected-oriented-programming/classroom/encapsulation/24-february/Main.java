import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        contaBancaria[] itau = new contaBancaria[3];

        ArrayList<contaBancaria> bradesco = new ArrayList<>();

        System.out.println("Digite as contas do Itau:");
        for(int i=0;i<3;i++)
        {
            itau[i] = new contaBancaria();
            System.out.print("Digite o saldo da conta " + (i+1) + ": ");
            itau[i].deposito(teclado.nextDouble());
        }
        // double valor = itau[1].retirada(10.00);
        // System.out.println("Saldo da conta 1: " + valor);
        // System.out.println("");
        for(int i=0;i<3;i++)
        {
            System.out.println("Saldo da conta " + (i+1) + ": " + itau[i].getSaldo());
        }

        for(int i=0;i<3;i++)
        {
            bradesco.add(new contaBancaria());
            System.out.print("Digite o saldo da conta " + (i+1) + ": ");
            bradesco.get(i).deposito(teclado.nextDouble());
        }
        System.out.println("Bradesco:");
        System.out.println(bradesco);
        teclado.close();
    }
}
