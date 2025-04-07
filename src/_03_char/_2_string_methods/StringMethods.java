package _03_char._2_string_methods;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt

		//char letter = letters.charAt(2);
		//System.out.println(letter);
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		Integer length = letters.length();
		System.out.println(length);
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		
		String index = JOptionPane.showInputDialog("What letter would you like to know the index number of?");
		for(Integer n = 0;n<length; n++){
		char letter = letters.charAt(n);
		if(letter == index.charAt(0)){
		n+=1;
		JOptionPane.showMessageDialog(null,"The letter "+index+" is number "+n+" in the alphabet.");
		}
		}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


