import java.time.LocalDate;
import java.util.Iterator;

/**
 * Clase que modela la versión mexicana de la tienda CheemsMart.
 */
public class VersionMexico implements VersionTienda{

    //Fabrica de iteradores para los catalogos
    IteratorFactory fabrica;

    /**
     * Constructor de la clase
     */
    public VersionMexico(IteratorFactory fabrica){
	this.fabrica = fabrica;
    }
  
  /**
   * Método que le da la bienvenida al cliente mexicano al ingresar a la tienda.
   */  
  @Override
  public void saludar(){
    System.out.println("BIENVENID@ A CHEEMSMART!!!");
  }
  
  /**
   * Método que da la despedida al cliente mexicano al salir de la tienda.
   */
  @Override
  public void despedirse(){
    System.out.println("*Gracias por tu compra* \n\n¡VUELVA PRONTO!");
  }
  
  /**
   *Método que genera la fecha estimada de entrega.
   */
  @Override
  public void generarFechaEntrega(){
    System.out.println("La fecha de entrega es el día: " + this.fechaDeEntrega());
  }
  
  /**
   * Método que muestra la fecha aproximada de entrega de lo que el cliente compró.
   */
  public String fechaDeEntrega(){
      LocalDate fecha = LocalDate.now();
      return fecha.plusDays(15).toString();
  }


    /**
   * Método que envía la oferta al cliente.
   */ 
    @Override
    public void enviarOferta(){
	Iterator<Producto> it = fabrica.elegirIterador("alimentos");
	System.out.println("De todas las ofertas de hoy, estas fueron seleccionadas especialmente para ti: ");
	while(it.hasNext()){
	    Producto producto = it.next();
	    if(producto.getDescuento() == true)System.out.println(producto);
	}
    }
    
  
}
