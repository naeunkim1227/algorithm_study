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
				
		//���� ���� ���
		//�ݺ������� c��ŭ �ݺ��ؼ� �迭�� ��´�.
		//����...�°� �𸣰ڴ�
		
//		System.out.print(T.solution(array));
	}
	

}
