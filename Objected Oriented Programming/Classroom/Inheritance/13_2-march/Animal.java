public class Animal {
    private String nome;
    private String raca;

    // Construtor 1
    public Animal(){
        nome = "";
        raca = "";
    }

    // Construtor 2
    public Animal(String nome){
        this.nome = nome;
    }

    // Métodos Getters
    protected String getNome(){
        return nome;
    }

    protected String getRaca(){
        return raca;
    }

    // Métodos Setters
    protected void setNome(String nome){
        this.nome = nome;
    }

    protected void setRaca(String raca){
        this.raca = raca;
    }

    // Métodos
    public void caminha(){
        System.out.println("Sim");
    }
}
