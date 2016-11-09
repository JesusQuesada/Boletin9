
package boletin9_2;

public class Clase9_2 {
    public void calcularNum(){
      int sumas=0; 
      double productos=1;
        for(int i=10;i<=90;i++){
            sumas=sumas+i;
            productos=productos*i;  
    }
        System.out.println("sumas: " +sumas);
        System.out.println("productos: " +productos);
}
}
