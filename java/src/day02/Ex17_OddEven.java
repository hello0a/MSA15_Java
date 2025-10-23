package day02;

public class Ex17_OddEven {

	public static void main(String[] args) {
		
		// 1~20까지 정수 중, 홀수의 합계와 짝수의 합계를 각각 구하여 출력하시오.
		
		// 1~20까지 a 반복
		// a가 홀수인지, 짝수인지 판별
		// 홀수이면, sum1에 a 더하고
		// 짝수이면, sum2에 a 더하기
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while( a <= 20 ) {
			// 홀수
			if ( a % 2 == 1 ) {
				sum1 += a;
			// 짝수
			} else {
				sum2 += a;
			}
			++a;
		}
		System.out.println("홀수의 합계 : " + sum1);
		System.out.println("짝수의 합계 : " + sum2);
	}
}
