package Algorithm;

import java.util.HashMap;

public class Anagram {
	
	static void areAnagram(String s1, String s2) {

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();

		// first string
		for (int i = 0; i < arr1.length; i++) {
			if (map1.get(arr1[i]) == null) {
				map1.put(arr1[i], 1);
			} else {
				Integer c = (int) map1.get(arr1[i]);
				map1.put(arr1[i], ++c);
			}
		}// end 1st for loop

		// second String
		for (int j = 0; j < arr2.length; j++) {

			if (map2.get(arr2[j]) == null)
				map2.put(arr2[j], 1);
			else {
				Integer d = (int) map2.get(arr2[j]);
				map2.put(arr2[j], ++d);
			}
		}// end 2nd for loop

		if (map1.equals(map2)) {
			System.out.println("The two strings are anagrams of each other");
			}
		else {
			System.out.println("The two strings are not anagrams of each other");
			}
	}
	public static void main(String args[]) {

		String str1 = "heart";
		String str2 = "earth";
		areAnagram(str1,str2);

	}
}
