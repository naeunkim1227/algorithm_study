package S4_3;

import java.util.*;
//3.매출액의 종류


/*
 	lt, rt를 이용한다...
 	two pointer도 사용하고, sliding window도 사용한다...
 	arr -  입력값 배열
 	hm - sliding window
 	answer 배열에 출력값 추가
 	
 	네모로직을 생각해보자...
 	
 	
 	키값의 value가 0일때 꼭 remove해주자 size() 로 갯수를 세기때문이다
 	
 	lt -1 하고, rt +1 주가하고의 반복
 	lt값이 0이면 remove
 	
 */
public class Main {
	 public ArrayList<Integer> solution(int n ,int k,int arr[]) {
		ArrayList<Integer> answer = new ArrayList();
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
		
		//sliding window 세팅
		for(int i=0;i<k-1;i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		
		int lt = 0;
		for(int rt=k-1;rt<n;rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			//lt -1
			HM.put(arr[lt], HM.get(arr[lt])-1);
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
			lt++;
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
		 
		 
		 System.out.print(T.solution(n,k,arr));
		 
	 }
}
