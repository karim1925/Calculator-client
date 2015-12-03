package com.esprit.calculatorClient.controller;

import javax.ejb.BeforeCompletion;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.esprit.calculatorEjb.calculator.Calculator;

import calculatorClient.CalculatorTest;

public class CalculatorController  {


	CalculatorTest calculatorTest = new CalculatorTest();
	
	Calculator calc;


public Calculator setup() throws NamingException{
	
	Context context = new InitialContext();

	Object o =  context
			.lookup("/calculatorEjb/CalculatorImplementation!com.esprit.calculatorEjb.calculator.Calculator");

	Calculator calc = (Calculator) o ;
	
	return calc;
	
}
	

public Double Division(double value1 , double value2) throws NamingException
{
	calc=setup();
	return calc.division(value1, value2);

}


public Double Add(double value1 , double value2) throws NamingException
{
calc=setup();
return calc.add(value1, value2);

}

public Double Multiplication(double value1 , double value2) throws NamingException
{
	calc=setup();
	return calc.multiplication(value1, value2);

}

public Double Subtraction(double value1 , double value2) throws NamingException
{
	calc=setup();
	return calc.subtraction(value1, value2);

}


}
	
	
	
	
	

