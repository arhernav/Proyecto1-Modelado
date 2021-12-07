import java.util.Iterator;
import java.util.Hashtable;

/**
 * Clase prueba de la tienda.
 */
public class Main{
  
  public static void main(String[] args){
    TiendaFacade facade = new TiendaFacade();
    facade.iniciarSesion();
    facade.comenzarCompras();
  }
  
}
