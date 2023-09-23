import dataStructures.Stack;
import sortingAlgorithms.QuickUnion;

import java.util.Arrays;

import dataStructures.LinkedList;

public class Main {
	
	
	public static void main(String[] args) {
		int [] a = { 4, 3, 6, 9, 2, 8, 5, 7, 6, 1, 6};
		int [] b = { 3, 8, 5, 4, 1, 9, 0, 2, 1, 0, 7};
		int n = a.length;
		
		QuickUnion qn = new QuickUnion(n);
		
		for(int i = 0; i < n; i++) {
			int p = a[i];
			int q = b[i];
			if(qn.connected(p, q)) continue;
			qn.union(p, q);
			System.out.println(p + q);
		}
		
	}
	
}