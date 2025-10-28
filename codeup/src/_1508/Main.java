package _1508;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= i; j++) {
				a[i][j] = a[i][j-1]-a[i-1][j-1];
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
