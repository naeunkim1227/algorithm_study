package S1_7;

import java.util.Scanner;

//7.ȸ�� ���ڿ�
public class Main2 {

	public String solution(String str) {
		String answer = "YES";
	
		String tmp = new StringBuilder(str).reverse().toString();
		
		//equals�� ��ҹ��ڸ� ���Ѵ�.
		//equalsIgnoreCase�� ��ҹ��� ������ �����Ѵ�
		if(!str.equalsIgnoreCase(tmp)) answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T  = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	
}
