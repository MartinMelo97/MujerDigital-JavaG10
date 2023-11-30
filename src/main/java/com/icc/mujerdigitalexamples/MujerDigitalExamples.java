/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.icc.mujerdigitalexamples;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author martinmelogodinez
 */
public class MujerDigitalExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        System.out.println("Dame el número uno");
        int num1 = scanner.nextInt();
        
        System.out.println("Dame el número dos");
        int num2 = scanner.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " y  " + num2 + " es igual a: " + suma);
        */ 
        
        // Vamos a recibir calificaciones mediante el teclado, separadas por comas y vamos a
        // calcular el promedio, la mediana, así como cual fue la calificación más grande y
        // la más chiquita
        
        // Paso 1: Recibir las calificaciones
        System.out.println("Dame las calificaciones separadas por comas");
        String calificacionesStr = scanner.nextLine();
        
        // Paso 2: Convertir el String en un Arreglo
        String[] calificaciones = calificacionesStr.split(",");
        
        // Paso 3: Convertir el arreglo de strings a un arreglo de ints
        int[] calificacionesInt = Arrays.stream(calificaciones).mapToInt(Integer::parseInt).toArray();
        
        // Paso 4. Calcular el promedio
        
        int noCalificaciones = calificacionesInt.length;
        
        double sumaCalificaciones = 0;
        for(int i = 0; i < noCalificaciones; i++) {
            int calificacionActual = calificacionesInt[i];
            sumaCalificaciones += calificacionActual;
        }
        
        double promedio = sumaCalificaciones / noCalificaciones;
        
        System.out.println("El promedio es: " + promedio);
        
        // Paso 5. Calcular la mediana
        Arrays.sort(calificacionesInt);
        System.out.println(Arrays.toString(calificacionesInt));
        
        double mediana = 0;
        
        if (noCalificaciones % 2 == 0) {
            double num1 = calificacionesInt[(noCalificaciones / 2) - 1];
            double num2 = calificacionesInt[(noCalificaciones / 2)];
            mediana = (num1 + num2) / 2;
        } else {
            mediana = calificacionesInt[((noCalificaciones + 1) / 2) - 1];
        }       
        
        System.out.println("La mediana es: " + mediana);
        
        // Paso 6: Obtener la calificación más chiquita
        System.out.println("La calificación más baja es: " + calificacionesInt[0]);
        
        
        // Paso 7: Obtener la calificación más grande
        System.out.println("La calificación más alta es: " + calificacionesInt[noCalificaciones - 1]);
        
        // TAREA:
        
        // 1. Calcular la moda
        
        // 2. Separar la lógica escrita aquí en diferentes métodos.
        // - recibirCalificaciones
        // - convertirArray
        // - calcularPromedio
    }
}
