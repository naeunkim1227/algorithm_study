package S4_1;

import java.util.*;
//4.�б�ȸ��

public class Main {
	/*
		HashMap
		�ؽ����� ����� ���� abc�� ī���� �Ѵ�.
		
			 map.containsKey('A') �ش� Ű�� �ִ��� ����� �޼ҵ�,
			 true or false�� �����Ѵ�
			 
			 
			 
			 
		
		
	
	*/
	public char solution(int n,String s) {
		 char answer = 0;
		 HashMap<Character, Integer> map = new HashMap();
		 for(char x: s.toCharArray()) {
			 //map.get(x)�� Ű���� �������� x�� ���� ���ٸ� 0 �� �����Ѵ�.
			 map.put(x, map.getOrDefault(x,0)+1);
			 
			 
			 /*
			 map.size() key�� ������ �˷��ش�.
			 map.remove('A') Ư�� key����
			 
			 
			  */
		 }
		 
		//�����ϴ� Ű���� ��� ����Ѵ�. 
		 
		 int max = Integer.MIN_VALUE;
		 for(char key: map.keySet()){
			 
			 if(map.get(key)>max) {
				 max=map.get(key);
				 answer=key;
			 }
		}
		 
		 
		 return answer;
	 }
	 
	 public static void main(String[] args) {
		 Main T = new Main();
		 Scanner kb = new Scanner(System.in);
		 int n = kb.nextInt();
		 String str = kb.next();
		 System.out.print(T.solution(n,str));
		 
	 }
}
