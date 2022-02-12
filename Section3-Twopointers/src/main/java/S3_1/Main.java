package S3_1;

import java.util.*;
//1.�� �迭 ��ġ��
public class Main {
	/*
	 
	 o(nlogn)����� �ƴ� o(n)���� ���ƾ��Ѵ�... 
	 
	 a�迭�� �� �ְ� p1������
	 b�迭�� �� �ִ´� p2������
	 
	 a[p1] b[p2]�� ���Ͽ� 
	 answer array�� �߰��Ѵ�
	 p1�� ũ��
	 p1���� �ٽ� ��
	 
	 p1�� n���� �۾ƾ��ϰ�
	 p2�� m���� �۾ƾ��Ѵ�.
	 
	 ���� a�迭�� ������ b�迭�� ���� ���Ҵٸ� 
	 ������� answer�迭�� �߰����ָ� �ȴ�.
	 
	 */
	
	public ArrayList<Integer> solution(int n,int m,int[] a,int[] b) {
		ArrayList<Integer> answer = new ArrayList();
		int p1 = 0,p2 = 0;
		
		while(p1<n && p2<m) {
			
			//p1�� ���� ���� �ְ�, p1�� �����ϰ� �ȴ�.
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
