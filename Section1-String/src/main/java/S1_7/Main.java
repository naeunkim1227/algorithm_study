package S1_7;

import java.util.Scanner;

//7.ȸ�� ���ڿ�
public class Main {

	public String solution(String str) {
		String anwser = "YES";
		// ���ڿ�/2 ��ŭ ����
		str = str.toUpperCase();
		
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			
			//str.charAt ù ���� // str.chatAt(len-i-) �� ���� ���Ѵ�.
			if(str.charAt(i) != str.charAt(len-i-1)) anwser = "NO";
		}
		
		return anwser;
	}
	
	public static void main(String[] args) {
		Main T  = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	
}
