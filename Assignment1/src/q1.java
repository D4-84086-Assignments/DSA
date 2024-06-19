import java.util.Scanner;

public class q1 {

	public static String palindromestring(String st) {
		String reverse="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			reverse=ch+reverse;
		}
		if(st.equals(reverse)) {
			return "String is palindrome";
		}
		
		return "String is not palindrome";
	}
	
	public static String palindromeNumber(int number) {
		int rev=0;
		int temp=number;
		while(number>0) {
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println(rev);
		if(temp == rev) {
			return "Number is palindrome";
		}
		
		return "Number is not palindrome";
	}
	
	public static String palindromeArray(int arr[]) {
		for(int i=0;i<(arr.length-1)/2;i++) {
			if(arr[i]==arr[arr.length-1-i]) {
				
			}
			else {
				return "Array not palindrome";
			}
		}
		return "Array is palindrome";
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String to check palindrome -");
//
//		String st=sc.next();
//		
//		System.out.println(palindromestring(st));
//		
//		System.out.println("Enter Number to check palindrome -");
//
//		int value=sc.nextInt();
//		
//		System.out.println(palindromeNumber(value));
		
		int arr[]= {12,11,22,33,22,11,12};
		
		System.out.println(palindromeArray(arr));

	}

}
