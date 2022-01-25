package stringbuider;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public ArrayList<String> solution(int n,String[] str) {
		ArrayList<String> anwser = new ArrayList<String>();
		
		for(String x : str) {
			//단어를 뒤집음
			String tmp = new StringBuilder(x).reverse().toString();
			anwser.add(tmp);
		}
		
		return anwser;
	}
	
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb =  new Scanner(System.in);
		int n = kb.nextInt();
		
		//숫자만큼의 배열을 만들어 준다.
		String[] str = new String[n];
		
		
		//반복문을 돌며 배열안에 단어를 넣어줌
		for(int i=0;i<n;i++) {
			str[i] = kb.next();
		}
		
		for(String x : T.solution(n,str)) {
			System.out.println(x);
		}
		
		}
	
	}
	

