
public class Stack {
  
	List l3=new List();
	public void push(int data) {
		l3.addFirst(data);
	}
	
	public void pop() {
		l3.deleteFirst();
	}
	
	public void peek() {
	if(l3.head==null) {
		System.out.println("List is Empty");
	}
	else {
		System.out.println(l3.head.data);
	}
	}
	
	void displayStack() {
		l3.display();
	}
   
}
