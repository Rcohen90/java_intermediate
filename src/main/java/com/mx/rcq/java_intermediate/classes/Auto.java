package com.mx.rcq.java_intermediate.classes;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, Integer anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando auto");
    }
    
}
