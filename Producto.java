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
   * Método constructor.
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
  
  /**
   * Método que devuelve el precio del producto.
   * @return this.precio - Precio del producto.
   */
  public int getPrecio(){
    return this.precio;
  }
  
  /**
   * Método que revisa si el producto tiene descuento y de ser así, lo aplica al precio.
   */
  public void descuento(){
    if(this.descuento == true){
      int precioFinal = this.precio - ((this.precio * 30) / 100);
      System.out.println("Precio: $" + this.precio + "\tDescuento: 30% \t\tPrecio Final: $" + precioFinal); 
    } else {
      System.out.println("Precio: $" + this.precio);
    }
  }
}
