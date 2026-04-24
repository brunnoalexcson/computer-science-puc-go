import java.time.LocalDate;

public class Pessoa {
    // Atributos privados
    private String nome;
    private String dataNascimento;
    private float altura;

    // Construtor padrão
    public Pessoa(){ }

    // Métodos GETTERS
    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public float getAltura(){
        return altura;
    }

    // Métodos SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataNascimento(String data_nascimento){
        this.dataNascimento = data_nascimento;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public int calcularIdade(){
        String[] partes = dataNascimento.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        LocalDate data_atual = LocalDate.now();

        int idade = data_atual.getYear() - ano;

        if (mes > data_atual.getMonthValue() ||(mes == data_atual.getMonthValue() && dia > data_atual.getDayOfMonth())){
            idade--;
        }

        return idade;
    }

    // Método para imprimir todos os dados de uma pesssoa (utilizarei o toString)
    @Override
    public String toString(){
        return "=== Dados da Pessoa: ===\nNome: "+nome+"\nData de Nascimento: "+dataNascimento+"\nIdade: "+calcularIdade()+"\nAltura: "+altura;
    }
}

