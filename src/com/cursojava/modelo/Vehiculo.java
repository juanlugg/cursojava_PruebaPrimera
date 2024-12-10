package com.cursojava.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.0.0 04/12/2024
 */
public abstract class Vehiculo implements Conducible {
	protected String matricula;
	protected String color;
	protected int asientos;
	protected TipoVehiculo tipo;
	protected int metros = 0;

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
	public void arrancar() {
		System.out.print("[ARRANCAR...] ");
	}

	@Override
	public void avanzar(int metros) {
		this.metros += metros;
		System.out.print("[AVANZAR...] ");
		
	}

	@Override
	public void retroceder(int metros) {
		this.metros -= metros;
		System.out.print("[RETROCEDER...] ");		
	}

	@Override
	public void parar() {
		System.out.print("[PARANDO...] ");		
	}

	@Override
	public String toString() {
		return "[matricula=" + matricula + ", color=" + color + ", asientos=" + asientos + ", tipo=" + tipo
				+ ", metros=" + metros + "]";
	}
	
}
