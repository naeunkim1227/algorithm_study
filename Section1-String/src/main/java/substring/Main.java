package substring;

import java.util.Scanner;
//����Ӵܾ�
class Main {

	public String solution(String str) {
		String anwser = "";
		//���� ���� ������ �ʱ�ȭ�Ѵ�.
		int m = Integer.MIN_VALUE,pos;

		//Ǯ��1
		
		/*
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len> m) {
				m=len;
				anwser=x;
			}
		}
		*/
		
		//Ǯ��2 indexOf, subString
		while((pos=str.indexOf(" "))!=-1) {
			//������ �߰߸��ϸ� -1�� ���� 
			String tmp  = str.substring(0,pos);
			int len  = tmp.length();
			
			//>=�� �ϸ� ���ʿ��� ���� ���� ������ ���ڷ� ��ü�Ǳ� ������ >�� �ؾ��Ѵ�.
			if(len>m) {
				m=len;
				anwser=tmp;
			}
			
			//���� �κ� �߶󳻱�
			str = str.substring(pos+1);
		
		}
		
		//������ �ܾ� �˻��������
		if(str.length()>m) anwser = str;
		
		
		return anwser;
		
		
	}
	
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		//������ �Է� �޾ƾ� �ϹǷ� nextline���� �޴´�.
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
