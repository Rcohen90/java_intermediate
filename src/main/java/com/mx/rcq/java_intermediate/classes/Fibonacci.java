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

    // Funcion que recibe n y regresar posición n de fibonacci
    // 0 1 1 2 3 5 8
    public int positionFibonacci(int n) {
    
        int a = 0;
        int b = 1;
        
        if(n==0) return 0;
        if(n==1) return 1;
        
        for(int i=1; i<n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    // Función que recibe n y regresar posición n de tribonacci
    // 0 0 1 1 2 4 7 13
    public int positionTribonacci(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        
        if(n==0 || n==1) return 0;
        if(n==2) return 1;
        
        for(int i=1; i<n; i++) {
            int d = a + b + c;
            
            a = b;
            b = c;
            c = d;
        }
        
        return a;
    }


    // Funcion que recibe dos parametros.
    // x números a sumar
    // n posición en la serie
    // x = 5 -> 0 0 0 0 1 1 2 4 8  -> 0 1 1 2

    public int persFibonacci(int x, int n) {
        int[] listFib = new int[n+1];
        
        for(int i=0; i<x-1; i++) {
            listFib[i] = 0;
        }
        
        listFib[x-1] = 1;
        
        for(int i=x; i<n; i++) {
            int c = 0;
            for(int j=1; j<=x; j++) {
                c += listFib[i-j];
            }
            listFib[i] = c;
        }
        return listFib[n-1];
}

}
