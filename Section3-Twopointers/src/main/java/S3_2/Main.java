package S3_2;


import java.util.*;


//2.공통원소 구하기
public class Main {
	/*
	교집합 구하기
	
	
	a[p1] < b[p2] 이면 a[p1++]
	이 조건을 먼저 걸어야 함
	
	a[p1] == b[p2]면 동시에 증가 시키기
	
	아무 쪽이나 하나가 끝나면 공통원소가 없는것임
	
	*/
	public ArrayList<Integer> solution(int m, int n,int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1= 0, p2 = 0;
		
		
		while(p1<m && p2<n) {
			if(a[p1]==b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;
		}
		
		
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
