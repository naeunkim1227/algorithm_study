package S2_3;

import java.util.*;

//3.가위바위보
public class Myanswer {
	public String solution(int n,int[] arr,int[] arr2) {
		String answer = "";
		
		int min = 0;
		
		//2가 1을 이김
		//3이 2를 이김
		//1이 3을 이김
		
		
		/*
		 if A==B라서 draw인경우
		 else if a가 1일때 b가 3이면 이긴다
		 else if a=2 b=1
		 else if a=3 b=2
		 else 이외 나머지는 b가 이기는 경우
		 */
		
		for(int i=0;i<n;i++) {
			if(arr[i]==arr2[i]) {
				answer = "D";
			}else if(arr[i]==1 && arr2[i]==3) {
				answer = "A";
			}else if(arr[i]==2 && arr2[i]==1) {
				answer = "A";
			}else if(arr[i]==3 && arr2[i]==2) {
				answer = "A";
			}else {
				answer = "B";
			}
			
			
			
			
			
			
		}
		
		
		
		return answer; 
	}
	
	
	public static void main(String[] args) {
		Myanswer T = new Myanswer();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		
		
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			arr2[i] = kb.nextInt();
		}
		
		
		for(int i=0;i<n;i++) {
		System.out.println(T.solution(n,arr,arr2));
		}
		
	}
	
	
}
