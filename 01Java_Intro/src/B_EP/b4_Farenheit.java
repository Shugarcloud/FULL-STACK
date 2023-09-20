//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

package B_EP;
import java.util.Scanner;


public class b4_Farenheit {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        prinTxt("POr favor ingrese los grados Centigrados");
        double celsius = scanner.nextDouble();
        double conversion = 32 + (9*celsius/5);
        prinTxt(celsius+("º Celsius son equivalentes a ")+conversion+("º Farenheit"));
    }
    public static void prinTxt(String mensaje){
        System.out.println(mensaje);
    }
}
