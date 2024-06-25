package Q2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue p = new PriorityQueue(5);
		p.push(90);
		p.push(20);
		p.push(30);
		p.push(40);
		System.out.println("Pooped value :"+p.pop());
		System.out.println("Peeked value :"+p.peek());

	}

}
