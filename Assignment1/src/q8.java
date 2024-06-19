
public class q8 {
   public static int rankOfElement(int arr[],int key) {
	   int count=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]<=key) {
			   count++;
		   }
	   }
	   
	   return count;
   }
	
	
	public static void main(String[] args) {
		int arr[]= {10,20,15,3,4,4,1};
		int key=10;
		int rank=rankOfElement(arr, key);
		System.out.println("rank-"+rank);
       
	}

}
