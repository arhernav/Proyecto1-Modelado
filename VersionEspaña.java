import java.time.LocalDate;
import java.util.Iterator;

/**
 * Clase que modela la versión española de la tienda CheemsMart.
 */
public class VersionEspaña implements VersionTienda{
  
  //Fabrica de iteradores para los catalogos
  IteratorFactory fabrica;
  
  /**
   * Constructor de la clase
   */
  public VersionEspaña(IteratorFactory fabrica){
    this.fabrica = fabrica;
  }
  
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
   * Método que genera la fecha aproximada de entrega de lo que el cliente compró.
   */
  @Override
  public void generarFechaEntrega(){
    LocalDate fecha = LocalDate.now();
    System.out.println("Tus productos estaran llegando el dia: "
                         + fecha.plusDays(15));
  }
  
  /**
   * Método que envía la oferta al cliente.
   */ 
  @Override
  public void enviarOferta(){
    Iterator<Producto> it = fabrica.elegirIterador("electrodomesticos");
    System.out.println("Estas ofertas le aplican especialmente a usted: ");
    while(it.hasNext()){
      Producto producto = it.next();
      if(producto.getDescuento() == true)System.out.println(producto);
    }
  }
  
  /**
   * Devuelve un string con un mensaje adecuado para cuando el usuario ingresa una opcion invalida
   * @return String String con el mensaje adecuado
   */
  @Override public String opcionInvalida(){
    return "Opcion invalida. Por favor ingrese un numero que aparezca en el menu";
  }
  
  /**
   * Devuelve un string que precedera al ticket de compra
   * @return String Mensaje precedente al ticket
   */
  @Override public String generarTicket(){
    return "A continuacion te mostramos todas las cosas que compraste y el precio total";
  }
  
}