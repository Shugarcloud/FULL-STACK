//Escribir un programa que pida dos números enteros por teclado y calcule
//la suma de los dos. El programa deberá después mostrar el resultado de la suma
package B_EP;
import java.util.Scanner;

public class b1_Suma {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        prinTxt("Ingrese un número");
        int num1 = scanner.nextInt();
        prinTxt("Ingrese otro número");
        int num2 = scanner.nextInt();
        prinTxt("la suma de "+num1+" + "+num2+" es: "+(num1+num2));
        
    }
    public static void prinTxt (String mensaje){
        System.out.println(mensaje);
    }
    
}
