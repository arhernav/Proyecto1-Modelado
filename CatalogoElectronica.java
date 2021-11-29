import java.util.LinkedList;
import java.util.Iterator;

/**
 * Catalogo de electronica
 */
public class CatalogoElectronica extends Catalogo{

    /**
     * Constructor de la clase
     */
    public CatalogoElectronica(){
	this.productos = new LinkedList<Producto>();
    }

    /**
     * Devuelve un iterador para recorrer el catalogo
     */
    @Override public Iterator iterator(){
	return this.productos.iterator();
    }


    
}
