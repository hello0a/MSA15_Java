package day04.Ex03_메서드;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// 객체 생성
		Calculator calculator = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		System.out.println("덧셈 : " + calculator.plus(a, b));
		System.out.println("뺄셈 : " + calculator.minus(b, a));
		System.out.println("곱셈 : " + calculator.multiple(a, b));
		// printf("포맷", 변수) : %X.Y (리터럴)
		// X : 양수 - 크기만큼 칸을 지정하고 오른쪽 정렬
		// 		음수 - 크기만큼 칸을 지정하고 왼쪽 정렬
		// Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		// 리터럴 : %d (정수), %f (실수), %s(문자열)
		// \n : 엔터(개행)
		System.out.printf("a * b = %5.2f \n", calculator.multiple(a, b));
		System.out.println("나눗셈 : " + calculator.divide(a, b));
		System.out.printf("a / b = %5.2f \n", calculator.divide(a, b));
		System.out.println("나머지 : " + calculator.remain(a, b));
		
		int result[] = {10,20,30,40,50};
		System.out.println("합계 : " + calculator.sum(result));
		System.out.println("평균 : " + calculator.avg(result));
		sc.close();
	}
}
