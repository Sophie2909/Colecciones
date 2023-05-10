/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicio;

import Objeto.Alumno;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author sacevedo
 */

public class AlumnoServicio {


    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumno = new ArrayList();

    public void crearAlumno() {
        int opcion = 0;
        
        do {
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("1.Crear Alumno");
            System.out.println("2.Salir");
            System.out.println("---------------");
            opcion = leer.nextInt();

            switch (opcion) {
                
                case 1:
                    Alumno alumno1 = new Alumno();

                    System.out.println("Ingrese el nombre del alumno");
                    alumno1.setNombre(leer.next());
                    ArrayList<Integer> notas = new ArrayList();

                    for (int i = 0; i < 3; i++) {
                        
                        System.out.println("Ingrese la nota # " + (i + 1));
                        notas.add(leer.nextInt());
                        alumno1.setNotas(notas);
                    }
                    alumno.add(alumno1);

                     break;
            
            
                case 2:
                    System.out.println("Saliendo...");
                    break;
                    

                 default:
                    System.out.println("¡ERROR! Ingresa una opción válida.");
                    break;
       
        }    
    }
    while (opcion != 2);
        
}


    public void MostrarAlumno (){
        System.out.println("Alumnos actuales en la lista:");
        for (Alumno aux : alumno) {
            System.out.println(aux);
        }
    }


  public void notaFinal() {
    System.out.println("Ingrese el nombre del alumno para calcular su nota final:");
    String nombre = leer.next();
    for (Alumno a : alumno) {
        a.getNombre().equals(nombre);
            ArrayList<Integer> notas = a.getNotas();
            int sum = 0;
            
            for (Integer nota : notas) {
                sum += nota;
                
            }
            double promedio = (double) sum / notas.size();
         if (a.getNombre().equals(nombre)){
            System.out.println("El promedio final de " + a.getNombre() + " es " + promedio);
         }
        
    }
  }
}

