class LinkedList {

    Node head;
    Node tail;
    int size;

    void Insert(int data) {
	Node node = new Node(data);	
	if(head == null) {	    
	    head = node;
	    size++;
	}  else {
	    Node temp = head;
	    while(temp.next != null) {
	        temp = temp.next;
	    }	    
	    temp.next = node;
	    size++;
	} 	
    }

    void InsertInFront( int data) {
	Node node = new Node(data);
	node.next = head;
	head = node;
	size++;
    }

    void Remove(int data) {
	Node temp = head;
	if(temp.data == data) {
	    head = head.next;
	} else {
	    while(temp.next != null) {
		if(temp.next.data == data) {
		    temp.next = temp.next.next;
		    break;
		}
		temp = temp.next;
	    }
	}
    }
	

    void Print() {
	Node temp = head;
	while(temp != null) {
	    System.out.println(temp.data);
	    temp = temp.next;
	}
    }
    
    public static void main(String[] args) {

	// Node node1 = new Node(1);
	// Node node2 = new Node(2);
	// Node node3 = new Node(3);

	// node1.next = node2;
	// node2.next = node3;

	// Node node;
	// node = node1;
	
	// while(node != null) {
	//     System.out.println(node.data);
	//     node = node.next;
	// }
	LinkedList list = new LinkedList();

	list.InsertInFront( 1);
	list.InsertInFront( 2);
	list.InsertInFront( 3);
	list.InsertInFront( 4);
	list.Remove(2);
	
	list.Print();
    }

}

class Node {
    public Node next;
    public int data;

    Node(int data) {
	this.data = data;
    }
}
