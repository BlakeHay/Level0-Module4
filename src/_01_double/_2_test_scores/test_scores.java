package _01_double._2_test_scores;
import javax.swing.JOptionPane;
public class test_scores {
public static void main(String[] args){
String scoreString = JOptionPane.showInputDialog(null,"What was your score on the test?");
Double scoreDouble = Double.parseDouble(scoreString);
if(scoreDouble>90){
JOptionPane.showMessageDialog(null, "What! Congratulations!");
}
else if(scoreDouble>80){
JOptionPane.showMessageDialog(null, "Wow, that is pretty good.");
}
else{
JOptionPane.showMessageDialog(null, "Ugh, better luck next time.");
}
}   
}
