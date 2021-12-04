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
    Producto uno = new Producto("Cajeta envinada", 137810114, "Abarrotes", 25);
    Producto dos = new Producto("Yogur", 123456789, "Lácteos", 12);
    Producto tres = new Producto("Cereales", 345678910, "Abarrotes", 34);
    this.productos.add(uno);
    this.productos.add(dos);
    this.productos.add(tres);
  }
  
  /**
   * Devuelve un iterador para recorrer el catalogo
   */
  @Override public Iterator<Producto> iterator(){
    return this.productos.iterator();
  }
  
  
  
}
