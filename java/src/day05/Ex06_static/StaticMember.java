package day05.Ex06_static;

public class StaticMember {

	// static 변수
	static int a;
	static int b;
	
	// 인스턴스 변수
	int c;
	
	// static 상수
	static final double PI = 3.141592;
	
	// static 메서드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
//		sum += c;
		// c는 static 변수가 아니고 인스턴스 변수이기 때문에
		// 객체 생성 시 메모리가 할당되므로
		// static 메서드가 할당되는 시점에서 접근할 수 없다.
		// 결론 : static 메서드에서는 인스턴스 멤버를 접근할 수 없다.
		return sum;
	}
	
	public static void main(String[] args) {
		// 만약, sum 메서드가 static이 아니라면
		// 객체 생성 후 해당 변수를 통해 메서드 호출
		// 즉, static 메서드는 객체 생성 없이 호출 가능
//		StaticMember s = new StaticMember();
//		int sum = s.sum(10, 20);
		int sum = sum(10, 20);
		// 다른 클래스에서 호출하는 경우
		// 클래스.메서드(인자) 로 호출하기
		StaticMember.sum(100, 200);
		
		a = 100;
		
		// 인스턴스 생성
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		int a1 = s1.a;
		int c1 = s1.c = 10;
		int a2 = s2.a;
		int c2 = s2.c = 20;
		
		// final 상수로 지정하는 키워드
		// 한 번 값을 초기화한 후에는 변경x
//		PI = 100;
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
	}
}
