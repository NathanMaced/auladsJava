package batalha_naval;

import javax.swing.JOptionPane;

    public class Batalha_naval {

    public static void main(String[] args) {
        int [][] valor = new int [5][5];
        String [][] resul = new String[5][5];
        int l = 0,c = 0;
        String total = " ";
        
        valor [l][c] = 0;
        for (l=0; l<5; l++){
            for(c=0; c<5; c++){
            total = total + valor [l][c] + " ";
            }
            total = total + "\n";
        }
JOptionPane.showMessageDialog(null, total);
    }
    }