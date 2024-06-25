package Q1;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0, 7,15,3,77,19,21};
		
		heapSortByMinHeap h= new heapSortByMinHeap();
		System.out.println("Array before :"+ Arrays.toString(arr));
		h.heapSort(arr);
		System.out.println("Array after :"+ Arrays.toString(arr));

	}

}
