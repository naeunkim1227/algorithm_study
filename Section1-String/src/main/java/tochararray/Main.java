package tochararray;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		String anwser = "";
		
		//�빮�ڴ� 65~90
		//�ҹ��ڴ� 97~122
		//32����
		int n  = str.length();
		
		char[] array = new char[n];
		
		for(char x : str.toCharArray()) {
			if(x>=65 && x<=122) {
				System.out.println(x);
				
				
			}
		}
		
		
		return anwser;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		
		System.out.println(T.solution(str));
	}
	
	
}
