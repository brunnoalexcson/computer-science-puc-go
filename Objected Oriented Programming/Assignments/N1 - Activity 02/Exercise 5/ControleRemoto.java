public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void controleVolume(int op){
        if (op == 1){
            if (tv.getVolume() < 50){
                tv.setVolume(tv.getVolume() + 1);
                System.out.println("Volume aumentado.");
            } else {
                System.out.println("Volume máximo atingido.");
            }
        }
        else if (op == -1){
            if (tv.getVolume() > 0){
                tv.setVolume(tv.getVolume() - 1);
                System.out.println("Volume diminuído.");
            } else {
                System.out.println("Volume mínimo atingido.");
            }
        }
        else{
            System.out.println("Valor inválido.");
        }
    }

    public void controleCanal(int op){
        if (op == 1){
            if (tv.getCanal() < 100){
                tv.setCanal(tv.getCanal() + 1);
                System.out.println("Canal aumentado.");
            } else {
                System.out.println("Canal máximo atingido.");
            }
        }
        else if (op == -1){
            if (tv.getCanal() > 10){
                tv.setCanal(tv.getCanal() - 1);
                System.out.println("Canal diminuído.");
            } else {
                System.out.println("Canal mínimo atingido.");
            }
        }
        else{
            System.out.println("Valor inválido.");
        }
    }

    public void canalIndicado(int op){
        if (op < 10 || op > 100){
            System.out.println("Valor inválido. Digite novamente.");
        } else if (op == tv.getCanal()){
            System.out.println("Já está nesse canal.");
        } else{
            System.out.println("Trocando para o canal "+op+"...");
            tv.setCanal(op);
        }
    }

    public void consultaValor(){
        System.out.println("Volume de som: "+tv.getVolume());
        System.out.println("Canal selecionado: "+tv.getCanal());
    }
}
