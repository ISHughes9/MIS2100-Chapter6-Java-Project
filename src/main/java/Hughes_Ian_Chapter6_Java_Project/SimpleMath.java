package Hughes_Ian_Chapter6_Java_Project;

public class SimpleMath {
	
	public double divide(double numerator, double denominator) throws ArithmeticException{
		if (denominator == 0) {
			throw new ArithmeticException("MATH ERROR: Denominator cannot be 0.");
		}
		return numerator/denominator;
		
	}
	
	public double multiply(double number1, double number2){
		return number1*number2;
	}
}
