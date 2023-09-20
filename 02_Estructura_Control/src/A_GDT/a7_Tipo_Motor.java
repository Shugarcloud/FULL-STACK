//Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del
//tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese 
//un valor entre 1 y 4. El programa debe mostrar lo siguiente:
//o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
//o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
//o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
//o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
//o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
package A_GDT;

import java.util.Scanner;

public class a7_Tipo_Motor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prinTxt("Elija una opción: 1  2  3  4");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                prinTxt("La bomba es una bomba de agua");
                break;
            case 2:
                prinTxt("La bomba es una bomba de gasolina");
                break;
            case 3:
                prinTxt("La bomba es una bomba de hormigon");
                break;
            case 4:
                prinTxt("La bomba es una bomba de pasta alimenticia");
                break;

            default:
                prinTxt("No existe un valor válido para tipo de bomba");
        }
    }

    public static void prinTxt(String mensaje) {
        System.out.println(mensaje);
    }

}
