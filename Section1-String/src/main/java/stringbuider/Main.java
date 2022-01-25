package stringbuider;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public ArrayList<String> solution(int n,String[] str) {
		ArrayList<String> anwser = new ArrayList<String>();
		
		for(String x : str) {
			//�ܾ ������
			String tmp = new StringBuilder(x).reverse().toString();
			anwser.add(tmp);
		}
		
		return anwser;
	}
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb =  new Scanner(System.in);
		int n = kb.nextInt();
		
		//���ڸ�ŭ�� �迭�� ����� �ش�.
		String[] str = new String[n];
		
		
		//�ݺ����� ���� �迭�ȿ� �ܾ �־���
		for(int i=0;i<n;i++) {
			str[i] = kb.next();
		}
		
		for(String x : T.solution(n,str)) {
			System.out.println(x);
		}
		
		}
	
	}
	

