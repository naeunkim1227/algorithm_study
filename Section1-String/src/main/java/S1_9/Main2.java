package S1_9;

import java.util.*;
//9.���ڸ� ����
public class Main2 {
	public int solution(String s) {
		String answer = "";
		
		for(char x : s.toCharArray()) {
			//isDigit ��������, ������ ��ȯ
			if(Character.isDigit(x)) {
				answer+= x;
			}
		}
		
		//�տ� 0�������� ��쵵 �����ֳ�...
		
		return Integer.parseInt(answer);
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
