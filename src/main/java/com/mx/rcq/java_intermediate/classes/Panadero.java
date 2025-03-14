package com.mx.rcq.java_intermediate.classes;

public class Panadero extends Thread {
    private final Panaderia panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        try {
            panaderia.hornearPan();
            Thread.sleep(1000); // Se simula tiempo de horneado
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
