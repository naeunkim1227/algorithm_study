package S5_2;

import java.util.*;
//2.괄호문자제거
/*
  	
	여는 괄호면 push
	알파벳 push
	닫는 괄호를 만났을때, 여는 괄호 만날때 까지 pop	> 반복
	
	stack에서 자료가 남으면 
	stack.size 만큼 반복문으로 해서 출력하기

*/
public class Main {
	public String solution(String str){
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
	
		for(char x : str.toCharArray()) {
			if(x == ')') {
				//stack.pop은 꺼낸 값을 리턴 받는다. 따라서 '('여는 괄호가 나올때까지 pop하면된다.
				while(stack.pop() != '(');
			
			}else {
				stack.push(x);
			}
		}
		
		
		for(int i=0;i<stack.size();i++) answer += stack.get(i);
			
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		
		System.out.print(T.solution(str));
	}
}
