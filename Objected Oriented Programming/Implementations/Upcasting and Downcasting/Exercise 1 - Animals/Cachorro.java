public class Cachorro extends Animal {
    private int idade;
    private double peso;

    public Cachorro(){
        idade = 0;
        peso = 0.0;
    }

    public Cachorro(String nome, String raca, int idade, double peso){
        super(nome, raca);
        this.idade = idade;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void identificaCachorro(){
        System.out.println("É um cachorro.");
    }
}
