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
    Producto uno = new Producto("Cajeta envinada", 1378101142143, "Abarrotes", 25, true);
    Producto dos = new Producto("Yogur", 1234567891012, "Lácteos", 12, false);
    Producto tres = new Producto("Cereales", 3456789102134, "Abarrotes", 34, true);
  }
  
  /**
   * Devuelve un iterador para recorrer el catalogo
   */
  @Override public Iterator iterator(){
    return this.productos.iterator();
  }
  
  
  
}
