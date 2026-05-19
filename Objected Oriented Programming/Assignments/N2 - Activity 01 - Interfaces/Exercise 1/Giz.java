public class Giz implements Caneta{
    private String cor;

    public Giz(String cor) {
        this.cor = cor;
    }

    @Override
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void escrever(String texto){
        System.out.println("Usando "+texto+" com giz.");
    }
}
