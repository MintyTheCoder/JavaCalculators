//@author Monty
import java.util.Scanner;

public class JavaSimpleCalculator 
{
	float number1;
	float number2;
	float answer;
	static String operator;
	
	static Scanner keyboard = new Scanner(System.in);
	
	//get number from user
	public void getNumbers()
	{
		System.out.println("Please enter the first integer");
		number1 = keyboard.nextInt();
		
		//print blank line
		System.out.println(" ");
		
		System.out.println("Please enter the second integer");
		number2 =  keyboard.nextInt();
		
		//print blank line
		System.out.println(" ");
	}
	//add numbers from getNumbers
	public void doSum()
	{
		getNumbers();
		answer = number1 + number2;
		System.out.println("The sum of your two number is:");
		System.out.println(answer);
	}
	//multiply numbers from getNumbers
	public void doProduct()
	{
		getNumbers();
		answer = number1 * number2;
		System.out.println("The product of your two number is:");
		System.out.println(answer);
	}
	//subtract numbers from getNumbers
	public void doDifference()
	{
		getNumbers();
		answer = number1 - number2;
		System.out.println("The difference of your two number is:");
		System.out.println(answer);
	}
	
	//divide numbers from gteNumbers
	public void doQuotient()
	{
		getNumbers();
		answer = number1 / number2;
		System.out.println("The quotient of your two number is:");
		System.out.println(answer);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JavaSimpleCalculator calculator =  new JavaSimpleCalculator();
		System.out.println("Welcome To The Java Four Function Calculator!");
		
		//print blank line
		System.out.println(" ");
		
		//Triple quotation marks allows printed line to be multiple lines without having to retype System.out.println
		System.out.println("""
							Available functions are:
							 
							Addition
							Multiplication
							Subtraction
							Division
							""");
		System.out.println("Please enter the function you want");
		operator = keyboard.nextLine();
		
		//print blank line
		System.out.println(" ");
		
		//.equals Checks if the values of two operands are equal or not, if yes then condition becomes true.
		/*if (condition) 
		    {
			  // block of code to be executed if the condition is true
			}*/
		
		if (operator.equals("Addition"))
		{
			calculator.doSum();
		}
		
		else if (operator.equals("Multiplication"))
		{
			calculator.doProduct();
		}
		
		else if (operator.equals("Subtraction"))
		{
			calculator.doDifference();
		} 
		
		else if (operator.equals("Division"))
		{
			calculator.doQuotient();
		}
		
		else
		{
			System.out.println("Invalid Function");
		}
		
	}

}