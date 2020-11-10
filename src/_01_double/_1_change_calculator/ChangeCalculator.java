package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String yup = JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int yeet = Integer.parseInt(yup); 
		// Ask the user how many dimes they have, and convert their answer
String slurp = JOptionPane.showInputDialog("How many dimes do you have?");
// Convert their answer to an int.   Hint: Integer.parseInt()  
int screet = Integer.parseInt(slurp); 
		// Ask the user how many quarters they have, and convert their answer
String burp = JOptionPane.showInputDialog("How many quarters do you have?");
//Convert their answer to an int.   Hint: Integer.parseInt()  
int belch = Integer.parseInt(burp); 
		// Calculate how much money the user has.  Hint: Use a double variable 
double W = yeet*0.05;
double X = screet*0.10;		
double Y = belch*0.25;
double Z = W+X+Y;
JOptionPane.showMessageDialog(null, "You have $" + Z  + " in your wallet");
// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

