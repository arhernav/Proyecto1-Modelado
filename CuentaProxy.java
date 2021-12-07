/**
 * Clase proxy para las cuentas de banco 
 */
public class CuentaProxy implements CuentaBanco{
  
  //Cuenta Original
  CuentaBanco original;
  
  //Cantidad de dinero en la cuenta
  int dinero;
  
  
  /**
   * Creador de la clase
   * Constructor privado para no poder instanciar mas de un proxy por cuenta
   */
    private CuentaProxy(CuentaBanco original){
      this.original = original;
      this.dinero = original.revisarDinero();
    }
    
    /**
     * Metodo para obtener una instancia de CuentaProxy
     */
    protected static CuentaProxy crearProxy(CuentaBanco original){
      return new CuentaProxy(original);
    }
    
    /**
     * Metodo para obtener la cantidad de dinero de la cuenta
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
     * Iguala la cantidad de dinero de la cuenta original a la cantidad de dinero del proxy
     */
    public void actualizarOriginal(){
      if(this.dinero == this.original.revisarDinero())return;
      if(original.revisarDinero() > this.dinero){
        this.original.retiro(original.revisarDinero() - this.dinero);
      }else{
        original.ingreso(this.dinero - original.revisarDinero());
      }
    }
    
}