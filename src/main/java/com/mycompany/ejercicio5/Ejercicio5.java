package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        double suma, X, Y;
        suma = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de X:");
        X = entrada.nextDouble();
        
        suma = suma + X;
        
        System.out.println("Ingrese el valor de Y");
        Y = entrada.nextDouble();
        
        X = X + Math.pow(Y,2);
        
        suma = suma + (X / Y);
        
        System.out.println("suma = " + suma);
        
    }
}
