package S10_5;
/*5.동전교환 (냅색알고리즘)
	dy배열생성
	dy[0] 만 0으로 초기화
	
	
	
	coin[]배열에 1 2 5  를 넣는다
	
	dy[i] i금액을 만드는데 드는 최소 동전 갯수
	
	i=1일때 (=1원일때)
	1원 1
	2원 2
	3원 3
	4원 4
	5원 5
	6원 6
	7원 7
	8원 8
	
	
	
	dy[j-coin[i]] + 1 
	coin[i] 원단위,j가원이므로 갯수를 빼고 +1(방법)
	
	
	
	i+1 (=2원일때, 배열 2번째부터 시작)
	1원 0
	2원 1 
	3원 2 
	4원 2
	5원 3
	6원 3
	7원 4
	8원 4
	
	
	i증가 (=5원일때)
	5원 1
	6원 2	
	7원 2
	8원 3
	
*/

import java.util.*;

public class Main {
	static int n,m;
	static int[] dy;
	
	public int solution(int[] coin) {
		//dy라는 배열을 가장 큰수로 초기화해놓음
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
	//동전 갯수
	n = kb.nextInt();
	
	//동전종류를 담은 배열
	int[] arr = new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i] = kb.nextInt();
	}
	m=kb.nextInt();
	dy= new int[m+1];
	System.out.println(T.solution(arr));


	}
	
	
}
