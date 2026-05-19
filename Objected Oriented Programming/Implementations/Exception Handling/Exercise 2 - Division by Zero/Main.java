/*
Tratamento de Exceção:
    - Questão 01: Divisão por zero
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1 = input.nextInt();

        System.out.print("Digite o 2° número: ");
        int n2 = input.nextInt();

        try{
            int res = n1 / n2;
            System.out.println("Resultado da divisão entre "+n1+" e "+n2+": "+res);
        } catch (ArithmeticException e) {
            System.out.println("Erro capturado: "+e.getMessage());
        } finally {
            System.out.println("Fim da operação.");
        }

        input.close();
    }
}
