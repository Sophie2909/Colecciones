/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Main;

import Servicio.PerroServicio;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class ColeccEjApr01 {

    public static void main(String[] args) {
        PerroServicio perroServicio = new PerroServicio();
        boolean salir = false;
        
        while (!salir) {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Ingresar raza de perro");
            System.out.println("2. Mostrar razas de perros guardadas");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    perroServicio.ingresarPerro();
                    break;
                case 2:
                    perroServicio.mostrarPerros();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}