package 문제1;

import java.util.Stack;

public class Solution {
	    public String solution(String my_string) {
	       String answer = "";
	        Stack<Character> stack = new Stack<>();
	        char[] charList = my_string.toCharArray();
	        for ( char ch : charList) {
	            stack.push(ch);
	        }
	        
	        while ( !stack.isEmpty() ) {
	            answer += stack.pop();
	        }
	        System.out.println(answer);
	        return answer;
	    }
	    public static void main(String[] args) {
			new Solution().solution("jaron");
		}
}
