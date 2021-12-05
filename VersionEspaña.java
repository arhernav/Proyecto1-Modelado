import java.time.LocalDate;
import java.util.Iterator;

/**
 * Clase que modela la versión española de la tienda CheemsMart.
 */
public class VersionEspaña implements VersionTienda{

    IteratorFactory fabrica = new IteratorFactory();
  
  /**
   * Método que le da la bienvenida al cliente mexicano al ingresar a la tienda.
   */  
  @Override
  public void saludar(){
    System.out.println("HOLA Tí@, BIENVENID@!!!");
  }
  
  /**
   * Método que da la despedida al cliente mexicano al salir de la tienda.
   */
  @Override
  public void despedirse(){
    System.out.println("*Le agradecemos su compra* \n\n¡ESPERAMOS VERLE PRONTO!");
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
	Iterator<Producto> it = fabrica.elegirIterador("electrodomesticos");
	System.out.println("Las ofertas del dia de hoy son: ");
	while(it.hasNext()){
	    Producto producto = it.next();
	    if(producto.getDescuento() == true)System.out.println(producto);
	}
    }
}

