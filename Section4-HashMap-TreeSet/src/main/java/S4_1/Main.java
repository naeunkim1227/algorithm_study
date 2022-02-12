package S4_1;

import java.util.*;
//4.학급회장

public class Main {
	/*
		HashMap
		해쉬맵을 사용해 각각 abc를 카운팅 한다.
		
			 map.containsKey('A') 해당 키가 있는지 물어보는 메소드,
			 true or false를 리턴한다
			 
			 
			 
			 
		
		
	
	*/
	public char solution(int n,String s) {
		 char answer = 0;
		 HashMap<Character, Integer> map = new HashMap();
		 for(char x: s.toCharArray()) {
			 //map.get(x)의 키값을 가져오되 x의 값이 없다면 0 을 리턴한다.
			 map.put(x, map.getOrDefault(x,0)+1);
			 
			 
			 /*
			 map.size() key의 갯수를 알려준다.
			 map.remove('A') 특정 key삭제
			 
			 
			  */
		 }
		 
		//존재하는 키들을 모두 출력한다. 
		 
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
