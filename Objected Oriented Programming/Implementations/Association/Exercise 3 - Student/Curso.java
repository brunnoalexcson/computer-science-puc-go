public class Curso {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome(){
        return nome;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

}
