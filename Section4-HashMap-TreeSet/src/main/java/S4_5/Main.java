package S4_5;

import java.util.*;
//5.k��° ū ��

/*
 	set�� �̿���
 	TreeSet�� �̿��ϸ� �ߺ��� �����ϸ鼭 ���ı��� �Ѵ�.
 	
 	���� �޼ҵ�
 	TreeSet.add(); �߰�
 	TreeSet.remove(); ����
 	TreeSet.size();  ����
 	TreeSet.first(); ���������ϰ�� , �ּҰ� / ���������ϰ��,�ִ밪
 	TreeSet.last(); ���������ϰ��, �ִ밪 / ���������ϰ�� ,�ּҰ�
 	
 	
 */
public class Main {
	 public int solution(int n ,int k,int arr[]) {
		 int answer = -1;
		 //Collections.reverseOrder()�� ������ �������� ����,������ �������� ����
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
