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
public class Ejerc6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese elprimer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int opc;
        boolean ban = true;
        do {
            System.out.println("****CALCULADORA*****");
            System.out.println("1.SUMAR");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Ingrese una opcion:");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es " + resta);
                    break;
                case 3:
                    int mul = num1 * num2;
                    System.out.println("La multiplicación es " + mul);
                    break;
                case 4:
                    if (num2 > 0) {
                        float div = num1 / num2;
                        System.out.println("La división es " + div);
                    } else {
                        System.out.println("La división no es posible");
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String resp = leer.next();
                    resp = resp.toUpperCase();
                    if (resp.equals("S")) {
                        ban = false;
                    } else if (resp.equals("N")) {
                    } else {
                        System.out.println("La opción ingresada no es válida, volvé al menú");
                    }
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
        } while (ban);
    }
}
