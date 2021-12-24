package Algorithm;

import java.util.Scanner;

public class findYouNumber {

public void findTheNumber() {

	System.out.println("Think of a numbe between 1 and 100");
	Scanner sc = new Scanner(System.in);
	int leftNumber = 0;
	int reightNumber = 100;

	while ((reightNumber - leftNumber) > 0) {

		int mid = ((leftNumber + reightNumber) / 2);

		System.out.println("Is" + mid + "your number? \n(yes or no)");
		String ch = sc.next().toLowerCase();

		if (ch.equals("yes")) {
			System.out.println("Your number is : " + mid);
			break;
		} else {
			System.out.println("Is your number between " + leftNumber + " and " + reightNumber + " ?\n(yes or no)");
			String ch2 = sc.next().toLowerCase();
			if (ch2.equals("yes")) {
				reightNumber = mid;
//			leftNumber=0;
			} else {
				leftNumber = mid;
			}
		}
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findYouNumber game = new findYouNumber();
		game.findTheNumber();
	}

}
