/**
 * Cuenta de banco personal asignada a un cliente
 */
public class Cuenta implements CuentaBanco{
    
    //Cuenta proxy
    CuentaProxy proxy;

    //Cantidad de dinero de la cuenta
    int dinero;

    public Cuenta(int dinero){
	this.dinero = dinero;
    }

    /**
     * Metodo para realizar una transaccion con la cuenta de banco
     */
    @Override public void realizarTransaccion(int cantidad){
	System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////Falta implementar/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }

    /**
     * Metodo para revisar el dinero de la cuenta
     */
    @Override public int revisarDinero(){
	return dinero;
    }

    /**
     * Metodo para retirar una cierta cantidad de dinero de la cuenta
     */
    @Override public void retiro(int cantidad){
	this.dinero -= cantidad;
    }

    /**
     * Metodo para ingresar una cierta cantidad de dinero a la cuenta
     */
    @Override public void ingreso(int cantidad){
	this.dinero += cantidad;
    }
    
    
    /**
     * Metodo para crear/obtener el proxy vinculado
     * @return CuentaProxy Proy vinculado a esta cuenta
     */
    public CuentaProxy getProxy(){
	if(this.proxy == null){
	    this.proxy = CuentaProxy.crearProxy(this);
	    return this.proxy;
	}else{
	    return this.proxy;
	}
    }


    /**
     * Metodo para resetear la cuenta proxy vinculada
     */
    public void resetProxy(){
	this.proxy.actualizarOriginal();
	this.proxy = null;
    }
    
}
