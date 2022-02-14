package S5_2;

import java.util.*;
//2.��ȣ��������
/*
  	
	���� ��ȣ�� push
	���ĺ� push
	�ݴ� ��ȣ�� ��������, ���� ��ȣ ������ ���� pop	> �ݺ�
	
	stack���� �ڷᰡ ������ 
	stack.size ��ŭ �ݺ������� �ؼ� ����ϱ�

*/
public class Main {
	public String solution(String str){
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
	
		for(char x : str.toCharArray()) {
			if(x == ')') {
				//stack.pop�� ���� ���� ���� �޴´�. ���� '('���� ��ȣ�� ���ö����� pop�ϸ�ȴ�.
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
