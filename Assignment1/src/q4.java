import java.util.Scanner;

public class q4 {
     
	
	public static void main(String[] args) {

      Employee e1=new Employee(1,"shri",100);
      Employee e2=new Employee(4,"rohan",200);
      Employee e3=new Employee(5,"om",500);
      Employee e4=new Employee(2,"gaurav",1002);
      Employee e5=new Employee(3,"bam",400);
      
      Employee arr[]=new Employee[5];
	  arr[0]=e1;
	  arr[1]=e2;
	  arr[2]=e3;
	  arr[3]=e4;
	  arr[4]=e5;
      
	  Scanner sc =new Scanner(System.in);
	  
	  
	  System.out.println("Enter employee id to search-");
	  int id=sc.nextInt();
	  int flag=1;
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i].getEmpid()==id) {
			 System.out.println(arr[i].toString());
			 flag=0;
		  }  
	  }
	  if (flag==1) {
		  System.out.println("Employee not found");
	  }
	  
	  flag=1;
	  System.out.println("Enter employee name to search-");
	  String name=sc.next();
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i].getName()==name) {
			 System.out.println(arr[i].toString());
			 flag=0;
		  }		  
	  }
	  if (flag==1) {
		  System.out.println("Employee not found");
	  }
	  
	  flag=1;
	  System.out.println("Enter employee salary to search-");
	  double salary=sc.nextDouble();
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i].getSalary()==salary) {
			 System.out.println(arr[i].toString());
			 flag=0;
		  }		  
	  }
	  if (flag==1) {
		  System.out.println("Employee not found");
	  }
	  
	}

}
