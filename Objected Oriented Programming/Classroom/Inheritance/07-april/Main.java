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
    }
}
