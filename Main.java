import java.util.Iterator;
import java.util.Hashtable;
public class Main{

    public static void main(String[] args){
	TiendaFacade facade = new TiendaFacade();
	facade.iniciarSesion();
	facade.comenzarCompras();
    }
      
}
