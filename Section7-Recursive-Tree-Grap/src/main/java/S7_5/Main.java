package S7_5;


//5. ����Ʈ�� ��ȸ(���� �켱Ž��)
/*
 
  ��ó������ root
 
  root���� �ּҸ� ��Ҵٰ� �����ϱ�
  �ּ� + ���ʰ� ������ ���� ���� ǥ��� ��������
  
  ������ȸ �θ� > �ڽ�
  ���� ���� �ڽ� > �θ� > ������ �ڽ�
  ���� �����ڽ� > ������ �ڽ� > �θ�
 
 
 */


class Node{
	//���� �ڽ�, ������ �ڽ�
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
			//������ȸ
			System.out.print(root.data+ " ");
			DFS(root.lt);
			//������ȸ
			//System.out.print(root.data+ " ");
			DFS(root.rt);
			//������ȸ
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
