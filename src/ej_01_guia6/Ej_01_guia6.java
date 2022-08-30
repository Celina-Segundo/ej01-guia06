/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ej_01_guia6;

import entidades.Libro;
import java.util.Scanner;
import serviciosDeLibros.metodoConstructor;

/**
 *
 * @author Celi
 */
public class Ej_01_guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al ejercicio 01 de la guia 7, Programacion Orientada a Objetos (POO).");
        System.out.println("Vamos a ingresar los datos de un libro para alojarlo como objeto.");
        System.out.println("Necesito que completes la informacion para llenar sus atributos.");
        
        //Scanner leer = new Scanner(System.in);
        
        metodoConstructor aa = new metodoConstructor();
        Libro L1 = aa.crearLibro();
        
        System.out.println(L1.toString());
        
    }
    
}
