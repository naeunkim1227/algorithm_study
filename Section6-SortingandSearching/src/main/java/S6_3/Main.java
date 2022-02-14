package S6_3;

import java.util.*;

/*
	3.삽입정렬
	이중포문 사용
	
	i는 1부터 돈다
	j는 i-1지점부터 j>=0 ; j--로 도는데
	tmp는 arr[i] 값
	arr[j]가 tmp보다 크면 j값을 뒤로 민다.
	arr[j+1] = arr[j]
	


*/
public class Main {
 public int[] solution(int n,int[] arr) {
	
	 for(int i=1;i<n;i++) {
		 int tmp = arr[i];
		 int j;
		 for(j=i-1;j>=0;j--) {
			 if(arr[j]>tmp) arr[j+1] = arr[j];
			 else break;
		 }
		 arr[j+1] = tmp;
		 
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
