package JavaCalculators;

import javax.swing.*;

import java.awt.FlowLayout;
//import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Program that allows a person to use the Java Swing GUI as a 4 function calculator
 * @author Monty a.k.a MintyTheCoder */
public class SwingCalculator 
{
	//create a JFrame Object
	static JFrame calcBox;
	
	//create 2 text boxes for text input
	static final JTextField intInput1 = new JTextField("Enter Your First Integer");
	static final JTextField intInput2 = new JTextField("Enter Your Second Integer");

	//create an object out of the ConsoleCalculator script
	static ConsoleCalculator calculator = new ConsoleCalculator();
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Enter Both Numbers, Press The Enter/Return Key, Then Press The Function You Want");
		setup();
	}

	public static void setup()
	{
		// creating a frame object  
		calcBox = new JFrame(); 
		calcBox.setSize(500,500);
		// creating the buttons  
		JButton addition = new JButton("+");    
		JButton subtraction = new JButton("-");    
		JButton multiplication = new JButton("×");    
		JButton division = new JButton("÷");
		
		//creating the Action Listeners as objects in this method
		TextListener1 text1 = new TextListener1();
		TextListener2 text2 = new TextListener2();
		AdditionListener addButton = new AdditionListener();
		SubtractionListener subtractButton = new SubtractionListener();
		MultiplicationListener multiplyButton = new MultiplicationListener();
		DivisionListener divideButton = new DivisionListener();


		//connects Action Listeners to corresponding buttons
		addition.addActionListener(addButton);
		subtraction.addActionListener(subtractButton);
		multiplication.addActionListener(multiplyButton);
		division.addActionListener(divideButton);
		
		//connects Action Listeners to corresponding text fields
		intInput1.addActionListener(text1);
		intInput2.addActionListener(text2);

		//adds buttons to window/GUI
		calcBox.add(intInput1);
		calcBox.setLayout(new FlowLayout());    
		calcBox.add(addition); 
		calcBox.add(subtraction); 
		calcBox.add(multiplication); 
		calcBox.add(division);
		calcBox.add(intInput2);



		//sets the size of the window/GUI
		calcBox.setSize(300, 300);
		
		//allows the window to be visible
		calcBox.setVisible(true);
	}

	//private inner class to listen for button presses
	/** Action that will happen when enter is pressed on the TextField*/
	private static class TextListener1 implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			//sets the number1 variable to what the user puts in the text box
			//Float.parseFloat changes input from a String to a float
			ConsoleCalculator.number1 = Float.parseFloat(intInput1.getText());		
		}
	}
	
	/** Action that will happen when enter is pressed on the TextField*/
	private static class TextListener2 implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			//sets the number2 variable to what the user puts in the text box
			//Float.parseFloat changes input from a String to a float
			ConsoleCalculator.number2 = Float.parseFloat(intInput2.getText());
		}
	}
	
	//private inner class to listen for button presses
	/** Action that will happen when the addition button is pressed*/
	private static class AdditionListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Addition Selected");
			//calculator.doSum();
			JLabel label = new JLabel(" = " + calculator.doSum());
			calcBox.add(label);
			
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}
	}

	//private inner class to listen for button presses
	/** Action that will happen when the subtraction button is pressed*/
	private static class SubtractionListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Subtraction Selected");
			JLabel label = new JLabel(" = " + calculator.doDifference());
			calcBox.add(label);
			
			//reloads the GUI
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}
	}

	//private inner class to listen for button presses
	/** Action that will happen when the multiplication button is pressed*/
	private static class MultiplicationListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Multiplication Selected");
			
			//creates new text to display answer
			JLabel label = new JLabel(" = " + calculator.doProduct());
			
			//reloads the GUI
			calcBox.add(label);
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}
	}
	//private inner class to listen for button presses
	/** Action that will happen when the division button is pressed*/
	private static class DivisionListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Division Selected");
			
			
			//creates new text to display answer
			JLabel label = new JLabel(" = " + calculator.doQuotient());
			calcBox.add(label);
			
			//reloads the GUI
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}    
	}    
}