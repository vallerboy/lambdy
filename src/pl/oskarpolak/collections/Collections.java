package pl.oskarpolak.collections;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
 
	
	 public static void main(String[] args) { 
		 Collections coll = new Collections(); 
		 coll.createSetSort();
	 }
	 
	 private void createSetSort(){ 
		 List<Employee> employeeHash = new ArrayList<Employee>(); 
		 
		 employeeHash.add(new Employee(10, "Oskar"));
		 employeeHash.add(new Employee(12, "Wojtek"));
		 employeeHash.add(new Employee(15, "Kamil"));
		 employeeHash.add(new Employee(18, "Bartek"));
		 employeeHash.add(new Employee(15, "kamil"));
		 employeeHash.add(new Employee(18, "bartek"));
		 
		 
		 java.util.Collections.sort(employeeHash, new comparatorAlphabetic());
		 
		 employeeHash.stream().forEach(s -> System.out.println(s));
		 System.out.println("");
		 
	    Set<Employee> empolyeeTree = new TreeSet<Employee>(); 
		 
	    empolyeeTree.add(new Employee(10, "Oskar"));
	    empolyeeTree.add(new Employee(12, "Wojtek"));
	    empolyeeTree.add(new Employee(15, "Kamil"));
	    empolyeeTree.add(new Employee(18, "Bartek"));
		 
	    empolyeeTree.stream().forEach(s -> System.out.println(s));
	 }
	 
	 private class comparatorAlphabetic implements Comparator<Employee> {

		@Override
		public int compare(Employee arg0, Employee arg1) {
			return arg0.getName().compareTo(arg1.getName());
		}
		 
	 }
	 
}
