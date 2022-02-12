package S2_2;

import java.util.*;
//2.보이는 학생
public class Main {
	public int solution(int n,int[] arr) {
		int answer = 1 ,max= arr[0];
		
		/* 
		max를 만들어서 130으로 초기화 해놓기
		max보다 i가 크면 볼수 있다 answer++
		max에 i저장
		*/
		
		//두번째부터 비교 시작
		for(int i=1;i<n;i++) {
			if(max<arr[i]) {
				answer++;
				max = arr[i];
			}
		}
		
		
		
		return answer; 
	}
	
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n,arr));
	}
	
	
}
