/**
 * Clase... 
 */
public class Producto{
  
  /** Información del producto */
  String nombre;
  long codigoDeBarras;
  String departamento;
  double precio;
  boolean descuento = false;
  
  /**
   * Método constructor.
   * Crea un producto con cierta información.
   */
  public Producto(String n, long cB, String d, double p){
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
    public double getPrecio(){
	double precioSupp = this.precio;
	double rebaja = 0;
	rebaja = (this.precio/100) * 30;
    if(this.descuento){
	precioSupp = precioSupp - rebaja;
    }
    return precioSupp;
    
  }


    /**
     * Metodo toString
     * Devuelve una representacion en cadena del objeto
     * @return String Representacion en cadena del objeto
     */
    @Override public String toString(){
 String descuento;
 if(this.descuento == true){
     return "Justo ahora, este producto tiene descuento del 30%. Precio usual: " + this.precio + " Precico con descuento: " + this.getPrecio() + "\n" + this.nombre + ": [ Departamento: " + this.departamento + ", Precio: " + this.getPrecio() + " ]\n\t CODIGO " + this.codigoDeBarras + "\n";
 }else{
     return this.nombre + ": [ Departamento: " + this.departamento + ", Precio: " + this.getPrecio() + " ]\n\t CODIGO " + this.codigoDeBarras + "\n";
 }
    }

    /**
     * Getter para el descuento del producto
     * @return boolean Booleano que indica si el producto esta en oferta
     */
    public boolean getDescuento(){
	return this.descuento;
    }
    
    /**
     * Método que asigna un valor booleano al descuento del producto.
     */
    public void setDescuento(){
	this.descuento = true;
    }
}
