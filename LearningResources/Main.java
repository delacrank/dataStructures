import dataStructures.BinaryTree;
import dataStructures.LinkedList;

public class Main {

	public static void main(String[] args) {

		int[] a = { -15, 7, 20, 1, -22, 35, 55 };
		
		for(int i = a.length; i > 0; i--) {
			for(int j = 0; j < i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j +1];
					a[j+1] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void RunBinary() {
		BinaryTree tree = new BinaryTree();
		tree.BTNode root = null;
		
		tree.Insert(null, 0);
		root = tree.Insert(root, 1);
		root = tree.Insert(root, 2);
		root = tree.Insert(root, 3);
		root = tree.Insert(root, 4);
		root = tree.Insert(root, 5);
		root = tree.Insert(root, 6);

		tree.traverse(root);
		
	}

	public static void RunSimpleLinkedList() {
		LLNode node1 = new LLNode(1);
		LLNode node2 = new LLNode(2);
		LLNode node3 = new LLNode(3);
		node1.next = node2;
		node2.next = node3;
		LLNode node;
		node = node1;

		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void RunLinkedList() {

		LinkedList list = new LinkedList();

		list.InsertInFront(1);
		list.InsertInFront(2);
		list.InsertInFront(3);
		list.InsertInFront(4);
		list.Remove(2);

		list.Print();
	}
	
}
