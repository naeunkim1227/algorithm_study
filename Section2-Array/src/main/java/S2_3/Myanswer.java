package S2_3;

import java.util.*;

//3.����������
public class Myanswer {
	public String solution(int n,int[] arr,int[] arr2) {
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
