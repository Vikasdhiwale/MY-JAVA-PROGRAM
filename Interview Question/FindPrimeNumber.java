package Com.question;

import java.util.Scanner;

public class FindPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num1 = sc.nextInt();
		// System.out.println(num1);
		int count = 0;

		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}
