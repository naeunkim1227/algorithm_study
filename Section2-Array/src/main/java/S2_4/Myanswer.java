package S2_4;

//4.피보나치 수열
import java.util.Scanner;

public class Myanswer {
	public int[] solution(int n) {
		int[] answer = new int[n];
		
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i=2;i<n;i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		
			
		
		return answer; 
	}
	
	
	public static void main(String[] args) {
		Myanswer T = new Myanswer();
		Scanner kb =  new Scanner(System.in);
		int n = kb.nextInt();
		
		for(int x: T.solution(n)) System.out.print(x + " ");
	}
	
	
}
