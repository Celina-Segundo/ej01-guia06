
package serviciosDeLibros;

import entidades.Libro;
import java.util.Scanner;


public class metodoConstructor {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   public Libro crearLibro() {
       System.out.println("Ingrese el NUMERO DE ID UNICO DEL LIBRO >ISBN<"); 
       String ISBN = leer.nextLine();
       
       System.out.println("Ingrese el TITULO del libro");
       String titulo = leer.nextLine();
       
       System.out.println("Ingrese el AUTOR del libro");
       String autor = leer.nextLine();
       
       System.out.println("Ingrese el NUMERO DE PAGINAS del libro");
       int numPaginas = leer.nextInt();
      
       return new Libro(ISBN,titulo,autor,numPaginas);
       
   } 
   
   public void mostrarInfo(Libro libro) {
       System.out.println(libro.toString());
   }
}


