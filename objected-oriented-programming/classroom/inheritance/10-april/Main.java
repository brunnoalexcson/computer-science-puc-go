import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Funcionario objeto1 = new Funcionario("Goku", 8500);
        Funcionario objeto2 = new Funcionario("Kuririn", 1500);

        objeto1.setNome("Vegetta");
        System.out.println(objeto1.getNome());
        System.out.println();
        objeto2.imprimir();
        System.out.println(objeto1);
        System.out.println();

        objeto1.setGratificacao(200.00);
        objeto1.setSalarioBase(objeto1.getSalarioBase()+300);

        Gerente g1 = new Gerente("Richard", 12000, 2500);
        System.out.println(g1);
        g1.setGratificacao(10000.00);
        System.out.println(g1);

        if(objeto1 instanceof Gerente){
            // Se existe uma instância de objeto 1 em gerente
            Gerente g = (Gerente)objeto1;
            g.organizaEquipe();
            // Isso se chama downcasting
            // Tem algumas coisas que o java permite mas não é boa prática
            // Não faz sentido um funcionário qualquer organizar a equipe
            // Por isso esse downcasting é desnecessário
            // Foi utilizado para aprender a ténica. Só é utilizado para eventuais necessidades
        }

        ArrayList<Funcionario> professores = new ArrayList<>();

        professores.add(objeto1);
        professores.add(objeto2);
        professores.add(new Funcionario());
        professores.add(new Funcionario("Joao", 2400));
        professores.add(new Gerente("Astolfo", 12500, 1200));
        Funcionario objeto5 = new Funcionario();
        professores.add(objeto5);

        System.out.println("Nome 0: "+professores.get(0).getNome());

        for (Funcionario professor : professores){
            System.out.println("Nome: "+professor.getNome());
            System.out.println("Salario: "+professor.getSalarioBase()+"\n");
        }

    }
}
