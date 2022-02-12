package S1_7;

import java.util.Scanner;

//7.회문 문자열
public class Main {

	public String solution(String str) {
		String anwser = "YES";
		// 문자열/2 만큼 돈다
		str = str.toUpperCase();
		
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			
			//str.charAt 첫 글자 // str.chatAt(len-i-) 뒷 글자 비교한다.
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
