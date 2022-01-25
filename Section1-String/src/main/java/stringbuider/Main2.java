package stringbuider;

import java.util.ArrayList;
import java.util.Scanner;


//�ܾ� �ȿ��� Ư�� ���ڸ� �ٲٶ�� ���� ���

public class Main2 {
	
	public ArrayList<String> solution(int n,String[] str) {
		ArrayList<String> anwser = new ArrayList<String>();
	
		for(String x: str) {
			//�迭�� �ٽ� ����..
			char[] s = x.toCharArray();
			
			//ù��° �迭���� lt
			//������ �迭���� rt��� �����Ѵ�
			//x.length - 1 = rt�� �ȴ�. 
			//lt�� rt�� �ٲ۴�.
			
			//lt�� +1 rt�� -1�� �ǰ� �ٽ� ��ȯ
			//���̰� Ȧ���϶� lt�� rt�� ��������. (�ٲܰ��̾�������.)
			//while������ �ݺ��ϸ�ȴ�.
			//���̰� ¦���϶�
			//lt�� rt���� Ŀ���� ���߸� �ȴ�
			
			int lt = 0;
			int rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				
				lt++;
				rt--;
			}
			//char�迭�� String ȭ �����ش�.
			String tmp = String.valueOf(s);
			anwser.add(tmp);
		}
		return anwser;
	}
	
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
	

