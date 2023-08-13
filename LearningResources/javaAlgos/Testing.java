package javaAlgos;

public class Testing {

	
	public static int[] histogram(int[] a, int m) {
		int[] b = new int[m];
		int[] c = new int[m];
			
		int count = 1;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i] == c[j]) {
					b[j]++;
				}
			}
			c[i] = a[i];
			b[i] = count;
		}
		
		return b;		
	}
	
	public static void main(String[] args) {

		int[] a = { 4, 5, 5, 2, 9, 10, 4 };
		
		int[] b = histogram(a, a.length);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " occured " + b[i] + " times");
		}
		
		
	
		
	}		
}
