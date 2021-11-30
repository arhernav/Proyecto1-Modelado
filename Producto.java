/**
 * Clase... 
 */
public class Producto{
  
  /** Información del producto */
  String nombre;
  long codigoDeBarras;
  String departamento;
  int precio;
  boolean descuento = false;
  
  /**
   * Método constrcutor.
   * Crea un producto con cierta información.
   */
  public Producto(String n, long cB, String d, int p){
    this.nombre = nombre;
    this.codigoDeBarras = cB;
    this.departamento = d;
    this.precio = p;
  }
  
  /**
   * Devuelve el codigo de barras del producto
   */
  public long getCodigoBarras(){
    return this.codigoDeBarras;
  }
  
}
