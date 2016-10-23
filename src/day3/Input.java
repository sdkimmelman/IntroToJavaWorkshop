package day3;

import javax.swing.JOptionPane;

public class Input {
public static void main(String[] args) 
{
	String place= JOptionPane.showInputDialog("Enter a city");
	JOptionPane.showMessageDialog(null,"My favorite city is" +place);
}
}
