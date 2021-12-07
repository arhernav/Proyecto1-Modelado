import java.util.LinkedList;

/**
 * Clase para modelar el carrito de los clientes 
 */
public class Carrito{

    //Lista de objetos agregados al carrito
    LinkedList<Producto> carrito = new LinkedList<Producto>();

    /**
     * Metodo para agregar objetos al carrito
     * @param Producto Producto por agregar al carrito
     */
    public void agregarCarrito(Producto producto){
	this.carrito.add(producto);
    }

    /**
     * Metodo para eliminar objetos del carrito
     * @param Producto Producto a eliminar del carrito
     */
    public boolean eliminarCarrito(Producto producto){
	return this.carrito.remove(producto);
    }

    /**
     * Metodo toString del carrito
     * @return String Representacion en String del carrito
     */
    @Override public String toString(){
	String cadena = "";
	cadena += "\n";
	for(Producto p: this.carrito){
	    cadena += p.toString();
	    cadena += "\n";
	}
	cadena += "Total: $" + this.getTotal();
	return cadena;
    }
    

    /**
     * Metodo para obtener el total de la compra
     * @return int Suma de los precios de todos los objetos del carrito
     */
    public int getTotal(){
	int total = 0;
	for(Producto p: this.carrito){
	    total += p.getPrecio();
	}
	return total;
    }

    /**
     * Vacia la lista del carrito
     */
    public void vaciarCarrito(){
	this.carrito.clear();
    }
    
}
