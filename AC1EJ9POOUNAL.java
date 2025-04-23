package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ9POOUNAL {
    public static void main(String[] args) {

        int iden, con;
        double peso, t = 0, r = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la identificacion (0 para terminar): ");
        iden = entrada.nextInt();

        while (iden > 0) {

            System.out.print("Ingrese el peso de la persona: ");
            peso = entrada.nextDouble();

            System.out.print("Ingrese la condicion (3, 4, 5 o 6): ");
            con = entrada.nextInt();

            con = con - 2;

            switch (con) {
                case 1:
                    r = 0.15;
                    break;
                case 2:
                    r = 0.21;
                    break;
                case 3:
                    r = 0.22;
                    break;
                case 4:
                    r = 0.26;
                    break;
                default:
                    System.out.println("Condicion invalida. Usando rata 0.");
                    r = 0;
                    break;
            }

            t = peso * r;

            System.out.println("ID: " + iden + " - Tiempo de sesion: " + t + " minutos\n");

            System.out.print("Ingrese la identificacion (0 para terminar): ");
            iden = entrada.nextInt();
        }

        System.out.println("Fin del programa.");
    }
}
