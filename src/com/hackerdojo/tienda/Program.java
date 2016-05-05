/**
 * 
 */
package com.hackerdojo.tienda;

import com.hackerdojo.tienda.models.Producto;

/**
 * @author pedro
 *
 */
public class Program {

	/**
	 * M�todo principal del programa. Es el pundo donde el programa empieza a
	 * ejecutarse. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Producto teclado = new Producto("Teclado", "Dispositivo de entrada para computadora", 25, 30);

		System.out.println("Descripcion: "+ teclado.getDescripcion());
		
		// Llamar toString() explicito
		System.out.println("Explicito: " + teclado.toString());
		// Llamar toString() impl�cito
		System.out.println("Implicito: " + teclado);

	}

}
