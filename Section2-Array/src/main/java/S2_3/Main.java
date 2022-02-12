package S2_3;

import java.util.*;

//3.가위바위보
public class Main {
	public String solution(int n,int[] a,int[] b) {
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
			if(a[i]==b[i]) {
				answer+= "D";
			}else if(a[i]==1 && b[i]==3) {
				answer+= "A";
			}else if(a[i]==2 && b[i]==1) {
				answer+= "A";
			}else if(a[i]==3 && b[i]==2) {
				answer+= "A";
			}else {
				answer+= "B";
			}
			
			
			
			
			
			
		}
		
		
		
		return answer; 
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		
		for(int i=0;i<n;i++) {
			a[i] = kb.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			b[i] = kb.nextInt();
		}
		
		
		for(char x : T.solution(n,a,b).toCharArray()) System.out.println(x);
		
	}
	
	
}
