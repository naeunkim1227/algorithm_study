package S1_8;

import java.util.Scanner;

//8.�Ӹ����(replaceAll)
public class Main {

	public String solution(String str) {
		String answer = "YES";
		
		//[^A-Z] �빮�� A���� Z������ �ƴϸ�
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(!str.equals(tmp)) answer="NO";
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
	
}
