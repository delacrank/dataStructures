package dataStructures;

public class StackLinked<Item> {
	
	private Node head;
	private int n;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {	return head == null; }
	public int size() { return n; }
	
	public void push(Item item) {
		Node node = head;
		head = new Node();
		head.item = item;
		head.next = head;
		n++;
	}
	
	public Item pop() {
		Item item = head.item;
		head = head.next;
		n--;
		return item;
	}
	

}
