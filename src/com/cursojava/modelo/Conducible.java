package com.cursojava.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.1.1 10/12/2024
 */
public interface Conducible {
	/**
	 * Función que indica que el objeto está preparado para ser conducido
	 */
	public void arrancar();

	/**
	 * Función que indica que el objeto ha avanzado
	 * 
	 * @param metros Indica cuantos metros se quiere avanzar
	 */
	public void avanzar(int metros);

	/**
	 * Función que indica que el objeto ha retrocedido
	 * 
	 * @param metros Indica cuantos metros se quiere retroceder
	 */
	public void retroceder(int metros);

	/**
	 * Función que indica que el objeto ha terminado de avanzar
	 */
	public void parar();
}
