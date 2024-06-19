import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		int arr[] = {12,45,78,23,34,11,65,67,89,102,12,45};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key to search-");
		int key=sc.nextInt();
		int index=returnLastOccuranceElement(arr, key);
		System.out.println(index);
	
	}
	
	public static int returnLastOccuranceElement(int arr[],int key) {
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]==key) {
				return i;
			}
		}
			return -1;
	}

}
