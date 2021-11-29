import java.util.LinkedList;
import java.util.Iterator;

/**
 * Catalogo de alimentos
 */
public class CatalogoAlimentos extends Catalogo{

    /**
     * Constructor de la clase
     */
    public CatalogoAlimentos(){
	this.productos = new LinkedList<Producto>();
    }

    /**
     * Devuelve un iterador para recorrer el catalogo
     */
    @Override public Iterator iterator(){
	return this.productos.iterator();
    }

    
    
}
