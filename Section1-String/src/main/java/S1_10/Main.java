package S1_10;

import java.util.Scanner;

public class Main {
	/*
	 10.���ڰŸ�
	 
	 s�迭�� ���ڿ��� ���
	 answer�迭�� target���ڿ� ������ �Ÿ��� ��´�.
	 
	 ���ʿ� �ִ� t���ڷκ����� �Ÿ��� ���ϸ� �ȴ�.
	 
	 �Ÿ� p
	 p�� 1000���� ���� �����Ѵ�.
	 
	 ó���� t���ڰ� �ƴϸ� 1���� 
	 t���ڸ� ������ p�� 0���� ���ϰ�
	 t���ڰ� �ƴϸ� 1�� ����
	 
	 ���ʿ��� ���������� �ѹ� ���� for�� i++
	  
	  
	 �����ʿ��� �������� �ѹ� �� ���� for�� i--
	  
	  ������ �ִ� �迭�� ���� ���ؼ� ���� ������ ��ü�ϱ�
	 
	 */
	public int[] solution(String s,char t) {
		int[] answer = new int[s.length()]; 
		
		int p = 1000;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== t) {
				p =0;
				answer[i] = p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		
		p = 1000;
		for(int j=s.length()-1;j>=0;j--) {
			if(s.charAt(j)==t) p=0;
			else {
				p++;
				answer[j] = Math.min(answer[j], p);
			}
		}
		
		
		return answer;
	}

	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		for(int x : T.solution(str,c)) {
			System.out.print(x + " ");
		}
		
		
	}
}
