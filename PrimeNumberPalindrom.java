package Algorithm;

public class PrimeNumberPalindrom {

	public void findPrimeNumber() {

		int count = 0;
// Palindrom
		for (int i = 10; i <= 1000; i++) {

			int num = i, revNum = 0;
			while (num != 0) {
				int digit = num % 10;
				revNum = revNum * 10 + digit;
				num /= 10;
			}
// Prime
			if (revNum == i) {
				boolean isPrime = true;
				for (int j = 2; j <= i / 2; j++) {

					if (i % j == 0) {
						isPrime = false;
						break;
					}

				}

				if (isPrime) {
					System.out.print(i + " ");
					count++;
					if (count == 10) {
						System.out.println();
						count = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumberPalindrom p = new PrimeNumberPalindrom();
		p.findPrimeNumber();
	}
}
