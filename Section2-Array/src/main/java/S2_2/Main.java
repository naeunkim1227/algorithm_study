package S2_2;

import java.util.*;
//2.���̴� �л�
public class Main {
	public int solution(int n,int[] arr) {
		int answer = 1 ,max= arr[0];
		
		/* 
		max�� ���� 130���� �ʱ�ȭ �س���
		max���� i�� ũ�� ���� �ִ� answer++
		max�� i����
		*/
		
		//�ι�°���� �� ����
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
