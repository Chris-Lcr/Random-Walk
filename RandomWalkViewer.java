// Name: Cairu Liao
// USC loginid: Cairulia
// CS 455 PA1
// Fall 2015

import java.util.Scanner;
import javax.swing.JFrame;

/**
 * JFrame container for JComponent, prompt for input number of steps
 * RandomWalkViewer creates 400x400 pixel window to display RandomWalkComponent in the frame.
 * @author Cairu Liao
 */
public class RandomWalkViewer {
	
	private static Scanner in;
	private static final int WINDOW_LENGTH=400;
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(WINDOW_LENGTH,WINDOW_LENGTH);
		frame.setTitle("RamdomWalk");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Get the number of steps
		in = new Scanner(System.in);
		System.out.print("Enter number of steps: ");
		int numberOfSteps = in.nextInt();
		
		//Ask for a positive entered number
		while(numberOfSteps<=0){
			System.out.println("ERROR:Number entered must be greater than 0.");
			System.out.print("Enter number of steps: ");
			numberOfSteps = in.nextInt();
		}
		
		RandomWalkComponent component = new RandomWalkComponent(numberOfSteps);
		frame.add(component);
		
		frame.setVisible(true);
	}
}
