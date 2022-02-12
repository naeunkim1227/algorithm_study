package S3_1;

import java.util.*;
//1.두 배열 합치기
public class Main {
	/*
	 
	 o(nlogn)방식이 아닌 o(n)번만 돌아야한다... 
	 
	 a배열에 값 넣고 p1포인터
	 b배열에 값 넣는다 p2포인터
	 
	 a[p1] b[p2]를 비교하여 
	 answer array에 추가한다
	 p1이 크면
	 p1증가 다시 비교
	 
	 p1은 n보다 작아야하고
	 p2는 m보다 작아야한다.
	 
	 만약 a배열이 끝나고 b배열에 값이 남았다면 
	 순서대로 answer배열에 추가해주면 된다.
	 
	 */
	
	public ArrayList<Integer> solution(int n,int m,int[] a,int[] b) {
		ArrayList<Integer> answer = new ArrayList();
		int p1 = 0,p2 = 0;
		
		while(p1<n && p2<m) {
			
			//p1의 값을 집어 넣고, p1이 증가하게 된다.
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}
		
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
	
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n,m,a,b)) System.out.print(x + " ");
		
	}

}
