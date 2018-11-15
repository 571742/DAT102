package sorting;

public class QuickSort {
	public static <T extends Comparable<T>> void quickSort(T[] data) {
		quickSort(data, 0, data.length - 1);
	}

	private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
		if (min < max) {
			int pivot = partition(data, min, max);
			quickSort(data, min, pivot - 1); // sortere før pivot
			quickSort(data, pivot + 1, max);// sortere etter pivot
		}
	}

	private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {
		int pivot = (int)data[max]; 
        int i = (min-1); // index of smaller element
        for (int j = min; j < max; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if ((int)data[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = (int)data[i];
                data[i] = data[j];
                //data[j] = temp;
            }
        }
        return 0;
 
        // swap arr[i+1] and arr[high] (or pivot)
//        int arr[];
//        int temp = arr[i+1];
//        arr[i+1] = arr[high];
//        arr[high] = temp;
// 
//        return i+1;
	}

	private static void swap(int i, int j, int[] arr) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
}
