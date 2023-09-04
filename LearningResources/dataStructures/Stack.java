package dataStructures;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
	
	Item[] a;
	int n;
	
	Stack(int capacity) {
		a = (Item[]) new Object[capacity];
	}
	
	public int size() {
		return n;
	}
	
	public void push(Item value) {
		a[n++] = value;
	}
	
	public Item pop() {
		return a[n--];
	}

	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item> {
		private int i = n-1;
		public boolean hasNext() { return i >= 0; }
		public Item next() { return a[i--]; }
		public void remove() { }
	}

}
