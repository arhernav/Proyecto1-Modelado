import java.util.Hashtable;
import java.util.Iterator;
/**
 * Clase para modelar el comportamiento base de las tienda CheemsMart
 */
public class Tienda{

    protected Hashtable baseClientes;
    protected IteratorFactory fabrica = new IteratorFactory();

    public Tienda(){
	this.baseClientes = new Hashtable();
    }

    public Tienda(Hashtable baseClientes){
	this.baseClientes = baseClientes;
    }

    protected VersionTienda elegirPais(Cliente cliente){
	switch(cliente.getPais().toLowerCase()){
	case "mexico":
	    return new VersionMexico();
	case "españa":
	    return new VersionEspaña();
	case "usa":
	    return new VersionUSA();
	default:
	    return null;
	}
    }

    public void mostrarCatalogo(Iterator iterador){
	while(iterador.hasNext()){
	    System.out.println(iterador.next());
	}
    }

    public void mostrarInventario(){
	
	System.out.println("Inventario de alimentos");
	this.mostrarCatalogo(this.fabrica.elegirIterador("alimentos"));
	System.out.println();
	
	System.out.println("Inventario de electrodomesticos");
	this.mostrarCatalogo(this.fabrica.elegirIterador("electrodomesticos"));
	System.out.println();
	
	System.out.println("Inventario de electronica");
	this.mostrarCatalogo(this.fabrica.elegirIterador("electronica"));
	System.out.println();
	    
    }
    
    
}
