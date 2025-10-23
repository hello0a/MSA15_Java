package day02;

public class Ex15_While {

	public static void main(String[] args) {
		// 1~10까지 공백을 두고 출력하시오.
		// 1 2 3 4 ...
		int a = 1;
		
		// while (조건) { 반복 실행문 }
		// 반복문에는 반드시 종료 조건이 성립하도록 작성
		// 종료 조건이 만족하지 않으면, 무한 루프
		while( a <= 10) {
			System.out.print(a + " ");
//			a = a + 1;
			// 복합 대입 연산자
//			a += 1;
			// 증감 연산자
			a++;
		}
		System.out.println();
		
		System.out.println("a : " + a);
	}
}
