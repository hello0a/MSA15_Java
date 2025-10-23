package day02;

public class Ex21_GuguAll {

	public static void main(String[] args) {
		// 단(2~9) : j
		// 곱(1~9) : i
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (i*j));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
