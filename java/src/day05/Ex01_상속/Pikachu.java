package day05.Ex01_상속;

public class Pikachu {

	// 변수
	public int energy;
	public String type;
	
	// 생성자
	// 기본 생성자
	public Pikachu() {
//		energy = 100;
//		type = "전기";
		this(100,"전기");
	}
	
	// 메서드(생성자) 오버로딩
	// 생성자 목적 : 값 초기화
	public Pikachu(int energy) {
//		this.energy = energy;
		this( energy, "전기");
	}
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	// 메서드
	// return
	// 1. 값을 호출한 자리로 반환
	// 2. 메서드 종료
	public String aAttack() {
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}
	
	// toString 메서드
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
}
