package day3;

import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer=JOptionPane.showInputDialog("Enter you answer");
		// 2. If they say "yes", tell them they will rule the world.
if(answer.equals("yes")){System.out.println("You will rule the world");
}
		// 3. Otherwise, wish them good luck washing dishes.
if(answer.equals("no")){System.out.println("Good luck wasging dishes");
	}
	}
}
