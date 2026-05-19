public class TV extends Aparelho implements Controle{
    private int canal;

    public TV(boolean status, int volume, int canal) {
        super(status, volume);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void power() {
        System.out.println("Ligando a TV.");
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
    }
}
