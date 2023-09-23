package sortingAlgorithms;

public class QuickUnion {

	private int[] id;
	private int count;
	
	public QuickUnion(int n) {
		count = n;
		id = new int[n];
		for(int i = 0; i < n; i++) 
			id[i] = i;
	}
	
	public int count() { return count; }
	
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	public int find(int p) {
		return id[p];
	}
	
	public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);
		
		if(pId == qId) return;
		
		for(int i = 0; i < id.length; i++)
			if(id[i] == pId) id[i] = qId;
	}
	
}
