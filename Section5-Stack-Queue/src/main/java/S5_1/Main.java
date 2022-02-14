package S5_1;

import java.util.*;
//1.�ùٸ� ��ȣ
/*
	stack last-in-first-out
	queue first-in-first-out
	
	
	���� ��ȣ�� stack�� �ֱ� push
	�ݴ� ��ȣ�� ������ > ���� �������� ���� ��ȣ�� ¦�̴�. pop���� ������
	
	������ ��� �ִµ�,�ݴ� ��ȣ�� ������? > �߸��� ��ȣ��
	stack.isEmpty()�� ��,���� Ȯ��
	
	���� ��ȣ�� �� ���� ���,stack�� ���´�.
	stack�� ���������� ���� ��ȣ�� ����.


*/
public class Main {
	public String solution(String str){
		String answer = "YES";
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				//�ݴ� ��ȣ�� ���� ��Ȳ
				if(stack.isEmpty()) answer = "NO";
					stack.pop();
			}
		}
		//���°�ȣ�� ���� ��Ȳ 
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
