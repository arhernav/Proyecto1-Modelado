/**
 *Clase Facade que maneja metodos para la ejecucion de la tienda
 */ 
import java.util.Scanner;
public class TiendaFacade{
  
  /*Tienda*/
  Tienda tienda = new Tienda();
  
  
  /**
   * Metodo para recibir entradas desde la terminal
   * @param int numero de opciones
   * @return int entrada del usuairio que sea menor o igual al numero de opciones
   */
  public int entradaOpciones(int opciones, String mensaje){
    int opcionElegida = opciones + 1;
    boolean opcionValida = false;
    Scanner escaner = new Scanner(System.in);
    do{
      if(escaner.hasNextInt()){
        opcionElegida = escaner.nextInt();
        if(opcionElegida <= opciones && opcionElegida > 0){
          opcionValida = true;
        }else{
          System.out.println(mensaje);
        }
      }else{    
        escaner.nextLine();
        System.out.println(mensaje);
      }
    }while(!opcionValida);
    return opcionElegida;
  }
  
  /**
   * Metodo para recibir entrada de la terminal
   * @return String Cadena ingresada por el usuario a travez de la terminal
   */
  public String entrada(){
    Scanner escaner = new Scanner(System.in);
    String entrada = "";
    if(escaner.hasNextLine()){
      entrada = escaner.nextLine();
    }
    return entrada;
  }
  
  /**
   * Metodo para iniciar sesion y preparar la tienda para el usuario
   */
  public void iniciarSesion(){
    Cliente cliente = null;
    String contraseña = "";
    boolean contraseñaValida = false;
    
    //Recibir usuario
    System.out.println("Ingrese su nombre de usuario / Enter your username");
    do{
      cliente = this.tienda.getCliente(this.entrada());
      if(cliente == null){
        System.out.println("Ese usuario no esta registrado / That username is not does not excist");
      }
    }while(cliente == null);
    
    //Recibir contraseña del usuario
    System.out.println("Ingrese su contraseña / Enter your password");
    do{
      contraseña = this.entrada();
      contraseñaValida = cliente.compararContraseña(contraseña);
      if(!contraseñaValida)System.out.println("Contraseña equivocada / Incorrect password");
    }while(!contraseñaValida);
    
    this.tienda.inicializarTienda(cliente);
  }
  
  /**
   * Metodo que da la bienvenida al cliente 
   */
  public void comenzarCompras(){
    if(tienda.clienteActivo == null){
      System.out.println("Lo sentimos, hubo un error con su sesion");
      return;
    }
    
    boolean terminarEjecucion = false;
    
    this.tienda.saludar();
    System.out.println();
    this.tienda.enviarOferta();
    
    System.out.println();
    this.tienda.mostrarInventario();
    
    while(!terminarEjecucion){
      System.out.println("");
      this.mostrarOpciones();     
      switch(this.entradaOpciones(7, this.tienda.opcionInvalida())){
        case 1:
          this.tienda.mostrarInventario();
          break;
        case 2:
          this.tienda.enviarOferta();
          break;
        case 3:
          this.recibirOrden();
          break;
        case 4:
          System.out.println("\tCarrito");
          System.out.println(this.tienda.carrito);
          break;
        case 5:
          this.pagar();
          break;
        case 6:
          this.tienda.reiniciarTienda();
          this.iniciarSesion();
          this.comenzarCompras();
          break;
        case 7:
          terminarEjecucion = true;
          break;
        default:
          System.out.println(this.tienda.opcionInvalida());
      }
    }
  }
  
  /**
   * Metodo para mostrar las opciones del menu
   */
  public void mostrarOpciones(){
    System.out.println();
    System.out.println("1.- Volver a mostrar el catalogo");
    System.out.println("2.- Volver a mostrar las ofertas seleccionadas");
    System.out.println("3.- Agregar producto al carrito");
    System.out.println("4.- Revisar el carrito");
    System.out.println("5.- Pagar");
    System.out.println("6.- Cerrar Sesion");
    System.out.println("7.- Salir de CheemsMart");
  }
  
  /**
   * Compila el recibir la orden de compra y agregar al carrito
   */
  public void recibirOrden(){
    System.out.println("Ingrese el nombre del producto que desea");
    String nombre = this.entrada();
    Producto producto = this.tienda.getProducto(nombre);
    if(producto == null){
      System.out.println("Producto invalida / Invalid product");
      return;
    }
    tienda.carrito.agregarCarrito(producto);
    System.out.println("Producto agregado con exito");
  }
  
  /**
   * Pagar el total del carrito y mostrar el ticket de compra
   */
  public void pagar(){
    CuentaProxy cuenta = this.tienda.getCuentaActiva();
    int total = this.tienda.carrito.getTotal();
    if(cuenta.revisarDinero() - total < 0){
      System.out.println("Lo siento, no tienes dinero suficiente para pagar");
      return;
    }
    System.out.println(this.tienda.generarTicket());
    System.out.println(this.tienda.carrito);
    this.tienda.generarFechaEntrega();
    cuenta.retiro(total);
    cuenta.actualizarOriginal();
    this.tienda.carrito.vaciarCarrito();  
  }
  
}
