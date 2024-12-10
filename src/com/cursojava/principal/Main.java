package com.cursojava.principal;

import com.cursojava.modelo.Coche;
import com.cursojava.modelo.TipoVehiculo;
import com.cursojava.modelo.Vehiculo;

public class Main {

	public static void main(String[] args) {
		Vehiculo coche = new Coche("2222JLG", "rojo", 5, TipoVehiculo.MOTOR_HIBRIDO);
		coche.arrancar();
		coche.avanzar(15);
		coche.retroceder(5);
		coche.parar();
		coche.setColor("rosa");
		System.out.println(coche);
	}

}
