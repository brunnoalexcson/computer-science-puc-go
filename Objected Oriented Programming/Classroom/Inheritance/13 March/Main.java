public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Goku", 250, 2541);

        System.out.println("======================================================");
        System.out.println("Pessoa: "+ pessoa1.getNome());
        System.out.println("Idade: "+ pessoa1.getIdade());
        System.out.println("RG: "+ pessoa1.getRg());

        Professor professor1 = new Professor("Japa", 49, 123456, "CMP2108", 11);

        System.out.println("======================================================");
        System.out.println("Professor: "+ professor1.getNome());
        System.out.println("Idade: "+ professor1.getIdade());
        System.out.println("RG: "+ professor1.getRg());
        System.out.println("Código de Matéria: "+ professor1.getCodMateria());
        System.out.println("Id (Identificação): "+ professor1.getId());

        Aluno aluno1 = new Aluno("Jose", 20, 1245, 20241002);

        System.out.println("======================================================");
        System.out.println("Aluno: "+ aluno1.getNome());
        System.out.println("Idade: "+aluno1.getIdade());
        System.out.println("RG: "+aluno1.getRg());
        System.out.println("Matricula: "+aluno1.getMatricula());
    }
}
