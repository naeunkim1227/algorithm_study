package S2_5;

import java.util.*;

//5.�Ҽ�(�����佺�׳׽� ü)
public class Main {
	public int solution(int n) {
		int answer = 0;
		//�������� ����
		
		/*
		 �����佺�׳׽�ü
		 2�ǹ������ ��� üũ == �Ҽ��� �ƴ�
		 
		 ch�迭�� ����µ� n+1������ ������ n���� �ٵ���...
		 0�� 1�� ����
		 ch[i] == 0�̸� �Ҽ��ΰɷ� �ϰ� ������ �����̴�.
		 i�� ����� �Ҽ��� �ƴϴ� 1�� �ٲ۴�.
		 
		 */
		
		int[] ch = new int[n+1];
		
		for(int i=2;i<n;i++) {
			if(ch[i] == 0) {
				answer++;
				
				//i�� ����� ã�ƾ��ؼ� j+i
				for(int j=i;j<=n;j=j+i) ch[j] =1;
				
			}

		}
	
		return answer; 
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
	
	
}
