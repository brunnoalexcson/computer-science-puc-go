public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Brunno", 19);
        Endereco e1 = new Endereco("Ravena", 125, "Goiânia");

        p1.setEndereco(e1);
        System.out.println(p1);
    }
}
