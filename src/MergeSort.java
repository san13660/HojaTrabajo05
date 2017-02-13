/**
 * MergeSort.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * @author Christopher Sandoval
 * @since 2/12/2017
 * Tomado de https://www.buildingjavaprograms.com/code_files/4ed/ch13/MergeSort.java
 */



public class MergeSort {

	// Coloca los elementos de un array de forma ordenada

	// post: array esta arreglado de forma ascendente
	public static void mergeSort(int[] array) {
		if (array.length > 1) {
			// Dividir array en dos mitades
			int[] left = leftHalf(array);
			int[] right = rightHalf(array);

			// Ordenar las dos mitades recursivamente
			mergeSort(left);
			mergeSort(right);

			// Mezclar las mitades ordenadas en un solo elemento ordenado
			merge(array, left, right);
		}
	}

	// Regresa la primera mitad (izquierda) del array.
	public static int[] leftHalf(int[] array) {
		int size1 = array.length / 2;
		int[] left = new int[size1];
		for (int i = 0; i < size1; i++) {
			left[i] = array[i];
		}
		return left;
	}

	// Regresa la segunda mitad (derecha del array).
	public static int[] rightHalf(int[] array) {
		int size1 = array.length / 2;
		int size2 = array.length - size1;
		int[] right = new int[size2];
		for (int i = 0; i < size2; i++) {
			right[i] = array[i + size1];
		}
		return right;
	}

	// Mezcla el array de la izquierda y derecha en un array final.
	// pre : Resultado vacio; izqueirda/derecha ya estan ordenadas.
	// post: Resultado contiene la mezcla de las listas ordenadas.
	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0; // Index array izquierdo
		int i2 = 0; // Index array derecho

		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1]; // Tomar de la izqueirda
				i1++;
			} else {
				result[i] = right[i2]; // Tomar de la derecha
				i2++;
			}
		}
	}
}
