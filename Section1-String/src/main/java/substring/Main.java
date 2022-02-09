package substring;

import java.util.Scanner;
//문장속단어
class Main {

	public String solution(String str) {
		String anwser = "";
		//가장 작은 값으로 초기화한다.
		int m = Integer.MIN_VALUE,pos;

		//풀이1
		
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
		
		//풀이2 indexOf, subString
		while((pos=str.indexOf(" "))!=-1) {
			//공백을 발견못하면 -1을 리턴 
			String tmp  = str.substring(0,pos);
			int len  = tmp.length();
			
			//>=로 하면 뒤쪽에서 나온 같은 길이의 문자로 대체되기 때문에 >로 해야한다.
			if(len>m) {
				m=len;
				anwser=tmp;
			}
			
			//앞의 부분 잘라내기
			str = str.substring(pos+1);
		
		}
		
		//마지막 단어 검사해줘야함
		if(str.length()>m) anwser = str;
		
		
		return anwser;
		
		
	}
	
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		//한줄을 입력 받아야 하므로 nextline으로 받는다.
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
