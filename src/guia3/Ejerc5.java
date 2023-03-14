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
public class Ejerc5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una limite positivo");
        int limite = leer.nextInt();
        int suma =0;
        do{
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma+=num;
        }while(suma <= limite);
        System.out.println("La suma es:" + suma);
    }
}
