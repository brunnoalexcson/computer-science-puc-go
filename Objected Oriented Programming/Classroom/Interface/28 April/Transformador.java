public class Transformador implements Tomada220v{
    private AparelhoAmericano aparelho;

    public Transformador(AparelhoAmericano aparelho){
        this.aparelho = aparelho;
    }

    @Override
    public void fornecerEnergia220v() {
        System.out.println("Captar energia 220 da tomada.");
        System.out.println("Transformando 220 para 110.");
        aparelho.receberEnergia110v();
    }
}
