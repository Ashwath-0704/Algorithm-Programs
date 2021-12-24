package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberPalindrom {
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();

	/*
	 * Prime number and Prime number
	 */
	public void findPrimeNumber() {
		int count = 0;
		for (int i = 10; i <= 1000; i++) {
			int num = i, revNum = 0;
			while (num != 0) {
				int digit = num % 10;
				revNum = revNum * 10 + digit;
				num /= 10;}
			
			if (revNum == i) {
				boolean isPrime = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;}
				}
				if (isPrime) {arrayList.add(i);count++;
					if (count == 10) {System.out.println();count = 0;}
				}
			}
		}
	}
	/*
	 * find the all number which accpets the condtion:- 
	 * Prime number --> Prime number-->Anagram
	 */
	public void primePalAnagram() {
		findPrimeNumber();
		for (int i = 0; i < arrayList.size(); i++) {
			int num1 = arrayList.get(i);
			String str1 = Integer.toString(num1);
			for (int j = i + 1; j < arrayList.size(); j++) {
				int num2 = arrayList.get(j);
				String str2 = Integer.toString(num2);
				
				if (str1.length() == str2.length()) {
					char[] array1 = str1.toCharArray();
					char[] array2 = str2.toCharArray();
					Arrays.sort(array1);
					Arrays.sort(array2);
					boolean result = Arrays.equals(array1, array2);
					if (result) {System.out.println(str1 + " And " + str2 + " Are Anagram");} 
					else {continue;}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		PrimeNumberPalindrom p = new PrimeNumberPalindrom();
		p.primePalAnagram();
		System.out.println("The number are (Prime-->Palindrome-->Anagram) : \n" + arrayList);
	}
}
