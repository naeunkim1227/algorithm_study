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

public class Main {
	
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		
		for(int i=3;i<n;i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		
		return dy[n];
	}
	
	public static void main(String[] args) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	
	int n = kb.nextInt();
	dy = new int[n+1];
	System.out.print(T.solution(n));

	}
	
	
}