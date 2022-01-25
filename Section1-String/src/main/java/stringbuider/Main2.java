package stringbuider;

import java.util.ArrayList;
import java.util.Scanner;


//단어 안에서 특정 문자만 바꾸라고 했을 경우

public class Main2 {
	
	public ArrayList<String> solution(int n,String[] str) {
		ArrayList<String> anwser = new ArrayList<String>();
	
		for(String x: str) {
			//배열로 다시 저장..
			char[] s = x.toCharArray();
			
			//첫번째 배열값을 lt
			//마지막 배열값을 rt라고 가정한다
			//x.length - 1 = rt가 된다. 
			//lt와 rt를 바꾼다.
			
			//lt는 +1 rt는 -1이 되고 다시 교환
			//길이가 홀수일때 lt와 rt는 같아진다. (바꿀것이없어진다.)
			//while문으로 반복하면된다.
			//길이가 짝수일때
			//lt가 rt보다 커지면 멈추면 된다
			
			int lt = 0;
			int rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				
				lt++;
				rt--;
			}
			//char배열을 String 화 시켜준다.
			String tmp = String.valueOf(s);
			anwser.add(tmp);
		}
		return anwser;
	}
	
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
	

