/**
 * 
 */
package com.hackerdojo.tienda.models;

/**
 * @author pedro
 *
 */
public class Cliente {
	
	// ------------------------------------------------------------------------------------------------------ //
	// ATRIBUTOS                                                                                              //
	// ------------------------------------------------------------------------------------------------------ //
	
	private String nombre;
	private int balance;
	
	/**
	 * 
	 */
	public Cliente(String nombre, int balance){
		this.nombre = nombre;
		this.balance = balance;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	/**
	 * 
	 * @param producto
	 * @param cantidad
	 * @return
	 */
	public boolean comprar(Producto producto, int cantidad){
		
		boolean pudoComprar = false;
		
		// Verify if product has been initialized and it is set to an intance of an object
		if(producto != null){
			// If we got here, is because the product is valid instance of an object. Thereby we can use it :-)
			
			// Now we check that there are enough products to supply the clients demands
			if(producto.getCantidad() >= cantidad){
				// If got here is because there are enough product items. So now we need to check if THIS client
				// has enough money to pay for all the items.
				
				if(producto.getPrecio()*cantidad <= this.balance){
					// If we got here is because we have enough money :-D
					producto.rebajar(cantidad);
					this.balance = this.balance - producto.getPrecio()*cantidad;
					pudoComprar = true;
				}
				else{
					// Sorry dude, we do not have enough money :-(
					pudoComprar = false;
				}
				
			} // IF ENDS
			else{
				pudoComprar = false;
			}
		}else{
			// In this case, the product wasn't initialized, so we can't but it, thereby: we return false;
			pudoComprar = false;
		} // ELSE ENDS
		
		return pudoComprar;
	} // METHOD COMPRAR ENDS -------------------------------------------------------------------------------- //

}
