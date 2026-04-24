public class Main {
    public static void main(String[] args){
        Capitao cap = new Capitao();
        cap.setNome("Luke Skywalker");
        cap.setNivelExperiencia(-1);

        Nave nave1 = new Nave("Millennium Falcon");
        Nave nave2 = new Nave("X-wing", cap);

        nave1.tripulante = cap;

        System.out.println(nave1);
        System.out.println(nave2);
    }
}
