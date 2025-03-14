package com.mx.rcq.java_intermediate.classes;

import java.util.LinkedList;
import java.util.Queue;

public class Panaderia {
    private final Queue<String> bandeja = new LinkedList<>();
    private static final int CAPACIDAD_MAXIMA = 5;

    public synchronized void hornearPan() throws InterruptedException {
        while (bandeja.size() >= CAPACIDAD_MAXIMA) {
            System.out.println("La bandeja está llena. Panadero espera...");
            wait(); // Espera a que el cliente consuma pan
        }

        String pan = "Pan No." + (bandeja.size() + 1);
        bandeja.add(pan);
        System.out.println("Panadero horneó: " + pan);
        notifyAll(); // Notifica a los clientes que hay pan disponible
    }

    public synchronized void comprarPan() throws InterruptedException {
        while (bandeja.isEmpty()) {
            System.out.println("Favor de esperar, no hay pan disponible...");
            wait(); // Espera a que el panadero hornee más pan
        }

        String pan = bandeja.poll();
        System.out.println("Cliente compró: " + pan);
        notifyAll(); // Notifica al panadero que puede hornear más pan
    }
    
}
