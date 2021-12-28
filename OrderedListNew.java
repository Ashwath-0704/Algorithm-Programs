package Algorithm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class OrderedListNew {
	static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public static void orderedList() throws IOException {
		BinarySearcherNew bs = new BinarySearcherNew();
		try {
			bs.Readfile();
			System.out.println(bs.list1);
			System.out.println("Enter the word to search");
			String Searchword = sc.next();
			// Adding word
			if (!bs.list1.contains(Searchword)) {
				bs.list1.add(Searchword);
			}
			// Removing word
			else {
				bs.list1.remove(Searchword);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Collections.sort(bs.list1);
		System.out.println(bs.list1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			orderedList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//C:\\Users\\hp\\OneDrive\\BridgeLabz\\eclipse-workspace\\AlgorithmPrograms\\src\\Algorithm\\input.txt
