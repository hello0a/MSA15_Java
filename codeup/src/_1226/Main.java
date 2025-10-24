package _1226;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 로또 순위
		// 1등 6개, 2등 5개(+보너스), 3등 5개, 4등 4개, 5등 3개, 꽝 2개
		Scanner sc = new Scanner(System.in);
		// 1. 로또 당첨번호 6개와 보너스 번호 1개
		int lotto[] = new int[7];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
			System.out.print(lotto[i] + " ");
		}
		
		// 2. 지혜가 가지고 있는 로또 번호 6개
		int jihye[] = new int[6];
		
		for (int i = 0; i < jihye.length; i++) {
			jihye[i] = sc.nextInt();
			System.out.print(jihye[i] + " ");
		}
		
		// 3. 지혜의 당첨 결과 출력
		int count = 0;
		
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < jihye.length; j++) {
				if (lotto[i] == jihye[j]) {
					count++;
					break;
				}
			}
		}
		
		if (count == 5) {
			for (int i = 0; i < jihye.length; i++) {
				if (jihye[i] == lotto[6]) {
					count++;
				}
			}
		}

		switch (count) {
		case 3: System.out.println("5"); break;
		case 4: System.out.println("4"); break;
		case 5: System.out.println("3"); break;
		case 6: System.out.println("2"); break;

		default: System.out.println("꽝");break;
		}
		// 1등 = 1, 2등 = 2, 3등 = 3,,,,꽝 = 0
	}
}
