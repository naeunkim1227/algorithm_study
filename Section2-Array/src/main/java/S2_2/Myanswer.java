package S2_2;

import java.util.*;
//2.보이는 학생
public class Myanswer {
	public int solution(int n,int[] arr) {
		int answer = 0;
		answer++;
		int max = arr[0];
		
		/* 
		max를 만들어서 130으로 초기화 해놓기
		max보다 i가 크면 볼수 있다 answer++
		max에 i저장
		*/
		
		
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				answer++;
				max = arr[i];
			}
		}
		
		
		
		return answer; 
	}
	
	
	public static void main(String[] args) {
		
		Myanswer T = new Myanswer();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n,arr));
	}
	
	
}
