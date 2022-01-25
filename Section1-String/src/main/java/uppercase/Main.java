package uppercase;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String anwser = "";
	
		
		//풀이 1
		/*
		for(char t : str.toCharArray()) {
			if(Character.isLowerCase(t)) anwser+= Character.toUpperCase(t); 
			else anwser+=  Character.toLowerCase(t);
		}
		
		*/
		
		//풀이 2 아스키 넘버를 사용한 풀이
		//대문자는 65~90
		//소문자는 97~122
		//32차이
		
		for(char x : str.toCharArray()) {
			
			//대문자의 경우
			if(x>=65 && x<=90) anwser+=(char)(x+32);
			else anwser+=(char)(x-32);
			//cast 해주기
			
		}
		
		
		return anwser;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
	
	
}
