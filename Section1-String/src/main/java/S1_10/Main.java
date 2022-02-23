package S1_10;

import java.util.Scanner;

public class Main {
	/*
	 10.문자거리
	 
	 s배열에 문자열을 담고
	 answer배열에 target문자와 떨어진 거리를 담는다.
	 
	 왼쪽에 있는 t문자로부터의 거리를 구하면 된다.
	 
	 거리 p
	 p를 1000으로 임의 지정한다.
	 
	 처음에 t문자가 아니면 1증가 
	 t문자를 만나면 p를 0으로 정하고
	 t문자가 아니면 1을 증가
	 
	 왼쪽에서 오른쪽으로 한번 돌기 for문 i++
	  
	  
	 오른쪽에서 왼쪽으로 한번 더 돈다 for문 i--
	  
	  기존에 있는 배열의 값을 비교해서 작은 값으로 교체하기
	 
	 */
	public int[] solution(String s,char t) {
		int[] answer = new int[s.length()]; 
		
		int p = 1000;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== t) {
				p =0;
				answer[i] = p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		
		p = 1000;
		for(int j=s.length()-1;j>=0;j--) {
			if(s.charAt(j)==t) p=0;
			else {
				p++;
				answer[j] = Math.min(answer[j], p);
			}
		}
		
		
		return answer;
	}

	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		for(int x : T.solution(str,c)) {
			System.out.print(x + " ");
		}
		
		
	}
}
