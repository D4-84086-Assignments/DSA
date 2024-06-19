import java.util.Arrays;

public class q1 {

	public static int  insertionSort(int arr[]) {
		int comparision=0;
		for(int i=1;i<arr.length;i++) {
			int temp =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				comparision++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return comparision;
	}
	
	public static void main(String[] args) {
            int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		int comaparision=insertionSort(arr);
		
		System.out.println("Comaparision ="+comaparision);
			
		

	}
	

}
