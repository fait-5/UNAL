package com.mycompany.salario;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        int horas, salario_bruto;
        double retencion, salario_neto;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas: ");
        horas = entrada.nextInt();
        System.out.println();
        
        salario_bruto = horas * 5000;
        retencion = salario_bruto * 0.125;
        salario_neto = salario_bruto - retencion;
        
        System.out.println("El salario bruto del trabajador es: " + salario_bruto);
        System.out.println("La retencion es: " + retencion);
        System.out.println("El salario neto del trabajador es: " + salario_neto);
    }
}
