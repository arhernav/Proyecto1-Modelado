import java.util.Hashtable;
import java.util.Iterator;
/**
 * Clase para modelar el comportamiento base de las tienda CheemsMart
 */
public class Tienda{

    /*HashTable para guardar los clientes en base a su contraseña*/
    protected Hashtable<String, Cliente> baseClientes;
    /*Fabrica de iteradores para poder mostrar los catalogos*/
    protected IteratorFactory fabrica = new IteratorFactory();
    /*Version de la tienda que se usara para las interacciones con el usuario*/
    protected VersionTienda version = new VersionMexico();

    public Tienda(){
	this.baseClientes = new Hashtable<String, Cliente>();
	Cliente doge = new Cliente("xXdogeXx", "D0gu35hopp1ng", "Doge", 1122334455, "Number 2013, 4chan street", new Cuenta(3000000), Pais.USA, 00001 );
	this.baseClientes.put(doge.getUsuario(), doge);
	Cliente grumpyCat = new Cliente("grumpy", "LifeIsMiserable", "Grumpy Cat", 223344556, "Lolcats Street, Around reddit apple", new Cuenta(500000), Pais.ESPAÑA, 00002);
	this.baseClientes.put(grumpyCat.getUsuario(), grumpyCat);
    }

    public Tienda(Hashtable<String, Cliente> baseClientes){
	this.baseClientes = baseClientes;
    }

    protected VersionTienda elegirPais(Cliente cliente){
	switch(cliente.getPais()){
	case MEXICO:
	    return new VersionMexico();
	case ESPAÑA:
	    return new VersionEspaña();
	case USA:
	    return new VersionUSA();
	default:
	    return null;
	}
    }

    /**
     * Imprime el catalogo del iterador dado
     */
    public void mostrarCatalogo(Iterator iterador){
	while(iterador.hasNext()){
	    System.out.println(iterador.next());
	}
    }

    /**
     * Metodo que imprime el  contenido de todos los catalogos de la tienda
     */
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

    /**
     * Utiliza VersionTienda para mandar un saludo adecuado
     */
    public void saludar(){
	this.version.saludar();
    }

    /**
     * Utiliza VersionTienda para mandar una despedida adecuada
     */
    public void despedirse(){
	this.version.despedirse();
    }

    /**
     * Utiliza VersionTienda para mandar un saludo adecuado
     */
    public void generarFechaEntrega(){
	this.version.generarFechaEntrega();
    }

    /**
     * Utiliza VersionTienda para imprimir la oferta del dia de manera adecuada
     */
    public void enviarOferta(){
	this.version.enviarOferta();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////Metodos exclusivamente para pruebas. Borrar una vez terminado el proyecto/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setVersion(Cliente cliente){
	this.version = this.elegirPais(cliente);
    }

    public Hashtable<String,Cliente> getTabla(){
	return this.baseClientes;
    }

    public void aplicarOfertas(Iterator<Producto> iterador){
	while(iterador.hasNext()){
	    Producto p = iterador.next();
	    p.descuento = true;
	}
    }
    
    
}
