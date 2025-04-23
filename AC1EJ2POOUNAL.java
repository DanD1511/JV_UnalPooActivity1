package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ2POOUNAL {

    public static void main(String[] args) {
        int Y, A, B, C, X;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de Y: ");
        Y = entrada.nextInt();

        System.out.print("Ingrese el valor de A: ");
        A = entrada.nextInt();

        System.out.print("Ingrese el valor de B: ");
        B = entrada.nextInt();

        System.out.print("Ingrese el valor de C: ");
        C = entrada.nextInt();

        if (Y < A && A < B && B < C) {
            X = 0;
        } else if (A <= Y && Y < B) {
            X = 1;
        } else if (B <= Y && Y < C) {
            X = 2;
        } else if (C <= Y) {
            X = 3;
        } else {
            X = 4;
        }

        System.out.println("El valor de X es: " + X);
    }
}
