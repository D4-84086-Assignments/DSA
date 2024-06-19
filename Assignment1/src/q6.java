
public class q6 {

	public static  int linearSearchnthOccurance(int arr[],int key,int occurance) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
			}
			if(count==occurance) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
	   int arr[]= {11,22,33,44,55,77,88,99};
	  int index= linearSearchnthOccurance(arr, 44,3);
	  System.out.println(index);
	}

}
