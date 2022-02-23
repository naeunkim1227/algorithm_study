package S10_5;
/*5.������ȯ (�����˰���)
	dy�迭����
	dy[0] �� 0���� �ʱ�ȭ
	
	
	
	coin[]�迭�� 1 2 5  �� �ִ´�
	
	dy[i] i�ݾ��� ����µ� ��� �ּ� ���� ����
	
	i=1�϶� (=1���϶�)
	1�� 1
	2�� 2
	3�� 3
	4�� 4
	5�� 5
	6�� 6
	7�� 7
	8�� 8
	
	
	
	dy[j-coin[i]] + 1 
	coin[i] ������,j�����̹Ƿ� ������ ���� +1(���)
	
	
	
	i+1 (=2���϶�, �迭 2��°���� ����)
	1�� 0
	2�� 1 
	3�� 2 
	4�� 2
	5�� 3
	6�� 3
	7�� 4
	8�� 4
	
	
	i���� (=5���϶�)
	5�� 1
	6�� 2	
	7�� 2
	8�� 3
	
*/

import java.util.*;

public class Main {
	static int n,m;
	static int[] dy;
	
	public int solution(int[] coin) {
		//dy��� �迭�� ���� ū���� �ʱ�ȭ�س���
		Arrays.fill(dy, Integer.MAX_VALUE);
		
		dy[0] = 0;
		for(int i=0;i<n;i++) {
			for(int j=coin[i];j<=m;j++) {
				dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
			}
		}
		
		return dy[m];
	}
	
	
	public static void main(String[] args) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	//���� ����
	n = kb.nextInt();
	
	//���������� ���� �迭
	int[] arr = new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i] = kb.nextInt();
	}
	m=kb.nextInt();
	dy= new int[m+1];
	System.out.println(T.solution(arr));


	}
	
	
}
