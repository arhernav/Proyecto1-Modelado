import java.time.LocalDate;
import java.util.Iterator;

/**
 * Version de la tienda para clientes provenientes de USA
 */
public class VersionUSA implements VersionTienda{


    //Fabrica de iteradores para los catalogos
    IteratorFactory fabrica;

    /**
     * Constructor de la clase
     */
    public VersionUSA(IteratorFactory fabrica){
	this.fabrica = fabrica;
    }

    /**
     * Muestra un saludo en ingles
     */
    @Override public void saludar(){
 System.out.println("Hi and welcome to CheemsMart, where all the dreams come true");
    }

    /**
     * Muestra una despedida en ingles
     */
    @Override public void despedirse(){
 System.out.println("You should be gratefull becouse you just bought in CheemsMart. We'll be waiting for your return to CheemsMart, brougth to you by CheemsCompany, created by our one and only god: CHEEMS. ");
    }

    /**
     * Genera una fecha de entrega aproximada para los productos comprados
     */
    @Override public void generarFechaEntrega(){
      LocalDate fecha = LocalDate.now();
      System.out.println(fecha.plusDays(15));
    }


    /**
   * Método que envía la oferta al cliente.
   */ 
    @Override
    public void enviarOferta(){
	Iterator<Producto> it = fabrica.elegirIterador("electronica");
	System.out.println("From today's offers, these ones were chosen especially for you :");
	while(it.hasNext()){
	    Producto producto = it.next();
	    if(producto.getDescuento() == true)System.out.println(producto);
	}

	System.out.println("So you better start giving us your money");
	
    }
    



    
}
