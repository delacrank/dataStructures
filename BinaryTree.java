class BinaryTree {

    Node root;
    
    public Node Insert(Node root, int value) {
	if(root == null) {
	    root = new Node(value);
	} else if(value < root.value) {
	    root.left = Insert(root.left, value);	    
	} else  {
	    root.right = Insert(root.right, value);
	}
	return root;
    }

    public void traverse(Node node) {
	if(node != null) {
	    System.out.println("Print value " + node.value);
	    traverse(node.left);
	    traverse(node.right);
	}
    }
			 

    // public void Display() {
    // 	if (root != null) {
    // 	    System.out.println(root.value);
    // 	    ro

    public static void main(String[] args) {
	BinaryTree tree = new BinaryTree();
	Node root = null;
	root = tree.Insert(root, 1);
	root = tree.Insert(root, 2);
	root = tree.Insert(root, 3);
	root = tree.Insert(root, 4);
	root = tree.Insert(root, 5);
	root = tree.Insert(root, 6);
	
	tree.traverse(root);
	
	
    }
    
}

class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
	this.value = value;
    }
}
		    
