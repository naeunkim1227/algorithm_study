package S2_4;

//4.피보나치 수열
import java.util.Scanner;

public class Main {
	public void solution(int n) {
		int a = 1,b=1,c;
		System.out.print(a + " " + b + " ");
		for(int i=2;i<n;i++) {
			c = a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb =  new Scanner(System.in);
		int n = kb.nextInt();
		
		T.solution(n);
	}
	
	
}
