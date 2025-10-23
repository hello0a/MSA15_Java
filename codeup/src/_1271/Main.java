package _1271;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력의 개수 n
		// n개의  데이터가 입력
		// 이 n개의 데이터 중 최댓값을 출력한다.
		// 1. 첫째줄에 정수의 개수 N 주어짐 (n <= 1000)
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		
		if (n <= 1000) {
			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();				
				// 2. 둘째줄에 N개의 정수가 공백으로 분리되어 주어짐 (0 <= 데이터 <= 1000000)
				if (num > max) {
					max = num;
				}
			}
			System.out.println(max);			
		}
		sc.close();
		*/
		
		// 최댓값 구하기
		// 변수 : N(입력), input(데이터), max(최댓값)
		// 조건 : 입력받은 값이랑 최댓값을 저장할 변수랑 비교 조건
		//		input 	>	max		:	max = input
		// 반복 : 입력받은 N번만큼 데이터 입력 받기
		// 입력 : 5
		//		1 2 3 4 5
		// 출력 : 최댓값
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		// i: 0 ~ N-1
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			if (input > max) {
				max = input;
			}
		}
		System.out.println(max);
		
		sc.close();
		
	}
}
