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
  public  enviarOferta(){
    ListIterator<Producto> iterador = this.productos.listIterator();
    if(this.productos.get(iterador) == this.productos.setDescuento(true){
      Sytem.out.pritln("Los productos con descuento son: " + this.productos.get(iterador));
    } 
  }
}
