package lombok.basic;

import lombok.Builder;
import lombok.Data;

@Data	// @Getter, @Setter, @ToString
		// @RequiredArgsConstructor
		// @EqualsHashCode
@Builder // 빌더패턴
public class Pikachu {
	// 필수 생성자로 지정되려면,
	// @NoneNull 또는 final 선언
	final int energy;
	String type;
	int level;
}
