package sortingAlgorithms;

public abstract class AbstractSort {
	
	int[] array;
	
	public AbstractSort(int[] array) {
		this.array = array;
	}

	void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;	
	}	
	
}
