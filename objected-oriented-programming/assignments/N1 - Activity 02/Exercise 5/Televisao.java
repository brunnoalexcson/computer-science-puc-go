public class Televisao {
    private int volume;
    private int canal;

    public Televisao(){
        volume = 0;
        canal = 12;
    }

    // Métodos GETTERS
    public int getVolume(){
        return volume;
    }

    public int getCanal(){
        return canal;
    }

    // Métodos SETTERS
    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

}
