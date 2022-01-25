package uppercase;

import java.util.Scanner;

public class Myanwser {
	
	public String solution(String str) {
		
		//null이 아니라 "" 값으로 anwser += 해서 추가할수 있도록 하자
		String anwser = null;
		
		System.out.println(str);
		
		//isLowerCase를 사용하자.
		
		for(char t : str.toCharArray()) {
			if(t == Character.toUpperCase(t)) {
				Character.toLowerCase(t);
				
			}else { Character.toUpperCase(t);}
			
			anwser = str;
		}
		
		
		return anwser;
	}
	
	
	public static void main(String[] args) {
		Myanwser T = new Myanwser();

		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		
		
		System.out.print(T.solution(str));
	}
	
	
}
