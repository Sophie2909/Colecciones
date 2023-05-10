/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicio;

import Objeto.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class PerroServicio {
    
    private ArrayList<Perro> perros;
    private Scanner scanner;
    
    public PerroServicio() {
        perros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void ingresarPerro() {
        System.out.print("Introduce la raza del perro: ");
        Perro perro = new Perro();
        perro.setRaza(scanner.nextLine());
        perros.add(perro);
        System.out.println("Perro guardado.");
    }
    
    public void mostrarPerros() {
        System.out.println("Razas de perros guardadas:");
        for (Perro perro : perros) {
            System.out.println(perro.getRaza());
        }
    }
}