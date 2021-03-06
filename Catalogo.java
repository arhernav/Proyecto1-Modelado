import java.lang.Iterable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
/**
 * Interfaz para modelar el comportamiento de los diferentes tipos de catalogos
 */
public abstract class Catalogo implements Iterable{
  
  /** Lista de productos para los catálogos */
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
  
  /**
   * Método que genera una oferta aleatoriamente para dos productos del catálogo.
   */
  public void generarOfertas(){
    Random numero = new Random();
    boolean iguales = true;
    int oferta1 = 0;
    int oferta2 = 0;
    while(iguales){
      oferta1 = numero.nextInt(this.productos.size());
      oferta2 = numero.nextInt(this.productos.size());
      if(oferta1 != oferta2) iguales = false;
    }
    this.productos.get(oferta1).setDescuento();
    this.productos.get(oferta2).setDescuento();
    
  }
  
  /**
   * Devuleve un producto en base al nombre
   */
  public Producto getProducto(String nombre){
    Producto producto = null;
    for(Producto p : this.productos){
      if(p.nombre.toLowerCase().equals(nombre.toLowerCase())){
        return p;
      }     
    }
    return producto;
  }
  
}