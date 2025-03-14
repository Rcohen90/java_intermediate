package com.mx.rcq.java_intermediate.classes;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ListaEmpleados {
    List<String> empleados = Arrays.asList("Ana", "Luis", "Carlos", "Ana", "Pedro", "Luis");
    TreeSet<String> empleadosNotDuplicated = new TreeSet<String>(empleados);

    public void imprimirEmpleados() {
        empleadosNotDuplicated.forEach(empleado -> System.out.print(empleado + " "));
    }
}
