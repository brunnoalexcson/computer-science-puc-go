public class Alunos{

    private String nome;
    private double nota;
    private int desconto;

    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public void setNota(double nota)
    {
        this.nota=nota;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public String getNome()
    {
        return this.nome;
    }

    public double getNota() {
        return this.nota;
    }

    public int getDesconto() {
        return this.desconto;
    }

}