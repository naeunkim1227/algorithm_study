package a;
import java.util.Scanner;
  
class Main {
	
	
	//���α׷��ӽ� ���..
	public int solution(String str,char t) {
		int anwser =0;
		
		//��ҹ��ڸ� �������� �ʴ´�.
		str = str.toUpperCase();
		t =Character.toUpperCase(t);
		
		/*
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == t) anwser++;
		}
		*/
		
		//���� for��
		//str�ϳ��ϳ��� �и��ؼ� �迭�� ����� �ֱ�
		for(char x : str.toCharArray()) {
			if(x==t) anwser++;
		}
		
		return anwser;
	}
	
	
	
	public static void main(String[] args) {
		
		//solution����Ϸ��� ������ solution�� �ν��Ͻ� �޼ҵ��̱� ������
		//static�̸� �Ʒ��� ���� ������ �ʿ� x
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		//char �ϳ� �������� �ϱ�
		char c = kb.next().charAt(0);
		
		

		System.out.print(T.solution(str, c));
	}
	
}