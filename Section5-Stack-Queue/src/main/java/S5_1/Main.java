package S5_1;

import java.util.*;
//1.올바른 괄호
/*
	stack last-in-first-out
	queue first-in-first-out
	
	
	여는 괄호를 stack에 넣기 push
	닫는 괄호를 만난다 > 가장 마지막에 넣은 괄호의 짝이다. pop으로 빼내기
	
	스택이 비어 있는데,닫는 괄호를 만났다? > 잘못된 괄호다
	stack.isEmpty()로 참,거짓 확인
	
	여는 괄호가 더 많은 경우,stack에 남는다.
	stack이 비지않으면 여는 괄호가 많다.


*/
public class Main {
	public String solution(String str){
		String answer = "YES";
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				//닫는 괄호가 많은 상황
				if(stack.isEmpty()) answer = "NO";
					stack.pop();
			}
		}
		//여는괄호가 많은 상황 
		if(!stack.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		
		System.out.print(T.solution(str));
	}
}
