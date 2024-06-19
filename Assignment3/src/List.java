
public class List {
  static class Node{
	  private int data;
	  private Node next;
	  
	  
	  public Node(int data) {
		  this.data=data;
		  next=null;
	  }
  }
  
  
  Node head;
  Node tail;
  int count;
  
  public List() {
	 head=null;
	 count=0; 
  }
  
  public void  addFirst(int value) {
	  Node newNode=new Node(value);  
	  if(head==null) {
		  head=newNode;
	  }
	  else {
	  newNode.next=head;  
	  head=newNode;
	  }
	  count ++;	  
  }
  
  public void deleteFirst() {
	  if(head.next==null)
	  {
		  head=null;
	  }
	  else
	  {
	   head=head.next;
	  }
  }
  
  public void addLast(int value) {
	  Node newNode=new Node(value);
	  
	  if(head==null)
	  {
		  head=newNode;
	  }
	  else
	  {
		  Node trav=head;
		  while(trav.next != null)
			  trav=trav.next;
		  
		  trav.next=newNode;
	  }
  }
  
  public void deleteLast() {
	  if(head==null) 
	  {
		
	  }
	  else 
	  {
		  Node trav=head;
		  while(trav.next.next != null)
			  trav=trav.next;
		  
		  trav.next=null;
		 	  
	  }
  }
  
  public void addPosition(int value,int pos) {
	  Node trav=head;
	  Node newNode =new Node(value);
	  if(head==null) {
		  head=newNode;
	  }
	  else if(pos <=1) {
		  addFirst(value);
	  }
	  else {
		  for(int i=1;i< pos && trav.next!=null ;i++ ) {
			  trav=trav.next;
		  }
		  newNode.next=trav.next;
		  trav.next=newNode;
	  }
  }
  
  public void deletePosition(int pos) {
	  Node trav=head;
	  if(head==null) {
		  
	  }
	  else if(pos<=1) {
		  deleteFirst();
	  }
	  else {
		  for(int i=1;i< pos && trav.next!=null ;i++ ) {
			  trav=trav.next;
		  }
		   trav.next=trav.next.next;
	  }
  }
  
  public int searchElement(int data) {
	  Node trav=head;
	  int index=1;
	  
	  while(trav.next != null) {
		  
			if(trav.data==data) {
				return index;
			}
			
			trav=trav.next;
			index++;
	  }
	  return index;
  }
  
  
  public void addBefore(int value,int dataToInserted) {
	  Node trav =head;
	  Node travPrev=null;
	 int pos= searchElement(value);
	 Node newNode=new Node(dataToInserted);
	 
	 if(pos==1) {
		 addFirst(dataToInserted);
	 }
	 else {
	
	 for(int i=1 ;i <pos && trav.next!=null;i++) {
		 travPrev=trav;
		 trav=trav.next;
	 }
	 newNode.next=trav;
	 travPrev.next=newNode;
	 
	 } 
  }
  
  public void insertSortedOrder(int value) {
		 Node trav=head;
		 int position=0;
		 while(trav!=null) {
			 if(trav.data>=value) {
				 addPosition(value, position);
				 break;
			 }
		 }
		 position++;
		 
		 
	 }
  
  
  
  public void display() {
	  Node trav;
	  trav=head;
	  while(trav != null) 
	  {
		  
		 
		  System.out.print(" " +(trav.data));
		  trav=trav.next;
	  }
	  
  }
  
  public void printreverse(Node n) {
	  if(n==null) {
		  return;
	  }
	  printreverse(n.next);
	  System.out.print(" "+n.data);
  }
}
