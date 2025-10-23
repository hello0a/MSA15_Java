package day03;

import java.util.Scanner;

/*
 * 할일 목록 프로그램
 * 
 * 최대 10개의 할일을 관리할 수 있는 프로그램으로,
 * 메뉴를 통해 할일을 추가, 조회, 상태 변경 할 수 있는 기능 구현
 * 기능
 * 1. 할일 추가
 * 2. 할일 목록
 * 3. 상태 변경
 * 
 * ""상태"" 를 enum(열거타입)으로 정의하여 관리
 * Status : 시작 전, 진행 중, 완료
 */

enum Status {
	
	TODO("시작 전"),
	ING("진행 중"),
	DONE("완료");

	// 상수 선언
	// 상태의 값을 저장하는 상수
	private final String status;
	
	// 생성자를 통해 상수의 값을 지정
	Status(String status) {
		 this.status = status;
	}
	
	// 상태의 값을 반환하는 메서드
	public String getValue() {
		return status;
	}
}

class Todo {
	// 할일 타입
	String name;
	// 할일 상태
	Status status;
	
	// alt + shift + S : 소스메뉴
	// 생성자, getter, setter, toString
	public Todo(String name, Status status) {
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + ", status=" + status.getValue() + "]";
	}
}

public class Ex09_Todo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 최대 10개의 할일
		Todo[] todoList = new Todo[10];
		// 할일 개수
		int count = 0;
		
		while ( true ) {			
			System.out.println("######### 할일 목록 프로그램 ########");
			System.out.println("1. 할일 추가");
			System.out.println("2. 할일 목록");
			System.out.println("3. 상태 변경");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			// 숫자 입력 후 '엔터' 누르면
			// nextInt는 숫자만 가져가서 '엔터'가 남음
			int menuNo = sc.nextInt();
			// '엔터' 남기는 것 방지
			sc.nextLine();
			
			if (menuNo == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (menuNo) {
			// 할일 추가
			case 1:
				System.out.print("할일 : ");
				// nextLine이 남은 '엔터' 가져와서 처리함.
				String name =sc.nextLine();
				// 할일 객체 생성
				Todo todo = new Todo(name, Status.TODO);
				// 할일 추가
				todoList[count++] = todo;
				// 할일 개수 증가
//				count++;
				
				System.out.println("할일을 추가하였습니다.");
				System.out.println(todo);
				System.out.println();
				break;
			// 할일 목록
			case 2:
				System.out.println("======== 할일 목록 =======");
				for (int i = 0; i < todoList.length; i++) {
					if (todoList[i] == null) {
						continue;
					}
					System.out.println((i+1) + ". " + todoList[i]);
				}
				System.out.println();
				break;
			// 상태 변경
			case 3:
				System.out.print("할일 번호 : " );
				int index = sc.nextInt() - 1;
				sc.nextLine(); // 엔터 제거
				// 변경 가능한 상태 출력
				Status[] statusList = Status.values();
				for (Status status : statusList) {
					System.out.println((status.ordinal() + 1) +". " + status.getValue());
				}
				// 변경할 상태 번호 입력
				System.out.print("번호 : " );
				int statusNo = sc.nextInt();
				sc.nextLine();
				// 상태 변경
				// 입력한 번호의 상태
				Status updateStatus = statusList[statusNo-1];
				// 지정한 할일의 상태 변경
				todoList[index].setStatus(updateStatus);
				System.out.println("할일의 상태를 " + updateStatus.getValue() + "(으/로) 변경하였습니다.");
				break;
			default:
				System.out.println("0~3 사이의 올바른 번호를 입력해주세요.");
				break;
			}
		}
		sc.close();
	}
}
