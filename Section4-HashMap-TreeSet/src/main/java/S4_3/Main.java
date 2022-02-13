package S4_3;

import java.util.*;
//3.������� ����


/*
 	lt, rt�� �̿��Ѵ�...
 	two pointer�� ����ϰ�, sliding window�� ����Ѵ�...
 	arr -  �Է°� �迭
 	hm - sliding window
 	answer �迭�� ��°� �߰�
 	
 	�׸������ �����غ���...
 	
 	
 	Ű���� value�� 0�϶� �� remove������ size() �� ������ ���⶧���̴�
 	
 	lt -1 �ϰ�, rt +1 �ְ��ϰ��� �ݺ�
 	lt���� 0�̸� remove
 	
 */
public class Main {
	 public ArrayList<Integer> solution(int n ,int k,int arr[]) {
		ArrayList<Integer> answer = new ArrayList();
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
		
		//sliding window ����
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
