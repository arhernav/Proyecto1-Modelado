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
	Producto losNintendos = new Producto("Los nintendos", 2147483647, "Departamento de electronica", 500);
	Producto alienware = new Producto ("Computadora marca DULL", 2147483646, "Departamento de electronica", 2000);
	Producto estereo = new Producto("Estereo", 2147483645, "Departamento de electronica", 8000);
	this.productos = new LinkedList<Producto>();
	this.productos.add(losNintendos);
	this.productos.add(alienware);
	this.productos.add(estereo);
    }

    /**
     * Devuelve un iterador para recorrer el catalogo
     */
    @Override public Iterator<Producto> iterator(){
	return this.productos.iterator();
    }


    
}
