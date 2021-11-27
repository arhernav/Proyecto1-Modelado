/**
 * Clase que modela la versión mexicana de la tienda CheemsMart.
 */
public class VersionMexico extends VersionTienda{
  
  /**
   * Método que le da la bienvenida al cliente mexicano al ingresar a la tienda.
   */
  import java.time.LocalDate;
  
  @Override
  public void saludar(){
    System.out.println("BIENVENID@ A CHEEMSMART!!!");
  }
  
  /**
   * Método que da la despedida al cliente mexicano al salir de la tienda.
   */
  @Override
  public void despedida(){
    System.out.println("*Gracias por tu compra* \n\n¡VUELVE PRONTO!");
  }
  
  /**
   *Método que genera la fecha estimada de entrega.
   */
  @Override
  public void generarFecha(){
    LocalDate fecha = LocalDate.now();
    System.out.println(fecha.plusDays(15);
  }
  
  /**
   * Método que envía la oferta al cliente.
   */ 
  @Override
  public void enviarOferta(){
    System.out.println("FALTA IMPLEMENTAR............");
  }
  
}