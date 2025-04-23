package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ4POOUNAL {
    public static void main(String[] args) {
        int n1, n2, n3, mayor;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        n1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        n2 = entrada.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else {
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }

        System.out.println("El valor mayor entre: " + n1 + ", " + n2 + " y " + n3 + " es: " + mayor);
    }
}
