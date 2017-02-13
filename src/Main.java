import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
    	TextoLeerEscribir varText = new TextoLeerEscribir();
    	
    	varText.escribirTexto(3000);
    	
    	List<String> listaStrings = varText.leerLineas();
    	
    	int[] listaNumeros = new int[listaStrings.size()];
    	
    	ArrayList<Integer> listaTemp = new ArrayList<Integer>();
    	
    	for(String s : listaStrings) listaTemp.add(Integer.valueOf(s));
    	
    	for(int i = 0; i < listaTemp.size(); i++) {
    	    if (listaTemp.get(i) != null) {
    	    	listaNumeros[i] = listaTemp.get(i);
    	    }
    	}
    	
    	/*for(int i=0; i<listaNumeros.length; i++){
    		System.out.println(listaNumeros[i]);
    	}*/
    	
		System.out.println("Lista Inicial: " + Arrays.toString(listaNumeros));
		MergeSort.mergeSort(listaNumeros);
		System.out.println("Lista Ordenada con Merge:  " + Arrays.toString(listaNumeros));
    	
    }
    
}
