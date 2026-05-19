public class Morcego implements Mamifero, Voador{
    @Override
    public void caminhar() {
        System.out.println("Morcego caminhando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Morcego alimentando.");
    }

    @Override
    public void voar() {
        System.out.println("Morcego voando.");
    }

    @Override
    public void comunicar() {
        System.out.println("Morcego comunicando.");
    }

    public void imprimirDados(){
        caminhar();
        alimentar();
        voar();
        comunicar();
    }
}
