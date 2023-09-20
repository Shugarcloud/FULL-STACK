package A_GDT;
import java.util.Scanner;

public class a9_20_Numeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int round = 0;
        int num;
        int suma = 0;

        do {
            prinTxt("Ingrese un número entero:");
            num = leer.nextInt();

            if (num == 0) {
                prinTxt("Se capturó el número cero.");
                break;
            } else if (num > 0) {
                suma += num; // Sumar solo números positivos
            }

            round++;
        } while (round < 20);

        prinTxt("La suma de los números positivos ingresados es: " + suma);
    }

    public static void prinTxt(String mensaje) {
        System.out.println(mensaje);
    }
}