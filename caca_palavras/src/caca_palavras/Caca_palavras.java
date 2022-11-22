package caca_palavras;

import javax.swing.JOptionPane;

public class Caca_palavras {
    public static void main(String[] args) {
        String [][] letra = new String[5][5];
        String total = " ";
        int l, c;
        
        for (l=0; l<5; l++){
            for(c=0; c<5; c++){
            letra [l][c] = JOptionPane.showInputDialog(null, "Digite a letra da linha "+ l +" e coluna "+c);
            total = total + letra [l][c] + " ";
            }
            total = total + "\n";
        }
JOptionPane.showMessageDialog(null, total);
    }
    }
    

