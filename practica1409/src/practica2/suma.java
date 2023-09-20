
package practica2;
import javax.swing.JOptionPane;
public class suma {
    public static void main(String[] args) {
        double op1,op2,r;
        String ops1,ops2;
        JOptionPane.showMessageDialog(null,"suma");
        ops1=JOptionPane.showInputDialog("ingresa el primer numero: ");
        op1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        op2=Double.parseDouble(ops2);
        r=op1+op2;
        JOptionPane.showMessageDialog(null,"suma="+r);
        JOptionPane.showMessageDialog(null,"resta");
        ops1=JOptionPane.showInputDialog("ingresa el primer numero: ");
        op1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        op2=Double.parseDouble(ops2);
        r=op1-op2;
        JOptionPane.showMessageDialog(null,"resta="+r);
        JOptionPane.showMessageDialog(null,"multiplicacion");
        ops1=JOptionPane.showInputDialog("ingresa el primer numero: ");
        op1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        op2=Double.parseDouble(ops2);
        r=op1*op2;
        JOptionPane.showMessageDialog(null,"multplicacion="+r);
        JOptionPane.showMessageDialog(null,"division");
        ops1=JOptionPane.showInputDialog("ingresa el primer numero: ");
        op1=Double.parseDouble(ops1);
        ops2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        op2=Double.parseDouble(ops2);
        r=op1/op2;
        JOptionPane.showMessageDialog(null,"division="+r);
    }
    
}
