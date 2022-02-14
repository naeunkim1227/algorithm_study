package S4_5;

import java.util.*;
//5.k번째 큰 수

/*
 	set을 이용함
 	TreeSet을 이용하면 중복을 제거하면서 정렬까지 한다.
 	
 	지원 메소드
 	TreeSet.add(); 추가
 	TreeSet.remove(); 삭제
 	TreeSet.size();  갯수
 	TreeSet.first(); 오름차순일경우 , 최소값 / 내림차순일경우,최대값
 	TreeSet.last(); 오름차순일경우, 최대값 / 내림차순일경우 ,최소값
 	
 	
 */
public class Main {
	 public int solution(int n ,int k,int arr[]) {
		 int answer = -1;
		 //Collections.reverseOrder()가 없으면 오름차순 정렬,있으면 내림차순 정렬
		 TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 for(int l=j+1;l<n;l++) {
					 Tset.add(arr[i] + arr[j] + arr[l]);
				 }
			 }
		 }
		 
		 int cnt = 0;
		 
		 for(int x : Tset) {
			 cnt++;
			 if(cnt ==k) return answer = x;
		 }
		 
		 return answer;
	 }
	 
	 public static void main(String[] args) {
		 Main T = new Main();
		 Scanner kb = new Scanner(System.in);
		 int n = kb.nextInt();
		 int k = kb.nextInt();
		 int[] arr = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i] = kb.nextInt();
		 }
		 
		 System.out.println(T.solution(n, k, arr));
	 }
}
