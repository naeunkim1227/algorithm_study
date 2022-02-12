package S1_9;

import java.util.Scanner;
//9.숫자만 추출
public class Main {
	public int solution(String s) {
		int answer = 0;
		
		/*
		앞에 0이 있을경우 무시
		char형식으로 하나씩 가져와서 읽는데,x>= 48 && x<=57 이면 (아스키 코드로 0~9)
		숫자라는 것임
		answer = answer*10 + (x-48) 식은 앞자리의 0을 제거하고,
		앞의 숫자들을 위로? 올려주기 위한 식
		*/
		
		for(char x:s.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10 + (x-48);
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
