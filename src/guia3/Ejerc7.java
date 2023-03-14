/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser
de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author nbarb
 */
public class Ejerc7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
		String frase;
        int corr = 0, inc = 0;
        do {
            System.out.println("Ingrese una cadena de hasta 5 caracteres");
            frase = leer.nextLine();
            int largo = frase.length();
            String primera = frase.substring(0, 1);
            String ultima = frase.substring(largo - 1, largo);
            if (largo <= 5 && primera.equals("X") && ultima.equals("O")) {
                corr++;
                System.out.println(ultima + "  " + primera);
            } else {
                inc++;
            }
        } while (!frase.equalsIgnoreCase("&&&&&"));
        System.out.println("La cantidad de ingresos correctos es: " + corr);
        System.out.println("La cantidad de ingresos incorrectos es: " + (inc - 1));
    }
    
}
