public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno(){ }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        if (curso != null){
            return "Nome: "+nome+"\nMatrícula: "+matricula+"\nNome do Curso: "+curso.getNome()+"\nCarga Horária: "+curso.getCargaHoraria();
        } else{
            return "Nome: "+nome+"\nMatrícula: "+matricula+"\nSem curso associado.";
        }
    }

}
