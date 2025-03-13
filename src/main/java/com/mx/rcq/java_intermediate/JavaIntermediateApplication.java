package com.mx.rcq.java_intermediate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mx.rcq.java_intermediate.classes.Auto;
import com.mx.rcq.java_intermediate.classes.AutoElectrico;
import com.mx.rcq.java_intermediate.classes.Moto;

@SpringBootApplication
public class JavaIntermediateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaIntermediateApplication.class, args);

		Auto auto = new Auto("Volkswagen", "Taos", 2022);
        Moto moto = new Moto("Yamaha", "FZ", 2021);
        AutoElectrico tesla = new AutoElectrico("Tesla", "Model 3", 2023);

        auto.acelerar();
        moto.acelerar();

        tesla.acelerar();
        tesla.cargarBateria();
	}

}
