package S1_1;
import java.util.Scanner;
  
class S1_01 {
	//1.문자찾기
	
	//프로그래머스 방식..
	public int solution(String str,char t) {
		int anwser =0;
		
		//대소문자를 구분하지 않는다.
		str = str.toUpperCase();
		t =Character.toUpperCase(t);
		
		/*
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == t) anwser++;
		}
		*/
		
		//향상된 for문
		//str하나하나를 분리해서 배열로 만들어 주기
		for(char x : str.toCharArray()) {
			if(x==t) anwser++;
		}
		
		return anwser;
	}
	
	
	
	public static void main(String[] args) {
		
		//solution사용하려고 선언함 solution이 인스턴스 메소드이기 때문에
		//static이면 아래와 같이 선언할 필요 x
		S1_01 T = new S1_01();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		//char 하나 가져오게 하기
		char c = kb.next().charAt(0);
		
		

		System.out.print(T.solution(str, c));
	}
	
}