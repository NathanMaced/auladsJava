package batalha_naval;

import javax.swing.JOptionPane;

    public class Batalha_naval {

    public static void main(String[] args) {
        int [][] valor = new int [5][5];
        int [][] tab = new int[5][5];
        int l = 0,c = 0;
        String total = " ";
        
        tab [2][0] = 1;
        tab [4][0] = 1;
        tab [1][1] = 1;
        tab [4][4] = 1;
        
        tab [2][2] = 2;
        tab [2][3] = 2;
        tab [0][3] = 2;
        tab [0][4] = 2;
        
        tab [3][1] = 3;
        tab [3][2] = 3;
        tab [3][3] = 3;
        
        valor [l][c] = 0;
        for (l=0; l<1; l++){
            for(c=0; c<1; c++){
                String x = JOptionPane.showInputDialog(null, "Digite a linha ");
                l = Integer.parseInt(x);
                String xx = JOptionPane.showInputDialog(null, "Digite a coluna ");
                c = Integer.parseInt(x);
            
            if ( tab [l][c] == 1){
                valor [l][c] = 1;
            }
            total = total + valor [l][c] + " ";
            }
            total = valor + "\n";
        }

JOptionPane.showMessageDialog(null, total);

    }
    }