package calculatorClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.esprit.calculatorEjb.calculator.Calculator;


public class CalculatorTest {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		Object o =  context
				.lookup("/calculatorEjb/CalculatorImplementation!com.esprit.calculatorEjb.calculator.Calculator");

		Calculator calculator = (Calculator) o ;
		
		
System.out.println(calculator.add(10.0, 10.0));
	}

}
