/*
Tratamento de Exceção:
    - Questão 02: Índice Inválido
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== QUESTÃO 02 =====");
        int[] arr = new int[] {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++){
            System.out.println("Vetor["+i+"] = "+arr[i]);
        }

        System.out.print("Digite o índice do vetor: ");
        int ind = input.nextInt();

        try{
            System.out.println("Valor: "+arr[ind]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro capturado: "+e.getMessage());
        } finally {
            System.out.println("Fim da operação.");
        }

        input.close();
    }
}
