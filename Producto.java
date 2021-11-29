/**
 * Clase... 
 */
public class Producto{

  /** Información del producto */
  String nombre;
  long codigoDeBarras;
  String departamento;
  int precio;
  boolean decuento;

    /**
     * Devuelve el codigo de barras del producto
     */
    public long getCodigoBarras(){
	return this.codigoDeBarras;
    }
  
}
