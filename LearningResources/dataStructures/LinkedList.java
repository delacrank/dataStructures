package dataStructures;

public class LinkedList {

	LLNode head;
	LLNode tail;
	int size;

	public void Insert(int data) {
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
		System.out.println("Node: " + node);
		System.out.println("Head: " + head);
	}

	public void InsertInFront(int data) {
		LLNode node = new LLNode(data);
		node.next = head;
		head = node;
		size++;
		System.out.println("Node: " + node);
		System.out.println("Node Next: " + node.next);
		System.out.println("Head: " + head);
		System.out.println("Head Next: " + head.next);
		
	}

	public void Remove(int data) {
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

	public void Print() {
		LLNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	static class LLNode {
		public LLNode next;
		public int data;

		LLNode(int data) {
			this.data = data;
		}
	}

}


