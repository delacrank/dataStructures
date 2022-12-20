package sortingAlgorithms;

public class SelectionSort extends AbstractSort {
	
	public SelectionSort(int[] array) {
		super(array);
	}
	
	public void sort() {
		for(int i = array.length -1; i > 0; i--) {
			
			int max = 0;
			
			for(int j = 1; j <= i; j++) {
				if(array[j] > array[max]) {
					max = j;
				}
			}
			
			swap(array, max, i);
		}
	}	
	
}
