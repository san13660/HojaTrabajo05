 /**
 * Main.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * @author FER ESTRADA
 * @since 2/12/2017
 */



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	TextoLeerEscribir varText = new TextoLeerEscribir();
    	
    	varText.escribirTexto(10);
        
        System.out.println(varText.textoLeer());
    }
    
}
