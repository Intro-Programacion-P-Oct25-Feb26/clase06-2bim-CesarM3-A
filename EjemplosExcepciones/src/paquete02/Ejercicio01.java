/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
/*
pares positivos del cero en adelante
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int valores = ingresarValores();
        System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt();
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt();
    }

    public static int ingresarValores() {
        boolean bandera = true;
        int resultado = 0;
        while (bandera) {
            try {
                resultado = valor1 / valor2;
                
                if (valor1 % 2 !=0 || valor2 % 2 !=0){
               throw new Exception("Número impar");
            }

                System.out.printf("Resultado %d\n", resultado);
                bandera = false;

            }catch(Exception e){
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }
        return resultado;
    }

    public static void imprimir() {

    }

    public static int obtenerSuma() {

    }

}
