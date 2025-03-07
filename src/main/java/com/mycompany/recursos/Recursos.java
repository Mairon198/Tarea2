//Mairon Omar Licona Duarte
//201810010200
//Tarea modulo 2

package com.mycompany.recursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursos {

    // Primer metodo
    public String mensaje() {
        return "Programacion Orientada a Objetos";
    }

    // Segundo metodo
    public String edad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer metodo
    public int multiplicar(int numero1, int numero2) {
        return numero1*numero2;
    }

    // Cuarto metodo
    public List<Integer> lista(int X) {
        List<Integer> numero = new ArrayList<>();
        for (int i = 1; i <= X; i++) {
            numero.add(i);
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recursos recursos = new Recursos();

        // Impresion del primer metodo
        System.out.println(recursos.mensaje());

        // Impresion del segundo metodo
        System.out.print("Por favor ingresa tu edad: ");
        int edadEstudiante = scanner.nextInt();
        System.out.println(recursos.edad(edadEstudiante));

        // Impresion del tercer metodo
        System.out.print("Por favor ingresa el primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Por favor ingresa el segundo numero entero: ");
        int num2 = scanner.nextInt();

        // Impresion del tercer metodo
        int resultado = recursos.multiplicar(num1, num2);
        System.out.println("La multiplicacion es igual a= " + resultado);

        // Impresion del cuarto metodo
        System.out.print("Por favor ingrese un numero para la lista de numeros: ");
        int x = scanner.nextInt();
        List<Integer> numeros = recursos.lista(x);
        System.out.println("Lista de numeros del 1 al " + x + ": " + numeros);

        System.out.print("Muchas gracias por usar el programa");
        scanner.close();
    }
}