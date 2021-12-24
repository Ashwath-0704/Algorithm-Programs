package Algorithm;

public class BinarySerchGeneric<T> {
	

	public <T extends Comparable<? super T>> int search(T[] list, int first, int last, T key) {
		int foundPosition;
		int mid = first + (last - first) / 2;
		if (first > last)
			foundPosition = -1;
		else if (key.equals(list[mid]))
			foundPosition = mid;
		else if (key.compareTo(list[mid]) < 0)
			foundPosition = search(list, first, mid - 1, key);
		else
			foundPosition = search(list, mid + 1, last, key);
		return foundPosition;
	}

	public static void main(String args[]) {
		BinarySerchGeneric n = new BinarySerchGeneric();
	    //Integer
	    Integer [] searchInteger = {0,2,4,6,8,10,12,14,16};
	   
	    System.out.println("Integer test array contains...");
	        for (Integer a1 : searchInteger) {
	         System.out.print(a1 + " ");
	        }
		// String
		String[] searchFruits = { "lemon", "apple", "banana", "peach", "pineapple", "grapes", "blueberry", "papaya" };
		System.out.println("String test array contains...");
		for (String a1 : searchFruits) {
			System.out.print(a1 + " ");
		}
		System.out.println("\nChecking String array...");
		int results;
		int fruitLast = searchFruits.length - 1;
		for (int key = 0; key < searchFruits.length; key++) {
			results = n.search(searchFruits, 0, fruitLast, searchFruits[key]);
			System.out.println("Key = " + searchFruits[key]);
			System.out.println("Index result = " + results);
			if (results < 0)
				System.out.println(searchFruits[key] + " is not in the array.");
			else
				System.out.println(searchFruits[key] + " is at index " + results + ".");
		}
	}
}
