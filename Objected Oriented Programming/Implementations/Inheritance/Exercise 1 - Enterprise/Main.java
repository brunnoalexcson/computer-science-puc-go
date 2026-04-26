import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario g1 = new Gerente("Richard", 12000, 2500);
        Funcionario v1 = new Vendedor("Robson", 5000, 3500);
        Funcionario v2 = new Vendedor("Pietra", 5000, 2500);

        funcionarios.add(g1);
        funcionarios.add(v1);
        funcionarios.add(v2);

        for (Funcionario funcionario : funcionarios){
            funcionario.exibirDados();
        }
    }
}
