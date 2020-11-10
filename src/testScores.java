import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	

	String yup = JOptionPane.showInputDialog("What is your test score (do not add the percent sign)?");
	// Convert their answer to an int.   Hint: Integer.parseInt()  


double rock = Double.parseDouble(yup);
	
	
if (rock > 90) {
	JOptionPane.showMessageDialog(null, "Great Job.");
}
else if (rock > 85.5) {
	JOptionPane.showMessageDialog(null, "You did pretty good.");
}
else if (rock > 75.5) {
	JOptionPane.showMessageDialog(null, "You did okay.");
}
else {
	JOptionPane.showMessageDialog(null, "FAIL!!!");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
