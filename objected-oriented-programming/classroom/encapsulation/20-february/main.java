import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Alunos[] alunos = new Alunos[3];


        for (int i=0;i<3;i++)
        {
            alunos[i] = new Alunos();
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            alunos[i].setNome(ler.next());
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            alunos[i].setNota(ler.nextDouble());
            System.out.print("Digite o desconto do aluno " + (i+1) + ": ");
            alunos[i].setDesconto(ler.nextInt());
        }

        for (int i=0;i<3;i++)
        {
            System.out.println("Nome do Aluno " + (i+1) + ": " + alunos[i].getNome());
            System.out.println("Nota do Aluno " + (i+1) + ": " + alunos[i].getNota());
            System.out.println("Desconto do Aluno" + (i+1) + ": " + alunos[i].getDesconto());
        }
        ler.close();

    }

}