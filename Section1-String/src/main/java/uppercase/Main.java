package uppercase;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String anwser = "";
	
		
		//Ǯ�� 1
		/*
		for(char t : str.toCharArray()) {
			if(Character.isLowerCase(t)) anwser+= Character.toUpperCase(t); 
			else anwser+=  Character.toLowerCase(t);
		}
		
		*/
		
		//Ǯ�� 2 �ƽ�Ű �ѹ��� ����� Ǯ��
		//�빮�ڴ� 65~90
		//�ҹ��ڴ� 97~122
		//32����
		
		for(char x : str.toCharArray()) {
			
			//�빮���� ���
			if(x>=65 && x<=90) anwser+=(char)(x+32);
			else anwser+=(char)(x-32);
			//cast ���ֱ�
			
		}
		
		
		return anwser;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
	
	
}
