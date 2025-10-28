package day07.Ex04_빌드패턴;

public class Builder {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu.Builder()
									.energy(100)
									.type("전기")
									.level(10)
									.build();
		// 메서드 체이닝 : 체인처럼 메서드 여러개 한 번에 호출
		System.out.println(pikachu);
		
		Pikachu pikachu2 = new Pikachu.Builder()
									.energy(200)
									.build();
		System.out.println(pikachu2);
		
		
	}
}
