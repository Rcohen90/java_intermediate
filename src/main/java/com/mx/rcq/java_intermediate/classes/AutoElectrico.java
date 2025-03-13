package com.mx.rcq.java_intermediate.classes;
import com.mx.rcq.java_intermediate.interfaces.IElectrico;

public class AutoElectrico extends Auto implements IElectrico {

    public AutoElectrico(String marca, String modelo, Integer anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando bateria");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando auto electrico");
    }
    
}
