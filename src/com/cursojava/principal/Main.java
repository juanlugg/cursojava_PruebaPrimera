package com.cursojava.principal;

import com.cursojava.modelo.Camion;
import com.cursojava.modelo.Coche;
import com.cursojava.modelo.TipoVehiculo;
import com.cursojava.modelo.Vehiculo;
import java.util.Random;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.1.1 10/12/2024
 */
public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();

		Vehiculo coche = new Coche("2222JLG", "rojo", 5, TipoVehiculo.MOTOR_HIBRIDO);
		Vehiculo camion = new Camion("1234GLJ", "azul", 3, TipoVehiculo.MOTOR_COMBUSTIBLE);
		Vehiculo[] vehiculos = { coche, camion };

		for (Vehiculo vehiculo : vehiculos) {
			vehiculo.arrancar();
			vehiculo.avanzar(rnd.nextInt(10, 21)); // Número aleatorio comprendido entre 10 y 20
			vehiculo.retroceder(rnd.nextInt(5, 10)); // Número aleatorio comprendido entre 5 y 9
			vehiculo.parar();
		}
		coche.setColor("rosa");
		System.out.println(coche);
		System.out.println("Todos los coches tienen " + Coche.N_RUEDAS + " ruedas.");
		System.out.println(camion);
		System.out.println("Todos los camiones tienen " + Camion.N_RUEDAS + " ruedas.");
	}

}
