// Name: Cairu Liao
// USC loginid: Cairulia
// CS 455 PA1
// Fall 2015

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

/**
 * RandomWalkComponent draws input number of random steps with step size of 5 pixels in the middle of the frame.
 * @author Cairu Liao
 */
public class RandomWalkComponent extends JComponent{
	private int numberOfSteps;
	private final int THE_STEP_SIZE = 5;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructs a RandomWalkComponent with an input number of steps.
	 * @param numberOfSteps
	 */
	public RandomWalkComponent(int numberOfSteps){
		this.numberOfSteps = numberOfSteps;
	}

	/**
	 * Draws input number of random steps with step size of 5 pixels in the middle of the frame.
	 */
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		ImPoint middleOfFrame = new ImPoint(getWidth()/2,getHeight()/2);
		Drunkard drunkard = new Drunkard(middleOfFrame,THE_STEP_SIZE);
		
		for (int i = 0; i<numberOfSteps; i++){
		    ImPoint from = drunkard.getCurrentLoc();
			drunkard.takeStep();
			ImPoint to = drunkard.getCurrentLoc();
			Line2D.Double segment = new Line2D.Double(from.getPoint2D(),to.getPoint2D());
			g2.draw(segment);
		}
	}
}
