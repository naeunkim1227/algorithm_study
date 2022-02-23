package S9_4;

import java.util.*;

/*
4. �ִ���Խ�����(�켱����ť)
PriorityQueue

1�Ͼȿ��;��ϴ�.. 1���� ������ �ֱ�
2�Ͼȿ��;��ϴ�.. 2���� --

�־ ���� ���� �����Ḧ �̾Ƴ��� �ȴ�.(=�ֿ켱������ ������ �ȴ�.)

�ð��� ���ؼ� ������������ �Ѵ�(3���� ���� �γ��ϴϱ�...3�Ϻ���)
60 3
30 3
50 2
40 2
30 1
20 1


max�� ������ ��¥�� ����
��¥�� �Ųٷ� ����

3�Ͽ� 60 30�� �ְ� 3���� ���� �۾����� break
�ֿ켱������ 60�̾Ƽ� answer�� �߰�

2�Ͽ� 30 40 50

 
*/
class Lecture implements Comparable<Lecture>{
	public int money;
	public int time;
	
	Lecture(int money,int time){
		this.money =money;
		this.time = time;
	}
	
	//������������ �ؾ��ؼ� ob - this
	public int compareTo(Lecture ob) {
		return ob.time - this.time;
	}
}


public class Main {
	
	static int n , max = Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr) {
	int answer = 0;
	
	//������������ ���� ū���� �켱������ �ȴ�.
	PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
	
	Collections.sort(arr);
	int j =0;
	
	for(int i=max;i>=1;i--) {
		for(;j<n;j++) {
			if(arr.get(j).time < i) break;
			pQ.offer(arr.get(j).money);
		}
		//poll�� ���� �������� ��ȯ�Ѵ�
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
			//��¥�߿��� ���� ū �� ã��
			if(d>max) max=d;
		}
		System.out.println(T.solution(arr));
				
	}
}
