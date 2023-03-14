/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nbarb
 */
public class Guia3 {

     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una palabra");
        String frase = leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Igual");
        }else{
            System.out.println("Distinto");
        }
    }
    
}
