
public class BSTree {
 static class Node{
	 private int data;
	 private Node left;
	 private Node right;
	 public Node(int value) {
		 data=value;
		 left=right=null;
		 
	 }
	 
 }
 
 private Node root;
 public BSTree() {
	 root=null;
 }

 public boolean isEmpty() {
	return root==null;
 }
 public void addNode(int value) {
	 Node newNode=new Node(value);
	 if(isEmpty()) {
		 root=newNode;
	 }
	 else {
		 Node trav=root;
		 while(true) {
			 if(value<trav.data) {
				 if(trav.left==null) {
					 trav.left=newNode;
					 break;
				 }
				 else {
					 trav=trav.left;
				 }
			 }
			 else {
				 if(trav.right==null) {
					 trav.right=newNode;
					 break;
				 }
				 else {
					 trav=trav.right;
				 }
			 }
		 }
	 }
 }
 public void preOrder(Node trav) {
	 if(trav==null) {
		 return;
	 }
	 System.out.print(" "+trav.data);
	 preOrder(trav.left);
	 preOrder(trav.right);
	 
 }
 
 public void preOrder() {
	 System.out.println("preOrder -");
	 preOrder(root);
	 System.out.println("");
 }
 
 public void deleteAll() {
	 root=null;
 }
 
 

}
