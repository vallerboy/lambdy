package pl.oskarpolak.lambda.interfaces;

public interface TwoArgLambda {
   
	abstract String getNameAndSex(String name, char sex);

	
	default String testDeflautFunction() {
		return "Testowa deflautowa funkcja";
	}
	 
}
