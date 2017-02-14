/**
 * QuickSort.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * Ana Lucia Diaz 151378
 * Alejandro Vasquez
 * @author FER ESTRADA
 * @since 2/12/2017
 * Tomado de http://www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html
 */



public class QuickSort {
	private int[] numbers;
	private int number;

	public void sort(int[] values) {
		// Verificar si el array es null o esta vacio
		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Obtener el elemento pivote del medio de la lista
		int pivot = numbers[low + (high - low) / 2];

		// Dividir en dos listas
		while (i <= j) {
			// Si el elemento actual de la lista de la izquierda es mas pequeno
			// que el elemento pivote entocnes tomar el siguiente elemento de la
			// lista de la izquierda
			while (numbers[i] < pivot) {
				i++;
			}
			// Si el elemento actual de la lista de la derecha es mayor que el
			// elemento pivote entonces tomar el siguiente elemento de la lista
			// de la derecha
			while (numbers[j] > pivot) {
				j--;
			}

			// Si encontramos un valor en la lista izquierda que sea mayor que
			// el elemento pivote y
			// si encontramos un valor en la lista de la derecha que sea menor
			// que el elemento pivote,
			// se intercambian cambian los valores.
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}