/**
 * RadixSort.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 3
 * Christopher Sandoval 13660
 * Fernanda Estrada 14198
 * Ana Lucia Diaz 151378
 * Alejandro Vasquez
 * @author Christopher Sandoval
 * @since 2/12/2017
 * Tomado de https://gist.github.com/yeison/5606963
 */



public class RadixSort {
	public static int[] sort(int[] input) {

		for (int place = 1; place <= 1000000000; place *= 10) {
			input = countingSort(input, place);
		}

		return input;
	}

	private static int[] countingSort(int[] input, int place) {
		int[] out = new int[input.length];

		int[] count = new int[10];

		for (int i = 0; i < input.length; i++) {
			int digit = getDigit(input[i], place);
			count[digit] += 1;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		for (int i = input.length - 1; i >= 0; i--) {
			int digit = getDigit(input[i], place);

			out[count[digit] - 1] = input[i];
			count[digit]--;
		}

		return out;

	}

	private static int getDigit(int value, int digitPlace) {
		return ((value / digitPlace) % 10);
	}

}
