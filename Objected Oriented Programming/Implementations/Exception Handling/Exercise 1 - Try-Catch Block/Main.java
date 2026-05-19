// import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30};

        System.out.println("Mensagem Inicial.");
        for (int i = 0; i < 4; i++){
            try{
                System.out.printf("Array [%d] = %d\n", i+1, arr[i]);
                System.out.println("Passou pelo try "+(i+1)+" vez(es).");
            } catch(ArrayIndexOutOfBoundsException e){
                // JOptionPane.showMessageDialog(null, "Erro de cálculo " + e.getMessage());
                // e.printStackTrace();
                System.out.println("Erro de Acesso de Índice: "+e.getMessage());
            } catch(Exception e){
                System.out.println("Erro Genérico.");
            } finally {
                System.out.println("Sendo executado independente se houve erro ou não.");
                /*
                Usado normalmente para: fechar arquivos, fechar conexão com banco, liberar memórias
                e encerrar recursos.
                 */
            }
        }

        System.out.println("Mensagem Final");
    }
}
