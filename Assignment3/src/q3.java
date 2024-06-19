
public class q3 {

	public static void main(String[] args) {
	
		CircularList l2=new CircularList();
		
		l2.addFirst(10);
		l2.addFirst(11);
		l2.addFirst(12);
		l2.addFirst(13);
	
		
//	   l2.addPosition(45, 3);
		l2.deletePosition(3);
		
		
		l2.display();

		
	}

}
