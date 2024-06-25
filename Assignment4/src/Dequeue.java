import java.util.Scanner;

public class Dequeue {
   DoublyLinearList d1=new DoublyLinearList();
   
   public void push(int value) {
	   d1.addFirst(value);
   }
   public void pop() {
	   System.out.println("");
	 
	   System.out.println("Add choice to delete element-");
	   System.out.println("1.Delete from front");
	   System.out.println("2.Delete from rear");
	   
	   Scanner sc =new Scanner(System.in);
	   
	   int choice=sc.nextInt();
	   if(choice==1) {
		   d1.deleteFirst();
	   }
	   else if(choice==2) {
		   d1.deleteLast();
	   }
	   else {
		   System.out.println("Invalid choice");
	   } 
	   sc.close();
   }
   public void display() {
	   d1.display();
   }
}
