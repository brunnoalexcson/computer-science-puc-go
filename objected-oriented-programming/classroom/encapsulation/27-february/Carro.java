public class Carro{
    private int p1, p2, p3, p4;
    private boolean ligado;

    public Carro(){
        this.p1 = 30;
        this.p2 = 30;
        this.p3 = 30;
        this.p4 = 30;
        ligado = false;
    }

    // Método 1: Liga / Desliga
    // public void liga_desliga
    public void liga_desliga(String op){
        if ("off".equals(op)){
            this.ligado = false;
        }
        else if ("on".equals(op)){
            this.ligado = true;
        }
        else{
            System.out.println("Opção Inválida. Carro desligando...");
        }
    }


    // Método 2: Calibre o carro
    public void calibreCarro(int p1, int p2, int p3, int p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // Método 3: Imprima o status
    public void Imprimir(){
        if (ligado) System.out.println("O carro está ligado.");
        else System.out.println("O carro está desligado.");
        System.out.println("Pressão do pneu 1: "+this.p1);
        System.out.println("Pressão do pneu 2: "+this.p2);
        System.out.println("Pressão do pneu 3: "+this.p3);
        System.out.println("Pressão do pneu 4: "+this.p4);
    }


    // Método 4: Sair
    public void Sair(){
        System.out.println("Encerrando o programa...");
    }
}