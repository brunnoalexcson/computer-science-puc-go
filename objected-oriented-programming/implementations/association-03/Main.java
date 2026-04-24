import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        Curso c1 = new Curso("Ciências da Computação", 60);
        Curso c2 = new Curso("ADS", 40);
        Curso c3 = new Curso("Engenharia da Computação", 60);

        int op;
        System.out.println("1. Inserir aluno");
        System.out.println("2. Imprimir lista de alunos");
        System.out.println("3. Encerrar programa");
        System.out.print("Digite uma opção: ");
        op = input.nextInt();
        input.nextLine(); // Limpar o buffer

        String nome;
        int matricula;
        int curso;

        while (op != 3){
            switch (op){
                case 1:
                    Aluno novo = new Aluno();
                    System.out.print("Digite o nome do aluno: ");
                    nome = input.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    matricula = input.nextInt();
                    novo.setNome(nome);
                    novo.setMatricula(matricula);

                    System.out.println("Digite '1' para associar ao curso de Ciências da computação");
                    System.out.println("Digite '2' para associar ao curso de ADS");
                    System.out.println("Digite '3' para associar ao curso de Engenharia de Computação");
                    curso = input.nextInt();
                    if (curso == 1) {
                        novo.setCurso(c1);
                    } else if (curso == 2) {
                        novo.setCurso(c2);
                    } else if (curso == 3) {
                        novo.setCurso(c3);
                    } else{
                        System.out.println("Número inválido. Nenhum curso associado.");
                        novo.setCurso(null);
                    }

                    alunos.add(novo);
                    break;
                case 2:
                    for (Aluno i : alunos){
                        System.out.println(i);
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Número inválido. Digite novamente");
                    break;
            }

            System.out.println("1. Inserir aluno");
            System.out.println("2. Imprimir lista de alunos");
            System.out.println("3. Encerrar programa");
            System.out.print("Digite uma opção: ");
            op = input.nextInt();
            input.nextLine();

        }
    }
}
