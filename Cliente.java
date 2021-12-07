import java.util.Scanner;

/**
 * Clase que crea clientes de la tienda CheemsMart.
 */
public class Cliente{
  
  /** Información del cliente */
  String usuario;
  String contraseña;
  String nombre;
  long telefono;
  String direccion;
  Cuenta cuenta;
  Pais pais;
  int id;
  
  /**
   * Método que crea un cliente.
   */
  public Cliente(String u, String co, String n, long t, String d, Cuenta cu, Pais p, int id){
    this.usuario = u;
    this.contraseña = co;
    this.nombre = n;
    this.telefono = t;
    this.direccion = d;
    this.cuenta = cu;
    this.pais = p;
    this.id = id;
  }
  
  /**
   * Devuelve el pais del que proviene el cliente
   * @return String Pais del que proviene el cliente
   */
  public Pais getPais(){
    return this.pais;
  }
  
  /**
   * Metodo para obtener el usuario del cliente
   * @return String Usuario del cliente
   */
  public String getUsuario(){
    return this.usuario;
  }
  
  /**
   * Metodo que compara el string dado con la contraseña del cliente
   * @param String String que sera comparado con la contraseña del cliente
   * @return Boolean True si la contraseña es igual, false en otro caso
   */
  protected boolean compararContraseña(String contra){
    if(contra.equals(this.contraseña)) return true;
    return false;
  }
  
  /**
   * Metodo para obtener el proxy del cliente
   */
  protected CuentaProxy getCuenta(){
    return this.cuenta.getProxy();
  }
   
}