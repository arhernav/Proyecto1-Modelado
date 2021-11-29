import java.util.LinkedList;
import java.util.Iterator;

/**
 * Catalogo de electrodomesticos
 */
public class CatalogoElectrodomesticos extends Catalogo{

    /**
     * Constructor de la clase
     */
    public CatalogoElectrodomesticos(){
	this.productos = new LinkedList<Producto>();
    }

    /**
     * Devuelve un iterador para recorrer el catalogo
     */
    @Override public Iterator iterator(){
	return this.productos.iterator();
    }
    
}
