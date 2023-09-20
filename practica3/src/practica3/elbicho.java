
package practica3;
import javax.swing.JOptionPane;
public class elbicho {
    public static void main(String[] args) {
         String ops1;
         int[]ar=new int[5];
         int cont,r=0;
         JOptionPane.showMessageDialog(null,"Programa que solicita 5 numeros y los suma");
         for(cont=0;cont<=4;cont++){
            ops1=JOptionPane.showInputDialog("ingresa el primer numero: ");
            ar[cont]=Integer.parseInt(ops1);
            }
        for(cont=0;cont<=4;cont++){
            r=r+ar[cont];
            }
        JOptionPane.showMessageDialog(null,"suma="+r);
    }
    
}
