/**
 * 
 */
package com.hackerdojo.tienda;

import com.hackerdojo.tienda.models.Cliente;
import com.hackerdojo.tienda.models.Producto;

/**
 * @author pedro
 *
 */
public class Program {

	/**
	 * Método principal del programa. Es el pundo donde el programa empieza a
	 * ejecutarse. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Producto teclado = new Producto("Teclado", "Dispositivo de entrada para computadora", 25, 30);

		System.out.println("Descripcion: "+ teclado.getDescripcion());
		
		// Llamar toString() explicito
		System.out.println("Explicito: " + teclado.toString());
		// Llamar toString() implícito
		System.out.println("Implicito: " + teclado);
		
		
		
		Producto celular = new Producto("Celular Samsung S6", "Aparatejo con mierdoid", 80, 70);
		Cliente orlando = new Cliente("Orlando Campos", 1000);
		
		System.out.println("CANTIDAD DE CELULARES: " + celular.getCantidad());
		System.out.println("Plata de Orlando antes de comprar: " + orlando.getBalance());
		System.out.println("Orlando pudo comprar 5 celulares?: " + orlando.comprar(celular, 5));
		System.out.println("Plata de Orlando después de comprar: " + orlando.getBalance());
		
		

	}

}
