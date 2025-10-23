package day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		// 첫번째 줄에 입력할 개수 N을 입력받고
		// 두번째 줄에 N개의 정수를 공백을 두고 입력받기
		// N개의 정수 중, 최솟값을 구하시오.
		// (입력)
		// 5
		// 90 60 70 100 55
		// (출력)
		// 최솟값 : 55
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// N개의 요소를 갖는 배열 생성
		int arr[] = new int[N];
		// 정수 범위 중 가장 큰 값 : 21억xxx 
		int min = Integer.MAX_VALUE;
		
		// 배열 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		// 최소값 구하기
		for (int i = 0; i < arr.length; i++) {
			if ( min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		sc.close();
	}
}
