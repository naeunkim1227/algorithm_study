package S1_9;

import java.util.Scanner;
//9.���ڸ� ����
public class Main {
	public int solution(String s) {
		int answer = 0;
		
		/*
		�տ� 0�� ������� ����
		char�������� �ϳ��� �����ͼ� �дµ�,x>= 48 && x<=57 �̸� (�ƽ�Ű �ڵ�� 0~9)
		���ڶ�� ����
		answer = answer*10 + (x-48) ���� ���ڸ��� 0�� �����ϰ�,
		���� ���ڵ��� ����? �÷��ֱ� ���� ��
		*/
		
		for(char x:s.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10 + (x-48);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
