package S10_1;
/*1.계단 오르기
	
	다이나믹을 사용해서 문제를 해결한다.
	아주 큰 문제를 작은 문제로 축소시켜서 해결하는 방법 (단,문제의 본질은 해치지 말것)

	계단개수
	1개면 방법 1개
	2개면 방법 2개
	3개면 111/21/12 3개
	4개 5
	5개 11111/1112/1121/1211/2111/122/212/221 8
	
	dy[i]로 1차원 배열을 생성해야한다.
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
