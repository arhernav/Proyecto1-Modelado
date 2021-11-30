import java.lang.Iterable;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * Interfaz para modelar el comportamiento de los diferentes tipos de catalogos
 */
public abstract class Catalogo implements Iterable{

    LinkedList<Producto> productos;
    
    /**
     * Agraga un producto al catalogo
     * @param Producto a añadir
     */
    public void añadirProducto(Producto producto){
	this.productos.add(producto);
    }

    /**
     * Elimina un producto del catalogo
     * @param Producto Producto a eliminar del catalogo
     * @return Producto eliminado del catalogo
     */
    public boolean eliminarProducto(Producto producto){
	return this.productos.remove(producto);
    }

    /**
     * Devuelve un producto del catalogo
     * @param long Codigo de barras del  producto
     * @return Producto Producto solicitado
     */
    public Producto getProducto(int index){
        return this.productos.get(index);
    }
    
    
}
