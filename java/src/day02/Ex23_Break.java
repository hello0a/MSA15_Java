package day02;

import java.util.Scanner;

public class Ex23_Break {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 무한 루프
		// 반드시 종료조건 추가하기
		while(true) {
			System.out.print("입력 : " );
			// 문자열 한 줄 입력
			String input = sc.nextLine();
			// 문자열.equals("비교문자열")
			// 문자열이 비교문자열과 일치하는지 여부를 반환하는 메서드
			if ( input.equals("STOP"))
				break;
			System.out.println(">> " + input);
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
