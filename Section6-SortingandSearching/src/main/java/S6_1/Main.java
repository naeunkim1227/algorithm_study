package S6_1;

import java.util.*;

/* 1.선택정렬
 
 	이중포문 사용
 	0일때 1부터 돌기
	i가 n일때, j는 +1하여 n+1부터 쭉 돈다
	
	제일 작은 숫자를 찾기위해
	idx라는 임의의 변수 설정
	
	처음에는 i의 위치를 idx값에 넣는다.
	for로 반복해서 가장 작은값을 idx에넣는다.
	arr[i] 와 arr[idx]의 값을 교환한다.
	
	i를 증가 시키고 다시 j는 반복

*/
public class Main {
 public int[] solution(int n,int[] arr) {
	//마지막번째 까지 갈 필요가 없다.
	 for(int i=0;i<n-1;i++) {
		int idx = i; 
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[idx]) idx=j;
		}
		int tmp = arr[i];
		arr[i]=arr[idx];
		arr[idx] = tmp;
		
	}
	
	return arr;
 }
	 
 public static void main(String[] args) {
	 Main T = new Main();
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 int[] arr = new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i] = kb.nextInt();
	 }
	 
	 for(int x :  T.solution(n,arr)) System.out.print(x +" ");
	 
	
 
 }
}
