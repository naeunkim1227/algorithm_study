package S7_5;


//5. 이진트리 순회(깊이 우선탐색)
/*
 
  맨처음시작 root
 
  root에는 주소를 담았다고 생각하기
  주소 + 왼쪽값 오른쪽 값을 가진 표라고 생각하자
  
  전위순회 부모 > 자식
  중위 왼쪽 자식 > 부모 > 오른쪽 자식
  후위 왼족자식 > 오른쪽 자식 > 부모
 
 
 */


class Node{
	//왼쪽 자식, 오른쪽 자식
	Node lt,rt;
	int data;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
	
	
}
public class Main {
	Node root;
	public void DFS(Node root) {
		if(root==null) return;
		else {
			//전위순회
			System.out.print(root.data+ " ");
			DFS(root.lt);
			//중위순회
			//System.out.print(root.data+ " ");
			DFS(root.rt);
			//후위순회
			//System.out.print(root.data+ " ");
		}
		
	}

	public static void main(String args[]) {
		Main tree = new Main();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.DFS(tree.root);
	}
	
}
