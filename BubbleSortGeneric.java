package Algorithm;

import java.util.Arrays;

class BubbleSortDemo<T extends Comparable<T>> {
	public static <T extends Comparable<T>> void bubbleSort(T[] list, int size) {
		T temp;
		for (int i = size - 1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if (list[j].compareTo(list[j + 1]) > 0) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
}

public class BubbleSortGeneric {
	public static void main(String[] args) {
		Integer[] intArr = { 47, 85, 62, 34, 7, 10, 92, 106, 2, 54 };
		BubbleSortDemo.bubbleSort(intArr, intArr.length);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(intArr));
		
		String[] strArr = { "Earl", "Robert", "Asha", "Arthur" };
		BubbleSortDemo.bubbleSort(strArr, strArr.length);
		System.out.println("\nSorted Array: ");
		System.out.println(Arrays.toString(strArr));
	}
}
