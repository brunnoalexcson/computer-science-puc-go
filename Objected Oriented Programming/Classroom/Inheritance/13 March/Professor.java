public class Professor extends Pessoa{
    // private String nome;
    // private int idade;
    // private int rg;
    private String codMateria;
    private int id;

    // Construtor
    public Professor(String nome, int idade, int rg, String codMateria, int id){
        super(nome, idade, rg);
        this.codMateria = codMateria;
        this.id = id;
    }

    // Métodos Getters

    public String getCodMateria(){
        return codMateria;
    }

    public int getId(){
        return id;
    }

    // Métodos Setters

    public void setCodMateria(String codMateria){
        this.codMateria = codMateria;
    }

    public void setId(int id){
        this.id = id;
    }
}
