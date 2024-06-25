
public class DoublyLinearList {
  static class Node{
	  private int data;
	  private Node prev;
	  private Node next;
	  
	  public Node(int value) {
		  data=value;
		  prev=next=null;
	  }
  }
  
   Node head;
   int count;
   public DoublyLinearList() {
	   head=null;
	   count=0;
   }
   
   public void addFirst(int value) {
	   Node newNode=new Node(value);
	   
	   if(head==null) {
		   head=newNode;
	   }
	   else {
		   newNode.next=head;
		   head.prev=newNode;
		   head=newNode;
	   }
	   count++;
   }
   public void deleteFirst() {
	   if(head ==null) {
		   return;
	   }
	   head=head.next;
	   head.prev=null;
	   count--;
   }
   
 public void addLast(int value) {
	
	 if(head==null) {
		 addFirst(value);
	 }
	 else {
		 Node newNode=new Node(value);
		 Node trav=head;
		 while(trav.next!=null) {
			 trav=trav.next;
		 }
		 trav.next=newNode;
		 newNode.prev=trav;
	 }
	 count++;
 }
 public void deleteLast() {
	 if(head==null) {
		 
	 }
	 else {
		 Node trav=head;
		 while(trav.next.next != null) {
			 trav=trav.next;
		 }
		 trav.next=null;
	 }
	 count--;
 }
 
public void addPosition(int value,int pos) {
	if(pos==1) {
		addFirst(value);
	}
	else if(pos<1 && pos >count) {
		System.out.println("invalid position");
	}
	else {
		Node trav=head;
		Node newNode=new Node(value);

		for(int i=1;i<pos-1;i++) {
			trav=trav.next;
		}
		
		newNode.prev=trav;
		newNode.next=trav.next;
		trav.next.prev=newNode;
		trav.next=newNode;
		
		
	}
	
	count++;
}
public void deletePosition(int pos) {
	
	if(head==null) {
		
	}
	else if(pos==1) {
		deleteFirst();
	}
	else if(pos<=0 && pos>count) {
		System.out.println("Invalid position");
	}
	else {
		Node trav=head;
		for(int i=0;i<pos-1;i++) {
			trav=trav.next;
		}
		trav.prev.next=trav.next;
		trav.next.prev=trav.prev;
	}
}
   
   public void display() {
	   Node trav=head;
	   
	   while(trav != null ) {
		   System.out.print(" " +trav.data);
		   trav=trav.next;
	   }
	   
   }
}
