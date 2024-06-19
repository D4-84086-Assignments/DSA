
public class Queue {
	private int arr[];
	private int rear;
	private int front;
	private int Size;
	
	
	public Queue(int SIZE) {
		Size=SIZE;
		arr=new int[SIZE];
		rear=0;
		front=0;
	}
	
	public void push(int value) {
		if(rear==Size) {
			System.out.println("Queue is full");
		}
		else 
		{
		arr[rear]=value;
		rear++;
		}
	}
	
	public int pop() {
		if(rear==front) {
			System.out.println("Queue is Empty");
		}
		else 
		{
		int temp =arr[front];
		front++;
		return temp;
		}
		return 0;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isFull() {
		return rear==Size;
	}
	public boolean iSEmpty() {
		return rear==front;
	}
}
