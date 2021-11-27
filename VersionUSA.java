/**
 * Version de la tienda para clientes provenientes de USA
 */
public class VersionUSA implements VersionTienda{

    /**
     * Muestra un saludo en ingles
     */
    @Override public void saludar(){
	System.out.println("Hi and welcome to CheemsMart, where all the dreams come true");
    }

    /**
     * Muestra una despedida en ingles
     */
    @Override public void despedirse(){
	System.out.println("You should be gratefull becouse you just bought in CheemsMart. We'll be waiting for your return to CheemsMart, brougth to you by CheemsCompany, created by our one and only god: CHEEMS. ");
    }

    /**
     * Genera una fecha de entrega aproximada para los productos comprados
     */
    @Override public void generarFechaEntrega(){
	System.out.println("You'll be reciving your packages on approximately 15 days");
    }

    /**
     * Muestra las ofertas del dia en ingles
     */
    @Override public void enviarOferta(){
	System.out.println("The offers of the day are: ");
	System.out.println("///////////////////////////////////////////////" +
			   "////////////Falta implementar//////////////////" +
			   "///////////////////////////////////////////////");
    }
    



    
}
