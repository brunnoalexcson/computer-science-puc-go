public class Administrativo extends Assistente{
    private String turno;

    protected Administrativo(String nome, String cpf, String matricula, String turno) {
        super(nome, cpf, matricula);
        this.turno = turno;
    }

    protected String getTurno() {
        return turno;
    }

    protected void setTurno(String turno) {
        this.turno = turno;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Turno: " + getTurno());
    }
}
