package S2_3;

import java.util.*;

//3.����������
public class Main {
	public String solution(int n,int[] a,int[] b) {
		String answer = "";
		
		int min = 0;
		
		//2�� 1�� �̱�
		//3�� 2�� �̱�
		//1�� 3�� �̱�
		
		
		/*
		 if A==B�� draw�ΰ��
		 else if a�� 1�϶� b�� 3�̸� �̱��
		 else if a=2 b=1
		 else if a=3 b=2
		 else �̿� �������� b�� �̱�� ���
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
