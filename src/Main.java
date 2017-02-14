/**
 * Main.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * Ana Lucia Diaz 151378
 * Alejandro Vasquez
 * @author FER ESTRADA
 * @since 2/12/2017
 */



import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
    	TextoLeerEscribir varText = new TextoLeerEscribir();
    	
    	// Se escriben los numeros aleatorios en el archivo de texto
    	varText.escribirTexto(3000);
    	
    	// Se lee el archivo y se guarda en una lista de Strings
    	List<String> listaStrings = varText.leerLineas();
    	
    	// Se guarda la lista de Strings en una lista de Integers
    	int[] listaNumeros = new int[listaStrings.size()];
    	for(int i = 0; i < listaStrings.size(); i++) {
    	    if (listaStrings.get(i) != null) {
    	    	listaNumeros[i] = Integer.valueOf(listaStrings.get(i));
    	    }
    	}
    	
    	
    	//ArrayList<Integer> listaTemp = new ArrayList<Integer>();
    	//for(String s : listaStrings) listaTemp.add(Integer.valueOf(s));
    	
    	
    	/*for(int i=0; i<listaNumeros.length; i++){
    		System.out.println(listaNumeros[i]);
    	}*/
    	
    	// LISTA INICIAL DE NUMEROS
		System.out.println("Lista Inicial: " + Arrays.toString(listaNumeros));
		
		// LISTA ORDENADA CON MERGESORT
		//MergeSort.mergeSort(listaNumeros);
		
		// LISTA ORDENADA CON RADIX
		//RadixSort.sort(listaNumeros);
		
		// LISTA ORDENADA CON GNOME
		//GnomeSort.gnomeSort(listaNumeros);
		
		// LISTA ORDENADA CON QUICK
		QuickSort quick = new QuickSort();
		quick.sort(listaNumeros);
		
		System.out.println("Lista Ordenada con Merge:  " + Arrays.toString(listaNumeros));
    	
    }
    
}
