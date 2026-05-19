public class Passaro implements Voador{
    private String especie;

    public Passaro(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void voar() {
        System.out.println("Pássaro voando.");
    }

    @Override
    public void comunicar() {
        System.out.println("Pássaro comunicando.");
    }

    public void imprimirDados(){
        System.out.println("Espécie: "+especie);
        voar();
        comunicar();
    }
}
