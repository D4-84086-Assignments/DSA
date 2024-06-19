
public class q9 {

	public static int selectionSortComaprision(int arr[]) {
		int comparision=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				comparision ++;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return comparision;
	}
	public static void main(String[] args) {
	int arr[]= {11,22,33,44,55};
	int comparision=selectionSortComaprision(arr);
	System.out.println("Comparision for selection sort-"+comparision);

	}

}
