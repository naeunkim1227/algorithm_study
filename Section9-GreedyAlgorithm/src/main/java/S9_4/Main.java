package S9_4;

import java.util.*;

/*
4. 최대수입스케줄(우선순위큐)
PriorityQueue

1일안에와야하는.. 1일차 강연료 넣기
2일안에와야하는.. 2일차 --

넣어서 가장 높은 강연료를 뽑아내면 된다.(=최우선순위를 뽑으면 된다.)

시간에 의해서 내림차순으로 한다(3일이 가장 널널하니까...3일부터)
60 3
30 3
50 2
40 2
30 1
20 1


max값 마지막 날짜를 저장
날짜를 거꾸로 돈다

3일에 60 30을 넣고 3보다 값이 작아지면 break
최우선순위로 60뽑아서 answer에 추가

2일에 30 40 50

 
*/
class Lecture implements Comparable<Lecture>{
	public int money;
	public int time;
	
	Lecture(int money,int time){
		this.money =money;
		this.time = time;
	}
	
	//내림차순으로 해야해서 ob - this
	public int compareTo(Lecture ob) {
		return ob.time - this.time;
	}
}


public class Main {
	
	static int n , max = Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr) {
	int answer = 0;
	
	//리버스오더를 쓰면 큰값이 우선순위가 된다.
	PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
	
	Collections.sort(arr);
	int j =0;
	
	for(int i=max;i>=1;i--) {
		for(;j<n;j++) {
			if(arr.get(j).time < i) break;
			pQ.offer(arr.get(j).money);
		}
		//poll은 가장 위에것을 반환한다
		if(!pQ.isEmpty()) answer+= pQ.poll();
	}
	
	
	return answer;
	}	

	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<Lecture>();
		for(int i=0;i<n;i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m, d));
			//날짜중에서 가장 큰 값 찾기
			if(d>max) max=d;
		}
		System.out.println(T.solution(arr));
				
	}
}
