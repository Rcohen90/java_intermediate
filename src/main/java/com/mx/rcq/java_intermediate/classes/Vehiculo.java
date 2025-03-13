package com.mx.rcq.java_intermediate.classes;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    protected Vehiculo(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract void acelerar();
}
