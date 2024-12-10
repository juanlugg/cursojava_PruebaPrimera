package com.cursojava.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.1.1 10/12/2024 
 * Clase que implementa las funciones de la interfaz Conducible ya que todos los Vehiculos son Conducibles
 */
public abstract class Vehiculo implements Conducible {
	protected String matricula;
	protected String color;
	protected int asientos;
	protected TipoVehiculo tipo;
	protected int metros = 0;
	protected double velocidad;

	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}

	public Vehiculo(String matricula, String color, int asientos, TipoVehiculo tipo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.asientos = asientos;
		this.tipo = tipo;
	}

	@Override
	public void avanzar(int metros) {
		this.metros += metros;
	}

	@Override
	public void retroceder(int metros) {
		this.metros -= metros;
	}

	@Override
	public String toString() {
		return "[matricula=" + matricula + ", color=" + color + ", asientos=" + asientos + ", tipo=" + tipo
				+ ", metros=" + metros + "]";
	}

}
