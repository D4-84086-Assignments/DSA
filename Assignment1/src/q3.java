import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key to search-");
      	int key=sc.nextInt();
//	      int t1=comparisionForLinearSearch(arr, key);
//		System.out.println(t1);
		 int t2=comparisionForBinarySearch(arr, key);
		 
			System.out.println(t2);

	}
	
	public static int comparisionForLinearSearch(int arr[],int key) {
		int comparision=0;
		for(int i=0;i<arr.length;i++) {
			comparision++;
			if(arr[i]==key) {
				break;
			}
		}
		return comparision;
	}
	
     public static int comparisionForBinarySearch(int arr[],int key) {
		int left=0,right=arr.length-1,comparision=0;
		
		
		while(left<=right) {
			int mid=(left+right)/2;
			   comparision++;
			if(arr[mid]==key) {
				
				return comparision;
			}
			else if(arr[mid]>key) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		return -1;
	}   

}
