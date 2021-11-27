/**
 *  Interfaz para manejar lso idiomas en los que se presenta la tienda
 */
public interface VersionTienda{

    /**
     * Muestra un saludo
     */
    public void saludar();

    /**
     *Muestra una despedida
     */
    public void despedirse();

    /**
     *Genera una fecha de entrega estimada para la entrega del prosucto
     */
    public void generarFechaEntrega();

    /**
     *Muestra las ofertas generadas para ese dia
     */
    public void enviarOferta();

    
}
