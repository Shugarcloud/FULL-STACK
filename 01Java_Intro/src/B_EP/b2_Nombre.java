//Escribir un programa que pida tu nombre, lo guarde en una variable 
//y lo muestre por pantalla.

package B_EP;
import java.util.Scanner;

public class b2_Nombre {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        prinTxt("por favor ingrese su nombre");
        String name = scanner.nextLine();
        prinTxt("Su nombre es "+name);
    }
    public static void prinTxt (String mensaje){
        System.out.println(mensaje);
    }
    
}
