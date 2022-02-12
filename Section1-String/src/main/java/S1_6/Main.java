package S1_6;

import java.util.Scanner;
//6.중복문자제거

public class Main {

	public String solution(String str) {
		String answer = "";
		
		for(int i=0;i<str.length();i++) {
			
			//먼저 나온 같은 문자를 출력한다
			//System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
		
			if(str.indexOf(str.charAt(i)) == i) {
			 answer += str.charAt(i);
					 
			}
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
