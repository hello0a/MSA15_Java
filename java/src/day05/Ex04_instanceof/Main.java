package day05.Ex04_instanceof;

import day05.Ex01_상속.Pikachu;
import day05.Ex01_상속.Raichu;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        
        // String은 Object의 하위 클래스이므로 true
        boolean result1 = str instanceof Object;  // true
        
        // String은 CharSequence 인터페이스를 구현하므로 true
        boolean result2 = str instanceof CharSequence;  // true
        
        // String은 StringBuilder의 인스턴스가 아니므로 false
//        boolean result3 = str instanceof StringBuilder;  // 컴파일 오류!
        
        // null은 어떤 타입의 인스턴스도 아님
        // instanceof :
        // 클래스 타입이 아닌,
        // 생성된 객체 인스턴스가 무슨 타입인지 확인하는 것
        String nullStr = null;
        boolean result4 = nullStr instanceof String;  // false
        
        System.out.println("str instanceof Object: " + result1);
        System.out.println("str instanceof CharSequence: " + result2);
        System.out.println("nullStr instanceof String: " + result4);
        
        // 부모 Pikachu 자식 Raichu --> true
        Raichu raichu = new Raichu();
        System.out.println(raichu instanceof Pikachu);
        System.out.println(raichu instanceof Raichu);
        // Person cannot be resolved to a type
        // instanceof :
        // 부모 자식 관계에 있어야 타입 확인 가능
        // 상속 관계(전제조건)이 아니므로 타입 확인 불가
//        System.out.println(raichu instanceof Person);
        
        Pikachu pikachu = new Raichu();
        System.out.println(pikachu instanceof Pikachu);
        System.out.println(pikachu instanceof Raichu);
        
        Pikachu pikachu1 = new Pikachu();
        System.out.println(pikachu1 instanceof Pikachu);
        // 부모는 자식이 누군지 모름 : false --> 다시 확인해보기(챗)
        System.out.println(pikachu1 instanceof Raichu);
        
        // 조건문으로 활용 가능
        if (pikachu instanceof Raichu) {}
        if (pikachu instanceof Pikachu) {}
    }
}

