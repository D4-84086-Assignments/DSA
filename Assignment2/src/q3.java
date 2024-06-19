
public class q3 {
	
	public static void sortEmployeeBasedOnSalarySelectionSort(Employee arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getSalary()>arr[j].getSalary()){
					Employee e=arr[i];
					arr[i]=arr[j];
					arr[j]=e;
				}
			}
		}
	}
	
	
	public static void sortEmployeeBasedOnSalaryInsertionSort(Employee arr[]) {
		for(int i=1;i<arr.length;i++) {
			
			double temp=arr[i].getSalary();
			int j=i-1;
			
			while(j>=0 && arr[j].getSalary()>temp) {
				
				arr[j+1].setSalary(arr[j].getSalary());
				j--;
				
				
			}
			arr[j+1].setSalary(temp);
		}
	}
	

	public static void main(String[] args) {
		  Employee e1=new Employee(1,"shri",100);
	      Employee e2=new Employee(4,"rohan",200);
	      Employee e3=new Employee(5,"om",5002);
	      Employee e4=new Employee(2,"gaurav",1001);
	      Employee e5=new Employee(3,"bam",400);
		
	      Employee arr[]=new Employee[5];
		  arr[0]=e1;
		  arr[1]=e2;
		  arr[2]=e3;
		  arr[3]=e4;
		  arr[4]=e5;
		  
		  System.out.println("before sort-");
		  for (Employee employee : arr) {
			System.out.println(employee.toString());
		}
		  
//		  sortEmployeeBasedOnSalarySelectionSort(arr);
		  sortEmployeeBasedOnSalaryInsertionSort(arr);
		  
		  System.out.println("after sort based on salary-");
		  
		  for (Employee employee : arr) {
				System.out.println(employee.toString());
			}

	}

}
