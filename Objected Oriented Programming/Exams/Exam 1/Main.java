import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void adicionarLivro(ArrayList<Produto> livros, Scanner input){
        // Um livro tem: Nome (string), Preço (double), Status (String), Autor (String) e Número de Páginas (int)
        String nome, status, autor;
        double preco;
        int paginas;

        System.out.print("Digite o Nome do livro: ");
        nome = input.nextLine();

        System.out.print("Digite o Preço do livro: ");
        preco = input.nextDouble();
        input.nextLine();

        System.out.print("Digite o Status do livro (Promoção, BestSeller ou Indisponível): ");
        status = input.nextLine();

        System.out.print("Digite o Autor do livro: ");
        autor = input.nextLine();

        System.out.print("Digite o Número de Páginas do livro: ");
        paginas = input.nextInt();
        input.nextLine();

        Livro l = new Livro(nome, preco, status, autor, paginas);
        livros.add(l);
    }

    public static void adicionarCD(ArrayList<Produto> cds, Scanner input){
        // Um CD tem: Nome (string), Preço (double), Status (String), Artista (String) e Faixas (int)
        String nome, status, artista;
        double preco;
        int faixas;

        System.out.print("Digite o Nome do CD: ");
        nome = input.nextLine();

        System.out.print("Digite o Preço do CD: ");
        preco = input.nextDouble();
        input.nextLine();

        System.out.print("Digite o Status do CD (Promoção, BestSeller ou Indisponível): ");
        status = input.nextLine();

        System.out.print("Digite o Artista do CD: ");
        artista = input.nextLine();

        System.out.print("Digite o Número de Faixas do CD: ");
        faixas = input.nextInt();
        input.nextLine();

        CD c = new CD(nome, preco, status, artista, faixas);
        cds.add(c);
    }

    public static void adicionarDVD(ArrayList<Produto> dvds, Scanner input){
        // Um DVD tem: Nome (string), Preço (double), Status (String), Artista (String), Duracao (int) e lista de boxes
        String nome, status, artista;
        double preco;
        int duracao;

        System.out.print("Digite o Nome do DVD: ");
        nome = input.nextLine();

        System.out.print("Digite o Preço do DVD: ");
        preco = input.nextDouble();
        input.nextLine();

        System.out.print("Digite o Status do DVD (Promoção, BestSeller ou Indisponível): ");
        status = input.nextLine();

        System.out.print("Digite o Artista do DVD: ");
        artista = input.nextLine();

        System.out.print("Digite a Duração do DVD: ");
        duracao = input.nextInt();
        input.nextLine();

        int qtd;
        System.out.print("Digite a quantide de boxes desse DVD: ");
        qtd = input.nextInt();
        input.nextLine();

        ArrayList<Box> boxes = new ArrayList<>();
        String titulo;
        for (int i = 0; i < qtd; i++){
            System.out.print("Boxe "+(i+1)+": ");
            titulo = input.nextLine();
            Box b = new Box(titulo);
            boxes.add(b);
        }

        DVD d = new DVD(nome, preco, status, artista, duracao, boxes);
        dvds.add(d);
    }

    public static void listarProdutos(ArrayList<Produto> livros, ArrayList<Produto> cds, ArrayList<Produto> dvds){
        // Impressão de livros
        if (livros != null && !livros.isEmpty()){
            System.out.println("========== LIVROS ==========");
            int count = 0;
            for (Produto livro : livros){
                count++;
                System.out.println("Livro: "+count);
                System.out.println(livro);
                System.out.println();
            }
        } else{
            System.out.println("Não há livros.");
        }

        // Impressão de cds
        if (cds != null && !cds.isEmpty()){
            System.out.println("========== CDS ==========");
            int count = 0;
            for (Produto cd : cds){
                count++;
                System.out.println("CD: "+count);
                System.out.println(cd);
                System.out.println();
            }
        } else{
            System.out.println("Não há CDS.");
        }

        // Impressão de dvds
        if (dvds != null && !dvds.isEmpty()){
            System.out.println("========== DVDS ==========");
            int count = 0;
            for (Produto dvd : dvds){
                count++;
                System.out.println("DVD: "+count);
                System.out.println(dvd);
                System.out.println();
            }
        } else{
            System.out.println("Não há DVDS.");
        }


    }

    public static void main(String[] args) {
        ArrayList<Produto> livros = new ArrayList<>();
        ArrayList<Produto> cds = new ArrayList<>();
        ArrayList<Produto> dvds = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("#######################");
            System.out.println("# 1 - Add Livro       #");
            System.out.println("# 2 - Add CD          #");
            System.out.println("# 3 - Add DVD         #");
            System.out.println("# 4 - Listar Produtos #");
            System.out.println("# 9 - Sair            #");
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    adicionarLivro(livros, input);
                    break;

                case 2:
                    adicionarCD(cds, input);
                    break;

                case 3:
                    adicionarDVD(dvds, input);
                    break;
                case 4:
                    listarProdutos(livros, cds, dvds);
                    break;

                case 9:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente");
                    break;
            }

        } while (opcao != 9);

    }
}
