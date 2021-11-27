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
  CuentaBanco cuenta;
  String pais;
  int id;
  
  /**
   * Método que crea un cliente.
   */
  public Cliente(String u, String co, String n, long t, String d, CuentaBanco cu, String p, int id){
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
   * Método que permite al usuario acceder a su cuenta.
   */
  public void accederACuenta(){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe tu usuario: ");
    String usuario = s.nextLine();
    System.out.println("Escribe tu contraseña: ");
    Scanner contraseña = s.System.in();
  }
  
}