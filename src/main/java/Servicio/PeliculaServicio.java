/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Pelicula y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
package Servicio;

import Objeto.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class PeliculaServicio {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        public Pelicula crearPelicula(){
            Pelicula pelicula1 = new Pelicula();
            System.out.println("Ingresa el nombre de la película: ");
            pelicula1.setTitulo(leer.next());
            System.out.println("Ingresa el nombre del director de la película: ");
            pelicula1.setDirector(leer.next());
            System.out.println("Ingresa la duración de la película en horas: ");
            pelicula1.setDuracion(leer.nextDouble());
            
            return pelicula1;
            
        }
        
        public void Menu(){
            ArrayList <Pelicula> pelicula = new ArrayList();
            int opcion = 0;
        
        do {
            
            pelicula.add(crearPelicula());
            System.out.println("¿Desea ingresar otra pelicula? 1--> si o 2--> no");
            opcion = leer.nextInt();
            while (opcion!=2 && opcion!=1){
                System.out.println("Ingrese una opcion valida 1--> si o 2--> no");
                opcion=leer.nextInt();
            }
            
        } while (opcion!=2);
        System.out.println("las peliculas ingresadas son:");
        MostrarPelicula(pelicula);
        System.out.println("las peliculas que tienen duracion mayor a 1 hora son:");
        MostrarPelisLargas(pelicula);
        OrdenarPelis(pelicula);
    }
    public void MostrarPelicula(ArrayList <Pelicula> pelicula){
        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula.toString());
        }
    }
    public void MostrarPelisLargas(ArrayList <Pelicula> pelicula){
       for (Pelicula pelicula1 : pelicula) {
           if (pelicula1.getDuracion()> 1) {
               System.out.println(pelicula1.toString());
           }
           
            
        } 
       
    }
    public void OrdenarPelis(ArrayList <Pelicula> pelicula){
        System.out.println("Orden de menor a mayor");
        Collections.sort(pelicula,comparadores.ordsch);
        for (Pelicula peliculas : pelicula) {
            System.out.println(peliculas);
        }
        System.out.println("Orden de mayor a menor");
        Collections.sort(pelicula, comparadores.ordasch);
        for (Pelicula peliculas : pelicula) {
            System.out.println(peliculas);
        }
        System.out.println("Orden alfabetico por Titulo");
        Collections.sort(pelicula,comparadores.ordTit);
         for (Pelicula peliculas : pelicula) {
            System.out.println(peliculas);
        }
        System.out.println("Orden alfabetico por Director");
        Collections.sort(pelicula,comparadores.ordDir);
        for (Pelicula peliculas : pelicula) {
            System.out.println(peliculas);
        }
    }
    
  
    
}
            
           
    

