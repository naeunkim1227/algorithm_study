package S1_7;

import java.util.Scanner;

//7.회문 문자열
public class Myanswer {

	public String solution(String str) {
		String anwser = "";
		
		String tmp = str.toUpperCase();
		
		String tmp2 = new StringBuilder(tmp).reverse().toString();
		
		if(tmp.equals(tmp2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
			
		}
		
		
		return anwser;
	}
	
	public static void main(String[] args) {
		Myanswer T  = new Myanswer();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
	
	
}
