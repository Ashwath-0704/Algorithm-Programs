package Algorithm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedListNew {
	/*
	 * UnOrderedList fucntion
	 */
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("static-access")
	public static void unOrderedList() throws IOException {
		BinarySearcherNew bs = new BinarySearcherNew();
		try {
			bs.Readfile();
			System.out.println(bs.list1);
			System.out.println("Enter the word to search");
			String Searchword = sc.next();
			
			if (!bs.list1.contains(Searchword)) { bs.list1.add(Searchword); }// Adding word
			else { bs.list1.remove(Searchword);}// Removing word
			
			System.out.println(bs.list1);
		}
		catch (FileNotFoundException e) {e.printStackTrace();}
	}
	public static void main(String[] args) throws IOException {
		unOrderedList();
	}
}
//C:\\Users\\hp\\OneDrive\\BridgeLabz\\eclipse-workspace\\AlgorithmPrograms\\src\\Algorithm\\input.txt