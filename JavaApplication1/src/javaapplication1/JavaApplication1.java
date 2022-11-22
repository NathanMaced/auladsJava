package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {

public static void main(String[] args) {
            int [][] valor = new int[3][3];
            int l, c;
            String total = " ";
            
            
            for (l=0; l<3; l++){
                for (c=0; c<3; c++){
                String x = JOptionPane.showInputDialog(null, "Digite o valor da linha "+1+" e coluna "+c);
                valor [l][c] = Integer.parseInt(x);
                total = total + valor [l][c]+" ";
            }
            total = total + "\n";
            }
            JOptionPane.showMessageDialog(null, total);
            
    }
    
}
