package operaciones;
import java.util.Scanner;
public class Diego {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[]a=new int[5];
        int cont;
        for(cont=0;cont<=4;cont++){
            System.out.print("ingresa un numero: ");
            a[cont]=leer.nextInt();
            }
            for(cont=0;cont<=4;cont++){
            System.out.print(a[cont]+", ");
        }
        
    }
}
