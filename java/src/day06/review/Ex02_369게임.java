package day06.review;

import java.util.Scanner;

public class Ex02_369게임 {

	public static void main(String[] args) {
		// 정수 1~100까지 수를 반복하여 출력하면서,
		// 해당 수가 3 또는 6 또는 9가 될때는,
		// 자리수마다 369가 되는 개수만큼 정수 대신
		// "*" 출력하는 프로그램 작성하시오.
		// 순서도
		// 1. 정수 1~100까지 반복 출력 : 출력 변수
		// 2. 3, 6, 9 조건문
			// 2-1) 십의 자리수가 369인지 판단(A)
			// 2-2) 일의 자리수가 369인지 판단(B)
		// 3. 369개수에 따라서 출력
			// A and B --> **
			// A or B --> *
			// 그 외 --> 정수
		
		for (int i = 1; i <= 100; i++) {
			// 십의 자리수 : i / 10 (몫)
			// 일의 자리수 : i % 10 (나머지)
			int ten = i / 10;
			int one = i % 10;
			
			boolean ten369 = ten == 3 || ten == 6 || ten == 9; 
			boolean one369 = one == 3 || one == 6 || one == 9; 
			
			if ( ten369 && one369) {
			System.out.println("**");
			} else if ( ten369 || one369) {
				System.out.println("*");
			} else {
				System.out.println(i);
			}
		}
	}
}
