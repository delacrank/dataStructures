package sortingAlgorithms;

public class BubbleSort extends AbstractSort {
	
	public BubbleSort(int[] array) {
		super(array);
	}
	
	public void sort() {
		for(int i = array.length; i > 0; i--) {
			for(int j = 0; j < i-1; j++) {
				if(array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
	}
	
}
