package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ6POOUNAL {
    public static void main(String[] args) {

        double vd1, vd2, vd3, salar;
        double totven, porven;
        double salar1, salar2, salar3;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las ventas del departamento 1: ");
        vd1 = entrada.nextDouble();

        System.out.print("Ingrese las ventas del departamento 2: ");
        vd2 = entrada.nextDouble();

        System.out.print("Ingrese las ventas del departamento 3: ");
        vd3 = entrada.nextDouble();

        System.out.print("Ingrese el salario base de los vendedores: ");
        salar = entrada.nextDouble();

        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;

        salar1 = (vd1 > porven) ? salar + 0.2 * salar : salar;
        salar2 = (vd2 > porven) ? salar + 0.2 * salar : salar;
        salar3 = (vd3 > porven) ? salar + 0.2 * salar : salar;

        System.out.println("\nSALARIO VENDEDORES DEPTO. 1: $" + salar1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: $" + salar2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: $" + salar3);
    }
}
