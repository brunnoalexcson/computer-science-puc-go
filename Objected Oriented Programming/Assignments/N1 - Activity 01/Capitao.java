public class Capitao {
    private String nome;
    private int nivelExperiencia;

    public Capitao(){
        nivelExperiencia = 1;
    }

    // Métodos Getters
    public String getNome(){
        return nome;
    }

    public int getNivelExperiencia(){
        return nivelExperiencia;
    }

    // Métodos Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNivelExperiencia(int nivelExperiencia){
        if (nivelExperiencia < 1)
            System.out.println("Erro: Nível de Experiência não pode ser menor do que 1. Será definido como 1.");
        else
            this.nivelExperiencia = nivelExperiencia;
    }
}
