package practice;

import java.util.Scanner;

public class PrimeSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println(i);
			}

		}

	}
}
