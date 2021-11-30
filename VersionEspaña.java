import java.time.LocalDate;

/**
 * Clase que modela la versión española de la tienda CheemsMart.
 */
public class VersionEspaña implements VersionTienda{
  
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
    LocalDate fecha = LocalDate.now();
    System.out.println(fecha.plusDays(15));
  }
  
  /**
   * Método que envía la oferta al cliente.
   */ 
  @Override
  public void enviarOferta(){
    System.out.println("FALTA IMPLEMENTAR............");
  }
  
}
