package com.cursojava.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.0.0 04/12/2024
 */
public interface Conducible {
	public void arrancar();

	public void avanzar(int metros);

	public void retroceder(int metros);

	public void parar();

}
