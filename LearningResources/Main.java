import sortingAlgorithms.*;

public class Main {

	public static void main(String[] args) {

		int[] a = { 20, 35, -15, 7, 55, 1, -22 };
		
		InsertionSort is = new InsertionSort(a);
		
		is.sort();
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
}
