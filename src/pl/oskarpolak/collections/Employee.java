package pl.oskarpolak.collections;

public class Employee implements Comparable<Employee>{
  
	private int salary; 
	private String name;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Employee o) {
	
		if(getSalary() == o.getSalary()){
			return 0;
		}else if(getSalary() < o.getSalary()){
			return -1;
		}else{
			return 1;
		}
		
		
	} 
	
	@Override
	public String toString(){ 
		  return getName() + "(" + getSalary() + ")";
	 }  
	
	  
}
