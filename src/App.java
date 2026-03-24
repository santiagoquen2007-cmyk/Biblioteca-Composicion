import java.util.Scanner;

import biblioteca.Biblioteca;
import biblioteca.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        
           biblioteca.Biblioteca biblioteca = new Biblioteca("Central");

           System.out.println("==============BIBLIOTECA CENTRAL==================");

          
           

           Libro libro1 = new biblioteca.Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Editorial Sudamericana", "858.67 M566");
           
           biblioteca.añadirLibro(libro1);
           
          


           Libro libro2 = new biblioteca.Libro("Rayuela", "Julio Cortázar", 1963, "Sudamericana", "863.55 J667");
           
           biblioteca.añadirLibro(libro2);    
          

           
          
        

           Libro libro3 = new biblioteca.Libro("La tía julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868 23 L567");
           
           biblioteca.añadirLibro(libro3);
          

           
           biblioteca.listarLibros();

    }
}
