//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de
//tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
package A_GDT;

import java.util.Scanner;

public class a10_Asteriscos {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int num1;

            do {
                prinTxt("Ingrese un número entre 1 y 20:");
                num1 = read.nextInt();

                if (num1 >= 1 && num1 <= 20) {
                    break; // Salir del bucle si el número está en el rango correcto
                } else {
                    prinTxt("El número ingresado debe estar entre 1 y 20.");
                }
            } while (true);

            prinTxt(num1 + " " + generarAsteriscos(num1));
        }
    }

    public static String generarAsteriscos(int n) {
        StringBuilder asteriscos = new StringBuilder();
        for (int i = 0; i < n; i++) {
            asteriscos.append("*");
        }
        return asteriscos.toString();
    }

    public static void prinTxt(String mensaje) {
        System.out.println(mensaje);
    }
}
