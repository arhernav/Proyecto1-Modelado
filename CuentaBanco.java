/**
 * Interfaz para modelar el comportamiento de las cuentas de banco
 */
public interface CuentaBanco{

    /**
     * Metodo para obtener la cantidad de dinero de la cuenta
     */
    public int revisarDinero();

    /**
     * Metodo para retirar una cierta cantidad de dinero de la cuenta
     */
    public void retiro(int cantidad);

    /**
     * Metodo para ingresar una cierta cantidad de dinero a la cuenta
     */
    public void ingreso(int cantidad);
    
}
