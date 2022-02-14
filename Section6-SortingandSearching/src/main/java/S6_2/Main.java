package S6_2;

import java.util.*;

/* 2.버블 정렬
 	
 	오름차순일경우
 	
 	0과 1비교해서 값 바꾸기
 	
 	i랑 i+1이랑 하나씩 비교해서 위치 조정 한바퀴 돌면 최대값이 정해진다.
 	두번째 턴에서 최대값-1값 결정
 	
*/
public class Main {
 public int[] solution(int n,int[] arr) {
	 
	 for(int i=0;i<n-1;i++) {
		 for(int j=0;j<n-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 int tmp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = tmp;
			 }
		 }
	 }
	
	

	return arr;
 }
	 
 public static void main(String[] args) {
	 Main T = new Main();
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 int[] arr = new int[n];
	 for(int i=0;i<n;i++) arr[i] = kb.nextInt();
	 for(int x :  T.solution(n,arr)) System.out.print(x +" ");
 
 }
}
