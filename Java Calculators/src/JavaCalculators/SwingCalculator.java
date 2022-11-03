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
	static final JTextField textInput1 = new JTextField("Enter Your First Integer");
	static final JTextField textInput2 = new JTextField("Enter Your Second Integer");

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
		textInput1.addActionListener(text1);
		textInput2.addActionListener(text2);

		//adds buttons to window/GUI
		calcBox.add(textInput1);
		calcBox.setLayout(new FlowLayout());    
		calcBox.add(addition); 
		calcBox.add(subtraction); 
		calcBox.add(multiplication); 
		calcBox.add(division);
		calcBox.add(textInput2);



		//sets the size of the window/GUI
		calcBox.setSize(300, 300);
		
		//allows the window to be visible
		calcBox.setVisible(true);
	}

	//private inner class to listen for button presses
	private static class TextListener1 implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			//sets the number1 variable to what the user puts in the text box
			//Float.parseFloat changes input from a String to a float
			ConsoleCalculator.number1 = Float.parseFloat(textInput1.getText());		
		}
	}
	
	private static class TextListener2 implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			//sets the number2 variable to what the user puts in the text box
			//Float.parseFloat changes input from a String to a float
			ConsoleCalculator.number2 = Float.parseFloat(textInput2.getText());
		}
	}
	
	private static class AdditionListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Addition Selected");
			calculator.doSum();
			JLabel label = new JLabel(Float.toString(ConsoleCalculator.answer));
			calcBox.add(label);
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}
	}

	//private inner class to listen for button presses
	private static class SubtractionListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Subtraction Selected");
			calculator.doDifference();
			JLabel label = new JLabel(Float.toString(ConsoleCalculator.answer));
			calcBox.add(label);
			
			//reloads the GUI
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}
	}

	//private inner class to listen for button presses
	private static class MultiplicationListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Multiplication Selected");
			calculator.doProduct();
			
			//creates new text to display answer
			JLabel label = new JLabel(Float.toString(ConsoleCalculator.answer));
			
			//reloads the GUI
			calcBox.add(label);
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}
	}
	//private inner class to listen for button presses
	private static class DivisionListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//what happens when button is pressed
			System.out.println("Division Selected");
			calculator.doQuotient();
			
			//creates new text to display answer
			JLabel label = new JLabel(Float.toString(ConsoleCalculator.answer));
			calcBox.add(label);
			
			//reloads the GUI
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}    
	}    
}