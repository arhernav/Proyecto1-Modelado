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
    Producto uno = new Producto("Licuadora", 8910111213145, "Electrodomésticos", 800, true);
    Producto dos = new Producto("Microondas", 7892122232427, "Electrodomésticos", 1300, true);
    Producto tres = new Producto("Tostadora", 5678901213272, "Electrodomésticos", 270, false);
  }
  
  /**
   * Devuelve un iterador para recorrer el catalogo
   */
  @Override public Iterator iterator(){
    return this.productos.iterator();
  }
  
}
