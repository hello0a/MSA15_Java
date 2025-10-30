package 문제1;

public class Solution2 {
	public String solution(String my_string) {
		String answer = "";

		int size = my_string.length();
		// for문으로 문자열 하나씩 거꾸로 빼서 answer에 담기
		for (int i = size-1; i >= 0; i--) {
			char ch = my_string.charAt(i);
			System.out.println(ch);
			answer += ch;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		new Solution2().solution("안녕하세요.");
	}
}
