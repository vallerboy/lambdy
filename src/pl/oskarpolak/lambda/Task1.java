package pl.oskarpolak.lambda;

import pl.oskarpolak.lambda.interfaces.IntegerMath;

public class Task1 {
    
	 public static void main(String[] args) { 
		 
		 Task1 myClass = new Task1();
		 
		 IntegerMath dodawanie = (a,b) -> a + b;
		 IntegerMath odejmowanie = (a,b) -> a - b;
		 
		  System.out.println("Dodawanie: " + myClass.binaryOperate(dodawanie, 5, 5));
		  System.out.println("Odejmowanie: " + myClass.binaryOperate(odejmowanie, 5, 5));
	 }
	 
	 private int binaryOperate(IntegerMath math, int a, int b){ 
		 return math.operate(a, b);
	 }
	 
}
