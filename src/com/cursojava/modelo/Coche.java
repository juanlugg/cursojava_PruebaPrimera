package com.cursojava.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.0.0 04/12/2024
 */
public class Coche extends Vehiculo {

	public Coche(String matricula, String color, int asientos, TipoVehiculo tipo) {
		super(matricula, color, asientos, tipo);
	}

	public final int N_RUEDAS = 4;

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("El coche de matricula " + matricula);

	}

	@Override
	public void avanzar(int metros) {
		super.avanzar(metros);
		System.out.println("El coche de matricula " + matricula + " avanza " + metros + " metros.");

	}

	@Override
	public void retroceder(int metros) {
		super.retroceder(metros);
		System.out.println("El coche de matricula " + matricula + " retrocede " + metros + " metros.");
	}

	@Override
	public void parar() {
		super.parar();
		System.out.println(
				"El coche de matricula " + matricula + " ha parado en " + this.metros + " metros de distancia.");
	}

	@Override
	public String toString() {
		return "Coche [N_RUEDAS=" + N_RUEDAS + "]" + super.toString();
	}

}
