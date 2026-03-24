package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;
    Libro libro;
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    

    public void añadirLibro(Libro libros) {
        this.libros.add(libros);
    }


    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    public void listarLibros() {
        System.out.println("Libros en la biblioteca " + nombre + ":");
        for (Libro libro : libros) {
            System.out.println("-----------------------------");
            libro.imprimir();
            
        }
        
    }
    
}
