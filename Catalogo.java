import java.lang.Iterable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
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
    
    /**
     * Método que genera una oferta aleatoriamente para dos productos del catálogo.
     */
    public void generarOferta(){
      Random numero = new Random();
      int oferta1 = numero.nextInt(this.productos.size());
      int oferta2 = numero.nextInt(this.productos.size());
      
      this.productos.get(oferta1);
      this.productos.get(oferta1).setDescuento(true);
      this.productos.get(oferta2);
      this.productos.get(oferta2).setDescuento(true);
    }
    
}
