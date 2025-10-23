package day01;

public class Ex04_Char {
	public static void main(String[] args) {
		// 문자 데이터 : char
		// 작은 따옴표 ' ' : 한 글자 표현
		// 문자 리터럴 : 'A'
		char c1 = 'A';
		// 십진수 --> 아스키코드표 매핑된 문자
		// 65 = A
		char c2 = 65;
		// 유니코드 지정
		// 0041 = A
		char c3 = '\u0041';
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		
		// c2(char 2byte) + 1(int 4byte) = int
		// 자동으로 큰 타입(int)로 변환 - 자동 형변환
		// b(char 2byte) = (char)(c2 + 1)(int 4byte)
		// 큰 타입(int)을 작은 타입(char)으로 변환 - 강제 형변환
		// 즉, 작은 자료형과 큰 자료형 연산하면, 결과는 큰 자료형
		// 해결 : 자동 혹은 강제 형변환 필요!
		char b = (char) (c2 + 1);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드값 : " + unicode);
		System.out.println("b : " + b);
	}
}
