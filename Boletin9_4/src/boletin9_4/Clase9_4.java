
package boletin9_4;

import javax.swing.JOptionPane;

public class Clase9_4 {
    public void tablaMult(){
        int num;
        int i;
        do{
        i=1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Introducir número: "));
        if (num!=0){
                do{
                System.out.println(num+"x"+i+"="+num*i);
                i++;    
                }while (i<=10);
        }
        }while (num!=0);
        System.out.println("Adiós ");
    }
}

