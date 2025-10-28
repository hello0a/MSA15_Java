package day06.review;

import java.util.Scanner;

public class Ex06_메서드 {

	/**
	 * 덧셈 메서드
	 * @param a 첫 번째 피연산자
	 * @param b 두 번째 피연산자
	 * @return 덧셈 결과
	 */
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	public static int minus(int a, int b) {
		if (a < 0 || b < 0) {
			// return 이후의 코드는
			// 이미 메서드를 종료하였기 때문에 실행x
			return 0;
		}
		int result = a - b;
		// return (값);
		// 값 없는 경우, 반환타입 void 지정해야한다.
		// 3. 메모리 해제 (추가)
		return result;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		System.out.println(plus(a,b));
		System.out.println(minus(a,b));
		sc.close();
		
		// 1508문제 , 1501 1502 1503 문제
	}
}
