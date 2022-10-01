package dataStructures;

class LinkedList {

	LLNode head;
	LLNode tail;
	int size;

	void Insert(int data) {
		LLNode node = new LLNode(data);
		if (head == null) {
			head = node;
			size++;
		} else {
			LLNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}
	}

	void InsertInFront(int data) {
		LLNode node = new LLNode(data);
		node.next = head;
		head = node;
		size++;
	}

	void Remove(int data) {
		LLNode temp = head;
		if (temp.data == data) {
			head = head.next;
		} else {
			while (temp.next != null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next;
					break;
				}
				temp = temp.next;
			}
		}
	}

	void Print() {
		LLNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}

class LLNode {
	public LLNode next;
	public int data;

	LLNode(int data) {
		this.data = data;
	}
}
