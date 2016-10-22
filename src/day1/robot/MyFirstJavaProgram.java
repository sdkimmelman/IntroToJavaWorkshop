package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot elmo= new Robot();
		elmo.penDown();
		elmo.setSpeed(10);
		elmo.move(100);
		elmo.turn(90);
		for (int i = 0; i < 4; i++) {
			elmo.move(100);
			elmo.turn(90);
		}
	}
}
