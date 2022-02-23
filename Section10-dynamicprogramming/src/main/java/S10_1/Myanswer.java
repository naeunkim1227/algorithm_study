package S10_1;
/*1.��� ������
	
	���̳����� ����ؼ� ������ �ذ��Ѵ�.
	���� ū ������ ���� ������ ��ҽ��Ѽ� �ذ��ϴ� ��� (��,������ ������ ��ġ�� ����)

	��ܰ���
	1���� ��� 1��
	2���� ��� 2��
	3���� 111/21/12 3��
	4�� 5
	5�� 11111/1112/1121/1211/2111/122/212/221 8
	
	
	
	dy[i]�� 1���� �迭�� �����ؾ��Ѵ�.
	dy[1] = 1 
	dy[2] = 2
	dy[3] = 3
	dy[4] = 5
*/

import java.util.*;

public class Myanswer {
	
	public int solution(int n,int[] dy) {
		int answer = 0;
		
		dy[0] = 1;
		dy[1] = 2;
		for(int i=2;i<n;i++) {
			 dy[i] = dy[i-1] + dy[i-2];
			
			if(dy[i] == dy[n-1]) return answer = dy[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Myanswer T = new Myanswer();
	Scanner kb = new Scanner(System.in);
	
	int n = kb.nextInt();
	int[] dy = new int[n];
	System.out.print(T.solution(n, dy));

	}
	
	
}
