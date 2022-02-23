package S1_9;

import java.util.*;
//9.숫자만 추출
public class Main2 {
	public int solution(String s) {
		String answer = "";
		
		for(char x : s.toCharArray()) {
			//isDigit 숫자인지, 참거짓 반환
			if(Character.isDigit(x)) {
				answer+= x;
			}
		}
		
		//앞에 0있을때의 경우도 없애주네...
		
		return Integer.parseInt(answer);
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
