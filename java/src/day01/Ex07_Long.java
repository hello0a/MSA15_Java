package day01;

public class Ex07_Long {

	public static void main(String[] args) {
		// int (4byte : 32bit) 2^32개 : 약 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8byte : 64bit) : 2^64개
		long ln1 = 1000;
		long ln2 = 2100000000;
		// 자바에서 기본 정수는 int타입으로 인식!
		// long ln3 = 2200000000; -> int형
		// long타입 : 숫자L (L 붙이기)
		long ln3 = 2200000000L;
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}
}
