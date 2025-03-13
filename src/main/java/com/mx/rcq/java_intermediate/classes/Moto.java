package com.mx.rcq.java_intermediate.classes;

public class Moto extends Vehiculo {

    public Moto(String marca, String modelo, Integer anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando moto");
    }
    
}
