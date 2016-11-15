
package boletin9_5;

import javax.swing.JOptionPane;

public class Clase9_5 {
    int numElem = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de elementos "));
    int num;
    int num1 = 0;
    int num2 = 1;
    public void serie1(){
    num = 0;    
    //int numElem = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de elementos "));
    for(int i=0;i<numElem;i++){
            num = num+2;
            System.out.println(+num+"+");
        }
    }
    public void serie2(){
        //int numElem = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de elementos "));
        for(int i=1;i<=numElem;i++){
            if (i%2==0)
                System.out.println("+"+i);
            else
                System.out.println("-"+i);
        }
    }
    
    public void serie3(){
        /*int numElem = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de elementos "));
        int num1 = 0;
        int num2 = 1;*/
        for(int i = 0; i<numElem; i++){
            num1=num2;
            num2=num;
            num=num1+num2;
            System.out.println(num);
        }
    }
    
   

}

