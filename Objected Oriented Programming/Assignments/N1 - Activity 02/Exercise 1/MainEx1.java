import java.time.LocalDate;

public class MainEx1 {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.setNome("Brunno");
        p1.setDataNascimento("13/07/2006");
        p1.setAltura(1.8f);

        System.out.println(p1);
    }
}
