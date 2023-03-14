/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nbarb
 */
public class Ejer3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        int largo = frase.length();
        if (largo == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("INCorrecto");
        }
    }
}
