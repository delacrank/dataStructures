package dataStructures;

public class Main {

	public static void main(String[] args) {

		RunBinary();
		
	}

	public static void RunBinary() {
		BinaryTree tree = new BinaryTree();
		BTNode root = null;
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
