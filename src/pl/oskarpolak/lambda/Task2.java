package pl.oskarpolak.lambda;

import java.util.ArrayList;
import java.util.List;


public class Task2 {
    
	 public static void main(String[] args) { 
		 
		 List<Integer> elements = new ArrayList<>();
		 elements.add(5);
		 elements.add(8); 
		 elements.add(12);
		 
		// List<Integer> newElements = new ArrayList<>();
		 
		 elements.stream().map(s -> s + 5).forEach(s -> System.out.println(s));
		
	
	 }
	 
	
	 
}
