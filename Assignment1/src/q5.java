
public class q5 {
	
	public static int binarySearch(int arr[],int key){
		int left=0,right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
//			System.out.println(mid);
			
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
	int arr[]= {66,55,44,33,22,11};
	int key=55;
	
	int index=binarySearch(arr,key);
	
	System.out.println(
			"index is "+index);

	}

}
