package Algorithm;

public class BinarySerchGeneric<T> {
	

	public <T extends Comparable<T>>  int search(T[] list, int first, int last, T key) {
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
		BinarySerchGeneric<Integer> n = new BinarySerchGeneric<>();
	    //Integer
	    Integer [] searchInteger = {0,2,4,6,8,10,12,14,16};
	
	        System.out.println("\nChecking Integer array...");
			int results;
			int lengthOfArray = searchInteger.length - 1;
			for (int key = 0; key < searchInteger.length; key++) {
				results = n.search(searchInteger, 0, lengthOfArray, searchInteger[key]);
				if (results < 0)
					System.out.println("\n"+searchInteger[key] + " is not in the array.");
				else
					System.out.println("\n"+searchInteger[key] + " is at index " + results);
			}
	}
}
