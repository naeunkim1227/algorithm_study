package S1_11;

import java.util.Scanner;
/*
  11.문자열 압축
  
  s배열에 문자를 넣는다. 끝에 빈 문자열도 추가해 놓는다(예외 오류 방지)
  cnt = 1로 초기화
  
  i와 i+1을 비교해서 같으면 1증가
  같지 않으면 answer에 i 문자 누적, cnt도 누적
  
  cnt는 다시 1로 초기화
  cnt가 1이면 cnt 누적x
  
  
  
  
 
 */
public class Main {
	public String solution(String s) {
		String answer = "";
		
		s = s+ "";
		int cnt = 1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)== s.charAt(i+1)) cnt++;
			else { 
				answer +=s.charAt(i);
				if(cnt>1) answer+= String.valueOf(cnt);
				cnt=1;
				
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
