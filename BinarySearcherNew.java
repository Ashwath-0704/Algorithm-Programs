package Algorithm;

import java.io.*;
import java.util.*;

public class BinarySearcherNew {
	static ArrayList<String> list1 = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	public void Readfile() throws FileNotFoundException {
		System.out.print("Enter the path file including extension : \n(eg:-\"C:\\Users\\hp\\input.txt)");
		String path = sc.nextLine();
		Scanner s = new Scanner(new File(path));
		while (s.hasNext()) {
			list1.add(s.next());
		}
		s.close();
	}

	public void binarySearch(ArrayList<String> list1) throws FileNotFoundException {
		Readfile();
		System.out.println("\n\n" + list1);
		System.out.print("\n\nEnter the one word to know the index number : ");
		String x = sc.nextLine();
		// use iterator to traverse list
		System.out.println("Before sorting: " + list1);

		Collections.sort(list1); // sorting list element

		Iterator<String> itrAfterSort = list1.iterator();
		System.out.println("\nAfter Sorting:");
		while (itrAfterSort.hasNext()) {
			String token = itrAfterSort.next();
			System.out.println(token);
		}
		// Binary Search can be performed on Sorted List
		int i = Collections.binarySearch(list1, x);
		System.out.println("Given Key is present at index :" + i + " on sorted list");
	}

	public static void main(String[] args) throws FileNotFoundException {
		BinarySearcherNew bin = new BinarySearcherNew();
//		bin.Readfile();
		bin.binarySearch(list1);
	}
}

// "C:\\Users\\hp\\OneDrive\\BridgeLabz\\eclipse-workspace\\AlgorithmPrograms\\src\\Algorithm\\input.txt"
