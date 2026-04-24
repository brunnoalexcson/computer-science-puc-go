public class Lampada {
    private String status;

    public Lampada(boolean estadoInicial){
        if (estadoInicial){
            status = "acesa";
        } else{
            status = "apagada";
        }
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
