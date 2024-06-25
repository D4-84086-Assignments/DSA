
public class Queue {
  
	List l3=new List();
	
	public void push(int value) {
		l3.addLast(value);
	}
	public void pop() {
		l3.deleteFirst();
	}
	public void displayQueue() {
		l3.display();
	}
}
