public class Cachorro implements Mamifero{
    private String raca;

    public Cachorro(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void caminhar() {
        System.out.println("Cachorro caminhando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Cachorro alimentando.");
    }

    public void imprimirDados(){
        System.out.println("Raça: "+raca);
        caminhar();
        alimentar();
    }
}
