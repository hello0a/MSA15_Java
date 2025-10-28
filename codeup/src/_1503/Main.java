package _1503;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	// n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.
	// 2차원 배열의 크기 n이 입력된다(n <= 50)
	// 입력 ex) 3
	// 출력 ex) 1 2 3
			// 6 5 4
			// 7 8 9
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int k = 1;
		
		for (int i = 0; i < n; i++) {
			if ( i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = k++;
				}
			} else {
				for (int j = n-1; j >= 0; j--) {
					arr[i][j] = k++;					
				}
			}
		}
			
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {					
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
