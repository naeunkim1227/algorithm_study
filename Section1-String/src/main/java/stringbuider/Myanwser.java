package stringbuider;

import java.util.Scanner;

public class Myanwser {
	
	public String solution(String[] array) {
		String anwser = "";
		return anwser;
	}
	
	
	
	public static void main(String[] args) {
		Myanwser T = new Myanwser();
		Scanner kb =  new Scanner(System.in);
		char c = kb.next().charAt(0);
		
		String[] array = null;
		
		for(int i=0;i<c;i++) {
			String str =  kb.nextLine();
			
			array[i] += str;
			System.out.println(str);
			System.out.println(array);
		}
				
		//로직 접근 방법
		//반복문으로 c만큼 반복해서 배열에 담는다.
		//뒤집...는건 모르겠다
		
//		System.out.print(T.solution(array));
	}
	

}
