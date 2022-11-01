package JavaCalculators;

import javax.swing.*;

import java.awt.FlowLayout;
//import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Program that allows a person to use the Java Swing GUI as a 4 function calculator
 * @author Monty */
public class SwingCalculator 
{
	//create a JFrame Object
	static JFrame calcBox;
	
	//create 2 text boxes for text input
	static final JTextField textInput1 = new JTextField("Enter Your First Integer");
	static final JTextField textInput2 = new JTextField("Enter Your Second Integer");

	static ConsoleCalculator calculator = new ConsoleCalculator();
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Enter Both Numbers Then Press The Function You Want");
		setup();
		//SwingCalculator calculator = new SwingCalculator();
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
		
		textInput1.addActionListener(text1);
		textInput2.addActionListener(text2);

		// adding the buttons to frame
		calcBox.add(addition); 
		calcBox.add(subtraction); 
		calcBox.add(multiplication); 
		calcBox.add(division);




		// parameter less constructor is used  
		// therefore, alignment is center   
		// horizontal as well as the vertical gap is 5 units.  
		calcBox.add(textInput1);
		calcBox.setLayout(new FlowLayout());    
		calcBox.add(addition); 
		calcBox.add(subtraction); 
		calcBox.add(multiplication); 
		calcBox.add(division);
		calcBox.add(textInput2);




		calcBox.setSize(300, 300);    
		calcBox.setVisible(true);
	}

	//private inner class to listen for button presses
	private static class TextListener1 implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//add code here for what happens when button 1 is pressed
			ConsoleCalculator.number1 = Float.parseFloat(textInput1.getText());		
		}
	}
	
	private static class TextListener2 implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//add code here for what happens when button 1 is pressed
			ConsoleCalculator.number2 = Float.parseFloat(textInput2.getText());
		}
	}
	
	private static class AdditionListener implements ActionListener
	{
		//specialized method for listening for events
		public void actionPerformed(ActionEvent buttonPress)
		{
			//add code here for what happens when button 1 is pressed
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
			//add code here for what happens when button 1 is pressed
			System.out.println("Subtraction Selected");
			calculator.doDifference();
			JLabel label = new JLabel(Float.toString(ConsoleCalculator.answer));
			calcBox.add(label);
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
			//add code here for what happens when button 1 is pressed
			System.out.println("Multiplication Selected");
			calculator.doProduct();
			JLabel label = new JLabel(Float.toString(ConsoleCalculator.answer));
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
			//add code here for what happens when button 1 is pressed
			System.out.println("Division Selected");
			calculator.doQuotient();
			JLabel label = new JLabel(Float.toString(ConsoleCalculator.answer));
			calcBox.add(label);
			calcBox.invalidate();
			calcBox.validate();
			calcBox.repaint();
		}    
	}    
}