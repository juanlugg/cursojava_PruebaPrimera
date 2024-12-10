package com.cursojava.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.1.1 10/12/2024
 */
public class Camion extends Vehiculo {
	public static final int N_RUEDAS = 8;

	private double[] tacometro;

	public double[] getTacometro() {
		return tacometro;
	}

	public void setTacometro(double[] tacometro) {
		this.tacometro = tacometro;
	}

	public Camion(String matricula, String color, int asientos, TipoVehiculo tipo) {
		super(matricula, color, asientos, tipo);
	}

	public Camion(String matricula, String color, int asientos, TipoVehiculo tipo, double[] tacometro) {
		super(matricula, color, asientos, tipo);
		this.tacometro = tacometro;
	}

	@Override
	public void arrancar() {
		System.out.println("El camión de matricula " + matricula + " está arrancado.");

	}

	@Override
	public void avanzar(int metros) {
		super.avanzar(metros);
		System.out.println("El camión de matricula " + matricula + " avanza " + metros + " metros.");

	}

	@Override
	public void retroceder(int metros) {
		super.retroceder(metros);
		System.out.println("El camión de matricula " + matricula + " retrocede " + metros + " metros.");
	}

	@Override
	public void parar() {
		System.out.println(
				"El coche de matricula " + matricula + " ha parado en " + this.metros + " metros de distancia.");
	}

	@Override
	public String toString() {
		return "Coche [N_RUEDAS=" + N_RUEDAS + "]" + super.toString();
	}
}
