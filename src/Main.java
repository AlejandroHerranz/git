import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numeros [] = new int[18];
        int s = 0;

        do {
            String valor = JOptionPane.showInputDialog("introduce una nota");
            int v = Integer.parseInt(valor);
            numeros [s] = v;
            s++;
        } while (s <= 17);
        int c=0;
        for (int i=0;i<=17 ; i++){
            c+=numeros[i];
        }
        int media=c/18;
        JOptionPane.showMessageDialog(null,"la media es "+ media);
    }
}
