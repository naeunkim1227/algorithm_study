package S6_7;

import java.util.*;
/*7.좌표정렬
	좌표를 저장하는 클래스 생성

	오름차순 정렬일 경우
	this o (ex.10 20)
	this-o가 음수여야한다
	무튼 음수로 만드라는데....
	
	this가앞에있고 o가뒤에 있다...
	
	먼저 들어온 놈이...this에 있으니 비교할거다..
*/

class Point implements Comparable<Point>{
	
	public int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//오름차순일때
	public int compareTo(Point o) {
		
		if(this.x == o.x) return this.y-o.y;
		else return this.x-o.x;
			
	}
	/*
	//내림차순일때
	public int compareTo(Point o) {
		
		if(this.x == o.x) return o.y-this.y;
		else return o.x-this.x;
		
	}
	
	*/
}


class Main {
	 
 public static void main(String[] args) {
	 Main T = new Main();
	 Scanner kb = new Scanner(System.in);
	 int n = kb.nextInt();
	 ArrayList<Point> arr = new ArrayList<Point>();
	 
	 for(int i=0;i<n;i++) {
		 int x = kb.nextInt();
		 int y = kb.nextInt();
		 arr.add(new Point(x,y));
	 }
	 
	 
	 Collections.sort(arr);
	 for(Point o: arr) System.out.println(o.x + " " + o.y);
	
	 
 }
}
