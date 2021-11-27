import java.util.Hashtable;
/**
 * Clase para modelar el comportamiento base de las tienda CheemsMart
 */
public class Tienda{

    protected Hashtable baseClientes;

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
	    break;
	case "españa":
	    return new VersionEspaña();
	    break;
	case "usa":
	    return new VersionUSA();
	    break;
	default:
	    return null;
	}
    }

    public String mostrarCatalogo(){
	return "Falta implementar";
    }
    
    
}
