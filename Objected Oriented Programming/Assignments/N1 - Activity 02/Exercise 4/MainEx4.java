public class MainEx4 {
    public static void main(String[] args){
        Arma Glock = new Arma();
        Arma FuzilIa2 = new Arma(30);
        Arma ParaFal = new Arma(20, 0);

        FuzilIa2.setQuantidadeMunicao(0);
        FuzilIa2.recarregar();

        for (int i = 0; i < 30; i++){
            FuzilIa2.disparar();
        }
        FuzilIa2.disparar();

        FuzilIa2.recarregar(20);
        System.out.println(FuzilIa2.getQuantidadeMunicao());

        int sobra = FuzilIa2.recarregar(20);
        System.out.println("Sobram: "+sobra+" munições.");

        System.out.println(FuzilIa2.getQuantidadeMunicao());
    }
}
