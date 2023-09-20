//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo
//hasta que la nota sea correcta.

package A_GDT;
import java.util.Scanner;

public class a8_Validar_Nota {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int nota = -1;
        
        while(nota < 0 || nota>10){
            prinTxt("Ingrese la nota. La nota debe estar entre 0 y 10");
            nota = scanner.nextInt();
        }
        
        prinTxt("La nota ingresada es correcta");
        
    }
    public static void prinTxt(String mensaje){
        System.out.println(mensaje);
    }
    
}
