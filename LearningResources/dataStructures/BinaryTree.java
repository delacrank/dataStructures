package dataStructures;

public class BinaryTree {

	BTNode root;

	public BTNode Insert(BTNode root, int value) {
		if (root == null) {
			root = new BTNode(value);
		} else if (value < root.value) {
			root.left = Insert(root.left, value);
		} else {
			root.right = Insert(root.right, value);
		}
		return root;
	}

	public void traverse(BTNode node) {
		if (node != null) {
			System.out.println("Print value " + node.value);
			traverse(node.left);
			traverse(node.right);
		}
	}
	
	static class BTNode {

		int value;
		BTNode left;
		BTNode right;
		
		public BTNode() {}

		public BTNode(int value) {
			this.value = value;
		}
	}

}


