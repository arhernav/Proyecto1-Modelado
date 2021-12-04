import java.util.Iterator;

/**
 * Clase para juntar los iteradores de los diferentes catalogos
 */
public class IteratorFactory{

    //Catalogo de electronica
    CatalogoElectronica catalogoElectronica = new CatalogoElectronica();

    //Catalogo de electrodomesticos
    CatalogoElectrodomesticos catalogoElectrodomesticos = new CatalogoElectrodomesticos();

    //Catalogo de alimentos
    CatalogoAlimentos catalogoAlimentos = new CatalogoAlimentos();

    /**
     * Metodo fabrica para iteradores de los diferentes catalogos
     * @param String Catologo al cual se le solicitara su iterador
     * @param Iterator Iterador del catalogo solicitado
     */
    public Iterator<Producto> elegirIterador(String catalogo){
	switch(catalogo.toLowerCase()){
	case "electronica":
	    return this.catalogoElectronica.iterator();
	case "electrodomesticos":
	    return this.catalogoElectrodomesticos.iterator();
	case "alimentos":
	    return this.catalogoAlimentos.iterator();
	default:
	    return null;
	}
    }
    
    
}
