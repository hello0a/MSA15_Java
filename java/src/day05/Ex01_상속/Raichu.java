package day05.Ex01_상속;

// 상속
// 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {

	// 부모 클래스의 생성자를 따라서 생성자 자동완성	
	public Raichu() {
		// super()를 호출하지 않아도 부모 기본생성자를 호출해준다.
//		super();
		super(300, "메가전기");
	}
	
	public Raichu(int energy, String type) {
		// 생성자 없어도 부모 생성자 호출
		// 부모 생성자 호출 후 자식 생성자 호출(덮어씌움)
		super(300, "메가전기");
		
	}

	public Raichu(int energy) {
		super(energy);
		
	}

	// 메서드 오버라이딩
	// : 부모 클래스의 메서드를 자식 클래스에서 재정의하여,
	// 부모 클래스의 메서드를 무시하고, 자식 클래스의 메서드를 우선하여 실행
	// 오버라이딩 자동완성 : alt + shift + S : V	
	// @ : 어노테이션
	// 코드의 특별한 기능 또는 설명을 추가하는 방법
	// 부모 클래스의 메서드를 재정의한 메서드임을 명시하는 어노테이션 (생략가능)
	@Override
	public String aAttack() {
		return "백만볼트";
	}
	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	public String cAttack() {
		return "아이언테일";
	}
}
