package S2_5;

import java.util.*;

//5.소수(에라토스테네스 체)
public class Main {
	public int solution(int n) {
		int answer = 0;
		//이중포문 금지
		
		/*
		 에라토스테네스체
		 2의배수들을 모두 체크 == 소수가 아님
		 
		 ch배열을 만드는데 n+1번까지 만들어야 n개가 다들어간다...
		 0과 1은 제외
		 ch[i] == 0이면 소수인걸로 하고 갯수를 셀것이다.
		 i의 배수면 소수가 아니니 1로 바꾼다.
		 
		 */
		
		int[] ch = new int[n+1];
		
		for(int i=2;i<n;i++) {
			if(ch[i] == 0) {
				answer++;
				
				//i의 배수를 찾아야해서 j+i
				for(int j=i;j<=n;j=j+i) ch[j] =1;
				
			}

		}
	
		return answer; 
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
	
	
}
