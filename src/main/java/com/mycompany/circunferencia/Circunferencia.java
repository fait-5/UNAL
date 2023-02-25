package com.mycompany.circunferencia;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        double radio, area, perimetro;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = entrada.nextDouble();
        System.out.println();
        
        area = Math.PI * Math.pow(radio, 2);
        perimetro = Math.PI * 2 * radio;
        
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: "+ perimetro);
    }
}
