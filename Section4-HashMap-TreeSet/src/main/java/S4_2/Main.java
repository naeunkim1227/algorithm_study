package S4_2;

import java.util.*;
//2.�Ƴ��׷�(�ؽ�)
public class Main {
	/*
		ù��° ���ڿ��� ���� map�� �ְ�
		�ι�° ���ڿ��� Ž���Ѵ�, ���� ���ĺ��� ������ 'NO'�ε�,
		������ ���� ���ҽ�Ų��. 
		�ι�° ���ڿ��� Ư�� ���ĺ��� �� ���� ��� map���� ���� 0���� �������� ����������� (-1�� �ȵǴϱ�...)
		map�� value���� ��� 0�̸� �Ƴ��׷��ΰ�
	*/
	
	
	 public String solution(String s,String t) {
		 String answer = "YES";
		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 for(char x : s.toCharArray()) {
			 map.put(x, map.getOrDefault(x, 0)+1);
		 }

		 
		 for(char x : t.toCharArray()) {
			 
			 /*
			 ���̰� �����Ƿ�, �ٸ� �Ƴ��׷��ϰ�� ������ �ι�° ���ڿ��� �������Ͻ� map.get�� 0�� �Ǵ� ��찡 ����
			 
			 */
			 if(!map.containsKey(x) || map.get(x) ==0) return "NO";
			 map.put(x, map.get(x)-1);
		 }
		 
		 
		 return answer;
	 }
	 
	 public static void main(String[] args) {
		 Main T = new Main();
		 Scanner kb = new Scanner(System.in);
		 String s = kb.next();
		 String t = kb.next();
		 
		 
		 System.out.print(T.solution(s,t));
		 
	 }
}
