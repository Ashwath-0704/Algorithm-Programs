package Algorithm;

public class insertionSort<T extends Comparable<T>> {
	T[] arr;

	// Java program for implementation of Insertion Sort
	/* Function to sort array using insertion sort */
	void sort(T arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			T key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n */
	void printArray(T[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[]) {
		String[] arr = { "a", "z", "c", "d" };

		insertionSort ob = new insertionSort();
		ob.sort(arr);

		ob.printArray(arr);
	}
} /* This code is contributed by Rajat Mishra. */
