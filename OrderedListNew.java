package Algorithm;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
s
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
			if (!bs.list1.contains(Searchword)) {bs.list1.add(Searchword);}	// Adding word
			else {bs.list1.remove(Searchword);}	// Removing word
		} 
		catch (FileNotFoundException e) {e.printStackTrace();}
		Collections.sort(bs.list1);
		System.out.println(bs.list1);
	}
	public static void main(String[] args) {
		try {
			orderedList();
			} 
		catch (IOException e) {
			e.printStackTrace();
			}
	}
}
//C:\\Users\\hp\\OneDrive\\BridgeLabz\\eclipse-workspace\\AlgorithmPrograms\\src\\Algorithm\\input.txts