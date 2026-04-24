import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args){
        AdivinhaNumero n1 = new AdivinhaNumero();

        Scanner input = new Scanner(System.in);
        int tentativa;
        boolean continuar = true;

        System.out.println("========================== Tente acertar o número aleatório ==========================");
        for (int i = 0; i < 5 && continuar; i++){
            System.out.println("Tentativa de número: "+(i+1));
            System.out.print("Digite o número: ");
            tentativa = input.nextInt();

            if (tentativa == n1.getNumero()){
                System.out.println("Parabéns, você acertou o número!!!");
                continuar = false;
            } else{
                System.out.print("Tentativa fracassada. Dica: ");
                n1.dica(tentativa);
            }
        }

        if (!continuar){
            System.out.println("Programa encerrado. Você venceu.\nNúmero aleatório: "+n1.getNumero());
        } else{
            System.out.println("Programa encerrado. Você perdeu.\nNúmero aleatório: "+n1.getNumero());
        }

        input.close();
    }
}
