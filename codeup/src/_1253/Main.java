package _1253;

import java.util.Scanner;

public class Main {
	// 어떤 두 수 a, b가 있을 때 두 수 사이의 모든 정수를 오름차순으로 출력하시오.
	// 예를 들어, 
	// a=5 , b=10일 경우 5 6 7 8 9 10입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = b; i <=a ; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// swap 교환
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
