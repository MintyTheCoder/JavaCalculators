package JavaCalculators;

import java.util.Scanner;

/** Program that allows a person to use the Java console as a 4 function calculator 
 * @author Monty a.k.a MintyTheCoder*/
public class ConsoleCalculator 
{
	/** a float variable to store a number given by the user */
	// float is a number with decimals
	//declares two float variables to store numbers given by the user
	public static float number1, number2; 

	/**  a String variable to store/know what function is given by the user */
	//declares a string variable to store the function given by the user
	static String function;

	/** a Scanner to scan/detect for input from the keyboard */
	//creates a new scanner to scan for keyboard input
	static Scanner keyboard = new Scanner(System.in);

	/** a method to get numbers from the user */
	//creates a method to get numbers from the user
	public void getNumbers()
	{
		//ask the user to input what they want the first number to be
		System.out.println("Please enter the first number");

		//store the number in the variable number1
		number1 = keyboard.nextFloat();


		//print blank line
		System.out.println(" ");

		//ask the user to input what they want the second number to be
		System.out.println("Please enter the second number");

		//store the number in the variable number2
		number2 = keyboard.nextFloat();

		//print blank line
		System.out.println(" ");
	}

	/** a method to add the numbers from getNumbers and print the sum in the console*/
	//creates a method to add the numbers from getNumbers and print the sum in the console
	public float doSum()
	{
		float sum;
		sum = number1 + number2;
		System.out.println("The sum of your two numbers is:");
		System.out.println(sum);
		return sum;
	}

	/** a method to multiply the numbers from getNumbers and print the product in the console*/
	//creates a method to multiply the numbers from getNumbers and print the product in the console
	public float doProduct()
	{
		float product;
		product = number1 * number2;
		System.out.println("The product of your two numbers is:");
		System.out.println(product);
		return product;
	}

	/** a method to subtract the numbers from getNumbers and print the difference in the console*/
	//creates a method to subtract the numbers from getNumbers and print the difference in the console
	public float doDifference()
	{
		float difference;
		difference = number1 - number2;
		System.out.println("The difference between your two numbers is:");
		System.out.println(difference);
		return difference;
	}

	/** a method to divide the numbers from getNumbers and print the quotient in the console*/
	//create a method to divide the numbers from getNumbers and print the quotient in the console
	public float doQuotient()
	{
		float quotient;
		quotient = number1 / number2;
		System.out.println("The quotient of your two numbers is:");
		System.out.println(quotient);
		return quotient;
	}

	/** main method that every Java project must have,
	 *all Java projects start executing code here,
	 *@param args The command line arguments
	 */
	public static void main(String[] args) 
	{
		//use the name of the class as a variable type, add a name, and create a "new" object out of it
		ConsoleCalculator calculator =  new ConsoleCalculator();
		System.out.println("Welcome To The Java Four Function Calculator!");

		//print blank line
		System.out.println(" ");

		//Triple quotation marks allows the printed message to be multiple lines without having to retype System.out.println
		System.out.println("""
				Available functions are:

				Addition
				Multiplication
				Subtraction
				Division
				""");

		//ask the user what function they want the calculator to perform
		System.out.println("Please enter the function you want");
		//set the function variable equal to what the user types
		function = keyboard.nextLine();

		//print blank line
		System.out.println(" ");

		//.equals Checks if the values of two operands are equal or not, if yes then the condition becomes true.
		/*if (condition) 
		    {
			  // block of code to be executed if the condition is true
			}*/

		//if and else if conditional statements to find out what function the user wants the calculator to perform
		//"||" means or
		//if-else statements to determine what code to run depending on what the user inputs

		// if the user inputs Addition, addition, Add, or add
		if (function.equals("Addition") || (function.equals("addition")) || (function.equals("Add")) || (function.equals("add")))
		{
			// tells calculator object to execute the doSum method
			calculator.getNumbers();
			calculator.doSum();
		}

		// if the user inputs Multiplication, multiplication, Multiply, or multiply
		else if (function.equals("Multiplication") || (function.equals("multiplication")) || (function.equals("Multiply")) || (function.equals("multiply")))
		{	
			// tells calculator object to execute the doProduct method
			calculator.getNumbers();
			calculator.doProduct();
		}

		else if (function.equals("Subtraction") || (function.equals("subtraction")) || (function.equals("Subtract")) || (function.equals("subtract")))
		{
			// tells calculator object to execute the doDifference method
			calculator.getNumbers();
			calculator.doDifference();
		} 

		else if (function.equals("Division") || (function.equals("division")) || (function.equals("Divide")) || (function.equals("divide")))
		{
			// tells calculator object to execute the doQuotient method
			calculator.getNumbers();
			calculator.doQuotient();
		}

		else
		{
			// if the user does not input a valid function, this will print
			System.out.println("Program Does Not Accept The Input You Provided");
		}

	}

}