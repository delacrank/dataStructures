package sortingAlgorithms;

public class InsertionSort extends AbstractSort {
	
	int[] sortedArray = new int[array.length];
	
	public InsertionSort(int[] array) {
		super(array);
	}
	
	public void sort() {
		for(int j = 1; j < array.length; j++) {
			
			int newElement = array[j];
			
			int i;
			
			for(i = j; i > 0 && array[i - 1] > newElement; i--) {
				array[i] = array[i - 1];
			}
			
			array[i] = newElement;
		}
	}
	
	

}
