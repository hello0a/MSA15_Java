package day02;

public class Ex16_WhileSum {

	public static void main(String[] args) {
		// 1부터 100까지 합계를 구하시오.
		// 1+2+3...+100 = ?
		
		int a = 1;
		// 합계
		int sum = 0;
		
		while (a <= 100) {
			sum += a;
			++a;
		}
		System.out.println(sum);
	}
}
