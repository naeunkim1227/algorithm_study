package S4_2;

import java.util.*;
//2.아나그램(해쉬)
public class Main {
	/*
		첫번째 문자열을 먼저 map에 넣고
		두번째 문자열을 탐색한다, 같은 알파벳이 없으면 'NO'인데,
		있으면 값을 감소시킨다. 
		두번째 문자열에 특정 알파벳이 더 많을 경우 map에는 값이 0으로 됐을때도 생각해줘야함 (-1은 안되니까...)
		map의 value값이 모두 0이면 아나그램인것
	*/
	
	
	 public String solution(String s,String t) {
		 String answer = "YES";
		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 for(char x : s.toCharArray()) {
			 map.put(x, map.getOrDefault(x, 0)+1);
		 }

		 
		 for(char x : t.toCharArray()) {
			 
			 /*
			 길이가 같으므로, 다른 아나그램일경우 무조건 두번째 문자열이 진행중일시 map.get이 0이 되는 경우가 생김
			 
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
