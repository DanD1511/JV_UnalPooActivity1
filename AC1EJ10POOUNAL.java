package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ10POOUNAL {
    public static void main(String[] args) {

        int n, con;
        long fac = 1;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero positivo: ");
        n = entrada.nextInt();

        for (con = 1; con <= n; con++) {
            fac = fac * con;
        }

        System.out.println("EL FACTORIAL DE " + n + " ES: " + fac);
    }
}
