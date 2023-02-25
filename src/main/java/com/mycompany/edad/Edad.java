/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Edad;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        int edad_juan, edad_alberto, edad_ana, edad_mama;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan:");
        edad_juan = entrada.nextInt();
        
        edad_alberto = edad_juan * 2 / 3;
        edad_ana = edad_juan * 4 / 3;
        edad_mama = edad_juan + edad_alberto + edad_ana;
        
        System.out.println("La edad de Alberto es: " + edad_alberto);
        System.out.println("La edad de Ana es: " + edad_ana);
        System.out.println("La edad de la madre es: " + edad_mama);
    }
}