
public class Heap {
	//total is used in sort() and heapify() to determine when the array has been completely heapified
	private static int total;
	//count is used in sort() to determine the number of swaps taken in a heapified array
	private static int count = 0;
	
	//Takes in 2 integer values and an array, and swaps the locations of the 2 values within the array
	private static void swap(Comparable[] arr, int a, int b){
		Comparable tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	//Uses heapsort on the array
	private static void heapify(Comparable[] arr, int i){
		int left = i * 2;
		int right = left + 1 ;
		int grt = i;
		if ((left<= total) && (arr[left].compareTo(arr[grt]) > 0)){
		grt = left;
		}
		if((right <= total) && (arr[right].compareTo(arr[grt]) > 0)){
		grt = right;
		}
		if (grt != i) {
		swap(arr, i, grt);
		heapify(arr, grt);
		}
	}	
	
	/* Sorts the array. Additionally, prints an array for every swap if the size of the array is<= 20.
	*If the size of the array is<= 100, will increment the public count integer. */
	public static void sort(Comparable[] arr){
		total = arr.length - 1 ;
		
		for (int i = total / 2; i >= 0; i--){
			heapify(arr, i);
			if(arr.length <= 20){
			System.out.println(java.util.Arrays.toString(arr));
			}
			if(arr.length <= 100){
				count++;
			}
		}
		for (int i = total; i > 0; i--) {
			swap(arr, 0, i);
			total--;
			heapify(arr, 0);
			if (arr.length <= 20){
				System.out.println(java.util.Arrays.toString(arr));
			}
			if(arr.length <= 100){
			count++;
			}
		}
	};
	//count setter
	public static void setCount(Comparable[] arr){
		count = 0;
	}
	//count getter
	public static int getCount(Comparable[] arr){
		return count;
	}
}
