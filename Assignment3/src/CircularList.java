
public class CircularList {
 static class Node{
	 private int data;
	 private Node next;
	 
	 
	 public Node(int value) {
		 data=value;
		 next=null;
	 }
 }
 
 private Node tail;
 int count;
 public CircularList() {
	 tail=null;
	 count=0;
 }
 
 public void addFirst(int value) {
	 Node newNode=new Node(value);
	 if(tail==null) {
		 tail=newNode;
		 tail.next=newNode;
	 }
	 else {
		 newNode.next=tail.next;
		 tail.next=newNode;

	 }
	 count++;
 }
 public void deleteFirst() {
	 if(tail==null) {
		 return;
	 }
	 else {
		 tail.next=tail.next.next;
	 }
	 count--;
 }
 
 public void addLast(int value) {
	 Node newNode=new Node(value);
	 if(tail==null) {
		 tail=newNode;
		 tail.next=newNode;
	 }
	 else {
		 newNode.next=tail.next;
		 tail.next=newNode;
		 tail=newNode;
	 }
	 count++;
 }
 public void deleteLast() {
	 Node trav=tail.next;
	while(trav.next.next!=tail.next) {
		trav=trav.next;
	}
	trav.next=tail.next;
	tail=trav;
	count--;
 }
 
 public void addPosition(int value,int pos) {
	 Node newNode=new Node(value);
	 Node trav=tail.next;
	 if(pos<=1) {
		addFirst(value);
	 }
	 else if(pos>=count) {
		 addLast(value);
	 }
	 else {
		 for (int i=1;i<pos-1;i++) {
			trav=trav.next; 
		 }
		 newNode.next=trav.next;
		 trav.next=newNode;
		 
	 }
	 count++;
	 
	 
 }
 public void deletePosition(int pos) {

	 Node trav=tail.next;
	 if(pos<=1) {
		deleteFirst();
	 }
	 else if(pos>=count) {
		 deleteLast();
	 }
	 else {
		 for (int i=1;i<pos-1;i++) {
			trav=trav.next; 
		 }
		trav.next=trav.next.next;
		 
	 }
	 count++;
	 
	 
 }

 public void display() {
	 Node trav=tail.next;
	 do {
		 System.out.print(" "+trav.data);
		 trav=trav.next;
	 }while(trav!=tail.next);
 }
}
