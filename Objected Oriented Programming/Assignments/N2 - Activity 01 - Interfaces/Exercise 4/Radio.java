public class Radio extends Aparelho implements Controle{
    private double faixa;

    public Radio(boolean status, int volume, double faixa) {
        super(status, volume);
        this.faixa = faixa;
    }

    public double getFaixa() {
        return faixa;
    }

    public void setFaixa(double faixa) {
        this.faixa = faixa;
    }

    @Override
    public void power() {
        System.out.println("Ligando o rádio.");
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
    }
}
