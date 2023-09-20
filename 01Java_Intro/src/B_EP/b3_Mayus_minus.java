//Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
//después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.

package B_EP;
import java.util.Scanner;

public class b3_Mayus_minus {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        prinTxt("ingrese una frase");
        String phrase = scanner.nextLine();
        prinTxt("En mayúscula: "+phrase.toUpperCase());
        prinTxt("En minuscula: "+phrase.toLowerCase());
    }
    public static void prinTxt(String mensaje){
        System.out.println(mensaje);
    }
}
