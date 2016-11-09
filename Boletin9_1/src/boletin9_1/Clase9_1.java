
package boletin9_1;

import javax.swing.JOptionPane;

public class Clase9_1 {
    
    public void calcularNum(){
        int num, cp=0, cn=0, cc=0;
        for (int i=0;i<10;i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número :"));
            if (num<0)
                cn++;
                
            else if (num>0)
                cp++;
                
            else
                cc++;
        }    
            System.out.println(cn + "Son negativos");
            System.out.println(cp + "Son positivos");
            System.out.println(cc + "Son ceros");      
    }
      
    
}
