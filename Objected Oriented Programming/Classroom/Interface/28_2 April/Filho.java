public class Filho implements Papai, Mamae{
    private String personalidade;

    public Filho(String personalidade) {
        this.personalidade = personalidade;
    }

    @Override
    public void herdouOlhos(){
        System.out.println("Tem Olhos Azuis.");
    }

    @Override
    public void herdouCabelo(){
        System.out.println("Tem cabelos Loiros.");
    }

    public void imprimirDados(){
        System.out.println("Personalidade: "+personalidade);
        herdouCabelo();
        herdouOlhos();
    }
}
