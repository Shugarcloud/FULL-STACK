//Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno
//de ellos es mayor a 25.
package A_GDT;

import java.util.Scanner;

public class a6_Mayor_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prinTxt("Ingrese un número entero");
        int num1 = scanner.nextInt();
        prinTxt("Ingrese otro número entero");
        int num2 = scanner.nextInt();

        if (num1 > 25 && num2 > 25) {
            prinTxt("Ambos números son mayores a 25.");
        } else if (num1 > 25 || num2 > 25) {
            prinTxt("Al menos un número es mayor que 25");
        } else {
            prinTxt("Ninguno de los números es mayor a 25.");
        }

    }

    public static void prinTxt(String mensaje) {
        System.out.println(mensaje);
    }

}
