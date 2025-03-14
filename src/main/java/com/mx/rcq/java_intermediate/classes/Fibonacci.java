package com.mx.rcq.java_intermediate.classes;

public class Fibonacci {
    
    //Obtener suma de valores de fibonacci hasta 4 millones
    public int sumaFibonacci(int limit) {
        int a = 0;
        int b = 1;
        int suma = 0;

        while(a <= limit) {
            int c = a + b;
            if(a % 2 == 0) {
                suma += a;
            }
            a = b;
            b = c;
        }
        return suma;
    }
}
