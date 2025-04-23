package com.mycompany.ac1poounal;
import java.util.Scanner;

public class AC1EJ1POOUNAL {
    // Ejercicio Resuelto No. 4
    public static void main(String[] args) {
        int edadjuan, edadana, edadalber, edadmama;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Edad de Juan: ");
        edadjuan = entrada.nextInt();
        
        edadalber = 2 * (edadjuan/3);
        edadana = 4 *(edadjuan/3);
        edadmama = edadjuan + edadana + edadalber;
        
        System.out.println("La edad de juan es " + edadjuan);
        System.out.println("La edad de alberto es " + edadalber);
        System.out.println("La edad de ana es " + edadana);
        System.out.println("La edad de la mama es " + edadmama);
    }
}
