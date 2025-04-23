package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ8POOUNAL {
    public static void main(String[] args) {

        int num, suma = 0, valn = 0, val0 = 0, valp = 0;
        String siga = "SI";

        Scanner entrada = new Scanner(System.in);

        while (siga.equalsIgnoreCase("SI")) {

            System.out.print("Ingrese un numero entero: ");
            num = entrada.nextInt();
            suma += num;

            if (num > 0) {
                valp++;
            } else if (num == 0) {
                val0++;
            } else {
                valn++;
            }

            System.out.print("Desea ingresar otro numero? (SI/NO): ");
            siga = entrada.next();
        }

        int totaln = valn + val0 + valp;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma de los numeros: " + suma);
        System.out.println("Cantidad de positivos: " + valp);
        System.out.println("Cantidad de ceros: " + val0);
        System.out.println("Cantidad de negativos: " + valn);
        System.out.println("Total de numeros ingresados: " + totaln);
    }
}
