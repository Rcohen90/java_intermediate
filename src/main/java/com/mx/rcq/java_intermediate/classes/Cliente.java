package com.mx.rcq.java_intermediate.classes;

public class Cliente extends Thread {
    private final Panaderia panaderia;

    public Cliente(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        try {
            panaderia.comprarPan();
            Thread.sleep(1500); // Simula tiempo de compra
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
