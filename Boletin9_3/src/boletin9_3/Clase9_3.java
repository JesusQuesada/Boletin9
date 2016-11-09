
package boletin9_3;

import javax.swing.JOptionPane;

public class Clase9_3 {
    public void calcularRec(){
        
        float base, altura;
     do{  
    base = Float.parseFloat(JOptionPane.showInputDialog("Base: "));
     }while (base<0);
           
         
     do  {  
    altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
     }while (altura<0);
         
     System.out.println("Area= " +base*altura);
    }
}