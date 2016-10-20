package pl.oskarpolak.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pl.oskarpolak.lambda.interfaces.SimpleLambda;
import pl.oskarpolak.lambda.interfaces.TwoArgLambda;

public class Lambda {
	 
	
	 public static void main(String[] args){
	
		 Lambda myClass = new Lambda();
		 
		 
		 // Prosta operacja z wykorzstaniem customowego interfejsu funkcyjnego
		 SimpleLambda simplyLambda = s -> s + " | po edycji w lambdzie";
		 System.out.println(simplyLambda.getName("hehe"));
		 
		 
		 Set<String> set = new HashSet<String>();
		
		 
		 // Prosta operacja z wykorzystaniem wbudanego interfejsu
		 TwoArgLambda twoArgsLambda = (name,sex) -> {
			   String sexString = "";
			   if(sex == 'm') {
				   sexString = "Mê¿czyzna";
			   }else if(sex == 'k'){
				   sexString = "Kobieta";
			   }else{
				   sexString = "Nie wiadomo";
			   }
			 
			 return name + " | " + sexString;
		 };
		 // Wywo³anie cia³a z interfejsu
		 System.out.println(twoArgsLambda.testDeflautFunction());
		 // Uruchomienie naszej lambdy
		 System.out.println(twoArgsLambda.getNameAndSex("Oskar Polak", 'm'));
		 
		 myClass.sortList();
	 }
	 
	 private void sortList() {
		 List<String> fruits = Arrays.asList("apple", "banana", "cherry", "plum", "pear", "pinapple");
		 fruits.stream().filter(s -> s.startsWith("p")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		 
	 }
}
