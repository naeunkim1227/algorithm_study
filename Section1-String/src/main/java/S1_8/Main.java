package S1_8;

import java.util.Scanner;

//8.팰린드롬(replaceAll)
public class Main {

	public String solution(String str) {
		String answer = "YES";
		
		//[^A-Z] 대문자 A부터 Z까지가 아니면
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
