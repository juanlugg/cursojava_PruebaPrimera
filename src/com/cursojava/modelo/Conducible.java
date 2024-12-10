package com.cursojava.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.1.0 10/12/2024
 */
public interface Conducible {
	public void arrancar();

	public void avanzar(int metros);

	public void retroceder(int metros);

	public void parar();

}
