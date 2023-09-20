//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz 
//cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().
package B_EP;

import java.util.Scanner;

public class b5_Math {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prinTxt("Ingrese un número");
        double num1 = scanner.nextDouble();

        double doble = num1 * 2;
        double triple = num1 * 3;
        double raiz = Math.sqrt(num1);

        prinTxt("El doble del número es: " + doble);
        prinTxt("El triple del número es: " + triple);
        prinTxt("La raíz cuadrada del número es: " + raiz);

    }

    public static void prinTxt(String mensaje) {
        System.out.println(mensaje);
    }
}
