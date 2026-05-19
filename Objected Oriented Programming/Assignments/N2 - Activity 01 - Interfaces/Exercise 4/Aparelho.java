public abstract class Aparelho implements Controle {
    private boolean status;
    private int volume;

    public Aparelho(boolean status, int volume) {
        this.status = status;
        this.volume = volume;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVolume() {
        return volume;
    }

    public abstract void power();

    public void setVolume(int volume){
        this.volume = volume;
    }
}
