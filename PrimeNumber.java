package Algorithm;

import java.util.*;

public class PrimeNumber {
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public void findPrimeNumber() {
		int s1, s2, flag = 0, i, j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lower limit :");
		s1 = s.nextInt();
		System.out.println("Enter the upper limit :");
		s2 = s.nextInt();
		System.out.println("The prime numbers in between the entered limits are :");
		for (i = s1; i <= s2; i++) {

			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				arrayList.add(i);
				System.out.println(arrayList);
			}
		}
	}

	public static void main(String args[]) {
		PrimeNumber num = new PrimeNumber();
		num.findPrimeNumber();
	}
}