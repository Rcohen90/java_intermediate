package com.mx.rcq.java_intermediate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mx.rcq.java_intermediate.classes.Auto;
import com.mx.rcq.java_intermediate.classes.AutoElectrico;
import com.mx.rcq.java_intermediate.classes.Cliente;
import com.mx.rcq.java_intermediate.classes.Fibonacci;
import com.mx.rcq.java_intermediate.classes.ListaEmpleados;
import com.mx.rcq.java_intermediate.classes.Moto;
import com.mx.rcq.java_intermediate.classes.Panaderia;
import com.mx.rcq.java_intermediate.classes.Panadero;

@SpringBootApplication
public class JavaIntermediateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaIntermediateApplication.class, args);

        // 1 - POO: Abstraccion, polimofismo, herencia
		// Auto auto = new Auto("Volkswagen", "Taos", 2022);
        // Moto moto = new Moto("Yamaha", "FZ", 2021);
        // AutoElectrico tesla = new AutoElectrico("Tesla", "Model 3", 2023);

        // auto.acelerar();
        // moto.acelerar();

        // tesla.acelerar();
        // tesla.cargarBateria();

        // // 2 - Listas sin duplicados
        // ListaEmpleados listaEmpleados = new ListaEmpleados();
        // listaEmpleados.imprimirEmpleados();

        // // 3 - Concurrencia - Hilos
        // Panaderia panaderia = new Panaderia();
        // Panadero panadero = new Panadero(panaderia);
        // Cliente cliente = new Cliente(panaderia);

        // panadero.start();
        // cliente.start();

        // Fibonacci suma de pares menor a 4 millones
        System.out.println("Fibonacci");
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.persFibonacci(5, 9));
	}

}
