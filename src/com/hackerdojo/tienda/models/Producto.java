/**
 * 
 */
package com.hackerdojo.tienda.models;

/**
 * La clase producto define la estructura de un producto de la tienda y los
 * atributos del mismo
 * @author pedro
 *
 */
public class Producto {
	
	// VARIABLE => [TipoDeDato] (nombreDeLaVariable)= {valor/new...};
	
	// ----------------------------------------------------------------------------------
	// ATRIBUTOS [ModificadorDeAcceso(private/public/protected)] [DeclaraciónDeVariable]
	// ----------------------------------------------------------------------------------
	
	private String nombre; 
	private String descripcion;
	private int precio;
	private int cantidad;
	
	// ----------------------------------------------------------------------------------
	// MÉTODOS                                                                           
	// ----------------------------------------------------------------------------------
	
	// CONSTRUCTOR 
	/**
	 * Método constructor. Crea instancias (objetos) de tipo Producto. 
	 */
	public Producto(String pNombre, String pDescripcion, int pPrecio, int pCantidad){
		// Realiza la inicializacion de la clase
		this.nombre = pNombre;
		this.descripcion = pDescripcion;
		this.precio = pPrecio;
		this.cantidad = pCantidad;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombre(){
		return this.nombre;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescripcion(){
		return this.descripcion;
	}
	/**
	 * 
	 * @return
	 */
	public int getPrecio(){
		return this.precio; 
	}
	
	/**
	 * 
	 * @param nuevoPrecio
	 */
	public void setPrecio(int nuevoPrecio){
		this.precio = nuevoPrecio;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCantidad(){
		return this.cantidad;
	}
	
	/**
	 * 
	 * @param cantidadPorRebajar
	 * @return
	 */
	public boolean rebajar(int cantidadPorRebajar){
		boolean sePudoRebajar = false;
		if(this.cantidad >= cantidadPorRebajar){
			// PUEDO DEBAJAR
			this.cantidad = (this.cantidad - cantidadPorRebajar);
			sePudoRebajar = true;
		}
		else{
			// NO PUEDO REBAJAR ESA CANTIDAD PORQUE ES MAYOR AL DISPONIBLE
			sePudoRebajar = false;
		}
		return sePudoRebajar;
	}
	
	public String toString(){
		String producto= "Producto:{";
		producto += "nombre:'"+ this.nombre + "',";
		producto += "descripcion:'"+ this.descripcion + "',";
		producto += "cantidad:"+ this.cantidad + ",";
		producto += "precio:"+ this.precio + "";
		producto += "}";
		return producto;
	}
	
}
