package _1355;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// n = 1 --> *
		// n = 2 --> *
		//			 **
		// n = 3 --> *
		//			 **
		//			 ***
		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				int temp = i;
				i = j;
				j = i;
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
