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
    Producto uno = new Producto("Licuadora", 891011121, "Electrodomésticos", 800);
    Producto dos = new Producto("Microondas", 789212223, "Electrodomésticos", 1300);
    Producto tres = new Producto("Tostadora", 567890121, "Electrodomésticos", 270);
    this.productos.add(uno);
    this.productos.add(dos);
    this.productos.add(tres);
    this.generarOfertas();
  }
  
  /**
   * Devuelve un iterador para recorrer el catalogo
   */
  @Override public Iterator<Producto> iterator(){
    return this.productos.iterator();
  }
  
}
