package dataStructures;

public class LinkedListStack<Item> {
	
	Node head;
	private int n;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean find(String key) {
		while(n > 0) {
			if(head.item.toString().equals(key)) {
				return true;
			} else if(head.next != null) {
				head = head.next;
				n--;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public void delete(String key) {
		while(n > 0) {
			if(head.item.toString().equals(key) && head.next != null) {
				Item item = head.item;
				head = head.next;
				head.item = item;
				n--;
			}  else if(head.next != null) {
				head = head.next;
				n--;
			} else {
				break;
			}
		}
	}
	
	public void push(Item item) {
		Node node = head;
		head = new Node();
		head.item = item;
		head.next = node;
		n++;
	}
	
	public Item pop() {
		Item item = head.item;
		head = head.next;
		n--;
		return item;
	}
	

}
