package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ3POOUNAL {
    public static void main(String[] args) {
        int numeroInscripcion, estratoSocial;
        String nombres;
        double patrimonio, pagoMatricula;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de inscripcion: ");
        numeroInscripcion = entrada.nextInt();

        entrada.nextLine();
        System.out.print("Ingrese los nombres del estudiante: ");
        nombres = entrada.nextLine();

        System.out.print("Ingrese el patrimonio: ");
        patrimonio = entrada.nextDouble();

        System.out.print("Ingrese el estrato social: ");
        estratoSocial = entrada.nextInt();

        pagoMatricula = 50000;

        if (patrimonio > 2000000 && estratoSocial > 3) {
            pagoMatricula = pagoMatricula + (0.03 * patrimonio);
        }

        System.out.println("\nEL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numeroInscripcion + 
                           " Y NOMBRE " + nombres + 
                           " DEBE PAGAR: $" + pagoMatricula);
    }
}
