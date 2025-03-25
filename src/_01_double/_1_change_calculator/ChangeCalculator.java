package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickelsString = JOptionPane.showInputDialog("How many nickels do you have.");
Integer nickelsInteger = Integer.parseInt(nickelsString);
String dimesString = JOptionPane.showInputDialog("How many dimes do you have.");
Integer dimesInteger = Integer.parseInt(dimesString);
String quartersString = JOptionPane.showInputDialog("How many quarters do you have.");
Integer quartersInteger = Integer.parseInt(quartersString);
Double nickelsValue = nickelsInteger * 0.05;
Double dimesValue = dimesInteger * 0.10;
Double quartersValue = quartersInteger * 0.25;
Double total = nickelsValue + dimesValue + quartersValue;
JOptionPane.showMessageDialog(null, "You have $"+total);
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

