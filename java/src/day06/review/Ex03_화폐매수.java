package day06.review;

import java.util.Scanner;

/**
 * 우리 학원에서 박희진 님께서 거액의 예산을 주고
 * 전자렌지를 구매하라고 지시하셨다.
 * 이 때 전자렌지 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비 : 657,852원
 * 50000 : 13장
 * 10000 : 0장 
 * 5000 : 1장
 * 1000 : 2장
 * 500 : 1개
 * 100 : 3개
 * 50 : 1개
 * 10 : 0개
 * 5 : 0개
 * 1 : 2개
 * 위와 같이 입력하면,
 * 큰 화폐단위부터 계산하여, 화폐단위별 화폐매수를 출력하는 프로그램 작성하시오.
 */
public class Ex03_화폐매수 {
	
	public static void main(String[] args) {
		/*
		 * 순서도
		 * 1. 필요한 변수 선언
		 * 	- 입력 금액, 화폐 매수, 화폐 단위
		 * 2. 구매비 입력
		 * 3. 화폐 매수 계산
		 * 	- 화폐 매수 계산
		 * 		(화폐 매수) = (입력 금액) / (화폐 단위)
		 * 	- 잔액 계산
		 * 		잔액 = 입력금액 - (화폐 단위 * 화폐매수)
		 * 			ex) 657852 - (50000 * 13) = 7852
		 * 		잔액 = 입력금액 % 화폐 단위	
		 * 			ex) 657852 % 50000 = 7852
		 * 	- 화폐 단위 변환
		 * 		번갈아 가면서, /5, /2 연산을 반복
		 * 		화폐 단위 = 화폐 단위 / 5
		 * 		화폐 단위 = 화폐 단위 / 2
		 * - 3번 과정 반복
		 * 		조건 : 화폐 단위가 1원이 될 때까지
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매비 : ")	;
		int input = sc.nextInt(); // 입력 금액
		int money = 50000; // 화폐 단위
		int count = 0; // 화폐 매수
		boolean sw = true;
		
		while (money >= 1) {
			count = input / money;
			System.out.println(money + " : " + count + "개");
			
			input = input % money;
			if (sw) {
				money = money / 5;
			} else {
				money = money / 2;			
			}
			sw = !sw;
		}
		sc.close();
	}

}
