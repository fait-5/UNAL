package com.mycompany.potencias;
import java.util.Scanner;

public class Potencias {

    public static void main(String[] args) {
        double n, cuadrado, cubo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un n:");
        n = entrada.nextDouble();
        cuadrado = Math.pow(n, 2);
        cubo = Math.pow(n,3);
        
        System.out.println("El cuadrado de " + n + " es " + cuadrado + " y su cubo es " + cubo);
    }
}
