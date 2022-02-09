package tochararray;

import java.util.Scanner;
//5.특정문자뒤집기
public class Main {

	public String solution(String str) {
		String answer = "";
		
		//lt,rt 이용하기가 point
		
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;
		
		while(lt<rt) {
			//특수문자일때
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				//모두 알파벳일때
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(s);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	
}
