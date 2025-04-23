package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ5POOUNAL {
    public static void main(String[] args) {

        String nombre;
        int nht, het, hee8;
        double vhn, salario;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas en la semana: ");
        nht = entrada.nextInt();

        System.out.print("Ingrese el valor por hora normal: ");
        vhn = entrada.nextDouble();

        if (nht > 40) {
            het = nht - 40;

            if (het > 8) {
                hee8 = het - 8; 
                salario = (40 * vhn) + (16 * vhn) + (hee8 * 3 * vhn);
            } else {
                salario = (40 * vhn) + (het * 2 * vhn);
            }

        } else {
            salario = nht * vhn; 
        }

        System.out.println("El trabajador " + nombre + " devengo: $" + salario);
    }
}
