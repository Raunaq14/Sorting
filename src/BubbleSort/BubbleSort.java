package BubbleSort;

public class BubbleSort {
		void bubbleSort(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i = 0; i < n-1; i++) 
				for (int j = 0; j < n-i-1; j++) 
					if (arr[j] > arr[j+1]) 
					{ 
						int temp = arr[j]; 
						arr[j] = arr[j+1]; 
						arr[j+1] = temp; 
					} 
		} 

		/* Prints the array */
		void printArray(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i=0; i<n; ++i) 
				System.out.print(arr[i] + " "); 
			System.out.println(); 
		} 

		// Driver method to test above 
		public static void main(String args[]) 
		{ 
			BubbleSort ob = new BubbleSort(); 
			int a[] = {23,56,54,98,69,110,34,12,56,92,51}; 
			ob.bubbleSort(a); 
			System.out.println("Sorted array"); 
			ob.printArray(a); 
		} 
}
