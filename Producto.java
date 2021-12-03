/**
 * Clase... 
 */
public class Producto{
  
  /** Información del producto */
  String nombre;
  long codigoDeBarras;
  String departamento;
  final int precio;
  boolean descuento = false;
  
  /**
   * Método constructor.
   * Crea un producto con cierta información.
   */
  public Producto(String n, long cB, String d, int p){
    this.nombre = n;
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
   * Método que devuelve el precio del producto tenga descuento o no
   * El precio varia segun si el producto tiene descuento
   * Si el producto tiene descuento, se le descuente el 30% al precio original
   * @return int Precio del produco
   */
  public int getPrecio(){
    if(this.descuento == true){
	return this.precio - (this.precio * (30/100) );
    } else {
	return this.precio;
    }
  }

    /**
     * Metodo toString
     * Devuelve una representacion en cadena del objeto
     * @return String Representacion en cadena del objeto
     */
    @Override public String toString(){
	String descuento;
	if(this.descuento == true){
	    return "Justo ahora, este producto tiene descuento del 30%. Precio usual" + this.precio + "Precico con descuento: " + this.getPrecio() + "\n" + this.nombre + ": [ Departamento: " + this.departamento + ", Precio: " + this.getPrecio() + " ]\n\t CODIGO " + this.codigoDeBarras + "\n";
	}else{
	    return this.nombre + ": [ Departamento: " + this.departamento + ", Precio: " + this.getPrecio() + " ]\n\t CODIGO " + this.codigoDeBarras + "\n";
	}
    }
}
